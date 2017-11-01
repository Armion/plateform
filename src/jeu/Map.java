package jeu;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Map extends TiledMap{
	
	
	public Map(String path) throws SlickException
	{
		super(path);
	}
	
	
	public void Afficher(int x, int y)
	{
		this.render(x, y);
	}

}
