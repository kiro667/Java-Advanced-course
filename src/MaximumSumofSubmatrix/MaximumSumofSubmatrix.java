package MaximumSumofSubmatrix;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaximumSumofSubmatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = fillMatrix(scanner);

        int bestSum = Integer.MIN_VALUE;

        int rowIndex = 0;
        int colIndex = 0;

        for (int row = 0; row <matrix.length-1 ; row++) {//-1 za6toto
//ako doidem na posledniq red ne mojem da vzemem sledva6tiq //toest do
//predposledniq red za6toto na predposledniq 6te vzemem stoinostta na posledniq
            for (int col = 0; col <matrix[row].length-1 ; col++) {//su6toto
                // i za kolonite ako doidem na poslednata ne moje da vzeme
                //pove4e

                int sum = matrix[row][col] + matrix[row][col+1] +
                        matrix[row+1][col] + matrix[row+1][col+1];

                if(sum>bestSum){
                    bestSum = sum;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

        for (int i = rowIndex; i < rowIndex+2; i++) {
            for (int j = colIndex; j < colIndex+2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);

    }

    private static int[][] fillMatrix(Scanner scanner) {

        List<String> dimensions = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int rows = Integer.parseInt(dimensions.get(0));//pri List-ta
        // elementite se dostupvat s get

        int cols = Integer.parseInt(dimensions.get(1));

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            //4eta si redovete//obikalqme po redove
            String[] values = scanner.nextLine().split(", ");
            //za vseki edin red 4etem ot konzolata kakvi stoinosti trqbva
            //da mu slojim
            for (int col = 0; col < matrix[row].length; col++) {//i taka
                //vzimame za nastoqtiq red kolko elementa ima
                //i puskame za vsqka edna kolona da se parsne po edno 4islo
                matrix[row][col] = Integer.parseInt(values[col]);
                //za vsqka edna kolona na tosi red nie insert-vame po
                //edna stoinost



            }
        }

        return matrix;

    }

}
