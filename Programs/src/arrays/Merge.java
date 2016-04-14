//2 g
package arrays;

public class Merge {
	
public static int[] mergeNum(int a[],int b[]) {
	int c[]=new int[a.length + b.length];
	for(int i=0;i<a.length;i++){
		c[i]=a[i];
	}
	
	for(int j=0;j<b.length;j++){
		c[(a.length)+j]=b[j];
		
	}
	
	return c;
	}
public static void main(String[] args) {
	int a[]={5,20,15};
	int b[]={2,10,35};
	int Values[]=Merge.mergeNum(a, b);
	for(int k=0;k<Values.length;k++){
	System.out.print(Values[k] + " ");
	}

}
}
