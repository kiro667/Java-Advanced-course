

package Matrixshuffling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matrixshuffling {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = reader.readLine().split(" ");
        }
        String commands;
        while (true) {
            commands = reader.readLine();
            if (commands.equals("END")) {
                break;
            }
            String[] tokens = commands.split(" ");
            if (!tokens[0].equals("swap") || tokens.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }
            int row1 = Integer.parseInt(tokens[1]);
            int col1 = Integer.parseInt(tokens[2]);
            int row2 = Integer.parseInt(tokens[3]);
            int col2 = Integer.parseInt(tokens[4]);
            try {
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                print(matrix);
            } catch (IndexOutOfBoundsException iob) {
                System.out.println("Invalid input!");
            }
        }
    }
    public static void print(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}