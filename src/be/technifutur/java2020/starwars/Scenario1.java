package be.technifutur.java2020.starwars;

public class Scenario1 extends Scenario{

    public Scenario1() {
        super("encapsulation des variables");
    }

    public void run() {
        Vaisseau v1 = new Vaisseau();
        v1.name = "X-wing";
        v1.nbMissile = 5;
        System.out.println(v1.name);

        VaisseauBlinde v2 = new VaisseauBlinde("Millenium");
        v2.addMissile(10);
        System.out.println(v2.getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("v1");
            v1.tirer();
            System.out.println("v2");
            v2.tirer();
        }

        v2.flyOff();
        v2.flyOff();
        v2.land();
        v2.land();
    }
}
