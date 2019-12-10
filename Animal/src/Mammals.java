
public abstract class Mammals extends Animals {
	protected int tp;

	public Mammals(String name, int tp) {
		super(name);
		canFly = false;
		this.tp = tp;
	}
	

    public int getTp() {
		return tp;
	}


	public void setTp(int tp) {
		this.tp = tp;
	}


	public abstract String timePregnant();

}