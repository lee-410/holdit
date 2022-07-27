import java.util.Scanner;

public class Helloworld2 { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1>0 && num2<10) {
			System.out.println(num1+num2);
		}else {
			System.out.println("input number must be 0 to 10");
		}
	}
}
