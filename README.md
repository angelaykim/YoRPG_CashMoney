# **YoRPG_TeamCashMoney**
## *By: Angela K., Manahal T., Tim W.*

#### **Additional Features**
  1. Characters now have the ability to carry out special attacks, which in this case we've named Super Attack and Mega Attack.
  2. We have also added an inventory to the character which will hold potions and coins.
  3. The characters now have the ability to have sidekicks which also have the ability to attack a Monster.
  4. Characters will also be able to visit a shop where they can choose to purchase a potion that, when consumed, will restore their health.
  
#### **Code Restructurings**
  1. To accomodate the special attacks, the driver file was changed so that one the qualifications for a special attack were met, the player would have the ability to call a special attack.
  2. In the Character class, the methods specialAttack1 and specialAttack2 were added as well as the instance variable, specialAttack to keep track of whether or not a special attack can be carried out.
  3. A new superclass, Sidekick, is made with subclasses each matched to one character in the driver file. The Sidekick class has abstract methods void crazyAttack() and void rockDefense() to be overwritten in the subclasses. 
  4. The driver file was modified so that the player can choose his/her sidekick's attacking stance---either balanced, crazyAttack or rockDefense. The sidekick deals additional damage onto the monster. Also, after the monster attacks the player's character, it has a 50/50 chance of attacking the player's sidekick. In the beginning of a new playturn, if the sidekick is dead, it will come back alive. 
  5. Several more instance variables- coins, potions, and origHP- and their corresponding methods- accessors, mutators, and potionHP- were added to the Character class. 
  6. The driver file was altered for the shop simulation, loot, and drinking of potion.
  
#### **Instructions**
  1. Choose the level of difficulty you wish to play in.
  2. You will now be prompted to choose a Character. Choose wisely! You will receive a sidekick corresponding to your character. 
  3. Please enter what you wish to be called.
  4. When a monster approaches, you have the option to attack or do a special attack. However, once you have done 3 normal or special attacks you will be allowed to do a super attack. If you are extra patient, and do 5 normal attack, you will be able to carry out a mega attack.
  5. Instruct your sidekick to carry out an attack. You have three options for this.
