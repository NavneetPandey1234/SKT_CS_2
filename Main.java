import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageEncryptionTool tool = new ImageEncryptionTool("input_image.jpg");

        // Swap pixels at positions (10, 10) and (20, 20)
        tool.swapPixels(10, 10, 20, 20);
        tool.swapPixels(10, 10, 20, 20);

        // Add 50 to each pixel
        tool.addConstant(50);

        // Multiply each pixel by 2
        tool.multiplyConstant(2);

        // Save the encrypted image
        tool.saveEncryptedImage("output.jpg");
    }
}