//4 d. Write a program to search for a string in a file and then replace it with another string.
package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReplaceString {
	public static void main(String[] args) throws IOException {

		String word="java";
		String replaceWord="C++";
		BufferedReader bf=new BufferedReader(new FileReader("C:/Users/kabi/Desktop/Wordcount.txt"));
		String str;
		while((str=bf.readLine())!=null){
			System.out.println(str.replace(word, replaceWord));
			
		}
		bf.close();
	}
}