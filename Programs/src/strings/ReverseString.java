//3 a. Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.
package strings;

public class ReverseString {
	public static String reverseStringMethod(String str){
		
		char c[]=str.toCharArray();
		
		for(int i=0;i<c.length/2;i++){
			char temp;
			int j=(c.length-1)-i;
			temp=c[j];
			c[j]=c[i];
			c[i]=temp;
		}
		String output=new String(c);
		return output;
	}
	
	public static void main(String[] args) {
		
		String str="This is my book.";
		String output=ReverseString.reverseStringMethod(str);
		System.out.println(output);
	}
}
