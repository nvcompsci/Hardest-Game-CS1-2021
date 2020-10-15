package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jword
 */
public class Player {
    //declared, not initialized
    private int x, y;
    //declared and initialized
    //static means all Players
    //final means cannont change, constant
    private static final int speed = 3;
    private static final int width = 30, height = 30;
    private static final Color color = new Color(0xEE0088);

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    public void move(int dx, int dy) {
        x += dx * speed;
        y += dy * speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
    
    
}
