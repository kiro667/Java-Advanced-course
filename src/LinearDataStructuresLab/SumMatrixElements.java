package LinearDataStructuresLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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


        int sum = 0;
        for (int[] row : matrix) {//1-qt foreach e za redovete tipa
            // danni e
            //masiv toest vseki edin red prestavlqva po edin masiv
            for (int col : row) {//i tozi masiv su6to moje da bude
                // obhoden s foreach kato ve4e dostupvame vsqka edna
                // stoinost ot tozi edin masiv sumirame q i nakraq q pe4atame


                sum += col;
            }
        }

        System.out.println(matrix.length);//dava ni broikata na redovete
        System.out.println(matrix[0].length);//tova ni dava duljinata na
        //nuleviq red no tui kato vsi4ki redove imat edna i su6ta duljina
        System.out.println(sum);

    }
}
