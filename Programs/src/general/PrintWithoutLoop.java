package general;

public class PrintWithoutLoop {

	public void recursive(int n){
		if(n<=10){
			System.out.println(n);
			recursive(n+1);
		}
		
	}

	public static void main(String[] args) {
		PrintWithoutLoop print=new PrintWithoutLoop();
		print.recursive(1);

	}
}
