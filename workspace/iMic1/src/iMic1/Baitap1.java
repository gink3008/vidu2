package iMic1;

public class Baitap1 {
	public static void main(String [] args)
	{
		int a=1;
		int b=2;
		int c=3;
		if((a+b)>c && (b+c)>a && (c+a)>b)
		{
			System.out.print("day la tam giac");
			
			float p =(float) (a+b+c);
			float dt = (float)(( p/2)*(p/2-a)*(p/2-b)*(p/2-c));
			System.out.print("chu vi tam giac");
			System.out.print("");
			
		}
	}
}
