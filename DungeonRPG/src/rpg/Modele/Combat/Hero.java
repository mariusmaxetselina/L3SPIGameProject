package rpg.Modele.Combat;

import rpg.Modele.Inventory;
import rpg.Modele.Stats;

public class Hero extends Character{
	protected Inventory bag;
	public Hero(String name, Stats stats) {
		super(name, stats);
		// TODO Auto-generated constructor stub
		bag=new Inventory();
	}
	public void Action(){
		System.out.println("Actions : \n ouvrir le sac (1) \n ");
	}
}
