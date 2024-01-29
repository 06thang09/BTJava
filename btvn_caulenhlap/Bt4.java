package btvn_caulenhlap;
import java.util.Scanner;
/**
 *
 * @author nhvd2
 */
public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi: ");
        double principal = scanner.nextDouble();

        System.out.print("Nhập lãi suất hàng tháng (dưới dạng phần trăm): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Nhập số tháng gửi: ");
        
        int months = scanner.nextInt();

        double totalAmount = principal * Math.pow(1 + interestRate, months);

        double interest = totalAmount - principal;

        System.out.println("Số tiền lãi sau " + months + " tháng: " + interest);
        System.out.println("Tổng số tiền sau " + months + " tháng: " + totalAmount);
    }
}
