package firstjavaprjct;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		static boolean checkForPrime(int inputNumber)
		{
			boolean isltPrime=true;
			
			if(inputNumber <= 1)
			{
				isltPrime=false;
				
				return isltPrime;
			}
			else
			{
				for(int i=2;i<=inputNumber/2;i++)
				{
					if((inputNumber % i)==0)
					{
						isltPrime=false;
						
						break;
						
						}
					}
				return isltPrime;
				}
			}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int inputNumber=sc.nextInt();
			boolean isltPrime=checkForPrime(inputNumber);
			if(isltPrime)
			{
				System.out.println(inputNumber+"is a prime number");
			}else {
				System.out.println(inputNumber+"is not a prime number.");
			}
			sc.close();

	}

}
