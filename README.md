# 🎮 Math Game – Turn-Based Combat System

The Math Game is a Java console-based application that simulates a turn-based combat system between a player and enemies. The game integrates mathematical logic into gameplay mechanics, where attack success depends on number properties such as prime numbers and divisibility rules.

The player battles different enemies with varying health values, and the outcome is determined by logical and mathematical conditions applied during combat.

---

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- NetBeans IDE
- Console-based Input/Output

---

## Game Overview

The game is a turn-based combat system where the player selects different attack types based on mathematical logic. Each attack has specific conditions that determine whether it is effective against an enemy.

---

## Game Mechanics

### 👤 Player
- Starts with **20 HP**
- Can choose from 3 attack types:
  - Basic Strike
  - Prime Strike
  - Modulus Strike

---

### 👾 Enemies
- **Slime** – 15 HP  
- **Goblin** – 17 HP  
- Enemy attacks deal random damage between **3 – 6 HP**

---

## Mathematical Logic System

- **Basic Strike**
  - Always effective against any enemy

- **Prime Strike**
  - Effective when the enemy HP is a **prime number**
  - Mainly effective against the Goblin

- **Modulus Strike**
  - Effective when enemy HP is divisible without remainder
  - Mainly effective against the Slime

---

## Turn-Based System
- Player always attacks first
- Enemy counter-attacks after each player turn
- Each turn continues until:
  - Player HP reaches **0**, or
  - Enemy HP reaches **0**

---

## Programming Concepts Demonstrated
- Conditional logic (if/else statements)
- Inheritance
- Polymorphism
- Encapsulation
- Abstraction
- Loops (game loop structure(while loops))
- Random number generation
- Methods and functions
- Error Handling (Try and catch)
- Object-Oriented Programming (OOP)
- State management (HP tracking system)
