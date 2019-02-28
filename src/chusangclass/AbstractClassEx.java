package chusangclass;

public abstract class AbstractClassEx {

	int num;
	String str;
	
	public AbstractClassEx() {
		System.out.println("AbstractClassEx constructor");
	}
	public AbstractClassEx(int i,String s) {
		System.out.println("AbstractClassEx constructor");
		this.num = i;
		this.str = s;
	}
	
	public void func1() {
		System.out.println("--- func1() Start ---");
	}
	
	public abstract void func2();

}
