import java.util.Scanner;

public class Main {
    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = 0;
        System.out.println("Escreva seu numero:");
        inputs = scanner.nextInt();
        System.out.println("Input: " + inputs + ", Output: " + addDigits(inputs));
    }
}
