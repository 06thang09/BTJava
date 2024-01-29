package btvn_caulenhlap;
import java.util.Scanner;
/**
 *
 * @author nhvd2
 */
public class Bt2 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
