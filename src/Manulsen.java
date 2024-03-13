import java.util.Scanner;

public class Manulsen
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Manulst du (true/false)?");
        boolean m = s.nextBoolean();

        System.out.println("Has du einen Knelt (true/false)?");
        boolean k = s.nextBoolean();

        System.out.println("Loepst du (true/false)?");
        boolean l = s.nextBoolean();

        System.out.println("Nopelst du (true/false)?");
        boolean n = s.nextBoolean();

        if (m && k && !l && !n) {
            System.out.println("Asis");
        } else if (!m && !k && !l && n) {
            System.out.println("Belas");
        } else if ((!m && !k && !l && !n) || (!m && k && !l && n) || (m && !k && l && !n)) {
            System.out.println("Cedis");
        } else if ((!m && !k && l && !n) || (!m && k && !l && !n) || (m && !k && !l && !n)) {
            System.out.println("Drodis");
        } else {
            System.out.println("Keiner");
        }
    }
}
