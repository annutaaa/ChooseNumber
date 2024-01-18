import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int RandomNumber = random.nextInt(10);
        for (int i = 0; i < 4; i++) {

            System.out.println("Please enter number in zone 0 - 10");
            int Number = scanner.nextInt();
            if (Number == RandomNumber) {
                System.out.println("Вы угадали число!!!");
            } else {
                System.out.println("Попробуй снова:)");
            }

        }
    }
}




