package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author John Word
 */
public class Player {
    private int x, y;
    private final static int WIDTH = 50, HEIGHT = 50;
    //constant
    private final static Color COLOR = Color.RED;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }    
    
}
