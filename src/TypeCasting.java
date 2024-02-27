import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        System.out.println(num);

        //Type Casting
        int number = (int) (70.32f);
        System.out.println(number);

        //Automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a); // 257 % 256 = 1
        System.out.println(b);

        //Ex2

        byte a1 = 40;
        byte b2 = 50;
        byte c3 = 100;
        int d3 = a1 * b2 / c3;
        System.out.println(d3);
    }
}
