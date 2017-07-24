final class qe extends RuntimeException {

	static lf lf_a = dd.a("<col=80ff00>", 2);
	static int int_b;
	static int int_c;
	static lf lf_d = dd.a(" loggt sich aus)3", 2);
	String string_e;
	Throwable throwable_f;
	static int int_g;
	static lf lf_h = dd.a("mn", 2);
	static lf p11_full = dd.a("p11_full", 2);//lf_i
	static int int_j;

	static final void a(int var0, int var1, int var2) {
		try {
			++int_g;
			if (~tc.R != -1 && ~var2 != 0) {
				be.a(0, -110, tc.R, var2, false, ka.cache11);
				de.boolean_q = true;
			}

			if (var0 != 0) {
				a(29, (short[]) null, (lf[]) null);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "qe.C(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void a(int var0) {
		try {
			if (var0 != 95) {
				a(-60, (short[]) null, (lf[]) null);
			}

			lf_a = null;
			lf_h = null;
			lf_d = null;
			p11_full = null;
		} catch (RuntimeException var2) {
			throw var2;
		}
	}

	qe(Throwable var1, String var2) {
		try {
			this.string_e = var2;
			this.throwable_f = var1;
		} catch (RuntimeException var4) {
			throw var4;
		}
	}

	static final void a(int var0, short[] var1, lf[] var2) {
		try {
			++int_j;
			bc.a(0, var1, -1 + var2.length, var2, (byte) -127);
			if (var0 != 27843) {
				a(29, -82, 105);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "qe.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
}
