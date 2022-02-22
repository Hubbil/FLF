package Kabine;

public class Bremspedal {

    private int amount;

    public Bremspedal(){

    }

    public void StepOnBrake(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
