/*
Author: Ryan Callahan
*/

package decorator;

import java.util.ArrayList;

/** Represents a player as a name and a line-by-line ASCII-art character. */
public abstract class Player {
    protected ArrayList<String> character;
    protected String name;

    /**
     * Creates a player.
     *
     * @param character the lines that draw the player
     * @param name the player's display name
     */
    public Player(ArrayList<String> character, String name) {
        this.character = new ArrayList<String>(character);
        this.name = name;
    }

    /** @return the player's name */
    public String getName() {
        return name;
    }

    /** @return the player's name followed by their ASCII-art character */
    @Override
    public String toString() {
        StringBuilder drawing = new StringBuilder(name).append("\n");
        for (String line : character) {
            drawing.append(line).append("\n");
        }
        return drawing.toString();
    }
}
