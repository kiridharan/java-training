import java.util.*;
class Fibinoos
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of terms");
	int n=sc.nextInt();
	series(n);
	}
	
	static void series(int num)
	{
	System.out.println("Fibonacci series is ");
	int i=0,j=1,next;
	for(int c=0;c<num;c++)
	{
	if(c<=1)
		next=c;
	else
	{
	next=i+j;
	i=j;
	j=next;
	}
	System.out.print(next+" ");
	}
	}
}