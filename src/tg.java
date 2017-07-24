final class tg extends j {

	static int[] Q = new int[5];
	static int R;
	private int S = 1;
	static int T = 0;
	private int U = 1;
	static int V;
	static vg W = null;
	static int X = 0;
	static lf Y = dd.a("Hier wechseln", 2);
	static int Z;
	static int int_ab;
	static int int_bb;
	static lf lf_cb = dd.a("M", 2);

	final int[] a(int var1, int var2) {
		int var13 = client.int_gc;

		try {
			++R;
			int[] var3 = super.H.a(-314, var2);
			if (var1 > -49) {
				Q = null;
			}

			if (super.H.boolean_v) {
				int var4 = this.U + this.U - -1;
				int[][] var6 = new int[var4][];
				int var5 = this.S + (this.S - -1);
				int var7 = -this.U + var2;
				int var10;
				if (var13 != 0 || this.U + var2 >= var7) {
					do {
						var10 = 0;
						int[] var8 = this.a((int) (qb.Z & var7), -6, 0);
						int var11 = -this.S;
						if (var13 != 0) {
							var10 += var8[var11 & ch.int_h];
							++var11;
						}

						while (~this.S <= ~var11) {
							var10 += var8[var11 & ch.int_h];
							++var11;
						}

						int[] var9 = new int[ff.int_a];
						int var12 = 0;
						if (var13 != 0 || var12 < ff.int_a) {
							do {
								var9[var12] = var10 / var5;
								var10 -= var8[var12 - this.S & ch.int_h];
								++var12;
								var10 += var8[ch.int_h & this.S + var12];
							} while (var12 < ff.int_a);

							var6[-var2 + this.U + var7] = var9;
							++var7;
						} else {
							var6[-var2 + this.U + var7] = var9;
							++var7;
						}
					} while (this.U + var2 >= var7);
				}

				int var15 = 0;
				if (var13 != 0 || ~var15 > ~ff.int_a) {
					do {
						int var16 = 0;
						var10 = 0;
						if (var13 != 0) {
							var16 += var6[var10][var15];
							++var10;
						}

						while (var10 < var4) {
							var16 += var6[var10][var15];
							++var10;
						}

						var3[var15] = var16 / var4;
						++var15;
					} while (~var15 > ~ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var14) {
			throw ec.a(var14, "tg.G(" + var1 + ',' + var2 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var22 = client.int_gc;

		try {
			++V;
			if (var2 != 2177) {
				this.S = -78;
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int var4 = this.U + (this.U - -1);
				int[][][] var6 = new int[var4][][];
				int var5 = this.S + this.S + 1;
				int var7 = -this.U + var1;
				int var11;
				int var12;
				if (var22 != 0 || var7 <= this.U + var1) {
					do {
						int[][] var8 = this.a(false, qb.Z & var7, 0);
						int[][] var9 = new int[3][ff.int_a];
						int var10 = 0;
						var11 = 0;
						var12 = 0;
						int[] var13 = var8[0];
						int[] var14 = var8[1];
						int[] var15 = var8[2];
						int var16 = -this.S;
						int var17;
						if (var22 != 0) {
							var17 = var16 & ch.int_h;
							var10 += var13[var17];
							var12 += var15[var17];
							var11 += var14[var17];
							++var16;
						}

						while (~var16 >= ~this.S) {
							var17 = var16 & ch.int_h;
							var10 += var13[var17];
							var12 += var15[var17];
							var11 += var14[var17];
							++var16;
						}

						int[] var31 = var9[0];
						int[] var18 = var9[1];
						int[] var19 = var9[2];
						int var20 = 0;
						if (var22 != 0 || var20 < ff.int_a) {
							do {
								var31[var20] = var10 / var5;
								var18[var20] = var11 / var5;
								var19[var20] = var12 / var5;
								int var21 = var20 + -this.S & ch.int_h;
								var11 -= var14[var21];
								var10 -= var13[var21];
								var12 -= var15[var21];
								++var20;
								var21 = this.S + var20 & ch.int_h;
								var12 += var15[var21];
								var10 += var13[var21];
								var11 += var14[var21];
							} while (var20 < ff.int_a);

							var6[this.U + (var7 - var1)] = var9;
							++var7;
						} else {
							var6[this.U + (var7 - var1)] = var9;
							++var7;
						}
					} while (var7 <= this.U + var1);
				}

				int[] var24 = var3[0];
				int[] var25 = var3[1];
				int[] var26 = var3[2];
				var11 = 0;
				if (var22 != 0 || var11 < ff.int_a) {
					do {
						var12 = 0;
						int var27 = 0;
						int var28 = 0;
						int var29 = 0;
						if (var22 == 0 && ~var29 <= ~var4) {
							var24[var11] = var12 / var4;
							var25[var11] = var27 / var4;
							var26[var11] = var28 / var4;
							++var11;
						} else {
							do {
								int[][] var30 = var6[var29];
								var12 += var30[0][var11];
								var27 += var30[1][var11];
								var28 += var30[2][var11];
								++var29;
							} while (~var29 > ~var4);

							var24[var11] = var12 / var4;
							var25[var11] = var27 / var4;
							var26[var11] = var28 / var4;
							++var11;
						}
					} while (var11 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var23) {
			throw ec.a(var23, "tg.E(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label51:
			{
				label45:
				{
					label44:
					{
						if (~var2 != -1) {
							if (~var2 == -2) {
								break label44;
							}

							if (~var2 != -3) {
								break label51;
							}

							if (var5 == 0) {
								break label45;
							}
						}

						this.S = var3.j((byte) 118);
						if (var5 == 0) {
							break label51;
						}
					}

					this.U = var3.j((byte) 80);
					if (var5 == 0) {
						break label51;
					}
				}

				super.x = var3.j((byte) 89) == 1;
			}

			++int_bb;
			if (var1 >= -120) {
				d((byte) -97);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "tg.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void d(byte var0) {
		try {
			Q = null;
			lf_cb = null;
			W = null;
			int var1 = -77 % ((var0 - -3) / 40);
			Y = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "tg.B(" + var0 + ')');
		}
	}

	public tg() {
		super(1, false);
	}

	static final void a(int var0, int var1, int var2, int var3, int var4) {
		try {
			int var5 = var1;
			if (ma.int_h <= var1) {
				++Z;
			} else {
				do {
					if (var3 < vg.Lc[var5] + fi.ints_p[var5] && fi.ints_p[var5] < var3 + var0 && var4 < cf.B[var5] + gh.W[var5]
							&& cf.B[var5] < var2 + var4) {
						ub.V[var5] = true;
					}

					++var5;
				} while (ma.int_h > var5);

				++Z;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "tg.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
}
