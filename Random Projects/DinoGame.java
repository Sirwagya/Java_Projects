import java.awt.*;
import javax.swing.*;

public class DinoGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Dino Game");
        frame.setSize(800,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.WHITE);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,240,800,10);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(60,200,40,40);

    }
}