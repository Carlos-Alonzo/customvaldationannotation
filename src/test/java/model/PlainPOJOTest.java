package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


class PlainPOJOTest
{
    ValidatorFactory  factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    @BeforeEach
    void setUp()
    {

    }
    @Test
    void newInstance()
    {
        //setup
        var objectUnderTest = PlainPOJO.newInstance(23, "camelCase");
        //execute
        Set<ConstraintViolation<PlainPOJO>> violations = validator.validate(objectUnderTest);
        //verify
        assertThat(violations).singleElement().hasFieldOrPropertyWithValue("message", "First letter must be capitalized");
    }
}