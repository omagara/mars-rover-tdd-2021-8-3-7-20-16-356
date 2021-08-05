package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }

    public void executeCommand(String commands) {
        for (String command : commands.split("")) {
            if (command.equals("M")) {
                move();
            }

            if (command.equals("L")) {
                turnLeft();
            }

            if (command.equals("R")) {
                turnRight();
            }
        }
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if(direction.equals("N")){
            newDirection = "E";
        }

        if(direction.equals("S")){
            newDirection = "W";
        }

        if(direction.equals("E")){
            newDirection = "S";
        }

        if(direction.equals("W")){
            newDirection = "N";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if(direction.equals("N")){
            newDirection = "W";
        }

        if(direction.equals("S")){
            newDirection = "E";
        }

        if(direction.equals("E")){
            newDirection = "N";
        }

        if(direction.equals("W")){
            newDirection = "S";
        }
        roverStatus = new RoverStatus(locationX, locationY, newDirection);
    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if(roverStatus.getDirection().equals("N")) {
            roverStatus = new RoverStatus(locationX, locationY + 1, direction);
        }
        if(roverStatus.getDirection().equals("S")) {
            roverStatus = new RoverStatus(locationX, locationY - 1, direction);
        }
        if(roverStatus.getDirection().equals("E")) {
            roverStatus = new RoverStatus(locationX+1, locationY, direction);
        }
        if(roverStatus.getDirection().equals("W")) {
            roverStatus = new RoverStatus(locationX-1, locationY, direction);
        }
    }
}
