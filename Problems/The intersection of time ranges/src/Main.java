import java.io.ByteArrayOutputStream;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<LocalTime> firstRange = new ArrayList<>(List.of(
                LocalTime.parse(scanner.next()),
                LocalTime.parse(scanner.next())));
        List<LocalTime> secondRange = new ArrayList<>(List.of(
                LocalTime.parse(scanner.next()),
                LocalTime.parse(scanner.next())));

        System.out.println(firstRange.get(1).isAfter(secondRange.get(0))
                && secondRange.get(1).isAfter(firstRange.get(0))
                || firstRange.get(0).equals(secondRange.get(1))
                || firstRange.get(1).equals(secondRange.get(0)));

        int[] message = new int[] {114, 101, 97, 100, 32, 97, 98, 111, 117, 116, 32, 65, 83, 67, 73, 73};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int code : message) {
            outputStream.write(code);
        }

        System.out.println(outputStream.toString());
    }
}