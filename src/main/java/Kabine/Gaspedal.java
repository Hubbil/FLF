package Kabine;

public class Gaspedal {

    private int amount;

    public Gaspedal(){

    }

    public void StepOnGas(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
