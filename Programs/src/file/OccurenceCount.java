//4 c
package file;

import java.io.BufferedReader;

import java.io.FileReader;
//4 c. Write a program to search for a string in a file and then return the count of number of occurrences of the string.
import java.io.IOException;


public class OccurenceCount {
	public static void main(String[] args) throws IOException {
		int count=0; 
		String word="Java";
		BufferedReader bf=new BufferedReader(new FileReader("C:/Users/kabi/Desktop/Wordcount.txt"));
		String str;
		while((str=bf.readLine())!=null){
			String[] strArray=str.split("\\s");
			for(int i=0;i<strArray.length;i++){
				if(strArray[i].equalsIgnoreCase(word)){
					count++;

				}
			}
		}
		System.out.println("Number of occurrence of string: " +count);
		bf.close();
	}


}

