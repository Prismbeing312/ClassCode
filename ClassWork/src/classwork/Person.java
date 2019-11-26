package classwork;

public class Person {
  public String name;

public Person(String name) {
 setName(name);
}


//Set and get
public String getName() {
	return name;
}

public void setName(String name) {
	if(!name.isEmpty()) {
		this.name = name;
	}
	else {
		System.out.println("Invalid Name");;
	}
}

  
}
