final class la {

	int int_a;
	int int_b;
	ka ka_c;
	ka ka_d;
	static int int_e;
	static int int_f;
	static int int_g;
	static hd hd_h = new hd(0, 0);
	long long_i = 0L;
	int int_j;
	int int_k;
	int int_l;
	int int_m;
	static lf lf_n = dd.a("k", 2);
	static int int_o;
	static int int_p;
	int int_q;

	static final void a(int var0, byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			++int_g;
			if (ua.a(false, var7)) {
				hb.a(var2, var5, -99, var3, var6, sc.vgs_db[var7], var4, -1, var0);
				if (var1 <= 114) {
					int_e = -109;
				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "la.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	static final int a(int var0, int var1, int var2, int var3) {
		try {
			int var4 = -49 / ((29 - var3) / 60);
			var2 &= 3;
			++int_o;
			return var2 == 0 ? var0 : (~var2 == -2 ? -var1 + 7 : (var2 == 2 ? 7 - var0 : var1));
		} catch (RuntimeException var5) {
			throw ec.a(var5, "la.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(byte var0) {
		try {
			ca.rc_m.c(-51);
			int var1 = -46 / ((68 - var0) / 55);
			++int_f;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "la.A(" + var0 + ')');
		}
	}

	static final boolean a(int var0) {
		try {
			++int_p;
			if (var0 != 0) {
				return true;
			} else {
				synchronized (wc.Q) {
					if (tb.int_fb == fc.L) {
						return false;
					}

					wb.int_f = ib.ints_m[tb.int_fb];
					i.X = ci.xb[tb.int_fb];
					tb.int_fb = 1 + tb.int_fb & 127;
					return true;
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "la.B(" + var0 + ')');
		}
	}

	public static void b(byte var0) {
		try {
			hd_h = null;
			lf_n = null;
			if (var0 >= -66) {
				lf_n = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "la.C(" + var0 + ')');
		}
	}
}
