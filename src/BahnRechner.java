import java.util.Scanner;

public class BahnRechner
{
    public final float CostPerKm = .10f; // cost per km in €

    public BahnRechner()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Wieviele km bist du gefahren?");
        float kmTraveled = s.nextFloat();

        int day = 0;
        System.out.println("Welcher Tag ist heute (1-7)?");
        day = s.nextInt();

        System.out.println("Hast du eine Bahncard (true/false)?");
        boolean hasBahncard = s.nextBoolean();
        float baseCost = CostPerKm * kmTraveled;
        float kmDiscount = 0.0f;
        float bCardDiscount = 0.0f;
        float finalCost = baseCost;

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6: {
                if (kmTraveled > 185) { // rabatt
                    kmDiscount = baseCost * 0.1f;
                    finalCost -= kmDiscount;
                }
                break;
            }
            case 5:
            case 7: {
                break;
            }
            default: {
                System.out.println("Invalid weekday");
            }

        }

        if (hasBahncard && kmTraveled >= 100) {
            bCardDiscount = finalCost * 0.25f;
            finalCost -= bCardDiscount;
        }

        System.out.println("Tag: " + day);
        System.out.println("Km: " + kmTraveled);
        System.out.println("Grund Kosten: " + baseCost + "€");
        System.out.println();
        System.out.println("KM Rabatt: -"+kmDiscount);
        System.out.println("BC Rabatt: -"+bCardDiscount);
        System.out.println();
        System.out.println("Final: " + finalCost + "€");
    }

    public static void main(String[] args) {
        new BahnRechner();
    }
}
