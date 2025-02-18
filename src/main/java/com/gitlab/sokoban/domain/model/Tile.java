package com.gitlab.sokoban.domain.model;

public class Tile {
    private final int x;
    private final int y;
    private final State type;

    public Tile(int x, int y, State type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public State getType() { return type; }
}
