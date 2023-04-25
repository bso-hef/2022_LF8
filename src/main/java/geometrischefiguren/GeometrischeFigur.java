package geometrischefiguren;

import java.awt.*;

/**
 * Klassendokumentation
 */
public abstract class GeometrischeFigur {

    protected Color farbe;

    protected int zoomfaktor;

    public GeometrischeFigur() {
        farbe = Color.BLACK;
        zoomfaktor = 100;
    }

    public void setzteFarbe(String farbe) {

    }

    public void zoomeAuf(int zoomfaktor) {

    }

    public void anzeigen() {

    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public abstract void draw(Graphics2D g2d);

    /**
     * Zooms the object
     * @param zoomfaktor 100 means no zoom
     *
     */
    public void setZoomfaktor(int zoomfaktor) {
        this.zoomfaktor = zoomfaktor;
    }
}
