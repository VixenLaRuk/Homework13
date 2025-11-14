import java.util.ArrayList;
import java.util.List;
/**
 * This program creates Tile objects for a given name (VIXEN),
 * displays the tiles, and calculates the total point value based on the Scrabble game.
 * @author Vixen La Ruk
 * @since 11/11/2025
 */
public class App {
    
    /**
     * The main entry point of the application.
     * Creates Tile objects for the letters in "VIXEN" with point values,
     * prints the set of letters, and the total score.
     * @param args command-line arguments (not used)
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Create Tile objects for the letters of "VIXEN" with Scrabble values
        System.out.println("Hello, Scrabble!");
        Tile V = new Tile('V',4);
        Tile I = new Tile('I',1);
        Tile X = new Tile('X',8);
        Tile E = new Tile('E',1);
        Tile N = new Tile('N',1);

        //Store tiles in a list for easy iteration
        List<Tile> tiles = new ArrayList<>();
        tiles.add(V);
        tiles.add(I);
        tiles.add(X);
        tiles.add(E);
        tiles.add(N);

        //Display the tiles
        System.out.print("Tiles: ");
        for (Tile tile : tiles) {
            System.out.print(tile.getLetter());
        }
        System.out.println();

        // Calculate and display the total value
        int totalValue = 0;
        for (Tile tile : tiles) {
            totalValue += tile.getValue();
        }
        System.out.println("Total value: " + totalValue);
    }
}