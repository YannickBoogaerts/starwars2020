package be.technifutur.java2020.starwars;

public class Jedi extends Rebelle implements Force{
    public Jedi(String name) {
        super(name);
    }

    @Override
    public void combattre() {
        System.out.println("je combat comme un jedi");


    }

    @Override
    public void utiliseForce() {
        System.out.println("j'utilise le bon coté de la force");
    }
}
