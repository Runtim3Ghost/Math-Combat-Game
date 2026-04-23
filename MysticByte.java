/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mysticbyte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tapiwa Clifford Chinyani
 */

public class MysticByte {

    public static void main(String[] args) throws IOException 
    {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        Player player = new Player (); //Object for our Player class
        System.out.println("Please Enter name (Letters Only)");
        String input = scanner.nextLine();
        
        while (!player.validatePlayerName(input))//Keeps asking for the correct name before exiting the loop
        {
            System.out.println("Invalid Name. Please use Letters Only!");
            System.out.println("Please Enter name (Letters Only)");
            input = scanner.nextLine();
        }
        player.setName(input);// Set the players name
        
        System.out.println("Welcome to Math Quest: The Enchanted Numbers!");
        System.out.println("Greetings Sir/Madam, " + player.getName() + " ,You have an HP of " + player.getHP());
        
        //The system chooses the enemy at random
        Enemy enemy;
        if (random.nextBoolean()) 
        {
            enemy = new SlimeEnemy();
        }
        else
        {
            enemy = new GoblinEnemy();
        }
        System.out.println("A " + enemy.getName() + " appears with " + enemy.getHP() + " HP!");
        
        //Array List that stores our attack types and thier respective damages
        ArrayList<Attack> attacks = new ArrayList<Attack>();
        attacks.add(new Attack(AttackType.BASIC_STRIKE, 3));
        attacks.add(new Attack(AttackType.PRIME_STRIKE, 4));
        attacks.add(new Attack(AttackType.MODULUS_STRIKE, 5));
        
        while (player.getHP() > 0 && enemy.getHP() > 0)
        {
            
           System.out.println("Choose your attack: \nBasic Attack: 1 \nPrime Attack: 2 \nModulus Attack: 3");
           int choice = scanner.nextInt();
           
           //Ensures that the user doesn't choose a number out range
           if (choice < 1 || choice > 3)
           {
               System.out.println("Invaild choice! Please choose 1, 2 or 3.\n");
               continue;
           }
           
           Attack chosenAttack = attacks.get(choice - 1); //Selects an attack from the ArrayList attacks.
           boolean effectiveAttack = chosenAttack.attackIsEffective(enemy);//checks if the chosen attack is effective
           int damage = effectiveAttack ? chosenAttack.getDamage() : 0;
           enemy.takeDamage(damage);//If the attack if effective, the enemies HP is reduced
    
            /*
            -If the attack is effective the player deals damage to the enemy 
             and gets 10 points.
            -If the attack is not effective, the enemy takes no damage and the 
             player doesn't get any points.
           */
            if (effectiveAttack)
            {
                System.out.println("Your attack was effective! You hit the " + enemy.getName() + " for: " + damage + " damage!");
                player.addScore(10);
                System.out.println("Score:  " + player.getScore());
            }
            else
            {
                System.out.println("Your attack was ineffective! The " + enemy.getName() + " takes no damage");
            }
            
            /*
            -If the enemies HP > 0, the enemy does a random counter 
            attack on the player and reduces the players HP.
            */ 
            if (enemy.getHP() > 0) 
            {
               int counter = enemy.randomCounterAttack();
               player.takeDamage(counter);
               System.out.println(enemy.getName() + " hit you for " + counter + " damage!\n");
               System.out.println(player.getName() + " | " + player.getHP() + "HP");
               System.out.println(enemy.getName() + " |" + enemy.getHP() + "HP");
            }
        }
        
        /*
        -If the players HP is equal to 0, the game ends and the enemy wins.
        -If the enemy HP = 0, the game ends and the player wins.
        */
        if (player.getHP() == 0)
        {
            System.out.println("You were defeated! Final score: " + player.getScore());
        }
        else if (enemy.getHP() == 0)
        {
            System.out.println("Congratulations Warrior! You defeated the " + enemy.getName() + "  | Final score: " + player.getScore());
        }
        
        //saves the players name and their score on a text file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter ("scores.txt", true)))
        {
            writer.write(player.getName() + ": " + player.getScore() + "\n");
            System.out.println("Your score has been recorded!");
        }
        catch (IOException e)
        {
            System.out.println("Error. Your score could not be saved");
        }
        scanner.close();
    }
}
