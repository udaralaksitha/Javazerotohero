package Java.practise;

import java.util.Scanner;

public class Tutorial12 {
    public static void main(String[] args) {
        //while  loop = executes a block of code as long as a if condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.println("Enter your name! ");
            name = scanner.nextLine();

        }
        System.out.println("Hello "+name);
    }
}
