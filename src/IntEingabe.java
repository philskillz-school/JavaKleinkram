import java.util.Scanner;

public class IntEingabe
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Gib 2 nummern ein:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println("Der Quotient ist: " + ((float) n1/n2));
    }
}
