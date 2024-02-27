import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        if (n == 0){
            b = 0;
        }
        for (int i=2; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
//            System.out.println(b);
        }System.out.println(b);
    }
}
