package Java.practise;

public class Tutorial29 {
    public static void main(String[] args){

        Pizza pizza = new Pizza ();

        System.out.println("Here are the ingredients of your pizza:"  );
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }

}

class Pizza{

     String bread;
     String sauce;
     String cheese;
     String topping;

        Pizza () {

            this.bread = bread;
            this.sauce = sauce;
            this.cheese = cheese;
            this.topping = topping;

        }
        Pizza (String bread,String sauce, String cheese,String topping){

         this.bread = bread;
         this.sauce = sauce;
         this.cheese = cheese;
         this.topping = topping;


         }
}
