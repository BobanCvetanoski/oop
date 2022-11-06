import static java.lang.Integer.parseInt;

class Covek {
    public String Ime;
    public String Prezime;
    public String MatBr;


    public Covek(String ime, String prezime, String matBr) {
        Ime = ime;
        Prezime = prezime;
        MatBr = matBr;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        this.Ime = Ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        this.Prezime = Prezime;
    }

    public String getMatBr() {
        return MatBr;
    }

    public void setMatBr(String matbr) {
        MatBr = matbr;
    }

}
public class Main {
    public static void main(String[] args) {
        Covek nov = new Covek("Naum" ,"Trpezanovski" , "0307001410022");
        System.out.println("Imeto na covekot e: " + nov.Ime + "\n" + "Prezimeto na covekot e: " + nov.Prezime + "\n" + "Covekot ima maticen broj: " + nov.MatBr );
    }
}