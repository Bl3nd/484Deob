final class tb extends j {

	private static lf Q = dd.a("You can(Wt add yourself to your own friend list)3", 2);
	private int R = 585;
	static int S;
	static int T;
	static lf U;
	static tf V;
	static lf W;
	static int X;
	static int Y;
	static lf Z;
	static bg bg_ab;
	static int int_bb;
	static int int_cb;
	static int int_db;
	private static lf lf_eb;
	static int int_fb;

	final void a(byte var1, int var2, ja var3) {
		try {
			if (var1 >= -120) {
				this.a((byte) -111, -89, (ja) null);
			}

			++T;
			if (var2 == 0) {
				this.R = var3.b(true);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "tb.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final he c(int var0, int var1) {
		try {
			++Y;
			he var2 = (he) ie.Mb.a((long) var1, (int) -100);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = pd.y.a(0, var1, 16);
				var2 = new he();
				if (var3 != null) {
					var2.a(0, new ja(var3));
				}

				ie.Mb.a((long) var1, -125, var2);
				if (var0 > -50) {
					Q = null;
				}

				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "tb.B(" + var0 + ',' + var1 + ')');
		}
	}

	public static void e(int var0) {
		try {
			lf_eb = null;
			bg_ab = null;
			int var1 = -58 / ((var0 - 12) / 40);
			U = null;
			Q = null;
			W = null;
			Z = null;
			V = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "tb.A(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var8 = client.int_gc;

		try {
			int[] var3 = super.H.a(-314, var2);
			if (var1 > -49) {
				return null;
			} else {
				++S;
				if (super.H.boolean_v) {
					int var4 = fc.G[var2];
					int var5 = 0;
					if (var8 != 0 || var5 < ff.int_a) {
						do {
							label109:
							{
								int var6 = ef.ints_m[var5];
								int var7;
								if (~this.R > ~var6 && var6 < 4096 + -this.R && ~(2048 - this.R) > ~var4 && ~(this.R + 2048) < ~var4) {
									var7 = 2048 - var6;
									var7 = var7 < 0 ? -var7 : var7;
									var7 <<= 12;
									var7 /= -this.R + 2048;
									var3[var5] = -var7 + 4096;
									if (var8 == 0) {
										break label109;
									}
								}

								if (~var6 < ~(2048 + -this.R) && ~var6 > ~(2048 + this.R)) {
									var7 = -2048 + var4;
									var7 = ~var7 <= -1 ? var7 : -var7;
									var7 -= this.R;
									var7 <<= 12;
									var3[var5] = var7 / (2048 + -this.R);
									if (var8 == 0) {
										break label109;
									}
								}

								if (this.R > var4 || -this.R + 4096 < var4) {
									var7 = var6 - 2048;
									var7 = ~var7 > -1 ? -var7 : var7;
									var7 -= this.R;
									var7 <<= 12;
									var3[var5] = var7 / (-this.R + 2048);
									if (var8 == 0) {
										break label109;
									}
								}

								if (~var6 > ~this.R || var6 > 4096 + -this.R) {
									var7 = -var4 + 2048;
									var7 = var7 < 0 ? -var7 : var7;
									var7 <<= 12;
									var7 /= -this.R + 2048;
									var3[var5] = 4096 + -var7;
									if (var8 == 0) {
										break label109;
									}
								}

								var3[var5] = 0;
							}

							++var5;
						} while (var5 < ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "tb.G(" + var1 + ',' + var2 + ')');
		}
	}

	public tb() {
		super(0, true);
	}

	static {
		U = Q;
		W = dd.a("und haben es deaktiviert)3 Klicken Sie auf der", 2);
		V = new tf();
		int_cb = 0;
		lf_eb = dd.a("Connection lost)3", 2);
		Z = lf_eb;
		int_db = 0;
		int_fb = 0;
	}
}
