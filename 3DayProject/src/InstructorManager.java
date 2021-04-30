
public class InstructorManager implements IUserManager {

	@Override
	public void AddHobby(User user) {
		System.out.println(user.getName()+" isimli kisiye "+user.getHobby()+" hobiler eklendi...");
		
	}

	@Override
	public void FullName(User user) {

		System.out.println(user.getName()+ " "+ user.getLastName());
	}

}
