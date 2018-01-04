package view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Window extends JPanel{
	JFrame frame = new JFrame("N-Body Physics");
	ArrayList<Planet> planets;
	
	
	public Window(ArrayList<Planet> Planets){
		frame.setSize(700, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(this);
		
		planets = Planets;
	}
	
	
	public void add(Planet thing) {
		frame.add(thing);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		for(int i = 0; i < planets.size(); i++) {
			g2d.fillOval((int) planets.get(i).getStats()[0], (int) planets.get(i).getStats()[1], 30, 30);
		}
		
	}
}
