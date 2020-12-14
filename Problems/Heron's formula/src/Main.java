import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int l1 = scan.nextInt();
        int l2 = scan.nextInt();
        int l3 = scan.nextInt();

        double s = ((double)l1 + l2 + l3) / 2;
        double area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));

        System.out.println(area);
    }
}