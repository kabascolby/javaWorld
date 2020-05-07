package point;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(1, 2);
        var pointB = new Point(5, 2);

        System.out.println(pointA.equals(pointB));
        System.out.println(pointA.hashCode());
        System.out.println(pointB.hashCode());
    }
}
