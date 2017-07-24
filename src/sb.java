final class sb {

	static lf lf_a = dd.a("Bitte versuchen Sie)1", 2);
	static bg bg_b;
	static int int_c;
	static int int_d;
	static lb[] lbs_e = new lb[4];
	static lf lf_f = dd.a("Fehler bei der Verbindung zum Server)3", 2);
	static int int_g;
	static int int_h;
	static int int_i = 0;
	static fd[] fds_j;
	static lf lf_k = dd.a("Die Verbindung konnte", 2);

	public static void a(byte var0) {
		try {
			lf_f = null;
			fds_j = null;
			bg_b = null;
			lf_a = null;
			lf_k = null;
			if (var0 <= -126) {
				lbs_e = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sb.B(" + var0 + ')');
		}
	}

	static final void a(int var0, ic var1) {
		try {
			long var2 = 0L;
			if (~var1.E == -1) {
				var2 = bg.c(var1.int_o, var1.int_s, var1.int_n);
			}

			if (~var1.E == -2) {
				var2 = hd.a(var1.int_o, var1.int_s, var1.int_n);
			}

			int var5 = var0;
			int var4 = -1;
			int var6 = 0;
			++int_g;
			if (~var1.E == -3) {
				var2 = tc.d(var1.int_o, var1.int_s, var1.int_n);
			}

			if (var1.E == 3) {
				var2 = hh.a(var1.int_o, var1.int_s, var1.int_n);
			}

			if (~var2 != -1L) {
				var6 = (int) var2 >> -367405164 & 3;
				var4 = Integer.MAX_VALUE & (int) (var2 >>> -619910368);
				var5 = (517978 & (int) var2) >> 1198703246;
			}

			var1.int_u = var5;
			var1.int_w = var6;
			var1.int_q = var4;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sb.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
