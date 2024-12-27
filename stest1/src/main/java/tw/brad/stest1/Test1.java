package tw.brad.stest1;

import org.springframework.stereotype.Component;

public class Test1 {
	private int i;
	public Test1() {
		i = 0;
		System.out.println("Test1");
	}
	public Test1(int i) {
		this.i = i;
		System.out.println("Test1(int)");
	}
	
	public void printI() {
		System.out.println(i);
	}
	
	public void m1() {
		System.out.println("Test1:m1()");
	}
}
