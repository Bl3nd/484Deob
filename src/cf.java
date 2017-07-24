import java.awt.FontMetrics;

final class cf {

	int int_a;
	byte[] bytes_b = new byte[18002];
	int[] ints_c = new int[257];
	boolean[] booleans_d = new boolean[16];
	int int_e;
	int int_f = 0;
	int int_g;
	int int_h = 0;
	static lf lf_i = dd.a("W-=hlen Sie eine Option", 2);
	int int_j;
	int int_k;
	byte byte_l;
	int int_m;
	static int int_n;
	int[] ints_o = new int[16];
	static int int_p;
	int int_q;
	static int int_r;
	int[][] ints_s = new int[6][258];
	byte[] bytes_t = new byte[4096];
	byte[] bytes_u;
	int[][] ints_v = new int[6][258];
	int[] ints_w = new int[6];
	static FontMetrics x;
	static lf y = dd.a("<col=ff3000>", 2);
	int z;
	int A;
	static int[] B = new int[100];
	boolean[] D = new boolean[256];
	byte[][] E = new byte[6][258];
	int[] F = new int[256];
	int[][] G = new int[6][258];
	int H;
	static int I;
	int J;
	static lf K;
	static boolean L = false;
	byte[] M;
	int N;
	byte[] O = new byte[18002];
	byte[] P = new byte[256];
	private static lf Q = dd.a("Walk here", 2);
	int R;

	public static void a(boolean var0) {
		try {
			B = null;
			x = null;
			if (!var0) {
				y = null;
			}

			lf_i = null;
			y = null;
			K = null;
			Q = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "cf.A(" + var0 + ')');
		}
	}

	static final int a(int var0, byte var1, int var2) {
		int var4 = client.int_gc;

		try {
			++I;
			if (var1 >= -127) {
				Q = null;
			}

			if (~var0 == 1) {
				return 12345678;
			} else if (~var0 == 0) {
				if (~var2 > -3) {
					var2 = 2;
					if (var4 == 0) {
						return var2;
					}
				}

				if (~var2 < -127) {
					var2 = 126;
				}

				return var2;
			} else {
				var2 = (var0 & 127) * var2 >> 256895591;
				if (var2 < 2) {
					var2 = 2;
					if (var4 == 0) {
						return (var0 & 'ﾀ') + var2;
					}
				}

				if (var2 > 126) {
					var2 = 126;
				}

				return (var0 & 'ﾀ') + var2;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "cf.D(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static final boolean a(int var0, boolean var1, int var2) {
		try {
			if (var0 == 11) {
				var0 = 10;
			}

			if (var0 >= 5 && var0 <= 8) {
				var0 = 4;
			}

			++int_p;
			i var3 = pa.a(var2, 0);
			if (!var1) {
				lf_i = null;
			}

			return var3.a(-42, var0);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "cf.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static final byte[] a(boolean var0, Object var1, byte var2) {
		try {
			++int_r;
			if (var1 == null) {
				return null;
			} else if (var1 instanceof byte[]) {
				byte[] var5 = (byte[]) var1;
				return !var0 ? var5 : ic.a((byte) 44, var5);
			} else if (var1 instanceof pg) {
				pg var3 = (pg) var1;
				return var3.b((byte) 118);
			} else {
				if (var2 != 87) {
					a(true, (Object) null, (byte) -115);
				}

				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "cf.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static final void a(ke var0, ja var1, int var2, int var3) {
		int var15 = client.int_gc;

		try {
			++int_n;
			uh var4 = new uh();
			var4.int_w = var1.j((byte) 96);
			var4.int_u = var1.l(15);
			var4.das_p = new da[var4.int_w];
			var4.bytes_v = new byte[var4.int_w][][];
			var4.B = new int[var4.int_w];
			var4.ints_q = new int[var4.int_w];
			var4.das_n = new da[var4.int_w];
			var4.A = new int[var4.int_w];
			int var5 = var2;
			if (var15 == 0 && var4.int_w <= var2) {
				wd.tf_jb.a(var4, (int) 0);
			} else {
				do {
					try {
						label116:
						{
							int var6 = var1.j((byte) 70);
							String var7;
							String var8;
							int var9;
							if (var6 != 0 && var6 != 1 && ~var6 != -3) {
								if (~var6 != -4 && var6 != 4) {
									break label116;
								}

								var7 = new String(var1.e((byte) 87).c((byte) 62));
								var8 = new String(var1.e((byte) 87).c((byte) 62));
								var9 = var1.j((byte) 82);
								String[] var10 = new String[var9];
								int var11 = 0;
								if (var15 != 0 || var9 > var11) {
									do {
										var10[var11] = new String(var1.e((byte) 87).c((byte) 62));
										++var11;
									} while (var9 > var11);
								}

								byte[][] var12 = new byte[var9][];
								int var14;
								if (var6 == 3) {
									int var13 = 0;
									if (var15 != 0 || ~var13 > ~var9) {
										do {
											var14 = var1.l(15);
											var12[var13] = new byte[var14];
											var1.a(var12[var13], 0, var14, 1174839336);
											++var13;
										} while (~var13 > ~var9);
									}
								}

								Class[] var22 = new Class[var9];
								var4.A[var5] = var6;
								var14 = 0;
								if (var15 != 0 || var9 > var14) {
									do {
										var22[var14] = client.b((byte) -63, var10[var14]);
										++var14;
									} while (var9 > var14);
								}

								var4.das_p[var5] = var0.a(var8, var22, client.b((byte) -63, var7), (byte) 121);
								var4.bytes_v[var5] = var12;
								if (var15 == 0) {
									break label116;
								}
							}

							var7 = new String(var1.e((byte) 87).c((byte) 62));
							var8 = new String(var1.e((byte) 87).c((byte) 62));
							var9 = 0;
							if (var6 == 1) {
								var9 = var1.l(15);
							}

							var4.A[var5] = var6;
							var4.B[var5] = var9;
							var4.das_n[var5] = var0.a(client.b((byte) -63, var7), var8, true);
						}
					} catch (ClassNotFoundException var16) {
						var4.ints_q[var5] = -1;
					} catch (SecurityException var17) {
						var4.ints_q[var5] = -2;
					} catch (NullPointerException var18) {
						var4.ints_q[var5] = -3;
					} catch (Exception var19) {
						var4.ints_q[var5] = -4;
					} catch (Throwable var20) {
						var4.ints_q[var5] = -5;
					}

					++var5;
				} while (var4.int_w > var5);

				wd.tf_jb.a(var4, (int) 0);
			}
		} catch (RuntimeException var21) {
			throw ec.a(var21, "cf.E(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static {
		K = Q;
	}
}
