package Jogo;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel jogo = new GamePanel();
        frame.add(jogo);
        frame.pack();
        jogo.startGameThread();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}