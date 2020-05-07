package TextBox;

public class Main {
    public static void main(String[] args) {
        
        var textBox = new TextBox();
        textBox.setText("Box 1");
        System.out.println(textBox.text);
        TextBox textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

    }
}