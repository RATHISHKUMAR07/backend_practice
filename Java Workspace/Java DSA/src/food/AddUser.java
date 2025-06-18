package food;
import java.util.*;
public class AddUser {
	
	Map<String,String> users = new HashMap<String,String>();
	
	void addUser(User user) {
		if(users.containsKey(user.getUserName())) {
			System.out.println("Login Sucessfull "+ user.getUserName());
		}
		else {
			users.put(user.getUserName(),user.getUserPassword());
			System.out.println("New User Logined Successfull "+ user.getUserName());
		}
	}
}
