package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

import jeu.*;

public class Main {

	public static void main(String[] args) throws SlickException {

        new AppGameContainer(new Game(), 640, 480, false).start();
    }
}
