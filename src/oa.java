final class oa extends j {

	static int Q;
	static int R = -1;
	static int[] S;
	static int T;
	static int U;
	static boolean V = false;
	private boolean W = true;
	static lf X;
	static int Y;
	static int Z;
	static int int_ab;
	static lf lf_bb = dd.a("Lade Konfiguration )2 ", 2);
	static int int_cb;
	private static lf lf_db = dd.a("Loaded update list", 2);
	static int int_eb;
	static int int_fb;
	private boolean boolean_gb = true;
	static int int_hb;

	final int[] a(int var1, int var2) {
		int var6 = client.int_gc;

		try {
			if (var1 > -49) {
				d((byte) 119);
			}

			int[] var3 = super.H.a(-314, var2);
			++int_eb;
			if (super.H.boolean_v) {
				int[] var4 = this.a((int) (!this.W ? var2 : -var2 + qb.Z), 55, 0);
				if (!this.boolean_gb) {
					na.a((int[]) var4, 0, (int[]) var3, 0, ff.int_a);
					if (var6 == 0) {
						return var3;
					}
				}

				int var5 = 0;
				if (var6 != 0 || ~var5 > ~ff.int_a) {
					do {
						var3[var5] = var4[ch.int_h - var5];
						++var5;
					} while (~var5 > ~ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "oa.G(" + var1 + ',' + var2 + ')');
		}
	}

	public oa() {
		super(1, false);
	}

	final int[][] b(int var1, int var2) {
		int var12 = client.int_gc;

		try {
			if (var2 != 2177) {
				return null;
			} else {
				++int_ab;
				int[][] var3 = super.jh_q.a((byte) -127, var1);
				if (super.jh_q.boolean_w) {
					int[][] var4 = this.a(false, !this.W ? var1 : qb.Z + -var1, 0);
					int[] var5 = var4[0];
					int[] var6 = var4[1];
					int[] var7 = var4[2];
					int[] var8 = var3[0];
					int[] var9 = var3[1];
					int[] var10 = var3[2];
					int var11;
					if (this.boolean_gb) {
						var11 = 0;
						if (var12 != 0 || ff.int_a > var11) {
							do {
								var8[var11] = var5[-var11 + ch.int_h];
								var9[var11] = var6[-var11 + ch.int_h];
								var10[var11] = var7[ch.int_h - var11];
								++var11;
							} while (ff.int_a > var11);
						}

						if (var12 == 0) {
							return var3;
						}
					}

					var11 = 0;
					if (var12 != 0 || ~ff.int_a < ~var11) {
						do {
							var8[var11] = var5[var11];
							var9[var11] = var6[var11];
							var10[var11] = var7[var11];
							++var11;
						} while (~ff.int_a < ~var11);
					}
				}

				return var3;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "oa.E(" + var1 + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			lf_db = null;
			S = null;
			lf_bb = null;
			X = null;
			int var1 = 31 % ((-62 - var0) / 34);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "oa.I(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, lf var2) {
		int var8 = client.int_gc;

		try {
			++T;
			lf var3 = var2.d(true).e(true);
			boolean var4 = false;
			int var5 = -107 / ((50 - var0) / 43);
			int var6 = 0;
			if (var8 != 0 || var6 < r.Y) {
				do {
					u var7 = w.us_e[nd.ints_k[var6]];
					if (var7 != null && var7.Dc != null && var7.Dc.a((byte) -121, var3)) {
						var4 = true;
						fd.a(0, 1, 1, var7.ints_db[0], 0, 2, r.X.xb[0], r.X.ints_db[0], false, var7.xb[0], 0, 0);
						if (~var1 != -2) {
							if (~var1 != -5) {
								if (~var1 == -7) {
									vg.J.e((byte) 95, 8);
									++gg.int_a;
									vg.J.h(nd.ints_k[var6], 128);
									if (var8 == 0) {
										break;
									}
								}

								if (var1 != 7) {
									break;
								}

								++vf.L;
								vg.J.e((byte) 107, 222);
								vg.J.c((int) 9698, nd.ints_k[var6]);
								if (var8 == 0) {
									break;
								}
							}

							vg.J.e((byte) 104, 12);
							++wg.int_i;
							vg.J.f(1174839336, nd.ints_k[var6]);
							if (var8 == 0) {
								break;
							}
						}

						vg.J.e((byte) 111, 121);
						++eh.int_j;
						vg.J.b(nd.ints_k[var6], true);
						if (var8 == 0) {
							break;
						}
					}

					++var6;
				} while (var6 < r.Y);
			}

			if (!var4) {
				kd.a(sh.Gb, false, de.a(new lf[]{od.U, var3}, -46), 0);
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "oa.H(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label61:
			{
				label62:
				{
					label63:
					{
						if (var2 != 0) {
							if (~var2 == -2) {
								break label63;
							}

							if (~var2 != -3) {
								break label61;
							}

							if (var5 == 0) {
								break label62;
							}
						}

						this.boolean_gb = var3.j((byte) 107) == 1;
						if (var5 == 0) {
							break label61;
						}
					}

					this.W = var3.j((byte) 87) == 1;
					if (var5 == 0) {
						break label61;
					}
				}

				super.x = ~var3.j((byte) 122) == -2;
			}

			if (var1 > -120) {
				d((byte) 2);
			}

			++Q;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "oa.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		X = lf_db;
		U = 0;
		Y = 7759444;
	}
}
