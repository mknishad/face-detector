
package humandetection;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.objdetect.CascadeClassifier;

/**
 *
 * @author Nishad
 */
public class FaceDetection {

    private BufferedImage img;      //  the opened image
    private BufferedImage newImg;   //  the image to write
    private File imgFile;           //  the file generated with the image
    private CascadeClassifier faceDetector;     // the CascadeClassifier to detect face in the image
    private Mat image;              //  MAT type image
    private MatOfRect faceDetections;   //  the rectangles to put on face
    private String noOfFaces;       // counter for detected faces

    // read the selected image
    public void readImage() {
        setImg(HumanDetection.openImg);
    }

    // detect face from the image
    public void detectFace() {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        String url = "C:\\opencv\\sources\\data\\haarcascades\\haarcascade_frontalface_alt.xml";
        setFaceDetector(new CascadeClassifier(url));
        //setFaceDetector(new CascadeClassifier(getClass().getResource("haarcascade_frontalface_alt.xml").getPath()));
        setImage(Highgui.imread(HumanDetection.f.getPath()));
        setFaceDetections(new MatOfRect());

        getFaceDetector().detectMultiScale(getImage(), getFaceDetections());
        setNoOfFaces(String.format("%s", getFaceDetections().toArray().length));

        for (Rect rect : getFaceDetections().toArray()) {
            Core.rectangle(getImage(), new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                new Scalar(0, 255, 0),2);
        }
    }

    // write image to the panel
    public void writeImage() {
        Highgui.imwrite("output.jpg", getImage());

        try {
            setImgFile(new File("output.jpg"));
            setNewImg(ImageIO.read(getImgFile()));
        } catch (IOException e) {
        }
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
     * @return the imgFile
     */
    public File getImgFile() {
        return imgFile;
    }

    /**
     * @param imgFile the imgFile to set
     */
    public void setImgFile(File imgFile) {
        this.imgFile = imgFile;
    }

    /**
     * @return the faceDetector
     */
    public CascadeClassifier getFaceDetector() {
        return faceDetector;
    }

    /**
     * @param faceDetector the faceDetector to set
     */
    public void setFaceDetector(CascadeClassifier faceDetector) {
        this.faceDetector = faceDetector;
    }

    /**
     * @return the image
     */
    public Mat getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Mat image) {
        this.image = image;
    }

    /**
     * @return the faceDetections
     */
    public MatOfRect getFaceDetections() {
        return faceDetections;
    }

    /**
     * @param faceDetections the faceDetections to set
     */
    public void setFaceDetections(MatOfRect faceDetections) {
        this.faceDetections = faceDetections;
    }

    /**
     * @return the noOfFaces
     */
    public String getNoOfFaces() {
        return noOfFaces;
    }

    /**
     * @param noOfFaces the noOfFaces to set
     */
    public void setNoOfFaces(String noOfFaces) {
        this.noOfFaces = noOfFaces;
    }

}
