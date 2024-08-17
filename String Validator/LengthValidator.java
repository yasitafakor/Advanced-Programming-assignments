package validation;


public class LengthValidator extends StringValidator{

	int Min;
	int Max;
	
	public LengthValidator(int min, int max) {
		
		
		Min = min;
		Max = max;
		
	}
	
	
	public boolean validate(String n) {
		
		if(Min == -1 && Max != -1) {
			if(n.length() > Max) {
				return false;
			}else {
				return true;
			}
		}
		
		else if(Min != -1 && Max == -1) {
			if(n.length() < Min) {
				return false;
			}else {
				return true;
			}
		}else{
			if(n.length() < Min || n.length() > Max) {
				return false;
			}else {
				return true;
			}
		}
		
		
	}
	
	public String getMessage() {
	 
		return "[String length is not between ["+Min+" , "+Max+ "]";
	}
	
	
}
