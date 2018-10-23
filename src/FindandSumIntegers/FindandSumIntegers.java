package FindandSumIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class FindandSumIntegers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

            Optional<Integer> num = Arrays.stream(reader.readLine().split(" "))
             .filter(x -> !x.isEmpty())
            .filter(x -> {
                try{
                    Integer.parseInt(x);
                    return true;
                }catch (Exception e){
                    return false;
                }


            }).map(Integer::parseInt).reduce((x,y) -> x+y);//kogato
        //mi go pod4ertava s 4erveno kato zadurja na nego mi pokazva
        //4e vru6ta Optional ot tip Integer i promenqm gore tipa

            if(num.isPresent()){
                System.out.println(num.get());
            }
            else{
                System.out.println("No match");
            }


    }

}
