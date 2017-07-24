final class kh extends j {

	private int Q = 4096;
	static rc R = new rc(64);
	static int S;
	static int[] T = new int[2048];
	static int U;
	static int V;
	static lf W = dd.a("Begeben Sie sich in ein freies Gebiet)1 um", 2);
	static int X;
	static ke Y;
	static int Z = 0;

	static final void c(int var0, int var1, int var2) {
		for (int var3 = 0; var3 < ec.int_bb; ++var3) {
			for (int var4 = 0; var4 < l.int_l; ++var4) {
				for (int var5 = 0; var5 < ge.int_c; ++var5) {
					ab var6 = i.Ib[var3][var4][var5];
					if (var6 != null) {
						ba var7 = var6.H;
						if (var7 != null && var7.ka_m instanceof oe) {
							oe var8 = (oe) var7.ka_m;
							ed.a(var8, var3, var4, var5, 1, 1);
							if (var7.ka_o instanceof oe) {
								oe var9 = (oe) var7.ka_o;
								ed.a(var9, var3, var4, var5, 1, 1);
								oe.a(var8, var9, 0, 0, 0, false);
								var7.ka_o = var9.a(var9.Ab, var9.short_wb, var0, var1, var2, false, false);
							}

							var7.ka_m = var8.a(var8.Ab, var8.short_wb, var0, var1, var2, false, false);
						}

						oe var10;
						for (int var11 = 0; var11 < var6.int_p; ++var11) {
							ed var12 = var6.eds_t[var11];
							if (var12 != null && var12.ka_s instanceof oe) {
								var10 = (oe) var12.ka_s;
								ed.a(var10, var3, var4, var5, var12.int_a - var12.int_u + 1, var12.int_r - var12.int_f + 1);
								var12.ka_s = var10.a(var10.Ab, var10.short_wb, var0, var1, var2, false, false);
							}
						}

						ei var13 = var6.D;
						if (var13 != null && var13.ka_i instanceof oe) {
							var10 = (oe) var13.ka_i;
							ff.a(var10, var3, var4, var5);
							var13.ka_i = var10.a(var10.Ab, var10.short_wb, var0, var1, var2, false, false);
						}
					}
				}
			}
		}

	}

	final void a(byte var1, int var2, ja var3) {
		try {
			if (~var2 == -1) {
				this.Q = var3.b(true);
			}

			if (var1 < -120) {
				++U;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "kh.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final int a(int var0, byte var1, int var2) {
		try {
			++S;
			int var3 = -128 + mc.a(var1 ^ 24919, 4, var0 + 91923, '넵' + var2) + (mc.a(24916, 2, var0 + '鎽', var2 - -10294) - 128 >> 592203841) - -(-128 + mc.a(24916, 1, var0, var2) >> -326999998);
			var3 = (int) ((double) var3 * 0.3D) + 35;
			if (var3 >= 10) {
				if (~var3 >= -61) {
					return var1 != 3 ? -11 : var3;
				}

				var3 = 60;
				if (client.int_gc == 0) {
					return var1 != 3 ? -11 : var3;
				}
			}

			var3 = 10;
			return var1 != 3 ? -11 : var3;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "kh.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			W = null;
			T = null;
			Y = null;
			int var1 = -73 % ((var0 - 14) / 50);
			R = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "kh.C(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var16 = client.int_gc;

		try {
			++X;
			int[] var3 = super.H.a(-314, var2);
			if (var1 >= -49) {
				W = null;
			}

			if (super.H.boolean_v) {
				int[] var4 = this.a((int) (qb.Z & -1 + var2), 26, 0);
				int[] var5 = this.a((int) var2, -124, 0);
				int[] var6 = this.a((int) (qb.Z & 1 + var2), 61, 0);
				int var7 = 0;
				if (var16 != 0 || ~ff.int_a < ~var7) {
					do {
						int var8 = (-var4[var7] + var6[var7]) * this.Q;
						int var11 = var8 >> -1388876916;
						int var9 = (-var5[ch.int_h & var7 - 1] + var5[ch.int_h & 1 + var7]) * this.Q;
						int var10 = var9 >> 895581004;
						int var12 = var10 * var10 >> 1385253836;
						int var13 = var11 * var11 >> 2104083788;
						int var14 = (int) (Math.sqrt((double) ((var13 + var12 + 4096) / 4096)) * 4096.0D);
						int var15 = var14 == 0 ? 0 : 16777216 / var14;
						var3[var7] = -var15 + 4096;
						++var7;
					} while (~ff.int_a < ~var7);
				}
			}

			return var3;
		} catch (RuntimeException var17) {
			throw ec.a(var17, "kh.G(" + var1 + ',' + var2 + ')');
		}
	}

	public kh() {
		super(1, true);
	}
}
