import java.awt.Component;

final class n extends uf {

	static int int_h;
	static int int_i;
	static int int_j;
	static kf[] kfs_k;
	static lf lf_l = dd.a("Regeln versto-8en hat)3", 2);
	static ed[] eds_m = new ed[5000];
	private long long_n;
	private int int_o;
	static int int_p;
	static int int_q;
	static int int_r;
	static int int_s;
	static int int_t;
	private int int_u;
	private long[] longs_v;
	private int int_w;
	private int x;
	static int y;
	static int z;

	static final void c(int var0) {
		int var4 = client.int_gc;

		try {
			va.int_bb = -1;
			vg.J.P = 0;
			e.int_d = 0;
			++int_q;
			wb.int_g = var0;
			ka.I.P = 0;
			ci.int_tb = 0;
			bd.int_o = -1;
			of.int_r = -1;
			f.boolean_ab = false;
			di.V = 0;
			mc.A = 0;
			id.C = -1;
			qa.int_eb = 0;
			int var1 = 0;
			if (var4 != 0) {
				if (w.us_e[var1] != null) {
					w.us_e[var1].Mb = -1;
				}

				++var1;
			}

			for (; ~var1 > ~w.us_e.length; ++var1) {
				if (w.us_e[var1] != null) {
					w.us_e[var1].Mb = -1;
				}
			}

			int var2 = 0;
			if (var4 != 0 || ~th.ps_g.length < ~var2) {
				do {
					if (th.ps_g[var2] != null) {
						th.ps_g[var2].Mb = -1;
					}

					++var2;
				} while (~th.ps_g.length < ~var2);
			}

			ha.a(102);
			de.a(30, (byte) -64);
			int var3 = 0;
			if (var4 != 0 || var3 < 100) {
				do {
					va.booleans_db[var3] = true;
					++var3;
				} while (var3 < 100);

			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "n.G(" + var0 + ')');
		}
	}

	public static void d(int var0) {
		try {
			kfs_k = null;
			eds_m = null;
			if (var0 != 0) {
				int_h = 56;
			}

			lf_l = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "n.I(" + var0 + ')');
		}
	}

	static final void e(int var0) {
		int var2 = client.int_gc;

		try {
			++int_j;
			if (fd.nd_s != null) {
				fd.nd_s.a((byte) -94);
				fd.nd_s = null;
			}

			nd.b((byte) -93);
			ce.a();
			int var1 = 0;
			if (var2 != 0) {
				sb.lbs_e[var1].a(true);
				++var1;
			}

			while (var1 < 4) {
				sb.lbs_e[var1].a(true);
				++var1;
			}

			System.gc();
			eh.b(2, 1);
			oa.R = var0;
			de.boolean_q = false;
			lf.c((int) 110);
			de.a(10, (byte) -64);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "n.H(" + var0 + ')');
		}
	}

	final int a(int var1, int var2, byte var3) {
		int dummy = client.int_gc;

		try {
			++int_t;
			int var4 = this.x;
			if (var3 != -58) {
				a(54, -116);
			}

			this.x = 300;
			int var5 = this.int_o;
			this.int_o = 1;
			this.long_n = nb.a(false);
			if (this.longs_v[this.int_w] == 0L) {
				this.x = var4;
				this.int_o = var5;
			} else if (this.longs_v[this.int_w] < this.long_n) {
				this.x = (int) ((long) (var1 * 2560) / (-this.longs_v[this.int_w] + this.long_n));
			}

			if (this.x < 25) {
				this.x = 25;
			}

			if (this.x > 256) {
				this.x = 256;
				this.int_o = (int) ((long) var1 - (-this.longs_v[this.int_w] + this.long_n) / 10L);
			}

			if (this.int_o > var1) {
				this.int_o = var1;
			}

			this.longs_v[this.int_w] = this.long_n;
			this.int_w = (1 + this.int_w) % 10;
			int var6;
			if (this.int_o > 1) {
				var6 = 0;
				do {
					if (this.longs_v[var6] != 0L) {
						this.longs_v[var6] += (long) this.int_o;
					}

					++var6;
				} while (var6 < 10);
			}

			if (var2 > this.int_o) {
				this.int_o = var2;
			}

			fc.a((long) this.int_o, -113);
			var6 = 0;
			while (this.int_u < 256) {
				this.int_u += this.x;
				++var6;
			}

			this.int_u &= 255;
			return var6;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "n.A(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(int var0, Component var1) {
		try {
			var1.removeKeyListener(wc.Q);
			var1.removeFocusListener(wc.Q);
			++int_r;
			hh.M = var0;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "n.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void b(int var1) {
		int var3 = client.int_gc;

		try {
			++y;
			int var2 = var1;
			if (var3 != 0 || var1 < 10) {
				do {
					this.longs_v[var2] = 0L;
					++var2;
				} while (var2 < 10);

			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "n.E(" + var1 + ')');
		}
	}

	n() {
		this.longs_v = new long[10];

		try {
			this.int_u = 0;
			this.x = 256;
			this.int_o = 1;
			this.long_n = nb.a(false);
			int var1 = 0;
			do {
				this.longs_v[var1] = this.long_n;
				++var1;
			} while (var1 < 10);

		} catch (RuntimeException var3) {
			throw ec.a(var3, "n.<init>(" + ')');
		}
	}

	static final void a(int var0, int var1) {
		try {
			if (var0 != 255) {
				int_i = -60;
			}

			++int_s;
			lc var2 = (lc) hg.eh_l.a((long) var1, (byte) -76);
			if (var2 != null) {
				var2.a(true);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "n.F(" + var0 + ',' + var1 + ')');
		}
	}
}
