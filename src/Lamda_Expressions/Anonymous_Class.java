package Lamda_Expressions;

import java.util.ArrayList;

public class Anonymous_Class {

	public static void main(String[] args) {
		//Override the method created in Book class instead of creating new class
		Book b1 = new Book("Harry Potter") {
			public void display() {
				System.out.println("The book name is: "+name);
			}
		};
		
		b1.display(); //call the class
		
		Animal a = new Animal() {

			@Override
			public void bark() {
				System.out.println("The dog barks");
			}
			
		};
		
		a.bark();
	}

}

abstract class Book {
	String name;
	Book(){
		
	}
	Book(String name){
		this.name = name;
	}
	public void display() {
		System.out.println("Helllo");
	}
}

interface Animal{
	public void bark();
}