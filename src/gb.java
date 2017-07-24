final class gb extends ka {

	private int int_ab;
	static int int_bb;
	int int_cb;
	private int int_db;
	private double double_eb;
	static int int_fb = 0;
	private double double_gb;
	static int int_hb;
	static int int_ib;
	static int int_jb;
	private boolean boolean_kb = false;
	int int_lb;
	private double double_mb;
	private double double_nb;
	int int_ob;
	static int int_pb;
	double double_qb;
	static int int_rb = 0;
	private bi bi_sb;
	double double_tb;
	private int int_ub;
	private int int_vb;
	double double_wb;
	static int xb;
	private int yb = 0;
	private int zb = 0;
	int Ab;
	private int Bb;
	int Cb;
	private double Db;
	int Eb;
	private int Fb;
	private int Gb;

	static final void a(boolean var0, int var1) {
		int var9 = client.int_gc;

		try {
			if (r.X.int_fb >> -2081421401 == e.int_d && ~ka.S == ~(r.X.int_nc >> -65169049)) {
				e.int_d = 0;
			}

			++int_jb;
			int var2 = r.Y;
			if (var0) {
				var2 = 1;
			}

			int var3 = var1;
			if (var9 != 0 || ~var2 < ~var1) {
				do {
					u var4;
					long var5;
					label77:
					{
						if (!var0) {
							var5 = (long) nd.ints_k[var3] << 434987552;
							var4 = w.us_e[nd.ints_k[var3]];
							if (var9 == 0) {
								break label77;
							}
						}

						var4 = r.X;
						var5 = 8791798054912L;
					}

					if (var4 != null && var4.c(0)) {
						int var7 = var4.int_fb >> 634775879;
						var4.Fc = false;
						if ((tf.boolean_q && ~r.Y < -51 || r.Y > 200) && !var0 && var4.Jb == var4.int_ab) {
							var4.Fc = true;
						}

						int var8 = var4.int_nc >> 1189224487;
						if (~var7 <= -1 && ~var7 > -105 && ~var8 <= -1 && var8 < 104) {
							label97:
							{
								if (var4.Ec != null && ~var4.int_fd >= ~pd.int_i && var4.Oc > pd.int_i) {
									var4.Fc = false;
									var4.Ob = bh.a(var4.int_nc, false, hc.int_pb, var4.int_fb);
									pa.a(hc.int_pb, var4.int_fb, var4.int_nc, var4.Ob, var4, var4.int_mb, var5, var4.Gc, var4.xc, var4.int_vc, var4.Uc);
									if (var9 == 0) {
										break label97;
									}
								}

								if (~(127 & var4.int_fb) == -65 && ~(127 & var4.int_nc) == -65) {
									if (~fd.int_t == ~ig.ints_q[var7][var8]) {
										break label97;
									}

									ig.ints_q[var7][var8] = fd.int_t;
								}

								var4.Ob = bh.a(var4.int_nc, false, hc.int_pb, var4.int_fb);
								ka.a(hc.int_pb, var4.int_fb, var4.int_nc, var4.Ob, 60, var4, var4.int_mb, var5, var4.boolean_fc);
							}
						}
					}

					++var3;
				} while (~var2 < ~var3);

			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "gb.C(" + var0 + ',' + var1 + ')');
		}
	}

	final void b(int var1, int var2, int var3, int var4, int var5) {
		try {
			++int_ib;
			double var6;
			if (!this.boolean_kb) {
				var6 = (double) (-this.int_db + var5);
				double var8 = (double) (-this.Gb + var3);
				double var10 = Math.sqrt(var6 * var6 + var8 * var8);
				this.double_tb = (double) this.int_vb * var8 / var10 + (double) this.Gb;
				this.double_wb = (double) this.int_vb * var6 / var10 + (double) this.int_db;
				this.double_qb = (double) this.Bb;
			}

			var6 = (double) (1 + this.Eb - var1);
			this.double_mb = (-this.double_tb + (double) var3) / var6;
			this.double_gb = ((double) var5 - this.double_wb) / var6;
			this.Db = Math.sqrt(this.double_gb * this.double_gb + this.double_mb * this.double_mb);
			if (var2 > 7) {
				if (!this.boolean_kb) {
					this.double_eb = -this.Db * Math.tan((double) this.int_ab * 0.02454369D);
				}

				this.double_nb = ((double) var4 - this.double_qb - var6 * this.double_eb) * 2.0D / (var6 * var6);
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "gb.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	final void a(int var1, byte var2) {
		int var4 = client.int_gc;

		try {
			this.double_tb += (double) var1 * this.double_mb;
			++xb;
			this.boolean_kb = true;
			this.double_wb += (double) var1 * this.double_gb;
			this.double_qb += (double) var1 * this.double_eb + this.double_nb * 0.5D * (double) var1 * (double) var1;
			this.double_eb += this.double_nb * (double) var1;
			this.int_lb = 2047 & 1024 + (int) (Math.atan2(this.double_gb, this.double_mb) * 325.949D);
			this.Fb = 2047 & (int) (Math.atan2(this.double_eb, this.Db) * 325.949D);
			int var3 = 92 % ((var2 - 42) / 34);
			if (this.bi_sb != null) {
				this.yb += var1;
				if (var4 != 0 || ~this.bi_sb.T[this.zb] > ~this.yb) {
					do {
						this.yb -= this.bi_sb.T[this.zb];
						++this.zb;
						if (this.bi_sb.Q.length <= this.zb) {
							this.zb -= this.bi_sb.int_fb;
							if (~this.zb > -1 || this.bi_sb.Q.length <= this.zb) {
								this.zb = 0;
							}
						}
					} while (~this.bi_sb.T[this.zb] > ~this.yb);

				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "gb.B(" + var1 + ',' + var2 + ')');
		}
	}

	final ue b(int var1) {
		try {
			++int_bb;
			int var2 = -56 / ((61 - var1) / 46);
			lh var3 = v.c(this.int_ub, -18753);
			ue var4 = var3.a(this.zb, 127);
			if (var4 == null) {
				return null;
			} else {
				var4.c(this.Fb);
				return var4;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "gb.FA(" + var1 + ')');
		}
	}

	gb(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		try {
			this.Bb = var5;
			this.int_cb = var11;
			this.Eb = var7;
			this.Cb = var10;
			this.int_vb = var9;
			this.int_db = var3;
			this.int_ob = var2;
			this.Ab = var6;
			this.int_ab = var8;
			this.boolean_kb = false;
			this.int_ub = var1;
			this.Gb = var4;
			int var12 = v.c(this.int_ub, -18753).Z;
			if (var12 == -1) {
				this.bi_sb = null;
			} else {
				this.bi_sb = client.a(12, var12);
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "gb.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}
}
