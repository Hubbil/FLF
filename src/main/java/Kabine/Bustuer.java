package Kabine;

public class Bustuer {

    private Position position;
    private boolean isOpen;

    public Bustuer(Position position){
        this.position = position;
        this.isOpen = false;
    }

    public Position getPosition() {
        return position;
    }

    public void pressButton(){
        if (this.isOpen){
            this.isOpen = false;
        }
        else {
            this.isOpen = true;
        }
    }
}
