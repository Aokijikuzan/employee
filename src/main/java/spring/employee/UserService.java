package spring.employee;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

	public  String getPassword(String username);
}
