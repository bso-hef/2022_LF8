package geometrischefiguren;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Kreis extends GeometrischeFigur {

    static int anzahlKreise;

    {
        anzahlKreise = 0;
        //statischer Block
    }

    private int radius;

    private Point2D mittelpunkt = new Point2D.Double();

    public Kreis(int x, int y, int radius) {
        super();
        mittelpunkt.setLocation(x, y);
        this.radius = radius;
    }

    public Kreis() {
        this.radius = 10;
        this.mittelpunkt.setLocation(150, 150);
    }

    @Override
    public void draw(Graphics2D g2d) {

        Ellipse2D.Double kreis = new Ellipse2D.Double(mittelpunkt.getX() - (radius * zoomfaktor / 100), mittelpunkt.getY() -(radius * zoomfaktor / 100), (radius * 2) * zoomfaktor / 100, (radius * 2) * zoomfaktor / 100);
        g2d.setColor(farbe);
        g2d.draw(kreis);

    }
}
