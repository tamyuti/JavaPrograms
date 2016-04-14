//1 Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, and "ping pong" if number is divisible by both, else print the number.


package loops;




public class Divisible {
	
	public static String div(int i){
		String s;
			if(i%3==0 && i%5==0){
				s="Ping Pong";
			}
			else if(i%5==0){
				s="Pong";
				
			}
			else if(i%3==0){
				s="Ping";
				
			}
			else{
				s="No Div";
			}
			return s;
	}
	
	public static void main(String[] args) {
		int num=15;
		String x=Divisible.div(num);
		if(x=="Ping Pong"){
			System.out.println("The number is divisible by both 3 and 5");
		}
		else if(x=="Pong")
		{
			System.out.println("The number is divisible by 5");
		}
		else if(x=="Ping"){
			System.out.println("The number is divisible by 3");
		}
		else{
			System.out.println(num);
		}
	}

}
