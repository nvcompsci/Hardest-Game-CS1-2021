package hardestgame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author John Word
 */
public class HardestGame extends JPanel implements KeyListener, MouseListener {

    private Timer timer;
    private int frameCount = 0;
    private Player player;
    
    private Border border;
    private Enemy enemy1;
    private Enemy enemy2;
    private Goal start;
    private Goal finish;
    
    
    
    
    public HardestGame() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
        this.player = new Player(50,300);
        this.border = new Border(0,100, 800,600);
        this.enemy1 = new Enemy (400, 300, 0, -1);
        this.enemy2 = new Enemy (600, 500, 0, 1);
        this.start = new Goal (0,100, 100, 600, false);
        this.finish = new Goal (700,100, 100, 600, true);
    }
    
     @Override
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        frameCount++;
        
        this.setBackground(Color.WHITE);		
        
        //draw all objects
        player.draw(g);
        enemy1.draw(g);
        enemy2.draw(g);
        border.draw(g);
        start.draw(g);
        finish.draw(g);
    }
     
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {
            repaint();
        }
    }
    
    public static void main(String[] args) {
        JFrame j = new JFrame("Blobby Game");
        Container c = new HardestGame();
        j.add(c);
        j.pack();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(800, 600);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.addKeyListener((KeyListener) c);
        j.addMouseListener((MouseListener) c);
    }
    
     @Override
    public void keyPressed(KeyEvent e) {
        System.out.printf("\nKeyCode: %d was pressed",e.getKeyCode());
        player.move(0,1);
    }
    
     @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==87) {
            player.move(0,-1);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.printf("\nMouse Clicked at (%d,%d)",e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}