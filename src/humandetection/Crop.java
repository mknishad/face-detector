package humandetection;

import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

public class Crop {
    
    private BufferedImage img; //delcare a Buffered Image
    private BufferedImage croppedImg; //delcare a Buffered Image
    private int x1, x2, y1, y2; //declare int type variables
    private int[][] pixels; //declare 2 dimentional array
    
    public void readImage() 
    {
        img = HumanDetection.openImg; //read the image from HumanDetection class
    }
    
    public void crop() 
    {
        //get the first position of x1
        x1 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "x1:", "Enter dimentions", JOptionPane.PLAIN_MESSAGE, null, null, ""));
        //get the first position of y1
        y1 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "y1:", "Enter dimentions", JOptionPane.PLAIN_MESSAGE, null, null, ""));
        //get the last position of x2
        x2 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "x2:", "Enter dimentions", JOptionPane.PLAIN_MESSAGE, null, null, ""));
        //get the last position of y2
        y2 = Integer.parseInt((String)JOptionPane.showInputDialog(null, "y2:", "Enter dimentions", JOptionPane.PLAIN_MESSAGE, null, null, ""));
        
        pixels = new int[x2-x1][y2-y1]; //subtract the positon of x2, x1 and y2, y1 and then set the 2D array row and column size 
        
        for(int i=x1; i<x2; i++) //loop will continue the position of x1 to x2
        {
            for(int j=y1; j<y2; j++) //loop will continue the position of y1 to y2
            {
                //get the integer pixel in the default RGB color model
                //the i, j coordinate of the pixel from which to get the pixel in the default RGB color model
                pixels[i-x1][j-y1] = img.getRGB(i, j); 
                                
            }
        }
        
        //set the cropped image width, height and type from it's starting and ending position 
        croppedImg = new BufferedImage(x2-x1, y2-y1, BufferedImage.TYPE_INT_RGB);
        for(int i=0; i<pixels.length; i++) //loop will continue the length of the row of the pixel array
        {
            for(int j=0; j<pixels[0].length; j++) // loop will contine through the column
            {
                croppedImg.setRGB(i, j, pixels[i][j]); //sets an array of integer pixels in the default RGB color model
            }
        }
    }

    public BufferedImage getCroppedImg() 
    {
        return croppedImg; //return the cropped image
    }
    
}
