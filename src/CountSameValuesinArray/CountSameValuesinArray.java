package CountSameValuesinArray;

import java.util.*;

public class CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String[] arr = scanner.nextLine().split(" ");

        //tova e funkcionalniqt zapis da se pro4ete edin red
        //da se split-ne da se parse-ne i da se zapi6e v array
        //mapToDouble e kato select v C# (vsqko edno 4islo neka bude parse-nato kum double)

        Map<String,Integer> numbers = new HashMap<>();

        for (String num : arr) {
            if(!numbers.containsKey(num )){
                numbers.put(num ,0);//ako nqma takuv klu4 dobavqm klu4a
            }

            numbers.put(num ,numbers.get(num )+1);//ako imam stoinost
            // koqtp su6testvuva taka prebroqvam kolko puti q
            // ima tazi stoinost //a s 1-to kazvam koi e klu4a
            // numbers.get(num)+1 vzimam
            // starata stoinost na klu4a i dobavqm 1
            //
        }
        for (Map.Entry<String,Integer> entry : numbers.entrySet()) {
            System.out.printf("%s - %d times%n", entry.getKey(),entry.getValue());
        }


    }

}
