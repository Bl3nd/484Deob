final class hc extends ka {

	static int int_ab;
	int int_bb;
	static long[] longs_cb = new long[500];
	static int int_db;
	static int int_eb;
	static tf tf_fb = new tf();
	static int[] ints_gb = new int[50];
	static int int_hb;
	static int int_ib;
	int int_jb;
	static int int_kb;
	static int int_lb;
	static lf lf_mb = dd.a("<)4col>", 2);
	static int int_nb = 0;
	static int int_ob;
	static int int_pb;

	public static void c(boolean var0) {
		try {
			ints_gb = null;
			lf_mb = null;
			if (var0) {
				c(false);
			}

			tf_fb = null;
			longs_cb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hc.A(" + var0 + ')');
		}
	}

	final ue b(int var1) {
		try {
			int var2 = 38 / ((var1 - 61) / 46);
			++int_db;
			return ng.a(this.int_jb, (int) -4).a(-115, (bi) null, 0, this.int_bb);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hc.FA(" + var1 + ')');
		}
	}

	static final void c(int var0) {
		try {
			++int_ab;
			int var1 = -1;
			if (var1 >= r.Y) {
				if (var0 != 1) {
					longs_cb = null;
				}
			} else {
				do {
					int var2;
					if (var1 != -1) {
						var2 = nd.ints_k[var1];
					} else {
						var2 = 2047;
					}

					u var3 = w.us_e[var2];
					if (var3 != null) {
						di.a((byte) 58, var3, 1);
					}

					++var1;
				} while (var1 < r.Y);

				if (var0 != 1) {
					longs_cb = null;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "hc.C(" + var0 + ')');
		}
	}

	static final ac a(int var0, int var1) {
		try {
			++int_ib;
			ac var2 = (ac) lb.rc_c.a((long) var1, (int) -100);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = rf.W.a(0, var1, 8);
				var2 = new ac();
				if (var3 != null) {
					var2.a(false, new ja(var3));
				}

				lb.rc_c.a((long) var1, -117, var2);
				return var0 != 1 ? null : var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "hc.B(" + var0 + ',' + var1 + ')');
		}
	}
}
