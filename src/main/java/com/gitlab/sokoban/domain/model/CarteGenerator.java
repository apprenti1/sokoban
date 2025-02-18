package com.gitlab.sokoban.domain.model;

import java.util.ArrayList;
import java.util.List;

public class CarteGenerator {

    public static List<Tile> toTiles(String str) {
        List<Tile> tiles = new ArrayList<>();
        String[] lines = str.split("\n");

        for (int y = 2; y < lines.length; y++) {
            String line = lines[y];
            String content = line.substring(1).trim();

            for (int x = 0; x < content.length(); x++) {
                char c = content.charAt(x);
                State type = switch (c) {
                    case '#' -> State.WALL;
                    case '$' -> State.BOX;
                    case '.' -> State.STORAGE_CASE;
                    case '@' -> State.PLAYER;
                    default -> State.EMPTY;
                };
                tiles.add(new Tile(x, y - 2, type));
            }
        }
        return tiles;
    }


    public static Carte build(String str) {
        List<Tile> tiles = toTiles(str);

        int width = tiles.stream()
                .mapToInt(Tile::getX)
                .max()
                .orElse(0) + 1;

        int height = tiles.stream()
                .mapToInt(Tile::getY)
                .max()
                .orElse(0) + 1;

        return new Carte(tiles, width, height);
    }
}

