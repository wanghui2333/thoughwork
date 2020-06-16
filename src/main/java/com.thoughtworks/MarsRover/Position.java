package com.thoughtworks.MarsRover;


/**
 * 功能描述 : TODO
 *
 * @Author : wang hui
 * @Email : 793147654@qq.com
 * @Date : 2020-06-15 17:18
 */
public class Position {

    int xLeftBorder = -5;
    int xRightBorder = 5;
    int yLeftBorder = -5;
    int yRightBorder = 5;
    int x = 0;
    int y = 0;
    Direction direction = Direction.NORTH;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < xLeftBorder || x > xRightBorder){
            return;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < yLeftBorder || y > yRightBorder){
            return;
        }

        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {

        this.direction = direction;
    }
}
