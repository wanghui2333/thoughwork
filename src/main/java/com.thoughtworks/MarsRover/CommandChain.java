package com.thoughtworks.MarsRover;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 功能描述 : 小车移动命令
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-07-21 19:46
 */
public class CommandChain {

    private List<Command> commands = new ArrayList<>();

    public void excute(char c, MarsRover marsRover){
        commands.stream().forEach(command -> command.action(c, marsRover));
    }

    public void addCommand(Command command){
        commands.add(command);
    }

}
