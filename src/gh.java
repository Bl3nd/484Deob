final class gh extends j {

	static int[] Q = new int[5];
	static int R;
	static int S;
	private static lf T;
	static lf rect_debugCommand = dd.a("::rect_debug", 2);
	static int V;
	static int[] W;
	static lf X;
	static lf Y;
	static eg Z;
	static bg bg_ab;
	static oh cache13;//oh_bb
	private static lf lf_cb = dd.a("wave:", 2);
	static int int_db;
	static lf lf_eb;
	static boolean boolean_fb = false;
	private static lf lf_gb = dd.a("New User", 2);
	static bg bg_hb;
	static int int_ib;
	static lf lf_jb;
	static int int_kb;

	final int[] a(int var1, int var2) {
		int var6 = client.int_gc;

		try {
			++R;
			int[] var3 = super.H.a(-314, var2);
			if (var1 > -49) {
				this.b(21, -70);
			}

			if (super.H.boolean_v) {
				int[] var4 = this.a((int) var2, -9, 0);
				int var5 = 0;
				if (var6 != 0 || var5 < ff.int_a) {
					do {
						var3[var5] = 4096 - var4[var5];
						++var5;
					} while (var5 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "gh.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(int var0, ad var1) {
		try {
			if (var0 == 32184) {
				bh.ad_fb = var1;
				++V;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "gh.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void e(int var0) {
		try {
			W = null;
			bg_ab = null;
			X = null;
			lf_eb = null;
			lf_jb = null;
			lf_gb = null;
			rect_debugCommand = null;
			T = null;
			bg_hb = null;
			cache13 = null;
			lf_cb = null;
			if (var0 == 11760) {
				Y = null;
				Q = null;
				Z = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "gh.A(" + var0 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var12 = client.int_gc;

		try {
			if (var2 != 2177) {
				this.a(61, -49);
			}

			++int_ib;
			int[][] var3 = super.jh_q.a((byte) -128, var1);
			if (super.jh_q.boolean_w) {
				int[][] var4 = this.a(false, var1, 0);
				int[] var5 = var4[0];
				int[] var8 = var3[0];
				int[] var6 = var4[1];
				int[] var7 = var4[2];
				int[] var9 = var3[1];
				int[] var10 = var3[2];
				int var11 = 0;
				if (var12 != 0 || var11 < ff.int_a) {
					do {
						var8[var11] = 4096 + -var5[var11];
						var9[var11] = 4096 - var6[var11];
						var10[var11] = -var7[var11] + 4096;
						++var11;
					} while (var11 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var13) {
			throw ec.a(var13, "gh.E(" + var1 + ',' + var2 + ')');
		}
	}

	public gh() {
		super(1, false);
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			++S;
			if (var1 <= -120) {
				if (~var2 == -1) {
					super.x = var3.j((byte) 102) == 1;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "gh.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		Y = lf_gb;
		lf_jb = lf_cb;
		T = dd.a("Select a world", 2);
		int_kb = -1;
		lf_eb = T;
		W = new int[100];
		X = lf_cb;
	}
}
