package Conditions_Loops;

import java.util.Scanner;

public class ForLoops {
    // Q: Print numbers from 1 to 5
    public static void main(String[] args) {
//        for(int i =1; i<=5; i++){
//            System.out.println(i);
//        }
    Scanner input = new Scanner(System.in);
    System.out.print("Input n: ");
    int n = input.nextInt();
        for(int i =1; i<=n; i++){
            System.out.println(i);
        }

    }
}
