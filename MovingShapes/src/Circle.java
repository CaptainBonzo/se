import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Circle extends Shape {
	private final static int rectWidth = 30;
	private final static int rectHeight = 30;
	private Color color;   
    public Circle (int centerX, int centerY, Color color) {
    	super(new Rectangle(centerX - (rectWidth/2), centerY - (rectHeight/2), rectWidth, rectHeight));
    	this.color = color;
     }

    @Override
	public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(boundingRect.x, boundingRect.y, boundingRect.width, boundingRect.height); 
    }
}
