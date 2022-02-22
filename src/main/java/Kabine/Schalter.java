package Kabine;

public class Schalter {

    private boolean isOn;

    public Schalter(){
        this.isOn = false;
    }

    public void On(){
        this.isOn = true;
    }

    public void Off(){
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
