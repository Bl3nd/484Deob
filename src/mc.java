import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

final class mc extends eg implements ImageProducer, ImageObserver {

	private ImageConsumer imageConsumer_l;
	static int int_m;
	static int int_n;
	static int int_o;
	static int int_p = 0;
	static int int_q;
	static int int_r;
	static int[] ints_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w;
	static int x = 0;
	static lf y = dd.a(" )2> ", 2);
	static lf[] z = new lf[500];
	static int A = 0;
	private ColorModel B;
	static int C;
	static int D;
	static int E;
	static int F;
	static int G;
	static int H;
	static int I;
	static int J;

	static final int a(int var0, int var1, int var2, int var3) {
		try {
			if (var0 != 24916) {
				a((byte) 83, 14);
			}

			++int_u;
			int var5 = var3 & -1 + var1;
			int var7 = var2 & var1 + -1;
			int var6 = var2 / var1;
			int var4 = var3 / var1;
			int var8 = h.a(var6, var4, (byte) -118);
			int var9 = h.a(var6, var4 + 1, (byte) -108);
			int var10 = h.a(1 + var6, var4, (byte) -42);
			int var11 = h.a(1 + var6, var4 - -1, (byte) -70);
			int var12 = dh.a(var1, var9, var0 + 6330, var8, var5);
			int var13 = dh.a(var1, var11, var0 + 6330, var10, var5);
			return dh.a(var1, var13, var0 ^ 7002, var12, var7);
		} catch (RuntimeException var14) {
			throw ec.a(var14, "mc.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private final synchronized void b(int var1) {
		try {
			if (var1 <= 107) {
				this.B = null;
			}

			++int_v;
			if (this.imageConsumer_l != null) {
				this.imageConsumer_l.setPixels(0, 0, super.int_i, super.int_d, this.B, super.ints_c, 0, super.int_i);
				this.imageConsumer_l.imageComplete(2);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.B(" + var1 + ')');
		}
	}

	private final synchronized void a(int var1, int var2, int var3, boolean var4, int var5) {
		try {
			++int_t;
			if (this.imageConsumer_l != null) {
				this.imageConsumer_l.setPixels(var5, var3, var1, var2, this.B, super.ints_c, var5 + super.int_i * var3, super.int_i);
				if (var4) {
					this.imageConsumer_l.imageComplete(2);
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "mc.I(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			++int_w;
			return true;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "mc.imageUpdate(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	static final void a(lf var0, lf var1, int var2, lf var3, int var4) {
		int var6 = client.int_gc;

		try {
			++G;
			int var5 = 99;
			if (var6 == 0 && var5 <= 0) {
				md.lfs_k[0] = var0;
				jc.E[0] = var3;
				lc.A[0] = var2;
				tg.T = hf.int_p;
				hf.x[0] = var1;
				++ad.int_r;
				if (var4 < 76) {
					int_p = -114;
				}
			} else {
				do {
					lc.A[var5] = lc.A[-1 + var5];
					md.lfs_k[var5] = md.lfs_k[-1 + var5];
					jc.E[var5] = jc.E[-1 + var5];
					hf.x[var5] = hf.x[-1 + var5];
					--var5;
				} while (var5 > 0);

				md.lfs_k[0] = var0;
				jc.E[0] = var3;
				lc.A[0] = var2;
				tg.T = hf.int_p;
				hf.x[0] = var1;
				++ad.int_r;
				if (var4 < 76) {
					int_p = -114;
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "mc.D(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}

	static final int a(byte var0, int var1) {
		try {
			rd var2 = nb.a(true, var1);
			int var3 = var2.N;
			++int_q;
			int var5 = var2.U;
			int var4 = var2.S;
			int var6 = client.ints_jb[var5 + -var4];
			return var0 < 98 ? 26 : uc.ints_ub[var3] >> var4 & var6;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "mc.J(" + var0 + ',' + var1 + ')');
		}
	}

	public final synchronized void removeConsumer(ImageConsumer var1) {
		try {
			if (var1 == this.imageConsumer_l) {
				this.imageConsumer_l = null;
			}

			++J;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.removeConsumer(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, int var2, Component component, int var4) {
		try {
			++int_m;
			super.ints_c = new int[var4 * var2 - -1];
			super.int_i = var2;
			int var5 = 100 % ((82 - var1) / 42);
			super.int_d = var4;
			this.B = new DirectColorModel(32, 16711680, '\uff00', 255);
			super.image_h = component.createImage(this);
			this.b(124);
			component.prepareImage(super.image_h, this);
			this.b(127);
			component.prepareImage(super.image_h, this);
			this.b(123);
			component.prepareImage(super.image_h, this);
			this.a((byte) 10);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "mc.G(" + var1 + ',' + var2 + ',' + (component != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}

	public static void c(int var0) {
		try {
			if (var0 < 98) {
				a((lf) null, (lf) null, 87, (lf) null, 2);
			}

			z = null;
			ints_s = null;
			y = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "mc.A(" + var0 + ')');
		}
	}

	final void a(int height, int width, int imageX, Graphics graphics, int rectY, int rectX) {
		try {
			this.a(width, height, rectY, true, rectX);
			Shape shape = graphics.getClip();
			++D;
			graphics.clipRect(rectX, rectY, width, height);
			graphics.drawImage(super.image_h, imageX, 0, this);
			graphics.setClip(shape);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "mc.E(" + height + ',' + width + ',' + imageX + ',' + (graphics != null ? "{...}" : "null") + ',' + rectY + ',' + rectX + ')');
		}
	}

	public final synchronized void addConsumer(ImageConsumer var1) {
		try {
			++C;
			this.imageConsumer_l = var1;
			var1.setDimensions(super.int_i, super.int_d);
			var1.setProperties((Hashtable) null);
			var1.setColorModel(this.B);
			var1.setHints(14);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.addConsumer(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(vg var0, int var1) {
		try {
			if (~lb.int_e == ~var0.int_bc) {
				va.booleans_db[var0.O] = true;
			}

			if (var1 != -23101) {
				A = -49;
			}

			++int_n;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public final synchronized boolean isConsumer(ImageConsumer var1) {
		try {
			++H;
			return var1 == this.imageConsumer_l;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.isConsumer(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void requestTopDownLeftRightResend(ImageConsumer var1) {
		try {
			++E;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.requestTopDownLeftRightResend(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void startProduction(ImageConsumer var1) {
		try {
			++F;
			this.addConsumer(var1);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mc.startProduction(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int imageX, byte var2, Graphics var3, int imageY) {
		try {
			++I;
			if (var2 >= -21) {
				c(-53);
			}

			this.b(125);
			var3.drawImage(super.image_h, imageX, imageY, this);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "mc.H(" + imageX + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + imageY + ')');
		}
	}
}
