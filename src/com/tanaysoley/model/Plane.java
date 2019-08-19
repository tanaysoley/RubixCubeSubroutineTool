package com.tanaysoley.model;

/**
 * Created by tanay.soley on 31/12/17.
 */
public class Plane {
    private char[][] array;
    private int size;

    public Plane(int size, String arrayString) {
        this.size = size;
        array = new char[size][size];
        int x = 0, y = 0;
        for (int i = 0; i < arrayString.length(); i++) {
            if (Character.isWhitespace(arrayString.charAt(i))) {
                continue;
            }

            array[y][x] = arrayString.charAt(i);
            x++;
            if (x >= size) {
                x = 0;
                y++;
                if (y >= size) {
                    //TODO print message about ignoring extra characters
                    break;
                }
            }
        }
    }

    public char getXY(int x, int y) {
        return array[y][x];
    }

    public void setXY(int x, int y, char c) {
        array[y][x] = c;
    }

    public void rotate(boolean clockWise) {
        //TODO write rotation code
    }

    public void flip(boolean horizontally) {
        //TODO write flip code
    }
}
