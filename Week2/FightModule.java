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
