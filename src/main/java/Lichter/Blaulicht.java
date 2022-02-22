package Lichter;

public class Blaulicht {

    private LED led01;
    private LED led02;
    private LED led03;
    private LED led04;
    private Position position;

    public Blaulicht(Groesse groesse, Position position){

        this.position = position;

        switch (groesse) {
            case GROSS -> {
                this.led01 = new LED();
                this.led02 = new LED();
                this.led03 = new LED();
                this.led04 = new LED();
            }
            case MITTEL -> {
                this.led01 = new LED();
                this.led02 = new LED();
            }
            case KLEIN -> this.led01 = new LED();
        }
    }
}
