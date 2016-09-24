package humandetection;

import java.awt.image.BufferedImage;

public class RGBValues {
    
    private BufferedImage img; //delcare a Buffered Image
    private String str;
    
    public RGBValues() {
        str = "";
    }
    
    public void readImage() {
        img = HumanDetection.openImg; //read the image from HumanDetection class
    }
    
    public void findRGB() {
        for(int i=0; i<img.getWidth()/10; i++) 
        {
            for(int j=0; j<img.getHeight()/10; j++) 
            {
                int pixel = img.getRGB(i, j);
                int red = (pixel & 0x00ff0000) >> 16;
                int green = (pixel & 0x0000ff00) >> 8;
                int blue = (pixel & 0x000000ff);
                str = str + String.format("At(%d,%d):\n    Red:%d\n    Green:%d\n    Blue:%d\n", i,j,red,green,blue);
            }
        }
    }

    public String getStr() {
        return str;
    }
    
}
