package jeu;

	
	import org.newdawn.slick.AppGameContainer;
	import org.newdawn.slick.BasicGame;
	import org.newdawn.slick.GameContainer;
	import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

	public class Game extends BasicGame {
		
		private GameContainer container;
		private Map map;
		private Character perso;

		
		
	    public Game() {
	        super("Plateform :: WindowGame");
	    }

	    @Override
	    public void init(GameContainer container) throws SlickException {
	    	this.container = container;
	    	this.map = new Map("resources/graphics/maps/village.tmx");
	    	this.perso = new Character("resources/graphics/sprites/test.png");
	    }

	    @Override
	    public void render(GameContainer container, Graphics g) throws SlickException {
	    	
	    	this.map.Afficher(0, 0);
	    	this.perso.Afficher(g);
	    	
	    }

	    @Override
	    public void update(GameContainer container, int delta) throws SlickException {
	    	
	    	if (this.perso.isMoving()) {
	            switch (this.perso.getDirection()) {
	                case 0: perso.deplacer(perso.getX(), perso.getY() - 0.1f * delta); break;
	                case 1: perso.deplacer(perso.getX() - 0.1f * delta, perso.getY()); break;
	                case 2: perso.deplacer(perso.getX(), perso.getY() + 0.1f * delta); break;
	                case 3: perso.deplacer(perso.getX() + 0.1f * delta, perso.getY()); break;
	            }
	        }
	    	
	    	
	    }
	    
	    @Override
	    public void keyReleased(int key, char c) {
	    	
	        if (Input.KEY_ESCAPE == key) {
	            container.exit();
	        }
	        perso.stop();
	    }
	    
	    @Override
	    public void keyPressed(int key, char c) {
	        switch (key) {
	            case Input.KEY_UP:    perso.bouger(0); break;
	            case Input.KEY_LEFT:  perso.bouger(1); break;
	            case Input.KEY_DOWN:  perso.bouger(2); break;
	            case Input.KEY_RIGHT: perso.bouger(3); break;
	        }
	    }
	    
	    
}


