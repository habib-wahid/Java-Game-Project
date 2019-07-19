package myProject;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class loadImage {

	public static BufferedImage fullimage,road,grass,footPath,Viper,playerViper,enemyViper,fullimage1,fullimage2,fullimage3,road1,grass1,footPath1;
	public static void init()
	{
		fullimage = imageLoader("/textures/tile1.png");
		fullimage1=imageLoader("/textures/tile2.png");
		fullimage2 = imageLoader("/textures/tile3.png");
		fullimage3 = imageLoader("/textures/car3.png");
		Viper = imageLoader("/textures/car6.png");
		enemyViper = imageLoader("/textures/policeCar.png");
		crop();
	}
	public static BufferedImage imageLoader(String path)
	{
		try {
			return ImageIO.read(loadImage.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
	
	
	public static void crop() {
		/*
		grass = fullimage.getSubimage(130*2, 0, 130, 120);	
		road  = fullimage.getSubimage(132, 0, 130, 120);
		footPath = fullimage.getSubimage(0, 0, 130, 120);
		
		*/
		road= fullimage2.getSubimage(0, 0, 117, 120);
		grass = fullimage2.getSubimage(118, 0, 130, 120);
		footPath= fullimage2.getSubimage(118*2, 0, 130, 120);
		
		//playerViper = Viper.getSubimage(0, 0, 245, 556);
		
		
	}
}
