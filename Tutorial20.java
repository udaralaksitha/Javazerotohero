package Java.practise;

import java.util.ArrayList;

public class Tutorial20 {
    public static void main(String[] args){

        //2D Arraylist = a dynamic list of lists
        //You can change the size of these lists during runtime

        ArrayList<ArrayList<String>>grocerylist = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("pasta");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");

        ArrayList<String> producelist = new ArrayList<>();
        producelist.add("tomatoes");
        producelist.add("onion");
        producelist.add("peppers");


        ArrayList<String> drinklist = new ArrayList<>();
        drinklist.add("soda");
        drinklist.add("cock");

        grocerylist.add(bakerylist);
        grocerylist.add(producelist);
        grocerylist.add(drinklist);


        System.out.println(grocerylist.get(1).get(2));
    }
}
