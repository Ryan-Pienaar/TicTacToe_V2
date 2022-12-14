import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;

public class Grid {
    static final int HEIGHT = 700;
    static final int WIDTH = 400;
    static JFrame mainFrame = new JFrame();

    public static void main(String[] args)
    {
        drawBackground();
        drawGameGrid(mainFrame.getGraphics());
        mainFrame.setVisible(true);
    }

    private static void drawBackground()
    {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(WIDTH, HEIGHT);
        Canvas mainCvs = new Canvas();
        mainCvs.setSize(WIDTH, HEIGHT);
        mainFrame.add(mainCvs);
        mainFrame.setVisible(true);
    }

    private static void drawGameGrid(Graphics g)
    {

        for (int i = HEIGHT/4; i <= HEIGHT; i += HEIGHT/4) {
            g.drawLine(0, i, WIDTH, i);

        }

        for (int i = WIDTH/4; i <= WIDTH; i += WIDTH/4) {

        }

    }

}
