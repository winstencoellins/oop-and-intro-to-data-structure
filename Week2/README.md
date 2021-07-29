#  Week 2 Assignment
We will be reviewing the four main pillars of OOP through this simple project which are Polymorphism, Encapsulation, Abstraction, and Inheritance. This will be a simple
interesting project since this project is related to a famous game across the world which is Genshin Impact from created by Mihoyo.

## Steps
Create or download the interface called `FightModule`. If you create your own, then copy and paste the code to your editor. Read through the comments and try to understand what
the comments tell you to do. Do not implement the code yet.
```java
/*
 * This interface should be implemented in every single Child Class
 */
public interface FightModule {
	/*
	 * This function will return how many HP remaining 
	 * after the mob is being hit n amount of time.
	 * String[] mobs = {[mobsName], [Vision], [HP], [typeOfMobs]}, therefore, use the array knowledge that you have learnt
	 * to implement this function.
  	 * [n] will be how many times you would want to hit the mobs with totalNormalAtkDmg that a certain character has.
	 * @return the HP of the mobs after being hit.
	 * @return attack is unable to damage mob if they have the same vision
	 */
	public String attack(String[] mobs, int n);
	
	/*
	 * This function will return how many HP remaining 
	 * after the mob is being hit n amount of time.
	 * String[] mobs = {[mobsName], [Vision], [HP], [typeOfMobs]}, therefore, use the array knowledge that you have learnt
	 * to implement this function.
	 * [n] will be how many times you would want to hit the mobs with totalNormalAtkDmg that a certain character has.
	 * @return the HP of the mobs after being hit.
	 * @return chargedAtk is unable to damage mob if they have the same
	 * vision
	 */
	public String chargedAtk(String[] mobs, int n);
	
	/*
	 * This function will return how many attack (totalNormalAtk and totalChargedAtk) does a certain
	 * character needs in order to kill the mob. 
	 * String[] mobs = {[mobsName], [Vision], [HP], [typeOfMobs]}, therefore, use the array knowledge that you have learnt
	 * to implement this function.
	 */
	public String manyAtk(String[] mobs);
	
	/*
	 * This function will decrease the stamina of a character by certain
	 * amount after sprinting n amount of times
	 * String[] mobs = {[mobsName], [Vision], [HP], [typeOfMobs]}, therefore, use the array knowledge that you have learnt
	 * to implement this function.
	 * @return stamina left after sprinting n amount of times. A one-time sprint reduces stamina by 18.
	 */
	public int sprint(int n);
	
	/*
	 * This function will check if a certain character will be able to
	 * use an elemental skill at the mob.
	 * String[] mobs = {[mobsName], [Vision], [HP], [typeOfMobs]}, therefore, use the array knowledge that you have learnt
	 * to implement this function.
	 * @return True if able to use elemental skill
	 * @return False if unable to use elemental skill
	 */
	public boolean canUseElementalSkillToDmg(String[] mobs);
	
	/*
	 * This function will check if a certain character will be able to
	 * use an elemental burst at the mob.
	 * String[] mobs = {[mobsName], [Vision], [HP], [typeOfMobs]}, therefore, use the array knowledge that you have learnt
	 * to implement this function.
	 * @return True if able to use elemental burst
	 * @return False if unable to use elemental burst
	 */
	public boolean canUseElementalBurstToDmg(String[] mobs);
}

```

Since we have provided you an interface. We won't help you any further. Next step is to create a class called `GenshinChar` (parent class) with a constructor that receives two
parameters `name, vision` (without `stamina` in the parameter).
- `name`: will be genshin impact character's name
- `vision`: will be the vision of a certain character
- `stamina`: this value is fixed which is `240` (maximum stamina according to wikiFandom)

`GenshinChar` class will also receive three attributes:
- `move()`: return String "Moving"
- `jump()`: return String "Jumping"
- `getStamina()`: return the stamina of the character

Next step is to create the child class. There will be five child class (`Sword, Polearm, Catalyst, Claymore, Bow`), and each class should inherits from the parent class `GenshinChar` 
and implements an Interface `FightModule`. Each class should also have a Constructor with parameters:
- `baseAtk`: Attack without any weapon equipped.
- `oneHitDmg`: Percent damage of oneHitDmg * baseAtk
- `twoHitDmg`: Percent damage of twoHitDmg * baseAtk
- `threeHitDmg`: Percent damage of threeHitDmg * baseAtk
- `fourHitDmg`: Percent damage of fourHitDmg * baseAtk
- `fiveHitDmg`: Percent damage of fiveHitDmg * baseAtk
- `sixHitDmg`: Percent damage of sixHitDmg * baseAtk
- `chargedAtkDmg`: Percent damage of chargedAtkDmg * baseAtk
- `city`: City where the character is from

After finishing the constructor, you need to add one private variables inside every single child class. Copy and paste this one line code.
```java
private int weaponDmg = 674;
```

You should also have `totalChargedAtkDmg` and `totalNormalAtkDmg` inside a constructor. You only need to copy and paste this code into your constructor.
```java
this.totalChargedAtkDmg = (oneHitDmg * (baseAtk + weaponDmg) * 0.01) + (baseAtk + weaponDmg) * chargedAtkDmg * 0.01;
this.totalNormalAtkDmg = ((oneHitDmg * (baseAtk + weaponDmg) * 0.01) + (twoHitDmg * (baseAtk + weaponDmg) * 0.01) + 
				(threeHitDmg * (baseAtk + weaponDmg) * 0.01) + (threeHitDmg * (baseAtk + weaponDmg) * 0.01) + 
				(fourHitDmg * (baseAtk + weaponDmg) * 0.01) + (fiveHitDmg * (baseAtk + weaponDmg) * 0.01) + 
				(sixHitDmg + (baseAtk + weaponDmg) * 0.01));
```

After finish implementing the constructor, next you would want to implement the attribute of each child class:
- `getTotalNormalDmg()`: return the totalNormalAtkDmg of a character
- `getWeapon()`: return the weapon of a certain character
- `getChargedAtkDmg()`: return the totalChargedAtkDmg of a character

Finally you will be implementing the `toString()` method in every single child class, and the toString method should return this:
```
[characterName] - [City]
Vision: [vision]
Weapon: [weapon]
Total Normal Damage: [totalNormalAtkDmg]
Charged Attack Damage: [totalChargedAtkDmg]
```

<strong>Remember, you should also overwrite the `jump()` and `move()` attribute. You are welcome to be creative in the return statement as long as it returns String type.</strong>

Finally, you will be implementing the interface. Before implementing the interface in each child class, you need to be aware of this rules:
- Catalyst character deals elemental damage even with their normal attack or charged attack, therefore mobs such as `slimes` will be immune to it.
- When Bow character do chargedAtkDmg, bow character will deal an elemental damage to mobs, therefore mobs such as `slimes` will be immue to it.

To make it more interesting, I want you to make some conditions in the `attack` and `chargedAtk` function.
- If the mobs still has HP remaining, you would want to return `[mobsName] still has [HP] remaining.`
- If the attack needed for a certain character to kill the mobs is lower than n, return `[characterName] needs [x] times of total normal attack damage to kill [mobsName]` you will need `Math.ceil()` to help you round up the `[x]`. You need to figure out how to calculate the `[x]` yourselves.
- If the attack needed for a certain character to kill the mobs is equal to n, return `[characterName] sucessfully killed [mobsName] with [n] times of total normal attack.`
