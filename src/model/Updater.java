package model;

import java.util.ArrayList;

import view.*;


public class Updater {
	
	ArrayList<Planet> planets = new ArrayList<Planet>();
	Window window = new Window(planets);
	
	public void update() {
		
		window.repaint();
	}
	
	public void render() {
		window.repaint();
	}
	
	public void createPlanet(double[] stats) {
		planets.add(new Planet(stats));
		window.add(planets.get(planets.size() - 1));
		
		
	}
	
	public void debug() {
		System.out.println(planets.get(0).getStats()[0]);
		System.out.println(planets.get(1).getStats()[0]);
	}
		
}
