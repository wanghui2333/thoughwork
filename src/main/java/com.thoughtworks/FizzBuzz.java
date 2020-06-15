package com.thoughtworks;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 11:57
 */
class FizzBuzz {
    String say(int num) {

        String result = "";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String whizz = "Whizz";

        if (num % 3 == 0) {
            result += fizz;
        }

        if (num % 5 == 0) {
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

    public String say_rule4_5(int num) {
        String number = String.valueOf(num);
        String result = "";
        String fizz = "Fizz";

        if (number.contains("3")) {
            result += fizz;
        }

        if ("".equals(result)) {
            result = String.valueOf(num);
        }

        return result;
    }
}
