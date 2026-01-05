package MethodChaining;

public class MethodChaining {
	MethodChaining m1(){
		return this;
	}
	MethodChaining m2(){
		return this;
	}
	MethodChaining m3(){
		return this;
	}
	
	public static void main(String[] args) {
		MethodChaining m = new MethodChaining();
		MethodChaining obj = m.m1().m2().m3();
		System.out.println(m);
		System.out.println(obj);
	}
	
}
