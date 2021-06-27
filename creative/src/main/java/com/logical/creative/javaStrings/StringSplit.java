package com.logical.creative.javaStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write your code here.
//        String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
//        System.out.println(splitString.length);
//        for (String string : splitString) {
//            System.out.println(string);
//        }
        if (!sc.hasNext()){
            System.out.println(0);
        }else {
            String input=sc.nextLine();
            String[]a = input.trim().split("[ !,?._'@]+");
            ArrayList<String> listOfStrings =new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());

            for(String str:listOfStrings){
                System.out.println(str);
            }
        }
        sc.close();
    }

}
