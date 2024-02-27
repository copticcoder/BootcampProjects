package Conditions_Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st num: ");
        int first = input.nextInt();
        System.out.print("Input 2nd num: ");
        int second = input.nextInt();
        System.out.print("Input 3rd num: ");
        int third = input.nextInt();

        int max = first;
        if (second > max){
            max = second;
        }
        if (third > max){
            max = third;
        }
    System.out.println(max);
    }
}
