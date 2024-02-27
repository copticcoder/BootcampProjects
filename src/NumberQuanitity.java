import java.util.Scanner;

public class NumberQuanitity {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = input.nextInt();

        int n = 22231;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 2){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
