package com.gitlab.sokoban.domain.model;

public enum State {
    WALL,
    EMPTY,
    PLAYER,
    BOX,
    STORAGE_CASE,
    STORED_BOX,
}

//- [WALL] Mur : rien ne peut être déplacé sur cette case
//- [EMPTY] Sol : une case libre sur laquelle le joueur ou une caisse peut être déplacé
//- [PLAYER] Joueur : la position actuelle du joueur
//- [BOX] Caisse : une caisse à déplacer vers une case de stockage
//- [STORAGE_CASE] Case de stockage : une case de sol marquée comme la destination pour une caisse
//- [STORED_BOX] Caisse Stockée : une caisse se trouvant sur une case de stockage

