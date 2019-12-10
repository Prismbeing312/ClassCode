package someshit;

public class Dog extends Animal {

	public Dog(String name, int legs, String color) {
		super(name, legs, color);
		canFly = false;
	}

	@Override
	public void sayMyName() {
		System.out.println("Woof im "+name);

	}

	@Override
	public String isFlyable() {
		String isflyable = "I am a dog, can I fly: "+false;
		return isflyable;
	}

}
