package be.technifutur.java2020.starwars;

public class Clone extends Empire {


    public Clone() {

        super("colne");
    }

    @Override
    public void combattre() {
        System.out.println("je combat comme un Clone");
    }
}
