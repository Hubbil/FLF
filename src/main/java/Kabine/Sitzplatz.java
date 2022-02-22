package Kabine;

public class Sitzplatz {

    private Atemschutzgeraet atemschutzgerät;
    private Position position;

    public Sitzplatz(Position position){
        this.atemschutzgerät = new Atemschutzgeraet();
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public Atemschutzgeraet getAtemschutzgerät() {
        return atemschutzgerät;
    }
}
