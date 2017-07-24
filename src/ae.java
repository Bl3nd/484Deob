import java.awt.Canvas;

final class ae extends j {

	private int Q = 4096;
	private int R = 409;
	static int S;
	static int T;
	static Canvas U;
	static boolean V = false;
	private int[] W = new int[3];
	static int X;
	static lf Y = dd.a("Sichtbare Karte vorbereitet)3", 2);
	static lf mem_ = dd.a("Mem:", 2);
	static int int_ab;
	private int int_bb = 4096;
	private int int_cb = 4096;
	static int int_db;

	static void e(int var0) {
		try {
			++X;
			boolean var1;
			do {
				var1 = true;
				int var2 = 0;
				if (-1 + qa.int_eb > var2) {
					do {
						if (d.Q[var2] < 1000 && d.Q[var2 + 1] > 1000) {
							var1 = false;
							lf var3 = th.lfs_a[var2];
							th.lfs_a[var2] = th.lfs_a[1 + var2];
							th.lfs_a[var2 - -1] = var3;
							lf var4 = mc.z[var2];
							mc.z[var2] = mc.z[1 + var2];
							mc.z[1 + var2] = var4;
							int var5 = pg.ints_j[var2];
							pg.ints_j[var2] = pg.ints_j[1 + var2];
							pg.ints_j[1 + var2] = var5;
							var5 = vh.ints_i[var2];
							vh.ints_i[var2] = vh.ints_i[1 + var2];
							vh.ints_i[1 + var2] = var5;
							short var6 = d.Q[var2];
							d.Q[var2] = d.Q[var2 + 1];
							d.Q[1 + var2] = var6;
							long var7 = hc.longs_cb[var2];
							hc.longs_cb[var2] = hc.longs_cb[1 + var2];
							hc.longs_cb[var2 - -1] = var7;
						}

						++var2;
					} while (-1 + qa.int_eb > var2);
				}
			} while (!var1);

			if (var0 != 22491) {
				U = null;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "ae.C(" + var0 + ')');
		}
	}

	static boolean a(int var0, byte var1) {
		try {
			if (var1 < 3) {
				return true;
			} else {
				++T;
				return var0 == (-var0 & var0);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ae.B(" + var0 + ',' + var1 + ')');
		}
	}

	static void a(byte var0, byte[] data) {
		try {
			++int_db;
			ja class_ja = new ja(data);
			class_ja.P = -2 + data.length;
			oa.int_hb = class_ja.b(true);
			w.ints_f = new int[oa.int_hb];
			h.ints_n = new int[oa.int_hb];
			ai.bytes_i = new byte[oa.int_hb][];
			rc.ints_a = new int[oa.int_hb];
			c.ints_db = new int[oa.int_hb];
			class_ja.P = -(8 * oa.int_hb) + -7 + data.length;
			md.int_f = class_ja.b(true);
			sb.int_c = class_ja.b(true);
			int var3 = 1 + (255 & class_ja.j((byte) 120));
			int var4 = 0;
			while (oa.int_hb > var4) {
				rc.ints_a[var4] = class_ja.b(true);
				++var4;
			}

			int var5 = 0;
			if (var0 != -55) {
				Y = null;
			}

			while (oa.int_hb > var5) {
				w.ints_f[var5] = class_ja.b(true);
				++var5;
			}

			int var6 = 0;
			while (oa.int_hb > var6) {
				c.ints_db[var6] = class_ja.b(true);
				++var6;
			}

			int var7 = 0;
			while (oa.int_hb > var7) {
				h.ints_n[var7] = class_ja.b(true);
				++var7;
			}

			class_ja.P = data.length + -7 + -(8 * oa.int_hb) + -((var3 - 1) * 3);
			f.V = new int[var3];
			int var8 = 1;
			if (var3 > var8) {
				do {
					f.V[var8] = class_ja.f((byte) 59);
					if (f.V[var8] == 0) {
						f.V[var8] = 1;
					}

					++var8;
				} while (var3 > var8);
			}

			class_ja.P = 0;
			int var9 = 0;
			if (oa.int_hb > var9) {
				do {
					int var11 = h.ints_n[var9];
					int var10 = c.ints_db[var9];
					int var12 = var10 * var11;
					byte[] var13 = new byte[var12];
					ai.bytes_i[var9] = var13;
					int var14 = class_ja.j((byte) 122);
					if (var14 == 0) {
						int var15 = 0;
						if (var15 < var12) {
							do {
								var13[var15] = class_ja.m(3);
								++var15;
							} while (var15 < var12);
						}
					} else if (var14 == 1) {
						int var15 = 0;
						if (var15 < var10) {
							do {
								int var16 = 0;
								if (var16 >= var11) {
									++var15;
								} else {
									do {
										var13[var15 + (var10 * var16)] = class_ja.m(cc.c(var0, -54));
										++var16;
									} while (var16 < var11);

									++var15;
								}
							} while (var15 < var10);
						}
					}

					++var9;
				} while (oa.int_hb > var9);
			}
		} catch (RuntimeException var18) {
			throw ec.a(var18, "ae.A(" + var0 + ',' + (data != null ? "{...}" : "null") + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var16 = client.int_gc;

		try {
			++S;
			if (var2 != 2177) {
				a((byte) -107, (byte[]) null);
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int[][] var4 = this.a(false, var1, 0);
				int[] var5 = var4[0];
				int[] var6 = var4[1];
				int[] var7 = var4[2];
				int[] var8 = var3[0];
				int[] var10 = var3[2];
				int[] var9 = var3[1];
				int var11 = 0;
				if (var16 != 0 || ff.int_a > var11) {
					do {
						int var13 = var5[var11];
						int var12 = -this.W[0] + var13;
						if (var12 < 0) {
							var12 = -var12;
						}

						label65:
						{
							if (this.R < var12) {
								var8[var11] = var13;
								var9[var11] = var6[var11];
								var10[var11] = var7[var11];
								if (var16 == 0) {
									break label65;
								}
							}

							int var14 = var6[var11];
							var12 = var14 - this.W[1];
							if (var12 < 0) {
								var12 = -var12;
							}

							if (var12 > this.R) {
								var8[var11] = var13;
								var9[var11] = var14;
								var10[var11] = var7[var11];
								if (var16 == 0) {
									break label65;
								}
							}

							int var15 = var7[var11];
							var12 = var15 - this.W[2];
							if (var12 < 0) {
								var12 = -var12;
							}

							if (this.R < var12) {
								var8[var11] = var13;
								var9[var11] = var14;
								var10[var11] = var15;
								if (var16 == 0) {
									break label65;
								}
							}

							var8[var11] = var13 * this.int_bb >> -2137487156;
							var9[var11] = var14 * this.int_cb >> -409566708;
							var10[var11] = this.Q * var15 >> 1290277420;
						}

						++var11;
					} while (ff.int_a > var11);
				}
			}

			return var3;
		} catch (RuntimeException var17) {
			throw ec.a(var17, "ae.E(" + var1 + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			U = null;
			mem_ = null;
			Y = null;
			int var1 = -81 % ((var0 - -46) / 57);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ae.D(" + var0 + ')');
		}
	}

	public ae() {
		super(1, false);
	}

	final void a(byte var1, int var2, ja var3) {
		int var6 = client.int_gc;

		try {
			label55:
			{
				label54:
				{
					label53:
					{
						label52:
						{
							label51:
							{
								if (var2 != 0) {
									if (var2 == 1) {
										break label51;
									}

									if (var2 == 2) {
										break label52;
									}

									if (~var2 == -4) {
										break label53;
									}

									if (~var2 != -5) {
										break label55;
									}

									if (var6 == 0) {
										break label54;
									}
								}

								this.R = var3.b(true);
								if (var6 == 0) {
									break label55;
								}
							}

							this.Q = var3.b(true);
							if (var6 == 0) {
								break label55;
							}
						}

						this.int_cb = var3.b(true);
						if (var6 == 0) {
							break label55;
						}
					}

					this.int_bb = var3.b(true);
					if (var6 == 0) {
						break label55;
					}
				}

				int var4 = var3.f((byte) 59);
				this.W[0] = sd.a(var4, 16711680) << -1757122716;
				this.W[1] = sd.a(4080, var4 >> -440034204);
				this.W[2] = sd.a(var4 >> -1108730548, 0);
			}

			++int_ab;
			if (var1 > -120) {
				a(50, (byte) -124);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ae.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
}
