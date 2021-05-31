public class Bank
{
	void display(int amount)
	{
	if(amount<1000)
	{
	System.out.println("Insufficient balance");
	}
	else
	System.out.println("Available amount");
	}
	public static void main(String[]args)
	{
	Amount a = new Amount();
	a.display(500);
	}
}
	