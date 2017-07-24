final class ob {

	static int int_a;
	static rc rc_b = new rc(64);
	static int int_c;
	static int int_d;
	static mh[] mhs_e = new mh[50];
	static lf title_jpg = dd.a("title)3jpg", 2);//lf_f
	int int_g;
	static int int_h;
	int int_i;
	static lf lf_j = dd.a("Null", 2);
	int int_k;
	int int_l;
	private byte byte_m;
	static da da_n;
	static oh cache9;//oh_o
	int int_p;

	final int a(int var1) {
		try {
			if (var1 != 7) {
				a(32, 110, 52);
			}

			++int_c;
			return this.byte_m & 7;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ob.C(" + var1 + ')');
		}
	}

	final int a(boolean var1) {
		try {
			++int_d;
			if (!var1) {
				this.a((int) 71);
			}

			return ~(this.byte_m & 8) != -9 ? 0 : 1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ob.A(" + var1 + ')');
		}
	}

	static final void a(int var0, int var1, int var2) {
		ng.boolean_ab = true;
		ad.int_l = var0;
		dc.int_ob = var1;
		tb.int_db = var2;
		ah.int_w = -1;
		client.V = -1;
	}

	public static void a(byte var0) {
		try {
			da_n = null;
			mhs_e = null;
			int var1 = -18 / ((var0 - 61) / 44);
			lf_j = null;
			cache9 = null;
			rc_b = null;
			title_jpg = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ob.D(" + var0 + ')');
		}
	}

	public ob() {
	}

	ob(ja var1) {
		try {
			this.byte_m = var1.m(3);
			this.int_g = var1.b(true);
			this.int_l = var1.l(15);
			this.int_p = var1.l(15);
			this.int_i = var1.l(15);
			this.int_k = var1.l(15);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ob.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
