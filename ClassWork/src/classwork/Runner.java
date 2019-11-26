package classwork;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String yourName = input.nextLine();
		Person p = new Person(yourName);
		System.out.println(p.getName());
		p.setName("Jake");
		System.out.println(p.getName());
	}

}
