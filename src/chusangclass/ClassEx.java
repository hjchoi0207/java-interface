package chusangclass;

public class ClassEx extends AbstractClassEx {
	
	public ClassEx() {
		System.out.println();
	}
	
	public ClassEx(int i,String s) {
		super(i,s);
	}

	@Override
	public void func2() {
		System.out.println("--- func2() Start ---");
	}
	
}
