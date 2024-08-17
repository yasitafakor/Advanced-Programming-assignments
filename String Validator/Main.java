package validation;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	    // we collect errors in this ArrayList
	    ArrayList<String> errors;
	    // name should be at least 3 and at most 20 characters
	    ArrayList<StringValidator> nameValidators = new ArrayList<>();
	    nameValidators.add(new LengthValidator(3, 10));
	    FormField nameField = new FormField("name", nameValidators);

	    errors = nameField.setValue("ab");
	    System.out.println("errors for string \"ab\"");
	    System.out.println(errors.toString());

	    errors = nameField.setValue("12345678901");
	    System.out.println("errors for string \"12345678901\"");
	    System.out.println(errors.toString());

	    errors = nameField.setValue("majid");
	    if (errors.isEmpty()) {
	        System.out.printf("no errors, field value is \"%s\"\n", nameField.getValue());
	    }

	    //email should be an email address and at most 12 characters
	    ArrayList<StringValidator> emailValidators = new ArrayList<>();
	    emailValidators.add(new EmailValidator());
	    emailValidators.add(new LengthValidator(-1, 11));
	    FormField emailField = new FormField("email", emailValidators);

	    System.out.println("Testing emailField:");

	    errors = emailField.setValue("lorem@gmail");
	    System.out.println("errors for string \"loremipsum@gmail\"");
	    System.out.println(errors.toString());

	    errors = emailField.setValue("b@gmail.com");

	    if (errors.isEmpty()) {
	        System.out.printf("no errors, field value is \"%s\"\n", emailField.getValue());
	    }

	}
}
