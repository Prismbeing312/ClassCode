package runners;

import someshit.Bird;
import someshit.Dog;

public class Mainmain {

	public static void main(String[] args) {
		Dog woof = new Dog("mutzi", 4, "Red");
		woof.sayMyName();
		Bird polly = new Bird("polly", 2, "Rainbow");
		polly.sayMyName();
		System.out.println();
		System.out.println(woof.isFlyable());
		System.out.println(polly.isFlyable());

	}

}
