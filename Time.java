import java.util.Scanner;
import java.util.*; // package containing date& time

	
public class Time
{
	public static void main(String[]args)
	{
		Scanner a = new Scanner(System.in);
		System.out.println("time in Seconds");
		int inputTime = a.nextInt();
		
		int hrs = inputTime/3600;
		int min =(inputTime % 3600)/ 60;
		int secs = (inputTime % 3600) % 60;
		
		System.out.println("hours"+hrs+"minutes"+min+"Seconds"+secs);
	}
	
}