import java.util.Scanner;

public class Weihnachtsbaum
{
    public String Repeat(String x, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += x;
        }
        return res;
    }

    public static String rotateString(String input) {
        String[] lines = input.split("\n");
        int maxLength = 0;

        for (String line : lines) {
            maxLength = Math.max(maxLength, line.length());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLength; i++) {
            for (int j = lines.length - 1; j >= 0; j--) {
                if (i < lines[j].length()) {
                    result.append(lines[j].charAt(i));
                } else {
                    result.append(' ');
                }
            }
            result.append('\n');
        }

        return result.toString();
    }

    public Weihnachtsbaum()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Gib die Reihen an:");
        int rows = s.nextInt();

        { // gedreht
            System.out.println(Repeat("_", rows*2-1));
            System.out.print(Repeat(Repeat(" ", rows-3) + "|   |\n", 3));

            for (int r=1;r<=rows;r++) {
                System.out.print(Repeat(" ", r-1));
                System.out.print(Repeat("*", 2*(rows-r+1)-1));
                System.out.println();
            }
        }

        System.out.println();

        { // normal
            for (int r=1;r<=rows;r++) {
                System.out.print(Repeat(" ", rows-r));
                System.out.print(Repeat("*", 2*r-1));
                System.out.println();
            }

            System.out.print(Repeat(Repeat(" ", rows-3) + "|   |\n", 3));
            System.out.println(Repeat("_", rows*2-1));
        }

        System.out.println();

        { // rechts
            String text = "";
            for (int r=1;r<=rows;r++) {
                text += Repeat(" ", rows-r);
                text += Repeat("*", 2*r-1);
                text += "\n";
            }

            text += Repeat(Repeat(" ", rows-3) + "-   -\n", 3);
            text += Repeat("|", rows*2-1);
            text += "\n";
            System.out.print(rotateString(text));
        }

        /* int r = 1;
        while (r <= rows) {
            int spaceCount = rows-r;
            int starCount = rows-spaceCount;

            System.out.print(Repeat(" ", spaceCount));
            System.out.print(Repeat("*", starCount*2-1));
            System.out.print(Repeat(" ", spaceCount));
            System.out.println();
            r++;
        } */
    }

    public static void main(String[] args) {
        new Weihnachtsbaum();
    }
}
