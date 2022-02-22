package Kabine;

public class Lenkrad {

    private int lenkWinkel;

    public Lenkrad(){
        this.lenkWinkel = 0;
    }

    public void turnRight(int winkel){
        int g = this.lenkWinkel + winkel;
        if (g < 360){
            this.lenkWinkel = this.lenkWinkel + winkel;
        }
        else {
            this.lenkWinkel = g - 360;
        }
    }

    public void turnLeft(int winkel){
        int g = this. lenkWinkel - winkel;
        if (g > -360){
            this.lenkWinkel = this.lenkWinkel - winkel;
        }
        else {
            this.lenkWinkel = g + 360;
        }
    }

    public int getLenkWinkel() {
        return lenkWinkel;
    }
}
