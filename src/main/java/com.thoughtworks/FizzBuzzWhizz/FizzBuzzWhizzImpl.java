package com.thoughtworks.FizzBuzzWhizz;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 11:57
 */
class FizzBuzzWhizzImpl implements FizzBuzzWhizz {

    @Override
    public String say(int num) {

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

}
