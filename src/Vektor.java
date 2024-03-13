public class Vektor
{
    public void Coordinates(double length, double angleDeg) {
        angleDeg = angleDeg - ((int)(angleDeg/360))*360;
        double x = 0;
        double y = 0;

        if (angleDeg % 90 == 0.0f) {
            switch ((int) angleDeg) {
                case 0: x = length; break;
                case 90: y = length; break;
                case 180: x = -length; break;
                case 270: y = -length; break;
                default:
                    break;
            }
        } else {
            double angleRad = angleDeg / 180 * Math.PI;
            y = Math.sin(angleRad)*length;
            x = Math.cos(angleRad)*length;
        }

        System.out.println("Punkt: (" + x + "|" + y + ")");
    }

    public void ReverseCoordinates(double x, double y) {
        double length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (x < 0 || y < 0) length*=-1;

        double result;
        if (y == 0) {
            result = length >= 0 ? 0 : 180;
        } else if (x == 0) {
            result = length >= 0 ? 90 : 270;
        } else {
            double angleRad = Math.atan(y/x);
            double angleDeg = angleRad/ Math.PI * 180;
            if (x >= 0 && y >= 0) { // quadrant 1
                result = angleDeg;
            } else if (x < 0 && y >= 0) { // quadrant 2
                result = 180-angleDeg;
            } else if (x < 0 && y < 0) { // quadrant 3
                result = 180+angleDeg;
            } else if (x >= 0 && y < 0) { // qudrant 4
                result = 360-angleDeg;
            } else {
                result = -1;
            }
        }
        System.out.println("Winkel Grad: " + result);
        System.out.println("Länge: " + length);
    }

    public Vektor()
    {
        double length = 3;
        double deg = 0;

        // Coordinates(length, deg);
        // ReverseCoordinates(3, 0);

        Coordinates(5.78, 23);
        //ReverseCoordinates(-8.66, -5);
        System.out.println();

        /* Coordinates(3, 90);
        ReverseCoordinates(0, 3);
        System.out.println();

        Coordinates(3, 180);
        ReverseCoordinates(-3, 0);
        System.out.println();

        Coordinates(3, 270);
        ReverseCoordinates(0, -3); */
    }

    public static void main(String[] args) {
        new Vektor();
    }
}
