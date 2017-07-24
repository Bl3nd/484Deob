import java.awt.Frame;

final class ce extends j {

	static int Q;
	static int R = 0;
	private int S = 4096;
	static lf T = dd.a("Bitte wenden Sie sich an den Kundendienst)3", 2);
	static lf U = dd.a("Startseite auf (WSpielkonto wiederherstellen(W)3", 2);
	private int V = 4096;
	static int W;
	static int X;
	private int Y = 4096;
	static Frame Z;
	static int int_ab;

	static void c(int var0, int var1, int var2) {
		try {
			if (var1 < 38) {
				c(82, 74, 117);
			}

			++X;
			if (ua.a(false, var2)) {
				wg.a(-4019, sc.vgs_db[var2], var0);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ce.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public ce() {
		super(1, false);
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label41:
			{
				label40:
				{
					label39:
					{
						if (~var2 != -1) {
							if (var2 == 1) {
								break label39;
							}

							if (~var2 != -3) {
								break label41;
							}

							if (var5 == 0) {
								break label40;
							}
						}

						this.Y = var3.b(true);
						if (var5 == 0) {
							break label41;
						}
					}

					this.V = var3.b(true);
					if (var5 == 0) {
						break label41;
					}
				}

				this.S = var3.b(true);
			}

			if (var1 >= -120) {
				c(-70, -28, -46);
			}

			++W;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ce.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var15 = client.int_gc;

		try {
			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (var2 != 2177) {
				return null;
			} else {
				if (super.jh_q.boolean_w) {
					int[][] var4 = this.a(false, var1, 0);
					int[] var6 = var4[1];
					int[] var5 = var4[0];
					int[] var7 = var4[2];
					int[] var8 = var3[0];
					int[] var10 = var3[2];
					int[] var9 = var3[1];
					int var11 = 0;
					if (var15 != 0 || ~ff.int_a < ~var11) {
						do {
							label46:
							{
								int var12 = var5[var11];
								int var13 = var7[var11];
								int var14 = var6[var11];
								if (~var12 != ~var13 || var14 != var13) {
									var8[var11] = this.Y;
									var9[var11] = this.V;
									var10[var11] = this.S;
									if (var15 == 0) {
										break label46;
									}
								}

								var8[var11] = var12 * this.Y >> -2053245396;
								var9[var11] = this.V * var13 >> 1312451404;
								var10[var11] = this.S * var14 >> -139387796;
							}

							++var11;
						} while (~ff.int_a < ~var11);
					}
				}

				++int_ab;
				return var3;
			}
		} catch (RuntimeException var16) {
			throw ec.a(var16, "ce.E(" + var1 + ',' + var2 + ')');
		}
	}

	static void a() {
		for (int height = 0; height < ec.int_bb; ++height) {
			for (int x = 0; x < l.int_l; ++x) {
				for (int y = 0; y < ge.int_c; ++y) {
					i.Ib[height][x][y] = null;
				}
			}
		}

		for (int height = 0; height < l.int_n; ++height) {
			for (int var2 = 0; var2 < l.ints_e[height]; ++var2) {
				l.rgs_j[height][var2] = null;
			}

			l.ints_e[height] = 0;
		}

		for (int var2 = 0; var2 < ug.int_bb; ++var2) {
			n.eds_m[var2] = null;
		}

		ug.int_bb = 0;

		for (int var3 = 0; var3 < f.eds_bb.length; ++var3) {
			f.eds_bb[var3] = null;
		}
	}

	public static void b(boolean var0) {
		try {
			if (var0) {
				a(-116, 69, -40, -68);
			}

			T = null;
			Z = null;
			U = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ce.D(" + var0 + ')');
		}
	}

	static boolean a(int var0, int var1, int var2, int var3) {
		if (!vh.a(var0, var1, var2)) {
			return false;
		} else {
			int var4 = var1 << 7;
			int var5 = var2 << 7;
			return a.a(var4 + 1, ch.ints_g[var0][var1][var2] + var3, var5 + 1) && a.a(var4 + 128 - 1, ch.ints_g[var0][var1 + 1][var2] + var3, var5 + 1) && a.a(var4 + 128 - 1, ch.ints_g[var0][var1 + 1][var2 + 1] + var3, var5 + 128 - 1) && a.a(var4 + 1, ch.ints_g[var0][var1][var2 + 1] + var3, var5 + 128 - 1);
		}
	}
}
