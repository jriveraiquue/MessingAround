package com.sern.rpg.core.character;

import java.util.Set;

import com.sern.rpg.core.character.modifier.Modifier;
import com.sern.rpg.core.character.special.Special;

public class Character {
    private String name;
    protected int level = 0;
    private int maxHealth = 0;
    private int currentHealth = 0;
    private int bonus = 0;
    private Set<Modifier> modifiers;
    private Special special;
    
    public Character(int level, String name, int health) {
        setName(name);
        setMaxHealth(health);
        this.currentHealth = health;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addModifier(Modifier modifier) {
        modifiers.add(modifier);
    }
    
    public Set<Modifier> getModifiers() {
        return modifiers;
    }
    
    /**
     * Set the health of the generated character. This is only called on character creation
     * @param maxHealth The character's starting maximum health
     */
    protected void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    
    /**
     * Adjust the maximum health of a character. Ex: Update on level, modifier
     * @param amount The value to adjust the maximum health with. Positive values to increase, negative to decrease
     */
    public void adjustMaxHealth(int amount) {
        maxHealth += amount;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    
    /**
     * Adjust the current health of a character. Ex: Update on damage
     * @param amount The value to adjust the current health with. Positive values to increase, negative to decrease
     */
    public void adjustHealth(int amount) {
        currentHealth += amount;
    }
    
    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    /**
     * Set the special ability for the character. This can only be set at creation time.
     * @param special The special ability to set on the character
     */
    protected void setSpecial(Special special) {
        this.special = special;
    }

    public Special getSpecial() {
        return special;
    }

    /**
     * Check to see if the character has a special they can use
     * @return True if the special attribute is not null, false otherwise
     */
    public boolean hasSpecial() {
        return special != null;
    }
    
    protected void setLevel(int level) {
        this.level = level;
    }
    
    public int getLevel() {
        return level;
    }
    
}
