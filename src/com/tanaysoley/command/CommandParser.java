package com.tanaysoley.command;

import com.tanaysoley.model.Cube;

/**
 * Created by tanay.soley on 31/12/17.
 */
public class CommandParser {
    private static CommandParser ourInstance = new CommandParser();

    public static CommandParser getInstance() {
        return ourInstance;
    }

    private CommandParser() {
    }

    //TODO execution and parsing should be done in different classes. Change that when you are in the mood
    public void executeCommand(String command, Cube cube) {
        String[] parts = command.split(" ");
        if (parts[0].equalsIgnoreCase("cube")) {
            if (parts[1].equalsIgnoreCase("o")) {
                if (parts[2].equalsIgnoreCase("cw") || parts[2].equalsIgnoreCase("clockwise")) {

                } else if (parts[2].equalsIgnoreCase("ccw") || parts[2].equalsIgnoreCase("counterclockwise")) {

                }
            } else if (parts[1].equalsIgnoreCase("|")) {

            } else if (parts[1].equalsIgnoreCase("-")) {

            }
        } else if (parts[0].equalsIgnoreCase("plane")) {
            int plane = Integer.parseInt(parts[2]);
            if (parts[1].equalsIgnoreCase("o")) {

            } else if (parts[1].equalsIgnoreCase("|")) {

            } else if (parts[1].equalsIgnoreCase("-")) {

            }
        }
    }
}
