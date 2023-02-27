package geometrischefiguren;

import java.awt.*;

public abstract class GeometrischeFigur {

    protected String farbe;

    protected int zoomfaktor;


    public void setzteFarbe(String farbe) {

    }

    public void zoomeAuf(int zoomfaktor) {

    }

    public void anzeigen() {

    }

    public abstract void draw(Graphics2D g2d);

}
