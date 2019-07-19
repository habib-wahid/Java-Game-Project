package myProject.second;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class loadImageLevel1 {

	public static BufferedImage fullimage,road,grass,footPath,Viper,playerViper,enemyViper,fullimage1,fullimage2,fullimage3,road1,grass1,footPath1;
	public static void init()
	{
		fullimage = imageLoader("/textures/tile1.png");
		fullimage1=imageLoader("/textures/tile2.png");
		fullimage2 = imageLoader("/textures/tile3.png");
		fullimage3 = imageLoader("/textures/car3.png");
		Viper = imageLoader("/textures/car.png");
		enemyViper = imageLoader("/textures/policeCar.png");
		crop();
	}
	public static BufferedImage imageLoader(String path)
	{
		try {
			return ImageIO.read(loadImageLevel1.class.getResource(path));
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
		grass= fullimage.getSubimage(0, 0, 127, 125);
		road = fullimage.getSubimage(127, 0, 127, 125);
		footPath= fullimage.getSubimage(127*2, 0, 127, 125);
		
		//playerViper = Viper.getSubimage(0, 0, 245, 556);
		
		
	}
}
