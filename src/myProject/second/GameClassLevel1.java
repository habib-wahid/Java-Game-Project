
package myProject.second;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;


public class GameClassLevel1 implements Runnable {

	
	private DisplayLevel1 display;
	public int width,height;
	public String title;
	private boolean running  = false;
	private int y;
	private Thread thread;
	private gameManagerLevel1 manager;
	
	private BufferStrategy bs;
	private Graphics g;

	
	public GameClassLevel1(String title,int width,int height)
	{
		this.width = width;
		this.height = height;
		this.title = title;
	
		
		
	}
	
	
	
	private void init() {
		display = new DisplayLevel1 ( title, width,height);
		
		
		
		manager = new gameManagerLevel1();
		manager.init();
		
		
		//new Menu();
		
		
	}
	

	private void tick()
	 	{
		
		
		manager.tick();
		
	    
	    }
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);
																	
		
		manager.render(g);
																																									
		bs.show();
		g.dispose();
	}
	
	public void run()
	{
		init();
		
		int fps = 60;																			
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long current = System.nanoTime();
		
		
		
		while(running)
		{
			delta = delta+(System.nanoTime()-current)/timePerTick;
			current  = System.nanoTime();
			if(delta>=1)
			{
				
			tick();
			render();
			delta--;
			
			}
		}
		stop();
	}
	public synchronized void start()
	{
		if(running)
			return ;
		running  = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop()
	{
																																																																																																			
																										
	    if(running == false)
	    	return;
		running  = false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}