final class qd {

	static lf lf_a = dd.a("Bitte versuchen Sie es in ", 2);
	static kf[] kfs_b;
	static lf lf_c = dd.a("Bitte benutzen Sie eine andere Welt)3", 2);
	static lf lf_d;
	private static lf lf_e = dd.a("Loaded sprites", 2);
	static int int_f;

	public static void a(int var0) {
		try {
			if (var0 < 14) {
				a(12);
			}

			kfs_b = null;
			lf_d = null;
			lf_e = null;
			lf_a = null;
			lf_c = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "qd.B(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, i var3, int var4, int var5) {
		try {
			++int_f;
			if (var1 >= -8) {
				lf_a = null;
			}

			jf var6 = new jf();
			var6.int_o = 128 * var2;
			var6.F = var3.Y;
			var6.I = var3.Gb * 128;
			var6.G = var3.Db;
			int var8 = var3.I;
			var6.int_q = var3.Pb;
			var6.z = var5 * 128;
			var6.L = var4;
			int var7 = var3.L;
			var6.K = var3.int_sb;
			if (~var0 == -2 || ~var0 == -4) {
				var7 = var3.I;
				var8 = var3.L;
			}

			var6.H = 128 * (var8 + var2);
			var6.D = 128 * (var5 - -var7);
			if (var3.ints_mb != null) {
				var6.i_w = var3;
				var6.a(0);
			}

			q.tf_cb.a(var6, (int) 0);
			if (var6.G != null) {
				var6.y = var6.F + (int) ((double) (var6.K - var6.F) * Math.random());
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "qd.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ')');
		}
	}

	static {
		lf_d = lf_e;
	}
}
