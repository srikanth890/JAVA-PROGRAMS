package javaprograms;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20,c;
		
	     System.out.println("before swapping a and b:"+a+","+b);
	     //using temporary variable
	    /* c=a;
	     a=b;
	     b=c;*/
	     //with out third varible
	    /* a=a+b;
	     b=a-b;
	     a=a-b;*/
	     
	     //using * and /
	     
	   /*  a=a*b;
	     b=a/b;
	     a=a/b;*/
	     
	     //using XOR
	    /* a=a^b;
	     b=a^b;
	     a=a^b;*/
	     
	     //single line
	     b=a+b-(a=b);
	     
	     System.out.println("After swapping a and b:"+a+","+b);


	}

}
