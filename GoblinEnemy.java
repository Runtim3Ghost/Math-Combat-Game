/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysticbyte;

/**
 *
 * @author Tapiwa Clifford Chinyani
 */
public class GoblinEnemy extends Enemy
{
    public GoblinEnemy()
    {
        super("Goblin", 17);
    }

    @Override
    public boolean weakToPrime ()
    {
        //This statement checks if the enemies HP is a prime number
        if (HP <= 1) return false;
        for (int i = 2; i <= HP/2; i++)
        {
            if (HP % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    //Modulus_Strike has no effective on the Goblin enemy.
    @Override
    public boolean weakToModulus ()
    {
        return false;
    } 
}
