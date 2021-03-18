import java.util.*;
public class TestApp33
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int no1 = no;
		for(int i=10; i<=no; i++)
		{
			no1 = i;
			boolean flag = true;
			while(no1 > 0)
			{
				int count=0;
				int temp = no1%10;
				for(int k=1;k<=temp;k++)
				{
					if(temp%k==0)
					{
						count++;
					}
				}	
				if(count!=2)
				{
					flag=false;
					break;
				}
				no1 = no1/10;
			}
			if(flag==true)
			{
				System.out.println(i+" ");
			}	
		}
	}
}
