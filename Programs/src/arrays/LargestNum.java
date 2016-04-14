//2 a

package arrays;



public class LargestNum {

	public static int findLargestNum(int a[]){
		
	int max=a[0];
	for(int i=1;i<a.length;i++){
		if(max<a[i]){
			max=a[i];
		}
	
	
	}
	return max;
}
	public static void main(String[] args) {
		int a[]={12,10,25,5,18,30};
		int largest=LargestNum.findLargestNum(a);
		System.out.println("Largest number is: " +largest);
	}
}
