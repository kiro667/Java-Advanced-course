package TakeTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");


        Arrays.stream(input).map(Integer::parseInt).filter(x -> x >= 10 && x<=20)
        .distinct().limit(2).forEach(x -> System.out.print(x + " "));
        //stream don`t keep info i must print it instantly
        //foreach minave prez vseki edin element
        //tova limit 6te vzeme 1-te 2 elementa
        //filtriraneto ozna4ava da premahnem vsi4ki koito v uslovieto
        //vru6ta false




        }

}
