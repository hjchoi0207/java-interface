## java interface

>InterfaceA 

```java
public interface InterfaceA {
	public void funcA();
}
```

>InterfaceB

```java
public interface InterfaceB {
	public void funB();
}
```
* Interface는 C언어에서의 프로토 타입처럼 메소드를 정의만하고 따로 구현하지는 않는다.
***
>Interfaceclass

```java
public class Interfaceclass implements InterfaceA, InterfaceB {

	public static void main(String[] args) {

	}

	@Override
	public void funcA() {
		System.out.println("--- funcA() ---");
	}
	
	
	@Override
	public void funB() {
		System.out.println("--- funcB() ---");
	}


}
```
* interface class들을 구현하는 클래스는 implements를 이용하여 구현한다. 
상속과 달리 여러 Interface들을 implements할 수 있다.
***

>MainClass

```java
public class Mainclass {
	public static void main(String[] args) {
		
		InterfaceA ia = new Interfaceclass();
		InterfaceB ib = new Interfaceclass();
		
		ia.funcA();
		ib.funB();
		
	}
}
```

* MainClass에서 선언된 레퍼런스 ia와 ib는 Interfaceclass 객체이지만 데이타타입은 InterfaceA와 InterfaceB로 각각 다르다. 그러므로 가져올 수 있는
메소드 또한 다르다.

**보기와 같이 다수의 Interface들을 하나의 class가 implements할 수도 있고**

**반대로 하나의 Interface를 여러 class에서 implements할 수도 있다.**

- Ex)) Toy Interface의 기능들을 robot, airplane, train등의 서로 다른 class들이 implements하여 같은 메소드들을 
서로 다른 3개의 메소드로 구현하는 것이다.


## AbstractClass (추상클래스)

```java
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
	
	//추상메소드
	public abstract void func2();

}
```

- 추상클래스는 일반 클래스가 가질 수 있는것들에 더해 **추상메소드**를 가지며 이 메소드는 추상클래스를 상속하는 클래스에서 구현.

***

```java
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
```

- 그리하여 상속하는 클래스에서 func2() 메소드를 재정의 해주었으며 이 때 생성자는 super()를 이용하여 상위클래스의 생성자이용.

***

```java
public class MainClass {
	public static void main(String[] args) {
		AbstractClassEx ex = new ClassEx(10,"java");
		ex.func1();
		ex.func2();
	}
```

- Main클래스에서 상속된 객체를 생성하여 func1() func2()를 호출할 수 있음.
