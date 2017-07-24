final class nf {

	int int_a;
	static lf lf_b = dd.a("Suche nach Updates )2 ", 2);
	static int int_c;
	static int int_d = 0;
	int int_e;
	private static lf lf_f = dd.a("Login server offline)3", 2);
	static lf lf_g;
	boolean boolean_h = true;
	static int int_i;
	int int_j;
	static int int_k;
	int int_l;
	int int_m;
	static lf lf_n;
	int int_o;
	private static lf lf_p;
	static lf lf_q;
	static int int_r;

	static final void a(byte var0, int var1, int var2, int var3, int var4) {
		try {
			++int_r;
			int var5 = -15 % ((var0 - 22) / 32);
			if (~vf.U == -2) {
				client.kfs_pb[je.int_k / 100].a(-8 + fi.y, -8 + pf.int_eb);
			}

			if (vf.U == 2) {
				client.kfs_pb[4 + je.int_k / 100].a(fi.y + -8, -8 + pf.int_eb);
			}

			se.e(115);
			if (oa.V) {
				int var7 = 20 + var2;
				int var6 = 512 + var1 + -5;
				jg.db_r.b(de.a(new lf[]{pf.lf_hb, fa.a((byte) 85, ph.int_o)}, -50), var6, var7, 16776960, -1);
				var7 += 15;
				Runtime var8 = Runtime.getRuntime();
				int var10 = 16776960;
				int var9 = (int) ((var8.totalMemory() + -var8.freeMemory()) / 1024L);
				if (var9 > '耀' && tf.boolean_q) {
					var10 = 16711680;
				}

				if (~var9 < -65537 && !tf.boolean_q) {
					var10 = 16711680;
				}

				jg.db_r.b(de.a(new lf[]{ae.mem_, fa.a((byte) 85, var9), la.lf_n}, 123), var6, var7, var10, -1);
				var7 += 15;
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "nf.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final df a(boolean var0) {
		try {
			++int_i;
			df var1 = new df();
			var1.O = ai.bytes_i[0];
			var1.S = h.ints_n[0];
			var1.U = sb.int_c;
			if (!var0) {
				a((int) -7);
			}

			var1.R = md.int_f;
			var1.T = w.ints_f[0];
			var1.N = c.ints_db[0];
			var1.P = rc.ints_a[0];
			var1.Q = f.V;
			h.b(-98);
			return var1;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nf.E(" + var0 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_p = null;
			lf_b = null;
			if (var0 == 512) {
				lf_g = null;
				lf_q = null;
				lf_n = null;
				lf_f = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nf.F(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, ka var4, ka var5, int var6, int var7, long var8) {
		if (var4 != null || var5 != null) {
			ba var10 = new ba();
			var10.long_h = var8;
			var10.int_k = var1 * 128 + 64;
			var10.int_i = var2 * 128 + 64;
			var10.int_a = var3;
			var10.ka_m = var4;
			var10.ka_o = var5;
			var10.int_b = var6;
			var10.int_l = var7;

			for (int var11 = var0; var11 >= 0; --var11) {
				if (i.Ib[var11][var1][var2] == null) {
					i.Ib[var11][var1][var2] = new ab(var11, var1, var2);
				}
			}

			i.Ib[var0][var1][var2].H = var10;
		}
	}

	static final void a(int var0, int var1) {
		try {
			++int_k;
			if (ua.a(false, var1)) {
				td.a(-1682905504, -1, sc.vgs_db[var1]);
				if (var0 <= 99) {
					a(4, 127);
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nf.D(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(byte var0) {
		try {
			int var1 = ee.S.b(u.Nc);
			++int_c;
			int var2 = 0;
			int var3;

			for (; var2 < qa.int_eb; ++var2) {
				var3 = ee.S.b(mb.a(var2, (byte) -126));
				if (var3 > var1) {
					var1 = var3;
				}
			}

			var1 += 8;
			var3 = 21 + qa.int_eb * 15;
			lh.I = var1;
			f.boolean_ab = true;
			if (var0 >= -109) {
				lf_q = null;
			}

			int var4 = nh.int_mb + -(var1 / 2);
			if (var4 + var1 > 765) {
				var4 = -var1 + 765;
			}

			if (var4 < 0) {
				var4 = 0;
			}

			ng.M = qa.int_eb * 15 - -22;
			int var5 = gg.int_o;
			la.int_e = var4;
			if (var3 + var5 > 503) {
				var5 = -var3 + 503;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			lb.E = var5;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "nf.C(" + var0 + ')');
		}
	}

	nf(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		try {
			this.int_o = var5;
			this.int_m = var4;
			this.int_e = var3;
			this.int_j = var1;
			this.int_a = var2;
			this.int_l = var6;
			this.boolean_h = var7;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "nf.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	static {
		lf_g = lf_f;
		lf_p = dd.a("Take", 2);
		lf_q = dd.a("Keine Antwort vom Server)3", 2);
		lf_n = lf_p;
	}
}
