package decorator;

import java.util.ArrayList;

/** Base decorator that adds one ASCII-art gear layer to a player. */
public abstract class GearAdder extends Player {

    /**
     * Copies a player's drawing and overlays a gear drawing line by line.
     *
     * @param player the player being decorated
     * @param gear the lines that draw the gear
     */
    protected GearAdder(Player player, ArrayList<String> gear) {
        super(addGear(player.character, gear), player.getName());
    }

    /**
     * Overlays the gear artwork on the current player artwork.
     * A non-space character from the gear replaces the character beneath it.
     *
     * @param character the current player drawing
     * @param gear the new gear drawing
     * @return the combined drawing
     */
    protected static ArrayList<String> addGear(ArrayList<String> character,
                                                ArrayList<String> gear) {
        ArrayList<String> combined = new ArrayList<String>();
        int numberOfLines = Math.max(character.size(), gear.size());

        for (int i = 0; i < numberOfLines; i++) {
            String characterLine = i < character.size() ? character.get(i) : "";
            String gearLine = i < gear.size() ? gear.get(i) : "";

            int lineLength = Math.max(characterLine.length(), gearLine.length());
            StringBuilder newLine = new StringBuilder();

            for (int j = 0; j < lineLength; j++) {
                char characterChar = j < characterLine.length()
                        ? characterLine.charAt(j) : ' ';

                char gearChar = j < gearLine.length()
                        ? gearLine.charAt(j) : ' ';

                if (gearChar != ' ') {
                    newLine.append(gearChar);
                } else {
                    newLine.append(characterChar);
                }
            }

            combined.add(newLine.toString());
        }

        return combined;
    }
}