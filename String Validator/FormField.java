package validation;
import java.util.*;

import validation.LengthValidator;
import validation.StringValidator;

public class FormField {

    public ArrayList<StringValidator> validators;
    public String name;
    private String value;

    public FormField(String fieldName, ArrayList<StringValidator> validators) {
        this.validators = validators;
        this.name = fieldName;
        this.value = null;
    }

    /**
     * @param value if no error happens value is set;
     * @return errors
     */
    public ArrayList<String> setValue(String value) {
        ArrayList<String> errors = new ArrayList<>();
        for (StringValidator validator : this.validators) {
            if (!validator.validate(value))
                errors.add(validator.getMessage());
        }
        if (errors.isEmpty())
            this.value = value;
        return errors;
    }

    public String getValue() {
        return value;
    }
}
