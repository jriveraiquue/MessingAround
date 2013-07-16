package com.sern.rpg.core.character.modifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.sern.rpg.core.service.ModifierServiceFactory;

public class ModifierFactory {
    static private ModifierFactory instance = new ModifierFactory();
    
    static public ModifierFactory getInstance() {
        return instance;
    }
    
    public Modifier getModifier(String name) {
        Map<String, Modifier> modifiers = ModifierServiceFactory.getInstance().getModifiers();
        return modifiers.get(name);
    }
    
    public Modifier getRandomModifier() {
        Map<String, Modifier> modifiers = ModifierServiceFactory.getInstance().getModifiers();
        Random rand = new Random();
        int index = rand.nextInt(modifiers.size());
        List<String> keys = new ArrayList<String>(modifiers.keySet());
        String key = keys.get(index);
        return modifiers.get(key);
    }
}
