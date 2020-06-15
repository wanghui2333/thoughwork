package com.thoughtworks.MarsRover;

import org.junit.Test;


public class MarsRoverTest {

    @Test
    public void should_return_0_4_N_given_MMMM() {

        String cmd = "MMMM";
        MarsRover marsRover = new MarsRover();
        marsRover.init();

        String actual = marsRover.execute(cmd);

        String expect = "(0,4)N";

        assert expect.equals(actual);
    }

    @Test
    public void should_return_0_0_N_given_LLLL() {

        String cmd = "LLLL";
        MarsRover marsRover = new MarsRover();
        marsRover.init();

        String actual = marsRover.execute(cmd);

        String expect = "(0,0)N";
        System.out.println(actual);
        assert expect.equals(actual);
    }

    @Test
    public void should_return__2_1_N_given_MLMMR() {

        String cmd = "MLMMR";
        MarsRover marsRover = new MarsRover();
        marsRover.init();

        String actual = marsRover.execute(cmd);

        String expect = "(-2,1)N";

        assert expect.equals(actual);
    }
}