final class fa extends j {

	static boolean Q = false;
	static int R;
	static lf S;
	private int T = 2048;
	static int U;
	private int V = 1024;
	static volatile int W = 0;
	static int X;
	static int Y;
	static int Z;
	static int int_ab;
	private int int_bb = 3072;
	static volatile int int_cb = -1;
	static lf lf_db = dd.a("Ihr Spielkonto wurde deaktiviert)3", 2);
	private static lf lf_eb = dd.a("flash3:", 2);
	static int int_fb;
	static int int_gb;
	static bg bg_hb;
	static lf lf_ib;

	static void d(byte var0) {
		try {
			++Y;
			if (bb.S > 0) {
				n.e(-1);
			} else {
				de.a(40, (byte) -64);
				ed.z = fd.nd_s;
				fd.nd_s = null;
				if (var0 != -125) {
					lf_eb = null;
				}
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fa.D(" + var0 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			++R;
			if (var1 >= -120) {
				d((byte) 114);
			}

			if (~var2 != -1) {
				if (~var2 == -2) {
					this.int_bb = var3.b(true);
					return;
				}

				if (~var2 != -3) {
					return;
				}

				if (client.int_gc == 0) {
					super.x = var3.j((byte) 81) == 1;
					return;
				}
			}

			this.V = var3.b(true);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "fa.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static lf a(byte var0, int percentage) {
		try {
			++int_ab;
			if (var0 != 85) {
				S = null;
			}

			return rg.a(10, -19865, false, percentage);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "fa.B(" + var0 + ',' + percentage + ')');
		}
	}

	final void c(int var1) {
		try {
			if (var1 != 25614) {
				a(46L, false);
			}

			++U;
			this.T = -this.V + this.int_bb;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "fa.M(" + var1 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var12 = client.int_gc;

		try {
			++Z;
			if (var2 != 2177) {
				return null;
			} else {
				int[][] var3 = super.jh_q.a((byte) -128, var1);
				if (super.jh_q.boolean_w) {
					int[][] var4 = this.a(false, var1, 0);
					int[] var5 = var4[0];
					int[] var7 = var4[2];
					int[] var8 = var3[0];
					int[] var6 = var4[1];
					int[] var9 = var3[1];
					int[] var10 = var3[2];
					int var11 = 0;
					if (var12 != 0 || ~var11 > ~ff.int_a) {
						do {
							var8[var11] = this.V - -(this.T * var5[var11] >> -196054260);
							var9[var11] = (var6[var11] * this.T >> -1740697940) + this.V;
							var10[var11] = this.V - -(var7[var11] * this.T >> -249264692);
							++var11;
						} while (~var11 > ~ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "fa.E(" + var1 + ',' + var2 + ')');
		}
	}

	static void a(long var0, boolean var2) {
		int var6 = client.int_gc;

		try {
			++X;
			if (var0 != 0L) {
				if (~bh.int_ob <= -101) {
					kd.a(sh.Gb, false, eh.lf_f, 0);
				} else {
					lf var3 = of.a((byte) -75, var0).e(true);
					int var4 = 0;
					if (var6 != 0 || ~bh.int_ob < ~var4) {
						do {
							if (~var0 == ~id.longs_n[var4]) {
								kd.a(sh.Gb, false, de.a(new lf[]{var3, tc.lf_bb}, 1), 0);
								return;
							}

							++var4;
						} while (~bh.int_ob < ~var4);
					}

					int var5 = 0;
					if (var6 != 0) {
						if (~var0 == ~lf.C[var5]) {
							kd.a(sh.Gb, var2, de.a(new lf[]{wh.lf_h, var3, oh.lf_ob}, 1), 0);
							return;
						}

						++var5;
					}

					while (~vf.int_t < ~var5) {
						if (~var0 == ~lf.C[var5]) {
							kd.a(sh.Gb, var2, de.a(new lf[]{wh.lf_h, var3, oh.lf_ob}, 1), 0);
							return;
						}

						++var5;
					}

					if (var2) {
						int_gb = 120;
					}

					if (var3.e(r.X.Dc, -1)) {
						kd.a(sh.Gb, false, ib.lf_d, 0);
					} else {
						id.longs_n[bh.int_ob] = var0;
						d.lfs_fb[bh.int_ob++] = of.a((byte) -101, var0);
						ld.int_db = hf.int_p;
						vg.J.e((byte) 95, 147);
						++dh.int_l;
						vg.J.a(var0, -562765672);
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "fa.A(" + var0 + ',' + var2 + ')');
		}
	}

	public static void e(int var0) {
		try {
			bg_hb = null;
			lf_db = null;
			if (var0 != 0) {
				a((byte) -2, 87);
			}

			S = null;
			lf_eb = null;
			lf_ib = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fa.C(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var6 = client.int_gc;

		try {
			++int_fb;
			if (var1 >= -49) {
				this.b(89, 74);
			}

			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int[] var4 = this.a((int) var2, 96, 0);
				int var5 = 0;
				if (var6 != 0 || ~ff.int_a < ~var5) {
					do {
						var3[var5] = (this.T * var4[var5] >> -1756004852) + this.V;
						++var5;
					} while (~ff.int_a < ~var5);
				}
			}

			return var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "fa.G(" + var1 + ',' + var2 + ')');
		}
	}

	public fa() {
		super(1, false);
	}

	static {
		S = lf_eb;
		int_gb = -1;
		lf_ib = lf_eb;
	}
}
