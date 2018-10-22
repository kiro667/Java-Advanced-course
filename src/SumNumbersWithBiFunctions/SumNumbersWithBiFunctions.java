package SumNumbersWithBiFunctions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class SumNumbersWithBiFunctions {
    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        operations(20,x -> x*2);//tuk davam funkciq a dolu v metoda priemam



    }
public static void operations(int number,Function<Integer,Integer> func){
    System.out.println(func.apply(number));


}
}
