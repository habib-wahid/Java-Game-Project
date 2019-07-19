package myProject.second;

import java.awt.Graphics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class worldLevel1 {
	
	private int[][] tile;
	private int width,height;
	private MotorLevel1 motor;
	
	public worldLevel1(MotorLevel1 motor ) {
		
		loadWorld("res/textures/world.txt");
		this.motor = motor;
	}			
	
	
	private int parseInt(String number) {
		return Integer.parseInt(number);
	}
	
	private void loadWorld(String path)
	{
		String file = loadFile(path);
		String[] space = file.split("\\s+");
		width = parseInt(space[0]);
		 height = parseInt(space[1]);
		tile = new int[width][height];
		for(int x=0;x<width;x++)
		{
			for(int y=0;y<height;y++) {
				tile[x][y] = parseInt(space [ 2+ (x+y * width)]);
			}
		}
	}
	
	
	public String loadFile(String path) {
		
		StringBuilder sr = new StringBuilder();
	
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line;
			while((line  = reader.readLine()) != null )
			{
				sr.append(line+ "\n");
			}
			reader.close();
	
			
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
			
			
		}
		
		return sr.toString();
		
	}
	
	public void render(Graphics g) {
		
		int start =Math.max(0, motor.getofset()/TileLevel1.tileHeight);
		
		int end =Math.min(height,  (motor.getofset() + DisplayLevel1.height + 20 ) / TileLevel1.tileHeight); 
		
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				TileLevel1 t = TileLevel1.tiles[tile[i][j]];
				
				t.render(g, i*TileLevel1.tileWidth, (j*TileLevel1.tileHeight) - motor.getofset());
			}
		}
	}

}
