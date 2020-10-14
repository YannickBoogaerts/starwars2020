package be.technifutur.java2020.starwars;

public abstract class Personne {
    private final String name;

    public Personne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void afficheCamps();

    public abstract void combattre();
}
