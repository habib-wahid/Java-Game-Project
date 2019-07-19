package myProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class speedMeter {

	private Motor motor;
	public speedMeter(Motor motor)
    {
		
	this.motor = motor;
		
	}
	
	public void render(Graphics g) {
			
		g.setColor(Color.red);
	g.fillOval(8, 98, 100+ 2*2, 100+4);
		
		g.setColor(Color.GRAY);
		g.fillOval(10, 100, 100, 100);
		int centerX = 10+50;
		int centerY = 100+50;
		
	double speed = motor.getSpeed()	% 60.0 / 7 *Math.PI*2;
	
		
		int animx = (int) (centerX + Math.sin(speed) * 40);
		
		int animy =  (int) (centerY - Math.cos(speed)*40);
		
		g.setColor(Color.CYAN);
		g.drawLine(centerX, centerY,animx, animy);
		
																			
		for(int i=1;i<=6;i++)
		{
			
		int	 radian  =  (int) (i%7.0/7 * Math.PI*2);
			
			
			int anim3 = (int) ((centerX-4) + Math.sin(radian) * 40);
			
		int anim4 =  (int) ((centerY+4) - Math.cos(radian)*40);
			String j =Integer.toString(i);
			
			g.setFont(new Font("arial",Font.PLAIN,12));
			g.drawString(j, anim3, anim4);
			
		}
		
	}
}


