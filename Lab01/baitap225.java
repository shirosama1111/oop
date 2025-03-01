import java.util.Scanner;
public class baitap225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        System.out.println("answers:");
        System.out.println("tong: " + tong);
        System.out.println("hieu: " + hieu);
        System.out.println("tich: " + tich);
        if (b != 0) {
            double thuong = a / b;
            System.out.println("thuong: " + thuong);
        } else {
            System.out.println("ko chia cho 0");
        }
        scanner.close();
    }
}