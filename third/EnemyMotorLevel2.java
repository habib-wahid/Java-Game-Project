package myProject.third;

import java.awt.Graphics;

import myProject.Motor;
import myProject.loadImage;
import myProject.second.loadImageLevel1;

public class EnemyMotorLevel2 {
	
	private int x,y;
	
	private MotorLevel2 motor;

	public EnemyMotorLevel2(MotorLevel2 motor,int x,int y)
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
		g.drawImage(loadImageLevel2.enemyViper, x, y-motor.getofset(), 50, 90, null);
		//g.drawImage(loadImage.fullimage3, x, y-motor.getofset(), 50,90,null);
		
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}