package firstjavaprjct;

import java.util.Scanner;

public class GreatestCD {

	public static void main(String[] args) {
		int a,b,gcd=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter No.1");
		a=sc.nextInt();
		System.out.println("Enter No.2");
		b=sc.nextInt();
		hcd=findGCD("GCD of"+a+"and"+b+"="+gcd);
	}
	public static int findGCD(int a,int b)
	{
		while(b!=0)
		{
			if(a>b)
			{
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}

}
