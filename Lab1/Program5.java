import java.util.*;


class Program5
{
	public static void main(String args[])
	{
		int a;
		int b;
		int c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number ");
		 a=sc.nextInt();
		System.out.println("enter second number ");
		 b =sc.nextInt();
		
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping t= and g= "+a+b);
		System.out.println();		
	}
}