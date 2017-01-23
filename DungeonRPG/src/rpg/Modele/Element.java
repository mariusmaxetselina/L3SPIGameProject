package rpg.Modele;

public class Element implements Comparable<Element> {

	public static Element WIND=new Element(0),
	FIRE=new Element(1),WATER=new Element(2),
	EARTH=new Element(3),FLASH=new Element(4);
	
	private int value;
	
	private Element(int value){
		this.value=value;
	}
	
	@Override
	public int compareTo(Element e) {
		// TODO Auto-generated method stub
		return 0;
	}
}
