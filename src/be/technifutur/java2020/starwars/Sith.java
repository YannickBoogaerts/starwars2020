package be.technifutur.java2020.starwars;

public class Sith extends Empire implements Force {
    public Sith(String name) {
        super(name);
    }

    @Override
    public void combattre() {
        System.out.println("je combat comme un Sith");


    }

    @Override
    public void utiliseForce() {
        System.out.println("j'utilise le coté obscure de la force");
    }
}
