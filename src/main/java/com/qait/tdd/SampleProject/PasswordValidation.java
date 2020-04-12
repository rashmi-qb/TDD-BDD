package com.qait.tdd.SampleProject;

public class PasswordValidation {
	Boolean result;

	public Boolean validations(String password) {
		if (password.equalsIgnoreCase("") || password == null) {
			result = false;
		}
		if (password.length() >= 5 && password.length() <= 8) {
			result = true;
		} else {
			result = true;
		}
		return result;
	}
}
