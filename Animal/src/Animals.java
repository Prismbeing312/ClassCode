
public abstract class Animals {
    protected String name;
    protected boolean canFly;
	public Animals(String name) {
		this.name = name;
	}
	
	public abstract String isFlyable();
    
}
