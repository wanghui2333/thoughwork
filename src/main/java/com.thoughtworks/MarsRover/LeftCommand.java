package com.thoughtworks.MarsRover;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-07-21 19:52
 */
public class LeftCommand implements Command {



    @Override
    public void action(char c, MarsRover marsRover) {

        if (c == CommandConstant.LEFT){
            this.left(marsRover);
        }
    }

    private void left(MarsRover marsRover) {

        Position position = marsRover.getPosition();

        int direction = position.getDirection().value();

        direction--;

        position.setDirection(Direction.valueOf(direction));
    }
}
