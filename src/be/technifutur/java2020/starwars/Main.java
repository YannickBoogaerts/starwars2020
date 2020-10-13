package be.technifutur.java2020.starwars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scenario[] menu = new Scenario[]{
                new Scenario1(),
                new Scenario2(),
                new Scenario3()
        };
        Scanner scan = new Scanner(System.in);
        String input = null;

        displayMenu(menu);
        input = scan.nextLine();
        while ( ! input.equalsIgnoreCase("q")) {
            int choice = Integer.parseUnsignedInt(input)-1;
            if( choice< menu.length){
                menu[choice].run();
            }else{
                System.out.println(" l'action n'est pas au menu ");
            }
            displayMenu(menu);
            input = scan.nextLine();
        }
     }

    private static void displayMenu(Scenario[] menu) {
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.printf(" - %d : %s%n", i + 1, menu[i].getName());
        }
        System.out.printf(" - %s : %s%n", "q/Q", "Quitter");
        System.out.print("Choix : ");
    }

}