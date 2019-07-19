package myProject;

import java.awt.Graphics;

public class EnemyMotor {
	
	private int x,y;
	
	private Motor motor;

	public EnemyMotor(Motor motor,int x,int y)
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
		g.drawImage(loadImage.enemyViper, x, y-motor.getofset(), 50, 90, null);
		//g.drawImage(loadImage.fullimage3, x, y-motor.getofset(), 50,90,null);
		
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
