package be.technifutur.java2020.starwars;

public class Vaisseau {
   public String name;
   public int nbMissile;
   
   public void tirer(){
      if(this.nbMissile > 0){
         System.out.println("PAN");
         this.nbMissile--;
      } else {
         System.out.println("pouf");
      }
   }
   
}