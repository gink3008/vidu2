package iMic1;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float tigia_USA_to_VND;
		System.out.println("nhap ti gia USA to VND");
		tigia_USA_to_VND = sc.nextFloat();
		float tigia_VND_to_USA;
		System.out.println("Nhapti gia VND to USA");
		tigia_VND_to_USA = sc.nextFloat();
		
		int a;
		do
		{
			System.out.println("ban muon doi ti gia tu USA to VND hay VND to USA");
			System.out.println("nhap gia tri cua a");
			System.out.println(" neu a = 0 doi ti gia USD to VND");
			System.out.println(" neu a = 1 doi ti gia VND to USA");
			a = sc.nextInt();
			if(a == 0)
			{
				int sotien_VND;
				do
				{
					sotien_VND = sc.nextInt();
					if(sotien_VND<0)
						System.out.println("so tien nho hon hoac bang 0 nhap lai" + sotien_VND*tigia_USA_to_VND);
				}while(sotien_VND <= 0);
			}
			if ( a== 1)
			{
				int sotien_USA;
				do
				{
					sotien_USA = sc.nextInt();
					if(sotien_USA<0)
						System.out.println("so tien nho hon hoac bang 0 nhap lai" + sotien_USA*tigia_VND_to_USA);
				}while(sotien_USA <= 0);
			}
				
			
		}while(a !=0 || a!= 1);
	}
}
