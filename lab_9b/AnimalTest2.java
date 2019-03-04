//This class tests the classes that inherit Animal.java
public class AnimalTest2
{
    public static void main(String args[])
    {
		Cat felix=new Cat();
		System.out.println("felix "+((felix instanceof Animal)?"is":"is not")+" an instance of Animal");
		System.out.println("felix "+((felix instanceof Feline)?"is":"is not")+" an instance of Feline");
		System.out.println("The cat felix has "+felix.getLivesLeft()+" lives left.");
		System.out.println("felix says "+felix.makeNoise());
		System.out.println("felix has hunger level "+felix.getHunger());
		felix.eat();
		System.out.println("felix has hunger level "+felix.getHunger());
		felix.eat();
		felix.roam();
		System.out.println("felix has hunger level "+felix.getHunger());
		System.out.println("felix is "+(felix.isAwake?"awake":"sleeping"));
		felix.sleep();
		System.out.println("felix is "+(felix.isAwake?"awake":"sleeping"));
		System.out.println();
		Dog fido=new Dog();
		System.out.println("fido "+((fido instanceof Animal)?"is":"is not")+" an instance of Animal");
		System.out.println("fido "+((fido instanceof Canine)?"is":"is not")+" an instance of Canine");
		System.out.println("fido says "+fido.makeNoise());
		System.out.println("fido has hunger level "+fido.getHunger());
		fido.sit();
		System.out.println("fido has hunger level "+fido.getHunger());
		fido.stand();
		fido.roam();
		System.out.println("fido has hunger level "+fido.getHunger());
		fido.eat();
		System.out.println("fido has hunger level "+fido.getHunger());
		System.out.println("fido is "+(fido.isAwake?"awake":"sleeping"));
		fido.sleep();
		System.out.println("fido is "+(fido.isAwake?"awake":"sleeping"));
		System.out.println();
		SeeingEyeDog ralph=new SeeingEyeDog(3);
		System.out.println("ralph "+((ralph instanceof Animal)?"is":"is not")+" an instance of Animal");
		System.out.println("ralph "+((ralph instanceof Canine)?"is":"is not")+" an instance of Canine");
		System.out.println("ralph "+((ralph instanceof Dog)?"is":"is not")+" an instance of Dog");
		System.out.println("ralph says "+ralph.makeNoise());
		ralph.sit();
		ralph.stand();
		System.out.println("ralph has hunger level "+ralph.getHunger());
		ralph.roam();
		ralph.roam();
		System.out.println("ralph has hunger level "+ralph.getHunger());
		ralph.eat();
		System.out.println("ralph has hunger level "+ralph.getHunger());
		System.out.println("ralph is "+(ralph.isAwake?"awake":"sleeping"));
		ralph.sleep();
		System.out.println("ralph is "+(ralph.isAwake?"awake":"sleeping"));
		System.out.println("ralph is a seeing eye dog with tracking code "+ralph.getTrackingCode());
		System.out.println();
		Lion simba=new Lion();
		System.out.println("simba "+((simba instanceof Animal)?"is":"is not")+" an instance of Animal");
		System.out.println("simba "+((simba instanceof Feline)?"is":"is not")+" an instance of Feline");
		simba.sit();
		simba.stand();
		System.out.println("The lion simba has "+simba.getLivesLeft()+" lives left.");
		System.out.println("simba says "+simba.makeNoise());
		System.out.println("simba has hunger level "+simba.getHunger());
		simba.roam();
		System.out.println("simba has hunger level "+simba.getHunger());
		simba.eat();
		System.out.println("simba has hunger level "+simba.getHunger());
		System.out.println("simba is "+(simba.isAwake?"awake":"sleeping"));
		simba.sleep();
		System.out.println("simba is "+(simba.isAwake?"awake":"sleeping"));
		System.out.println();
		Wolf wolf1=new Wolf();
		System.out.println("wolf1 "+((wolf1 instanceof Animal)?"is":"is not")+" an instance of Animal");
		System.out.println("wolf1 "+((wolf1 instanceof Canine)?"is":"is not")+" an instance of Canine");
		System.out.println("wolf1 says "+wolf1.makeNoise());
		System.out.println("wolf1 has hunger level "+wolf1.getHunger());
		wolf1.roam();
		System.out.println("wolf1 has hunger level "+wolf1.getHunger());
		wolf1.roam();
		System.out.println("wolf1 has hunger level "+wolf1.getHunger());
		wolf1.eat();
		System.out.println("wolf1 has hunger level "+wolf1.getHunger());
		System.out.println("wolf1 is "+(wolf1.isAwake?"awake":"sleeping"));
		wolf1.sleep();
		System.out.println("wolf1 is "+(wolf1.isAwake?"awake":"sleeping"));
		System.out.println();
		
		
    }
}