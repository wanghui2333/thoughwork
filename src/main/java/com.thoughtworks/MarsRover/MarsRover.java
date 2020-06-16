package com.thoughtworks.MarsRover;

import static com.thoughtworks.MarsRover.Direction.NORTH;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 17:01
 */
public class MarsRover {

    char[] directionChar = {'N', 'E', 'S', 'W'};

    private Position position = new Position();

    public MarsRover init() {
        position.setX(0);
        position.setY(0);
        position.setDirection(NORTH);

        return this;
    }

    public MarsRover init(int x, int y, Direction direction) {
        position.setX(x);
        position.setY(y);
        position.setDirection(direction);

        return this;
    }

    private char getDirectionToChar() {
        return directionChar[position.getDirection().value()];
    }

    private void left() {
        int direction = position.getDirection().value();

        direction--;

        position.setDirection(Direction.valueOf(direction));
    }

    private void right() {
        int direction = position.getDirection().value();

        direction++;

        position.setDirection(Direction.valueOf(direction));
    }


    private void move() {

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

    public String execute(String cmd) {
        char[] cmds = cmd.toCharArray();

        for (char c : cmds) {
            switch (c) {
                case 'L':
                    this.left();
                    break;
                case 'R':
                    this.right();
                    break;
                case 'M':
                    this.move();
                    break;
                default:
                    break;
            }
        }

        return this.displayPosition();
    }

    public String displayPosition() {
        return "(" + position.getX() +"," + position.getY() + ")" + getDirectionToChar();
    }
}
