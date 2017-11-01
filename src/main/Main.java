package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import Windows.*;

public class Main {

	public static void main(String[] args) throws SlickException {
        new AppGameContainer(new WindowGame(), 640, 480, false).start();
    }
}
