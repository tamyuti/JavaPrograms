//4 f. Write a program to copy content of file into another file.
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyofFiles {
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("C:/Users/kabi/Desktop/doc1.txt");
		FileOutputStream out=new FileOutputStream("C:/Users/kabi/Desktop/doc2.txt");
		int i;
		while((i=in.read())!=-1){
			out.write(i);
		}
		System.out.println("Success");
		in.close();
		out.close();
		
		
	}

}
