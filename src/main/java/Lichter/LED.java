package Lichter;

public class LED {

    private boolean isOn;

    public LED(){
        this.isOn = false;
    }

    public void On(){
        this.isOn = true;
    }

    public void Off(){
        this.isOn = false;
    }

    public boolean isOn(){
        return this.isOn;
    }

}
