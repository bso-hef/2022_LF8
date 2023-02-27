package main;

import geometrischefiguren.Kreis;

public class Painter {
    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();
        Kreis circle1 = new Kreis();
//        circle1.setFarbe("blue");
        board.addGeometrical(circle1);
//        Kreis circle2 = new Kreis(100, 100, 100);
//        circle2.setFarbe("red");
//        board.addGeometrical(circle2);
//        Thread.sleep(2000);
//        System.out.println("start zoom circle2");
//        circle1.setFarbe("black");
//        circle1.setZoomfaktor(70);
//        board.repaint();
    }
}
