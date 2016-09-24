package humandetection;

import java.awt.image.BufferedImage;
import java.awt.*;

public class BlackWhite {
    
    private BufferedImage colorImg; //delcare a Buffered Image
    private BufferedImage bwImg; //delcare a Buffered Image
    

    public void readImage() 
    {
        colorImg = HumanDetection.openImg; //read the image from HumanDetection class
    }
    
    public void writeImage() 
    {
        //get the image width, height and type 
        bwImg = new BufferedImage(colorImg.getWidth(),colorImg.getHeight(),BufferedImage.TYPE_BYTE_BINARY); 
        //drawing an image to a back buffer and then copying that buffer onto the screen instead of drawing directly to the screen.
        Graphics2D g = getBwImg().createGraphics(); 
        g.drawImage(colorImg,0,0,null);//draw the image in this position
    }

    /**
     * @return the bwImg
     */
    public BufferedImage getBwImg() 
    {
        return bwImg;//return the Image
    }
    
}
