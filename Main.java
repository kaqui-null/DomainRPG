import Graphics.*;
import TileTools.*;

public class Main {
    public static void main(String[] args) {

        MapBoardPanel testPanel = new MapBoardPanel(8,8,32);
        MainWindow mainWindow = new MainWindow("Main Window", testPanel);
        mainWindow.setVisible(true);

        System.out.println(mainWindow.getSize());
    }
}
