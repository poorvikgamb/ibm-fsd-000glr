package Assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMainCode {
	public static boolean checkPassword(String password){
		String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}";
		if(password.length()<8)
		return false;
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher = pattern.matcher(passwordPattern);
        return matcher.matches();
	}

}
