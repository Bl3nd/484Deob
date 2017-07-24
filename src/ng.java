final class ng extends ph {

	static lf G;
	private int H = 0;
	static jg I;
	static int J;
	static int K;
	int L;
	static int M;
	private static lf N = dd.a("Loaded config", 2);
	static int O;
	static lf P = dd.a("Der Server wird gerade aktualisiert)3", 2);
	int Q;
	int R;
	static int S;
	static int T;
	int U;
	static int V;
	static int W;
	static int X;
	static int Y;
	private int Z = -1;
	static boolean boolean_ab;
	static long[] longs_bb;
	static int[][] ints_cb;
	static df df_db;

	static ie a(int var0, int var1) {
		try {
			++Y;
			ie var2 = (ie) fh.rc_a.a((long) var0, -126);
			if (var2 != null) {
				return var2;
			} else {
				if (var1 != -4) {
					a(117, -125);
				}

				byte[] var3 = ig.bg_p.a(0, var0, 10);
				var2 = new ie();
				var2.P = var0;
				if (var3 != null) {
					var2.a(new ja(var3), (byte) -95);
				}

				var2.c(var1 + 20049);
				if (~var2.int_ub != 0) {
					var2.a(a(var2.R, -4), a(var2.int_ub, -4), (byte) -85);
				}

				if (!lf.z && var2.S) {
					var2.Jb = false;
					var2.Cb = 0;
					var2.Db = null;
					var2.U = va.lf_eb;
					var2.Fb = null;
				}

				fh.rc_a.a((long) var0, -118, var2);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ng.F(" + var0 + ',' + var1 + ')');
		}
	}

	private final void a(int var1, byte var2, int var3, ja var4) {
		int var6 = client.int_gc;

		try {
			label38:
			{
				++V;
				if (~var1 != -2) {
					if (var1 == 2) {
						this.Z = var4.b(true);
						if (this.Z != '\uffff') {
							break label38;
						}

						this.Z = -1;
						if (var6 == 0) {
							break label38;
						}
					}

					if (~var1 != -4) {
						break label38;
					}

					var4.b(true);
					if (var6 == 0) {
						break label38;
					}
				}

				this.H = var4.f((byte) 59);
				this.a(this.H, (byte) 125);
			}

			if (var2 != -121) {
				this.a(19, (byte) 65);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ng.B(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(ja var1, byte var2, int var3) {
		int var5 = client.int_gc;

		try {
			++J;

			do {
				int var4 = var1.j((byte) 75);
				if (var4 == 0) {
					break;
				}

				this.a(var4, (byte) -121, var3, var1);
			} while (var5 == 0);

			if (var2 <= 26) {
				M = -69;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ng.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			longs_bb = null;
			I = null;
			N = null;
			G = null;
			ints_cb = null;
			if (!var0) {
				a(null, -124, 74, -39);
			}

			df_db = null;
			P = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ng.C(" + var0 + ')');
		}
	}

	private final void a(int var1, byte var2) {
		int var20 = client.int_gc;

		try {
			++O;
			double var7 = (double) (var1 & 255) / 256.0D;
			double var5 = (double) (('＜' & var1) >> 8) / 256.0D;
			double var3 = (double) (var1 >> 16 & 255) / 256.0D;
			double var11 = var3;
			double var9 = var3;
			double var13 = 0.0D;
			if (var3 < var5) {
				var11 = var5;
			}

			double var15 = 0.0D;
			if (var11 < var7) {
				var11 = var7;
			}

			if (var5 < var3) {
				var9 = var5;
			}

			if (var9 > var7) {
				var9 = var7;
			}

			double var17 = (var11 + var9) / 2.0D;
			this.Q = (int) (256.0D * var17);
			if (var11 != var9) {
				if (var17 < 0.5D) {
					var15 = (var11 - var9) / (var11 + var9);
				}

				label89:
				{
					if (var11 == var3) {
						var13 = (-var7 + var5) / (var11 - var9);
						if (var20 == 0) {
							break label89;
						}
					}

					if (var11 == var5) {
						var13 = 2.0D + (-var3 + var7) / (var11 - var9);
						if (var20 == 0) {
							break label89;
						}
					}

					if (var11 == var7) {
						var13 = 4.0D + (var3 - var5) / (-var9 + var11);
					}
				}

				if (var17 >= 0.5D) {
					var15 = (var11 - var9) / (-var11 + 2.0D - var9);
				}
			}

			label65:
			{
				var13 /= 6.0D;
				int var19 = 84 / ((63 - var2) / 60);
				if (~this.Q <= -1) {
					if (this.Q <= 255) {
						break label65;
					}

					this.Q = 255;
					if (var20 == 0) {
						break label65;
					}
				}

				this.Q = 0;
			}

			label58:
			{
				if (var17 > 0.5D) {
					this.L = (int) (var15 * (1.0D - var17) * 512.0D);
					if (var20 == 0) {
						break label58;
					}
				}

				this.L = (int) (var17 * var15 * 512.0D);
			}

			this.U = (int) (var15 * 256.0D);
			if (this.L < 1) {
				this.L = 1;
			}

			label52:
			{
				if (this.U < 0) {
					this.U = 0;
					if (var20 == 0) {
						break label52;
					}
				}

				if (this.U > 255) {
					this.U = 255;
				}
			}

			this.R = (int) (var13 * (double) this.L);
		} catch (RuntimeException var21) {
			throw ec.a(var21, "ng.A(" + var1 + ',' + var2 + ')');
		}
	}

	static boolean a(byte[] var0, int var1, int var2, int var3) {
		try {
			++T;
			if (var1 > -43) {
				ints_cb = null;
			}

			boolean var4 = true;
			ja class_ja = new ja(var0);
			int var6 = -1;

			do {
				int var7 = class_ja.h((byte) -107);
				if (var7 == 0) {
					break;
				}

				var6 += var7;
				int var8 = 0;
				boolean var9 = false;

				while (true) {
					int var10;
					if (var9) {
						var10 = class_ja.f(0);
						if (var10 == 0) {
							break;
						}

						class_ja.j((byte) 74);
					} else {
						var10 = class_ja.f(0);
						if (var10 == 0) {
							break;
						}

						int var13 = class_ja.j((byte) 126) >> 2;
						var8 += -1 + var10;
						int var12 = (var8 & 4068) >> 6;
						int var11 = 63 & var8;
						int var15 = var2 + var11;
						int var14 = var12 - -var3;
						if (~var14 < -1 && var15 > 0 && ~var14 > -104 && ~var15 > -104) {
							i var16 = pa.a(var6, 0);
							if (~var13 != -23 || !tf.boolean_q || var16.int_lb != 0 || var16.V == 1 || var16.boolean_kb) {
								var9 = true;
								if (!var16.e(-81)) {
									var4 = false;
									++pb.int_h;
								}
							}
						}
					}
				}
			} while (true);

			return var4;
		} catch (RuntimeException var18) {
			throw ec.a(var18, "ng.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static {
		G = N;
		boolean_ab = false;
		I = new jg(0, 0);
		longs_bb = new long[256];
		ints_cb = new int[5][5000];

		for (int var2 = 0; var2 < 256; ++var2) {
			long var0 = (long) var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var0 & 1L) != 1L) {
					var0 >>>= 1;
				} else {
					var0 = var0 >>> 1 ^ -3932672073523589310L;
				}
			}

			longs_bb[var2] = var0;
		}

	}
}
