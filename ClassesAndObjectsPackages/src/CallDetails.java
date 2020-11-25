import java.util.Scanner;
public class CallDetails {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter call details");
		String s=sc.next();
		Call c=new Call();
		c.parseDate(s);
		System.out.println("Call Id: "+c.getCallId());
		System.out.println("Called Number: "+c.getCalledNumber());
		System.out.println("Call duration: "+c.getDuration());
		
	}

}
