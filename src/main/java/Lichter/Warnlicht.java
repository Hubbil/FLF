package Lichter;

public class Warnlicht {

    private LED led;
    private Farbe farbe;


    public Warnlicht(){
        this.farbe = Farbe.ORANGE;
        this.led = new LED();
    }

    public void On(){
        this.led.On();
    }

    public void Off(){
        this.led.Off();
    }

    public LED getLed() {
        return led;
    }
}
