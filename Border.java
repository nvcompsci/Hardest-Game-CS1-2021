package hardestgame;

import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author 802967
 */

public class Border {
    private final int x, y, WIDTH, HEIGHT;
    private final static Color COLOR = Color.BLACK;
    
    //constructor for Border
    public Border (int x, int y, int WIDTH, int HEIGHT) {
        this.x = x;
        this.y = y;
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }
    //draws a rectangle
    public void draw (Graphics g){
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
    
    
}
