final class ag {

	static int int_a;
	static int int_b;
	static rc rc_c = new rc(20);
	static int int_d;
	static lf lf_e = dd.a(" loggt sich ein)3", 2);
	static int int_f;
	static int[] ints_g = new int[1000];
	static int int_h = 0;
	static lf lf_i = dd.a("Verbinde mit Server)3)3)3", 2);
	static lf headicons_hint = dd.a("headicons_hint", 2);//lf_j
	static int int_k = -1;

	static final void a(int var0, int var1, int var2, int var3) {
		try {
			++int_f;
			if (~ai.int_e != -1 && ~var0 != -1 && ~jg.int_q > -51 && var1 != -1) {
				hc.ints_gb[jg.int_q] = var1;
				rg.D[jg.int_q] = var0;
				qa.V[jg.int_q] = var3;
				ob.mhs_e[jg.int_q] = null;
				d.ints_eb[jg.int_q] = 0;
				++jg.int_q;
			}

			if (var2 != 0) {
				a(55, -38, 52, -96);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ag.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final lf a(int var0, vg var1) {
		try {
			++int_d;
			return ci.a(-125, (int) ne.a(var1, var0 + 101)) == var0 ? null : (var1.H != null && ~var1.H.a((byte) 62).e(var0 ^ -30593) != -1 ? var1.H : (ra.Y ? fb.lf_j : null));
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ag.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6;
		int var7;
		if (var1 == var2 && var3 == var4) {
			if (!vh.a(var0, var1, var3)) {
				return false;
			} else {
				var6 = var1 << 7;
				var7 = var3 << 7;
				return a.a(var6 + 1, ch.ints_g[var0][var1][var3] + var5, var7 + 1) && a.a(var6 + 128 - 1, ch.ints_g[var0][var1 + 1][var3] + var5, var7 + 1) && a.a(var6 + 128 - 1, ch.ints_g[var0][var1 + 1][var3 + 1] + var5, var7 + 128 - 1) && a.a(var6 + 1, ch.ints_g[var0][var1][var3 + 1] + var5, var7 + 128 - 1);
			}
		} else {
			for (var6 = var1; var6 <= var2; ++var6) {
				for (var7 = var3; var7 <= var4; ++var7) {
					if (wd.ints_mb[var0][var6][var7] == -kh.V) {
						return false;
					}
				}
			}

			var7 = (var1 << 7) + 1;
			int var8 = (var3 << 7) + 2;
			int var9 = ch.ints_g[var0][var1][var3] + var5;
			if (!a.a(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var2 << 7) - 1;
				if (!a.a(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var4 << 7) - 1;
					if (!a.a(var7, var9, var11)) {
						return false;
					} else if (!a.a(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	public static void a(int var0) {
		try {
			lf_e = null;
			rc_c = null;
			headicons_hint = null;
			if (var0 != -1) {
				a(58);
			}

			lf_i = null;
			ints_g = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ag.D(" + var0 + ')');
		}
	}
}
