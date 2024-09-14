package Graphics;

import javax.swing.*;
import java.awt.*;

/// GREEN IS THE COLOR FOR A BUGGED CELL

public class Cell extends JPanel {

    private int sprite;
    private int[] position;
    private boolean collides;


    public Cell(String color) {
        super();
        this.setBGColor(color);
    }

    public Cell() {
        super();
        this.setBackground(Color.GREEN);
    }

    //temp: set bg color
    public void setBGColor(String color) {
        switch (color) {
            case "black":
                this.setBackground(Color.BLACK);
                break;
            case "white":
                this.setBackground(Color.WHITE);
                break;
        }
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getSprite() {
        return sprite;
    }

    public void setSprite(int sprite) {
        this.sprite = sprite;
    }

    public boolean isCollides() {
        return collides;
    }

    public void setCollides(boolean collides) {
        this.collides = collides;
    }
}
