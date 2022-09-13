

	class Animal
	{
		void eat()
		{
			System.out.println("Enating........");
	}
	}
	class Dog extends Animal
	{
		void bark()
		{
			System.out.println("...Barking...");
		}
	}	
	class BabyDog extends Dog
	{
		void weep()
		{
			System.out.println("....Weeping ....");
		}
	}
	
	class Cat extends Animal
	{
		void mow()
		{
			System.out.println("mam.....");
		}
	}
	
	public class TestInheritese {
		/* THis is multi level */
		
		/* now if add cat if will be hirecally */
		
	
	public static void main(String[] args)
	{
		BabyDog b = new BabyDog();
		b.eat(); 
		b.bark(); 
		b.weep();
		Cat c = new Cat();
		c.eat();
		c.mow();
		
	}
	/*
	 * BabyDog b = new BabyDog(); b.eat(); b.bark(); b.weep();
	 * 
	 */

}

