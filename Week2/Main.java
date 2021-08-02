import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String FILE_NAME1 = "U:\\dataStructure\\OOP\\genshinStats.csv"; // Need to change to your local dir
		String FILE_NAME2 = "U:\\dataStructure\\OOP\\GenshinEnemies.csv"; // Need to change to your local dir
		
		BufferedReader br1 = null;
		FileReader fr1 = null;
		
		BufferedReader br2 = null;
		FileReader fr2 = null;
		
		// Using try catch in order to catch error that will be caused by the file.
		try {
			fr1 = new FileReader(FILE_NAME1);
			br1 = new BufferedReader(fr1);
			
			fr2 = new FileReader(FILE_NAME2);
			br2 = new BufferedReader(fr2);
			
			String currentLine1;
			String currentLine2;
			
			// Create an empty array Object to store all of
			// the Object
			Sword[] swordChar = new Sword[9];
			Catalyst[] catalystChar = new Catalyst[7];
			Claymore[] claymoreChar = new Claymore[7];
			Bow[] bowChar = new Bow[6];
			Polearm[] polearmChar = new Polearm[5];
			
			// Create an empty String array to store all of the enemies
			// object
			String[][] slimes = new String[14][4];
			String[][] elementalLifeforms = new String[7][4];
			String[][] hilichurls = new String[28][4];
			String[][] abyssOrder = new String[6][4];
			String[][] fatuis = new String[10][4];
			String[][] automaton = new String[9][4];
			String[][] humans = new String[18][4];
			String[][] magicalBeasts = new String[11][4];
			String[][] bosses = new String[4][4];
			
			// Indexing variables for array Object
			int iSword = 0;
			int iCatalyst = 0;
			int iPolearm = 0;
			int iBow = 0;
			int iClaymore = 0;
			int iSlimes = 0;
			int iElemental = 0;
			int iHilichurls = 0;
			int iAbyss = 0;
			int iFatui = 0;
			int iAutomaton = 0;
			int iHuman = 0;
			int iMagical = 0;
			int iBosses = 0;
			
			// Read the csv file and create characters Object then store
			// it into specific array
			while((currentLine1 = br1.readLine()) != null) {
				String[] c = currentLine1.split(",");
				
				if (c[2].equals("Sword")) {
					int baseAtk = Integer.parseInt(c[5]);
					int oneHitDmg = Integer.parseInt(c[6]);
					int twoHitDmg = Integer.parseInt(c[7]);
					int threeHitDmg = Integer.parseInt(c[8]);
					int fourHitDmg = Integer.parseInt(c[9]);
					int fiveHitDmg = Integer.parseInt(c[10]);
					int sixHitDmg = Integer.parseInt(c[11]);
					int chargedAtkDmg = Integer.parseInt(c[12]);
					
					swordChar[iSword] = new Sword(c[0], c[1], baseAtk, oneHitDmg, twoHitDmg, threeHitDmg, fourHitDmg, fiveHitDmg, sixHitDmg, chargedAtkDmg, c[3]);
					iSword++;
					// System.out.println(c[0] + " object created.");
				} else if (c[2].equals("Bow")) {
					int baseAtk = Integer.parseInt(c[5]);
					int oneHitDmg = Integer.parseInt(c[6]);
					int twoHitDmg = Integer.parseInt(c[7]);
					int threeHitDmg = Integer.parseInt(c[8]);
					int fourHitDmg = Integer.parseInt(c[9]);
					int fiveHitDmg = Integer.parseInt(c[10]);
					int sixHitDmg = Integer.parseInt(c[11]);
					int chargedAtkDmg = Integer.parseInt(c[12]);
					
					bowChar[iBow] = new Bow(c[0], c[1], baseAtk, oneHitDmg, twoHitDmg, threeHitDmg, fourHitDmg, fiveHitDmg, sixHitDmg, chargedAtkDmg, c[3]);
					iBow++;
					// System.out.println(c[0] + " object created.");
				} else if (c[2].equals("Polearm")) {
					int baseAtk = Integer.parseInt(c[5]);
					int oneHitDmg = Integer.parseInt(c[6]);
					int twoHitDmg = Integer.parseInt(c[7]);
					int threeHitDmg = Integer.parseInt(c[8]);
					int fourHitDmg = Integer.parseInt(c[9]);
					int fiveHitDmg = Integer.parseInt(c[10]);
					int sixHitDmg = Integer.parseInt(c[11]);
					int chargedAtkDmg = Integer.parseInt(c[12]);
					
					polearmChar[iPolearm] = new Polearm(c[0], c[1], baseAtk, oneHitDmg, twoHitDmg, threeHitDmg, fourHitDmg, fiveHitDmg, sixHitDmg, chargedAtkDmg, c[3]);
					iPolearm++;
					// System.out.println(c[0] + " object created.");
				} else if (c[2].equals("Catalyst")) {
					int baseAtk = Integer.parseInt(c[5]);
					int oneHitDmg = Integer.parseInt(c[6]);
					int twoHitDmg = Integer.parseInt(c[7]);
					int threeHitDmg = Integer.parseInt(c[8]);
					int fourHitDmg = Integer.parseInt(c[9]);
					int fiveHitDmg = Integer.parseInt(c[10]);
					int sixHitDmg = Integer.parseInt(c[11]);
					int chargedAtkDmg = Integer.parseInt(c[12]);
					
					catalystChar[iCatalyst] = new Catalyst(c[0], c[1], baseAtk, oneHitDmg, twoHitDmg, threeHitDmg, fourHitDmg, fiveHitDmg, sixHitDmg, chargedAtkDmg, c[3]);
					iCatalyst++;
					// System.out.println(c[0] + " object created.");
				} else if (c[2].equals("Claymore")) {
					int baseAtk = Integer.parseInt(c[5]);
					int oneHitDmg = Integer.parseInt(c[6]);
					int twoHitDmg = Integer.parseInt(c[7]);
					int threeHitDmg = Integer.parseInt(c[8]);
					int fourHitDmg = Integer.parseInt(c[9]);
					int fiveHitDmg = Integer.parseInt(c[10]);
					int sixHitDmg = Integer.parseInt(c[11]);
					int chargedAtkDmg = Integer.parseInt(c[12]);
					
					claymoreChar[iClaymore] = new Claymore(c[0], c[1], baseAtk, oneHitDmg, twoHitDmg, threeHitDmg, fourHitDmg, fiveHitDmg, sixHitDmg, chargedAtkDmg, c[3]);
					iClaymore++;
					// System.out.println(c[0] + " object created.");
				}
			}
			
			// Read the csv file and create enemies object, then store it to
			// specific array
			while ((currentLine2 = br2.readLine()) != null) {
				String[] e = currentLine2.split(",");
				
				if (e[3].equals("Slime")) {
					slimes[iSlimes] = e;
					iSlimes++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Elemental Lifeforms")) {
					elementalLifeforms[iElemental] = e;
					iElemental++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Elemental Lifeforms")) {
					elementalLifeforms[iElemental] = e;
					iElemental++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Hilichurls")) {
					hilichurls[iHilichurls] = e;
					iHilichurls++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Abyss Order")) {
					abyssOrder[iAbyss] = e;
					iAbyss++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Fatui")) {
					fatuis[iFatui] = e;
					iFatui++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Automaton")) {
					automaton[iAutomaton] = e;
					iAutomaton++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Human")) {
					humans[iHuman] = e;
					iHuman++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Magical Beasts")) {
					magicalBeasts[iMagical] = e;
					iMagical++;
					// System.out.println(e[0] + " object created.");
				} else if (e[3].equals("Bosses")) {
					bosses[iBosses] = e;
					iBosses++;
					// System.out.println(e[0] + " object created.");
				}
			}
	
			
			/*
			 * List of Order of the 34 objects
			 * - Sword: [Bennett, Jean, Kaeya, Keqing, Qiqi, Xingqiu, Albedo, KamisatoAyaka, KaedeharaKazuha] [9]
			 * - Bow: [Amber, Fischl, Venti, Tartaglia, Diona, Ganyu] [6]
			 * - Polearm: [Xiangling, Xiao, Zhongli, Rosaria, Hu Tao] [5]
			 * - Catalyst: [Barbara, Klee, Lisa, Mona, Ningguang, Sucrose, Yanfei] [7]
			 * - Claymore: [Beidou, Chongyun, Diluc, Noelle, Razor, Xinyan, Eula] [7]
			 * 
			 * List of Order of all the enemies objects (L refers to Large, H refers to Hypostasis)
			 * - Slimes: [Dendro, Large Dendro, Anemo, Large Anemo, Electro, Large Electro, Cryo, Large Cryo, Pyro, Large Pyro, Hydro, Large Hydro] [14]
			 * - ElementalLifeforms: [Eye of the Storm, Electro H, Anemo H, Geo H, Cryo H, Pyro H, Oceanid] [7]
			 * - AbyssOrder: [Pyro Abyss Mage, Hydro AM, Cryo AM, Electro AM, Abyss Herald, Abyss Lector] [6]
			 * - Fatui: [Cryogunner, Hydrogunner, Electrohammer, Geochanter, Pyroslinger, Anemoboxer, Fatui Pyro Agent, Electro Cicin Mage, Cry Cicin Mage, Mirror Maiden]
			 * - Look for hilichurls, human, automaton,  and magical beast enemies object on your own. You could do for loop
			 * - Bosses: [Stormterror, Lupus Boreas, Childe, Azhdaha]
			 * 
			 * NOTE: If you implemented everything well, the code above will work.
			 * Now you should be able to use the object.
			 * 
			 * How to use the object created above:
			 * [typeOfWeapon]Char[indexInArray].function() -> look at the array object declaration
			 * [typeOfEnemy][indexInArray]
			 */
			
			// Sample Output
			System.out.println(swordChar[3] + "\n");
			System.out.println(polearmChar[4] + "\n");
			System.out.println(bowChar[1].chargedAtk(slimes[4], 2) + "\n");
			
			
		} catch (IOException e) {
			System.out.println("Could not open the CSV file due to an Exception. Please rename the 'FILE_NAME1' and 'FILE_NAME2' to your local path directory.");
		}
	}
}
