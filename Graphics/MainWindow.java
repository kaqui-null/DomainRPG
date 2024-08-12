package Graphics;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame{

    public MainWindow(String title) {
        super(title);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setColor();
    }

    public void setColor() {
        //TODO: set alternating color pattern BLACK and WHITE
        this.getContentPane().setBackground(Color.BLACK);
    }

}
