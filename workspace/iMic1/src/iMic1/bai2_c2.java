package iMic1;

import java.util.Scanner;

public class bai2_c2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sokm = sc.nextInt();
		int sotien=0;
		do
		{
					System.out.println("nhap lai so km");
					sokm = sc.nextInt();
		}while(sokm <=0);	
		if(sokm==1)
		{
			sotien = 5000;
		}
		if(sokm > 31)
		{
			sotien = 5000 + (sokm - 31)*3000 + (sokm-1) *4000;
		}
		else
		{
			sotien = 5000+ 4000*(sokm-1);
		}
	}
}
