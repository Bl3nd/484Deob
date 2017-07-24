final class m extends j {

	static int Q;
	static int R;
	static lf S;
	private int T = 0;
	private int U;
	static boolean V = true;
	private int W;
	static int X;
	static lf Y;
	static lf sl_stars;
	private static lf lf_ab = dd.a(" seconds)3", 2);
	private int int_bb = 0;
	private int int_cb;
	static int int_db;
	private int int_eb;
	private int int_fb;
	private int int_gb = 0;
	private int int_hb;
	static int int_ib;

	static final int a(byte var0, int var1) {
		try {
			if (var0 != -33) {
				lf_ab = null;
			}

			++X;
			return (1034149 & var1) >> -1306297103;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "m.D(" + var0 + ',' + var1 + ')');
		}
	}

	public m() {
		super(1, false);
	}

	public static void e(int var0) {
		try {
			Y = null;
			int var1 = -96 % ((-74 - var0) / 39);
			sl_stars = null;
			lf_ab = null;
			S = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "m.A(" + var0 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var12 = client.int_gc;

		try {
			++Q;
			if (var2 != 2177) {
				this.W = -51;
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int[][] var4 = this.a(false, var1, 0);
				int[] var5 = var4[0];
				int[] var6 = var4[1];
				int[] var8 = var3[0];
				int[] var7 = var4[2];
				int[] var10 = var3[2];
				int[] var9 = var3[1];
				int var11 = 0;
				if (var12 != 0 || ~ff.int_a < ~var11) {
					do {
						this.a(var7[var11], true, var6[var11], var5[var11]);
						this.U += this.int_bb;
						if (var12 != 0) {
							this.U += 4096;
						}

						while (~this.U > -1) {
							this.U += 4096;
						}

						this.int_fb += this.T;
						this.W += this.int_gb;
						if (this.W < 0) {
							this.W = 0;
						}

						if (~this.int_fb > -1) {
							this.int_fb = 0;
							if (var12 != 0) {
								this.U -= 4096;
							}
						}

						while (~this.U < -4097) {
							this.U -= 4096;
						}

						if (this.W > 4096) {
							this.W = 4096;
						}

						if (~this.int_fb < -4097) {
							this.int_fb = 4096;
						}

						this.a(this.W, this.int_fb, (byte) 120, this.U);
						var8[var11] = this.int_hb;
						var9[var11] = this.int_cb;
						var10[var11] = this.int_eb;
						++var11;
					} while (~ff.int_a < ~var11);
				}
			}

			return var3;
		} catch (RuntimeException var13) {
			throw ec.a(var13, "m.E(" + var1 + ',' + var2 + ')');
		}
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
						++R;
						if (var2 != 0) {
							if (~var2 == -2) {
								break label39;
							}

							if (var2 != 2) {
								break label41;
							}

							if (var5 == 0) {
								break label40;
							}
						}

						this.int_bb = var3.c(true);
						if (var5 == 0) {
							break label41;
						}
					}

					this.T = (var3.m(3) << -1516865236) / 100;
					if (var5 == 0) {
						break label41;
					}
				}

				this.int_gb = (var3.m(3) << 728772716) / 100;
			}

			if (var1 > -120) {
				this.a((byte) 65, -7, (ja) null);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "m.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final void a(int var1, int var2, byte var3, int var4) {
		try {
			if (var3 <= 76) {
				this.int_cb = 10;
			}

			++int_ib;
			int var5 = ~var1 >= -2049 ? var1 * (4096 - -var2) >> 1072949324 : -(var2 * var1 >> 356903852) + var2 + var1;
			if (~var5 < -1) {
				int var6 = -var5 + var1 + var1;
				int var7 = (-var6 + var5 << -330793908) / var5;
				var4 *= 6;
				int var8 = var4 >> -1750960116;
				int var9 = -(var8 << -1900617396) + var4;
				int var10 = var5 * var7 >> 836147020;
				var10 = var9 * var10 >> 1785226892;
				int var11 = var6 - -var10;
				int var12 = -var10 + var5;
				if (~var8 != -1) {
					if (~var8 == -2) {
						this.int_hb = var12;
						this.int_eb = var6;
						this.int_cb = var5;
						return;
					}

					if (~var8 == -3) {
						this.int_eb = var11;
						this.int_cb = var5;
						this.int_hb = var6;
						return;
					}

					if (var8 == 3) {
						this.int_hb = var6;
						this.int_eb = var5;
						this.int_cb = var12;
						return;
					}

					if (~var8 == -5) {
						this.int_cb = var6;
						this.int_hb = var11;
						this.int_eb = var5;
						return;
					}

					if (var8 != 5) {
						return;
					}

					if (client.int_gc == 0) {
						this.int_hb = var5;
						this.int_cb = var6;
						this.int_eb = var12;
						return;
					}
				}

				this.int_eb = var6;
				this.int_hb = var5;
				this.int_cb = var11;
			} else {
				this.int_hb = this.int_cb = this.int_eb = var1;
			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "m.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	private final void a(int var1, boolean var2, int var3, int var4) {
		int var11 = client.int_gc;

		try {
			if (!var2) {
				a((byte) -117, 41);
			}

			++int_db;
			int var5 = ~var3 > ~var4 ? var4 : var3;
			var5 = ~var1 >= ~var5 ? var5 : var1;
			int var6 = var3 <= var4 ? var3 : var4;
			var6 = ~var6 >= ~var1 ? var6 : var1;
			int var7 = var5 + -var6;
			this.W = (var5 + var6) / 2;
			if (var7 > 0) {
				if (~this.W < -1 && this.W < 4096) {
					this.int_fb = (var7 << -1160563412) / (~this.W >= -2049 ? this.W * 2 : -(2 * this.W) + 8192);
				}

				label82:
				{
					int var8 = (var5 - var4 << 485167532) / var7;
					int var9 = (var5 + -var3 << -380301652) / var7;
					int var10 = (-var1 + var5 << 843433772) / var7;
					if (~var5 == ~var4) {
						this.U = var3 == var6 ? 20480 - -var10 : -var9 + 4096;
						if (var11 == 0) {
							break label82;
						}
					}

					if (var5 == var3) {
						this.U = var6 != var1 ? 12288 - var10 : var8 + 4096;
						if (var11 == 0) {
							break label82;
						}
					}

					this.U = ~var4 == ~var6 ? 12288 - -var9 : -var8 + 20480;
				}

				this.U /= 6;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "m.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static {
		S = lf_ab;
		Y = dd.a("RuneScape wurde aktualisiert(Q", 2);
		sl_stars = dd.a("sl_stars", 2);
	}
}
