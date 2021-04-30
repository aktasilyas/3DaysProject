
public class Main {

	public static void main(String[] args) {
		User user1=new User("ilyas", "aktas", 23,"futbol");
		StudentManager studentManager=new StudentManager();
		studentManager.AddHobby(user1);
		studentManager.FullName(user1);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.AddHobby(user1);
		

	}

}

