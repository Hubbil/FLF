package Kabine;

public class Kabine {

    private Bustuer tuerLinks;
    private Bustuer tuerRechts;
    private Sitzplatz sitzplatz01;
    private Sitzplatz sitzplatz02;
    private Sitzplatz sitzplatz03;
    private Sitzplatz sitzplatz04;
    private Joystick joystick01;
    private Joystick joystick02;
    private Bedienpanel bedienpanel;
    private Lenkrad lenkrad;
    private Restenergieanzeige restenergieanzeige;
    private Tacho tacho;
    private Bremspedal bremspedal;
    private Gaspedal gaspedal;

    public Kabine(){
        this.tuerLinks =  new Bustuer(Position.LINKS);
        this.tuerRechts = new Bustuer(Position.RECHTS);
        this.sitzplatz01 = new Sitzplatz(Position.VORNELINKS);
        this.sitzplatz02 = new Sitzplatz(Position.VORNERECHTS);
        this.sitzplatz03 = new Sitzplatz(Position.HINTENLINKS);
        this.sitzplatz04 = new Sitzplatz(Position.HINTENRECHTS);
        this.joystick01 = new Joystick();
        this.joystick02 = new Joystick();
        this.bedienpanel = new Bedienpanel();
        this.lenkrad = new Lenkrad();
        this.restenergieanzeige = new Restenergieanzeige();
        this.tacho = new Tacho();
        this.bremspedal = new Bremspedal();
        this.gaspedal = new Gaspedal();
    }
}
