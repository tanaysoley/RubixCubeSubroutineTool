package com.tanaysoley;

import com.tanaysoley.display.CliDisplay;
import com.tanaysoley.model.Cube;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("tempInput"));
        CliDisplay cliDisplay = new CliDisplay();
        int size = 0;

        try {
            size = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Input should have the first line as an integer equal to the size of the cube");
            System.exit(1);
        }

        String inputString = "";
        try {
            for (int i = 0; i < size * 4; i++) {
                inputString += "\n";
                inputString += a;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        Cube cube = new Cube(size, inputString);
        cliDisplay.displayCube(cube);

        String a;
        try {
            while ((a = br.readLine()) != null) {
                parseCommand(a, );
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
