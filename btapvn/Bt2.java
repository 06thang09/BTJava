package btapvn;
import java.util.Scanner;
/**
 *
 * @author nhvd2
 */
public class Bt2 {
    public static void main(String[] args) {
	int a;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Diem: ");
	a = scanner.nextInt();
	if (a>8) {
		System.out.println("Gioi");
	}else if(a>6.5) {
		System.out.println("Kha");
	}else if (a>5){
		System.out.println("Trung Binh");
	}else {
		System.out.println("Yeu");
	}
}
}
