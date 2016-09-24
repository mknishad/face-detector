package humandetection;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Zoom extends Canvas implements ImageObserver
{
    Image img; //declare an image
    int iw; //declare image width
    int ih; //declare image height
    int x,y; //declare x and y
    int adjX = 0; //initialized adjX
    int adjY = 0; //initialized adjY
    int adjW = 0; //initialized adjW
    int adjH = 0; //initialized adjH
    Dimension ds; //initialized dimension

    Zoom()
    {
        //img = getToolkit().getImage("TestImg.jpg");
        img = HumanDetection.openImg; //read the image from HumanDetection class

        ds = getToolkit().getScreenSize(); //get the screen size
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g; //cast Graphics to Graphics2D
        setImageBounds(); //call setImageBounds method
        g2d.translate(x, y); //translate the image in x,y position

        g2d.drawImage(img, -300, -100, iw,ih, this); //draw the image in this position
    }

    public void setImageBounds()
    {
        // substract the half of dimension of the screen size to half of image width + adjX
        x = (int) ds.getWidth()/2 - img.getWidth(this)/2+adjX; 
        // substract the half of dimension of screen size and half to image width + adjy   
        y = (int) ds.getHeight()/2 - img.getHeight(this)/2+adjY;

        iw = img.getWidth(this)+adjW; //add image width + adjW and store it to iw
        ih = img.getHeight(this)+adjH;//add image width + adjW and store it to ih
    }

    public void zoomIn()
    {
        adjX -= 10; //decrease adjX by -10
        adjY -= 10; //decrease adjY by -10
        adjW += 20; //increase adjW by +20
        adjH += 20; //increase adjH by +20

    }

    public void zoomOut()
    {
        if(adjX != 110 ) //set the limit of zoom out
        {
            adjX += 10; //increase adjX by +10
            adjY += 10; //increase adjY by +10
            adjW -= 20; //decrease adjW by -20
            adjH -= 20; //decrease adjH by -20
        }
    }
}

