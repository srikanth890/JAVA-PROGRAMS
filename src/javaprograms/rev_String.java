package javaprograms;

public class rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABCD";
		String rev="";
		/*int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of a string:"+rev);*/
		
		/*char[]ch=str.toCharArray();
		
		int len=ch.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println("reverse of a string:"+rev);*/
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());

	}

}
