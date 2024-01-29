package btapvn;
import java.util.Scanner;
/**
 *
 * @author nhvd2
 */
public class Bt3 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bất kì:");
        n= scanner.nextInt();
        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println(n);
        }
    }
}
