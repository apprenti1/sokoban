package com.gitlab.sokoban.domain.model;

import java.util.List;

public record Map(Size size, List<Tile> tiles) {

    public boolean isWall(Position position) {
        return tiles.stream().anyMatch(tile -> tile.position().equals(position) && tile.type() == State.WALL);
    }

    public boolean inside(Position position) {
        return position.x() >= 0 && position.x() < size.width() && position.y() >= 0 && position.y() < size.height();
    }

}

