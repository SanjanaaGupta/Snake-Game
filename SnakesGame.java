package snakesgame;
import javax.swing.*;

public class SnakesGame extends JFrame {
    SnakesGame(){
        super("Snake Game");
        add(new Board());
        pack();
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    
}
    public static void main(String[] args) {
        // TODO code application logic here
        new SnakesGame();
        
    }
}
