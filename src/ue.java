abstract class ue extends ka {

	private static int[] ints_ab;
	int[] ints_bb;
	short short_cb;
	int[] ints_db;
	int[][] ints_eb;
	static int int_fb;
	int[] ints_gb;
	boolean boolean_hb = false;
	short short_ib;
	short short_jb;
	int int_kb = 0;
	int[][] ints_lb;
	int int_mb = 0;
	static boolean boolean_nb;
	private static int[] ints_ob;
	short short_pb;
	boolean boolean_qb = false;
	short short_rb;
	short short_sb;
	short short_tb;
	static int int_ub;
	static long[] longs_vb;
	static int int_wb;

	abstract ue c(boolean var1);

	final void a() {
		if (!this.boolean_qb) {
			this.boolean_qb = true;
			int var1 = 32767;
			int var2 = 32767;
			int var3 = 32767;
			int var4 = -32768;
			int var5 = -32768;
			int var6 = -32768;
			int var7 = 0;
			int var8 = 0;

			for (int var9 = 0; var9 < this.int_mb; ++var9) {
				int var10 = this.ints_gb[var9];
				int var11 = this.ints_bb[var9];
				int var12 = this.ints_db[var9];
				if (var10 < var1) {
					var1 = var10;
				}

				if (var10 > var4) {
					var4 = var10;
				}

				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				int var13 = var10 * var10 + var12 * var12;
				if (var13 > var7) {
					var7 = var13;
				}

				var13 = var10 * var10 + var12 * var12 + var11 * var11;
				if (var13 > var8) {
					var8 = var13;
				}
			}

			this.short_tb = (short) var1;
			this.short_cb = (short) var4;
			super.T = (short) var2;
			this.short_sb = (short) var5;
			this.short_jb = (short) var3;
			this.short_ib = (short) var6;
			this.short_rb = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
			this.short_pb = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
		}
	}

	final void c(int var1) {
		int var2 = ints_ab[var1];
		int var3 = ints_ob[var1];

		for (int var4 = 0; var4 < this.int_mb; ++var4) {
			int var5 = this.ints_bb[var4] * var3 - this.ints_db[var4] * var2 >> 16;
			this.ints_db[var4] = this.ints_bb[var4] * var2 + this.ints_db[var4] * var3 >> 16;
			this.ints_bb[var4] = var5;
		}

		this.boolean_qb = false;
	}

	final void d(int var1) {
		int var2 = ints_ab[var1];
		int var3 = ints_ob[var1];

		for (int var4 = 0; var4 < this.int_mb; ++var4) {
			int var5 = this.ints_bb[var4] * var2 + this.ints_gb[var4] * var3 >> 16;
			this.ints_bb[var4] = this.ints_bb[var4] * var3 - this.ints_gb[var4] * var2 >> 16;
			this.ints_gb[var4] = var5;
		}

		this.boolean_qb = false;
	}

	abstract ue d(boolean var1);

	final void a(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.int_mb; ++var4) {
			this.ints_gb[var4] += var1;
			this.ints_bb[var4] += var2;
			this.ints_db[var4] += var3;
		}

		this.boolean_qb = false;
	}

	public static void b() {
		ints_ab = null;
		ints_ob = null;
		longs_vb = null;
	}

	final void b(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.int_mb; ++var4) {
			this.ints_gb[var4] = this.ints_gb[var4] * var1 / 128;
			this.ints_bb[var4] = this.ints_bb[var4] * var2 / 128;
			this.ints_db[var4] = this.ints_db[var4] * var3 / 128;
		}

		this.boolean_qb = false;
	}

	final int c() {
		this.a();
		return this.short_rb;
	}

	final void d() {
		for (int var1 = 0; var1 < this.int_mb; ++var1) {
			this.ints_gb[var1] = -this.ints_gb[var1];
			this.ints_db[var1] = -this.ints_db[var1];
		}

		this.boolean_qb = false;
	}

	final void e() {
		for (int var1 = 0; var1 < this.int_mb; ++var1) {
			int var2 = this.ints_db[var1];
			this.ints_db[var1] = this.ints_gb[var1];
			this.ints_gb[var1] = -var2;
		}

		this.boolean_qb = false;
	}

	abstract void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	final void f() {
		for (int var1 = 0; var1 < this.int_mb; ++var1) {
			int var2 = this.ints_gb[var1];
			this.ints_gb[var1] = this.ints_db[var1];
			this.ints_db[var1] = -var2;
		}

		this.boolean_qb = false;
	}

	abstract void a(td var1, int var2, td var3, int var4, int[] var5);

	abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	abstract void a(td var1, int var2);

	abstract ue a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6);

	static {
		ints_ab = nc.X;
		boolean_nb = false;
		ints_ob = nc.ints_bb;
		longs_vb = new long[1000];
		int_ub = 0;
		int_fb = 0;
		int_wb = 0;
	}
}
