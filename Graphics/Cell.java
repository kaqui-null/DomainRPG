package Graphics;

import javax.swing.*;

public class Cell extends JPanel {

    private int sprite;
    private int[] position;
    private boolean collides;

    public Cell() {
        super();
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
