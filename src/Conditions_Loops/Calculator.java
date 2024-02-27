package Conditions_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press X or x.
        int ans = 0;
        while (true){
        System.out.print("Enter Operator: ");
        char op = input.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                        ans = num1 / num2;
                    }
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            System.out.println("Answer: " + ans);
            } else if (op == 'X' || op == 'x'){
                break;
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }
}

