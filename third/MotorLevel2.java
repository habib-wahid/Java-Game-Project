package myProject.third;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import myProject.second.DisplayLevel1;

public class MotorLevel2 implements KeyListener {
	

	 private int x, y;
	
	 private int ofset;
	
	 private double speed;
	
	 private int health;
	 private int gare;
	 
	  
	 private boolean left,right,up,down,one;
     	

	public MotorLevel2() {
		
		
		
		x=DisplayLevel2.width/2 - 80;
		y=TileLevel2.tileHeight*300;
		
		ofset = 0;
		speed = 0.5f;
		health = 3;
		gare = 0;
		
		
	}
	public void init() {
		
		DisplayLevel2.frame.addKeyListener(this);
		
	}
	public void tick() {
		
			
		System.out.println(y);
		
	
	   if(health>0) {
		   
		ofset = y-(DisplayLevel2.height - 100);
		
		
	
		if(right)
		{
			
			if(x<=335)
			x=x+5;
		}
		if(left)
		{
			if(x>=125)
			x=x-5;
		}
		if(y>500)
		{
		if(up)
		{
		 speed += .3f;
		if(speed>=30.00)
			speed=30;
		
		}
		}
		y-=speed;
		if(y>500)
		{
		if(down)
		{
			speed-= 1f;
			if(speed<=0)
				speed = 0;
		}
		}
		
	   }
		
		//System.out.println(speed);
			
	}
	
	public double getSpeed() {
		return speed;
	}
	
		
	public int getX()
	{
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	public int getofset() {
		return ofset;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
		
	
	public void setHealth(int health)
	{
		this.health = health;
	}

  public void drawBoard(Graphics g) {
	  	
	  
	  int speed1 =(int)speed;
	  switch(speed1)
	  {
	  case 	2  :  gare = 0;break;																																																										
	  case 	7	: gare = 1;break;
	  case 14   : gare = 2;break;
	  case 21   : gare = 3;break;	  
	  
	  }
	  
	  g.setColor(Color.green);
	  
	  g.fillRect(10, 10, 150, 80);
	  
	  g.setColor(Color.magenta);
	  
	  String sgare  = Integer.toString(gare);
	  g.setFont(new Font("arial",Font.BOLD,30));
	  g.drawString("Gare : "+sgare, 20, 50);
	  g.drawString("Health : "+health, 20, 80);
	  
	  
	  
  }
  
  public void WinGame(Graphics g)
  {
	  g.setColor(Color.red);
	  g.setFont(new Font("cambria",Font.BOLD,33));
	  g.drawString("YOU WIN", DisplayLevel2.width/3, DisplayLevel2.height/2);
	  
  }
  
  
  public void GameOver(Graphics g)

  {
	  
	  g.setColor(Color.red);
	  g.setFont(new Font("cambria",Font.BOLD,33));	  
	  g.drawString("Game Over", DisplayLevel2.width/3, DisplayLevel2.height/2);
	  
  }
	public void  render(Graphics g)
	{
		
		if(health>0 && y<=500)
		{
			WinGame(g);
		}
		else if(health>0 && y>500)
		{
		
		g.setColor(Color.red);
		g.drawImage(loadImageLevel2.Viper,x, y-ofset, 50, 90,null);
	
		}
		else
		{
			
			//WinGame(g);
			GameOver(g);
		}
		
		drawBoard(g);											
		
		
	}
	
	
	
	public void keyPressed(KeyEvent e) {
	
		int source  = e.getKeyCode();
		if(source == KeyEvent.VK_RIGHT)
		{
			right = true;
		}
		if(source  == KeyEvent.VK_LEFT)
		{
			left = true;
		}
		if(source  == KeyEvent.VK_UP)
		{
			up = true;
		}
		if(source  == KeyEvent.VK_DOWN)
		{
			down = true;
		}
	}
	
	public void keyReleased(KeyEvent e) {
	
		int source  = e.getKeyCode();
		if(source == KeyEvent.VK_RIGHT)
		{
			right = false;
		}
		if(source  == KeyEvent.VK_LEFT)
		{
			left = false;
		}
		if(source  == KeyEvent.VK_UP)
		{
			up = false;
		}
		if(source  == KeyEvent.VK_DOWN)
		{
			down = false;
		}
		
	}
public void keyTyped(KeyEvent e) {
	
		
	}

}
