package app;

public class App {
    public static void main(String[] args) throws Exception {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("box2");
        System.out.println(textBox2.text);
    }
}