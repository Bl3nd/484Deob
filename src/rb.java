final class rb {

	static int int_a;
	static int int_b = 0;
	static int int_c = 0;
	static vg vg_d = null;
	static int int_e = 0;
	static lf lf_f = dd.a("_", 2);
	static int int_g;
	static int int_h;
	static int[] ints_i = new int[128];
	static lf lf_j = dd.a("nicht hergestellt werden)3", 2);
	static int int_k;
	static int int_l = 0;
	static lf lf_m;
	private static lf lf_n = dd.a("Hidden", 2);
	static lf lf_o;

	public static void a(byte var0) {
		try {
			lf_o = null;
			vg_d = null;
			lf_n = null;
			lf_m = null;
			ints_i = null;
			lf_f = null;
			int var1 = 101 % ((var0 - 34) / 55);
			lf_j = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "rb.B(" + var0 + ')');
		}
	}

	static final synchronized byte[] a(int capacity, int var1) {
		try {
			++int_h;
			byte[] buffer;
			if (capacity == 100 && p.int_vc > 0) {
				buffer = ha.K[--p.int_vc];
				ha.K[p.int_vc] = null;
				return buffer;
			} else if (capacity == 5000 && w.int_l > 0) {
				buffer = d.R[--w.int_l];
				d.R[w.int_l] = null;
				return buffer;
			} else if (capacity == 30000 && te.M > 0) {
				buffer = kb.bytes_b[--te.M];
				kb.bytes_b[te.M] = null;
				return buffer;
			} else {
				int var2 = 7 / ((var1 - 24) / 56);
				return new byte[capacity];
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "rb.A(" + capacity + ',' + var1 + ')');
		}
	}

	static {
		lf_o = lf_n;
		lf_m = dd.a("RuneScape wird geladen )2 bitte warten)3)3)3", 2);
	}
}
