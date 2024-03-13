import java.util.Scanner;

public class Matrix
{
    public Matrix()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Gib die Reihen an:");
        int rows = s.nextInt();
        System.out.println("Gib die Spalten an:");
        int cols = s.nextInt();

        int c = 1;
        System.out.print("  ");
        while (c <= cols) {
            System.out.print(c + "\t");
            c += 1;
        }
        System.out.println();

        c = 1;
        System.out.print("  ");
        while (c <= cols) {
            System.out.print("_" + "\t");
            c += 1;
        }
        System.out.println();

        int r = 1;
        while (r <= rows) {
            c = 1;
            System.out.print(r + "|");
            while (c <= cols) {
                System.out.print(r*c + "\t");
                c += 1;
            }
            System.out.println();
            r += 1;
        }
    }

    public static void main(String[] args) {
        new Matrix();
    }
}

/* Pseudocode:
rows <- eingabe("Gib die Reihen an:")
cols <- eingabe("Gib die Spalten an:")

c <- 1
ausgabe("  ")
SOLANGE (c <= cols)
    ausgabe(c + "\t")
    c <- c + 1
ENDE SOLANGE
ausgabe("\n")

c <- 1
ausgabe("  ")
SOLANGE (c <= cols)
    ausgabe("_" + "\t")
    c <- c + 1
ENDE SOLANGE
ausgabe("\n")

r <- 1
SOLANGE (r <= rows)
    c <- 1
    ausgabe(r + "|")
    SOLANGE (c <= cols)
        ausgabe(r*c + "\t")
        c <- c + 1
    ENDE SOLANGE
    ausgabe("\n")
    r <- r + 1
ENDE SOLANGE
*/
