package be.technifutur.java2020.starwars;

public abstract class AbstractVaisseau {

    public final void decoller(){
        System.out.println("je décolle");
    }

    public abstract void afficheCamps();
}
