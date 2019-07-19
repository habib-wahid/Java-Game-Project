package myProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class InstructionClass {
	
	private Display display;
	private BufferStrategy bs;
	private Graphics g;


	public InstructionClass() {
		// TODO Auto-generated constructor stub
		display = new Display ( "Car", 600,600);
		loadImage.init();
		
		
	}
	
	
	
	public void GameOver(Graphics g)

	  {
		  
		  g.setColor(Color.red);
		  g.setFont(new Font("cambria",Font.BOLD,33));	  
		  g.drawString("Game Over", Display.width/3, Display.height/2);
		  
	  }
	
	public void render(Graphics g)
	
	{
		
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null)
		{
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, 600, 600);
		
		GameOver(g);
		g.setColor(Color.green);
		
		g.fillRect(10, 10, 100, 100);
		//g.drawImage(loadImage.fullimage2, 0, 0, null);
		
		bs.show();
		g.dispose();
		
	}

}


