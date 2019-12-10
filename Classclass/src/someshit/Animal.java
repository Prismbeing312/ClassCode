package someshit;

public abstract class Animal {
	protected String name;
	protected int legs;
	protected String color;
	protected boolean canFly;

	public Animal(String name, int legs, String color) {
		this.name = name;
		this.legs = legs;
		this.color = color;
	}
	
	public abstract void sayMyName();
	public abstract String isFlyable();
  
}
