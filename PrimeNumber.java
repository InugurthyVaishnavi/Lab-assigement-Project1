package lab1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: 20");
		n=s.nextInt();
		for(int i=1;i<n;i++)
		{
			p=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
		

	}

}