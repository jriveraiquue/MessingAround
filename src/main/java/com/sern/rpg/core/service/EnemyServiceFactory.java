package com.sern.rpg.core.service;

public class EnemyServiceFactory {
    static private EnemyService instance;
    
    protected EnemyServiceFactory() {
    }
    
    public EnemyServiceFactory(EnemyService singleton) {
        instance = singleton;
    }
    
    static public EnemyService getInstance() {
        return instance;
    }
    
    public void setEnemyService(EnemyService singleton) {
        instance = singleton;
    }
}
