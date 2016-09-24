package humandetection;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class EdgeDetection {
    
    private float[] mask; //delcare a mask array
    private BufferedImage img; //delcare a Buffered Image
    private BufferedImage newImg; //delcare a Buffered Image
    private Kernel k; //declare Kernel 
    private ConvolveOp conv;// delcare ConvolveOp

    /**
     * Constructor
     */
    public EdgeDetection() {
        this.mask = new float[]{1.0f, 2.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -2.0f, -1.0f}; //set the mask
    }
    
    public void readImage() {
        setImg(HumanDetection.openImg); //read the image from HumanDetectin class
    }
    
    public void writeImage() {
        setK(new Kernel(3, 3, getMask())); //set 3X3 matrix mask in the kernel
        setNewImg(new BufferedImage(getImg().getWidth(), getImg().getHeight(), BufferedImage.TYPE_BYTE_BINARY));
        setConv(new ConvolveOp(getK(), ConvolveOp.EDGE_NO_OP, null));
        getConv().filter(getImg(), getNewImg());
    }

    /**
     * @return the mask
     */
    public float[] getMask() {
        return mask;
    }

    /**
     * @param mask the mask to set
     */
    public void setMask(float[] mask) {
        this.mask = mask;
    }

    /**
     * @return the img
     */
    public BufferedImage getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(BufferedImage img) {
        this.img = img;
    }

    /**
     * @return the newImg
     */
    public BufferedImage getNewImg() {
        return newImg;
    }

    /**
     * @param newImg the newImg to set
     */
    public void setNewImg(BufferedImage newImg) {
        this.newImg = newImg;
    }

    /**
     * @return the k
     */
    public Kernel getK() {
        return k;
    }

    /**
     * @param k the k to set
     */
    public void setK(Kernel k) {
        this.k = k;
    }

    /**
     * @return the con
     */
    public ConvolveOp getConv() {
        return conv;
    }

    /**
     * @param conv the con to set
     */
    public void setConv(ConvolveOp conv) {
        this.conv = conv;
    }
    
}
