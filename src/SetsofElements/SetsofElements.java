package SetsofElements;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lengths = scanner.nextLine().split("\\s+");
        int firstLength = Integer.parseInt(lengths[0]);
        int secondLength = Integer.parseInt(lengths[1]);

        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();
        
        fillSet(scanner,firstLength,firstSet);
        fillSet(scanner,secondLength,secondSet);

        String result = "";
        for (String element : firstSet) {

            if(secondSet.contains(element)){
             result += element + " ";
            }
        }
        if(!"".equals(result)){
            System.out.println(result.trim());
        }

        //za6toto za6toto kato do-
        //bavqm prazno mqsto dobavqm i dobavqm 6te stigna do posledniq
        //element v koito pak 6te imam prazno mqsto i 6te izgurmi
        // zada4ata zatova ne6to 4e sum ostavil prazno mqsto tam



        

    }
    private static void fillSet(Scanner scanner, int length,Set<String> set){
        for (int i = 0; i < length; i++) {
            set.add(scanner.nextLine());
        }
        
    }
    
    
    
}
