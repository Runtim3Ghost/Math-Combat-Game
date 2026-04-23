/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysticbyte;

/**
 *
 * @author Tapiwa Clifford Chinyani
 */
public class SlimeEnemy extends Enemy
{
    public SlimeEnemy()
    { 
        /*
        -We use super to inherit the variables from the Enemy class which we are
        now going to set in our subclasses
        */
        super("Slime", 15);
    }
    
    //Slime Enemy is not affected by any Prime_Strike attacks hence why it returns false.
    @Override
    public boolean weakToPrime ()
    {
        return false;
    }
    
    /*
    -Slime enemy is weak to modulus attacks only if the current in game HP is 
    divisable by 3.
    */
    @Override
    public boolean weakToModulus ()
    {
        return HP % 3 == 0;
    }
}

