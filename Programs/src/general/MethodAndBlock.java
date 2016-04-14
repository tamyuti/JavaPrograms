package general;

public class MethodAndBlock {
	
	MethodAndBlock(){
		System.out.println("Hi!I am from Constructor.");
	}
	public static void method(){
		System.out.println("Hi!I am from static method.");
	}
	static{
		System.out.println("Hi! I a from static block.");
	}
	public static void main(String[] args) {
		MethodAndBlock mb=new MethodAndBlock();
		MethodAndBlock.method();
		
	}

}
