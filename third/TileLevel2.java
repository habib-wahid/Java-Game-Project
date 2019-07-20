package myProject.third;

import java.awt.Graphics;
import java.awt.image.BufferedImage;



public class TileLevel2 {
	
	
	public static TileLevel2[] tiles = new TileLevel2[24];
	/*
	public static Tile roadTile = new roadTile(0);
	
	public static Tile grassTile = new grassTile(1);
	
	public static Tile footPathTile = new footPathTile(2);*/
	
    public static TileLevel2 roadTile = new roadTileLevel2(0);
    	
	public static TileLevel2 grassTile = new grassTileLevel2(1);
	
	public static TileLevel2 footPathTile = new footPathTileLevel2(2);
		
	public BufferedImage texture;
		
	public static final int tileWidth = 64, tileHeight = 64;
	
	public TileLevel2(BufferedImage texture,int id) {
		this.texture = texture;
		tiles[id] = this;
		
	}

	public void render(Graphics g,int x,int y) {
		
		g.drawImage(texture, x,y, null);
		
	}
}
