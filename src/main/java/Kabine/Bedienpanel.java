package Kabine;

public class Bedienpanel {

    private Schalter elektromotor;
    private Schalter warnlicht;
    private Schalter blaulicht;
    private Schalter frontleuchten;
    private Schalter dachscheinwerfer;
    private Schalter seitenleuchten;
    private Drehknopf frontwerfer;
    private Drehknopf dachloescharm;

    public Bedienpanel(){
        this.elektromotor = new Schalter();
        this.warnlicht = new Schalter();
        this.blaulicht = new Schalter();
        this.frontleuchten = new Schalter();
        this.dachscheinwerfer = new Schalter();
        this.seitenleuchten = new Schalter();
        this.frontwerfer = new Drehknopf(DrehknopfFunktion.FRONTWERFER);
        this.dachloescharm = new Drehknopf(DrehknopfFunktion.DACHLOESCHARM);
    }

    public void motorAn(){
        this.elektromotor.On();
    }

    public void motorAus(){
        this.elektromotor.Off();
    }

    public void warnlichtAn(){
        this.warnlicht.On();
    }

    public void warnlichtAus(){
        this.warnlicht.Off();
    }

    public void blaulichAn(){
        this.blaulicht.On();
    }

    public void blaulichAus(){
        this.blaulicht.Off();
    }

    public void frontleuchtenAn(){
        this.frontleuchten.On();
    }

    public void frontleuchtenAus(){
        this.frontleuchten.Off();
    }

    public void dachscheinwerferAn(){
        this.dachscheinwerfer.On();
    }

    public void dachscheinwerferAus(){
        this.dachscheinwerfer.Off();
    }

    public void seitenleuchtenAn(){
        this.seitenleuchten.On();
    }

    public void seitenleuchtenAus(){
        this.seitenleuchten.Off();
    }
}
