package Graphics;

import javax.swing.*;
import java.awt.*;

public class MapBoardPanel extends JPanel {

    private int totalNumberOfCells;
    private int currCellSprite;
    private int currPosition;

    public MapBoardPanel(int cellsX, int cellsY, int cellsSize) {
        super();
        this.setLayout(new GridLayout());
        this.setSizeByCellSize(cellsX, cellsY, cellsSize);
        setTotalNumberOfCells(cellsX*cellsY);
    }

    public int fitCells(int numberOfCells, int cellSize) {
        return cellSize*numberOfCells;
    }

    public void setSizeByCellSize(int cellsX, int cellsY, int cellsSize) {
        int sizeX = fitCells(cellsX, cellsSize);
        int sizeY = fitCells(cellsY, cellsSize);
        this.setSize(sizeX, sizeY);
    }

    public int getTotalNumberOfCells() {
        return totalNumberOfCells;
    }

    public void setTotalNumberOfCells(int totalNumberOfCells) {
        this.totalNumberOfCells = totalNumberOfCells;
    }

    public int getCurrCellSprite() {
        return currCellSprite;
    }

    public void setCurrCellSprite(int currCellSprite) {
        this.currCellSprite = currCellSprite;
    }

    public int getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(int currPosition) {
        this.currPosition = currPosition;
    }
}
