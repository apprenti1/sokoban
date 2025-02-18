package com.gitlab.sokoban.domain.model;

public class Tile {
    private final Position position;
    private final State state;

    public Tile(Position position, State state) {
        this.position = position;
        this.state = state;
    }

    public Position getPosition() {
        return position;
    }

    public State getState() {
        return state;
    }

}

