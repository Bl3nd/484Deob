class ph extends hb {

	static lf lf_n;
	static int int_o = 0;
	private static lf lf_p = dd.a("Unable to connect)3", 2);
	private static lf lf_q = dd.a("Loading fonts )2 ", 2);
	ph ph_r;
	static int int_s;
	static lf lf_t;
	static int int_u;
	static lf lf_v;
	private static lf lf_w;
	static lf x;
	static int y;
	static lf z;
	static int A;
	ph B;
	static rc C;
	static rc D;
	static int E;
	static lf F;

	static final void a(int var0, vg var1) {
		try {
			int var2 = var1.Xb;
			++int_u;
			if (var2 == 324) {
				if (~fa.int_gb == 0) {
					te.J = var1.W;
					fa.int_gb = var1.int_fc;
				}

				if (!pe.be_c.boolean_r) {
					var1.int_fc = te.J;
				} else {
					var1.int_fc = fa.int_gb;
				}
			} else {
				if (var0 != -1753) {
					lf_q = null;
				}

				if (~var2 == -326) {
					if (~fa.int_gb == 0) {
						te.J = var1.W;
						fa.int_gb = var1.int_fc;
					}

					if (pe.be_c.boolean_r) {
						var1.int_fc = te.J;
					} else {
						var1.int_fc = fa.int_gb;
					}
				} else if (~var2 == -328) {
					var1.int_gb = 150;
					var1.Ab = 2047 & (int) (256.0D * Math.sin((double) pd.int_i / 40.0D));
					var1.int_mc = -1;
					var1.Eb = 5;
				} else if (var2 == 328) {
					if (r.X.Dc == null) {
						var1.int_mc = 0;
					} else {
						var1.int_gb = 150;
						var1.Ab = 2047 & (int) (256.0D * Math.sin((double) pd.int_i / 40.0D));
						var1.Eb = 5;
						var1.int_mc = ((int) r.X.Dc.a(false) << 2124599275) + 2047;
						var1.int_uc = r.X.Db;
						var1.Db = r.X.Jb;
					}
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ph.FB(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_v = null;
			lf_q = null;
			lf_w = null;
			z = null;
			D = null;
			lf_p = null;
			C = null;
			F = null;
			lf_t = null;
			lf_n = null;
			if (var0 < 47) {
				a(103, (vg) null);
			}

			x = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ph.EB(" + var0 + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			int var10 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			return var8 * var10 > 0 && var10 * var9 > 0;
		}
	}

	static final void a(eb var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var0.ints_k.length;

		int var9;
		int var10;
		int var11;
		int var12;
		for (int var8 = 0; var8 < var7; ++var8) {
			var9 = var0.ints_k[var8] - bg.int_l;
			var10 = var0.ints_l[var8] - tc.int_lb;
			var11 = var0.ints_t[var8] - pe.int_l;
			var12 = var11 * var3 + var9 * var4 >> 16;
			var11 = var11 * var4 - var9 * var3 >> 16;
			var9 = var12;
			var12 = var10 * var2 - var11 * var1 >> 16;
			var11 = var10 * var1 + var11 * var2 >> 16;
			if (var11 < 50) {
				return;
			}

			if (var0.ints_h != null) {
				eb.ints_i[var8] = var9;
				eb.ints_m[var8] = var12;
				eb.ints_p[var8] = var11;
			}

			eb.ints_f[var8] = nc.O + (var9 << 9) / var11;
			eb.ints_a[var8] = nc.V + (var12 << 9) / var11;
		}

		nc.N = 0;
		var7 = var0.ints_v.length;

		for (var9 = 0; var9 < var7; ++var9) {
			var10 = var0.ints_v[var9];
			var11 = var0.ints_j[var9];
			var12 = var0.ints_u[var9];
			int var13 = eb.ints_f[var10];
			int var14 = eb.ints_f[var11];
			int var15 = eb.ints_f[var12];
			int var16 = eb.ints_a[var10];
			int var17 = eb.ints_a[var11];
			int var18 = eb.ints_a[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				if (ng.boolean_ab && a(dc.int_ob, tb.int_db, var16, var17, var18, var13, var14, var15)) {
					ah.int_w = var5;
					client.V = var6;
				}

				nc.Y = false;
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > nc.int_gb || var14 > nc.int_gb || var15 > nc.int_gb) {
					nc.Y = true;
				}

				if (var0.ints_h != null && var0.ints_h[var9] != -1) {
					if (!va.W) {
						if (var0.boolean_e) {
							nc.b(var16, var17, var18, var13, var14, var15, var0.ints_c[var9], var0.ints_q[var9], var0.ints_o[var9], eb.ints_i[0], eb.ints_i[1], eb.ints_i[3], eb.ints_m[0], eb.ints_m[1], eb.ints_m[3], eb.ints_p[0], eb.ints_p[1], eb.ints_p[3], var0.ints_h[var9]);
						} else {
							nc.b(var16, var17, var18, var13, var14, var15, var0.ints_c[var9], var0.ints_q[var9], var0.ints_o[var9], eb.ints_i[var10], eb.ints_i[var11], eb.ints_i[var12], eb.ints_m[var10], eb.ints_m[var11], eb.ints_m[var12], eb.ints_p[var10], eb.ints_p[var11], eb.ints_p[var12], var0.ints_h[var9]);
						}
					} else {
						int var19 = nc.Z.a(var0.ints_h[var9], false);
						nc.a(var16, var17, var18, var13, var14, var15, lf_p.a(var19, var0.ints_c[var9]), lf_p.a(var19, var0.ints_q[var9]), lf_p.a(var19, var0.ints_o[var9]));
					}
				} else if (var0.ints_c[var9] != 12345678) {
					nc.a(var16, var17, var18, var13, var14, var15, var0.ints_c[var9], var0.ints_q[var9], var0.ints_o[var9]);
				}
			}
		}

	}

	final void c(byte var1) {
		try {
			++y;
			if (var1 != 3) {
				a(-121, (vg) null);
			}

			if (this.ph_r != null) {
				this.ph_r.B = this.B;
				this.B.ph_r = this.ph_r;
				this.B = null;
				this.ph_r = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ph.HB(" + var1 + ')');
		}
	}

	static {
		lf_t = lf_q;
		lf_v = lf_p;
		z = dd.a("Ung-Ultiges Anmelde)2Paket)3", 2);
		lf_n = lf_p;
		A = 0;
		lf_w = dd.a("Please check your message)2centre for details)3", 2);
		x = lf_w;
		C = new rc(64);
		D = new rc(50);
		E = 0;
		F = dd.a("Spiel)2Engine wird gestartet)3)3)3", 2);
	}
}
