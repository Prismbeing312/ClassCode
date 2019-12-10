
public class Bug extends Insects{

	public Bug(String name, boolean canfly) {
		super(name, canfly);
	}

	public String isFlyable() {
		return "Can I fly? "+canFly;
	}

	@Override
	public String isSewer() {
		return "Do I live in a sewer? " + isSewer;
	}
	
}
