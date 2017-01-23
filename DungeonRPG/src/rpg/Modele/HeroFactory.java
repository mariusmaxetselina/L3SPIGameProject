package rpg.Modele;

public class HeroFactory {
	
	public static Hero createHero1(String name){
		
		return new Hero(name, new Stats(0, 0, 0, 0, 0, 0, 0, 0, 0));
		
	}
	public static Hero createHero2(String name){
		
		return new Hero(name, new Stats(0, 0, 0, 0, 0, 0, 0, 0, 0));
		
	}
	public static Hero createHero3(String name){
		
		return new Hero(name, new Stats(0, 0, 0, 0, 0, 0, 0, 0, 0));
		
	}
}
