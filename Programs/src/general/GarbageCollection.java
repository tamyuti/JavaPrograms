package general;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCollection {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader read=new BufferedReader(new FileReader("C:/Users/kabi/Desktop/doc1.txt"));
			String str;
			while((str=read.readLine())!=null){
				System.out.println(str);
				
			}
			System.gc();
			System.out.println("Garbage Collector called!!");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}


	}
}
