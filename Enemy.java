/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysticbyte;

import java.util.Random;

/**
 *
 * @author Tapiwa Clifford Chinyani
 */
public abstract class Enemy 
{
       /*
    -The variables in the Enemy class use protected access modifiers as we need 
    our inheriting subclasses to be able to access them.
    */
    protected String name;
    protected int HP;
    
    
    public Enemy (String name, int HP)
    {
        /*
        -we have no fixed variables since our inheriting classes dont have 
        the same name and HP
        */
        this.name = name;
        this.HP = HP;
    }
    
    /*
    -I don't have any setters for these varibles since the enemy name does not 
    change and the HP is already changed/handled by the takeDamage method.
    */
    public String getName(){return name;}
    public int getHP () {return HP;}
    
    /*
    -randomCounterAttack is our method that makes sure that the enemies counter 
    attack damage is chosen at random.
    */
    public int randomCounterAttack ()
    {
        Random rand = new Random();
        return rand.nextInt(4) + 3;
    }
    
    /*
    -This method ensures that our enemies HP reduces when they take damage
    -The if statement prevents the enemies HP from going beyond 0
    */
     public void takeDamage (int damage)
    {
        HP -= damage;
        if (HP < 0)
        {
            HP = 0;
        }
            
    }
    
    /*
    -Both enemies are affected by the Basic_Strike which means the boolean will
    always return true for both enemies.
    */
    public boolean weakToBasic()
    {
        return true;
    }
    
    /*
    -Each enemy is immune to at least 1 attack.
    -Our boolean conditions are abstract because each enemy is affected by them 
    in different ways.
    */
    public abstract boolean weakToPrime();
    public abstract boolean weakToModulus();
    
}
