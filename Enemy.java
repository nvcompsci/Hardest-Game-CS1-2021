/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jword
 */
public class Enemy {
    private int x, y, vx, vy;
    private final static int SPEED = 5;
    private final static int WIDTH = 25, HEIGHT = 25;
    private final static Color COLOR = Color.BLUE;
    
    //4.a constructor
    public Enemy(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    
    //4.b draws a circle (oval)
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.fillOval(x, y, WIDTH, HEIGHT);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, WIDTH, HEIGHT);
    }
    
    public void move() {
        x += SPEED * vx;
        y += SPEED * vy;
    }
    //4.c getters

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
