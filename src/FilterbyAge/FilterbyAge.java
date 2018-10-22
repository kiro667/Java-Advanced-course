package FilterbyAge;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterbyAge {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> people = new LinkedHashMap<>();

        int count = Integer.parseInt(reader.readLine());

        while (count-- > 0) {
            String[] input = reader.readLine().split(", ");
            people.putIfAbsent(input[0], Integer.parseInt(input[1]));
        }
        String condition = reader.readLine();//young,older
        int ageCondition = Integer.parseInt(reader.readLine());
        String format = reader.readLine();






    }
 }
