package taskPrograms;

public class AnimalPolymorphism 
{
	public static void main(String[] args)
	{
		Animal a1=null;
		a1 = new Dog();
		a1.speak();
		a1 = new Cat();
		a1.speak();
		a1 = new Elephant();
		a1.speak();
	}
}

class Animal 
{
	void speak()
	{
		System.out.println("Speaking..");
	}
	void eat() 
	{
		System.out.println("eating...");
	}
	void play()
	{
		System.out.println("Playing...");
	}
	void walk()
	{
		System.out.println("Walking...");
	}
}

class Dog extends Animal
{
	@Override
	void speak() 
	{
		System.out.println("Barking...");
	}
}

class Cat extends Animal 
{
	@Override
	void speak() 
	{
		System.out.println("Meowing...");
	}
}

class Elephant  extends Animal
{
	@Override
	void speak() 
	{
		System.out.println("Trumpet...");
	}
}
