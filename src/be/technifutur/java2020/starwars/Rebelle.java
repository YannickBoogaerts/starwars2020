package be.technifutur.java2020.starwars;

public abstract class Rebelle extends Personne{

    public Rebelle(String name) {

        super(name);
    }

    @Override
    public void afficheCamps() {
        System.out.println("je suis un rebelle");
    }
}
