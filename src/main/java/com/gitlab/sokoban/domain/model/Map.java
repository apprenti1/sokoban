package com.gitlab.sokoban.domain.model;

import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.Size;
import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;

import java.util.List;

public record Map(Size size, List<List<Tile>> tiles) {

    public boolean isWall(Position position) {
        return tiles.get(position.y()).get(position.x()).type() == State.WALL;
    }

    public boolean inside(Position position) {
        return position.x() >= 0 && position.x() < size.width() && position.y() >= 0 && position.y() < size.height();
    }

}

