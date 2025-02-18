package com.gitlab.sokoban.domain.model;

import java.util.ArrayList;
import java.util.List;

public class CarteGenerator {

    public static List<Tile> toTiles(String str) {
        List<Tile> tiles = new ArrayList<>();
        String[] lines = str.split("\n");

        // Ignorer les deux premières lignes (numéros des colonnes)
        for (int y = 2; y < lines.length; y++) {
            String line = lines[y];
            // Ignorer l'index de la ligne
            String content = line.substring(1).trim();

            for (int x = 0; x < content.length(); x++) {
                char c = content.charAt(x);
                TileType type = switch (c) {
                    case '#' -> TileType.WALL;
                    case '$' -> TileType.BOX;
                    case '.' -> TileType.STORAGE;
                    case '@' -> TileType.PLAYER;
                    default -> TileType.FLOOR;
                };
                tiles.add(new Tile(x, y - 2, type));
            }
        }
        return tiles;
    }

    /**
     * Construit une carte à partir d'une chaîne de caractères
     * @param str La chaîne représentant la carte
     * @return La carte construite
     */
    public static Carte build(String str) {
        List<Tile> tiles = toTiles(str);

        // Calculer les dimensions de la carte
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

