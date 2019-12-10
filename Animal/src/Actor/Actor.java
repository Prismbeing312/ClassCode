package Actor;

public class Actor implements Acting {
     private int age;
     private String name;
     
	public Actor(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void actingWithDrama() {
		
	}

	@Override
	public void actingWithAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actingWithHorror() {
		// TODO Auto-generated method stub
		
	}

}
