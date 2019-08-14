package comm.second;

import java.io.Serializable;

public class Person implements Serializable {
	
	String firstName;
	String lastName;
	
	public Person() {
		super();
	}
	

	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public void verifayName(String firstName) throws PersonException{
		this.firstName = firstName;
		if(firstName.charAt(0)>64 && firstName.charAt(0)<91 ) {
			System.out.println("all cool");
		} else {
			throw new PersonException("first letter of first name needs to be caps");
		}
	}
	
	public void nameEquality(Person person) throws NameEqualsException{
		
	}

}
