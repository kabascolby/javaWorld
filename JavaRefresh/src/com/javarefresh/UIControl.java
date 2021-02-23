package com.javarefresh;

public abstract class UIControl {

    private boolean isEnabled = true;

    protected UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    protected UIControl() {
        this(true);
    }
    

    public abstract void render();

    public void enabled() {
        isEnabled = true;
    }    
    
    public void disable() {
        isEnabled = false;
    }    

    public boolean isEnabled() {
        return isEnabled;
    }    

}
