package Kabine;

public class Taster {

    private boolean isPressed;

    public Taster(){
        this.isPressed = false;
    }

    public boolean press() {
        this.isPressed = true;
        return isPressed;
    }
}
