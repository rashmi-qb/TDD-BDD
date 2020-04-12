package com.qait.tdd.SampleProject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PasswordValidationTest {
	
	PasswordValidation passwordValidation;

	@BeforeClass
	public void setup(){
		 passwordValidation = new PasswordValidation();
	}
	
	@Test
	public void checkPasswordIsNotnull(){
		String password = "test";
		Boolean resultReturned = passwordValidation.validations(password);
		Assert.assertTrue(resultReturned, "[Assert Fails]: Password is null");
		System.out.println("[Assert Passed]: Password is not null");
	}
	
	@Test
	public void checkMinimumLengthOfPassword(){
		String password = "12345";
		Boolean resultReturned = passwordValidation.validations(password);
		Assert.assertTrue(resultReturned, "[Assert Fails]:");
		System.out.println("[Assert Passed]: Password length is more than 5");
	}
	
	@Test
	public void checkMaximumLengthOfPassword(){
		String password = "12345678";
		Boolean resultReturned = passwordValidation.validations(password);
		Assert.assertTrue(resultReturned, "[Assert Fails]:");
		System.out.println("[Assert Passed]: Password length is less than 8");
	}
	

}
