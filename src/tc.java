final class tc extends j {

	static lf Q;
	static int R = 255;
	static kf[] S;
	static int T;
	static short[] U = new short[]{(short) 48, (short) 5, (short) 22, (short) 38, (short) 11, (short) 18, (short) 33, (short) 57};
	private int[] V;
	private static lf W = dd.a("Close", 2);
	static int X;
	static int Y;
	static int Z;
	static int int_ab;
	static lf lf_bb;
	private int int_cb = 0;
	private static lf lf_db = dd.a("slide:", 2);
	static lf fpsCommand;//lf_eb
	private int[][] ints_fb;
	static lf lf_gb;
	static int int_hb;
	private static lf lf_ib = dd.a("We suspect someone knows your password)3", 2);
	static int int_jb;
	static int int_kb;
	static int int_lb;
	static lf lf_mb;
	static lf lf_nb;
	static lf lf_ob;
	static lf clanFlag;//lf_pb
	static int int_qb;
	private static lf lf_rb;
	private int[] ints_sb;

	static final void c(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		if (var3 != null) {
			for (int var4 = 0; var4 < var3.int_p; ++var4) {
				ed var5 = var3.eds_t[var4];
				if ((var5.long_w >> 29 & 3L) == 2L && var5.int_u == var1 && var5.int_f == var2) {
					ra.a(var5);
					return;
				}
			}

		}
	}

	static final long d(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		if (var3 == null) {
			return 0L;
		} else {
			for (int var4 = 0; var4 < var3.int_p; ++var4) {
				ed var5 = var3.eds_t[var4];
				if ((var5.long_w >> 29 & 3L) == 2L && var5.int_u == var1 && var5.int_f == var2) {
					return var5.long_w;
				}
			}

			return 0L;
		}
	}

	public static void d(byte var0) {
		try {
			U = null;
			int var1 = -108 % ((53 - var0) / 55);
			lf_db = null;
			lf_bb = null;
			lf_gb = null;
			S = null;
			lf_ob = null;
			W = null;
			clanFlag = null;
			lf_mb = null;
			Q = null;
			lf_rb = null;
			lf_nb = null;
			lf_ib = null;
			fpsCommand = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "tc.K(" + var0 + ')');
		}
	}

	static final boolean c(int var0, int var1) {
		try {
			++int_hb;
			if (var0 != 1) {
				lf_mb = null;
			}

			return ~(1 & var1 >> -817450625) != -1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tc.J(" + var0 + ',' + var1 + ')');
		}
	}

	static final void e(byte var0) {
		try {
			++int_kb;
			fh.rc_a.c(-51);
			ph.D.c(-51);
			if (var0 <= 32) {
				lf_ob = null;
			}

			ed.rc_t.c(-51);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "tc.D(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var23 = client.int_gc;

		try {
			int[] var3 = super.H.a(-314, var2);
			++int_qb;
			if (super.H.boolean_v) {
				label132:
				{
					int[] var4;
					int var5;
					int var6;
					int var7;
					int[] var8;
					int[] var9;
					int var10;
					int var11;
					label141:
					{
						int var12;
						label142:
						{
							var4 = this.a((int) var2, -125, 0);
							var5 = this.int_cb;
							if (~var5 != -3) {
								if (var5 != 1) {
									break label141;
								}

								if (var23 == 0) {
									break label142;
								}
							}

							var5 = 0;
							if (var23 != 0 || ~ff.int_a < ~var5) {
								do {
									var7 = var4[var5];
									var6 = 1;
									if (var23 != 0 || this.ints_fb.length + -1 > var6) {
										while (~this.ints_fb[var6][0] >= ~var7 || var23 != 0) {
											++var6;
											if (this.ints_fb.length + -1 <= var6) {
												break;
											}
										}
									}

									var8 = this.ints_fb[var6 - 1];
									var9 = this.ints_fb[var6];
									var10 = this.a(-2 + var6, true)[1];
									var11 = var8[1];
									var12 = var9[1];
									int var13 = this.a(var6 - -1, true)[1];
									int var14 = (var7 - var8[0] << -1065580404) / (-var8[0] + var9[0]);
									int var15 = var14 * var14 >> -1246698676;
									int var16 = var11 + (var13 - (var12 - -var10));
									int var17 = -var16 + var10 + -var11;
									int var18 = -var10 + var12;
									int var20 = (var14 * var16 >> -643773556) * var15 >> 90529900;
									int var22 = var14 * var18 >> -1868802484;
									int var21 = var15 * var17 >> 252325516;
									var3[var5] = var22 + var21 + var20 + var11;
									++var5;
								} while (~ff.int_a < ~var5);
							}

							if (var23 == 0) {
								break label132;
							}
						}

						var5 = 0;
						if (var23 != 0 || ~var5 > ~ff.int_a) {
							do {
								var7 = var4[var5];
								var6 = 1;
								if (var23 != 0 || this.ints_fb.length + -1 > var6) {
									while (~this.ints_fb[var6][0] >= ~var7 || var23 != 0) {
										++var6;
										if (this.ints_fb.length + -1 <= var6) {
											break;
										}
									}
								}

								var8 = this.ints_fb[-1 + var6];
								var9 = this.ints_fb[var6];
								var10 = (var7 + -var8[0] << -701174964) / (var9[0] - var8[0]);
								var11 = 4096 + -lf.P[255 & var10 >> -557644987] >> 1210048353;
								var12 = -var11 + 4096;
								var3[var5] = var9[1] * var11 + var12 * var8[1] >> 1376445548;
								++var5;
							} while (~var5 > ~ff.int_a);
						}

						if (var23 == 0) {
							break label132;
						}
					}

					var5 = 0;
					if (var23 != 0 || var5 < ff.int_a) {
						do {
							var7 = var4[var5];
							var6 = 1;
							if (var23 != 0 || ~var6 > ~(-1 + this.ints_fb.length)) {
								while (~this.ints_fb[var6][0] >= ~var7 || var23 != 0) {
									++var6;
									if (~var6 <= ~(-1 + this.ints_fb.length)) {
										break;
									}
								}
							}

							var9 = this.ints_fb[var6];
							var8 = this.ints_fb[var6 - 1];
							var10 = (var7 + -var8[0] << 1904920396) / (var9[0] + -var8[0]);
							var11 = -var10 + 4096;
							var3[var5] = var11 * var8[1] - -(var10 * var9[1]) >> 996440428;
							++var5;
						} while (var5 < ff.int_a);
					}
				}
			}

			if (var1 > -49) {
				R = -36;
			}

			return var3;
		} catch (RuntimeException var24) {
			throw ec.a(var24, "tc.G(" + var1 + ',' + var2 + ')');
		}
	}

	private final void f(byte var1) {
		try {
			++X;
			int[] var2 = this.ints_fb[0];
			int[] var4 = this.ints_fb[-2 + this.ints_fb.length];
			int[] var3 = this.ints_fb[1];
			int var6 = 52 / ((var1 - 60) / 57);
			int[] var5 = this.ints_fb[-1 + this.ints_fb.length];
			this.V = new int[]{var4[0] + var4[0] + -var5[0], var4[1] - var5[1] - -var4[1]};
			this.ints_sb = new int[]{var2[0] + var2[0] + -var3[0], var2[1] - (var3[1] + -var2[1])};
		} catch (RuntimeException var7) {
			throw ec.a(var7, "tc.B(" + var1 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			++Y;
			if (var1 <= -120) {
				if (~var2 == -1) {
					this.int_cb = var3.j((byte) 72);
					this.ints_fb = new int[var3.j((byte) 102)][2];
					int var4 = 0;
					if (var5 != 0 || var4 < this.ints_fb.length) {
						do {
							this.ints_fb[var4][0] = var3.b(true);
							this.ints_fb[var4][1] = var3.b(true);
							++var4;
						} while (var4 < this.ints_fb.length);

					}
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "tc.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void c(int var1) {
		try {
			if (this.ints_fb == null) {
				this.ints_fb = new int[][]{new int[2], {4096, 4096}};
			}

			++int_jb;
			if (this.ints_fb.length < 2) {
				throw new RuntimeException("Curve operation requires at least two markers");
			} else {
				if (var1 != 25614) {
					this.ints_fb = null;
				}

				if (~this.int_cb == -3) {
					this.f((byte) 117);
				}

				td.b(127);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tc.M(" + var1 + ')');
		}
	}

	public tc() {
		super(1, true);
	}

	private final int[] a(int var1, boolean var2) {
		try {
			++int_ab;
			return !var2 ? null : (var1 < 0 ? this.ints_sb : (var1 >= this.ints_fb.length ? this.V : this.ints_fb[var1]));
		} catch (RuntimeException var4) {
			throw ec.a(var4, "tc.C(" + var1 + ',' + var2 + ')');
		}
	}

	static final df[] g(byte var0) {
		int var4 = client.int_gc;

		try {
			if (var0 != -12) {
				return null;
			} else {
				++T;
				df[] var1 = new df[oa.int_hb];
				int var2 = 0;
				if (var4 == 0 && ~var2 <= ~oa.int_hb) {
					h.b(-122);
					return var1;
				} else {
					do {
						df var3 = new df();
						var3.R = md.int_f;
						var3.U = sb.int_c;
						var3.P = rc.ints_a[var2];
						var3.T = w.ints_f[var2];
						var3.N = c.ints_db[var2];
						var3.S = h.ints_n[var2];
						var3.Q = f.V;
						var3.O = ai.bytes_i[var2];
						var1[var2] = var3;
						++var2;
					} while (~var2 > ~oa.int_hb);

					h.b(-122);
					return var1;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "tc.I(" + var0 + ')');
		}
	}

	static {
		lf_gb = W;
		Q = lf_db;
		lf_nb = lf_db;
		fpsCommand = dd.a("::fps ", 2);
		lf_rb = dd.a(" is already on your ignore list)3", 2);
		lf_bb = lf_rb;
		clanFlag = dd.a(":clan:", 2);
		lf_mb = lf_ib;
		lf_ob = dd.a("blinken2:", 2);
	}
}
