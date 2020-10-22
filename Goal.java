package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 802967
 */
public class Goal {
    private int x, y;
    private final int WIDTH, HEIGHT;
    private boolean isFinish;
    private final static Color COLOR = Color.GREEN;
    
    //constructor
    public Goal (int x, int y, int width, int height, boolean isFinish) {
        this.x = x;
        this.y = y;
        this.WIDTH = width;
        this.HEIGHT = height;
        this.isFinish = isFinish;
    }
    
    //draws a rectangle
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }
    
    //getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public boolean isIsFinish() {
        return isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }


    
}
