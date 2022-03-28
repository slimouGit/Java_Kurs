package Constructor;

public class Dog {
	
	private String name;
	private String breed;
	private Integer age;
	
	public Dog() {
		
	}

	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(String name, String breed) {
		this(name);
		this.breed = breed;
	}	

	public Dog(String name, String breed, Integer age) {
		this(name, breed);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	

}
