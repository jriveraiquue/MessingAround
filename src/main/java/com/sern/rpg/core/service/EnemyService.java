package com.sern.rpg.core.service;

import java.util.HashMap;
import java.util.Map;

import com.sern.rpg.core.character.enemy.Enemy;

public abstract class EnemyService {
    Map<String, Enemy> enemies = new HashMap<String, Enemy>();
    
    abstract public void loadAllEnemies();
    
    public Map<String, Enemy> getEnemies() {
        if (enemies.isEmpty()) {
            loadAllEnemies();
        }
        return enemies;
    }
    
    public boolean addEnemy(String name, Enemy enemy) {
        boolean success = false;
        if (enemies.isEmpty()) {
            loadAllEnemies();
        }
        
        try {
            enemies.put(name, enemy);
            success = true;
        }
        catch (Exception e) {
        }
        
        return success;
    }
    
    public boolean removeEnemy(String key) {
        boolean success = false;
        if (enemies.isEmpty()) {
            loadAllEnemies();
        }
        
        try {
            enemies.remove(key);
            success = true;
        }
        catch (Exception e) {
        }
        
        return success;
    }
    
    public boolean removeEnemy(Enemy enemy) {
        boolean success = false;
        if (enemies.isEmpty()) {
            loadAllEnemies();
        }
        
        try {
            String key = null;
            for (String modKey : enemies.keySet()) {
                if (enemies.get(modKey).equals(enemy)) {
                    key = modKey;
                    break;
                }
            }
            enemies.remove(key);
            success = true;
        }
        catch (Exception e) {
        }
        
        return success;
    }
}
