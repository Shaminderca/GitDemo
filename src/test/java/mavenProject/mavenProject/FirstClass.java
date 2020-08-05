package mavenProject.mavenProject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {
	
	
	
	@BeforeMethod
	void setup() {
		
		System.out.println("This is setup");
	}

	
	
	@Test
	void test() {
		
		System.out.println("This is a Test");
	}
}
