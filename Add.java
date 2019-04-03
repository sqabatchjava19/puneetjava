import java.util.Scanner;
class Add
{
public static void main(String[] args)
{
	Scanner scn= new Scanner(System.in);
	System.out.println("enter the two numbers:");
	System.out.println("enter value of a:");
	int a= scn.nextInt();
	System.out.println("enter value of b:");
	int b= scn.nextInt();
	int sum= a + b;
	System.out.println("sum of two number is :" + sum);
}
}



