package Kabine;

public class Drehknopf {

    private char stufe;
    private int stufe1;
    private final DrehknopfFunktion drehknopfFunktion;

    public Drehknopf(DrehknopfFunktion drehknopfFunktion){
        this.drehknopfFunktion = drehknopfFunktion;
    }

    public int turn(char stufe){
        if (this.drehknopfFunktion == DrehknopfFunktion.DACHLOESCHARM){
            switch (stufe) {
                case 'A' -> {
                    this.stufe1 = 1;
                }
                case 'B' -> {
                    this.stufe1 = 2;
                }
                case 'C' -> {
                    this.stufe1 = 3;
                }
            }
        }
        if (this.drehknopfFunktion == DrehknopfFunktion.FRONTWERFER){
            switch (stufe) {
                case '1' -> {
                    this.stufe1 = 1;
                }
                case '2' -> {
                    this.stufe1 = 2;
                }
                case '3' -> {
                    this.stufe1 = 3;
                }
                case '4' -> {
                    this.stufe1 = 4;
                }
                case '5' -> {
                    this.stufe1 = 5;
                }
                case '6' -> {
                    this.stufe1 = 6;
                }
                case '7' -> {
                    this.stufe1 = 7;
                }
            }
        }
        return stufe1;
    }

    public DrehknopfFunktion getDrehknopfFunktion() {
        return drehknopfFunktion;
    }
}
