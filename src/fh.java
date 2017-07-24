import java.io.IOException;

final class fh {

	static rc rc_a = new rc(64);
	static lf lf_b = dd.a("Cabbage", 2);
	static int int_c;
	static int int_d = -1;
	static int int_e;
	static int int_f;
	static int int_g;
	static int int_h = 0;
	static int[] ints_i;

	public static void a(int var0) {
		try {
			lf_b = null;
			ints_i = null;
			rc_a = null;
			if (var0 != 1) {
				ints_i = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fh.E(" + var0 + ')');
		}
	}

	static void a(boolean var0) {
		int var9 = client.int_gc;

		try {
			while (~ka.I.b(wb.int_g, (byte) 79) <= -28) {
				int var1 = ka.I.f((byte) 121, 15);
				if (var1 == 32767) {
					break;
				}

				boolean var2 = false;
				if (th.ps_g[var1] == null) {
					th.ps_g[var1] = new p();
					var2 = true;
				}

				p var3 = th.ps_g[var1];
				a.ints_h[a.int_j++] = var1;
				var3.int_rc = pd.int_i;
				int var4 = ka.I.f((byte) 68, 1);
				int var5 = ka.I.f((byte) 65, 1);
				if (~var5 == -2) {
					kh.T[kd.S++] = var1;
				}

				int var6 = ka.I.f((byte) 71, 5);
				int var7 = u.Kc[ka.I.f((byte) 98, 3)];
				if (var2) {
					var3.int_ec = var3.int_mb = var7;
				}

				if (var6 > 15) {
					var6 -= 32;
				}

				int var8 = ka.I.f((byte) 127, 5);
				if (var8 > 15) {
					var8 -= 32;
				}

				var3.xc = uh.a((byte) -99, ka.I.f((byte) 116, 14));
				var3.int_qc = var3.xc.int_ib;
				var3.int_hc = var3.xc.int_pb;
				var3.zb = var3.xc.O;
				var3.int_ab = var3.xc.xb;
				var3.int_eb = var3.xc.int_hb;
				var3.Eb = var3.xc.Z;
				var3.int_pb = var3.xc.int_fb;
				var3.int_wb = var3.xc.int_ub;
				if (var3.int_wb == 0) {
					var3.int_mb = 0;
				}

				var3.int_uc = var3.xc.int_cb;
				var3.a(true, r.X.xb[0] + var6, var4 == 1, r.X.ints_db[0] + var8);
				if (var9 != 0) {
					break;
				}
			}

			if (var0) {
				ints_i = null;
			}

			ka.I.e(true);
			++int_c;
		} catch (RuntimeException var10) {
			throw ec.a(var10, "fh.D(" + var0 + ')');
		}
	}

	static int a(int var0, int var1) {
		try {
			int var2 = 0;
			++int_f;
			if (var1 < 0 || var1 >= 65536) {
				var2 += 16;
				var1 >>>= 16;
			}

			if (var1 >= 256) {
				var2 += 8;
				var1 >>>= 8;
			}

			if (var1 >= 16) {
				var2 += 4;
				var1 >>>= 4;
			}

			if (var0 >= ~var1) {
				var2 += 2;
				var1 >>>= 2;
			}

			if (var1 >= 1) {
				var1 >>>= 1;
				++var2;
			}

			return var1 + var2;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "fh.C(" + var0 + ',' + var1 + ')');
		}
	}

	static void b(int var0, int var1) {
		try {
			gg.int_h = var1;
			++int_g;
			if (var0 > -83) {
				a(52, 78);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "fh.B(" + var0 + ',' + var1 + ')');
		}
	}

	static void a(boolean var0, byte var1) {
		try {
			++int_e;
			int var2 = 85 % ((var1 - -75) / 48);
			uf.a((byte) 100);
			++wd.int_ob;
			if (wd.int_ob >= 50 || var0) {
				wd.int_ob = 0;
				if (!ac.Q && fd.nd_s != null) {
					vg.J.e((byte) 106, 20);

					try {
						fd.nd_s.a(-58, 0, vg.J.P, vg.J.yb);
						vg.J.P = 0;
					} catch (IOException var3) {
						ac.Q = true;
					}

					++cc.Q;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "fh.A(" + var0 + ',' + var1 + ')');
		}
	}
}
