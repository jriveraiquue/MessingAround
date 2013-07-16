package com.sern.rpg.core.character.modifier;

import com.sern.rpg.core.character.special.Special;

public class Modifier {
    private String name;
    private Special special;
    
    /**
     * Set the name of the modifier. The name will be prepended to modified characters. This is only called on creation
     * @param name The name of the modifier that will be applied to modified characters
     */
    protected void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    /**
     * Set the special ability for the modifier. This ability can later be applied to a character. This is only called on creation
     * @param special The special ability to apply with the modifier
     */
    protected void setSpecial(Special special) {
        this.special = special;
    }
    
    public Special getSpecial() {
        return special;
    }
}
