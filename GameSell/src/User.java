import java.time.LocalDate;

public class User extends BaseUser {
		String NationalID;
		String DateOfBirth;
		
		public User(String firstName, String lastName, String DateOfBirth, String NationalId) {
			this.firstName=firstName;
			this.lastName=lastName;
			this.DateOfBirth= DateOfBirth;
			this.NationalID=NationalId;
			
		}
}
