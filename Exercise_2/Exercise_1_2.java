package Exercise_2;

public class Exercise_1_2 {
	public static void main(String[] args) {
		int n = 4;
		double t;  
		double sqrtroot=n/2;  
		double sq = n*n;
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(n/t))/2;  
		}   
		while((t-sqrtroot)!= 0);
		System.out.println("The square root of "+ n+ " is: "+sqrtroot);
		System.out.println("The square of "+ n+ " is: "+sq);
	}
}
