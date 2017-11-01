package jeu;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Character extends Event{
	
	private int direction;
	private boolean moving;
	private Animation[] animations;
	private float speed;
	
	public Character(String path) throws SlickException
	{
		super();
		this.direction = 0;
		this.moving = false;
		animations = createAnime(path, 64, 64);
		this.speed = 1f;
		
	}
	
	private Animation[] createAnime(String path, int x, int y) throws SlickException
	{
	
		SpriteSheet sprite = new SpriteSheet(path, x, y);
		
		Animation[] anime = new Animation[8];
		
		for(int i = 0; i < 4; i++)
		{
			anime[i] = loadAnimation(sprite, 0, 1, i);
		}
		
		for(int i = 4; i < 8; i++)
		{
			anime[i] = loadAnimation(sprite, 1, 9, i-4);
		}
		
		return anime;
	}
	
	private Animation loadAnimation(SpriteSheet spriteSheet, int startX, int endX, int y) {
	    Animation animation = new Animation();
	    for (int x = startX; x < endX; x++) {
	        animation.addFrame(spriteSheet.getSprite(x, y), 100);
	    }
	    return animation;
	}
	
	public void Afficher(Graphics g)
	{
		g.setColor(new Color(0, 0, 0, .5f));
	    g.fillOval(this.x + 16, this.y + 50, 32, 16);
		g.drawAnimation(this.animations[this.direction + (moving ? 4 : 0)], this.x, this.y);
	}
	
	public void bouger(int mdirection)
	{
		if(mdirection >= 0 && mdirection < 4)
		{
			this.direction = mdirection;
			
		}
		
		this.moving = true;
	}
	
	public void stop()
	{
		this.moving = false;
	}
	
	public void deplacer(float x, float y)
	{
		this.x = x * speed;
		this.y = y * speed;
	}
	
	public float getX()
	{
		return this.x;
	}
	
	public float getY()
	{
		return this.y;
	}
	
	public boolean isMoving()
	{
		return this.moving;
	}
	
	public int getDirection()
	{
		return this.direction;
	}
	

}
