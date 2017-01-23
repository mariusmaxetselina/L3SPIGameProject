package rpg.Modele;

public class Stats {
	protected int intelligence,esprit,sagesse;
	protected int force,resistance,vitesse;
	protected int precision,esquive,chance;

	public Stats(int intelligence, int esprit, int sagesse, int force, int resistance, int vitesse, int precision,
			int esquive, int chance) {
		this.intelligence = intelligence;
		this.esprit = esprit;
		this.sagesse = sagesse;
		this.force = force;
		this.resistance = resistance;
		this.vitesse = vitesse;
		this.precision = precision;
		this.esquive = esquive;
		this.chance = chance;
		
		
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getEsprit() {
		return esprit;
	}
	public void setEsprit(int esprit) {
		this.esprit = esprit;
	}
	public int getSagesse() {
		return sagesse;
	}
	public void setSagesse(int sagesse) {
		this.sagesse = sagesse;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getResistance() {
		return resistance;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	public int getPrecision() {
		return precision;
	}
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	public int getEsquive() {
		return esquive;
	}
	public void setEsquive(int esquive) {
		this.esquive = esquive;
	}
	public int getChance() {
		return chance;
	}
	public void setChance(int chance) {
		this.chance = chance;
	}
	
	
}
