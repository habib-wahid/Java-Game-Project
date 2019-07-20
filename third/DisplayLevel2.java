package myProject.third;

import javax.swing.*;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

    public class DisplayLevel2 {
    public static JFrame frame;
    private Canvas canvas;
    
    private String title;
    public static  int width,height;
    
    
    
   public DisplayLevel2(String title,int width,int height)
    {
    	this.title = title;
    	this.width = width;
    	this.height = height;
    	createDisplay();
    }
   private void createDisplay()
   {
	   
	   frame = new JFrame(title);	
	  // frame.getContentPane().addMouseListener(new MouseInput());
	   frame.setSize(width,height);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setResizable(false);
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
	   canvas = new Canvas();
	   canvas.setPreferredSize(new Dimension(width,height));
	   canvas.setMaximumSize(new Dimension(width,height));
	   canvas.setMinimumSize(new Dimension(width,height));
	   canvas.setFocusable(false);
	   frame.add(canvas);
	   frame.pack();
	   
	   
   }
   public Canvas getCanvas() {
	   return canvas;
   }
   
}
