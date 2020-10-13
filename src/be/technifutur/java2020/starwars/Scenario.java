package be.technifutur.java2020.starwars;

public abstract class Scenario {
    private String name;

    public Scenario(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void run();
}
