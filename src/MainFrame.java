import javax.swing.*;

public class MainFrame implements Runnable{
    private DrawingPanel panel;
    public MainFrame() {
        JFrame frame = new JFrame("Main Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(300, 100);
        frame.setVisible(true);
        panel = new DrawingPanel();
        frame.add(panel);
        Thread thread = new Thread(this);
        Thread.start();
    }

    @Override
    public void run() {
        while (true) {
            panel.repaint();
        }
    }
}
