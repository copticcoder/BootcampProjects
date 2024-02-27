import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String pal) {
        String rev = "";
        boolean answer = false;

        for (int i = pal.length()-1; i>=0; i--) {
            rev = rev + pal.charAt(i);
        }
        if (rev.equals(pal)) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String pal = input.next();
        pal = pal.toLowerCase();
        boolean A = isPalindrome(pal);
        System.out.println(A);
    }
}
