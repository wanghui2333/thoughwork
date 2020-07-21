package com.thoughtworks.MarsRover;

/**
 * 功能描述 : 小车移动命令
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-07-21 19:46
 */
public interface Command {

    void action(char c, MarsRover marsRover);
}
