import javax.swing.*;

public class Flappy {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Heal heal = new Heal();
        frame.add(heal);
        frame.pack();
        heal.requestFocus();
        frame.setVisible(true);
    }
}