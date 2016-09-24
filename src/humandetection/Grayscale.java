package humandetection;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class Grayscale 
{

    static RenderedImage gsImage; //delcare a Rendered Image
    
    private BufferedImage img; //delcare a Buffered Image
    private BufferedImage newImg; //delcare a Buffered Image
    private int red;
    private int green;
    private int blue;
    
    public void readImage() 
    {
        img = HumanDetection.openImg; //read the image from HumanDetection class
    }
    
    public void writeImage() 
    {
        //set the image width, height and type
        newImg = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        for(int i=0; i<img.getWidth(); i++)//loop will continue till the image width through the row
        {
            for(int j=0; j<img.getHeight(); j++)//loop will continue till the image height trough the column
            {
            
               Color c = new Color(img.getRGB(i, j)); //get default RGB color model from the i, j postion 
               red = (int)(c.getRed() * 0.299); //get red value
               green = (int)(c.getGreen() * 0.587);// get green value
               blue = (int)(c.getBlue() *0.114); //get blue value
               //set the all color combination to newcolor
               Color newColor = new Color(red+green+blue, red+green+blue, red+green+blue); 
               
               newImg.setRGB(i,j,newColor.getRGB()); //set the default RGB color model to newImg
            }
        }
    }

    /**
     * @return the newImg
     */
    public BufferedImage getNewImg() 
    {
        return newImg;//return the image
    }
    
}
