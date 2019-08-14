package comm.first;

public class Dog implements LivingThings{
	public String breed;
	public String name1;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void getName(String name1) {
		name1 = LivingThings.name;
		
	}
		
	public void createLivingThings() {
		LivingThings livingThings = new LivingThings() {
			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("Dog Name"+"Dog breed:"+getBreed());
			}
		};
		livingThings.walk();
	}


	

}
