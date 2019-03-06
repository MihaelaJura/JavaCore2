package Task4and5;


public class UsePoint extends Point {
    public static void main(String[] args) {

        Point point1 = new Point();
        System.out.println("Point 1 coordinates: " + point1.getX() + " " + point1.getY() + " " + point1.getZ());

        Point point2 = new Point(1, 2, 3);
        System.out.println("Point 2 coordinates: " + point2.getX() + " " + point2.getY() + " " + point2.getZ());

        Point point3 = new Point(8, 9);
        System.out.println("Point 3 coordinates: " + point3.getX() + " " + point3.getY() + " " + point3.getZ());

    }
}
