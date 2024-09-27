import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageEncryptionTool {
    private BufferedImage image;

    public ImageEncryptionTool(String imagePath) throws IOException {
        image = ImageIO.read(new File(imagePath));
    }

    public void swapPixels(int x1, int y1, int x2, int y2) {
        int pixel1 = image.getRGB(x1, y1);
        int pixel2 = image.getRGB(x2, y2);
        image.setRGB(x1, y1, pixel2);
        image.setRGB(x2, y2, pixel1);
    }

    public void addConstant(int constant) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                pixel += constant;
                image.setRGB(x, y, pixel);
            }
        }
    }

    public void multiplyConstant(int constant) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int pixel = image.getRGB(x, y);
                pixel *= constant;
                image.setRGB(x, y, pixel);
            }
        }
    }

    public void saveEncryptedImage(String outputPath) throws IOException {
        ImageIO.write(image, "jpg", new File(outputPath));
    }
}