package TileTools;

import Graphics.Cell;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TileMapConverter{

    private String tileTxt;

    public TileMapConverter(String tileSetLocation) {
        try {
            tileTxt = new String(Files.readAllBytes(Paths.get(tileSetLocation)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Cell read(int i){
        char currCode = this.tileTxt.charAt(i);
        return switch (currCode) {
            case 'B' -> new Cell("black");
            case 'W' -> new Cell("white");
            default -> new Cell();
        };
    }


}
