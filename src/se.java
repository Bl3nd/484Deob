final class se extends j {

	static int Q;
	static int[] R = new int[99];
	private int S = 3216;
	private int[] T = new int[3];
	static int U;
	static int V;
	private int W = 3216;
	static int X;
	static int Y;
	static lf Z = dd.a("Bitte warten Sie eine Minute", 2);
	private int int_ab = 4096;
	static lf lf_bb = dd.a("Zu viele Anmelde)2Versuche von Ihrer Adresse", 2);
	static int int_cb;
	static oh cache5;//oh_db
	static lf lf_eb = dd.a("blinken1:", 2);
	static int int_fb;
	static int int_gb = 0;
	static int[] ints_hb;
	static bg cache13;//bg_ib
	static lf fpsonCommand;//lf_jb
	static lf lf_kb;
	static lf lf_lb;

	public se() {
		super(1, true);
	}

	final void c(int var1) {
		try {
			if (var1 == 25614) {
				this.d((byte) 127);
				++Y;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "se.M(" + var1 + ')');
		}
	}

	private final void d(byte var1) {
		try {
			++U;
			double var2 = Math.cos((double) (this.S / 4096));
			this.T[0] = (int) (4096.0D * var2 * Math.sin((double) (this.W / 4096)));
			this.T[1] = (int) (4096.0D * Math.cos((double) (this.W / 4096)) * var2);
			this.T[2] = (int) (4096.0D * Math.sin((double) (this.S / 4096)));
			int var6 = this.T[2] * this.T[2] >> 205026508;
			int var4 = this.T[0] * this.T[0] >> 958356524;
			int var5 = this.T[1] * this.T[1] >> 1788323116;
			if (var1 >= 94) {
				int var7 = (int) (Math.sqrt((double) (var6 + var4 + var5 >> 268798444)) * 4096.0D);
				if (var7 != 0) {
					this.T[1] = (this.T[1] << 1247397484) / var7;
					this.T[0] = (this.T[0] << 1952045420) / var7;
					this.T[2] = (this.T[2] << 1363268268) / var7;
				}
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "se.B(" + var1 + ')');
		}
	}

	static final void e(int var0) {
		try {
			dd.W = 0;
			++V;
			int var1 = fb.int_m + (r.X.int_fb >> 989749223);
			int var2 = ea.int_h + (r.X.int_nc >> -1902225977);
			int var3 = -102 / ((40 - var0) / 58);
			if (~var1 <= -3054 && ~var1 >= -3157 && var2 >= 3056 && ~var2 >= -3137) {
				dd.W = 1;
			}

			if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
				dd.W = 1;
			}

			if (~dd.W == -2 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
				dd.W = 0;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "se.C(" + var0 + ')');
		}
	}

	static final void c(int var0, int var1, int var2) {
		try {
			++Q;
			tf var3 = vh.tfs_h[hc.int_pb][var0][var2];
			if (var3 == null) {
				i.a(hc.int_pb, var0, var2);
			} else {
				if (var1 != -28592) {
					f(56);
				}

				int var4 = -99999999;
				hc var6 = (hc) var3.c(80);

				hc var5;
				for (var5 = null; var6 != null; var6 = (hc) var3.d(-1)) {
					ie var7 = ng.a(var6.int_jb, (int) -4);
					int var8 = var7.int_jb;
					if (var7.L == 1) {
						var8 *= 1 + var6.int_bb;
					}

					if (var8 > var4) {
						var4 = var8;
						var5 = var6;
					}
				}

				if (var5 == null) {
					i.a(hc.int_pb, var0, var2);
				} else {
					var3.a(var5, (byte) -69);
					var6 = (hc) var3.c(var1 + 28662);
					hc var12 = null;
					long var9 = (long) (1610612736 + var0 + (var2 << 1929022183));

					hc var13;
					for (var13 = null; var6 != null; var6 = (hc) var3.d(-1)) {
						if (var6.int_jb != var5.int_jb) {
							if (var12 == null) {
								var12 = var6;
							}

							if (~var12.int_jb != ~var6.int_jb && var13 == null) {
								var13 = var6;
							}
						}
					}

					ld.a(hc.int_pb, var0, var2, bh.a(64 + var2 * 128, false, hc.int_pb, 64 + var0 * 128), var5, var9, var12, var13);
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "se.D(" + var0 + ',' + var1 + ',' + var2 + ')');
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
						if (var2 != 0) {
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

						this.int_ab = var3.b(true);
						if (var5 == 0) {
							break label41;
						}
					}

					this.W = var3.b(true);
					if (var5 == 0) {
						break label41;
					}
				}

				this.S = var3.b(true);
			}

			if (var1 >= -120) {
				lf_kb = null;
			}

			++int_cb;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "se.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void f(int var0) {
		try {
			fpsonCommand = null;
			ints_hb = null;
			if (var0 == -1566999956) {
				lf_eb = null;
				lf_kb = null;
				lf_bb = null;
				Z = null;
				lf_lb = null;
				R = null;
				cache13 = null;
				cache5 = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "se.A(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var18 = client.int_gc;

		try {
			if (var1 > -49) {
				return null;
			} else {
				int[] var3 = super.H.a(-314, var2);
				if (super.H.boolean_v) {
					int[] var7 = this.a((int) (qb.Z & -1 + var2), 114, 0);
					int[] var8 = this.a((int) var2, 37, 0);
					int[] var9 = this.a((int) (var2 + 1 & qb.Z), 3, 0);
					int var10 = 0;
					if (var18 != 0 || ~ff.int_a < ~var10) {
						do {
							int var4;
							int var5;
							int var6;
							label23:
							{
								int var12 = this.int_ab * (-var8[-1 + var10 & ch.int_h] + var8[ch.int_h & 1 + var10]);
								int var11 = (-var7[var10] + var9[var10]) * this.int_ab;
								int var13 = var12 >> 616291308;
								int var14 = var11 >> -1277745012;
								int var15 = var13 * var13 >> -903421620;
								int var16 = var14 * var14 >> -18890036;
								int var17 = (int) (Math.sqrt((double) ((var15 - -var16 - -4096) / 4096)) * 4096.0D);
								if (var17 == 0) {
									var5 = 0;
									var4 = 0;
									var6 = 0;
									if (var18 == 0) {
										break label23;
									}
								}

								var6 = 16777216 / var17;
								var5 = var11 / var17;
								var4 = var12 / var17;
							}

							var4 = this.T[0] * var4 >> -1566999956;
							var6 = this.T[2] * var6 >> 2025753516;
							var5 = var5 * this.T[1] >> -1694265460;
							var3[var10] = var4 - (-var5 - var6);
							++var10;
						} while (~ff.int_a < ~var10);
					}
				}

				++int_fb;
				return var3;
			}
		} catch (RuntimeException var19) {
			throw ec.a(var19, "se.G(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 - -1;
			int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
			var0 += var3;
			R[var1] = var0 / 4;
		}

		ints_hb = new int[32];
		lf_kb = dd.a("", 2);
		lf_lb = dd.a(" )2>", 2);
		fpsonCommand = dd.a("::fpson", 2);
	}
}
