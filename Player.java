package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 802967
 */
public class Player {
    //declared, not initialized
    private int x, y;
    //declared and initialized
    //static means all Players
    //final means cant change, constant
    private static final int speed = 3;
    private static final int WIDTH = 30, HEIGHT = 30, SPEED = 4;
    private static final Color COLOR = Color.RED;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }
    
    public void move(int dx, int dy) {
        x += dx * SPEED;
        y += dy * SPEED;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }
    
    
}