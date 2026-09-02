/*
Author: Ryan Callahan
*/

package decorator;

import decorator.Player;

import decorator.FileReader;

/** The undecorated player shown when the game begins. */
public class Warrior extends Player {
    /**
     * Creates a warrior using the base ASCII art from warrior.txt.
     *
     * @param name the warrior's name
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
}
