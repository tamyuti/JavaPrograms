// 3 g. Write a program to implement hashCode() and equals() methods.

package strings;

public class Implementation {
	public static boolean implement (String s1, String s2){
		boolean isEqual=false;
		if(s1.equals(s2)){
			isEqual=true;
		}
		return isEqual;
	}
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java" ;
		boolean isEqual=Implementation.implement(s1,s2);
		System.out.println(isEqual);
		System.out.println(s1.hashCode());
		
			
		
		
	}
}
