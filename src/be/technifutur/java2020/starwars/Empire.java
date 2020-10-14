package be.technifutur.java2020.starwars;

public abstract class Empire extends Personne{
    public Empire(String name) {
        super(name);
    }

    @Override
    public void afficheCamps() {
        System.out.println("je suis fidèle à l'empire");
    }
}
