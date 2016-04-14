//3 d. Write a program to reverse each individual word in a sentence
package strings;

public class ReverseEachWord {
	
	public static String reverseEachWordMethod(String s){
		String[] words=s.split("\\s");
		String reverseString="";
		for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
           if(i==words.length-1){
            reverseString = reverseString + reverseWord; 
           
           }
           else{
        	   reverseString= reverseString+ reverseWord+" ";
           }
		
        }
		return reverseString;
		
	}
	public static void main(String[] args) {
		String s="This book";
		String reverseString=ReverseEachWord.reverseEachWordMethod(s);
		System.out.println(reverseString);
		
		
	}

}
