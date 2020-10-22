package hardestgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author 802967
 */
public class Enemy {
    private int x, y, vx, vy;
    private final static int SPEED = 10;
    private final static int WIDTH =25, HEIGHT=25;
    private final static Color COLOR = Color.BLUE;
    
    //constructor
    
    public Enemy(int x, int y, int vx, int vy) {
    this.x = x;
    this.y = y;
    this.vx = vx;
    this.vy = vy;
}

//draws a circle
    public void draw(Graphics g) {
        g.setColor(COLOR);
       g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
       g.drawOval(x, y, WIDTH, HEIGHT);
    }
    /**
     * Check if enemy hits border, then turns around
     * @param border the boundaries of the room
    */

    public void collideWorldBounds(Border border) {
        Rectangle enemyBounds = new Rectangle (x, y, WIDTH, HEIGHT);
        Rectangle borderBounds = new Rectangle (border.getX(), border.getY(), border.getWIDTH(), border.getHEIGHT());
        if (!borderBounds.contains(enemyBounds)) {
            vx *=-1;
            vy *=-1;
                    
        }
        
    }
    public void move() {
        x+=vx*SPEED;
        y+=vy*SPEED;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public static int getSPEED() {
        return SPEED;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    
}
