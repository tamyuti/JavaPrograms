//2 f. Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
//For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.
package arrays;

public class SwapTwo {
	
	public static int[] Swap(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr;
	}
public static void main(String[] args) {
	int arr[]={1,2,5,6,4};
	SwapTwo.Swap(arr);
	for(int k=0;k<arr.length;k++){
		System.out.println(arr[k]);
	}
}
}
