import java.awt.Component;

final class d extends j {

	static short[] Q = new short[500];
	static byte[][] R = new byte[250][];
	static int S;
	static lf T;
	static short[][] U = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
	static int V;
	static int W = 0;
	private static lf X = dd.a("Please wait 5 minutes before trying again)3", 2);
	static int[] Y = new int[]{8, 11, 4, 6, 9, 7, 10};
	static int Z;
	static int int_ab;
	static lf lf_bb;
	static lf lf_cb;
	static int int_db;
	static int[] ints_eb = new int[50];
	static lf[] lfs_fb = new lf[100];
	static int int_gb;
	private static lf lf_hb;
	static int int_ib;
	static int int_jb = 0;

	static int c(int var0, int var1) {
		try {
			return var0 | var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "d.I(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(int var0, uc class_uc) {
		int dummy = client.int_gc;

		try {
			++int_ab;
			class_uc.boolean_fc = false;
			bi var2;
			if (class_uc.Jb != -1) {
				label155:
				{
					var2 = client.a(12, class_uc.Jb);
					if (var2 != null && var2.Q != null) {
						++class_uc.int_gc;
						if (class_uc.Db < var2.Q.length && ~class_uc.int_gc < ~var2.T[class_uc.Db]) {
							++class_uc.Db;
							class_uc.int_gc = 1;
							pg.a(class_uc.int_nc, class_uc == r.X, class_uc.int_fb, (byte) -128, class_uc.Db, var2);
						}

						if (var2.Q.length > class_uc.Db) {
							break label155;
						}

						class_uc.int_gc = 0;
						class_uc.Db = 0;
						pg.a(class_uc.int_nc, class_uc == r.X, class_uc.int_fb, (byte) -27, class_uc.Db, var2);
						if (dummy == 0) {
							break label155;
						}
					}

					class_uc.Jb = -1;
				}
			}

			if (class_uc.Nb != -1 && pd.int_i >= class_uc.int_tc) {
				label162:
				{
					if (~class_uc.int_cc > -1) {
						class_uc.int_cc = 0;
					}

					int var6 = v.c(class_uc.Nb, -18753).Z;
					if (~var6 != 0) {
						bi var3 = client.a(12, var6);
						if (var3 == null || var3.Q == null) {
							class_uc.Nb = -1;
							if (dummy == 0) {
								break label162;
							}
						}

						++class_uc.int_kb;
						if (~class_uc.int_cc > ~var3.Q.length && ~class_uc.int_kb < ~var3.T[class_uc.int_cc]) {
							class_uc.int_kb = 1;
							++class_uc.int_cc;
							pg.a(class_uc.int_nc, r.X == class_uc, class_uc.int_fb, (byte) -111, class_uc.int_cc, var3);
						}

						if (~var3.Q.length < ~class_uc.int_cc) {
							break label162;
						}

						class_uc.Nb = -1;
						if (dummy == 0) {
							break label162;
						}
					}

					class_uc.Nb = -1;
				}
			}

			if (class_uc.int_bc != -1 && class_uc.Ab <= 1) {
				var2 = client.a(12, class_uc.int_bc);
				if (var2.V == 1 && class_uc.int_qb > 0 && ~class_uc.int_bb >= ~pd.int_i && pd.int_i > class_uc.int_jb) {
					class_uc.Ab = 1;
					return;
				}
			}

			if (var0 != 1) {
				lf_cb = null;
			}

			if (class_uc.int_bc != -1 && class_uc.Ab == 0) {
				label179:
				{
					var2 = client.a(12, class_uc.int_bc);
					if (var2 == null || var2.Q == null) {
						class_uc.int_bc = -1;
						if (dummy == 0) {
							break label179;
						}
					}

					++class_uc.Zb;
					if (var2.Q.length > class_uc.int_ob && var2.T[class_uc.int_ob] < class_uc.Zb) {
						class_uc.Zb = 1;
						++class_uc.int_ob;
						pg.a(class_uc.int_nc, class_uc == r.X, class_uc.int_fb, (byte) -44, class_uc.int_ob, var2);
					}

					if (~var2.Q.length >= ~class_uc.int_ob) {
						label113:
						{
							class_uc.int_ob -= var2.int_fb;
							++class_uc.Yb;
							if (var2.int_ib > class_uc.Yb) {
								if (~class_uc.int_ob <= -1 && class_uc.int_ob < var2.Q.length) {
									pg.a(class_uc.int_nc, class_uc == r.X, class_uc.int_fb, (byte) -118, class_uc.int_ob, var2);
									if (dummy == 0) {
										break label113;
									}
								}

								class_uc.int_bc = -1;
								if (dummy == 0) {
									break label113;
								}
							}

							class_uc.int_bc = -1;
						}
					}

					class_uc.boolean_fc = var2.H;
				}
			}

			if (~class_uc.Ab < -1) {
				--class_uc.Ab;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "d.D(" + var0 + ',' + (class_uc != null ? "{...}" : "null") + ')');
		}
	}

	static final void c(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		if (var3 != null) {
			var3.H = null;
		}
	}

	static final void a(Component component, byte var1) {
		try {
			component.addMouseListener(j.z);
			++int_ib;
			if (var1 == 78) {
				component.addMouseMotionListener(j.z);
				component.addFocusListener(j.z);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "d.H(" + (component != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static final ng a(byte var0, int var1) {
		try {
			++int_gb;
			ng var2 = (ng) ca.rc_m.a((long) var1, (int) -128);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = gh.bg_hb.a(0, var1, 1);
				if (var0 != 55) {
					return null;
				} else {
					var2 = new ng();
					if (var3 != null) {
						var2.a(new ja(var3), (byte) 68, var1);
					}

					ca.rc_m.a((long) var1, -109, var2);
					return var2;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "d.B(" + var0 + ',' + var1 + ')');
		}
	}

	public static void e(int var0) {
		try {
			X = null;
			U = null;
			lf_bb = null;
			lf_cb = null;
			Y = null;
			ints_eb = null;
			lf_hb = null;
			if (var0 > -69) {
				a(60, (uc) null);
			}

			T = null;
			Q = null;
			R = null;
			lfs_fb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "d.C(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var5 = client.int_gc;

		try {
			if (var1 > -49) {
				return null;
			} else {
				++S;
				int[] var3 = super.H.a(-314, var2);
				if (super.H.boolean_v) {
					int var4 = 0;
					if (var5 != 0 || var4 < ff.int_a) {
						do {
							var3[var4] = ef.ints_m[var4];
							++var4;
						} while (var4 < ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "d.G(" + var1 + ',' + var2 + ')');
		}
	}

	public d() {
		super(0, true);
	}

	static {
		T = X;
		lf_hb = dd.a("World", 2);
		lf_bb = lf_hb;
		lf_cb = lf_hb;
	}
}
