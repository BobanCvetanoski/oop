package zad.dvacetiri;

public class Main {
    public static void main (String[] args){
        Avtomobil VW= new Avtomobil();
        VW.Marka = "Polo";
        VW.Model = "1.0 MPI Trendline";
        VW.PomKm = "178000";

        System.out.println("Marka na Avtomobilot e : " + VW.Marka +".");
        System.out.println("Modelot na " + VW.Marka + "-to e " + VW.Model +".");
        System.out.println("Negovite Pominati Kilometri se " + VW.PomKm +"km.");

        System.out.println("**************************************");

        Avtomobil Opel = new Avtomobil("Insignia", "2.8T 4x4","150000");
        System.out.println("Markata na ovoj avtomobil e " + Opel.Marka +"." );
        System.out.println("Modelot na " + Opel.Marka+"-ta e " + Opel.Model+".");
        System.out.println("Pominatite kilometri se " + Opel.PomKm +"km.");


    }
}
package zad.dvacetiri;

public class Avtomobil {
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

