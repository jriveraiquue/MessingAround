package com.sern.rpg.core.service;

import java.util.HashMap;
import java.util.Map;

import com.sern.rpg.core.character.modifier.Modifier;

public abstract class ModifierService {
    Map<String, Modifier> modifiers = new HashMap<String, Modifier>();
    
    abstract public void loadAllModifiers();
    
    public Map<String, Modifier> getModifiers() {
        if (modifiers.isEmpty()) {
            loadAllModifiers();
        }
        return modifiers;
    }
    
    public boolean addModifier(String name, Modifier modifier) {
        boolean success = false;
        if (modifiers.isEmpty()) {
            loadAllModifiers();
        }
        
        try {
            modifiers.put(name, modifier);
            success = true;
        }
        catch (Exception e) {
        }
        
        return success;
    }
    
    public boolean removeModifier(String key) {
        boolean success = false;
        if (modifiers.isEmpty()) {
            loadAllModifiers();
        }
        
        try {
            modifiers.remove(key);
            success = true;
        }
        catch (Exception e) {
        }
        
        return success;
    }
    
    public boolean removeModifier(Modifier modifier) {
        boolean success = false;
        if (modifiers.isEmpty()) {
            loadAllModifiers();
        }
        
        try {
            String key = null;
            for (String modKey : modifiers.keySet()) {
                if (modifiers.get(modKey).equals(modifier)) {
                    key = modKey;
                    break;
                }
            }
            modifiers.remove(key);
            success = true;
        }
        catch (Exception e) {
        }
        
        return success;
    }
}
