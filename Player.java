/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mysticbyte;

/**
 *
 * @author Tapiwa Clifford Chinyani
 */
public class Player 
{
    
    private String name;
    private int HP;
    private int score;
    
    public Player ()
    {   
        //The players Health Points is set to 20 and thier score starts at 0
        this.HP = 20;
        this.score = 0;
    }
    
    /*
    -Getters and setters to allow outside classes and methods to access our 
    private varibles.
    */
    public String getName (){return name;}
    public void setName (String name) {this.name = name;}
    
    public int getHP () {return HP;}
    public void setHP (int HP) {this.HP = HP;}
    
    public int getScore () {return score;}
    public void setScore (int score) {this.score = score;}
    
    //This method vaildates our players name to make sure it uses letter only
    public boolean validatePlayerName (String name)
    {
        return name.matches("[a-zA-Z]+" );
    }
    
    /*
    -This is my takeDamage method which subtracts the users HP when the user 
    takes damage.
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
    -addScore is a method that is used to give points to a player when they do 
    an effective attack.
    */
    public void addScore (int points)
    {
        score += points;
    }
}

    
