package UpperStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //ako 6te promenqme element kakto v slu4aq zna4i 6te go map-vame

  Arrays.stream(reader.readLine().split("\\s+")).
          filter(x -> x.length()>0).map(String::toUpperCase)
  .forEach(x -> System.out.print(x + " "));//filter(x -> x.length()>0)
        //toest ako uslovieto vuv filter e izpulneno






    }

}
