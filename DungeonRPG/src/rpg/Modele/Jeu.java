package rpg.Modele;

import rpg.Modele.Combat.Hero;
import rpg.Modele.Combat.HeroFactory;

public class Jeu {
	private static Hero hero;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero = HeroFactory.createHero1("Bob");
		
	}

}
