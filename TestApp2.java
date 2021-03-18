//a java programm to see if the given numbers r twin or not
import java.util.Scanner;

public class TestApp2
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Kindly enter a number");
		int no=sc.nextInt();
		int no1=no;	
		int rem;
		int sum=0;
		int mul=1;

		do
		{
			rem= no%10;
			sum= sum+ rem;
			mul= mul*rem;
			no=no/10;		
		}while(no!=0);

		if(sum==mul)	
		{
			System.out.println(no1 + " is a twin number");
		}//
		else
		{
			System.out.println(no1 + " is not a twin number");
		}//
	}//end of void main
}//end of public class
