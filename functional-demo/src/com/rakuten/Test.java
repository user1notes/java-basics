package com.rakuten;
@FunctionalInterface
interface MyFunctionalInterface{
	void count();
	//void start();
}


class Impl1 implements MyFunctionalInterface{
	
	@Override
	public void count() {
		System.out.println("called from class");
	}
	
}

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface impl = () -> System.out.println("called");
		impl.count();
		Impl1 i = new Impl1();
		i.count();
		
	}
	
}
