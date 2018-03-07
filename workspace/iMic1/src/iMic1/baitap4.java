package iMic1;
import java.util.Scanner;

public class baitap4 {
	public static void main(String[] args) {
		int a,b,max ;
		Scanner sc = new Scanner(System.in);
		System.out.print("A:");
		a = sc.nextInt();
		System.out.print("B:");
		b = sc.nextInt();
		if(a>b)
		{
			max = a;
		}
		else
			max = b;
		System.out.print("gia tri lon nhat trong 2 so" + max );
	}
}
