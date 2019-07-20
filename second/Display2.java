package myProject.second;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import myProject.GameClass;
import myProject.musicStuff;
import myProject.third.GameClassLevel2;
import myProject.third.musicStuffLevel2;

public class Display2  extends JFrame implements ActionListener {

	
	private GameClassLevel2 game2;
	private GameClassLevel1 game1;
	private musicStuff music1;
	
	private GameClass game;
	private musicStuff music;
	private JButton click,click1,click2;
	public Display2() {
			
		
		
	     	game  = new GameClass("car",600,600);
		    music = new musicStuff();
		    game1 = new GameClassLevel1("Car",600,600);
		    game2 = new GameClassLevel2("car",600,600);
		
	     setLayout(null);
	     setSize(600,600);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   // setColor(Color.black);
	    
	    
	    click = new JButton("Level-1");
	    click.setBounds(200, 150, 200, 50);
	    click.addActionListener(this);
	    
	    click1 = new JButton("Level-2");
	    click1.setBounds(200, 250, 200, 50);
	    click1.addActionListener(this);
	    
	    click2 = new JButton("Level-3");
	    click2.setBounds(200, 350, 200, 50);
	    click2.addActionListener(this);
	    		
	    add(click);
	    add(click1);
	    add(click2);
	    setVisible(true);
	    
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == click)
		{	
			
			 game.start();	
			 String filepath = "music.wav";
	    	 musicStuff musicObject  = new musicStuff();
	    	 musicObject.playMusic(filepath);
			//sound.init();
		}
		if(e.getSource() == click1)
		{
		     game1.start();
		     String filepath1 = "music2.wav";
	    	 musicStuffLevel1 musicObject  = new musicStuffLevel1();
	    	 musicObject.playMusic(filepath1);
		  
		}
		if(e.getSource() == click2)
		{
			game2.start();
			String filepath2 = "music3.wav";
	    	 musicStuffLevel2 musicObject  = new musicStuffLevel2();
	    	 musicObject.playMusic(filepath2);
		}
	}

}
