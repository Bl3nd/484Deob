final class eh {

	static int int_a;
	static lf lf_b = dd.a("oberen Rand der Webseite ausw-=hlen)3", 2);
	static int int_c;
	static int int_d;
	static int int_e;
	static lf lf_f;
	private hb[] hbs_g;
	private static lf lf_h = dd.a("Your ignore list is full)3 Max of 100 users)3", 2);
	static int int_i;
	static int int_j;
	static lf lf_k;
	static int int_l;
	private int int_m;
	static int int_n;
	static ke ke_o;
	static int int_p;
	static int int_q;
	static int int_r;
	static int[] ints_s;
	static int int_t;
	private hb hb_u;
	private long long_v;
	private hb hb_w;
	private int x = 0;

	static final boolean a(int var0, int var1) {
		try {
			if (var0 != 1) {
				lf_k = null;
			}

			++int_i;
			return ~(var1 >> -1899555052 & 1) != -1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "eh.D(" + var0 + ',' + var1 + ')');
		}
	}

	final hb a(int var1) {
		try {
			++int_r;
			if (this.hb_u == null) {
				return null;
			} else {
				for (hb var2 = this.hbs_g[(int) (this.long_v & (long) (var1 + this.int_m))]; var2 != this.hb_u; this.hb_u = this.hb_u.hb_i) {
					if (this.long_v == this.hb_u.long_e) {
						hb var3 = this.hb_u;
						this.hb_u = this.hb_u.hb_i;
						return var3;
					}
				}

				this.hb_u = null;
				return null;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "eh.J(" + var1 + ')');
		}
	}

	public static void b(int var0) {
		try {
			ke_o = null;
			lf_b = null;
			lf_f = null;
			lf_h = null;
			ints_s = null;
			lf_k = null;
			if (var0 != -8917) {
				ints_s = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "eh.E(" + var0 + ')');
		}
	}

	static final void b(int var0, int var1) {
		try {
			ag.int_a = 0;
			hc.int_eb = -1;
			++int_t;
			jc.C = false;
			hc.int_ob = var0;
			ig.int_r = var1;
			pf.int_gb = -1;
			be.bg_l = null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "eh.B(" + var0 + ',' + var1 + ')');
		}
	}

	final int a(hb[] var1, int var2) {
		int var7 = client.int_gc;

		try {
			++int_l;
			int var3 = 0;
			int var4 = 0;
			if (var7 == 0 && var4 >= this.int_m) {
				if (var2 <= 85) {
					lf_b = null;
				}

				return var3;
			} else {
				do {
					hb var5 = this.hbs_g[var4];
					hb var6 = var5.hb_i;
					if (var7 == 0 && var6 == var5) {
						++var4;
					} else {
						do {
							var1[var3++] = var6;
							var6 = var6.hb_i;
						} while (var6 != var5);

						++var4;
					}
				} while (var4 < this.int_m);

				if (var2 <= 85) {
					lf_b = null;
				}

				return var3;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "eh.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final hb c(int var1) {
		try {
			++int_d;
			hb var2;
			if (this.x > 0 && this.hbs_g[this.x - 1] != this.hb_w) {
				var2 = this.hb_w;
				this.hb_w = var2.hb_i;
				return var2;
			} else {
				while (~this.int_m < ~this.x) {
					var2 = this.hbs_g[this.x++].hb_i;
					if (var2 != this.hbs_g[-1 + this.x]) {
						this.hb_w = var2.hb_i;
						return var2;
					}
				}

				if (var1 != 1) {
					this.a(-110L, (byte) 111);
				}

				return null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "eh.F(" + var1 + ')');
		}
	}

	final int d(int var1) {
		int var6 = client.int_gc;

		try {
			++int_c;
			int var2 = 0;
			int var3 = var1;
			if (var6 == 0 && this.int_m <= var1) {
				return var2;
			} else {
				do {
					hb var4 = this.hbs_g[var3];
					hb var5 = var4.hb_i;
					if (var6 != 0) {
						var5 = var5.hb_i;
						++var2;
					}

					while (var5 != var4) {
						var5 = var5.hb_i;
						++var2;
					}

					++var3;
				} while (this.int_m > var3);

				return var2;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "eh.H(" + var1 + ')');
		}
	}

	final hb a(long var1, byte var3) {
		try {
			++int_a;
			if (var3 >= -74) {
				a(-78, -86);
			}

			this.long_v = var1;
			hb var4 = this.hbs_g[(int) ((long) (-1 + this.int_m) & var1)];

			for (this.hb_u = var4.hb_i; var4 != this.hb_u; this.hb_u = this.hb_u.hb_i) {
				if (var1 == this.hb_u.long_e) {
					hb var5 = this.hb_u;
					this.hb_u = this.hb_u.hb_i;
					return var5;
				}
			}

			this.hb_u = null;
			return null;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "eh.A(" + var1 + ',' + var3 + ')');
		}
	}

	final hb a(byte var1) {
		try {
			++int_e;
			if (var1 <= 60) {
				this.long_v = 73L;
			}

			this.x = 0;
			return this.c(1);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "eh.I(" + var1 + ')');
		}
	}

	final void a(long fileID, boolean var3, hb class_hb) {
		try {
			++int_p;
			if (class_hb.hb_f != null) {
				class_hb.a(true);
			}

			hb var5 = this.hbs_g[(int) ((long) (this.int_m + -1) & fileID)];
			class_hb.hb_i = var5;
			class_hb.hb_f = var5.hb_f;
			class_hb.hb_f.hb_i = class_hb;
			class_hb.hb_i.hb_f = class_hb;
			if (var3) {
				lf_h = null;
			}

			class_hb.long_e = fileID;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "eh.C(" + fileID + ',' + var3 + ',' + "{...}" + ')');
		}
	}

	eh(int size) {
		try {
			this.hbs_g = new hb[size];
			this.int_m = size;

			for (int var2 = 0; size > var2; ++var2) {
				hb var3 = this.hbs_g[var2] = new hb();
				var3.hb_i = var3;
				var3.hb_f = var3;
			}

		} catch (RuntimeException var4) {
			throw ec.a(var4, "eh.<init>(" + size + ')');
		}
	}

	static {
		lf_f = lf_h;
		int_n = 0;
		int_q = 0;
		lf_k = dd.a("Der Anmelde)2Server ist offline)3", 2);
	}
}
