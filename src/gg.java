final class gg {

	static int int_a;
	static int int_b;
	static lf lf_c;
	static lf lf_d;
	static int int_e;
	private static lf lf_f = dd.a("cyan:", 2);
	static int int_g;
	static volatile int int_h = 0;
	static int int_i;
	static bg bg_j;
	static int int_k;
	static lf lf_l;
	static lf headicons_prayer;//lf_m
	static sh sh_n;
	static int int_o;

	static final void a(int var0, lf var1, lf var2, lf var3) {
		try {
			if (var0 >= 83) {
				++int_b;
				pf.X = var1;
				pf.lf_jb = var3;
				pf.lf_ib = var2;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "gg.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(byte var0) {
		try {
			kh.R.c(-51);
			++int_e;
			if (var0 < 35) {
				sh_n = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "gg.D(" + var0 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_c = null;
			lf_f = null;
			sh_n = null;
			lf_d = null;
			headicons_prayer = null;
			lf_l = null;
			if (var0 != 20617) {
				int_o = -53;
			}

			bg_j = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "gg.A(" + var0 + ')');
		}
	}

	static final void b(byte var0) {
		try {
			synchronized (wa.Cb) {
				if (~c.X == -1) {
					eh.ke_o.a(new w(), 5, (byte) 46);
				}

				c.X = 600;
			}

			++int_k;
			if (var0 != -86) {
				bg_j = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "gg.B(" + var0 + ')');
		}
	}

	static {
		lf_d = lf_f;
		lf_c = lf_f;
		lf_l = dd.a("Freie Welt", 2);
		int_o = 0;
		headicons_prayer = dd.a("headicons_prayer", 2);
		int_i = 0;
	}
}
