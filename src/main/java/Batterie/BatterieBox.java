package Batterie;

public class BatterieBox {

    private Batterie[][] batteries = new Batterie[2][2];

    public BatterieBox(){
        this.batteries[0][0] = new Batterie();
        this.batteries[0][1] = new Batterie();
        this.batteries[1][0] = new Batterie();
        this.batteries[1][1] = new Batterie();
    }

    public Batterie[][] getBatteries() {
        return batteries;
    }
}
