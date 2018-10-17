package spring.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan("spring.Employee")
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);	 
    	AuthenticationService  service= context.getBean(AuthenticationService.class);
    	System.out.println(service.authenticate("username", "password"));
    	System.out.println( "start created" );
    	*/
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);	 
    	AuthenticationService authen = context.getBean(AuthenticationService.class);
    	System.out.println("authentification :"+ authen.authenticate("papa", "toto"));
    
    
    }
}
