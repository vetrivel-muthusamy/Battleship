import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long seconds = scanner.nextInt();
        System.out.println(LocalTime.ofSecondOfDay(seconds));
    }
}