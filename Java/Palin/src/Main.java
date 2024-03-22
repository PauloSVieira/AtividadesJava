import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = 0;
        System.out.println("Escreva seu polindrome:");
        inputs = scanner.nextInt();
        if (isPalindrome(inputs)){
            System.out.println("E um palindrome");
        }else{
            System.out.println("Nao e um palindrome");
        }
    }
}
