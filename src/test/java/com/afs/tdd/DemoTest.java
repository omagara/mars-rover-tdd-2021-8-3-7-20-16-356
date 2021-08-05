package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DemoTest {

    @Test
    void should_return_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 1, "N");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "W");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_N_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "E");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_negative_1_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, -1, "S");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "E");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "S"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "W");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_1_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(1, 0, "E");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "N");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "E"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "S");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_negative_1_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(-1, 0, "W");

        //when
        marsRover.executeCommand("M");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "S");

        //when
        marsRover.executeCommand("L");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "W"));
        RoverStatus expectedRoverStatus = new RoverStatus(0, 0, "N");

        //when
        marsRover.executeCommand("R");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }

    @Test
    void should_return_final_location_and_direction_when_execute_command_given_initial_location_and_direction_and_commands() {
        //given
        MarsRover marsRover = new MarsRover(new RoverStatus(0, 0, "N"));
        RoverStatus expectedRoverStatus = new RoverStatus(-2, 2, "N");

        //when
        marsRover.executeCommand("MLMRMLMR");

        //then
        assertThat(marsRover.getRoverStatus().getLocationX()).isEqualTo(expectedRoverStatus.getLocationX());
        assertThat(marsRover.getRoverStatus().getLocationY()).isEqualTo(expectedRoverStatus.getLocationY());
        assertThat(marsRover.getRoverStatus().getDirection()).isEqualTo(expectedRoverStatus.getDirection());
    }
}
