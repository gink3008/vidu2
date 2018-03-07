package iMic1;

import java.util.Scanner;

public class baitap2 {
	
	public static void main(String [] args)
	{
		int so_km=50;
		Scanner sc = new Scanner(System.in);
		int sotien =0;
		sotien = sc.nextInt();
		if(so_km > 1)
		{
			if(so_km>30)
			{
				sotien= 5000 + (so_km - 30)*3000 + (so_km-1)*4000;
			}
			else
			{
				sotien = 5000 + (so_km-1)*3000;
			}
		}
		if(so_km == 1)
		{
			sotien = 5000;
		}
		else
		{
			do
			{
				sotien = sc.nextInt();
				
			}
			while(so_km<0);
		}
		System.out.print("so tien la:" + sotien);
}
}
