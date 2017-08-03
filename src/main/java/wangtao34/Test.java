package wangtao34;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;

/**
 * 
 * @author wangtao34
 * @time 2017年7月31日 上午11:49:15
 */
public class Test {
	public static void main(String[] args) throws IOException {
//		Thumbnails.of("rotate.jpg").size(2000, 1920).rotate(2).toFile("rotateAfter.jpg");
		BufferedImage[] srcs = new BufferedImage[1];
		srcs[0] = ImageIO.read(new File("rotate.jpg"));
		BufferedImage src = ImageIO.read(new File("rotate.jpg"));
		BufferedImage bufferedImage = Thumbnails.of(src).size(1080, 1920).rotate(10).asBufferedImage();
		System.out.println(bufferedImage.getType());
		ImageIO.write(bufferedImage, "JPEG", new File("rotate3.jpg"));
	}
}
