package app;

/**
 * itterator2
 */
public class itterator2 {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Banana" };

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}