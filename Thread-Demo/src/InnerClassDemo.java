
public class InnerClassDemo {

	static class A{
		String name;
		int age;
	}
	
	public static void main(String[] args) {
		InnerClassDemo.A a = new InnerClassDemo.A();
		System.out.println(a.name);
		System.out.println(a.age);
	}
	
}
