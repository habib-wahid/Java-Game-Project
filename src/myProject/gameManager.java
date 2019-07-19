package myProject;

import java.awt.Graphics;

import java.util.ArrayList;
import java.util.Random;

public class gameManager {

	private world world;
	private Motor motor;
	
	private speedMeter meter;	
	
	private long time = System.nanoTime();																																																																																																														
	private long delay;
	
	private int health;
	
	private ArrayList<EnemyMotor> eMotor;
	
	

	public gameManager()
	{
		motor = new Motor();
		world = new world(motor);
		meter = new speedMeter(motor);
		
		eMotor = new ArrayList<EnemyMotor>();
		
		delay = 2000;
		
		health = 3;
		
		
	}
	public void init()
	{
													
		loadImage.init();
		motor.init();
		
	}
	public void tick()
	{
		
		Random rand = new Random();
		int randX = rand.nextInt(350);		
		int randY = rand.nextInt(Display.height);
		
		while(randX<120)
		{
			randX  = rand.nextInt(300);
		}
		
		for(int i=0;i<eMotor.size();i++)
		{
			
			int px = motor.getX();
			int py = motor.getY();
			
		    int ex = eMotor.get(i).getX();
	    	int ey = eMotor.get(i).getY();
	    	
	    	if(px< ex+50 && px+50>ex && py<ey+50 && py+50>ey)
	    	{
	    		
	    		eMotor.remove(i);
	    		i--;
	    		health--;
	    		motor.setSpeed(1);
	    		
	    		System.out.println(health);
	    		motor.setHealth(health);
	    		
	    		
	    		
	    	}
					
		}
		
		long elapsed = (System.nanoTime() - time)/ 1000000;
		
		if(elapsed>delay) {
		
			
			if(motor.getSpeed()>=5)
			{
		
		eMotor.add(new EnemyMotor(motor,randX,(-randY) + motor.getofset()));
		
			}
		time  = System.nanoTime();
		
		}
	
		motor.tick();
		for(int i=0;i<eMotor.size();i++)
		{
			eMotor.get(i).tick();
		}
				
	}
	
	public void render(Graphics g)
	{
	    world.render(g);
		motor.render(g);
		meter.render(g);
		
		
		
		for(int i=0;i<eMotor.size();i++)
		{
			eMotor.get(i).render(g);
			
		}
		
		
	}
}
