package com.thoughtworks.MarsRover;


/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 17:18
 */
public class Position {
    char[] directionChar = {'N', 'E', 'S', 'W'};

    int x = 0;
    int y = 0;
    int direction = 0;

    public char getDirectionToChar() {
        return directionChar[direction];
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {

        while (direction < 0) {
            direction += 4;
        }

        direction %= 4;

        this.direction = direction;
    }

    @Override
    public String toString() {
        return "(" + x +"," + y + ")" + getDirectionToChar();
    }
}
