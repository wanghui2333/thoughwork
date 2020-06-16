package com.thoughtworks.MarsRover;

import org.junit.Test;


public class MarsRoverTest {

    @Test
    public void should_return_0_4_N_given_MMMM() {

        String cmd = "MMMM";
        MarsRover marsRover = new MarsRover();

        String actual = marsRover.execute(cmd);

        String expect = "(0,4)N";

        assert expect.equals(actual);
    }

    @Test
    public void should_return_0_0_N_given_LLLL() {

        String cmd = "LLLL";
        MarsRover marsRover = new MarsRover();

        String actual = marsRover.execute(cmd);

        String expect = "(0,0)N";
        assert expect.equals(actual);
    }

    @Test
    public void should_return__2_1_N_given_MLMMR() {

        String cmd = "MLMMR";
        MarsRover marsRover = new MarsRover();

        String actual = marsRover.execute(cmd);

        String expect = "(-2,1)N";

        assert expect.equals(actual);
    }

    @Test
    public void should_return_1_0_N_given_M() {

        // given
        String cmd = "M";
        MarsRover marsRover = new MarsRover();

        // when
        String actual = marsRover.execute(cmd);

        // then
        String expect = "(0,1)N";

        assert expect.equals(actual);
    }

    @Test
    public void should_return_0_0_W_given_L() {

        String cmd = "L";
        MarsRover marsRover = new MarsRover();

        String actual = marsRover.execute(cmd);

        String expect = "(0,0)W";

        assert expect.equals(actual);
    }

    @Test
    public void should_return_0_0_E_given_R() {

        String cmd = "R";
        MarsRover marsRover = new MarsRover();

        String actual = marsRover.execute(cmd);

        String expect = "(0,0)E";

        assert expect.equals(actual);
    }

}