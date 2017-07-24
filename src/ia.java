import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class ia implements KeyListener, FocusListener {

	static lf logo = dd.a("logo", 2);//lf_a
	static lf lf_b = dd.a("<col=ff9040>", 2);
	static int int_c;
	static int int_d;
	static int int_e;
	static int int_f;
	static lf lf_g = dd.a("Einloggen", 2);
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k = 0;
	static lf lf_l = dd.a("<img=0>", 2);
	static lf lf_m = dd.a("Verbindung abgebrochen)3", 2);

	public final synchronized void focusLost(FocusEvent var1) {
		try {
			if (wc.Q != null) {
				hh.M = -1;
			}

			++int_i;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ia.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void keyTyped(KeyEvent var1) {
		try {
			if (wc.Q != null) {
				int var2 = jh.a((byte) 117, var1);
				if (~var2 <= -1) {
					int var3 = 127 & 1 + mc.int_p;
					if (~tb.int_fb != ~var3) {
						ib.ints_m[mc.int_p] = -1;
						ci.xb[mc.int_p] = var2;
						mc.int_p = var3;
					}
				}
			}

			++int_c;
			var1.consume();
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ia.keyTyped(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, vg var1, int var2, int var3, kf var4, int var5, int var6) {
		try {
			int var9;
			label40:
			{
				int var7 = Math.min(var1.int_ob / 2, var1.Ib / 2);
				++int_j;
				int var8 = var6 * var6 + var0 * var0;
				if (var7 * var7 >= var8 || ~var8 <= -90001) {
					ic.a(var0, var2, var6, var5, var4, (byte) 110, var1);
					if (client.int_gc == 0) {
						break label40;
					}
				}

				var7 -= 10;
				var9 = ef.int_c + h.int_l & 2047;
				int var11 = nc.ints_bb[var9];
				int var10 = nc.X[var9];
				var10 = var10 * 256 / (pe.int_j - -256);
				var11 = var11 * 256 / (256 + pe.int_j);
				int var13 = var11 * var6 + -(var0 * var10) >> -2012561712;
				int var12 = var6 * var10 + var11 * var0 >> -681283760;
				double var14 = Math.atan2((double) var12, (double) var13);
				int var16 = (int) ((double) var7 * Math.sin(var14));
				int var17 = (int) (Math.cos(var14) * (double) var7);
				rg.kf_k.a(var16 + var2 + var1.int_ob / 2 + -10, -var17 + var1.Ib / 2 + var5 - 10, 20, 20, 15, 15, var14, 256);
			}

			var9 = 21 % ((var3 - -25) / 60);
		} catch (RuntimeException var18) {
			throw ec.a(var18, "ia.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
		}
	}

	public final void focusGained(FocusEvent var1) {
		try {
			++int_e;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ia.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(byte var0) {
		try {
			logo = null;
			lf_g = null;
			lf_b = null;
			lf_m = null;
			lf_l = null;
			if (var0 != 93) {
				a((byte) 116);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ia.C(" + var0 + ')');
		}
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		try {
			++int_d;
			if (wc.Q != null) {
				int var2;
				label32:
				{
					he.K = 0;
					var2 = var1.getKeyCode();
					if (~var2 <= -1 && ld.ints_cb.length > var2) {
						var2 = ld.ints_cb[var2] & -129;
						if (client.int_gc == 0) {
							break label32;
						}
					}

					var2 = -1;
				}

				if (~hh.M <= -1 && ~var2 <= -1) {
					rb.ints_i[hh.M] = ~var2;
					hh.M = 1 + hh.M & 127;
					if (~hh.M == ~fd.int_q) {
						hh.M = -1;
					}
				}
			}

			var1.consume();
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ia.keyReleased(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final la a(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		return var3 == null ? null : var3.K;
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		try {
			if (wc.Q != null) {
				int var2;
				label61:
				{
					he.K = 0;
					var2 = var1.getKeyCode();
					if (~var2 > -1 || var2 >= ld.ints_cb.length) {
						var2 = -1;
						if (client.int_gc == 0) {
							break label61;
						}
					}

					var2 = ld.ints_cb[var2];
					if (~(128 & var2) != -1) {
						var2 = -1;
					}
				}

				if (~hh.M <= -1 && ~var2 <= -1) {
					rb.ints_i[hh.M] = var2;
					hh.M = 1 + hh.M & 127;
					if (fd.int_q == hh.M) {
						hh.M = -1;
					}
				}

				int var3;
				if (var2 >= 0) {
					var3 = mc.int_p - -1 & 127;
					if (~tb.int_fb != ~var3) {
						ib.ints_m[mc.int_p] = var2;
						ci.xb[mc.int_p] = -1;
						mc.int_p = var3;
					}
				}

				var3 = var1.getModifiers();
				if ((10 & var3) != 0 || ~var2 == -86 || ~var2 == -11) {
					var1.consume();
				}
			}

			++int_h;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ia.keyPressed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
