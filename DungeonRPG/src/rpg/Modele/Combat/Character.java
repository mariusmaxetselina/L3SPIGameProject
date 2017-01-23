package rpg.Modele.Combat;

import rpg.Modele.Stats;
import rpg.Modele.Object.Stuff;

public abstract class Character {
	//Variables
	protected String name;
	protected Stats stats;//ensemble des caractéristiques nécessaires au combat
	protected Stuff armor;//ensemble d'equipement que porte le personnage
	
	public Character(String name,Stats stats){
		this.stats=stats;
		this.name=name;
	}
}
