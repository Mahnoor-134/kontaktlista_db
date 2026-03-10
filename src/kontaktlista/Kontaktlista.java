/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kontaktlista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author okama01
 */
public class Kontaktlista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Kontakt> konlista = new ArrayList<>();  // skapa arraylist för att spara informatiobn
        FileManager fmgr = new FileManager(); // 
        Scanner input = new Scanner(System.in);//för att hämta värde från tangentbordet
        // Kontakt[] konlista = new Kontakt[100];
        int antalkontakt = 0;
      
        int val;

        do { //do while loop
            System.out.println("Nya Kontakta uppgifter"); // fråga om uppgifter 
            System.out.println("1. Ny kontakt");
            System.out.println("2. Skriv ut förnamn");
            System.out.println("3. Skriv ut efternamn");
            System.out.println("4. Spara");
            System.out.println("5. Hämta ");
            System.out.println("0. Avsluta ");

            val = input.nextInt();

            switch (val) {
                case 1:
                    antalkontakt = nyKontakt(konlista, antalkontakt, input); // anropa metod
                    break;

                case 2:
                    /*  System.out.print("Ange förnamn: ");
                    fornamn = input.nextLine();*/
                    skrivUtFornamn(konlista); // anropa metod
                    break;

                case 3:
                    /*System.out.print("Ange Efternamn: ");
                    efternamn = input.nextLine();*/
                    skrivUtEfternamn(konlista); // anropa metod

                    break;

                case 4:
                    fmgr.saveToFile(konlista); // anropa metod
                    break;

                case 5:
                    konlista = FileManager.readFromFile(); // anropa metod
                    break;
                    
                case 0: 
                    break; 
              
                default:
                    System.out.println("Ogiltig val");
                    break;
            }

            
            
        } while (val != 0); // körs till valet är inte 0

    }

    public static int nyKontakt(ArrayList konlista, int antalkontakt, Scanner input) {
        input.nextLine(); 
        System.out.println("Ange förnamn: ");
        String fornamn = input.nextLine();

        System.out.println("Ange efternamn: ");
        String efternamn = input.nextLine();

        System.out.println("Ange telefonnummer: ");
        String telefonnummer = input.nextLine();

        Kontakt kon = new Kontakt(fornamn, efternamn, telefonnummer);
        konlista.add(kon);

        return antalkontakt;

    }

    public static void skrivUtFornamn(ArrayList<Kontakt> konlista) {
        for (int i = 0; i < konlista.size(); i++) {
            konlista.get(i).skrivUt();
            // System.out.println(konlista.get(i));

        }

    }

    public static void skrivUtEfternamn(ArrayList<Kontakt> konlista) {
        for (int i = 0; i < konlista.size(); i++) {
            konlista.get(i).skrivIn();
            // System.out.println(konlista.get(i));
        }

    }

    // System.out.println(kon1.getfornamn() + ", " + kon1.getefternamn() +", " + kon1.gettelefonnummer());
}
