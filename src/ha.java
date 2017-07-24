final class ha extends hb {

	private int int_n;
	static lf lf_o;
	int int_p;
	private static lf lf_q = dd.a("Use", 2);
	static int int_r;
	private static lf lf_s = dd.a("Oct", 2);
	private static lf lf_t = dd.a("Existing User", 2);
	private static lf lf_u = dd.a("Dec", 2);
	private static lf lf_v = dd.a("Feb", 2);
	private static lf lf_w = dd.a("May", 2);
	int[][] x;
	static rc y;
	private static lf z = dd.a("Jan", 2);
	int[] A;
	private static lf B = dd.a("Jun", 2);
	private boolean[] C;
	static lf D;
	private static lf E = dd.a("Apr", 2);
	private static lf F = dd.a("Jul", 2);
	static lf[] G;
	private static lf H;
	static lf I;
	private static lf J;
	static byte[][] K;
	private static lf L;
	private static lf M = dd.a("Sep", 2);
	private static lf N;
	static lf O;

	static final void a(int var0) {
		try {
			if (var0 <= 84) {
				c((byte) -14);
			}

			++int_r;
			hg.eh_l = new eh(32);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ha.B(" + var0 + ')');
		}
	}

	public static void c(byte var0) {
		try {
			D = null;
			lf_s = null;
			H = null;
			lf_q = null;
			y = null;
			G = null;
			lf_u = null;
			if (var0 == -28) {
				F = null;
				N = null;
				K = null;
				lf_t = null;
				B = null;
				J = null;
				lf_v = null;
				lf_o = null;
				M = null;
				z = null;
				L = null;
				lf_w = null;
				I = null;
				O = null;
				E = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ha.A(" + var0 + ')');
		}
	}

	ha(int var1, byte[] var2) {
		int var9 = client.int_gc;

		try {
			this.int_p = var1;
			ja var3 = new ja(var2);
			this.int_n = var3.j((byte) 93);
			this.A = new int[this.int_n];
			this.C = new boolean[this.int_n];
			this.x = new int[this.int_n][];
			int var4 = 0;
			if (var9 != 0 || this.int_n > var4) {
				do {
					this.A[var4] = var3.j((byte) 84);
					++var4;
				} while (this.int_n > var4);
			}

			int var5 = 0;
			if (var9 != 0) {
				this.C[var5] = ~var3.j((byte) 123) == -2;
				++var5;
			}

			while (this.int_n > var5) {
				this.C[var5] = ~var3.j((byte) 123) == -2;
				++var5;
			}

			int var6 = 0;
			if (var9 != 0 || this.int_n > var6) {
				do {
					this.x[var6] = new int[var3.j((byte) 72)];
					++var6;
				} while (this.int_n > var6);
			}

			int var7 = 0;
			if (var9 != 0 || ~this.int_n < ~var7) {
				do {
					int var8 = 0;
					if (var9 == 0 && this.x[var7].length <= var8) {
						++var7;
					} else {
						do {
							this.x[var7][var8] = var3.j((byte) 71);
							++var8;
						} while (this.x[var7].length > var8);

						++var7;
					}
				} while (~this.int_n < ~var7);

			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "ha.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		I = lf_t;
		K = new byte[1000][];
		lf_o = lf_q;
		H = dd.a("Mar", 2);
		L = dd.a("Nov", 2);
		J = dd.a("Aug", 2);
		G = new lf[]{z, lf_v, H, E, lf_w, B, F, J, M, lf_s, L, lf_u};
		N = dd.a("RuneScape is loading )2 please wait)3)3)3", 2);
		D = N;
		O = dd.a("(Y", 2);
		y = new rc(200);
	}
}
