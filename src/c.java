final class c extends j {

	private int Q = 8192;
	static lf R = dd.a("weiss:", 2);
	private int S = 4096;
	static int[] T = new int[]{1, 2, 4, 8};
	static int U;
	static int V = -1;
	static int W;
	static int X = 0;
	static int Y;
	static int Z;
	private int int_ab = 0;
	static int int_bb = 0;
	private int int_cb = 0;
	static int[] ints_db;
	static int int_eb;
	static int int_fb;
	private int int_gb = 2048;
	private int int_hb = 2048;
	static int int_ib = 3353893;
	static int int_jb;
	static int int_kb;
	static int[] ints_lb = new int[4000];
	static int int_mb;
	private int int_nb = 12288;
	static int int_ob;

	static final void a(df var0, byte var1) {
		int var12 = client.int_gc;

		try {
			++int_fb;
			short var2 = 256;
			int var3 = 0;
			if (var12 != 0) {
				uf.ints_a[var3] = 0;
				++var3;
			}

			while (~var3 > ~uf.ints_a.length) {
				uf.ints_a[var3] = 0;
				++var3;
			}

			if (var1 > -81) {
				d((byte) -9);
			}

			int var4 = 0;
			int var5;
			if (var12 != 0 || ~var4 > -5001) {
				do {
					var5 = (int) (Math.random() * 128.0D * (double) var2);
					uf.ints_a[var5] = (int) (256.0D * Math.random());
					++var4;
				} while (~var4 > -5001);
			}

			var5 = 0;
			int var6;
			int var7;
			int var8;
			int[] var14;
			if (var12 != 0) {
				var6 = 1;
				if (var12 == 0 && -1 + var2 <= var6) {
					var14 = uf.ints_a;
					uf.ints_a = ai.ints_d;
					ai.ints_d = var14;
					++var5;
				} else {
					while (true) {
						var7 = 1;
						if (var12 == 0 && var7 >= 127) {
							++var6;
						} else {
							while (true) {
								var8 = (var6 << -1899555769) + var7;
								ai.ints_d[var8] = (uf.ints_a[var8 + 128] + uf.ints_a[var8 - 128] + uf.ints_a[var8 + 1] + uf.ints_a[-1 + var8]) / 4;
								++var7;
								if (var7 >= 127) {
									++var6;
									break;
								}
							}
						}

						if (-1 + var2 <= var6) {
							var14 = uf.ints_a;
							uf.ints_a = ai.ints_d;
							ai.ints_d = var14;
							++var5;
							break;
						}
					}
				}
			}

			while (var5 < 20) {
				var6 = 1;
				if (var12 == 0 && -1 + var2 <= var6) {
					var14 = uf.ints_a;
					uf.ints_a = ai.ints_d;
					ai.ints_d = var14;
					++var5;
				} else {
					do {
						var7 = 1;
						if (var12 == 0 && var7 >= 127) {
							++var6;
						} else {
							do {
								var8 = (var6 << -1899555769) + var7;
								ai.ints_d[var8] = (uf.ints_a[var8 + 128] + uf.ints_a[var8 - 128] + uf.ints_a[var8 + 1] + uf.ints_a[-1 + var8]) / 4;
								++var7;
							} while (var7 < 127);

							++var6;
						}
					} while (-1 + var2 > var6);

					var14 = uf.ints_a;
					uf.ints_a = ai.ints_d;
					ai.ints_d = var14;
					++var5;
				}
			}

			if (var0 != null) {
				var6 = 0;
				var7 = 0;
				if (var12 != 0 || ~var7 > ~var0.S) {
					do {
						var8 = 0;
						if (var12 == 0 && var0.N <= var8) {
							++var7;
						} else {
							do {
								if (var0.O[var6++] != 0) {
									int var10 = 16 + (var7 - -var0.T);
									int var9 = 16 + var8 + var0.P;
									int var11 = (var10 << -1847198553) + var9;
									uf.ints_a[var11] = 0;
								}

								++var8;
							} while (var0.N > var8);

							++var7;
						}
					} while (~var7 > ~var0.S);

				}
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "c.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			if (var1 > -120) {
				this.a((byte) 63, -71, (ja) null);
			}

			label68:
			{
				label67:
				{
					label66:
					{
						label65:
						{
							label64:
							{
								label63:
								{
									label62:
									{
										if (~var2 != -1) {
											if (var2 == 1) {
												break label62;
											}

											if (~var2 == -3) {
												break label63;
											}

											if (~var2 == -4) {
												break label64;
											}

											if (var2 == 4) {
												break label65;
											}

											if (var2 == 5) {
												break label66;
											}

											if (var2 != 6) {
												break label68;
											}

											if (var5 == 0) {
												break label67;
											}
										}

										this.int_hb = var3.b(true);
										if (var5 == 0) {
											break label68;
										}
									}

									this.int_ab = var3.b(true);
									if (var5 == 0) {
										break label68;
									}
								}

								this.int_cb = var3.b(true);
								if (var5 == 0) {
									break label68;
								}
							}

							this.int_gb = var3.b(true);
							if (var5 == 0) {
								break label68;
							}
						}

						this.int_nb = var3.b(true);
						if (var5 == 0) {
							break label68;
						}
					}

					this.S = var3.b(true);
					if (var5 == 0) {
						break label68;
					}
				}

				this.Q = var3.b(true);
			}

			++int_eb;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "c.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final boolean a(int var1, int var2, byte var3) {
		try {
			++Z;
			if (var3 > -17) {
				return false;
			} else {
				int var4 = this.int_nb * (var1 + var2) >> 1388020940;
				int var5 = lf.P[255 & 255 * var4 >> -1003121684];
				var5 = (var5 << 1663817740) / this.int_nb;
				var5 = (var5 << -790592724) / this.Q;
				var5 = this.S * var5 >> -207095220;
				return -var1 + var2 < var5 && ~(var2 - var1) < ~(-var5);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "c.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var11 = client.int_gc;

		try {
			int[] var3 = super.H.a(-314, var2);
			++int_mb;
			if (var1 >= -49) {
				return null;
			} else {
				if (super.H.boolean_v) {
					int var4 = fc.G[var2] - 2048;
					int var5 = 0;
					if (var11 != 0 || ~var5 > ~ff.int_a) {
						do {
							int var6 = ef.ints_m[var5] - 2048;
							int var8 = this.int_ab + var4;
							int var7 = var6 + this.int_hb;
							var7 = ~var7 <= 2047 ? var7 : 4096 + var7;
							int var10 = this.int_gb + var4;
							var7 = var7 > 2048 ? var7 + -4096 : var7;
							int var9 = var6 + this.int_cb;
							var10 = var10 < -2048 ? 4096 + var10 : var10;
							var10 = var10 <= 2048 ? var10 : var10 + -4096;
							var8 = var8 < -2048 ? var8 - -4096 : var8;
							var8 = var8 > 2048 ? -4096 + var8 : var8;
							var9 = ~var9 <= 2047 ? var9 : var9 - -4096;
							var9 = var9 > 2048 ? var9 + -4096 : var9;
							var3[var5] = !this.c(110, var8, var7) && !this.a(var9, var10, (byte) -40) ? 0 : 4096;
							++var5;
						} while (~var5 > ~ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "c.G(" + var1 + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			ints_db = null;
			if (var0 == 0) {
				T = null;
				ints_lb = null;
				R = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "c.B(" + var0 + ')');
		}
	}

	private final boolean c(int var1, int var2, int var3) {
		try {
			int var4 = this.int_nb * (-var3 + var2) >> -625614996;
			int var6 = 29 / ((41 - var1) / 54);
			++int_kb;
			int var5 = lf.P[255 & 255 * var4 >> 1557949772];
			var5 = (var5 << 1038493932) / this.int_nb;
			var5 = (var5 << 88562636) / this.Q;
			var5 = this.S * var5 >> -731371444;
			return var5 > var2 + var3 && ~(-var5) > ~(var2 + var3);
		} catch (RuntimeException var7) {
			throw ec.a(var7, "c.D(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public c() {
		super(0, true);
	}

	static final void c(int var0, int var1) {
		try {
			label19:
			{
				++int_jb;
				if (~ig.int_r != -1) {
					ag.int_a = var1;
					if (client.int_gc == 0) {
						break label19;
					}
				}

				gg.sh_n.a(var1, (byte) -34);
			}

			if (var0 != 7920) {
				d((byte) 92);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "c.C(" + var0 + ',' + var1 + ')');
		}
	}

	final void c(int var1) {
		try {
			td.b(127);
			if (var1 == 25614) {
				++W;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "c.M(" + var1 + ')');
		}
	}
}
