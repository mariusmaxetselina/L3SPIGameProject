package rpg.Main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame {

	public Main(String title) {
		super(title);
		// inherit from 	org.newdawn.slick.BasicGame
		// Ne pas oublier d'ajouter en run config arguments Vm : -Djava.library.path=lib/natives
		// Ne pas oublier de configurer le build path, mais logiquement c'est fait.
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) throws SlickException {
        new AppGameContainer(new Main("Test"), 640, 480, false).start();
    }
}
