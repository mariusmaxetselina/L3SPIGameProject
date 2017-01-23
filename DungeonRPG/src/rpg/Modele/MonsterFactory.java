package rpg.Modele;

public class MonsterFactory {
	
	public static Monster createMonster1(){
		
		return new Monster("Goblin", new Stats(0, 0, 0, 0, 0, 0, 0, 0, 0));
		
	}
	public static Monster createMonster2(){
		
		return new Monster("Rat", new Stats(0, 0, 0, 0, 0, 0, 0, 0, 0));
		
	}
	public static Monster createMonster3(String name){
		
		return new Monster("Cafard Geant", new Stats(0, 0, 0, 0, 0, 0, 0, 0, 0));
		
	}
}
