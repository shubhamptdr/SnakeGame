import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SnakeGame {
    JFrame frame;
    SnakeGame(){
        frame = new JFrame();
        Board board = new Board();

        frame.add(board);
        frame.setResizable(false);
        frame.pack();

        frame.setVisible(true);

    }
    public static void main(String []args){
        SnakeGame snakeGame = new SnakeGame();
    }
}