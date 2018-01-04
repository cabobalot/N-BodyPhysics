package controller;

import view.*;
import model.*;


public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		Updater update = new Updater();
		
		double[] stats = {200, 400}; 
		update.createPlanet(stats);
		
		stats[0] = 300; 
		update.createPlanet(stats);
		
		update.debug();
		
		while(true) {
			update.update();
			update.render();
			
			Thread.sleep(10);
		}
		
	}
	
	
}





























//easter egg!