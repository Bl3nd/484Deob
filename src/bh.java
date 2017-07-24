final class bh extends ka {

	private bi bi_ab;
	static volatile int int_bb = 0;
	static lf lf_cb = dd.a("oder benutzen Sie eine andere Welt)3", 2);
	private int int_db;
	static int int_eb;
	static ad ad_fb;
	private int int_gb;
	private int int_hb;
	static lf lf_ib = null;
	static int int_jb;
	static int int_kb;
	private int int_lb;
	private int int_mb;
	private int int_nb;
	static int int_ob = 0;
	private int int_pb;
	private int int_qb;
	static int int_rb = 500;
	static int int_sb;

	final ue b(int var1) {
		int var14 = client.int_gc;

		try {
			if (this.bi_ab != null) {
				int var2;
				label61:
				{
					var2 = pd.int_i + -this.int_db;
					if (~var2 < -101) {
						if (this.bi_ab.int_fb > 0) {
							var2 = 100;
							if (var14 == 0 && var2 <= this.bi_ab.T[this.int_pb]) {
								break label61;
							}
						} else if (var2 <= this.bi_ab.T[this.int_pb]) {
							break label61;
						}
					} else if (var2 <= this.bi_ab.T[this.int_pb]) {
						break label61;
					}

					do {
						var2 -= this.bi_ab.T[this.int_pb];
						++this.int_pb;
						if (this.bi_ab.Q.length <= this.int_pb) {
							this.int_pb -= this.bi_ab.int_fb;
							if (this.int_pb < 0 || ~this.bi_ab.Q.length >= ~this.int_pb) {
								this.bi_ab = null;
								if (var14 == 0) {
									break;
								}
							}
						}
					} while (var2 > this.bi_ab.T[this.int_pb]);
				}

				this.int_db = pd.int_i + -var2;
			}

			++int_sb;
			i var16 = pa.a((int) this.int_lb, 0);
			if (var16.ints_mb != null) {
				var16 = var16.b(41);
			}

			if (var16 == null) {
				return null;
			} else {
				int var3;
				int var4;
				label69:
				{
					if (~this.int_mb == -2 || this.int_mb == 3) {
						var3 = var16.I;
						var4 = var16.L;
						if (var14 == 0) {
							break label69;
						}
					}

					var3 = var16.L;
					var4 = var16.I;
				}

				int var6 = (1 + var3 >> -1614696319) + this.int_gb;
				int var8 = this.int_qb + (var4 - -1 >> -1748648831);
				int var7 = (var4 >> 2034449985) + this.int_qb;
				int var5 = (var3 >> 1599026689) + this.int_gb;
				int[][] var9 = u.vertexHeights[this.int_hb];
				int var10 = var9[var6][var7] + (var9[var5][var7] - (-var9[var5][var8] + -var9[var6][var8])) >> -943226302;
				int var12 = 102 / ((var1 - 61) / 46);
				int var13 = (this.int_qb << 1537858855) + (var4 << -306243706);
				int var11 = (this.int_gb << -982013177) - -(var3 << 568473542);
				return var16.a(this.bi_ab, this.int_nb, var11, this.int_pb, var13, -59, this.int_mb, var10, var9);
			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "bh.FA(" + var1 + ')');
		}
	}

	static final void a(boolean var0, bg var1, bg var2, int var3) {
		try {
			af.boolean_t = var0;
			gh.bg_ab = var2;
			++int_kb;
			if (var3 < 42) {
				d((byte) -110);
			}

			tb.bg_ab = var1;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bh.IA(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			if (var0 != -42) {
				ad_fb = null;
			}

			lf_cb = null;
			ad_fb = null;
			lf_ib = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "bh.JA(" + var0 + ')');
		}
	}

	static final int a(int var0, boolean var1, int var2, int var3) {
		try {
			++int_eb;
			int var4 = var3 >> 901974215;
			if (var1) {
				return 18;
			} else {
				int var5 = var0 >> -243953625;
				if (~var4 <= -1 && var5 >= 0 && var4 <= 103 && ~var5 >= -104) {
					int var6 = var2;
					if (var2 < 3 && (2 & jc.bytes_q[1][var4][var5]) == 2) {
						var6 = var2 + 1;
					}

					int var7 = var3 & 127;
					int var8 = 127 & var0;
					int var10 = u.vertexHeights[var6][var4][var5 - -1] * (-var7 + 128) - -(var7 * u.vertexHeights[var6][var4 + 1][var5 - -1]) >> -399964409;
					int var9 = u.vertexHeights[var6][var4 - -1][var5] * var7 + u.vertexHeights[var6][var4][var5] * (128 + -var7) >> -1734567545;
					return (-var8 + 128) * var9 - -(var10 * var8) >> 1776608871;
				} else {
					return 0;
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "bh.HA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	bh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, ka var9) {
		try {
			this.int_gb = var5;
			this.int_mb = var3;
			this.int_qb = var6;
			this.int_lb = var1;
			this.int_nb = var2;
			this.int_hb = var4;
			if (~var7 != 0) {
				this.bi_ab = client.a(12, var7);
				this.int_db = pd.int_i + -1;
				this.int_pb = 0;
				if (this.bi_ab.int_db == 0 && var9 != null && var9 instanceof bh) {
					bh var10 = (bh) var9;
					if (var10.bi_ab == this.bi_ab) {
						this.int_db = var10.int_db;
						this.int_pb = var10.int_pb;
						return;
					}
				}

				if (var8 && ~this.bi_ab.int_fb != 0) {
					this.int_pb = (int) (Math.random() * (double) this.bi_ab.Q.length);
					this.int_db -= (int) (Math.random() * (double) this.bi_ab.T[this.int_pb]);
					return;
				}
			}

		} catch (RuntimeException var11) {
			throw ec.a(var11, "bh.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + (var9 != null ? "{...}" : "null") + ')');
		}
	}

	static final lf a(int var0, int var1, int var2) {
		try {
			++int_jb;
			int var3 = var1 + -var0;
			if (~var3 > 8) {
				return lh.G;
			} else if (var3 < -6) {
				return cf.y;
			} else if (var3 < -3) {
				return dg.lf_o;
			} else if (~var3 > -1) {
				return qb.Y;
			} else if (~var3 < -10) {
				return di.Q;
			} else if (var3 > 6) {
				return ba.lf_g;
			} else if (var3 > 3) {
				return qe.lf_a;
			} else {
				if (var2 != 32139) {
					int_bb = -40;
				}

				return ~var3 < -1 ? bg.lf_w : lh.H;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bh.GA(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
}
