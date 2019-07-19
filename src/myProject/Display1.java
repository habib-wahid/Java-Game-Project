package myProject;

import java.awt.Color;




import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import myProject.second.Display2;


/*
 * 
         String filepath = "music.wav";
    	 musicStuff musicObject  = new musicStuff();
    	 musicObject.playMusic(filepath);
 */

public class Display1 extends JFrame implements ActionListener{
	
	private JButton click,click1,click2;
	private GameClass game;
	
	private Display2 display;
																																	
	private musicStuff music;
	private InstructionClass ins;
	 
		

  JFrame window;
  Container con;
  JPanel picturePanel;
  JLabel pictureLabel;
  ImageIcon Image;
	
	public Display1()
	{
		   
	    
	    
	    game  = new GameClass("car",600,600);
	    music = new musicStuff();
	   
	    
	    /*
	    ImageLoader1.init();
	    
		window  = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		picturePanel = new JPanel();
		picturePanel.setBounds(150, 100, 500, 300);
		picturePanel.setBackground(Color.red);
		con.add(picturePanel);
	    
        pictureLabel = new JLabel();
		
	    Image = new ImageIcon(".//res//textures//Display1.png");	
	    pictureLabel.setIcon(Image);
	    picturePanel.add(pictureLabel);*/
	    
		//window  = new JFrame();
		
		//sound  = new PlaySoundapplet();
	     setLayout(null);
	     setSize(600,600);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   // setColor(Color.black);
	    
	    
	    click = new JButton("Play Game");
	    click.setBounds(200, 150, 200, 50);
	    click.addActionListener(this);
	    
	    click1 = new JButton("Instruction");
	    click1.setBounds(200, 250, 200, 50);
	    click1.addActionListener(this);
	    
	    click2 = new JButton("Exit");
	    click2.setBounds(200, 350, 200, 50);
	    click2.addActionListener(this);
	    		
	    add(click);
	    add(click1);
	    add(click2);
		//window.setVisible(true);
		
		
	}/*
	
	public void render(Graphics g)
	{
	  g.drawImage(ImageLoader1.back, 0, 0, null);
		
	}*/
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == click)
		{	
			
			
			new Display2();
			
			/*
			 game.start();	
			 String filepath = "music.wav";
	    	 musicStuff musicObject  = new musicStuff();
	    	 musicObject.playMusic(filepath);
			//sound.init();*/
		}
		if(e.getSource() == click1)
		{
		  ins = new InstructionClass();
		}
		if(e.getSource() == click2)
		{
			System.exit(0);
		}
	}

}
