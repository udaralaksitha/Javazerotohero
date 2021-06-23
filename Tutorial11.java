package Java.practise;

import java.util.Scanner;

public class Tutorial11 {
    public static void main(String[] args) {
        /*logical operators = used to connect two or more expressions
          && = (AND) both conditions must be true
          || = (OR) either conditions must be true
          !  = (NOT) reverses boolean value of condition
         */

        int temp = 24;                                              //AND
        if (temp > 30) {
            System.out.println("It is hot inside");
        } else if (temp > 20 && temp < 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold inside");
        }

        Scanner scanner = new Scanner(System.in);                      //OR

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game!");
        }
        else {
            System.out.println("You are still playing the game!");
        }




    }

}