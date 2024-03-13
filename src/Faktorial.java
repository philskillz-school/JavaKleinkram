import java.util.Scanner;

public class Faktorial
{

    public Faktorial()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Gib die Zahl ein: ");

        int f = s.nextInt();
        int amt = f > 0 ? -1 : 1;

        System.out.print("Die Fakultät von " + f + "berechnet sich durch: " + f);
        if (f != 0) {
            for (int m=f+amt;m>0 | m<0;m+=amt) {
                f *= m;
                System.out.print("*" + m);
            }
        } else {
            f = 1;
        }
        System.out.println();

        System.out.println("Ergebnis: " + f);
    }

    public static void main(String[] args) {
        new Faktorial();
    }
}
