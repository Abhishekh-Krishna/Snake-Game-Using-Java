import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth; //which means board ht and wt will be 600

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true); 
        frame.setSize(boardHeight,boardWidth); //creates a 600 by 600 window
        frame.setLocationRelativeTo(null); //opens the window at the centre of the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
