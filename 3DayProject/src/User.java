
public class User {

	private String Name;
	private String lastName;
	private int Age;
	private String Hobby;
	public String getHobby() {
		return Hobby;
	}

	public void setHobby(String hobby) {
		Hobby = hobby;
	}

	public User(String name, String lastName, int age,String hobby) {
		super();
		Name = name;
		this.lastName = lastName;
		Age = age;
		Hobby=hobby;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
