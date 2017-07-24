final class qf {

	private static byte[] bytes_a = new byte[]{(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
	private ja ja_b = new ja((byte[]) null);
	private long long_c;
	private int[] ints_d;
	int int_e;
	int[] ints_f;
	private int[] ints_g;
	private int int_h;
	private int[] ints_i;

	final void a() {
		this.ja_b.yb = null;
		this.ints_i = null;
		this.ints_g = null;
		this.ints_f = null;
		this.ints_d = null;
	}

	final int a(int var1) {
		int var2 = this.e(var1);
		return var2;
	}

	final void a(long var1) {
		this.long_c = var1;
		int var3 = this.ints_g.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.ints_f[var4] = 0;
			this.ints_d[var4] = 0;
			this.ja_b.P = this.ints_i[var4];
			this.b(var4);
			this.ints_g[var4] = this.ja_b.P;
		}

	}

	private final int a(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.ja_b.j((byte) 87);
			var4 = this.ja_b.c((int) 103);
			if (var7 == 47) {
				this.ja_b.P += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.ja_b.f((byte) 59);
				var4 -= 3;
				int var6 = this.ints_f[var1];
				this.long_c += (long) var6 * (long) (this.int_h - var5);
				this.int_h = var5;
				this.ja_b.P += var4;
				return 2;
			} else {
				this.ja_b.P += var4;
				return 3;
			}
		} else {
			byte var3 = bytes_a[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.ja_b.j((byte) 86) << 8;
			}

			if (var3 >= 2) {
				var4 |= this.ja_b.j((byte) 87) << 16;
			}

			return var4;
		}
	}

	final void b(int var1) {
		int var2 = this.ja_b.c((int) 109);
		this.ints_f[var1] += var2;
	}

	public static void b() {
		bytes_a = null;
	}

	final int c() {
		int var1 = this.ints_g.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.ints_g[var4] >= 0 && this.ints_f[var4] < var3) {
				var2 = var4;
				var3 = this.ints_f[var4];
			}
		}

		return var2;
	}

	final int d() {
		return this.ints_g.length;
	}

	final void c(int var1) {
		this.ja_b.P = this.ints_g[var1];
	}

	final void d(int var1) {
		this.ints_g[var1] = this.ja_b.P;
	}

	private final int e(int var1) {
		byte var2 = this.ja_b.yb[this.ja_b.P];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.ints_d[var1] = var5;
			++this.ja_b.P;
		} else {
			var5 = this.ints_d[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.a(var1, var5);
		} else {
			int var3 = this.ja_b.c((int) 127);
			if (var5 == 247 && var3 > 0) {
				int var4 = this.ja_b.yb[this.ja_b.P] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.ja_b.P;
					this.ints_d[var1] = var4;
					return this.a(var1, var4);
				}
			}

			this.ja_b.P += var3;
			return 0;
		}
	}

	final void e() {
		this.ja_b.P = -1;
	}

	final long f(int var1) {
		return this.long_c + (long) var1 * (long) this.int_h;
	}

	final void a(byte[] var1) {
		this.ja_b.yb = var1;
		this.ja_b.P = 10;
		int var2 = this.ja_b.b(true);
		this.int_e = this.ja_b.b(true);
		this.int_h = 500000;
		this.ints_i = new int[var2];

		int var4;
		int var5;
		for (int var3 = 0; var3 < var2; this.ja_b.P += var5) {
			var4 = this.ja_b.l(15);
			var5 = this.ja_b.l(15);
			if (var4 == 1297379947) {
				this.ints_i[var3] = this.ja_b.P;
				++var3;
			}
		}

		this.long_c = 0L;
		this.ints_g = new int[var2];

		for (var4 = 0; var4 < var2; ++var4) {
			this.ints_g[var4] = this.ints_i[var4];
		}

		this.ints_f = new int[var2];
		this.ints_d = new int[var2];
	}

	final boolean f() {
		return this.ja_b.yb != null;
	}

	final boolean g() {
		int var1 = this.ints_g.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.ints_g[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	public qf() {
	}

	qf(byte[] var1) {
		this.a(var1);
	}
}
