final class ma {

	static int int_a;
	static int int_b;
	private tf tf_c = new tf();
	static lf lf_d;
	static eh eh_e;
	static int int_f;
	private static lf lf_g = dd.a("shake:", 2);
	static int int_h = 0;
	private int int_i;
	static int int_j;
	private int[][] ints_k;
	static lf lf_l;
	static int int_m;
	private int int_n = -1;
	private int int_o = 0;
	private hd[] hds_p;
	static aa aa_q;
	static lf lf_r;
	static lf lf_s;
	private static lf lf_t;
	private int int_u;
	boolean boolean_v = false;

	final int[][] a(byte var1) {
		int var3 = client.int_gc;

		try {
			++int_f;
			if (~this.int_i != ~this.int_u) {
				throw new RuntimeException("Can only retrieve a full image cache");
			} else {
				int var2 = 0;
				if (var3 != 0) {
					this.hds_p[var2] = la.hd_h;
					++var2;
				}

				while (var2 < this.int_u) {
					this.hds_p[var2] = la.hd_h;
					++var2;
				}

				if (var1 > -18) {
					this.int_u = -111;
				}

				return this.ints_k;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ma.C(" + var1 + ')');
		}
	}

	static final boolean a(byte var0, vg var1) {
		try {
			int var2 = -127 / ((-76 - var0) / 45);
			++int_b;
			if (ra.Y) {
				if (~ne.a(var1, 110) != -1) {
					return false;
				}

				if (var1.int_ib == 0) {
					return false;
				}
			}

			return var1.B;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ma.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, int var2) {
		try {
			++int_a;
			if (var1 != -314) {
				return null;
			} else if (this.int_u == this.int_i) {
				this.boolean_v = this.hds_p[var2] == null;
				this.hds_p[var2] = la.hd_h;
				return this.ints_k[var2];
			} else if (this.int_u != 1) {
				hd var3 = this.hds_p[var2];
				if (this.boolean_v = var3 == null) {
					label37:
					{
						if (~this.int_u < ~this.int_o) {
							var3 = new hd(var2, this.int_o);
							++this.int_o;
							if (client.int_gc == 0) {
								break label37;
							}
						}

						hd var4 = (hd) this.tf_c.a(var1 ^ -321);
						var3 = new hd(var2, var4.int_o);
						this.hds_p[var4.int_s] = null;
						var4.a(true);
					}

					this.hds_p[var2] = var3;
				}

				this.tf_c.a(var3, (byte) -69);
				return this.ints_k[var3.int_o];
			} else {
				this.boolean_v = ~this.int_n != ~var2;
				this.int_n = var2;
				return this.ints_k[0];
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ma.A(" + var1 + ',' + var2 + ')');
		}
	}

	public static void a(int var0) {
		try {
			aa_q = null;
			lf_g = null;
			lf_s = null;
			if (var0 != 2) {
				lf_d = null;
			}

			lf_l = null;
			lf_r = null;
			eh_e = null;
			lf_d = null;
			lf_t = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ma.F(" + var0 + ')');
		}
	}

	final void b(int var1) {
		int var3 = client.int_gc;

		try {
			++int_m;
			int var2 = 0;
			if (var3 != 0) {
				this.ints_k[var2] = null;
				++var2;
			}

			while (~this.int_u < ~var2) {
				this.ints_k[var2] = null;
				++var2;
			}

			this.hds_p = null;
			if (var1 < 11) {
				this.a((byte) -76);
			}

			this.ints_k = null;
			this.tf_c.e(-15004);
			this.tf_c = null;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ma.E(" + var1 + ')');
		}
	}

	static final boolean a(vg var0, byte var1) {
		try {
			++int_j;
			int var2 = var0.Xb;
			if (~var2 == -206) {
				bb.S = 250;
				return true;
			} else if (var1 != -59) {
				return true;
			} else {
				int var3;
				int var4;
				if (var2 >= 300 && ~var2 >= -314) {
					var4 = 1 & var2;
					var3 = (-300 + var2) / 2;
					pe.be_c.a(var3, var1 + 170, var4 == 1);
				}

				if (~var2 <= -315 && var2 <= 323) {
					var3 = (-314 + var2) / 2;
					var4 = var2 & 1;
					pe.be_c.b(-114, var3, ~var4 == -2);
				}

				if (~var2 == -325) {
					pe.be_c.a(false, (byte) 1);
				}

				if (~var2 == -326) {
					pe.be_c.a(true, (byte) -85);
				}

				if (~var2 == -327) {
					vg.J.e((byte) 105, 253);
					++dc.X;
					pe.be_c.a(var1 + -41, vg.J);
					return true;
				} else {
					return false;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ma.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	ma(int var1, int var2, int var3) {
		try {
			this.ints_k = new int[var1][var3];
			this.hds_p = new hd[var2];
			this.int_i = var2;
			this.int_u = var1;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ma.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static {
		lf_d = lf_g;
		lf_l = lf_g;
		eh_e = new eh(8);
		lf_r = dd.a("Wordpack geladen)3", 2);
		lf_t = dd.a("Please contact customer support)3", 2);
		lf_s = lf_t;
	}
}
