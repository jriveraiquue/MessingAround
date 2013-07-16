package com.sern.rpg.core.service;

public class ModifierServiceFactory {
    static private ModifierService instance;
    
    protected ModifierServiceFactory() {
    }
    
    public ModifierServiceFactory(ModifierService singleton) {
        instance = singleton;
    }
    
    static public ModifierService getInstance() {
        return instance;
    }
    
    public void setModifierService(ModifierService singleton) {
        instance = singleton;
    }
}
