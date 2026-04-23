# Math-Combat-Game
The Math Game is a Java console-based application that simulates a turn-based combat system between a player and enemies. The game integrates mathematical logic into gameplay mechanics, where attack success depends on number properties such as prime numbers and divisibility rules. The player battles against different monsters with varying health values, and the outcome is determined by logical and mathematical conditions applied during combat.

Tech Stack: Java, NetBeans, OOP, Console based input/output 

Game Mechanics:
Player: starts with 20HP, can choose from 3 attack types (Basic strike, Prime strike, Modulus strike), attacks depend on mathematical conditions
Enemies: Slime (15HP), Goblin (15HP), attacks randomly between values 3 - 6

Mathematical Logic System:
Basic attack always effective on either enemy, Prime strike effective when enemy HP is a prime number (effective on Goblin enemy only), Modulus attack effective when enemy HP is divisable with no remainder (effective on Slime enemy only)

Turn-Based System:
Player attacks first, enemy the counters with random attack damage, Turn continue until Player HP is at zero or Enemy HP is zero

Programming Concepts Demonstrated:
Conditional logic if/else, loops, random number generation, function/methods, basic game loop structure, state management (HP tracking)
