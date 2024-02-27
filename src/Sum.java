import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int FirstNumber = input.nextInt();
        System.out.print("Input second number: ");
        int SecondNumber = input.nextInt();

        int Sum = FirstNumber + SecondNumber;
        System.out.print("Result: " + Sum);


    }
}
