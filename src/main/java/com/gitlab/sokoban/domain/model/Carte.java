package com.gitlab.sokoban.domain.model;

import java.util.List;

public class Carte {
    private final List<Tile> tiles;
    private final int width;
    private final int height;

    public Carte(List<Tile> tiles, int width, int height) {
        this.tiles = tiles;
        this.width = width;
        this.height = height;
    }

    public List<Tile> getTiles() { return tiles; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}
