final class hd extends hb {

	static lf lf_n = dd.a("Diese Betatest)2Welt ist nur f-Ur eingeladene", 2);
	int int_o;
	private static lf lf_p = dd.a("Location", 2);
	static lf lf_q;
	static oh cache8;//oh_r
	int int_s;
	static int int_t;
	static int int_u = 1;
	static lf lf_v;
	static int int_w;

	static final long a(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		return var3 != null && var3.K != null ? var3.K.long_i : 0L;
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
		nf var20;
		int var21;
		if (var3 == 0) {
			var20 = new nf(var10, var11, var12, var13, -1, var18, false);

			for (var21 = var0; var21 >= 0; --var21) {
				if (i.Ib[var21][var1][var2] == null) {
					i.Ib[var21][var1][var2] = new ab(var21, var1, var2);
				}
			}

			i.Ib[var0][var1][var2].L = var20;
		} else if (var3 != 1) {
			eb var22 = new eb(var3, var4, var5, var1, var2, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);

			for (var21 = var0; var21 >= 0; --var21) {
				if (i.Ib[var21][var1][var2] == null) {
					i.Ib[var21][var1][var2] = new ab(var21, var1, var2);
				}
			}

			i.Ib[var0][var1][var2].M = var22;
		} else {
			var20 = new nf(var14, var15, var16, var17, var5, var19, var6 == var7 && var6 == var8 && var6 == var9);

			for (var21 = var0; var21 >= 0; --var21) {
				if (i.Ib[var21][var1][var2] == null) {
					i.Ib[var21][var1][var2] = new ab(var21, var1, var2);
				}
			}

			i.Ib[var0][var1][var2].L = var20;
		}
	}

	public static void a(int var0) {
		try {
			if (var0 != -2831) {
				b(58);
			}

			lf_p = null;
			lf_v = null;
			cache8 = null;
			lf_q = null;
			lf_n = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hd.E(" + var0 + ')');
		}
	}

	static final kf c(byte var0) {
		int var5 = client.int_gc;

		try {
			++int_t;
			kf var1 = new kf();
			var1.Q = c.ints_db[0];
			var1.T = md.int_f;
			var1.P = h.ints_n[0];
			var1.S = rc.ints_a[0];
			var1.R = sb.int_c;
			byte[] var3 = ai.bytes_i[0];
			var1.U = w.ints_f[0];
			int var2 = var1.Q * var1.P;
			var1.O = new int[var2];
			int var4 = 0;
			if (var0 != 46) {
				a(-111, -90, -5, -59, 26, -120, 3, 37, 88, 0, -117, 36, -70, -65, 83, 82, 31, 122, 107, 122);
				if (var5 != 0) {
					var1.O[var4] = f.V[sd.a(255, var3[var4])];
					++var4;
				}
			}

			while (~var4 > ~var2) {
				var1.O[var4] = f.V[sd.a(255, var3[var4])];
				++var4;
			}

			h.b(var0 + -159);
			return var1;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "hd.A(" + var0 + ')');
		}
	}

	static final void b(int var0) {
		int var5 = client.int_gc;

		try {
			int var1 = 0;
			if (var0 <= 100) {
				lf_n = null;
				if (var5 == 0 && kd.S <= var1) {
					++int_w;
					return;
				}
			} else if (kd.S <= var1) {
				++int_w;
				return;
			}

			do {
				int var2 = kh.T[var1];
				u var3 = w.us_e[var2];
				int var4 = ka.I.j((byte) 105);
				if ((var4 & 4) != 0) {
					var4 += ka.I.j((byte) 83) << 8;
				}

				pa.a(var2, (byte) -38, var3, var4);
				++var1;
			} while (kd.S > var1);

			++int_w;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "hd.B(" + var0 + ')');
		}
	}

	hd(int var1, int var2) {
		try {
			this.int_o = var2;
			this.int_s = var1;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "hd.<init>(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		lf_q = lf_p;
		lf_v = dd.a("Lade Schrifts-=tze )2 ", 2);
	}
}
