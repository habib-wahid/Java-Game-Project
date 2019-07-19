package myProject.second;
import java.awt.Graphics;

import myProject.Motor;
import myProject.loadImage;

public class EnemyMotorLevel1 {
	
	private int x,y;
	
	private MotorLevel1 motor;

	public EnemyMotorLevel1(MotorLevel1 motor,int x,int y)
	{
		this.motor = motor;
		this.x=x;
		this.y = y;
	}
	
	public void tick() {
		
		y+=1;
		
	}
	
	public void render(Graphics g)
	{
		g.drawImage(loadImageLevel1.enemyViper, x, y-motor.getofset(), 50, 90, null);
		//g.drawImage(loadImage.fullimage3, x, y-motor.getofset(), 50,90,null);
		
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}