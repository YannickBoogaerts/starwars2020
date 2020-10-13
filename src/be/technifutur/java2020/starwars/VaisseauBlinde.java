package be.technifutur.java2020.starwars;

public class VaisseauBlinde {
   private String name = "Sans nom";
   private int nbMissile;
   private boolean enVol = false;

   public VaisseauBlinde(String name){
      super();
      this.setName(name);
   }
   
   public void tirer(){
      if(this.nbMissile > 0){
         System.out.println("PAN");
         this.nbMissile--;
      } else {
         System.out.println("pouf");
      }
   }
   
   public void setName(String name){
      if(name != null && name.length()>0){
         this.name = name;
      }
   }
   
   public String getName(){
      return this.name;
   }
   
   public void addMissile(int nb){
      if(nb > 0 ) {
         if (nb + this.nbMissile > 20) {
            this.nbMissile = 20;
         } else {
            this.nbMissile += nb;
         }
      }
   }
   
   public void flyOff(){
      if(! this.enVol){
         this.enVol = true;
         System.out.println("je décolle");
      } else {
         System.out.println("déjà en vol");
      }
   }
   
   public void land(){
      if( this.enVol){
         this.enVol = false;
         System.out.println("j'atterris");
      } else {
         System.out.println("déjà au sol");
      }
   }
   
}