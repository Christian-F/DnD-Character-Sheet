package nezandfish.dnd.charactersheet;

public class Character {
	
	//Huge Variable Block
	
	//Info
	String Name, Alignment, Class, Deity, Homeland, Race, Gender,
		Hair, Eyes, Size;
	int Level, Exp, Age, Height, Weight;
	
	//Stats
	String StrScore, StrModifier;
	String DexScore, DexModifier;
	String ConScore, ConModifier;
	String IntScore, IntModifier;
	String WisScore, WisModifier;
	String ChaScore, ChaModifier;
	int HP, HPReduction;
	int SpdLndBase, SpdLndWithArmor;
	int SpdFly, SpdSwim, SpdClimb, SpdBurrow;
	String SpdFlyManeuverability;
	int Initiative;
	String ArmorClass, TouchArmorClass, FlatFootedArmorClass;
	//Armor class calculators
	int ArmorBonus, ShieldBonus, SizeModifier, NaturalArmor, DeflectionModifier;
	int BaseAtkBonus, SpellResistance;
	
	//Character Constructor
	public Character(String name, String charClass){

	}
}