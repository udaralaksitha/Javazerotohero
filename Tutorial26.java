package Java.practise;

public class Tutorial26 {
    public static void main(String[] args){


  car myCar1 = new car();
  car myCar2 = new car();
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println(myCar1.year);

        System.out.println();

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.year);

       // myCar.drive();


    }
}


class car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "yellow";
    double price = 70000.00;

    void drive() {
        System.out.println("You drive the car");

    }
    void  brake(){
        System.out.println("You step on the brakes");
    }
}