import java.util.Calendar;

final class cc extends j {

	static int Q;
	private int R = 0;
	static int S;
	static int T;
	static int[] U = new int[]{16, 32, 64, 128};
	static int V;
	private int W = 4096;
	static int[][] X;
	static int Y;
	static Calendar Z = Calendar.getInstance();
	static int int_ab;
	static int[] ints_bb = new int[128];
	static int int_cb;
	static int int_db;
	static lf lf_eb = dd.a("ams", 2);
	static int int_fb = 0;
	static bg cache7;//bg_gb

	static final lf a(vg var0, byte var1, int var2) {
		try {
			++V;
			if (!q.c(ne.a(var0, 99), var2, 255) && var0.U == null) {
				return null;
			} else {
				if (var1 <= 99) {
					a((vg) null, (byte) -51, -104);
				}

				return var0.lfs_cb != null && ~var2 > ~var0.lfs_cb.length && var0.lfs_cb[var2] != null && var0.lfs_cb[var2].a((byte) 62).e(-30593) != 0 ? var0.lfs_cb[var2] : (ra.Y ? de.a(new lf[]{u.Ac, fa.a((byte) 85, var2)}, 122) : null);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "cc.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	public cc() {
		super(1, true);
	}

	static final void a(int var0, lf var1, lf var2, boolean var3, bg var4, int var5) {
		try {
			if (var5 != 0) {
				int_fb = -78;
			}

			++int_ab;
			int var6 = var4.a((byte) 106, var1);
			int var7 = var4.a((byte) -39, var2, var6);
			be.a(var7, var5 + -114, var0, var6, var3, var4);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "cc.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			if (var1 >= -120) {
				lf_eb = null;
			}

			label33:
			{
				label32:
				{
					if (var2 != 0) {
						if (var2 != 1) {
							break label33;
						}

						if (var5 == 0) {
							break label32;
						}
					}

					this.R = var3.b(true);
					if (var5 == 0) {
						break label33;
					}
				}

				this.W = var3.b(true);
			}

			++Y;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "cc.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void d(byte var0) {
		try {
			X = null;
			Z = null;
			U = null;
			if (var0 != -85) {
				X = null;
			}

			ints_bb = null;
			cache7 = null;
			lf_eb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "cc.C(" + var0 + ')');
		}
	}

	static final void e(byte var0) {
		try {
			++int_db;
			ob.rc_b.c(-51);
			hg.rc_n.c(var0 + 48);
			me.rc_q.c(-51);
			me.rc_v.c(var0 ^ 80);
			wh.rc_i.c(-51);
			if (var0 != -99) {
				a(99, (lf) null, (lf) null, true, (bg) null, 66);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "cc.H(" + var0 + ')');
		}
	}

	static int c(int var0, int var1) {
		try {
			return var0 ^ var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "cc.D(" + var0 + ',' + var1 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var7 = client.int_gc;

		try {
			++T;
			if (var1 > -49) {
				return null;
			} else {
				int[] var3 = super.H.a(-314, var2);
				if (super.H.boolean_v) {
					int[] var4 = this.a((int) var2, -125, 0);
					int var5 = 0;
					if (var7 != 0 || ~var5 > ~ff.int_a) {
						do {
							int var6 = var4[var5];
							var3[var5] = ~var6 <= ~this.R && ~this.W <= ~var6 ? 4096 : 0;
							++var5;
						} while (~var5 > ~ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "cc.G(" + var1 + ',' + var2 + ')');
		}
	}
}
