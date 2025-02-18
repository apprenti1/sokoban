package com.gitlab.sokoban.domain.model;

import java.util.List;

public class Sokoban {
    private Carte map; // map de tiles
    private List<Position> storage; // positions stockage de boites
    private List<Position> wall; // position des murs
    private Position position; // position du joueur
    private Size size; // taille de la map

    public List<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

    private List<Tile> tiles;

    public Carte getMap() {
        return map;
    }

    public void setMap(Carte map) {
        this.map = map;
    }

    public List<Position> getStorage() {
        return storage;
    }

    public void setStorage(List<Position> storage) {
        this.storage = storage;
    }

    public List<Position> getWall() {
        return wall;
    }

    public void setWall(List<Position> wall) {
        this.wall = wall;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Sokoban(Carte map, List<Position> storage, List<Position> wall, Position position) {
        this.map = map;
        this.size = new Size(map.getWidth(), map.getHeight());
        this.storage = storage;
        this.wall = wall;
        this.position = position;
    }

    public void move(Position position) {

    }
}