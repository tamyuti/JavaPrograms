//3 b. Write a program to find a substring in a given string and then replace it with another string.
package strings;

public class SubString {
	
	public static String subStringMethod(String str){
	String find="good";
	String replace="bad";
	String replaceStr=str.replace(find, replace);
	
	return replaceStr;
	}
public static void main(String[] args) {
	String str="Ram is a good boy";
	String replaceStr=SubString.subStringMethod(str);
	System.out.println(replaceStr);	
}
}
