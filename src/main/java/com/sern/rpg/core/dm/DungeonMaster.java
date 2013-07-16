package com.sern.rpg.core.dm;

import com.sern.rpg.core.character.enemy.Enemy;
import com.sern.rpg.core.character.enemy.EnemyFactory;

public abstract class DungeonMaster {
    
    public Enemy generateEnemy() {
        return EnemyFactory.getInstance().getRandomEnemy();
    }
}
