final class fc extends ph {

	static int[] G;
	static int I;
	static int K;
	static int L = 0;
	static int M;
	static int N;
	static int O;
	static int P = 0;
	static int Q;
	static int R;
	static lf S = dd.a("W-=hlen Sie eine Welt", 2);
	static lf T = dd.a("Unerwartete Antwort vom Anmelde)2Server", 2);
	int U = 0;

	static final void a(bg var0, int var1, bg var2) {
		try {
			fa.bg_hb = var2;
			++M;
			me.z = var0;
			if (var1 == 32413) {
				hf.int_o = fa.bg_hb.b((byte) 11, (int) 3);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "fc.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final int a(int var0, int var1, int var2) {
		try {
			lc var3 = (lc) hg.eh_l.a((long) var2, (byte) -78);
			++O;
			if (var1 != -26917) {
				L = 59;
			}

			return var3 == null ? -1 : (~var0 <= -1 && var3.ints_u.length > var0 ? var3.ints_u[var0] : -1);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "fc.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final void a(ja var1, int var2) {
		int var4 = client.int_gc;

		try {
			++Q;

			do {
				int var3 = var1.j((byte) 77);
				if (~var3 == -1) {
					break;
				}

				this.a(var1, var3, 13707);
			} while (var4 == 0);

			if (var2 != -26780) {
				b(false);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "fc.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			S = null;
			if (var0) {
				a((bg) null, 114, (bg) null);
			}

			T = null;
			G = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fc.G(" + var0 + ')');
		}
	}

	static final void a(long var0, int var2) {
		try {
			++R;
			if (var0 > 0L) {
				int var3 = -71 / ((23 - var2) / 38);
				if (~(var0 % 10L) == -1L) {
					sh.a(-1L + var0, -92);
					sh.a(1L, -124);
				} else {
					sh.a(var0, -100);
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "fc.E(" + var0 + ',' + var2 + ')');
		}
	}

	static final void b(int var0) {
		try {
			ah.bytes_d = new byte[4][104][var0];
			uc.Hb = new int[4][105][105];
			++N;
			l.ints_t = new int[104];
			ua.K = new int[104];
			ie.Lb = 99;
			dd.T = new int[104];
			pc.bytes_d = new byte[4][104][104];
			wb.bytes_s = new byte[4][105][105];
			lc.B = new byte[4][104][104];
			di.W = new int[104];
			jc.z = new byte[4][104][104];
			fh.ints_i = new int[104];
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fc.F(" + var0 + ')');
		}
	}

	private final void a(ja var1, int var2, int var3) {
		try {
			if (var2 == 2) {
				this.U = var1.b(true);
			}

			++I;
			if (var3 != 13707) {
				this.a((ja) null, -35);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "fc.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
}
