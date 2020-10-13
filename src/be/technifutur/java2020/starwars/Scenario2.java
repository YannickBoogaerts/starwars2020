package be.technifutur.java2020.starwars;

public class Scenario2 extends Scenario {

    public Scenario2() {
        super("gestion des variables de classes");
    }

    @Override
    public void run() {
        VaisseauBlinde[] escadrille = new VaisseauBlinde[]{
                new VaisseauBlinde("v1"),
                new VaisseauBlinde("v2"),
                new VaisseauBlinde("v3"),
                new VaisseauBlinde("v4"),
                new VaisseauBlinde("v5"),
                new VaisseauBlinde("v6"),
        };

        System.out.printf("nombre de vaisseau en ligne : %s%n",VaisseauBlinde.getNbVol());
        escadrille[1].flyOff();
        System.out.printf("nombre de vaisseau en ligne : %s%n",VaisseauBlinde.getNbVol());
        escadrille[2].flyOff();
        System.out.printf("nombre de vaisseau en ligne : %s%n",VaisseauBlinde.getNbVol());
        escadrille[3].flyOff();
        System.out.printf("nombre de vaisseau en ligne : %s%n",VaisseauBlinde.getNbVol());
        escadrille[0].flyOff();
        System.out.printf("nombre de vaisseau en ligne : %s%n",VaisseauBlinde.getNbVol());

    }
}
