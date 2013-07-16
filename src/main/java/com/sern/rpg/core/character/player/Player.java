package com.sern.rpg.core.character.player;

import com.sern.rpg.core.character.Character;

public class Player extends Character {

    public Player(int level, String name, int health) {
        super(level, name, health);
    }
    
    public void levelUp() {
        this.level++;
    }

}
