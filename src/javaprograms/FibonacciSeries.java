package javaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0 ,b=1,c,n=8;
		
		
		System.out.print(a+","+b+",");
		
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;

		}

	}

}
