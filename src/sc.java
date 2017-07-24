final class sc extends ph {

	static int G;
	private int[] H;
	private int I;
	static int J;
	static int K;
	boolean L;
	static int M;
	private wg N;
	private float O;
	static lf P = dd.a(" <col=ffffff>", 2);
	static boolean channel;
	static short[] R = new short[]{(short) -10304, (short) 9104, (short) -1, (short) -1, (short) -1};
	private int S;
	int T;
	private int U;
	private int V;
	boolean W;
	static int X;
	static int Y;
	int Z;
	boolean boolean_ab = false;
	static int int_bb;
	static int int_cb;
	static vg[][] vgs_db;

	final boolean a(bg var1, int var2, aa var3) {
		try {
			int var4 = 117 % ((-83 - var2) / 43);
			++M;
			return this.N.a(0, var3, var1);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sc.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			super.finalize();
			++int_bb;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sc.finalize(" + ')');
		}
	}

	static final void b(int var0) {
		try {
			++int_cb;
			int var2 = 64 + 128 * oa.Z;
			int var1 = 64 + bb.U * 128;
			int var3 = bh.a(var2, false, hc.int_pb, var1) + -j.M;
			if (var1 > dh.int_i) {
				dh.int_i += (var1 - dh.int_i) * d.int_db / 1000 + uc.int_sc;
				if (~dh.int_i < ~var1) {
					dh.int_i = var1;
				}
			}

			if (var2 > mb.A) {
				mb.A += d.int_db * (var2 + -mb.A) / 1000 + uc.int_sc;
				if (var2 < mb.A) {
					mb.A = var2;
				}
			}

			if (~var3 < ~nd.y) {
				nd.y += (var3 - nd.y) * d.int_db / 1000 + uc.int_sc;
				if (~var3 > ~nd.y) {
					nd.y = var3;
				}
			}

			if (var1 < dh.int_i) {
				dh.int_i -= d.int_db * (dh.int_i - var1) / 1000 + uc.int_sc;
				if (~dh.int_i > ~var1) {
					dh.int_i = var1;
				}
			}

			if (mb.A > var2) {
				mb.A -= uc.int_sc - -(d.int_db * (mb.A + -var2) / 1000);
				if (~mb.A > ~var2) {
					mb.A = var2;
				}
			}

			if (~var3 > ~nd.y) {
				nd.y -= uc.int_sc + d.int_db * (nd.y - var3) / 1000;
				if (~nd.y > ~var3) {
					nd.y = var3;
				}
			}

			var1 = 128 * n.int_p - -64;
			var2 = 64 + 128 * rg.int_l;
			var3 = bh.a(var2, false, hc.int_pb, var1) - c.Y;
			int var5 = var3 - nd.y;
			int var6 = var2 - mb.A;
			int var4 = var1 - dh.int_i;
			int var7 = (int) Math.sqrt((double) (var6 * var6 + var4 * var4));
			int var8 = 2047 & (int) (Math.atan2((double) var5, (double) var7) * 325.949D);
			int var9 = (int) (-325.949D * Math.atan2((double) var4, (double) var6)) & 2047;
			if (var8 < 128) {
				var8 = 128;
			}

			int var10 = var9 + -pd.int_c;
			if (var10 > 1024) {
				var10 -= 2048;
			}

			if (var8 > 383) {
				var8 = 383;
			}

			if (var10 < -1024) {
				var10 += 2048;
			}

			int var12 = -51 % ((var0 - -17) / 54);
			if (~var8 < ~hc.int_hb) {
				hc.int_hb += (-hc.int_hb + var8) * qh.int_l / 1000 + tg.int_ab;
				if (hc.int_hb > var8) {
					hc.int_hb = var8;
				}
			}

			if (~var10 < -1) {
				pd.int_c += tg.int_ab - -(var10 * qh.int_l / 1000);
				pd.int_c &= 2047;
			}

			if (~var10 > -1) {
				pd.int_c -= tg.int_ab - -(-var10 * qh.int_l / 1000);
				pd.int_c &= 2047;
			}

			int var11 = -pd.int_c + var9;
			if (var8 < hc.int_hb) {
				hc.int_hb -= tg.int_ab + (-var8 + hc.int_hb) * qh.int_l / 1000;
				if (hc.int_hb < var8) {
					hc.int_hb = var8;
				}
			}

			if (~var11 < -1025) {
				var11 -= 2048;
			}

			if (var11 < -1024) {
				var11 += 2048;
			}

			if (~var11 > -1 && ~var10 < -1 || var11 > 0 && ~var10 > -1) {
				pd.int_c = var9;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "sc.H(" + var0 + ')');
		}
	}

	public static void c(int var0) {
		try {
			if (var0 == 2047) {
				R = null;
				P = null;
				vgs_db = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sc.G(" + var0 + ')');
		}
	}

	final int[] a(float var1, int var2, aa var3, bg var4, int var5) {
		try {
			if (var2 != 0) {
				this.a(-1.6882112F, 53, (aa) null, (bg) null, -102);
			}

			++Y;
			if (this.H == null || this.O != var1) {
				if (!this.N.a(0, var3, var4)) {
					return null;
				}

				int var6 = ~this.T >= ~var5 ? this.T : var5;
				this.H = this.N.a((double) var1, 0, var6, var6, true, var4, var3);
				this.O = var1;
			}

			return this.H;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sc.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, ka var4, long var5) {
		if (var4 != null) {
			ei var7 = new ei();
			var7.ka_i = var4;
			var7.int_k = var1 * 128 + 64;
			var7.int_f = var2 * 128 + 64;
			var7.int_b = var3;
			var7.long_l = var5;
			if (i.Ib[var0][var1][var2] == null) {
				i.Ib[var0][var1][var2] = new ab(var0, var1, var2);
			}

			i.Ib[var0][var1][var2].D = var7;
		}
	}

	static final int a(ja var0, boolean var1, lf var2) {
		try {
			int var3 = var0.P;
			var0.a(var2.S, (boolean) var1);
			var0.P += bh.ad_fb.a(8, 0, var0.yb, var0.P, var2.Y, var2.S);
			++X;
			if (!var1) {
				R = null;
			}

			return -var3 + var0.P;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sc.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, byte var2, aa var3, bg var4) {
		try {
			++K;
			int var5 = 59 / ((var2 - 13) / 63);
			if (!this.N.a(0, var3, var4)) {
				return null;
			} else {
				int var6 = this.T <= var1 ? this.T : var1;
				return this.N.a(1.0D, 0, var6, var6, false, var4, var3);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sc.E(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, int var2) {
		int var11 = client.int_gc;

		try {
			if (var1 != 64) {
				vgs_db = null;
			}

			++G;
			if (this.H != null) {
				short var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int[] var13;
				if (~this.U != -1) {
					if (oa.S == null || oa.S.length < this.H.length) {
						oa.S = new int[this.H.length];
					}

					label96:
					{
						var4 = this.H.length;
						if (this.H.length == 4096) {
							var3 = 64;
							if (var11 == 0) {
								break label96;
							}
						}

						var3 = 128;
					}

					var5 = var2 * var3 * this.S;
					if (this.U == 2) {
						var5 = -var5;
					}

					var6 = var4 + -1;
					var7 = 0;
					if (var11 != 0 || ~var4 < ~var7) {
						do {
							var8 = var6 & var7 + var5;
							oa.S[var7] = this.H[var8];
							++var7;
						} while (~var4 < ~var7);
					}

					var13 = this.H;
					this.H = oa.S;
					oa.S = var13;
				}

				if (this.V != 0) {
					if (oa.S == null || oa.S.length < this.H.length) {
						oa.S = new int[this.H.length];
					}

					label74:
					{
						if (this.H.length == 4096) {
							var3 = 64;
							if (var11 == 0) {
								break label74;
							}
						}

						var3 = 128;
					}

					var4 = this.H.length;
					var6 = var3 + -1;
					var5 = var2 * this.S;
					if (~this.V == -2) {
						var5 = -var5;
					}

					var7 = 0;
					if (var11 == 0 && ~var4 >= ~var7) {
						var13 = this.H;
						this.H = oa.S;
						oa.S = var13;
					} else {
						do {
							var8 = 0;
							if (var11 == 0 && ~var3 >= ~var8) {
								var7 += var3;
							} else {
								do {
									int var9 = var8 + var7;
									int var10 = (var6 & var5 + var8) + var7;
									oa.S[var9] = this.H[var10];
									++var8;
								} while (~var3 < ~var8);

								var7 += var3;
							}
						} while (~var4 < ~var7);

						var13 = this.H;
						this.H = oa.S;
						oa.S = var13;
					}
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "sc.F(" + var1 + ',' + var2 + ')');
		}
	}

	sc(ja var1) {
		try {
			this.N = new wg(var1);
			int var2 = var1.j((byte) 113);
			this.W = ~(2 & var2) != -1;
			this.L = ~(var2 & 1) != -1;
			this.T = var1.j((byte) 125);
			this.Z = var1.b(true);
			this.I = var1.j((byte) 120);
			if (~this.I == -256) {
				this.I = 256;
			}

			int var3 = var1.j((byte) 84);
			int var4 = var1.j((byte) 74);
			this.U = 3 & var4 >> -922191610;
			this.S = (63 & var4) - 6;
			this.V = (248 & var3) >> 1764579846;
			var1.j((byte) 100);
			var1.j((byte) 78);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sc.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	sc() {
		try {
			this.N = new wg();
			this.T = 1;
			this.L = true;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sc.<init>(" + ')');
		}
	}

	static final lf a(int var0, boolean var1, int var2) {
		try {
			if (var0 <= 8) {
				a(-58, 87, 1, 103, (ka) null, -49L);
			}

			++J;
			return rg.a(10, -19865, var1, var2);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sc.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
}
