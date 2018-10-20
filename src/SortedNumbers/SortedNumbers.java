package SortedNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new  BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().
                split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        //kazvame Arrays.stream za6toto vru6ta array

        numbers.removeIf(e -> e%2 != 0);

        System.out.println(numbers.toString().replaceAll("[\\[\\]]",""));
        //tezi skobi [] gi slagam za6toto taka raboti regex-sa
        //i posle tezi skobi gi zamestvam s prazen String
        //V java String.join raboti samo sus Sring-gove

        numbers.sort((a, b) -> a.compareTo(b));

        StringBuilder result = new StringBuilder();
        numbers.forEach(num -> {
            result.append(num).append(", ");
        });

        System.out.println(result.toString().substring(0,result.toString().
                lastIndexOf(",")));

        //   System.out.println(numbers.toString().replaceAll("[\\[\\]]",""));
//e.g ako imame 5 6 7 8 9 //vzima 1-te 2 elementa i te sa kato argumentite a i b
//i kazva sravni 5 s 6 (a s b)//compareTo vru6ta <, = ili > raboti taka a-b v
//slu4aq dava -1 suotvetno nqma da razmeni poziciite na 2-te 4isla za6toto te sa
//v pravilen red no ako imame 8 7 compareTo vru6ta 1 zna4i trqbva da
// im razmenim mestata taka raboti compareTo




    }

}
