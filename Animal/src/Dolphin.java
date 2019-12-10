
public class Dolphin extends Mammals {

	public Dolphin(String name, int tp) {
		super(name, tp);
	}

	@Override
	public String isFlyable() {
		return "Can I fly? "+canFly;
	}

	@Override
	public String timePregnant() {
		return "Pregnancy time is: "+tp;
	}

}
