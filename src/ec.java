final class ec extends j {

	static lf Q = dd.a("<img=1>", 2);
	static lf R;
	private int S = '耀';
	static lf T;
	static int U;
	private static lf V = dd.a("Password: ", 2);
	private static lf W;
	static int X;
	static long Y;
	static int Z;
	static int int_ab;
	static int int_bb;
	static int int_cb;
	static lf lf_db;
	static int int_eb;
	static int int_fb;
	static lf lf_gb;
	static int int_hb;

	static qe a(Throwable var0, String var1) {
		qe var2;
		if (!(var0 instanceof qe)) {
			var2 = new qe(var0, var1);
		} else {
			var2 = (qe) var0;
			var2.string_e = var2.string_e + ' ' + var1;
		}

		++int_fb;
		return var2;
	}

	public static void e(int var0) {
		try {
			R = null;
			V = null;
			if (var0 != 0) {
				lf_gb = null;
			}

			lf_gb = null;
			T = null;
			Q = null;
			lf_db = null;
			W = null;
		} catch (RuntimeException var2) {
			throw a(var2, "ec.C(" + var0 + ')');
		}
	}

	final void c(int var1) {
		try {
			td.b(var1 + -25487);
			++int_hb;
			if (var1 != 25614) {
				a(-28, -99, (byte) -82, 98);
			}
		} catch (RuntimeException var3) {
			throw a(var3, "ec.M(" + var1 + ')');
		}
	}

	static int a(int var0, byte var1, int var2) {
		try {
			++X;
			int var3 = 0;
			if (var2 <= 0) {
				if (var1 >= -5) {
					e(41);
				}

				return var3;
			} else {
				do {
					var3 = var3 << 1 | 1 & var0;
					var0 >>>= 1;
					--var2;
				} while (var2 > 0);

				if (var1 >= -5) {
					e(41);
				}

				return var3;
			}
		} catch (RuntimeException var5) {
			throw a(var5, "ec.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public ec() {
		super(3, false);
	}

	static void a(int var0, int var1, byte var2, int var3) {
		try {
			++int_eb;
			if (var0 >= 128 && ~var1 <= -129 && var0 <= 13056 && var1 <= 13056) {
				int var4 = -var3 + bh.a(var1, false, hc.int_pb, var0);
				var0 -= dh.int_i;
				var1 -= mb.A;
				int var5 = nc.X[hc.int_hb];
				int var6 = nc.ints_bb[hc.int_hb];
				var4 -= nd.y;
				int var9 = -49 % ((65 - var2) / 35);
				int var7 = nc.X[pd.int_c];
				int var8 = nc.ints_bb[pd.int_c];
				int var10 = var0 * var8 + var1 * var7 >> 16;
				var1 = var8 * var1 + -(var0 * var7) >> 16;
				var0 = var10;
				var10 = var4 * var6 + -(var5 * var1) >> 16;
				var1 = var1 * var6 + var5 * var4 >> 16;
				if (var1 < 50) {
					th.int_c = -1;
					uc.int_ic = -1;
				} else {
					uc.int_ic = 167 - -((var10 << 9) / var1);
					th.int_c = (var0 << 9) / var1 + 256;
				}
			} else {
				th.int_c = -1;
				uc.int_ic = -1;
			}
		} catch (RuntimeException var11) {
			throw a(var11, "ec.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			++U;
			if (var1 >= -120) {
				lf_gb = null;
			}

			if (var2 != 0) {
				if (var2 != 1) {
					return;
				}

				if (client.int_gc == 0) {
					super.x = ~var3.j((byte) 127) == -2;
					return;
				}
			}

			this.S = var3.b(true) << 4;
		} catch (RuntimeException var5) {
			throw a(var5, "ec.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var14 = client.int_gc;

		try {
			++Z;
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int[] var4 = this.a((int) var2, -128, 1);
				int[] var5 = this.a((int) var2, 109, 2);
				int var6 = 0;
				if (var14 != 0 || ff.int_a > var6) {
					do {
						int var7 = (var4[var6] & 4088) >> 4;
						int var8 = var5[var6] * this.S >> 12;
						int var10 = var8 * ne.ints_d[var7] >> 12;
						int var9 = lf.P[var7] * var8 >> 12;
						int var11 = ch.int_h & (var9 >> 12) + var6;
						int var12 = qb.Z & (var10 >> 12) + var2;
						int[] var13 = this.a((int) var12, -128, 0);
						var3[var6] = var13[var11];
						++var6;
					} while (ff.int_a > var6);
				}
			}

			if (var1 >= -49) {
				a(-5, (byte) 119, -1);
			}

			return var3;
		} catch (RuntimeException var15) {
			throw a(var15, "ec.G(" + var1 + ',' + var2 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var17 = client.int_gc;

		try {
			++int_cb;
			if (var2 != 2177) {
				return null;
			} else {
				int[][] var3 = super.jh_q.a((byte) -127, var1);
				if (super.jh_q.boolean_w) {
					int[] var4 = this.a((int) var1, 16, 1);
					int[] var5 = this.a((int) var1, -125, 2);
					int[] var6 = var3[0];
					int[] var7 = var3[1];
					int[] var8 = var3[2];
					int var9 = 0;
					if (var17 != 0 || ~var9 > ~ff.int_a) {
						do {
							int var11 = var5[var9] * this.S >> 12;
							int var10 = 255 & var4[var9] * 255 >> 12;
							int var12 = var11 * lf.P[var10] >> 12;
							int var14 = var9 - -(var12 >> 12) & ch.int_h;
							int var13 = var11 * ne.ints_d[var10] >> 12;
							int var15 = (var13 >> 12) + var1 & qb.Z;
							int[][] var16 = this.a(false, var15, 0);
							var6[var9] = var16[0][var14];
							var7[var9] = var16[1][var14];
							var8[var9] = var16[2][var14];
							++var9;
						} while (~var9 > ~ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var18) {
			throw a(var18, "ec.E(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		T = V;
		R = dd.a(" <col=ffff00>", 2);
		Y = 0L;
		W = dd.a("button near the top of that page)3", 2);
		lf_db = null;
		lf_gb = W;
	}
}
