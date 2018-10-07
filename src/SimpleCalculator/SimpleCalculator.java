package SimpleCalculator;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Metoda za dobavqne nai-otgore stack.push(element);
        //stack.pop();
        //kogato imame pop tova ni vru6ta nai-gorniq
        //element koito sme slojili i go zapisvame v nqkakva promenliva
        //sled kato sme go pop-nali nie go vzimame i go iztrivame ot
        //ot strukturata
        //stack.peek();
        //kogato imame peek nie go vzimame no ne go iztrivame edin vid
        // proverqvame kakvo imame tam i si go vru6tame


        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<String>();

        Collections.addAll(stack,input);//taka se dobavq v stack

        while(stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            if(op.equals("+")){
                stack.push(firstNum + secondNum + "");
            }else{
                stack.push(firstNum - secondNum + "");
            }
        }

        System.out.println(stack.pop());

    }
}
