final class oh extends bg {

	static int int_ab;
	private int int_bb;
	static lf lf_cb;
	static int int_db;
	private volatile boolean[] booleans_eb;
	static lf noclipCommand = dd.a("::noclip", 2);//lf_fb
	static int int_gb;
	private boolean boolean_hb = false;
	private int int_ib = -1;
	private int int_jb;
	private volatile boolean boolean_kb = false;
	static int int_lb;
	static lf lf_mb = dd.a("Anmelde)2Zeitlimit -Uberschritten)3", 2);
	private wb wb_nb;
	static lf lf_ob;
	static int int_pb;
	private int int_qb;
	static lf lf_rb;
	static int int_sb = 1;
	static int int_tb;
	private static lf lf_ub = dd.a(" from your friend list first)3", 2);
	static int int_vb;
	static lf lf_wb;
	static int xb;
	private wb yb;
	private static lf zb;
	static int Ab;
	private static lf Bb;
	static int Cb;

	final int d(int var1) {
		int var6 = client.int_gc;

		try {
			++int_tb;
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			if (var6 != 0) {
				if (super.A[var4] > 0) {
					var2 += 100;
					var3 += this.g(var4, 25677);
				}

				++var4;
			}

			for (; ~super.N.length < ~var4; ++var4) {
				if (super.A[var4] > 0) {
					var2 += 100;
					var3 += this.g(var4, 25677);
				}
			}

			if (var1 != -31160) {
				lf_ob = null;
			}

			if (var2 == 0) {
				return 100;
			} else {
				int var5 = var3 * 100 / var2;
				return var5;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "oh.PA(" + var1 + ')');
		}
	}

	final void e(int var1, int var2, int var3) {
		try {
			++Ab;
			this.int_qb = var3;
			this.int_bb = var2;
			if (this.yb == null) {
				j.a(this.int_bb, (byte) 0, this, true, 255, 108, this.int_jb);
			} else {
				lh.a(this.int_jb, this, this.yb, (byte) 77);
			}

			int var4 = 87 / ((var1 - 33) / 54);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "oh.LA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(int var1, byte var2) {
		try {
			++int_pb;
			if (var2 < -32) {
				fb.a(var1, this.int_jb, 122);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "oh.K(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(int var1, int var2) {
		try {
			int var3 = -5 % ((-16 - var2) / 49);
			++int_ab;
			if (this.wb_nb != null && this.booleans_eb != null && this.booleans_eb[var1]) {
				lh.a(var1, this, this.wb_nb, (byte) -108);
			} else {
				j.a(super.B[var1], (byte) 2, this, true, this.int_jb, 100, var1);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "oh.DA(" + var1 + ',' + var2 + ')');
		}
	}

	private final int g(int var1, int var2) {
		try {
			++Cb;
			if (super.N[var1] != null) {
				return 100;
			} else {
				if (var2 != 25677) {
					this.f(-29);
				}

				return this.booleans_eb[var1] ? 100 : cg.a(1023, this.int_jb, var1);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "oh.MA(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(byte[] var1, int var2, boolean var3, boolean var4, int var5) {
		try {
			int var6 = 126 / ((var2 - 36) / 48);
			++xb;
			if (!var3) {
				var1[var1.length - 2] = (byte) (super.ints_j[var5] >> -1175522520);
				var1[var1.length + -1] = (byte) super.ints_j[var5];
				if (this.wb_nb != null) {
					wb.a(var1, var5, this.wb_nb, 0);
					this.booleans_eb[var5] = true;
				}

				if (var4) {
					super.N[var5] = uc.a(28199, var1, false);
					return;
				}
			} else {
				if (this.boolean_kb) {
					throw new RuntimeException();
				}

				if (this.yb != null) {
					wb.a(var1, this.int_jb, this.yb, 0);
				}

				this.a(var1, 5540);
				this.d((byte) 74);
			}

		} catch (RuntimeException var7) {
			throw ec.a(var7, "oh.OA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	final void a(byte[] var1, wb var2, boolean var3, boolean var4, int var5) {
		try {
			label108:
			{
				++int_vb;
				int var6;
				if (this.yb != var2) {
					if (!var4 && var5 == this.int_ib) {
						this.boolean_kb = true;
					}

					if (var1 == null || ~var1.length >= -3) {
						this.booleans_eb[var5] = false;
						if (this.boolean_hb || var4) {
							j.a(super.B[var5], (byte) 2, this, var4, this.int_jb, 114, var5);
						}

						return;
					}

					r.W.reset();
					r.W.update(var1, 0, -2 + var1.length);
					var6 = (int) r.W.getValue();
					int var7 = ('\uff00' & var1[-2 + var1.length] << 1692734696) + (255 & var1[-1 + var1.length]);
					if (super.B[var5] != var6 || ~super.ints_j[var5] != ~var7) {
						this.booleans_eb[var5] = false;
						if (this.boolean_hb || var4) {
							j.a(super.B[var5], (byte) 2, this, var4, this.int_jb, 120, var5);
						}

						return;
					}

					this.booleans_eb[var5] = true;
					if (!var4) {
						break label108;
					}

					super.N[var5] = uc.a(28199, var1, false);
					if (client.int_gc == 0) {
						break label108;
					}
				}

				if (this.boolean_kb) {
					throw new RuntimeException();
				}

				if (var1 == null) {
					j.a(this.int_bb, (byte) 0, this, true, 255, 122, this.int_jb);
					return;
				}

				r.W.reset();
				r.W.update(var1, 0, var1.length);
				var6 = (int) r.W.getValue();
				if (var6 != this.int_bb) {
					j.a(this.int_bb, (byte) 0, this, true, 255, 104, this.int_jb);
					return;
				}

				ja var12;
				try {
					var12 = new ja(od.a((byte) -53, var1));
				} catch (RuntimeException var10) {
					j.a(this.int_bb, (byte) 0, this, true, 255, 114, this.int_jb);
					return;
				}

				int var8 = var12.j((byte) 96);
				if (var8 != 5 && ~var8 != -7) {
					j.a(this.int_bb, (byte) 0, this, true, 255, 106, this.int_jb);
					return;
				}

				int var9 = 0;
				if (var8 >= 6) {
					var9 = var12.l(15);
				}

				if (~this.int_qb != ~var9) {
					j.a(this.int_bb, (byte) 0, this, true, 255, 98, this.int_jb);
					return;
				}

				this.a(var1, 5540);
				this.d((byte) 126);
			}

			if (var3) {
				this.d((byte) -16);
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "oh.NA(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	oh(wb class_wb, wb class_wb2, int cacheID, boolean flag, boolean flag2, boolean flag3) {
		super(flag, flag2);

		try {
			this.boolean_hb = flag3;
			this.wb_nb = class_wb;
			this.yb = class_wb2;
			this.int_jb = cacheID;
			md.a(0, this.int_jb, this);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "oh.<init>(" + (class_wb != null ? "{...}" : "null") + ',' + (class_wb2 != null ? "{...}" : "null") + ',' + cacheID + ',' + flag + ',' + flag2 + ',' + flag3 + ')');
		}
	}

	public static void e(int var0) {
		try {
			lf_wb = null;
			lf_cb = null;
			lf_mb = null;
			noclipCommand = null;
			Bb = null;
			lf_rb = null;
			lf_ob = null;
			if (var0 != -1) {
				lf_cb = null;
			}

			zb = null;
			lf_ub = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "oh.KA(" + var0 + ')');
		}
	}

	private final void d(byte var1) {
		int var4 = client.int_gc;

		try {
			++int_lb;
			if (var1 <= 64) {
				this.int_jb = 89;
			}

			this.booleans_eb = new boolean[super.N.length];
			int var2 = 0;
			if (var4 != 0) {
				this.booleans_eb[var2] = false;
				++var2;
			}

			while (~var2 > ~this.booleans_eb.length) {
				this.booleans_eb[var2] = false;
				++var2;
			}

			if (this.wb_nb == null) {
				this.boolean_kb = true;
			} else {
				this.int_ib = -1;
				int var3 = 0;
				if (var4 == 0 && this.booleans_eb.length <= var3) {
					if (this.int_ib == -1) {
						this.boolean_kb = true;
					}
				} else {
					do {
						if (super.A[var3] > 0) {
							ig.a(this.wb_nb, var3, this, (byte) 127);
							this.int_ib = var3;
						}

						++var3;
					} while (this.booleans_eb.length > var3);

					if (this.int_ib == -1) {
						this.boolean_kb = true;
					}
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "oh.JA(" + var1 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, bg var4, boolean var5, int var6) {
		try {
			be.bg_l = var4;
			ag.int_a = var6;
			if (var0 != -24390) {
				e(-121);
			}

			pf.int_gb = var3;
			ig.int_r = 1;
			hc.int_ob = var1;
			++int_db;
			jc.C = var5;
			hc.int_eb = var2;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "oh.IA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
		}
	}

	final int f(int var1) {
		try {
			++int_gb;
			if (this.boolean_kb) {
				return 100;
			} else if (super.N != null) {
				return 99;
			} else if (var1 > -16) {
				return -38;
			} else {
				int percentage = cg.a(1023, 255, this.int_jb);
				if (percentage >= 100) {
					percentage = 99;
				}

				return percentage;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "oh.HA(" + var1 + ')');
		}
	}

	static {
		lf_ob = lf_ub;
		zb = dd.a("wave2:", 2);
		lf_rb = zb;
		Bb = dd.a("Your account has been disabled)3", 2);
		lf_wb = Bb;
		lf_cb = zb;
	}
}
