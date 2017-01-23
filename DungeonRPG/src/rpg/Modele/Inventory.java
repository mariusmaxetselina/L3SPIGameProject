package rpg.Modele;

import java.util.ArrayList;
import java.util.List;

import rpg.Modele.Object.Equipement;
import rpg.Modele.Object.Usable;



public class Inventory {
	List<Usable> utilisables;
	List<Equipement> equipements;
	
	public Inventory(){
		utilisables=new ArrayList<Usable>();
		equipements=new ArrayList<Equipement>();
	}
	
	public void open(){
		System.out.println("consulter : -les équipements (1) ?\n -les utilisables(2) ?");
	}
}
