class Vraboten {
    public String Ime;
    public String Prezime;
    public String Plata;

    public Vraboten(String ime, String prezime, String plata) {
        Ime = ime;
        Prezime = prezime;
        Plata = plata;
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

    public String getPlata() {
        return Plata;
    }

    public void setPlata(String plata) {
        Plata = plata;
    }

}
public class Main {
    public static void main(String[] args) {
        Vraboten nov = new Vraboten("Naum" ,"Trpezanovski" , "45000");
        System.out.println("Imeto na vraboteniot e: " + nov.Ime + "\n" + "Prezimeto na vraboteniot e: " + nov.Prezime + "\n" + "Platata na vraboteniot iznesuva:  " + nov.Plata );
    }
}