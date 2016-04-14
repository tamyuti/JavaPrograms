//4 b. Write a program to count the number of words in a file.
package file;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordCount {
	public static void main(String[] args) throws IOException {
		int count=0;
		BufferedReader bf=new BufferedReader(new FileReader("C:/Users/kabi/Desktop/Wordcount.txt"));
		String read=bf.readLine();
		//String str=read;
		String[] test=read.split("\\s");
		for(int i=0;i<test.length;i++){
			count++;
		}
		System.out.println("Number of words are: " +count);
		
		bf.close();
		
		
	}
}
