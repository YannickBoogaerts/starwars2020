package be.technifutur.java2020.starwars;

public class Scenario3 extends Scenario {

    public Scenario3() {
        super("polymorphisme de l'étoile noire");
    }

    @Override
    public void run() {

        BlackStar bs = new BlackStar();
        Millenium millenium = new Millenium();
        Xwing xwing = new Xwing();
        //AbstractVaisseau test = new AbstractVaisseau("");
        AbstractVaisseau abs = new Millenium();

        bs.attract(abs);
        bs.attract(millenium);
        bs.attract(xwing);

    }
}
