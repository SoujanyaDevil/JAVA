package JAVA_CONCEPTS;

import java.util.Scanner;

public class JAVA_Simple {

	public static void main(String[] args) {
		System.out.println("enter int number: "+ "\n");
		Scanner SC = new Scanner(System.in);
		int i = SC.nextInt();
		System.out.println("Given int number By user: " + i);

//	Adding();
	Loops();
	}
	//adding no.s
	public static void Adding() {
		
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter first number:"+"\n");
	int A=Sc.nextInt();
	
	System.out.println("Enter Folat Value:"+"\n");
	Float B=Sc.nextFloat();
	
	float SUM=A+B;
	System.out.println("Addittion of two no.s:"+SUM);
	
	
	//even n add no.s
	System.out.println("Enter one number:"+"\n");
	int Number=Sc.nextInt();
	
	if(Number%2==0)
	{
		System.out.println("the Given number is Even.");
	}
	else
	{
		System.out.println("the Given number is Odd.");

	}
	
	
//Switch statement
	
	System.out.println("Enter user's birthday month:"+"\n");
	int MonthNum=Sc.nextInt();
//	String MonthName=Sc.next();
	switch(MonthNum)
	{
	case(1):
		System.out.println("your birthday is in the month of JAN");
	break;
	case(2):
		System.out.println("your birthday is in the month of FEB");
	break;
	case(3):
		System.out.println("your birthday is in the month of MARCH");
	break;
	case(4):
		System.out.println("your birthday is in the month of APRIL");
	break;
	case(5):
		System.out.println("your birthday is in the month of MAY");
	break;
	case(6):
		System.out.println("your birthday is in the month of JUNE");
	break;
	case(7):
		System.out.println("your birthday is in the month of JULY");
	break;
	case(8):
		System.out.println("your birthday is in the month of AUG");
	break;
	case(9):
		System.out.println("your birthday is in the month of SEP");
	break;
	case(10):
		System.out.println("your birthday is in the month of OCT");
	break;
	case(11):
		System.out.println("your birthday is in the month of NOV");
	break;
	case(12):
		System.out.println("your birthday is in the month of DEC");
	break;
	}
	
	}
		
	public static void Loops()
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			}

		
		//dowhile
		int X=1;
		do {
			System.out.println("The X value is :"+X);
			
		}while(X>1);
		System.out.println("Exit from the loop");
	}
	

}
