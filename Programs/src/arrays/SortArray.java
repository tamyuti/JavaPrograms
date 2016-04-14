//2 e

package arrays;

public class SortArray {
	
public static int[] sortArrayMethod(int a[]){
	int temp=0;
	for(int i=0;i<(a.length);i++){
		for(int j=i+1;j<(a.length);j++){
		if(a[j]<a[i]){
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
		}
	}
	
	return a;
	
}
public static void main(String[] args) {
	int a[]={50,20,10,30,15};
	SortArray.sortArrayMethod(a);
	for(int k=0;k<a.length;k++){
	System.out.println(a[k]);
	}
	
}
}
