package Java.practise;

import java.util.ArrayList;

public class Tutorial19 {
    public static void main(String[] args){
        //Arraylist = a resizable array ,
        //            Elements can be added and removed after compilation phase
        //            Store reference data types

        ArrayList<String>food = new ArrayList<String>();

        food.add("pizza");
        food.add("hotdog");
        food.add("kottu");

        food.set(0,"udz");
        food.remove(2);
        food.clear();
         for(int i=0; i<food.size(); i++){
             System.out.println(food.get(i));
         }
    }
}
