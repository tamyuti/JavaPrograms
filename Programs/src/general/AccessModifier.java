package general;

public class AccessModifier {
	public void method1(){
		 
		 System.out.println("I am from public method");
	}
	
	void method2(){
		System.out.println("I am from default method");
		
	}
	private void method3(){
		System.out.println("I am from private method");
	}
	protected void method4(){
		System.out.println("I am from Protected method");
	}
	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
