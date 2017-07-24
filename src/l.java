import java.awt.Graphics;

final class l {

	static int int_a;
	static int[] ints_b = new int[1000];
	static int[] ints_c = new int[1000];
	static int int_d;
	static int[] ints_e;
	static oh cache6;//oh_f
	static te te_g;
	static int int_h;
	static int int_i;
	static rg[][] rgs_j;
	static int int_k;
	static int int_l;
	static int[] ints_m;
	static int int_n = 4;
	private ph ph_o = new ph();
	static int int_p;
	static int int_q;
	static lf scrollbar;//lf_r
	static int int_s;
	static int[] ints_t;
	static int[] ints_u;

	final void a(byte var1, ph var2) {
		try {
			++int_a;
			if (var2.ph_r != null) {
				var2.c((byte) 3);
			}

			var2.ph_r = this.ph_o;
			if (var1 != -89) {
				ints_t = null;
			}

			var2.B = this.ph_o.B;
			var2.ph_r.B = var2;
			var2.B.ph_r = var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "l.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(int var0) {
		try {
			rgs_j = null;
			ints_t = null;
			scrollbar = null;
			ints_c = null;
			cache6 = null;
			te_g = null;
			ints_m = null;
			ints_b = null;
			ints_e = null;
			if (var0 != 255) {
				ints_u = null;
			}

			ints_u = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "l.H(" + var0 + ')');
		}
	}

	final void a(int var1, ph var2) {
		try {
			++int_d;
			if (var2.ph_r != null) {
				var2.c((byte) 3);
			}

			var2.B = this.ph_o;
			var2.ph_r = this.ph_o.ph_r;
			var2.ph_r.B = var2;
			if (var1 != 18619) {
				int_l = 1;
			}

			var2.B.ph_r = var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "l.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final lf a(int var0, int var1) {
		try {
			if (var1 != -1665) {
				ints_b = null;
			}

			++int_k;
			return de.a(new lf[]{fa.a((byte) 85, var0 >> -805556008 & 255), ea.lf_b, fa.a((byte) 85, (16743773 & var0) >> 400770512), ea.lf_b, fa.a((byte) 85, (var0 & 'ﾐ') >> -2034895672), ea.lf_b, fa.a((byte) 85, var0 & 255)}, var1 ^ 1762);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "l.C(" + var0 + ',' + var1 + ')');
		}
	}

	final ph a(byte var1) {
		try {
			++int_h;
			ph var2 = this.ph_o.B;
			if (var2 == this.ph_o) {
				return null;
			} else {
				var2.c((byte) 3);
				if (var1 > -41) {
					this.a(true);
				}

				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "l.B(" + var1 + ')');
		}
	}

	static final lf[] a(byte var0, lf[] var1) {
		int var4 = client.int_gc;

		try {
			++int_p;
			lf[] var2 = new lf[5];
			if (var0 > -72) {
				te_g = null;
			}

			int var3 = 0;
			if (var4 == 0 && ~var3 <= -6) {
				return var2;
			} else {
				do {
					var2[var3] = de.a(new lf[]{fa.a((byte) 85, var3), ab.G}, 127);
					if (var1 != null && var1[var3] != null) {
						var2[var3] = de.a(new lf[]{var2[var3], var1[var3]}, 122);
					}

					++var3;
				} while (~var3 > -6);

				return var2;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "l.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(lf var0, int var1, boolean var2) {
		try {
			++int_i;
			byte var3 = 4;
			int var6 = jg.db_r.b(var0, 250);
			int var4 = var3 + 6;
			int var7 = 13 * jg.db_r.c(var0, 250);
			int var5 = 6 + var3;
			b.e(-var3 + var4, -var3 + var5, var3 + var3 + var6, var3 + var7 + var3, 0);
			b.c(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 16777215);
			jg.db_r.a(var0, var4, var5, var6, var7, 16777215, var1, 1, 1, 0);
			v.a(var7 + var3 + var3, var5 - var3, var4 + -var3, var6 - (-var3 - var3), var1 ^ -189);
			if (!var2) {
				tg.a(var6, 0, var7, var4, var5);
			} else {
				try {
					Graphics var8 = ae.U.getGraphics();
					gh.Z.a(0, (byte) -121, (Graphics) var8, 0);
				} catch (Exception var9) {
					ae.U.repaint();
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "l.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	final ph a(boolean var1) {
		try {
			if (var1) {
				return null;
			} else {
				ph var2 = this.ph_o.B;
				++int_q;
				return var2 == this.ph_o ? null : var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "l.D(" + var1 + ')');
		}
	}

	public l() {
		try {
			this.ph_o.ph_r = this.ph_o;
			this.ph_o.B = this.ph_o;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "l.<init>(" + ')');
		}
	}

	static {
		rgs_j = new rg[int_n][500];
		ints_e = new int[int_n];
		scrollbar = dd.a("scrollbar", 2);
		ints_u = new int[]{-1, -1, 1, 1};
	}
}
