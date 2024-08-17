package validation;
import java.util.*;
public class EmailValidator extends StringValidator{

	int flagA = 0, flagD = 0, m, l, flag = 0;
	
	
	public boolean validate(String n) {
		
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '@') {
				flagA = 1;
				m = i;
			}
		}
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '.') {
				flagD = 1;
				l = i;
			}
		}
		if(l > m) {
			flag = 1;
		}
		
		if(m >= 1 && l >= 3 && flag == 1 && flagD == 1 && flagA == 1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public String getMessage() {
		 
		return "Input is not a valid Email";
	}
}
