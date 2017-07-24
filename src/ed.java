final class ed {

	int int_a;
	static int int_b;
	int int_c;
	static int int_d;
	int int_e;
	int int_f;
	static int int_g;
	static int int_h;
	static int int_i;
	int int_j;
	int int_k;
	static lf lf_l = dd.a("(Udns", 2);
	int int_m;
	int int_n;
	static int int_o;
	static int int_p;
	int int_q;
	int int_r;
	ka ka_s;
	static rc rc_t = new rc(100);
	int int_u;
	static volatile int int_v = 0;
	long long_w = 0L;
	static lf mod_icons = dd.a("mod_icons", 2);
	static lf y;
	static nd z;
	static lf A;
	private static lf B = dd.a("Create a free account", 2);

	static final void a(oe var0, int var1, int var2, int var3, int var4, int var5) {
		boolean var6 = true;
		int var7 = var2;
		int var8 = var2 + var4;
		int var9 = var3 - 1;
		int var10 = var3 + var5;

		for (int var11 = var1; var11 <= var1 + 1; ++var11) {
			if (var11 != ec.int_bb) {
				for (int var12 = var7; var12 <= var8; ++var12) {
					if (var12 >= 0 && var12 < l.int_l) {
						for (int var13 = var9; var13 <= var10; ++var13) {
							if (var13 >= 0 && var13 < ge.int_c && (!var6 || var12 >= var8 || var13 >= var10 || var13 < var3 && var12 != var2)) {
								ab var14 = i.Ib[var11][var12][var13];
								if (var14 != null) {
									int var15 = (ch.ints_g[var11][var12][var13] + ch.ints_g[var11][var12 + 1][var13] + ch.ints_g[var11][var12][var13 + 1] + ch.ints_g[var11][var12 + 1][var13 + 1]) / 4 - (ch.ints_g[var1][var2][var3] + ch.ints_g[var1][var2 + 1][var3] + ch.ints_g[var1][var2][var3 + 1] + ch.ints_g[var1][var2 + 1][var3 + 1]) / 4;
									ba var16 = var14.H;
									if (var16 != null) {
										oe var17;
										if (var16.ka_m instanceof oe) {
											var17 = (oe) var16.ka_m;
											oe.a(var0, var17, (var12 - var2) * 128 + (1 - var4) * 64, var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
										}

										if (var16.ka_o instanceof oe) {
											var17 = (oe) var16.ka_o;
											oe.a(var0, var17, (var12 - var2) * 128 + (1 - var4) * 64, var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
										}
									}

									for (int var22 = 0; var22 < var14.int_p; ++var22) {
										ed var18 = var14.eds_t[var22];
										if (var18 != null && var18.ka_s instanceof oe) {
											oe var19 = (oe) var18.ka_s;
											int var20 = var18.int_a - var18.int_u + 1;
											int var21 = var18.int_r - var18.int_f + 1;
											oe.a(var0, var19, (var18.int_u - var2) * 128 + (var20 - var4) * 64, var15, (var18.int_f - var3) * 128 + (var21 - var5) * 64, var6);
										}
									}
								}
							}
						}
					}
				}

				--var7;
				var6 = false;
			}
		}

	}

	static final void a(byte var0) {
		try {
			++int_g;
			i.O.c(var0 ^ -44);
			if (var0 != 25) {
				lf_l = null;
			}

			ie.rc_ob.c(-51);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ed.E(" + var0 + ')');
		}
	}

	static final boolean a(bg var0, int var1, int var2) {
		try {
			++int_p;
			int var4 = -17 / ((var1 - 39) / 41);
			byte[] var3 = var0.f(0, var2);
			if (var3 == null) {
				return false;
			} else {
				ae.a((byte) -55, var3);
				return true;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ed.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void b(byte var0) {
		try {
			y = null;
			z = null;
			lf_l = null;
			if (var0 >= -62) {
				rc_t = null;
			}

			mod_icons = null;
			A = null;
			rc_t = null;
			B = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ed.F(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, byte var5, int var6, int var7, int var8) {
		int var10 = client.int_gc;

		try {
			++int_h;
			if (!ua.a(false, var3)) {
				if (var2 != -1) {
					va.booleans_db[var2] = true;
				} else {
					int var9 = 0;
					if (var10 != 0 || var9 < 100) {
						do {
							va.booleans_db[var9] = true;
							++var9;
						} while (var9 < 100);

					}
				}
			} else {
				pf.V = null;
				if (var5 != 16) {
					a((oe) null, 29, -74, -66, 19, -42);
				}

				sf.a(var6, -1, var8, var2, var0, -92, var7, var1, sc.vgs_db[var3], var4);
				if (pf.V != null) {
					sf.a(var6, -1412584499, var8, var2, mc.int_o, -46, c.U, var1, pf.V, var4);
					pf.V = null;
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "ed.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
		}
	}

	static final int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			if ((var1 & 1) == 1) {
				int var7 = var6;
				var6 = var0;
				var0 = var7;
			}

			++int_b;
			var3 &= var4;
			return var3 == 0 ? var2 : (~var3 == -2 ? -var5 + (7 - (-1 + var6)) : (~var3 == -3 ? 7 - (var2 - -var0) - -1 : var5));
		} catch (RuntimeException var8) {
			throw ec.a(var8, "ed.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	static final void a(int var0) {
		try {
			++int_i;
			wd.tf_jb = new tf();
			if (var0 != 64) {
				A = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ed.A(" + var0 + ')');
		}
	}

	static {
		y = B;
		A = dd.a("Benutzen Sie bitte eine andere Welt)3", 2);
	}
}
