/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontaktlista;

import java.io.Serializable;

/**
 *
 * @author okama01
 */
public class Kontakt implements Serializable { //

    //attributen som lagar information om kontakter  
    private String fornamn;   
    private String efternamn;
    private String telefonnummer;

    //konstruktor som tar endast förnamn
    public Kontakt(String f) {
        fornamn = f;
        efternamn = "";
        telefonnummer = "";
        
    }
    
    //konstruktor som tar  förnamn och telefonnummer
    public Kontakt(String f, String t) {
        fornamn = f;
        efternamn = "";
        telefonnummer = t;
    }
    
    //konstruktor som tar  förnamn, efternamn och telefonnummer 
    public Kontakt(String f, String e, String t) {
        fornamn = f;
        efternamn = e;
        telefonnummer = t;
    }

    //t för värde av telefonnummer
    public void settelefonnummer(String t) {
        this.telefonnummer = t;
    }

    // för att returerar uppgifter
    public String getfornamn() {
        return this.fornamn;
    }

    public String getefternamn() {
        return this.efternamn;
    }

    public String gettelefonnummer() {
        return this.telefonnummer;
    }

    //metod för att skriva förnamn först
    public void skrivUt() {
        System.out.println("Fornman: " + fornamn);
        System.out.println("Efternman: " + efternamn);
        System.out.println("Telefonnummer: " + telefonnummer);
        System.out.println("");
    }

    //metod för att skriva efternamn först
    public void skrivIn() {

        System.out.println("Efternman: " + efternamn);
        System.out.println("Fornman: " + fornamn);
        System.out.println("Telefonnummer: " + telefonnummer);
        System.out.println("");
    }
}
