package spring.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

	/*
	public boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("username") && password.equals("password"))
		{
			return true;
		}
		return false;
	}
	 */
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public boolean authenticate(String username, String password) {
	return "toto".equals(userService.getPassword("michel"));
	}


}
