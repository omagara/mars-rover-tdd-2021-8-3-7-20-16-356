package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DemoTest {
//    0 0 N  M => 0 1 N
//    0 0 N  L =>  0 0 W
//    0 0 N  R => 0 0 E

    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,1,"N");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_and_L(){
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0,0,"N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0,0,"W");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }
}
