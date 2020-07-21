package com.thoughtworks.MarsRover;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-07-21 19:52
 */
public class BackCommand implements Command {

    @Override
    public void action(char c, MarsRover marsRover) {

        if (c == CommandConstant.BACK){
            marsRover.asternReverse();
        }
    }
}
