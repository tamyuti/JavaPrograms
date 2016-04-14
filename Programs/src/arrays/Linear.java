//2 d

package arrays;

public class Linear {

	public static int LinearSearch(int a[]){
		int pos = -1;
		for(int i=0;i<a.length;i++){
		if(a[i]==12){
		pos=i;
		}
		
	}
		return pos ;
		
	}
public static void main(String[] args) {
	int a[]={15,31,12,40,50};
	System.out.println(Linear.LinearSearch(a));
	
	
	
}
}
