package view;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Planet extends JPanel{
	
	private double[] stats;
	
	public Planet(double[] Stats) {
		stats = Stats;
	}
	
	public double[] getStats() {
		return(stats);
	}
	
}
