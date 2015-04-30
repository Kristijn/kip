public class person {
	private String name;
	private int age;
	private int weight;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name.toLowerCase();
		if(name.equals("rick")){
			name = "notrick";
			System.out.println("you may not be called Rick, try again.");
		}

		if(name.equals("meg")){ 
			System.out.println("Shut up Meg!");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0){
			age = 0;
			System.out.println("Age must be 0 or older. Default will be set to 0.");
		}
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight<=0){
			weight = 1;
			System.out.println("Weight must be positive. Default will be set to 1.");
		}
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {		
		gender = gender.toLowerCase();
		if(!gender.equals("male") || !gender.equals("female")){
			gender = "male";
			System.out.println("Gender must be either male or female. Default will be set to male.");
		}
		this.gender = gender;
	}

}