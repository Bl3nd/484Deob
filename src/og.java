final class og {

	static lf scape_main = dd.a("scape main", 2);//lf_a
	private static lf lf_b;
	static ef[] efs_c;
	static int int_d;
	static int int_e;
	static int int_f;
	static lf lf_g;
	private static lf lf_h = dd.a("Click to switch", 2);
	static lf lf_i;
	static lf lf_j;
	static kf[] kfs_k;
	static lf lf_l;
	static lf lf_m;
	static bg bg_n;
	static lf lf_o;
	private static lf lf_p;
	static lf lf_q;

	static final void a(int var0, boolean var1, int var2, int var3, int var4) {
		int var7 = client.int_gc;

		try {
			int var5 = var4;
			if (var7 == 0 && var4 > var3 + var4) {
				++int_d;
				if (var1) {
					lf_p = null;
				}
			} else {
				do {
					int var6 = var0;
					if (var7 == 0 && ~(var0 + var2) > ~var0) {
						++var5;
					} else {
						do {
							if (var6 >= 0 && var6 < 104 && var5 >= 0 && ~var5 > -105) {
								wb.bytes_s[0][var6][var5] = 127;
								if (var6 == var0 && var6 > 0) {
									u.vertexHeights[0][var6][var5] = u.vertexHeights[0][-1 + var6][var5];
								}

								if (var6 == var0 + var2 && ~var6 > -104) {
									u.vertexHeights[0][var6][var5] = u.vertexHeights[0][1 + var6][var5];
								}

								if (~var4 == ~var5 && ~var5 < -1) {
									u.vertexHeights[0][var6][var5] = u.vertexHeights[0][var6][-1 + var5];
								}

								if (var3 + var4 == var5 && ~var5 > -104) {
									u.vertexHeights[0][var6][var5] = u.vertexHeights[0][var6][1 + var5];
								}
							}

							++var6;
						} while (~(var0 + var2) <= ~var6);

						++var5;
					}
				} while (var5 <= var3 + var4);

				++int_d;
				if (var1) {
					lf_p = null;
				}
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "og.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_o = null;
			int var1 = 0 % ((var0 - 20) / 60);
			kfs_k = null;
			lf_i = null;
			lf_h = null;
			efs_c = null;
			lf_m = null;
			scape_main = null;
			lf_p = null;
			lf_g = null;
			lf_q = null;
			bg_n = null;
			lf_j = null;
			lf_l = null;
			lf_b = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "og.A(" + var0 + ')');
		}
	}

	static {
		lf_g = lf_h;
		lf_o = dd.a("(U0a )2 via: ", 2);
		lf_p = dd.a("yellow:", 2);
		lf_l = lf_p;
		lf_m = dd.a("rect_debug=", 2);
		efs_c = new ef[50];
		lf_b = dd.a("Please wait)3)3)3", 2);
		lf_i = lf_b;
		lf_q = lf_p;
		lf_j = dd.a("sch-Utteln:", 2);
	}
}
