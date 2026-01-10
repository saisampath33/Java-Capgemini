package Abstraction;

abstract class Animal {
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
	public abstract void sound();
}

class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("bow bow");
	}
}

public class MainApp{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
	}
}