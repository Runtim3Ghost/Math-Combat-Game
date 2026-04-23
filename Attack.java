/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysticbyte;

/**
 *
 * @author Tapiwa Clifford Chinyani
 */
class Attack 
{
    private int type;
    private int damage;
    
    public Attack (int type, int damage)
    {
        this.type = type;
        this.damage = damage;
    }
    
    public int getType() {return type;}
    public int getDamage () {return damage;}
    
    //This boolean method checks if the attack is effective
    public boolean attackIsEffective (Enemy enemy)
    {
        /*
        -Used a switch statement to assign the effectiveness of each strike.
        */
        switch (type)
        {
            case AttackType.BASIC_STRIKE:
                return enemy.weakToBasic();
            case AttackType.PRIME_STRIKE:
                return enemy.weakToPrime();
            case AttackType.MODULUS_STRIKE:
                return enemy.weakToModulus();
            default://prevents the game from crashing if the user enters an unexpected value.
                return false;
        }
    }
}
