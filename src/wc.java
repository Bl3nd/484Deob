final class wc extends j {

	static ia Q = new ia();
	static int R;
	static boolean S;
	private int T = 4;
	static int U;
	private int V = 4;
	static lf W;
	private static lf X = dd.a("Please try again)3", 2);
	static boolean Y;
	static int Z;

	final int[] a(int var1, int var2) {
		int var9 = client.int_gc;

		try {
			if (var1 >= -49) {
				return null;
			} else {
				++R;
				int[] var3 = super.H.a(-314, var2);
				if (super.H.boolean_v) {
					int[] var4;
					int var5;
					int var7;
					label40:
					{
						var5 = ff.int_a / this.T;
						int var6 = dg.int_p / this.V;
						if (var6 > 0) {
							var7 = var2 % var6;
							var4 = this.a((int) (dg.int_p * var7 / var6), 28, 0);
							if (var9 == 0) {
								break label40;
							}
						}

						var4 = this.a((int) 0, -125, 0);
					}

					var7 = 0;
					if (var9 != 0 || var7 < ff.int_a) {
						do {
							label26:
							{
								if (~var5 >= -1) {
									var3[var7] = var4[0];
									if (var9 == 0) {
										break label26;
									}
								}

								int var8 = var7 % var5;
								var3[var7] = var4[var8 * ff.int_a / var5];
							}

							++var7;
						} while (var7 < ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "wc.G(" + var1 + ',' + var2 + ')');
		}
	}

	public wc() {
		super(1, false);
	}

	final int[][] b(int var1, int var2) {
		int var16 = client.int_gc;

		try {
			++Z;
			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (var2 != 2177) {
				this.a(108, -60);
			}

			if (super.jh_q.boolean_w) {
				int[][] var4;
				int var5;
				label40:
				{
					var5 = ff.int_a / this.T;
					int var6 = dg.int_p / this.V;
					if (var6 > 0) {
						int var7 = var1 % var6;
						var4 = this.a(false, var7 * dg.int_p / var6, 0);
						if (var16 == 0) {
							break label40;
						}
					}

					var4 = this.a(false, 0, 0);
				}

				int[] var10 = var3[0];
				int[] var8 = var4[1];
				int[] var18 = var4[0];
				int[] var12 = var3[2];
				int[] var11 = var3[1];
				int[] var9 = var4[2];
				int var13 = 0;
				if (var16 != 0 || ~var13 > ~ff.int_a) {
					do {
						int var14;
						label26:
						{
							if (var5 <= 0) {
								var14 = 0;
								if (var16 == 0) {
									break label26;
								}
							}

							int var15 = var13 % var5;
							var14 = var15 * ff.int_a / var5;
						}

						var10[var13] = var18[var14];
						var11[var13] = var8[var14];
						var12[var13] = var9[var14];
						++var13;
					} while (~var13 > ~ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var17) {
			throw ec.a(var17, "wc.E(" + var1 + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			X = null;
			int var1 = -22 / ((var0 - -9) / 34);
			Q = null;
			W = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wc.A(" + var0 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label34:
			{
				label33:
				{
					if (var2 != 0) {
						if (var2 != 1) {
							break label34;
						}

						if (var5 == 0) {
							break label33;
						}
					}

					this.T = var3.j((byte) 81);
					if (var5 == 0) {
						break label34;
					}
				}

				this.V = var3.j((byte) 78);
			}

			if (var1 >= -120) {
				d((byte) -3);
			}

			++U;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "wc.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		W = X;
		Y = false;
	}
}
