package decorator;

import decorator.Player;

import decorator.GearAdder;

import decorator.FileReader;

/** Adds the shield ASCII art to a player. */
public class Shield extends GearAdder {
    /** @param player the player receiving a shield */
    public Shield(Player player) {
        super(player, FileReader.getLines("decorator/txt/shield.txt"));
    }
}
