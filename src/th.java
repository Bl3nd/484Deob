final class th {

	static lf[] lfs_a = new lf[500];
	static lf lf_b = dd.a("Sprites geladen)3", 2);
	static int int_c = -1;
	static long[] longs_d = new long[100];
	static int int_e;
	static lf lf_f = dd.a("http:)4)4", 2);
	static p[] ps_g = new p['耀'];
	static lf lf_h = dd.a("(U4", 2);
	static int int_i;

	static final void a(int var0, int var1) {
		try {
			label38:
			{
				if (~var1 != 0 || de.boolean_q) {
					if (var1 == -1 || ~oa.R == ~var1 && hf.d((byte) -96) || ~tc.R == -1 || de.boolean_q) {
						break label38;
					}

					oh.a(-24390, 2, var1, 0, l.cache6, false, tc.R);
					if (client.int_gc == 0) {
						break label38;
					}
				}

				pd.a((int) -29672);
			}

			oa.R = var1;
			int var2 = -68 / ((-25 - var0) / 60);
			++int_e;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "th.A(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(byte var0) {
		int dummy = client.int_gc;

		try {
			++int_i;
			if (!f.boolean_ab) {
				d.Q[0] = 1001;
				qa.int_eb = 1;
				mc.z[0] = ff.lf_c;
				lfs_a[0] = sh.Gb;
			}

			if (ac.int_ab != -1) {
				nf.a(100, ac.int_ab);
			}

			int var1 = 0;
			while (var1 < ma.int_h) {
				if (va.booleans_db[var1]) {
					ub.V[var1] = true;
				}

				o.booleans_d[var1] = va.booleans_db[var1];
				va.booleans_db[var1] = false;
				++var1;
			}

			lb.int_e = pd.int_i;
			od.S = -1;
			af.vg_v = null;
			gh.int_kb = -1;
			if (ac.int_ab != -1) {
				ma.int_h = 0;
				ed.a(0, 765, -1, ac.int_ab, 0, (byte) 16, 0, 0, 503);
			}

			b.c();
			ae.e(22491);
			if (!f.boolean_ab) {
				if (od.S != -1) {
					ja.a(gh.int_kb, od.S, (byte) 69);
				}
			} else {
				dc.e(121);
			}

			if (sg.int_a == 3) {
				int var2 = 0;
				if (var2 < ma.int_h) {
					do {
						if (o.booleans_d[var2]) {
							b.a(fi.ints_p[var2], cf.B[var2], vg.Lc[var2], gh.W[var2], 16711935, 128);
						} else if (ub.V[var2]) {
							b.a(fi.ints_p[var2], cf.B[var2], vg.Lc[var2], gh.W[var2], 16711680, 128);
						}

						++var2;
					} while (var2 < ma.int_h);
				}
			}

			qa.a(true, hc.int_pb, v.int_tb, r.X.int_nc, r.X.int_fb);
			v.int_tb = 0;
			if (var0 != 79) {
				a((byte) -22);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "th.B(" + var0 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_h = null;
			lf_f = null;
			ps_g = null;
			longs_d = null;
			if (var0 != -1) {
				int_c = 22;
			}

			lfs_a = null;
			lf_b = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "th.C(" + var0 + ')');
		}
	}
}
