//1 f. Write a program  to check an armstrong number i.e. whether the if we power up the each individual number to the total number of digits in the number and add them it should be equal to the number itself. For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.

package loops;

public class Armstrong {
	
	public static boolean calcArmstrong(int n){	
	int temp,c=0,a;boolean isArm=false;	
		temp=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+a*a*a;
		}
		if(temp==c){
			isArm=true;
		}
		else{
			isArm=false;
		}
		return isArm;
	}
public static void main(String[] args) {
	boolean isArm=Armstrong.calcArmstrong(0);
	if(isArm==true){
		System.out.println("The number is armstrong");
	}
	else{
		System.out.println("The number is not armstrong");
	}
	
	
}
}
