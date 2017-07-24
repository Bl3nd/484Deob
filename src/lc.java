final class lc extends hb {

	int[] ints_n = new int[1];
	static lf lf_o;
	static int int_p;
	static int int_q;
	static int int_r = 0;
	static int int_s;
	static int int_t;
	int[] ints_u = new int[]{-1};
	static int int_v;
	static int int_w;
	static lf x;
	static vg y;
	private static lf z = dd.a("Loaded interfaces", 2);
	static int[] A = new int[100];
	static byte[][][] B;
	static int C;
	static volatile long D;
	static lf E;

	static final void a(int var0) {
		int var9 = client.int_gc;

		try {
			if (var0 == 5) {
				++int_s;

				while (~ka.I.b(wb.int_g, (byte) 43) <= -12) {
					int var1 = ka.I.f((byte) 89, 11);
					if (var1 == 2047) {
						break;
					}

					boolean var2 = false;
					if (w.us_e[var1] == null) {
						w.us_e[var1] = new u();
						if (qb.Q[var1] != null) {
							w.us_e[var1].a(true, qb.Q[var1]);
						}

						var2 = true;
					}

					nd.ints_k[r.Y++] = var1;
					u var3 = w.us_e[var1];
					var3.int_rc = pd.int_i;
					int var4 = ka.I.f((byte) 126, 5);
					int var5 = ka.I.f((byte) 112, 5);
					if (var5 > 15) {
						var5 -= 32;
					}

					if (~var4 < -16) {
						var4 -= 32;
					}

					int var6 = ka.I.f((byte) 124, 1);
					if (~var6 == -2) {
						kh.T[kd.S++] = var1;
					}

					int var7 = ka.I.f((byte) 106, 1);
					int var8 = u.Kc[ka.I.f((byte) 110, 3)];
					if (var2) {
						var3.int_ec = var3.int_mb = var8;
					}

					var3.a(true, r.X.xb[0] - -var4, ~var7 == -2, var5 + r.X.ints_db[0]);
					if (var9 != 0) {
						break;
					}
				}

				ka.I.e(true);
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "lc.A(" + var0 + ')');
		}
	}

	static final void b(boolean var0) {
		try {
			++ic.int_r;
			vg.J.e((byte) 85, 188);
			++C;
			vg.J.a(0L, -562765672);
			if (var0) {
				D = -57L;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lc.E(" + var0 + ')');
		}
	}

	static final void b(int var0) {
		try {
			ed.rc_t.c(-51);
			if (var0 != 15359) {
				a(67, (byte) -45);
			}

			++int_v;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lc.D(" + var0 + ')');
		}
	}

	public static void c(int var0) {
		try {
			B = null;
			lf_o = null;
			z = null;
			E = null;
			A = null;
			int var1 = 16 / ((11 - var0) / 51);
			y = null;
			x = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lc.C(" + var0 + ')');
		}
	}

	static final boolean a(int var0, byte var1) {
		try {
			if (var1 < 103) {
				return true;
			} else {
				++int_p;
				return ~var0 > -33 ? false : (var0 == 127 ? false : ~var0 > -130 || ~var0 < -160);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "lc.B(" + var0 + ',' + var1 + ')');
		}
	}

	static {
		x = z;
		D = 0L;
		lf_o = dd.a(" zuerst von Ihrer Freunde)2Liste(Q", 2);
		E = dd.a("null", 2);
	}
}
