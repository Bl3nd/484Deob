abstract class ka extends ph {

	static int G;
	static int H;
	static wa I = new wa(5000);
	static int J;
	static int K;
	static oh cache11;
	static lf M = dd.a("(U2", 2);
	static int[] N = new int[]{1, 0, -1, 0};
	static int O = 0;
	static lf P = dd.a(" )2> <col=ffff00>", 2);
	static lf Q = dd.a("Bitte starten Sie eine Mitgliedschaft", 2);
	static oh cache14;
	static int S = 0;
	short T = -32768;
	static int U;
	static long[] V = new long[32];
	static int W;
	private static lf X = dd.a("Press (Wrecover a locked account(W on front page)3", 2);
	static long Y = 0L;
	static lf Z;

	ue b(int var1) {
		try {
			int var2 = 23 / ((var1 - 61) / 46);
			++H;
			return null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ka.FA(" + var1 + ')');
		}
	}

	void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		try {
			++W;
			ue var11 = this.b(112);
			if (var11 != null) {
				var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
				this.T = var11.T;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "ka.O(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3) {
		try {
			++J;
			vg var4 = nh.c(var0, -1, var3);
			if (var4 != null && var4.objects_lc != null) {
				id var5 = new id();
				var5.vg_o = var4;
				var5.objects_t = var4.objects_lc;
				ea.a(24087, var5);
			}

			nb.boolean_a = true;
			sb.int_d = var0;
			int var7 = 16 % ((var2 - -73) / 44);
			qh.int_i = var1;
			ag.int_k = var3;
			mc.a(var4, -23101);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ka.NA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			I = null;
			cache11 = null;
			if (!var0) {
				X = null;
				P = null;
				cache14 = null;
				Q = null;
				Z = null;
				M = null;
				N = null;
				V = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ka.MA(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4) {
		try {
			if (var1 != -3753) {
				M = null;
			}

			++G;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ka.KA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2, int var3, int var4, ka var5, int var6, long var7, boolean var9) {
		if (var5 == null) {
			return true;
		} else {
			int var10 = var1 - var4;
			int var11 = var2 - var4;
			int var12 = var1 + var4;
			int var13 = var2 + var4;
			if (var9) {
				if (var6 > 640 && var6 < 1408) {
					var13 += 128;
				}

				if (var6 > 1152 && var6 < 1920) {
					var12 += 128;
				}

				if (var6 > 1664 || var6 < 384) {
					var11 -= 128;
				}

				if (var6 > 128 && var6 < 896) {
					var10 -= 128;
				}
			}

			var10 /= 128;
			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			return nb.a(var0, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var1, var2, var3, var5, var6, true, var7);
		}
	}

	static {
		Z = X;
	}
}
