package UI;

/* We use Abstract Class to avoid a class to be extentiated*/

public abstract class UIControl {
    // private boolean isEnabled = true;
    private boolean isEnabled;
    
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    /* 
        We create an empty methode in purpose to override it from
        all the child class. (classes who will inherit this method)
    */
    // public void render(){

    // }

    /*
        We use abstract method to force all the classes who will
        derive from this class to implement this method
    */
    public abstract void render();

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

}
