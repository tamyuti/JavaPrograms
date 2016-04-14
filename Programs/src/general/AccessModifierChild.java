package general;

public class AccessModifierChild extends AccessModifier {
	public static void main(String[] args) {
		AccessModifierChild o=new AccessModifierChild();
		o.method1();
		o.method2();
	//	o.method3();method is private
		o.method4();
	}

}
