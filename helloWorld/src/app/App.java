package app;

import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

public class App {
  public static void main(String[] args) throws Exception {
    long viewCount = 7123456789L;
    Point point1 = new Point(1, 2);
    String message = "lamine kaba";
    Date now = new Date();
    byte letter = 'A';
    Point point2 = point1;
    point1.x = 9;
    System.out.println(point2);
    System.out.println(viewCount);
    System.out.println(letter);
    System.out.println(now);
    System.out.println("Mohamed ".concat(message));
    int[] numbers = { 1, 2, 67, 78, 42 };
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers.length);
    int[][] data = { { 1, 2, 3 }, { 4, 5, 6 } };

    System.out.println(Arrays.deepToString(data));
    String size = "4.5";
    System.out.println(Float.parseFloat(size));
    int result = (int) (Math.random() * 1000);
    System.out.println(result);
  }
}