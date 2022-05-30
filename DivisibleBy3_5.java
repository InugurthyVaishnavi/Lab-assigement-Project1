package lab1;

import java.util.Scanner;
public class DivisibleBy3_5 {
	public static int sum(int n)
	{
		int s=0;
		for(int i=1;i<=n;i++)
			if(i%3==0||i%5==0)
			{
				s=s+i;
				
			}
		return s;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int t=sc.nextInt();
		System.out.println(sum(t));
	}

}