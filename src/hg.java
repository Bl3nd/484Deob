import java.io.IOException;

final class hg {

	static int int_a = 0;
	int int_b;
	static int int_c;
	int int_d;
	static lf lf_e = dd.a("Clientscript error )2 check log for details", 2);
	int int_f;
	static volatile int int_g = 0;
	static ja ja_h = new ja(new byte[5000]);
	int int_i;
	static int int_j = 0;
	static lf fpsoffCommand = dd.a("::fpsoff", 2);//lf_k
	static eh eh_l = new eh(32);
	static int[] ints_m;
	static rc rc_n = new rc(500);
	static boolean boolean_o = false;

	public static void a(int var0) {
		try {
			rc_n = null;
			ja_h = null;
			if (var0 < -114) {
				fpsoffCommand = null;
				eh_l = null;
				ints_m = null;
				lf_e = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hg.A(" + var0 + ')');
		}
	}

	static void a(nd var0, boolean var1, boolean var2) {
		int dummy = client.int_gc;

		try {
			if (vf.H != null) {
				try {
					vf.H.a((byte) -70);
				} catch (Exception e) {
					e.printStackTrace();
				}

				vf.H = null;
			}

			vf.H = var0;
			++int_c;
			e.a(-1, var1);
			lb.D.P = 0;
			ia.int_k = 0;
			l.te_g = null;
			qb.ja_cb = null;

			te var3;
			do {
				var3 = (te) od.X.a((byte) 66);
				if (var3 == null) {
					break;
				}

				qa.eh_cb.a(var3.long_e, false, var3);
				++qb.W;
				--rf.R;
			} while (dummy == 0);

			do {
				var3 = (te) bb.eh_lb.a((byte) 114);
				if (var3 == null) {
					break;
				}

				ad.l_f.a((byte) -89, var3);
				ca.eh_c.a(var3.long_e, false, var3);
				++ce.R;
				--ad.int_s;
			} while (dummy == 0);

			if (var2) {
				if (hf.A != 0) {
					try {
						ja var9 = new ja(4);
						var9.e(-13488, 4);
						var9.e(-13488, hf.A);
						var9.c(9698, 0);
						vf.H.a(-126, 0, 4, var9.yb);
					} catch (IOException ioException) {
						try {
							vf.H.a((byte) -119);
						} catch (Exception e) {
							e.printStackTrace();
						}

						vf.H = null;
						++hf.int_b;
					}
				}

				client.int_ob = 0;
				sg.long_d = nb.a(false);
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "hg.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	public hg() {
	}

	hg(hg var1) {
		try {
			this.int_i = var1.int_i;
			this.int_b = var1.int_b;
			this.int_f = var1.int_f;
			this.int_d = var1.int_d;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hg.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static boolean a(int var0, int var1, int var2, int var3) {
		int var4 = var2 * ua.Q + var0 * ei.int_e >> 16;
		int var5 = var2 * ei.int_e - var0 * ua.Q >> 16;
		int var6 = var1 * pc.int_b + var5 * mf.C >> 16;
		int var7 = var1 * mf.C - var5 * pc.int_b >> 16;
		if (var6 >= 50 && var6 <= var3) {
			int var8 = o.int_f + (var4 << 9) / var6;
			int var9 = ac.O + (var7 << 9) / var6;
			return var8 >= cc.int_cb && var8 <= v.int_vb && var9 >= ec.int_ab && var9 <= ng.X;
		} else {
			return false;
		}
	}
}
