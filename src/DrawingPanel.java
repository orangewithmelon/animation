import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class DrawingPanel extends JPanel{
    private BufferedImage starImg;
    private double stringX;
    private double pokeballY;

    public DrawingPanel() {
        stringX = 50;
        pokeballY = 50;
        try {
            starImg = ImageIO.read(new File("src/untitled.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
