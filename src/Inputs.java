import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is: " + rollno);

        Scanner inputname = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = inputname.next();
        System.out.println("Your name is: " + name);
    }
}
