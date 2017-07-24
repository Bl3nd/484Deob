final class v extends qa {

	static int int_fb;
	static int int_gb;
	static int int_hb;
	static int int_ib;
	static int int_jb;
	static rc rc_kb = new rc(64);
	static int int_lb;
	static int int_mb;
	static int int_nb = -1;
	static lf lf_ob = dd.a("AUS", 2);
	static int int_pb;
	static rc rc_qb = new rc(260);
	static int int_rb = 0;
	static tf tf_sb = new tf();
	static int int_tb = 0;
	static int[] ints_ub = new int[256];
	static int int_vb;
	static bg cache15;//bg_wb

	static final void f(int var0) {
		try {
			++int_pb;
			ie.Mb.c(-51);
			if (var0 != 64) {
				c(-25, 114);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "v.I(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4) {
		try {
			if (var4 != 188) {
				cache15 = null;
			}

			++int_fb;
			int var5 = 0;
			if (ma.int_h > var5) {
				do {
					if (vg.Lc[var5] + fi.ints_p[var5] > var2 && var2 + var3 > fi.ints_p[var5] && var1 < gh.W[var5] + cf.B[var5]
							&& var0 + var1 > cf.B[var5]) {
						va.booleans_db[var5] = true;
					}

					++var5;
				} while (ma.int_h > var5);

			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "v.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final boolean a(lf var0, int var1) {
		int var3 = client.int_gc;

		try {
			++int_mb;
			if (var0 == null) {
				return false;
			} else {
				int var2 = 0;
				if (var1 < 58) {
					rc_kb = null;
					if (var3 == 0 && bh.int_ob <= var2) {
						return false;
					}
				} else if (bh.int_ob <= var2) {
					return false;
				}

				do {
					if (var0.a((byte) -121, d.lfs_fb[var2])) {
						return true;
					}

					++var2;
				} while (bh.int_ob > var2);

				return false;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "v.N(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static final void a(long var0, int var2) {
		try {
			++int_lb;
			if (var0 != 0L) {
				++ic.int_r;
				vg.J.e((byte) 81, 188);
				vg.J.a(var0, -562765672);
				if (var2 != -22946) {
					a((lf) null, -50);
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "v.H(" + var0 + ',' + var2 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var10 = client.int_gc;

		try {
			++int_jb;
			if (var2 != 2177) {
				rc_qb = null;
			}

			int[][] var3 = super.jh_q.a((byte) -128, var1);
			if (super.jh_q.boolean_w && this.d((byte) 116)) {
				int[] var4 = var3[0];
				int[] var5 = var3[1];
				int var7 = super.int_db * (var1 % super.int_db);
				int[] var6 = var3[2];
				int var8 = 0;
				if (var10 != 0 || var8 < ff.int_a) {
					do {
						int var9 = super.W[var8 % super.Z + var7];
						var6[var8] = sd.a(255, var9) << -1308503644;
						var5[var8] = sd.a('\uff00', var9) >> -151302556;
						var4[var8] = sd.a(var9, 16711680) >> -222389844;
						++var8;
					} while (var8 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "v.E(" + var1 + ',' + var2 + ')');
		}
	}

	static final lh c(int var0, int var1) {
		try {
			++int_ib;
			lh var2 = (lh) e.rc_m.a((long) var0, (int) -112);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = af.bg_u.a(0, var0, 13);
				var2 = new lh();
				var2.J = var0;
				if (var3 != null) {
					var2.a(new ja(var3), true);
				}

				e.rc_m.a((long) var0, -124, var2);
				if (var1 != -18753) {
					a(-99L, -61);
				}

				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "v.L(" + var0 + ',' + var1 + ')');
		}
	}

	public static void e(byte var0) {
		try {
			rc_kb = null;
			ints_ub = null;
			int var1 = 0 / ((-26 - var0) / 60);
			lf_ob = null;
			cache15 = null;
			rc_qb = null;
			tf_sb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "v.K(" + var0 + ')');
		}
	}

	static final int b(boolean var0) {
		try {
			++int_hb;
			if (!var0) {
				cache15 = null;
			}

			return he.K++;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "v.J(" + var0 + ')');
		}
	}
}
