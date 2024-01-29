package btvn_caulenhlap;
import java.util.Scanner;
/**
 *
 * @author nhvd2
 */
public class Bt1 {
    public static long giaithua(int n){
        if(n>0){
            return n+giaithua(n-1);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào một số bất kì:");
        n=scanner.nextInt();
        System.out.println("Giai thừa của " +n+ " là: "+Bt1.giaithua(n));
    }
}
