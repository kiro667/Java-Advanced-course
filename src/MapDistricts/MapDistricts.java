package MapDistricts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDistricts {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<Integer>> cities = new HashMap<>();
//durji imeto na grada i naselenieto na vsi4kite raioni
        String[] input = reader.readLine().split(" ");
        int populationBound = Integer.parseInt(reader.readLine());
//6te mahne vsi4ki gradove koito imat suma na jivu6ti hora po-malka ot tazi granica
        addCitiesToMap(cities, input);
//vzimame cities puskame edin stream po entrySet() (toest po KeyValuePair())
//za za vseki edin KeyValuePair puskame toq stream i po4vame da filtrirame
//vzimame tazi dvoika klu4 stoinost na dvoikata vzimame stoinostta i q stream-vam
//tazi stoinost q sumiram za da moga da mahna tezi ot tqh koito imat po-malka suma
//na jivu6tite hora ot tazi koqto ni e dadena na vhoda sled tova sortiram re4nika
//
        cities.entrySet().stream().filter(kv ->
                kv.getValue().stream().reduce((x, y) -> x + y).get() > populationBound)
                .sorted((kv1, kv2) -> {
                    int kv1Sum = kv1.getValue().stream().reduce((x, y) -> x + y).get();
                    //za vseki edin grad puskame stream koito da sumira vsi4ki hora
                    int kv2Sum = kv2.getValue().stream().reduce((x, y) -> x + y).get();
  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//taka vseki edin put se vurtqt kv1Sum i kv2Sum
                    return Integer.compare(kv2Sum, kv1Sum);//i sled tova da gi sravni
                   // za da gi podredim v obraten red podavame purvo 1-vo 2-qt argument
                    //i sled tova 1-qt
                }).forEach(kv -> {
            System.out.print(kv.getKey() + ": ");
            kv.getValue().stream().sorted((x,y) -> Integer.compare(y,x))
            .limit(5).forEach(p -> System.out.print(p + " "));
            System.out.println();
            //pe4atame imeto na toq grad sled tova puskame stream po negovite
            //district population sortirame gi v obraten red ograni4avame gi do 5 broq
            //i gi dope4atvame na su6tiq red na koito sme otpe4atali vuprosnoto
            //ima na grada i sled tova trqbva da mina na sledva6tiq red



        });

        System.out.println();

    }
    //tozi metod parse-va vhoda i dobavq vsi4ki
    //gradove
    private static void addCitiesToMap(Map<String, List<Integer>> cities, String[] input) {
        for (String city : input) {
            String[] cityArgs = city.split(":");
            String cityName = cityArgs[0];
            int cityDistrict = Integer.parseInt(cityArgs[1]);

            if(!cities.containsKey(cityName)){
                cities.put(cityName,new ArrayList<>());
            }

            cities.get(cityName).add(cityDistrict);
        }
    }

}
