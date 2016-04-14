//4 e. Write a program to show list of all file names in a folder.
package file;

import java.io.File;

public class ListFiles {
public static void main(String[] args) {
	File file=new File("C:\\Users\\kabi\\Desktop\\test");
	String[] listFiles=file.list();
	for(String list:listFiles){
		System.out.println(list);
	}
}
}
