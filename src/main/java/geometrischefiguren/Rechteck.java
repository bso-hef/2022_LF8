package geometrischefiguren;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rechteck extends GeometrischeFigur{

    private Point punktA;

    private Point punktB;

    private Point punktC;

    private Point punktD;

    public Rechteck(Point punktA, Point punktB, Point punktC, Point punktD) {
        this.punktA = punktA;
        this.punktB = punktB;
        this.punktC = punktC;
        this.punktD = punktD;
    }

    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D rect = new Rectangle2D.Double(punktA.getX(),
                punktA.getY(),
                punktB.getX()- punktA.getX(),
                punktD.getY()-punktA.getY());
        g2d.setColor(farbe);
        g2d.draw(rect);
    }
}
