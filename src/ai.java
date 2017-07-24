final class ai {

	static int int_a = 0;
	private static lf mWelcomeToRuneScape = dd.a("Welcome to RuneScape", 2);//lf_b
	static int int_c;
	static int[] ints_d;
	static int int_e = 127;
	static int int_f;
	static int[][][] ints_g = new int[4][13][13];
	static boolean boolean_h = false;
	static byte[][] bytes_i;
	static lf lf_j = dd.a("<img=1>", 2);//lf_j
	static lf welcomeToRuneScape;//lf_k

	public static void a(byte var0) {
		try {
			bytes_i = null;
			mWelcomeToRuneScape = null;
			lf_j = null;
			if (var0 != -13) {
				a(25, -27, false, (u) null);
			}

			ints_g = null;
			welcomeToRuneScape = null;
			ints_d = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ai.C(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, boolean var2, u var3) {
		try {
			if (!var2) {
				++int_f;
				if (~var3.int_bc == ~var1 && ~var1 != 0) {
					int var4 = client.a(12, var1).int_db;
					if (~var4 == -2) {
						var3.Zb = 0;
						var3.int_ob = 0;
						var3.Ab = var0;
						var3.Yb = 0;
					}

					if (var4 == 2) {
						var3.Yb = 0;
					}
				} else {
					if (var1 == -1 || var3.int_bc == -1 || client.a(12, var1).int_kb >= client.a(12, var3.int_bc).int_kb) {
						var3.int_bc = var1;
						var3.int_ob = 0;
						var3.Ab = var0;
						var3.Zb = 0;
						var3.Yb = 0;
						var3.int_qb = var3.int_tb;
					}

				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ai.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(boolean var0, lf var1, byte var2) {
		int var9 = client.int_gc;

		try {
			var1 = var1.b((int) -10180);
			++int_c;
			short[] var3 = new short[16];
			int var4 = 0;
			int var5 = 0;
			int var8;
			if (var9 != 0 || ~var5 > ~qb.V) {
				do {
					ie var6 = ng.a(var5, (int) -4);
					if ((!var0 || var6.Jb) && var6.U.b((int) -10180).c(var1, 88) != -1) {
						if (var4 >= 250) {
							dh.shorts_k = null;
							bb.int_db = -1;
							return;
						}

						if (~var4 <= ~var3.length) {
							short[] var7 = new short[2 * var3.length];
							var8 = 0;
							if (var9 != 0) {
								var7[var8] = var3[var8];
								++var8;
							}

							while (~var8 > ~var4) {
								var7[var8] = var3[var8];
								++var8;
							}

							var3 = var7;
						}

						var3[var4++] = (short) var5;
					}

					++var5;
				} while (~var5 > ~qb.V);
			}

			bb.int_db = var4;
			dh.shorts_k = var3;
			lf[] var11 = new lf[bb.int_db];
			rd.P = 0;
			int var12 = 0;
			if (var9 != 0) {
				var11[var12] = ng.a(var3[var12], (int) -4).U;
				++var12;
			}

			while (bb.int_db > var12) {
				var11[var12] = ng.a(var3[var12], (int) -4).U;
				++var12;
			}

			var8 = 62 % ((39 - var2) / 46);
			qe.a(27843, dh.shorts_k, var11);
		} catch (RuntimeException var10) {
			throw ec.a(var10, "ai.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static {
		welcomeToRuneScape = mWelcomeToRuneScape;
	}
}
