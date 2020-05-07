package UI;

/**
 * TextBox
 */
public class TextBox extends UIControl {

    private String text = "";

    public TextBox() {
        super(false);
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    @Override
    public void render() {
        System.out.println("this is a textBox");
    }
    

}