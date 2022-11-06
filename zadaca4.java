import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        Avtomobil VW= new Avtomobil();
        VW.Marka = "Golf";
        VW.Model = "Golf 6 R line";
        VW.PomKm = "235000";

        System.out.println("Marka na Avtomobilot e : " + VW.Marka +".");
        System.out.println("Modelot na " + VW.Marka + ".");
        System.out.println("Negovite Pominati Kilometri se " + VW.PomKm +"km.");

        System.out.println("");

        Avtomobil Audi = new Avtomobil("Audi", "RS7", "201500");
        System.out.println("Markata na avtomobilot e: " + Audi.Marka + ", Modelot e: "+ Audi.Model + ", Negovite pominati kilometri se: " + Audi.PomKm + "km.");

        System.out.println("");

        Avtomobil BMW = new Avtomobil("BMW" , "535d" , "360000");
        System.out.println("Vozam avtomobil " + BMW.Marka + ", Modelot e: " + BMW.Model + ", i e so pominati kilometri " + BMW.PomKm + "km.");


    }
}

class Avtomobil {
    public String Marka;
    public String Model;
    public String PomKm;


    public Avtomobil (){

    }

    public Avtomobil (String Marka, String Model, String PomKm){
        this.Marka = Marka;
        this.Model = Model;
        this.PomKm = PomKm;
    }
}

