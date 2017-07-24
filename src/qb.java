final class qb extends j {

	static ja[] Q;
	private static lf R = dd.a("Enter your username (V password)3", 2);
	static int S;
	static bg T;
	private int U;
	static int V;
	static int W;
	static lf X;
	static lf Y;
	static int Z;
	static int int_ab;
	private int int_bb;
	static ja ja_cb;
	static int int_db;
	static int int_eb;
	private int int_fb = -1;
	private int[] ints_gb;
	static int[][] ints_hb;

	private final boolean e(int var1) {
		try {
			if (var1 != 4080) {
				return true;
			} else {
				++int_eb;
				if (this.ints_gb != null) {
					return true;
				} else if (~this.int_fb <= -1) {
					int var2 = ma.aa_q.a(this.int_fb, -118) ? 64 : 128;
					this.ints_gb = ma.aa_q.b(this.int_fb, false);
					this.int_bb = var2;
					this.U = var2;
					return this.ints_gb != null;
				} else {
					return false;
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "qb.R(" + var1 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			if (var2 == 0) {
				this.int_fb = var3.b(true);
			}

			if (var1 > -120) {
				this.e(102);
			}

			++S;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "qb.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final int b(int var1) {
		try {
			++int_ab;
			if (var1 != 24649) {
				this.b(15);
			}

			return this.int_fb;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "qb.Q(" + var1 + ')');
		}
	}

	public qb() {
		super(0, false);
	}

	final int[][] b(int var1, int var2) {
		int var11 = client.int_gc;

		try {
			++int_db;
			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w && this.e(4080)) {
				label57:
				{
					int var4 = (~dg.int_p != ~this.U ? this.U * var1 / dg.int_p : var1) * this.int_bb;
					int[] var6 = var3[1];
					int[] var5 = var3[0];
					int[] var7 = var3[2];
					int var8;
					int var9;
					if (this.int_bb == ff.int_a) {
						var8 = 0;
						if (var11 != 0 || var8 < ff.int_a) {
							do {
								var9 = this.ints_gb[var4++];
								var7[var8] = sd.a(255, var9) << 1659107364;
								var6[var8] = sd.a(var9, '\uff00') >> -1904089020;
								var5[var8] = sd.a(4080, var9 >> -509110644);
								++var8;
							} while (var8 < ff.int_a);
						}

						if (var11 == 0) {
							break label57;
						}
					}

					var8 = 0;
					if (var11 != 0 || ~ff.int_a < ~var8) {
						do {
							var9 = this.int_bb * var8 / ff.int_a;
							int var10 = this.ints_gb[var4 - -var9];
							var7[var8] = sd.a(255, var10) << -498637340;
							var6[var8] = sd.a(var10 >> 1227295300, 4080);
							var5[var8] = sd.a(16711680, var10) >> -1732961588;
							++var8;
						} while (~ff.int_a < ~var8);
					}
				}
			}

			if (var2 != 2177) {
				this.U = 61;
			}

			return var3;
		} catch (RuntimeException var12) {
			throw ec.a(var12, "qb.E(" + var1 + ',' + var2 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			if (!var0) {
				R = null;
				Q = null;
				ja_cb = null;
				T = null;
				X = null;
				ints_hb = null;
				Y = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "qb.P(" + var0 + ')');
		}
	}

	static {
		X = R;
		W = 0;
		Y = dd.a("<col=ffb000>", 2);
		Q = new ja[2048];
		ints_hb = new int[104][104];
	}
}
