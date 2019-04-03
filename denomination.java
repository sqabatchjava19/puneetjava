import java.util.Scanner;
class denomination
{
	public static void main(String[] args)
	{
		int a,b=0,c=0,d=0,e=0,f=0,sum;
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the amount:");
		a=scn.nextInt();
		while(a>=500)
		{
			b=a/500;
			a=a%500;
			System.out.println("total number of 500 notes are:" +b);
			break;
		}
		while(a>=100)
		{
			c=a/100;
			a=a%100;
			System.out.println("total number of 100 notes are:"+c);
			break;
		}
		while(a>=50)
		{
			d=a/50;
			a=a%50;
			System.out.println("total number of 50 notes are:" +d);
			break;
		}
		while(a>=20)
		{
			e=a/20;
			a=a%20;
			System.out.println("total number of 20 notes are:" +e);
			break;
		}
		while(a>=10)
		{
			f=a/10;
			a=a%10;
			System.out.println("total number of 10 notes are:" +f);
			break;
		}
		sum=b+c+d+e+f;
		System.out.println("total number of notes are:" +sum);
	}
}

		