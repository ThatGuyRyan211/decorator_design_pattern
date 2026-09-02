/*
Author: Ryan Callahan
*/
package decorator;

/** Adds the armor ASCII art to a player. */
public class Armor extends GearAdder {
    /** @param player the player receiving armor */
    public Armor(Player player) {
        super(player, FileReader.getLines("decorator/txt/armor.txt"));
    }
}
