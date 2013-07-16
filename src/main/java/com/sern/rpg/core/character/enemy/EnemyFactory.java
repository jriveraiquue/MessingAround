package com.sern.rpg.core.character.enemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.sern.rpg.core.service.EnemyServiceFactory;

public class EnemyFactory {
    static private EnemyFactory instance = new EnemyFactory();
    
    static public EnemyFactory getInstance() {
        return instance;
    }
    
    public Enemy getEnemy(String name) {
        Map<String, Enemy> enemies = EnemyServiceFactory.getInstance().getEnemies();
        return enemies.get(name);
    }
    
    public Enemy getRandomEnemy() {
        Map<String, Enemy> enemies = EnemyServiceFactory.getInstance().getEnemies();
        Random rand = new Random();
        int index = rand.nextInt(enemies.size());
        List<String> keys = new ArrayList<String>(enemies.keySet());
        String key = keys.get(index);
        return enemies.get(key);
    }
}
