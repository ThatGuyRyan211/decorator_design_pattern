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

    /** Combines matching lines so all gear stays visible on the same drawing. */
    protected static ArrayList<String> addGear(ArrayList<String> character,
                                                ArrayList<String> gear) {
        ArrayList<String> combined = new ArrayList<String>();
        int longestDrawing = Math.max(character.size(), gear.size());

        for (int i = 0; i < longestDrawing; i++) {
            String characterLine = i < character.size() ? character.get(i) : "";
            String gearLine = i < gear.size() ? gear.get(i) : "";
            combined.add(gearLine + characterLine);
        }
        return combined;
    }
}
