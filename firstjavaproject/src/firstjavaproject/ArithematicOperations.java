package firstjavaproject;

import java.util.Scanner;

public class ArithematicOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='y';
		int choice;
		while(ch == 'y'){
			System.out.println("Enter the choice");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			choice=sc.nextInt();
			System.out.println("Enter value one");
			int value1=sc.nextInt();
			System.out.println("Enter value two");
			int value2=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Addition="+(value1 + value2));
				break;
			case 2:
				System.out.println("Substraction="+(value1 - value2));
				break;
			case 3:
				System.out.println("Multiplication="+(value1 * value2));
				break;
			case 4:
				System.out.println("Division="+(value1 / value2));
				break;
			}
			System.out.println("Enter ch value to continue y-yes n-no");
			ch = sc.next().charAt(0);
		}
				

	}

}
