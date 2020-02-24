package wyzwanie.tddkata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void should_return_zero_for_empty_string() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String emptyString = "";

        //when
        Integer result = calculatorUnderTest.add(emptyString);

        //then
        assertThat(result, equalTo(0));
    }

    @Test
    public void should_return_value_for_string_with_one_value() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String stringWithValue= "4";


        //when
        Integer result = calculatorUnderTest.add(stringWithValue);

        //then
        assertThat(result, equalTo(4));
    }

}