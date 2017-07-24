final class rg {

	int int_a;
	static oe[] oes_b = new oe[4];
	static int int_c;
	int int_d;
	static int int_e = 0;
	static ah ah_f;
	int int_g;
	int int_h;
	int int_i;
	int int_j;
	static kf kf_k;
	static int int_l;
	static int int_m;
	int int_n;
	int int_o;
	static int int_p;
	int int_q;
	int int_r;
	static int int_s;
	static short[] shorts_t;
	int int_u;
	int int_v;
	int int_w;
	int x;
	int y;
	int z;
	int A;
	int B;
	static int[] D = new int[50];
	static int E;

	static lf a(int radix, int var1, boolean var2, int var3) {
		try {
			++int_p;
			if (radix >= 2 && radix <= 36) {
				int var4 = 1;
				if (var1 != -19865) {
					return null;
				} else {
					int var5 = var3 / radix;
					while (var5 != 0) {
						var5 /= radix;
						++var4;
					}

					int var6 = var4;
					if (~var3 > -1 || var2) {
						var6 = var4 + 1;
					}

					byte[] var7 = new byte[var6];
					if (var3 < 0) {
						var7[0] = 45;
					} else {
						if (var2) {
							var7[0] = 43;
						}
					}

					int var8 = 0;
					lf var12;
					if (var8 >= var4) {
						var12 = new lf();
						var12.S = var6;
						var12.Y = var7;
						return var12;
					} else {
						do {
							int var9 = var3 % radix;
							var3 /= radix;
							if (~var9 > -1) {
								var9 = -var9;
							}

							if (~var9 < -10) {
								var9 += 39;
							}

							var7[-1 + -var8 + var6] = (byte) (48 + var9);
							++var8;
						} while (var8 < var4);

						var12 = new lf();
						var12.S = var6;
						var12.Y = var7;
						return var12;
					}
				}
			} else {
				throw new IllegalArgumentException("Invalid radix:" + radix);
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "rg.A(" + radix + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(int var0, lf var1, int var2, boolean var3, int var4) {
		try {
			vg var5 = nh.c(var2, -1, var0);
			++int_s;
			if (var5 != null) {
				if (var5.U != null) {
					id var6 = new id();
					var6.I = var1;
					var6.vg_o = var5;
					var6.objects_t = var5.U;
					var6.z = var4;
					ea.a(24087, var6);
				}

				boolean var8 = var3;
				if (~var5.Xb < -1) {
					var8 = ma.a(var5, (byte) -59);
				}

				if (var8) {
					if (q.c(ne.a(var5, 104), var4 + -1, 255)) {
						if (var4 == 1) {
							vg.J.e((byte) 84, 181);
							++ci.int_ib;
							vg.J.b((byte) 115, var2);
							vg.J.c((int) 9698, var0);
						}

						if (var4 == 2) {
							++mc.int_r;
							vg.J.e((byte) 121, 198);
							vg.J.b((byte) 104, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -4) {
							++pd.int_g;
							vg.J.e((byte) 117, 158);
							vg.J.b((byte) 110, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -5) {
							vg.J.e((byte) 115, 84);
							++qh.int_d;
							vg.J.b((byte) 114, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -6) {
							++wg.int_h;
							vg.J.e((byte) 120, 203);
							vg.J.b((byte) 104, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -7) {
							++cg.R;
							vg.J.e((byte) 110, 21);
							vg.J.b((byte) 110, var2);
							vg.J.c((int) 9698, var0);
						}

						if (var4 == 7) {
							++se.X;
							vg.J.e((byte) 125, 234);
							vg.J.b((byte) 126, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -9) {
							++id.int_w;
							vg.J.e((byte) 81, 120);
							vg.J.b((byte) 114, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -10) {
							vg.J.e((byte) 81, 128);
							++ob.int_a;
							vg.J.b((byte) 101, var2);
							vg.J.c((int) 9698, var0);
						}

						if (~var4 == -11) {
							vg.J.e((byte) 88, 22);
							++jh.int_f;
							vg.J.b((byte) 112, var2);
							vg.J.c((int) 9698, var0);
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "rg.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			shorts_t = null;
			ah_f = null;
			D = null;
			oes_b = null;
			int var1 = 14 / ((var0 - -47) / 57);
			kf_k = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "rg.B(" + var0 + ')');
		}
	}

	static final void a(byte var0, bg var1, boolean var2, db var3, bg var4) {
		try {
			++int_m;
			ah.bg_g = var4;
			lf.z = var2;
			ig.bg_p = var1;
			if (var0 != 45) {
				a((byte) 90, (bg) null, false, (db) null, (bg) null);
			}

			qb.V = ig.bg_p.b((byte) 10, (int) 10);
			id.E = var3;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "rg.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1, int var2) {
		int var4 = client.int_gc;

		try {
			++int_c;
			int var3;
			if (var2 != ff.int_a) {
				ef.ints_m = new int[var2];
				var3 = 0;
				if (var4 != 0 || ~var3 > ~var2) {
					do {
						ef.ints_m[var3] = (var3 << -571289428) / var2;
						++var3;
					} while (~var3 > ~var2);
				}

				ch.int_h = var2 - 1;
				ff.int_a = var2;
			}

			if (~var0 != ~dg.int_p) {
				fc.G = new int[var0];
				var3 = 0;
				if (var4 != 0 || ~var3 > ~var0) {
					do {
						fc.G[var3] = (var3 << 1669028716) / var0;
						++var3;
					} while (~var3 > ~var0);
				}

				dg.int_p = var0;
				qb.Z = -1 + var0;
			}

			if (var1 != 1669028716) {
				shorts_t = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rg.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
}
