final class dg {

	static int int_a;
	ka ka_b;
	int int_c;
	long long_d;
	int int_e;
	static int int_f;
	ka ka_g;
	int int_h;
	ka ka_i;
	static rc rc_j = new rc(5);
	static int[] ints_k;
	static lf lf_l;
	private static lf lf_m = dd.a("Bad session id)3", 2);
	static lf lf_n;
	static lf lf_o = dd.a("<col=ff7000>", 2);
	static int int_p;
	static lf lf_q = dd.a("Lade Eingabe)2Steuerungsprogramm)3)3)3", 2);
	int int_r;
	static df[] dfs_s;

	public static void a(int var0) {
		try {
			ints_k = null;
			if (var0 == 5) {
				rc_j = null;
				lf_n = null;
				lf_q = null;
				lf_m = null;
				dfs_s = null;
				lf_l = null;
				lf_o = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "dg.A(" + var0 + ')');
		}
	}

	static final df[] a(bg cache8, int var1, int var2, int var3) {
		try {
			if (var3 != -20348) {
				dfs_s = null;
			}

			++int_f;
			return !wa.a(-21957, cache8, var2, var1) ? null : tc.g((byte) -12);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "dg.B(" + (cache8 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final kb b(int var0) {
		try {
			++int_a;

			try {
				return var0 != 5 ? null : (kb) Class.forName("qg").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "dg.C(" + var0 + ')');
		}
	}

	static {
		lf_n = lf_m;
		lf_l = dd.a("(U0a )2 non)2existant gosub script)2num: ", 2);
	}
}
