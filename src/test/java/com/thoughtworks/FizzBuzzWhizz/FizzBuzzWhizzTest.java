package com.thoughtworks.FizzBuzzWhizz;

import org.junit.Test;

public class FizzBuzzWhizzTest {
    @Test
    public void should_return_1_given_1(){
        this.should_return_expect_given_number(1, "1");
    }

    @Test
    public void should_return_Fizz_given_3(){
        this.should_return_expect_given_number(3,"Fizz");
    }

    @Test
    public void should_return_Buzz_given_5(){
        this.should_return_expect_given_number(5,"Buzz");
    }

    @Test
    public void should_return_Whizz_given_7(){
        this.should_return_expect_given_number(7,"Whizz");
    }

    @Test
    public void should_return_FizzBuzz_given_15(){
        this.should_return_expect_given_number(15,"FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_given_21(){
        this.should_return_expect_given_number(21,"FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_given_35(){
        this.should_return_expect_given_number(35,"BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_105(){
        this.should_return_expect_given_number(105,"FizzBuzzWhizz");
    }

    @Test
    public void should_return_Fizz_given_30(){
        this.should_return_expect_given_number_rule4_5(30,"Fizz");
    }

    @Test
    public void should_return_Fizz_given_13(){
        this.should_return_expect_given_number_rule4_5(13,"Fizz");
    }

    @Test
    public void should_return_6_given_6(){
        this.should_return_expect_given_number_rule4_5(6,"6");
    }

    void should_return_expect_given_number(int number, String expect){
        // given
        int num = number;

        // when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizzImpl();
        String result = fizzBuzzWhizz.say(num);

        // then
        assert result.equals(expect);

    }

    void should_return_expect_given_number_rule4_5(int number, String expect){
        // given
        int num = number;

        // when
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizzImplRule4_5();
        String result = fizzBuzzWhizz.say(num);

        // then
        assert result.equals(expect);

    }
}