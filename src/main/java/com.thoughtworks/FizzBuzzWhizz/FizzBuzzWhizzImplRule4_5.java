package com.thoughtworks.FizzBuzzWhizz;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 11:57
 */
class FizzBuzzWhizzImplRule4_5 implements FizzBuzzWhizz {


    @Override
    public String say(int num) {
        String number = String.valueOf(num);
        String result = "";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String whizz = "Whizz";

        if (number.contains("3")) {
            result += fizz;
        }

        if (number.contains("5")) {
            result += buzz;
        }

        if (number.contains("7")) {
            result += whizz;
        }

        if ("".equals(result)) {
            result = String.valueOf(num);
        }

        return result;
    }
}
