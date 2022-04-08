package javaprograms;

import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();
		scan.close();
		reverse_num obj=new reverse_num();
		obj.rev_number(num);
	}

	public void rev_number(int n) {
      System.out.println("Before Reverse a Number:"+n);
      int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("afer Reverse of a Nubmer:"+rev);
	}

}
