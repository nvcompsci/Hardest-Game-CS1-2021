package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author John Word
 */
public class Player {
    private int x, y;
    //constants
    private final static int WIDTH = 50, HEIGHT = 50, SPEED = 2;
    private final static Color COLOR = Color.RED;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //1. draw outline on shape
    public void draw(Graphics g) {        
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }
    
    public void move(int dx, int dy) {
        x += SPEED * dx;
        y += SPEED * dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }    
    
}
