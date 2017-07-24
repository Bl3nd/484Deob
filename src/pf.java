import java.awt.Image;

final class pf extends j {

	static lf Q;
	static Image R;
	static lf S;
	static int T;
	static int U;
	static vg[] V;
	static lf W;
	static lf X;
	static lf Y;
	static lf Z = dd.a("Lade Benutzeroberfl-=che )2 ", 2);
	static lf lf_ab;
	static df[] dfs_bb;
	private static lf lf_cb = dd.a("The server is being updated)3", 2);
	static int int_db;
	static int int_eb = 0;
	static lf lf_fb;
	static int int_gb;
	static lf lf_hb;
	static lf lf_ib;
	static lf lf_jb;
	static lf lf_kb;
	static int int_lb;
	static lf lf_mb;
	private static lf lf_nb;
	static int int_ob;
	static int int_pb;
	private static lf lf_qb;

	static void e(int var0) {
		int var2 = client.int_gc;

		try {
			++U;
			vg.J.e((byte) 122, 122);
			if (var0 < 100) {
				R = null;
			}

			fi var1 = (fi) ma.eh_e.a((byte) 89);
			if (var2 != 0) {
				if (~var1.x == -1) {
					r.a(true, (byte) 121, var1);
				}

				var1 = (fi) ma.eh_e.c(1);
			}

			for (; var1 != null; var1 = (fi) ma.eh_e.c(1)) {
				if (~var1.x == -1) {
					r.a(true, (byte) 121, var1);
				}
			}

			++va.L;
			if (rb.vg_d != null) {
				mc.a(rb.vg_d, -23101);
				rb.vg_d = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pf.A(" + var0 + ')');
		}
	}

	public static void f(int var0) {
		try {
			V = null;
			lf_kb = null;
			lf_ib = null;
			lf_nb = null;
			R = null;
			lf_hb = null;
			lf_qb = null;
			Q = null;
			lf_fb = null;
			if (var0 > -76) {
				e(50);
			}

			lf_ab = null;
			X = null;
			S = null;
			lf_jb = null;
			W = null;
			lf_cb = null;
			Y = null;
			dfs_bb = null;
			Z = null;
			lf_mb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pf.C(" + var0 + ')');
		}
	}

	public pf() {
		super(3, false);
	}

	final int[] a(int var1, int var2) {
		int var9 = client.int_gc;

		try {
			if (var1 >= -49) {
				return null;
			} else {
				int[] var3 = super.H.a(-314, var2);
				if (super.H.boolean_v) {
					int[] var4 = this.a((int) var2, 126, 0);
					int[] var5 = this.a((int) var2, 127, 1);
					int[] var6 = this.a((int) var2, -128, 2);
					int var7 = 0;
					if (var9 != 0 || var7 < ff.int_a) {
						do {
							label47:
							{
								int var8 = var6[var7];
								if (~var8 == -4097) {
									var3[var7] = var4[var7];
									if (var9 == 0) {
										break label47;
									}
								}

								if (~var8 != -1) {
									var3[var7] = var4[var7] * var8 + (-var8 + 4096) * var5[var7] >> 1453042284;
									if (var9 == 0) {
										break label47;
									}
								}

								var3[var7] = var5[var7];
							}

							++var7;
						} while (var7 < ff.int_a);
					}
				}

				++int_pb;
				return var3;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "pf.G(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			if (var1 >= -120) {
				e(-51);
			}

			if (var2 == 0) {
				super.x = var3.j((byte) 120) == 1;
			}

			++int_db;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "pf.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var19 = client.int_gc;

		try {
			++T;
			if (var2 != 2177) {
				int_lb = 31;
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int[] var4 = this.a((int) var1, -125, 2);
				int[][] var5 = this.a(false, var1, 0);
				int[][] var6 = this.a(false, var1, 1);
				int[] var7 = var3[0];
				int[] var8 = var3[1];
				int[] var10 = var5[0];
				int[] var12 = var5[2];
				int[] var11 = var5[1];
				int[] var9 = var3[2];
				int[] var13 = var6[0];
				int[] var14 = var6[1];
				int[] var15 = var6[2];
				int var16 = 0;
				if (var19 != 0 || ~var16 > ~ff.int_a) {
					do {
						label47:
						{
							int var17 = var4[var16];
							if (~var17 == -4097) {
								var7[var16] = var10[var16];
								var8[var16] = var11[var16];
								var9[var16] = var12[var16];
								if (var19 == 0) {
									break label47;
								}
							}

							if (~var17 != -1) {
								int var18 = 4096 + -var17;
								var7[var16] = var17 * var10[var16] + var18 * var13[var16] >> 108335020;
								var8[var16] = var17 * var11[var16] + var14[var16] * var18 >> -790863444;
								var9[var16] = var18 * var15[var16] + var17 * var12[var16] >> 237186092;
								if (var19 == 0) {
									break label47;
								}
							}

							var7[var16] = var13[var16];
							var8[var16] = var14[var16];
							var9[var16] = var15[var16];
						}

						++var16;
					} while (~var16 > ~ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var20) {
			throw ec.a(var20, "pf.E(" + var1 + ',' + var2 + ')');
		}
	}

	static uf g(int var0) {
		try {
			if (var0 != 31379) {
				return null;
			} else {
				++int_ob;

				try {
					return (uf) Class.forName("ud").newInstance();
				} catch (Throwable throwable) {
					return new n();
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pf.B(" + var0 + ')');
		}
	}

	static {
		W = lf_cb;
		int_lb = 0;
		Y = dd.a("", 2);
		Q = Y;
		lf_fb = dd.a("oder ung-Ultiges Passwort)3", 2);
		lf_ib = Y;
		X = Y;
		lf_jb = Y;
		lf_kb = Y;
		lf_qb = dd.a("Members only world", 2);
		S = lf_qb;
		lf_nb = dd.a("FULL", 2);
		lf_hb = dd.a("Fps:", 2);
		lf_ab = Y;
		lf_mb = lf_nb;
	}
}
