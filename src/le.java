import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class le extends eg {

	private Component component_l;

	final void a(int height, int width, int imageX, Graphics graphics, int rectY, int rectX) {
		Shape shape = graphics.getClip();
		graphics.clipRect(rectX, rectY, width, height);
		graphics.drawImage(this.image_h, imageX, 0, this.component_l);
		graphics.setClip(shape);
	}

	final void a(int var1, int var2, Component component, int var4) {
		this.ints_c = new int[var4 * var2 + 1];
		this.int_i = var2;
		this.int_d = var4;
		DataBufferInt dataBufferInt = new DataBufferInt(this.ints_c, this.ints_c.length);
		int var6 = -7 / ((82 - var1) / 42);
		DirectColorModel directColorModel = new DirectColorModel(32, 16711680, '\uff00', 255);
		WritableRaster writableRaster = Raster.createWritableRaster(directColorModel.createCompatibleSampleModel(this.int_i, this.int_d), dataBufferInt, null);
		this.image_h = new BufferedImage(directColorModel, writableRaster, false, new Hashtable());
		this.component_l = component;
		this.a((byte) 10);
	}

	final void a(int imageX, byte var2, Graphics graphics, int imageY) {
		graphics.drawImage(this.image_h, imageX, imageY, this.component_l);
		if (var2 >= -21) {
			this.a(-30, 11, null, 119);
		}

	}
}
