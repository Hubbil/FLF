import Achsen.Achse;
import Kabine.Kabine;
import Lichter.*;

public class FLF {

    private Scheinwerfer scheinwerfer01;
    private Scheinwerfer scheinwerfer02;
    private Scheinwerfer scheinwerfer03;
    private Scheinwerfer scheinwerfer04;
    private Scheinwerfer scheinwerfer05;
    private Scheinwerfer scheinwerfer06;
    private Scheinwerfer scheinwerfer07;
    private Scheinwerfer scheinwerfer08;
    private Scheinwerfer scheinwerfer09;
    private Scheinwerfer scheinwerfer10;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger01;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger02;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger03;
    private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger04;
    private Bremslicht bremslicht01;
    private Bremslicht bremslicht02;
    private Blaulicht blaulicht01;
    private Blaulicht blaulicht02;
    private Blaulicht blaulicht03;
    private Blaulicht blaulicht04;
    private Blaulicht blaulicht05;
    private Blaulicht blaulicht06;
    private Blaulicht blaulicht07;
    private Blaulicht blaulicht08;
    private Blaulicht blaulicht09;
    private Blaulicht blaulicht10;
    private Warnlicht warnlicht;
    private Kabine kabine;
    private Achse achse01;
    private Achse achse02;
    private Achse achse03;
    private Achse achse04;

    public FLF(Builder builder){
        scheinwerfer01 = builder.scheinwerfer01;//VORNELINKS
        scheinwerfer02 = builder.scheinwerfer01;//VORNELINKS
        scheinwerfer03 = builder.scheinwerfer01;//VORNELINKS
        scheinwerfer04 = builder.scheinwerfer03;//VORNERECHTS
        scheinwerfer05 = builder.scheinwerfer03;//VORNERECHTS
        scheinwerfer06 = builder.scheinwerfer03;//VORNERECHTS
        scheinwerfer07 = builder.scheinwerfer02;//DACH
        scheinwerfer08 = builder.scheinwerfer02;//DACH
        scheinwerfer09 = builder.scheinwerfer02;//DACH
        scheinwerfer10 = builder.scheinwerfer02;//DACH
        fahrtrichtungsanzeiger01 = builder.fahrtrichtungsanzeiger01;//VORNELINKS
        fahrtrichtungsanzeiger02 = builder.fahrtrichtungsanzeiger02;//VORNERECHTS
        fahrtrichtungsanzeiger03 = builder.fahrtrichtungsanzeiger03;//HINTENLINKS
        fahrtrichtungsanzeiger04 = builder.fahrtrichtungsanzeiger04;//HINTENRECHTS
        bremslicht01 = builder.bremslicht01;
        bremslicht02 = builder.bremslicht02;
        blaulicht01 = builder.blaulicht01; //Vorne
        blaulicht02 = builder.blaulicht01; //Vorne
        blaulicht03 = builder.blaulicht02; //Dach
        blaulicht04 = builder.blaulicht02; //Dach
        blaulicht05 = builder.blaulicht02; //Dach
        blaulicht06 = builder.blaulicht02; //Dach
        blaulicht07 = builder.blaulicht03; //Hinten Rechts
        blaulicht08 = builder.blaulicht03; //Hinten Rechts
        blaulicht09 = builder.blaulicht04; //Hinten Links
        blaulicht10 = builder.blaulicht04; //Hinten Links
        warnlicht = builder.warnlicht;
        kabine = builder.kabine;
        achse01 = builder.achse01; //VORNE
        achse02 = builder.achse01; //VORNE
        achse03 = builder.achse02; //HINTEN
        achse04 = builder.achse02; //HINTEN
    }

    public static class Builder{

        private Scheinwerfer scheinwerfer01;
        private Scheinwerfer scheinwerfer02;
        private Scheinwerfer scheinwerfer03;
        private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger01;
        private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger02;
        private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger03;
        private Fahrtrichtungsanzeiger fahrtrichtungsanzeiger04;
        private Bremslicht bremslicht01;
        private Bremslicht bremslicht02;
        private Blaulicht blaulicht01;
        private Blaulicht blaulicht02;
        private Blaulicht blaulicht03;
        private Blaulicht blaulicht04;
        private Warnlicht warnlicht;
        private Kabine kabine;
        private Achse achse01;
        private Achse achse02;


        public Builder(){
            this.scheinwerfer01 = new Scheinwerfer(Position.VORNELINKS);
            this.scheinwerfer02 = new Scheinwerfer(Position.DACH);
            this.scheinwerfer03 = new Scheinwerfer(Position.VORNERECHTS);
            this.fahrtrichtungsanzeiger01 = new Fahrtrichtungsanzeiger(Position.VORNELINKS);
            this.fahrtrichtungsanzeiger02 = new Fahrtrichtungsanzeiger(Position.VORNERECHTS);
            this.fahrtrichtungsanzeiger03 = new Fahrtrichtungsanzeiger(Position.HINTENLINKS);
            this.fahrtrichtungsanzeiger04 = new Fahrtrichtungsanzeiger(Position.HINTENRECHTS);
            this.bremslicht01 = new Bremslicht(Position.HINTENLINKS);
            this.bremslicht02 = new Bremslicht(Position.HINTENRECHTS);
            this.blaulicht01 = new Blaulicht(Groesse.KLEIN, Position.VORNE);
            this.blaulicht02 = new Blaulicht(Groesse.GROSS, Position.DACH);
            this.blaulicht03 = new Blaulicht(Groesse.MITTEL, Position.HINTENRECHTS);
            this.blaulicht04 = new Blaulicht(Groesse.MITTEL, Position.HINTENLINKS);
            this.warnlicht = new Warnlicht();
            this.kabine = new Kabine();
            this.achse01 = new Achse(Achsen.Position.VORNE);
            this.achse02 = new Achse(Achsen.Position.HINTEN);
        }
    }
}
