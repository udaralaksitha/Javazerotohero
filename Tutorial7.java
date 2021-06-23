package Java.practise;

import java.util.Scanner;

public class Tutorial7 {
    public static void main(String[] args){

        double x = 3.78;
        double y = -9;

        double z = Math.max(x,y);
        /*min
          round
          sqrt
          abs
         */

        System.out.println(z);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a : ");
        a = scanner.nextDouble();
        System.out.println("Enter side b : ");
        b = scanner.nextDouble();

        c = Math.sqrt((x*x) + (y*y));

        System.out.println("The hypotenuse is : "+c);

        scanner.close();


    }
}
