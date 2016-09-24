package humandetection;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class RotateLeft {

    private BufferedImage img;
    private BufferedImage newImg;
    private int[] pixel;
    private int[][] newPixel;

    public void readImageFromLabel1() {
        img = HumanDetection.openImg;

        pixel = new int[img.getWidth() * img.getHeight()];
        int p = 0;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                pixel[p++] = img.getRGB(i, j);
            }
        }
    }

    public void readImageFromLabel2() {
        img = new BufferedImage(HumanDetection.icon2.getIconWidth(), HumanDetection.icon2.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = img.createGraphics();
        HumanDetection.icon2.paintIcon(null, g, 0, 0);
        g.dispose();

        pixel = new int[img.getWidth() * img.getHeight()];
        int p = 0;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                pixel[p++] = img.getRGB(i, j);
            }
        }
    }

    public void rotate() {
        newPixel = new int[img.getHeight()][img.getWidth()];

        int k = 0;
        for (int i = img.getWidth() - 1; i >= 0; i--) {
            for (int j = 0; j < img.getHeight(); j++) {
                newPixel[j][i] = pixel[k++];
            }
        }
    }

    public void writeImage() {
        newImg = new BufferedImage(img.getHeight(), img.getWidth(), BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < getNewImg().getWidth(); i++) {
            for (int j = 0; j < getNewImg().getHeight(); j++) {
                getNewImg().setRGB(i, j, newPixel[i][j]);
            }
        }
    }

    /**
     * @return the newImg
     */
    public BufferedImage getNewImg() {
        return newImg;
    }

}
