// 2 c

package arrays;


public class CommonNum {
	
	public static int commonNumCalc(int a[], int b[]){
		int val = 0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					val=a[i];
					
				}
			}
	}System.out.println("Common number is: " +val);
		return val;

		}
	public static void main(String[] args) {
		
		int a[]={25,5,30,18,2};
		int b[]={20,5,35,10,1,5};
		CommonNum.commonNumCalc(a, b);
		
		
	}
	
}

