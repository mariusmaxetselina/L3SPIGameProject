package rpg.Modele;

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
