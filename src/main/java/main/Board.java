package main;

import geometrischefiguren.GeometrischeFigur;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Zeichnet einen Kreis mit dem Mittelpunkt mx/my und dem Radius r
 * 
 */
public class Board extends JFrame {

    static final int WIDTH = 600;
    static final int HEIGHT = 600;

    private final BoardPanel panel;

    public Board(int width, int height){
        panel = new BoardPanel();
        this.add(panel);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Board(){
        this(WIDTH, HEIGHT);
    }


    public void addGeometrical(GeometrischeFigur figure) {
        this.panel.addGeometrischeFigur(figure);
    }

    public static class BoardPanel extends JPanel {

        ArrayList<GeometrischeFigur> figures = new ArrayList<>();

        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            RenderingHints rh;
            rh = new RenderingHints (
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );
            g2d.setRenderingHints(rh);
            g2d.setColor(Color.WHITE);
            g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
            g2d.setColor(Color.BLACK);

            for (GeometrischeFigur figure: this.figures) {
                figure.draw(g2d);
            }
        }

        public void addGeometrischeFigur(GeometrischeFigur figure) {
            this.figures.add(figure);
            this.repaint();
        }


    }
}

