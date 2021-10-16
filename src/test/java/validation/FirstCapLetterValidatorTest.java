package validation;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import javax.validation.ConstraintValidatorContext;

import static org.assertj.core.api.Assertions.assertThat;

class FirstCapLetterValidatorTest
{
    FirstCapLetterValidator objectUnderTest= null;
    @Mock ConstraintValidatorContext mockContext;

    @BeforeEach
    void setUp()
    {
        objectUnderTest = new FirstCapLetterValidator();
    }

    @Test
    void initialize()
    {

    }

    @Test
    void isValid()
    {
        assertThat(objectUnderTest.isValid("Chamus", mockContext)).isTrue();
        assertThat(objectUnderTest.isValid("chamus", mockContext)).isFalse();
    }
}