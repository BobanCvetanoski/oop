import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Triagolnik triagolnik = new Triagolnik();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vnesi vrednost za stranata a: ");
        triagolnik.a = scanner.nextInt();
        System.out.print("Vnesi vrednost za stranata b: ");
        triagolnik.b = scanner.nextInt();
        System.out.print("Vnesi vrednost za stranata c: ");
        triagolnik.c = scanner.nextInt();
        System.out.print("Vnesi vrednost za stranata h: ");
        triagolnik.h = scanner.nextInt();
        scanner.close();

        System.out.println("Perimetarot na triagolnikot e: "+ triagolnik.perimetar());
        System.out.println("Ploshtinata na triagolnikot e: "+ triagolnik.plostina());
    }
}
class Triagolnik {
    public int a;
    public int b;
    public int c;
    public int h;

    public Triagolnik () {

    }

    public double perimetar () {
        return a + b + c;
    }

    public double plostina() {
        return (a*h)/2;
    }
}
