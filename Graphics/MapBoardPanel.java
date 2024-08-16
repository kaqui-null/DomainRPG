package Graphics;

import javax.swing.*;
import java.awt.*;

public class MapBoardPanel extends JPanel {

    private int totalNumberOfCells;
    private int currCellSprite;
    private int currPosition;
    private int cellSize;
    private int panelSizeX;
    private int panelSizeY;

    public MapBoardPanel(int cellsX, int cellsY, int cellsSize) {
        super();
        this.setLayout(new GridLayout());
        setCellSize(cellsSize);
        this.setSizeByCellSize(cellsX, cellsY);
        setTotalNumberOfCells(cellsX*cellsY);
    }

    public int fitCells() {
        return this.cellSize * this.getTotalNumberOfCells();
    }

    public int fitCells(int numberOfCells) {
        return this.cellSize * numberOfCells;
    }

    public void setSizeByCellSize(int cellsX, int cellsY) {
        setPanelSizeX(fitCells(cellsX));
        setPanelSizeY(fitCells(cellsY));
        this.setSize(this.panelSizeX, this.panelSizeY);
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

    public int getCellSize() {
        return cellSize;
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }

    public int getPanelSizeX() {
        return panelSizeX;
    }

    public void setPanelSizeX(int panelSizeX) {
        this.panelSizeX = panelSizeX;
    }

    public int getPanelSizeY() {
        return panelSizeY;
    }

    public void setPanelSizeY(int panelSizeY) {
        this.panelSizeY = panelSizeY;
    }
}
