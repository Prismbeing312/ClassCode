package someshit;

public class Bird extends Animal {

	public Bird(String name, int legs, String color) {
		super(name, legs, color);
		canFly = true;
	}

	@Override
	public void sayMyName() {
		System.out.printf("I am a bird and my name is %s",name);

	}

	@Override
	public String isFlyable() {
		String flyable = "Can I fly?"+canFly;
		return flyable;
	}

}
