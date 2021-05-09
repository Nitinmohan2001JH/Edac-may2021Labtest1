class Program6
{
	public static void main(String args[])
	{
	int a1[]=new int[] {1,2,3,4};
	System.out.println("original array ");
	for(int i=0;i<a1.length;i++)
	{
	System.out.print(a1[i] + " ");
	}
	System.out.println("array in reverse order ");
	System.out.println();
	for(int i=a1.length-1;i>=0;i--)
	{
	System.out.print(a1[i] + " ");
	}
	}
	
}	
	