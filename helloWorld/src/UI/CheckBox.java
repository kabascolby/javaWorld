package UI;

public class CheckBox extends UIControl {
    boolean isOn = false;

    public CheckBox() {
        super(false);
    }

    @Override
    public void render() {
        System.out.println("this is a checkbox");
    }

    
}