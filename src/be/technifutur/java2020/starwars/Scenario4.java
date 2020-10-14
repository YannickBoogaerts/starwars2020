package be.technifutur.java2020.starwars;

public class Scenario4 extends Scenario {

    public Scenario4() {
        super("La force des interfaces");
    }

    @Override
    public void run() {
        Personne[] pers = new Personne[4];
        Force f;

        pers[0] = new Soldat("Tom");
        pers[1] = new Jedi("Luc");
        pers[2] = new Sith("Darkvador");
        pers[3] = new Clone();

        for(Personne p : pers){
            System.out.println(p.getName());
            p.afficheCamps();
            if( p instanceof Force){
                f = (Force) p;
                f.utiliseForce();
            }
            p.combattre();
        }
    }
}
