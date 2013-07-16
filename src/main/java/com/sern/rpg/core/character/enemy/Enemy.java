package com.sern.rpg.core.character.enemy;

import com.sern.rpg.core.character.Character;

public abstract class Enemy extends Character {

    public Enemy(int level, String name, int health) {
        super(level, name, health);
    }
    
}
