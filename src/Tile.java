import java.util.Objects;

/**
 * This is a class for Scrabble tiles. Each tile has a letter and a point value.
 * @author Vixen La Ruk
 * @since 11/11/2025
 */
public class Tile {
    private char letter;
    private int value;

    /**
     * Creates a new tile with a letter and value.
     * @param letter the letter on the tile
     * @param value the points for the tile
     */
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    /**
     * Changes the letter of the tile.
     * @param letter the new letter
     */
    public void setLetter(char letter) {
        this.letter = letter;

    }

    /**
     * Changes the point value of the tile.
     * @param value the new value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the letter of the tile.
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Gets the point value of the tile.
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * Checks if this tile the same as another object.
     * Tiles are the same if they have the same letter and value.
     * @param obj the object to check
     * @return true if they are the same, false if not
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tile tile = (Tile) obj;
        return letter == tile.letter && value == tile.value;
    }

    /**
     * Shows the tile as a string, like "V (value = 4)".
     * @return the string for the tile
     */
    public String toString() {
        return String.format("%c  (value = %d)", letter, value);
    }
}