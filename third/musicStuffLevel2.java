package myProject.third;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class musicStuffLevel2 {

	public musicStuffLevel2() {
		// TODO Auto-generated constructor stub
	}
	
	 public static void playMusic(String musicLocation)
	{
		
		try
		{
			File musicPath = new File(musicLocation);
			
			if(musicPath.exists())
			{
				
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);	
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				clip.start();
				
				JOptionPane.showMessageDialog(null, "Press OK ");
			}
			else
			{
				System.out.println("Can't find file");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
