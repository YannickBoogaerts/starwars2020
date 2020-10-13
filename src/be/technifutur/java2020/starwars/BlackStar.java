package be.technifutur.java2020.starwars;

public class BlackStar {

    public void attract(AbstractVaisseau v) {
        if (v instanceof Millenium) {
            this.attract((Millenium) v);
        } else {
            if (v instanceof Xwing) {
                this.attract((Xwing) v);
            } else {

                v.afficheCamps();
                v.decoller();
            }
        }
    }

    public void attract(Millenium m) {
        System.out.println("Vaisseau attiré");
        m.afficheCamps();
        System.out.println("Au secours Obiwan");
        m.decoller();
    }

    public void attract(Xwing x) {
        System.out.println(("vaisseau attiré"));
        x.afficheCamps();
        System.out.println("A vos ordres Darkvador");
        x.decoller();
    }
}
