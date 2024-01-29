package btvn_caulenhlap;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author nhvd2
 */
public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập vào số đầu tiên: ");
        int min = scanner.nextInt();

        System.out.print("Nhập vào số thứ hai: ");
        int max = scanner.nextInt();

        int randomNumber = (int)(Math.random()*(max - min + 1) + min);
        int dem = 0;

        while (dem < 3) {
            System.out.print("Nhập vào dự đoán của bạn: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Tăng lên");
            } else if (guess > randomNumber) {
                System.out.println("Giảm xuống");
            } else {
                System.out.println("Bạn đã thắng");
                return;
            }

            dem++;
        }

        System.out.println("Bạn đã thua");
    }
}
