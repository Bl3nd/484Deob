import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

abstract class eg {

	static vg vg_a = null;
	static int int_b;
	int[] ints_c;
	int int_d;
	static lf lf_e = dd.a("gr-Un:", 2);
	static int int_f;
	static int int_g = 0;
	Image image_h;
	int int_i;
	static lf lf_j = dd.a("Lade Titelbild )2 ", 2);
	static boolean boolean_k = true;

	final void a(byte var1) {
		try {
			b.a(this.ints_c, this.int_i, this.int_d);
			++int_b;
			if (var1 != 10) {
				this.ints_c = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "eg.L(" + var1 + ')');
		}
	}

	public static void a(int var0) {
		try {
			int var1 = 104 % ((15 - var0) / 48);
			lf_e = null;
			lf_j = null;
			vg_a = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "eg.K(" + var0 + ')');
		}
	}

	abstract void a(int var1, int var2, Component var3, int var4);

	abstract void a(int var1, byte var2, Graphics var3, int var4);

	abstract void a(int height, int width, int imageX, Graphics graphics, int rectY, int rectX);
}
