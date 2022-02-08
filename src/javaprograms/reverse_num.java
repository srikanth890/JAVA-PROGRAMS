package javaprograms;

public class reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1234;
		
		//int rev=0;
		/*while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}*/
		
		//StringBuffer sb=new StringBuffer(String.valueOf(num));
	//StringBuffer rev=	sb.reverse();
	
	StringBuilder sd=new StringBuilder();
	 sd.append(num);
	 StringBuilder rev=	sd.reverse();
		
		System.out.println("reverse of a number:"+rev);
	}

}
