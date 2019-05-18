package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
	
	String name = "Cat";
	
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The test method in Cat");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		
		myCat.testClassMethod(); 		// hiding  
		myCat.testInstanceMethod();  	// overriding
		System.out.println(myCat.name);	// hiding
		
		Dog myDog = new Dog();
		
		Animal dog = myDog;				// polymorphism 
		dog.testClassMethod();			// hiding
		dog.testInstanceMethod();		// overriding 
		System.out.println(dog.name);	// hiding 
	}
}