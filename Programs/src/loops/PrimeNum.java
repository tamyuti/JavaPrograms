//1 Write a program  to check if a given number is prime or not.

package loops;



public class PrimeNum {

	public static boolean method1(int num){
		boolean isPrime=true;
		int temp;
		if(num<1){
			isPrime=false;
		}
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
			
		}

		return isPrime;
	}		

	public static void main(String[] args) {
		int num=-11;
		boolean isPrime=PrimeNum.method1(num);
		if(isPrime==true)
			System.out.println(num + " is Prime Number");
		else
			System.out.println(num + " is not Prime Number");
	}
}


