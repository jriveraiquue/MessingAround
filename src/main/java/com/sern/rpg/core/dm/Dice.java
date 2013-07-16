package com.sern.rpg.core.dm;

import java.util.Random;

/**
 * The Dice class contains all standard and non-standard dice from the D2 to the D100
 * 
 * You can roll a die by calling Dice.roll(die) with one of the die that are available. Multiple dice can be rolled with
 * Dice.roll(count, die). Modifiers can be used to adjust the value of rolls with Dice.roll(count, die, modifier)
 *
 */
public class Dice {
    static public int D2    = 2;
    static public int D3    = 3;
    static public int D4    = 4;
    static public int D5    = 5;
    static public int D6    = 6;
    static public int D7    = 7;
    static public int D8    = 8;
    static public int D10   = 10;
    static public int D12   = 12;
    static public int D14   = 14;
    static public int D16   = 16;
    static public int D20   = 20;
    static public int D24   = 24;
    static public int D30   = 30;
    static public int D34   = 34;
    static public int D50   = 50;
    static public int D60   = 60;
    static public int D100  = 100;
    
    static private Random rand = new Random();
    
    /**
     * Roll a die and get the value
     * @param die The die to roll
     * @return The value determined by rolling the die. Ex: roll(Dice.D6) will return a value between 1 and 6
     */
    static public int roll(int die) {
        return rand.nextInt(die) + 1;
    }
    
    /**
     * Roll a set of dice and get the total value
     * @param count The number of dice to roll
     * @param die The die to roll
     * @return The value determined by rolling the dice. Ex: roll(2, Dice.D6) will return a value between 2 and 12
     */
    static public int roll(int count, int die) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += roll(die);
        }
        return total;
    }
    
    /**
     * Roll a set of dice and get the total value after being adjusted by a modifier
     * @param count The number of dice to roll
     * @param die The die to roll
     * @param modifier The amount to add (or remove) from the dice roll value
     * @return The value determined by rolling the dice. Ex: roll(2, Dice.D6, -3) will return a value between -1 and 9
     */
    static public int roll(int count, int die, int modifier) {
        return roll(count, die) + modifier;
    }
}
