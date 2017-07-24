final class lh extends ph {

	static lf G = dd.a("<col=ff0000>", 2);
	static lf H = dd.a("<col=ffff00>", 2);
	static int I;
	int J;
	private int K = 128;
	private int L;
	static int M;
	static int N;
	private int O = 0;
	private short[] P;
	private short[] Q;
	private int R = 0;
	static int S;
	static int T;
	static lf U;
	private short[] V;
	private short[] W;
	private int X = 0;
	private int Y = 128;
	int Z = -1;
	static int int_ab;
	static int int_bb;
	private static lf lf_cb = dd.a("Free world", 2);
	static int int_db;
	static lf lf_eb;

	static final void b(boolean var0) {
		try {
			synchronized (j.z) {
				if (var0) {
					a((uc) null, 34);
				}

				wd.int_eb = fa.W;
				c.int_bb = dh.int_g;
				lf.int_c = fa.int_cb;
				h.int_b = bh.int_bb;
				nh.int_mb = hg.int_g;
				gg.int_o = ed.int_v;
				ec.Y = lc.D;
				bh.int_bb = 0;
			}

			++S;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lh.B(" + var0 + ')');
		}
	}

	final ue a(int var1, int var2) {
		int var6 = client.int_gc;

		try {
			++N;
			if (var2 < 100) {
				a((uc) null, 56);
			}

			ue var3 = (ue) sd.rc_wb.a((long) this.J, (int) -116);
			if (var3 == null) {
				oe var4 = oe.a(sh.bg_qb, this.L, 0);
				if (var4 == null) {
					return null;
				}

				int var5;
				if (this.V != null) {
					var5 = 0;
					if (var6 != 0 || ~var5 > ~this.V.length) {
						do {
							var4.a(this.V[var5], this.Q[var5]);
							++var5;
						} while (~var5 > ~this.V.length);
					}
				}

				if (this.P != null) {
					var5 = 0;
					if (var6 != 0 || var5 < this.P.length) {
						do {
							var4.b(this.P[var5], this.W[var5]);
							++var5;
						} while (var5 < this.P.length);
					}
				}

				var3 = var4.a(64 - -this.X, this.O + 850, -30, -50, -30, true, true);
				sd.rc_wb.a((long) this.J, -123, var3);
			}

			ue var8;
			label91:
			{
				if (this.Z == -1 || var1 == -1) {
					var8 = var3.d(true);
					if (var6 == 0) {
						break label91;
					}
				}

				var8 = client.a(12, this.Z).b(var3, var1, 2047);
			}

			if (~this.K != -129 || this.Y != 128) {
				var8.b(this.K, this.Y, this.K);
			}

			if (~this.R != -1) {
				if (~this.R == -91) {
					var8.f();
				}

				if (this.R == 180) {
					var8.f();
					var8.f();
				}

				if (this.R == 270) {
					var8.f();
					var8.f();
					var8.f();
				}
			}

			return var8;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lh.A(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(uc var0, int var1) {
		try {
			var0.int_gb = var1;
			if (~var0.int_rb == -1) {
				var0.int_ec = 1024;
			}

			++M;
			int var2 = var0.int_bb - pd.int_i;
			if (~var0.int_rb == -2) {
				var0.int_ec = 1536;
			}

			int var3 = var0.int_kc * 128 - -(var0.int_qc * 64);
			int var4 = 128 * var0.int_ib + 64 * var0.int_qc;
			if (var0.int_rb == 2) {
				var0.int_ec = 0;
			}

			var0.int_nc += (-var0.int_nc + var4) / var2;
			if (var0.int_rb == 3) {
				var0.int_ec = 512;
			}

			var0.int_fb += (-var0.int_fb + var3) / var2;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lh.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	final void a(ja var1, boolean var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var1.j((byte) 91);
				if (var3 == 0) {
					break;
				}

				this.a(var3, -26188, var1);
			} while (var4 == 0);

			++int_ab;
			if (!var2) {
				a((uc) null, 9);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "lh.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static final void a(int var0, oh var1, wb var2, byte var3) {
		int var8 = client.int_gc;

		try {
			byte[] var4 = null;
			synchronized (f.W) {
				of var7 = (of) f.W.c(71);
				if (var8 != 0 || var7 != null) {
					do {
						if ((long) var0 == var7.long_e && var2 == var7.wb_n && var7.int_p == 0) {
							var4 = var7.y;
							break;
						}

						var7 = (of) f.W.d(-1);
					} while (var7 != null);
				}
			}

			++int_db;
			if (var4 != null) {
				var1.a(var4, var2, false, true, var0);
			} else {
				int var13 = -15 % ((4 - var3) / 49);
				byte[] var6 = var2.a((int) var0, (byte) 94);
				var1.a(var6, var2, false, true, var0);
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "lh.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	private final void a(int var1, int var2, ja var3) {
		int var6 = client.int_gc;

		try {
			label97:
			{
				if (~var1 == -2) {
					this.L = var3.b(true);
					if (var6 == 0) {
						break label97;
					}
				}

				if (var1 != 2) {
					if (var1 == 4) {
						this.K = var3.b(true);
						if (var6 == 0) {
							break label97;
						}
					}

					if (var1 == 5) {
						this.Y = var3.b(true);
						if (var6 == 0) {
							break label97;
						}
					}

					if (~var1 == -7) {
						this.R = var3.b(true);
						if (var6 == 0) {
							break label97;
						}
					}

					if (~var1 == -8) {
						this.X = var3.j((byte) 92);
						if (var6 == 0) {
							break label97;
						}
					}

					if (var1 == 8) {
						this.O = var3.j((byte) 72);
						if (var6 == 0) {
							break label97;
						}
					}

					int var4;
					int var5;
					if (var1 != 40) {
						if (var1 != 41) {
							break label97;
						}

						var4 = var3.j((byte) 94);
						this.W = new short[var4];
						this.P = new short[var4];
						var5 = 0;
						if (var6 != 0 || var4 > var5) {
							do {
								this.P[var5] = (short) var3.b(true);
								this.W[var5] = (short) var3.b(true);
								++var5;
							} while (var4 > var5);
						}

						if (var6 == 0) {
							break label97;
						}
					}

					var4 = var3.j((byte) 87);
					this.V = new short[var4];
					this.Q = new short[var4];
					var5 = 0;
					if (var6 != 0 || var5 < var4) {
						do {
							this.V[var5] = (short) var3.b(true);
							this.Q[var5] = (short) var3.b(true);
							++var5;
						} while (var5 < var4);
					}

					if (var6 == 0) {
						break label97;
					}
				}

				this.Z = var3.b(true);
			}

			if (var2 != -26188) {
				e((byte) -31);
			}

			++int_bb;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "lh.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final void d(byte var0) {
		int var6 = client.int_gc;

		try {
			++T;
			int[] var1 = new int[qb.V];
			int var2 = 0;
			int var3 = 0;
			if (var6 != 0 || var3 < qb.V) {
				do {
					ie var4 = ng.a(var3, (int) -4);
					if (~var4.K <= -1 || ~var4.int_tb <= -1) {
						var1[var2++] = var3;
					}

					++var3;
				} while (var3 < qb.V);
			}

			w.ints_g = new int[var2];
			int var8 = -18 / ((-67 - var0) / 38);
			int var5 = 0;
			if (var6 != 0) {
				w.ints_g[var5] = var1[var5];
				++var5;
			}

			while (~var2 < ~var5) {
				w.ints_g[var5] = var1[var5];
				++var5;
			}

		} catch (RuntimeException var7) {
			throw ec.a(var7, "lh.H(" + var0 + ')');
		}
	}

	public static void e(byte var0) {
		try {
			lf_cb = null;
			H = null;
			G = null;
			lf_eb = null;
			if (var0 == -42) {
				U = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "lh.C(" + var0 + ')');
		}
	}

	static {
		U = lf_cb;
		lf_eb = dd.a("Bitte geben Sie Ihr Passwort ein)3", 2);
	}
}
