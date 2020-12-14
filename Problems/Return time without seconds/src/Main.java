import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalTime localTime = LocalTime.parse(scanner.nextLine());
        System.out.println(localTime.minusSeconds(localTime.getSecond()));
    }
}