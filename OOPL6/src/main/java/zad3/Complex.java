/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author Krzys
 */
public class Complex {

    double Re;
    double Im;

    public static double modul(double Re, double Im) {
        return Math.sqrt(Re * Re + Im * Im);
    }

    public static void sprzezenie(double Re, double Im) {
        Im = -Im;
        System.out.println(Re + "" + Im + "i");
    }

    public static double kat(double Re, double Im) {
        double cos = Re / modul(Re, Im);
        double sin = Im / modul(Re, Im);

        if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) > 0) {
            return Math.toDegrees(Math.asin(sin));
        } else if (Math.toDegrees(Math.asin(sin)) > 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI / 2));
        } else if (Math.toDegrees(Math.asin(sin)) < 0 && Math.toDegrees(Math.acos(cos)) < 0) {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 3 / 2));
        } else {
            return Math.toDegrees(Math.asin(sin) + (Math.PI * 2));
        }

    }
    
     public static void zamianaNaWykladnicza(double Re, double Im){
        System.out.println("Postac wykladnicza: "+ modul(Re, Im) + " *e^ "+ kat(Re, Im) + "i");
    }
    
    public static void zamianaNaAlgebraiczna(double Re, double Im){
        System.out.println("Postac algebraiczna: "+ (modul(Re, Im) * Math.cos(Math.toRadians(kat(Re, Im))))
                + "+" + (modul(Re, Im) * Math.sin(Math.toRadians(kat(Re, Im)))) +"i");
    }
    
    public static void dodawanieAlgeb(double Re, double Im, double Re2, double Im2){
        System.out.println("Suma algebraiczna: " +(Re + Re2)+ "+" +(Im + Im2) +"i");
    }
    
    public static void dodawanieWykl(double Re, double Im, double Re2, double Im2){
        System.out.println("Suma wykladnicza: "+ kat((modul(Re, Im) * Math.cos(kat(Re, Im))
                + modul(Re2, Im2) * Math.cos(kat(Re2, Im2))), (modul(Re, Im)
                * Math.sin(kat(Re, Im)) + modul(Re2, Im2) * Math.sin(kat(Re2, Im2)))));
    }
    
    public static void odejmowanieAlgeb(double Re, double Im, double Re2, double Im2){
        System.out.println("Roznica algebraiczna: "+ (Re - Re2) + " + " + (Im - Im2) +"i");
    }
    
    public static void iloczynAlgeb(double Re, double Im, double Re2, double Im2){
        System.out.println("Iloczyn algegraiczny: "+ (Re * Re2 - Im * Im2) + "+" + (Re2 * Im + Re * Im2) +"i");
    }
    
    public static void ilorazAlgeb(double Re, double Im, double Re2, double Im2){
        System.out.println("Iloraz algebraiczny: "+ (Re * Re2 - Im * Im2) / (Math.pow(Re2, 2)
                + Math.pow(Im2, 2)) +"+"+ (Re * (-Im2) + Im * Re2) / (Math.pow(Re2, 2) + Math.pow(Im2, 2)) +"i");
    }
    
    public static void ilorazwykl(double Re, double Im, double Re2, double Im2){
        System.out.println("Iloraz wykladniczy: "+ (modul(Re, Im) / modul(Re2, Im2)) 
                +" * e ^ ("+ (kat(Re, Im) - kat(Re2, Im2)) +" * i)");
    } 
}
