package Achsen;

public class Achse {

    private Reifen reifen01;
    private Reifen reifen02;
    private Bremsscheibe bremsscheibe01;
    private Bremsscheibe bremsscheibe02;
    private Bremsscheibe bremsscheibe03;
    private Bremsscheibe bremsscheibe04;
    private Bremsscheibe bremsscheibe05;
    private Bremsscheibe bremsscheibe06;
    private Position position;
    private int lenkWinkel;

    public Achse(Position position){
        this.position = position;
        this.reifen01 = new Reifen(Position.LINKS);
        this.reifen02 = new Reifen(Position.RECHTS);
        this.bremsscheibe01 = new Bremsscheibe(Position.LINKS);
        this.bremsscheibe02 = new Bremsscheibe(Position.LINKS);
        this.bremsscheibe03 = new Bremsscheibe(Position.LINKS);
        this.bremsscheibe04 = new Bremsscheibe(Position.RECHTS);
        this.bremsscheibe05 = new Bremsscheibe(Position.RECHTS);
        this.bremsscheibe06 = new Bremsscheibe(Position.RECHTS);
        if (this.position == Position.VORNE){
            this.lenkWinkel = 0;
        }
    }

    public Bremsscheibe getBremsscheibe01() {
        return bremsscheibe01;
    }

    public Bremsscheibe getBremsscheibe02() {
        return bremsscheibe02;
    }

    public Bremsscheibe getBremsscheibe03() {
        return bremsscheibe03;
    }

    public Bremsscheibe getBremsscheibe04() {
        return bremsscheibe04;
    }

    public Bremsscheibe getBremsscheibe05() {
        return bremsscheibe05;
    }

    public Bremsscheibe getBremsscheibe06() {
        return bremsscheibe06;
    }

    public Reifen getReifen02() {
        return reifen02;
    }

    public Reifen getReifen01() {
        return reifen01;
    }

    public int getLenkWinkel() {
        return lenkWinkel;
    }

    public void turn(int lenkWinkel){
        this.lenkWinkel = this.lenkWinkel + lenkWinkel;
    }
}
