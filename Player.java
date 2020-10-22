package hardestgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

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

    //7
    
    public void playersVsEnemy (Enemy enemy, Goal start) {
        Rectangle playerBounds = new Rectangle (x, y, WIDTH, HEIGHT);
        Rectangle enemyBounds = new Rectangle (enemy.getX(), enemy.getY(), enemy.getWIDTH(), enemy.getHEIGHT());
        if (playerBounds.intersects(enemyBounds)) {
            x=50;
            y=300;  
        }
    }
    
    public void playersVsGoal (Goal goal) {
        Rectangle playerBounds = new Rectangle (x, y, WIDTH, HEIGHT);
        Rectangle goalBounds = new Rectangle (goal.getX(), goal.getY(), goal.getWIDTH(), goal.getHEIGHT());
        if (playerBounds.intersects(goalBounds)) {
            goal.setIsFinish(true);
            System.out.println("You Finished!");
        }
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}