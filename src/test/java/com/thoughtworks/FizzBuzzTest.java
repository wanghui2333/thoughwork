package com.thoughtworks;

import org.junit.Test;


public class FizzBuzzTest {


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

    void should_return_expect_given_number(int given, String actual){
        // given
        int num = given;

        // when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(num);

        // then
        assert result.equals(actual);

    }

}