package decorator;

import decorator.Player;

import decorator.GearAdder;

import decorator.FileReader;

/** Adds the sword ASCII art to a player. */
public class Sword extends GearAdder {
    /** @param player the player receiving a sword */
    public Sword(Player player) {
        super(player, FileReader.getLines("decorator/txt/sword.txt"));
    }
}
