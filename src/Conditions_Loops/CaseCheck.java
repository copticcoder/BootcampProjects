package Conditions_Loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input letter: ");
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);

    //    For words:
    //    System.out.print("Input word: ");
    //    String word = input.next();
    //    if (word == word.toLowerCase()){
    //        System.out.print("All lowercase");
    //    }
    //    else{
    //        System.out.print("There is a conflict.");

    //  For Letters:
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

    }
}
