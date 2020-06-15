package com.thoughtworks.MarsRover;

/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 17:01
 */
public class MarsRover {

    Position position = new Position();

    public void init() {
        position.setX(0);
        position.setY(0);
        position.setDirection(0);
    }

    private void left() {
        int direction = position.getDirection();

        direction -= 1;

        position.setDirection(direction);
    }

    private void right() {
        int direction = position.getDirection();

        direction += 1;

        position.setDirection(direction);
    }


    private void move() {
        switch (position.getDirectionToChar()) {
            case 'N':
                position.setY(position.getY() + 1);
                break;
            case 'S':
                position.setY(position.getY() - 1);
                break;
            case 'E':
                position.setX(position.getX() + 1);
                break;
            case 'W':
                position.setX(position.getX() - 1);
                break;
            default:
                break;
        }
    }

    public String execute(String cmd){
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

        return this.position.toString();
    }
}
