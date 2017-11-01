package jeu;

public abstract class Event {
	
	protected float x;
	protected float y;
	
	public Event()
	{
		this.x  = 0;
		this.y = 0;
	}
	
	public Event(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

}
