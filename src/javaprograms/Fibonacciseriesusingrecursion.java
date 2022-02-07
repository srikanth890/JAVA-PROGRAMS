package javaprograms;

public class Fibonacciseriesusingrecursion {

	static int a=0,b=1,c=0;
	
	public static void printfibonacci(int count) {
		if(count>0) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(","+c);
		printfibonacci(count-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10;
		System.out.print(a+","+b);
//		Fibonacciseriesusingrecursion fb=new Fibonacciseriesusingrecursion();
//		fb.printfibonacci(count-2);
		printfibonacci(count-2);
   //this program written using with static and with out static method

	}

}
