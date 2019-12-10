
public abstract class Insects extends Animals {
	protected boolean isSewer;

	public Insects(String name, boolean canfly) {
		super(name);
		this.canFly = canfly;
	}

	@Override
	public String isFlyable() {
	  return "Can I fly? "+canFly;
	}
	public abstract String isSewer();

	public void setSewer(boolean isSewer) {
		this.isSewer = isSewer;
	}

}
   