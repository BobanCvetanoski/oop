class Proizvod {
    public String ime;
    public double cena;
    public double tezhina;
    public Proizvod () {
        this.ime = "Chokolado";
        this.cena = 55;
        this.tezhina = 100;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public double getTezhina() {
        return tezhina;
    }
    public void setTezhina(double tezhina) {
        this.tezhina = tezhina;
    }
}
public class Main {
    public static void main(String[] args) {
        Proizvod p = new Proizvod ();
        System.out.println("Ime na proizvod: " + p.getIme());
        System.out.println("Cena: " + (int)p.getCena() + " denari.");
        System.out.println("Tezhina: " + p.getTezhina() + " grama.");
    }
}
