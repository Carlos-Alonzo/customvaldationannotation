package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class FirstCapLetterValidator implements ConstraintValidator<FirstCapLetter, String>
{
    @Override public void initialize(FirstCapLetter firstCapLetter) {}
    @Override public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext)
    {
        return Pattern.matches("[A-Z]", s.subSequence(0,1));
    }
}