package com.thoughtworks.FizzBuzzWhizz;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 11:57
 */
class FizzBuzzWhizzImplRule6 implements FizzBuzzWhizz {


    @Override
    public String say(int num) {
        String number = String.valueOf(num);
        String result = "";
        String buzz = "Buzz";
        String whizz = "Whizz";

        if (number.contains("5") || num % 5 == 0) {
            result += buzz;
        }

        if (num % 7 == 0) {
            result += whizz;
        }

        if ("".equals(result)) {
            result = String.valueOf(num);
        }

        return result;
    }
}
