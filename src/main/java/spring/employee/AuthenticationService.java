package spring.employee;

import org.springframework.beans.factory.annotation.Autowired;

public interface AuthenticationService {

	public boolean authenticate(String username, String password);


}
