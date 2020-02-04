package app;

public class Main {
    public static void main(String[] args) throws Exception {
        var box1 = new TextBox();
        box1.setText("Hello World");
        System.out.println(box1);
        show(box1);
        var point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        UIControl[] controls = { new TextBox(), new Checkbox() };
        for (var control : controls)
            control.render();
    }

    // UP casting a class
    public static void show(UIControl control) {

        if (control instanceof TextBox) {
            var textBox = (TextBox) control; // downcasting
            textBox.setText("lamine kaba");
        }
        System.out.println(control);
    }
}