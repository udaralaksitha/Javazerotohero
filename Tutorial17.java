package Java.practise;

import java.util.Locale;

public class Tutorial17 {
    public static void main(String[] args){
        //string = a reference data type that can store one or more characters
       //           reference data types here access to useful methods.

        String name = "Bro";

        //boolean result = name.equalsIgnoreCase("bro");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("o");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        String result = name.replace("o" ,"a");

        System.out.println(result);

    }
}
