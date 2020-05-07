package UI;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        System.out.println(textBox.isEnabled());
        textBox.setText("lamine kaba est un battant");
        System.out.println(textBox);
        var mycontrol = new TextBox();
        show(textBox);
        //Polymorphism
        UIControl[] controls = {
            new CheckBox(),
            new TextBox(),
            new TextBox()
        };
    
        for (var control : controls)
            control.render();

    }

    //upcasting and downcasting

    public static void show(UIControl control){
        if (control instanceof TextBox){
            
            TextBox textBox = (TextBox)control;
            textBox.setText("Je suis confiant que je vais avance");
        }
        System.out.println(control);
    }

}