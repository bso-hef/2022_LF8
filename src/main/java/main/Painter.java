package main;

import geometrischefiguren.Kreis;
import geometrischefiguren.Rechteck;

import java.awt.*;

public class Painter {
    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();
        Kreis circle1 = new Kreis();
//        circle1.setFarbe("blue");
        board.addGeometrical(circle1);
        Kreis circle2 = new Kreis(100, 100, 100);
        circle2.setFarbe(Color.RED);
        board.addGeometrical(circle2);
//        Thread.sleep(2000);
//        System.out.println("start zoom circle2");
//        circle1.setFarbe("black");
        circle2.setZoomfaktor(25);
//        board.repaint();

        Rechteck rechteck = new Rechteck(new Point(0,0),
                new Point(100,0),
                new Point(100, 100),
                new Point(0, 100));

        board.addGeometrical(rechteck);
    }
}
