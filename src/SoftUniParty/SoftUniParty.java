package SoftUniParty;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();



        while(true){
            String line = scanner.nextLine();
            if("PARTY".equals(line)){
               break;
            }
           guests.add(line);


        }

        String line = scanner.nextLine();

        while(!"END".equals(line)){

            guests.remove(line);


            line = scanner.nextLine();
        }

        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }


    }
}
