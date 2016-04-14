//3 c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".
package strings;

public class AcceptString {
	public static String acceptStringMethod(String str){
		String[] splitStr=str.split("\\s");
	String finalString="";
	for(int i=1;i<=splitStr.length;i++){
		if (i==1){
		finalString=finalString+splitStr[i-1]+i;
		}
		else{
			finalString=finalString+ " "+splitStr[i-1]+i;
		}
	}
	return finalString;
	
	}
public static void main(String[] args) {
	String str="This is nice";
	String finalString=AcceptString.acceptStringMethod(str);
	System.out.println(finalString);
	
}
}
