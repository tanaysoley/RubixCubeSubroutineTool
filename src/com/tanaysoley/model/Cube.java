package com.tanaysoley.model;

import com.sun.deploy.util.StringUtils;

/**
 * Created by tanay.soley on 31/12/17.
 */
public class Cube {
    private Plane[] planes;
    private int size;

    public Cube(int size, String arrayString) {
        this.size = size;
        planes = new Plane[6];
        String[] lines = StringUtils.splitString(arrayString, "\n");
        //read first n lines
        String plane0String = "";
        for (int i = 0; i < size; i++) {
            plane0String += lines[i];
        }
        planes[0] = new Plane(size, plane0String);

        //read next n lines
        String[] plane123String = new String[3];
        for (int i = 0; i < 3; i++) {
            plane123String[i] = "";
        }
        for (int i = size; i < 2 * size; i++) {
            for (int j = 0; j < 3 * size; j++) {
                plane123String[j / size] += lines[i].charAt(j);
            }
        }

        for (int i = 1; i <= 3; i++) {
            planes[i] = new Plane(size, plane123String[i - 1]);
        }

        //read next 2n lines
        for (int k = 0; k < 2; k++) {
            String plane45String = "";
            for (int i = (2 + k) * size; i < (3 + k) * size; i++) {
                plane45String += lines[i];
            }
            planes[4 + k] = new Plane(size, plane45String);
        }
    }

    public Plane getPlane(int i) {
        return planes[i];
    }

    public int getSize() {
        return size;
    }


}
