public class Main {

    public static void main (String[] args) {
        Predmet objekt1 = new Predmet();
        objekt1.ImeNaPredmet = "Objektno Orientirano Programiranje";
        objekt1.ImeNaProf = "Prof. Dr. Ilija Jolevski";
        objekt1.BrNaKrediti = 6;
        objekt1.Semestar = 3;

        System.out.println("Ime na predmetot koj se predava: " + objekt1.ImeNaPredmet + ".");
        System.out.println("Ime na profesorot: " +objekt1.ImeNaProf + ".");
        System.out.println("Broj na krediti za ovoj Predmet vo semestarot se: " + objekt1.BrNaKrediti+".");
        System.out.println("Predmetot go predava profesorot vo semestar broj: " + objekt1.Semestar + ".");

        System.out.println(" ");

        Predmet objekt2 = new Predmet();
        objekt2.ImeNaPredmet = "Algoritmi i Strukturi Na Podatoci";
        objekt2.ImeNaProf = "Prof Dr. Violeta Manevska";
        objekt2.BrNaKrediti = 6;
        objekt2.Semestar = 3;

        System.out.println("Imeto na predmetot koj se predava e: " + objekt2.ImeNaPredmet + ".");
        System.out.println("Imeto na Profesorot koj go predava predmetot e: " + objekt2.ImeNaProf + ".");
        System.out.println("Brojot na krediti za ovoj Predemet vo semestarot se: " + objekt2.BrNaKrediti + ".");
        System.out.println("Predmetot go predava profesorot vo semestar broj: " + objekt1.Semestar + ".");

        System.out.println(" ");

        Predmet objekt3 = new Predmet();
        objekt3.ImeNaPredmet = "Sistemski Softver";
        objekt3.ImeNaProf = "Prof. Dr. Konstantina Veljanovska";
        objekt3.BrNaKrediti = 6;
        objekt3.Semestar = 3;

        System.out.println("Imeto na predmetot koj se predava e: " + objekt3.ImeNaPredmet + ".");
        System.out.println("Imeto na Profesorot koj go predava predmetot e: " + objekt3.ImeNaProf + ".");
        System.out.println("Brojot na krediti za ovoj Predemet vo semestarot se: " + objekt3.BrNaKrediti + ".");
        System.out.println("Predmetot go predava profesorot vo semestar broj: " + objekt1.Semestar + ".");

        System.out.println(" ");

    }
}
class Predmet {
    public String ImeNaPredmet;
    public String ImeNaProf;
    public int BrNaKrediti;

    public int Semestar;

    public Predmet (){

    }

    public Predmet (String ImeNaPredmet)
    {
        this.ImeNaPredmet = ImeNaPredmet;
    }

    public Predmet (String ImeNaProf, int BrNaKrediti, int semestar) {
        this.ImeNaProf = ImeNaProf;
        this.BrNaKrediti = BrNaKrediti;
        this.Semestar = semestar;
    }

}

