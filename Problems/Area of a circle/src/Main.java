import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double r = scanner.nextDouble();
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}