package com.tanaysoley.display;

import com.tanaysoley.model.Cube;

/**
 * Created by tanay.soley on 31/12/17.
 */
public class CliDisplay {
    public void displayCube(Cube cube) {
        int size = cube.getSize();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < size; j++) {
                System.out.print(cube.getPlane(0).getXY(j, i));
            }
            System.out.println("");
        }

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(cube.getPlane(k + 1).getXY(j, i));
                }
            }
            System.out.println("");
        }

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < size; j++) {
                    System.out.print(cube.getPlane(4 + k).getXY(j, i));
                }
                System.out.println("");
            }
        }
    }
}
