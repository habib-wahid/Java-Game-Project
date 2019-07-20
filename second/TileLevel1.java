package myProject.second;

import java.awt.Graphics;
import java.awt.image.BufferedImage;



public class TileLevel1 {
	
	
	public static TileLevel1[] tiles = new TileLevel1[24];
	/*
	public static Tile roadTile = new roadTile(0);
	
	public static Tile grassTile = new grassTile(1);
	
	public static Tile footPathTile = new footPathTile(2);*/
	
    public static TileLevel1 roadTile = new roadTileLevel1(0);
    	
	public static TileLevel1 grassTile = new grassTileLevel1(1);
	
	public static TileLevel1 footPathTile = new footPathTileLevel1(2);
		
	public BufferedImage texture;
		
	public static final int tileWidth = 64, tileHeight = 64;
	
	public TileLevel1(BufferedImage texture,int id) {
		this.texture = texture;
		tiles[id] = this;
		
	}

	public void render(Graphics g,int x,int y) {
		
		g.drawImage(texture, x,y, null);
		
	}
}
