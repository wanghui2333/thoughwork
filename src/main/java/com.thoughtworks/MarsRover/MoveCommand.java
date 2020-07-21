package com.thoughtworks.MarsRover;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-07-21 19:52
 */
public class MoveCommand implements Command {



    @Override
    public void action(char c, MarsRover marsRover) {

        if (c == CommandConstant.MOVE){
            this.move(marsRover);
        }
    }

    private void move(MarsRover marsRover) {

        Position position = marsRover.getPosition();

        switch (position.getDirection()) {
            case NORTH:
                position.setY(position.getY() + 1);
                break;
            case SOUTH:
                position.setY(position.getY() - 1);
                break;
            case EAST:
                position.setX(position.getX() + 1);
                break;
            case WEST:
                position.setX(position.getX() - 1);
                break;
            default:
                break;
        }
    }
}
