import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

final class jf extends hb {

	static int int_n = 0;
	int int_o;
	jb jb_p;
	int int_q;
	jb jb_r;
	private static lf lf_s = dd.a("Attack", 2);
	static int int_t;
	static int int_u;
	static lf lf_v;
	i i_w;
	private static lf x = dd.a("Connection timed out)3", 2);
	int y;
	int z;
	static int A;
	static lf B;
	static lf C = dd.a("Lade Wordpack )2 ", 2);
	int D;
	int F;
	int[] G;
	int H;
	int I;
	static int[] J;
	int K;
	int L;
	static lf M;

	final void a(int var1) {
		try {
			int var2 = this.int_q;
			++int_t;
			if (var1 == 0) {
				label24:
				{
					i var3 = this.i_w.b(52);
					if (var3 == null) {
						this.G = null;
						this.K = 0;
						this.I = 0;
						this.F = 0;
						this.int_q = -1;
						if (client.int_gc == 0) {
							break label24;
						}
					}

					this.K = var3.int_sb;
					this.I = 128 * var3.Gb;
					this.G = var3.Db;
					this.F = var3.Y;
					this.int_q = var3.Pb;
				}

				if (~this.int_q != ~var2 && this.jb_r != null) {
					pe.t_b.b(this.jb_r);
					this.jb_r = null;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "jf.D(" + var1 + ')');
		}
	}

	static final void a(Color var0, int var1, lf var2, int var3) {
		try {
			try {
				Graphics var4 = ae.U.getGraphics();
				if (cb.font_f == null) {
					cb.font_f = new Font("Helvetica", 1, 13);
					cf.x = ae.U.getFontMetrics(cb.font_f);
				}

				if (ib.boolean_s) {
					ib.boolean_s = false;
					var4.setColor(Color.black);
					var4.fillRect(0, 0, og.int_e, pa.int_e);
				}

				if (var0 == null) {
					var0 = new Color(140, 17, 17);
				}

				try {
					if (pf.R == null) {
						pf.R = ae.U.createImage(304, 34);
					}

					Graphics var10 = pf.R.getGraphics();
					var10.setColor(var0);
					var10.drawRect(0, 0, 303, 33);
					var10.fillRect(2, 2, var1 * 3, 30);
					var10.setColor(Color.black);
					var10.drawRect(1, 1, 301, 31);
					var10.fillRect(2 + var1 * 3, 2, -(var1 * 3) + var3, 30);
					var10.setFont(cb.font_f);
					var10.setColor(Color.white);
					var2.a((-var2.a(cf.x, (byte) -110) + 304) / 2, 22, 0, var10);
					var4.drawImage(pf.R, -152 + og.int_e / 2, -18 + pa.int_e / 2, (ImageObserver) null);
				} catch (Exception var7) {
					int var5 = og.int_e / 2 - 152;
					int var6 = -18 + pa.int_e / 2;
					var4.setColor(var0);
					var4.drawRect(var5, var6, 303, 33);
					var4.fillRect(var5 + 2, 2 + var6, 3 * var1, 30);
					var4.setColor(Color.black);
					var4.drawRect(var5 - -1, var6 - -1, 301, 31);
					var4.fillRect(var5 + 2 + 3 * var1, 2 + var6, 300 - var1 * 3, 30);
					var4.setFont(cb.font_f);
					var4.setColor(Color.white);
					var2.a((304 + -var2.a(cf.x, (byte) -121)) / 2 + var5, 22 + var6, 0, var4);
				}
			} catch (Exception var8) {
				ae.U.repaint();
			}

			++A;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "jf.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			B = null;
			lf_s = null;
			J = null;
			M = null;
			if (!var0) {
				x = null;
				C = null;
				lf_v = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jf.C(" + var0 + ')');
		}
	}

	static final void c(boolean var0) {
		try {
			if (vf.H != null) {
				vf.H.a((byte) -121);
			}

			if (var0) {
				M = null;
			}

			++int_u;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jf.A(" + var0 + ')');
		}
	}

	static {
		lf_v = x;
		J = new int[32];
		B = lf_s;
		M = dd.a("Sie haben gerade eine andere Welt verlassen)3", 2);
	}
}
