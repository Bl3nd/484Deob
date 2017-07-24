final class dh {

	static int int_a;
	static lf lf_b = dd.a("m-Ochte mit Ihnen handeln)3", 2);
	private static lf lf_c = dd.a("Unexpected server response)3", 2);
	static lf lf_d;
	static lf lf_e;
	static int int_f;
	static volatile int int_g;
	static oh cache10;//oh_h
	static int int_i;
	static int int_j;
	static short[] shorts_k;
	static int int_l;

	static final void a(byte var0) {
		int var3 = client.int_gc;

		try {
			++int_j;
			pe.uf_h.b(0);
			if (var0 != 1) {
				lf_c = null;
			}

			int var1 = 0;
			if (var3 != 0 || var1 < 32) {
				do {
					ka.V[var1] = 0L;
					++var1;
				} while (var1 < 32);
			}

			int var2 = 0;
			if (var3 != 0) {
				rf.X[var2] = 0L;
				++var2;
			}

			while (~var2 > -33) {
				rf.X[var2] = 0L;
				++var2;
			}

			mf.int_u = 0;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "dh.A(" + var0 + ')');
		}
	}

	static final int a(int var0, int var1, int var2, int var3, int var4) {
		try {
			++int_a;
			if (var2 != 31246) {
				lf_c = null;
			}

			int var5 = 65536 - nc.ints_bb[var4 * 1024 / var0] >> -818007391;
			return (var3 * (65536 - var5) >> 800598256) - -(var1 * var5 >> 1072767120);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "dh.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	public static void a(int var0) {
		try {
			cache10 = null;
			lf_d = null;
			shorts_k = null;
			lf_c = null;
			if (var0 != -818007391) {
				a((int) -43);
			}

			lf_e = null;
			lf_b = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "dh.C(" + var0 + ')');
		}
	}

	static {
		lf_e = lf_c;
		lf_d = dd.a("Keine Antwort vom Anmelde)2Server)3", 2);
		int_g = -1;
	}
}
