final class bd {

	private int int_a;
	private int[] ints_b;
	private int int_c;
	private int int_d;
	private int int_e;
	static int int_f;
	static rc rc_g = new rc(50);
	private int[] ints_h;
	static int int_i;
	static int int_j;
	static int int_k;
	static bg bg_l;
	static lf lf_m;
	static volatile boolean boolean_n;
	static int int_o = 0;
	private static lf lf_p = dd.a("Connecting to update server", 2);

	static final kf a(lf var0, lf var1, byte var2, bg var3) {
		try {
			if (var2 != -107) {
				lf_m = null;
			}

			int var4 = var3.a((byte) 106, var0);
			int var5 = var3.a((byte) -50, var1, var4);
			++int_f;
			return re.a(var5, var4, (byte) 49, var3);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bd.E(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final void a(int var1) {
		int var5 = client.int_gc;

		try {
			this.int_c += ++this.int_d;
			if (var1 != -640591166) {
				this.a(-54);
			}

			++int_j;
			int var2 = 0;
			do {
				int var3 = this.ints_b[var2];
				if ((2 & var2) == 0) {
					if ((var2 & 1) != 0) {
						this.int_e ^= this.int_e >>> 6;
					} else {
						this.int_e ^= this.int_e << 13;
					}
				} else if ((1 & var2) == 0) {
					this.int_e ^= this.int_e << 2;
				} else {
					this.int_e ^= this.int_e >>> 16;
				}

				this.int_e += this.ints_b[128 + var2 & 255];
				int var4;
				this.ints_b[var2] = var4 = this.int_c + (this.ints_b[sd.a(var3 >> 2, 255)] - -this.int_e);
				this.ints_h[var2] = this.int_c = var3 + this.ints_b[sd.a(var4 >> -926987320 >> 56016610, 255)];
				++var2;
			} while (var2 < 256);

		} catch (RuntimeException var6) {
			throw ec.a(var6, "bd.C(" + var1 + ')');
		}
	}

	bd(int[] var1) {
		int var3 = client.int_gc;

		try {
			this.ints_h = new int[256];
			this.ints_b = new int[256];
			int var2 = 0;
			if (var3 != 0) {
				this.ints_h[var2] = var1[var2];
				++var2;
			}

			while (var1.length > var2) {
				this.ints_h[var2] = var1[var2];
				++var2;
			}

			this.b(127);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bd.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	private final void b(int var1) {
		int var12 = client.int_gc;

		try {
			int var2 = -9 / ((var1 - -18) / 55);
			++int_k;
			int var11 = -1640531527;
			int var10 = -1640531527;
			int var9 = -1640531527;
			int var8 = -1640531527;
			int var7 = -1640531527;
			int var6 = -1640531527;
			int var5 = -1640531527;
			int var4 = -1640531527;
			int var3 = 0;
			if (var12 != 0) {
				var4 ^= var5 << -1528425109;
				var7 += var4;
				var5 += var6;
				var5 ^= var6 >>> 728692578;
				var6 += var7;
				var8 += var5;
				var6 ^= var7 << 1339323880;
				var9 += var6;
				var7 += var8;
				var7 ^= var8 >>> 173972048;
				var10 += var7;
				var8 += var9;
				var8 ^= var9 << -1208631350;
				var9 += var10;
				var11 += var8;
				var9 ^= var10 >>> 1956120132;
				var4 += var9;
				var10 += var11;
				var10 ^= var11 << -2089774808;
				var11 += var4;
				var11 ^= var4 >>> 1101341801;
				var5 += var10;
				var6 += var11;
				var4 += var5;
				++var3;
			}

			while (var3 < 4) {
				var4 ^= var5 << -1528425109;
				var7 += var4;
				var5 += var6;
				var5 ^= var6 >>> 728692578;
				var6 += var7;
				var8 += var5;
				var6 ^= var7 << 1339323880;
				var9 += var6;
				var7 += var8;
				var7 ^= var8 >>> 173972048;
				var10 += var7;
				var8 += var9;
				var8 ^= var9 << -1208631350;
				var9 += var10;
				var11 += var8;
				var9 ^= var10 >>> 1956120132;
				var4 += var9;
				var10 += var11;
				var10 ^= var11 << -2089774808;
				var11 += var4;
				var11 ^= var4 >>> 1101341801;
				var5 += var10;
				var6 += var11;
				var4 += var5;
				++var3;
			}

			var3 = 0;
			if (var12 != 0 || var3 < 256) {
				do {
					var9 += this.ints_h[var3 - -5];
					var4 += this.ints_h[var3];
					var8 += this.ints_h[var3 + 4];
					var10 += this.ints_h[6 + var3];
					var5 += this.ints_h[var3 + 1];
					var11 += this.ints_h[var3 + 7];
					var4 ^= var5 << 225260651;
					var6 += this.ints_h[var3 - -2];
					var5 += var6;
					var7 += this.ints_h[var3 + 3];
					var5 ^= var6 >>> 1760644194;
					var7 += var4;
					var8 += var5;
					var6 += var7;
					var6 ^= var7 << 378939976;
					var9 += var6;
					var7 += var8;
					var7 ^= var8 >>> 79964688;
					var8 += var9;
					var8 ^= var9 << -108217398;
					var10 += var7;
					var11 += var8;
					var9 += var10;
					var9 ^= var10 >>> -1139704348;
					var10 += var11;
					var10 ^= var11 << 667229960;
					var4 += var9;
					var5 += var10;
					var11 += var4;
					var11 ^= var4 >>> -1321839863;
					var4 += var5;
					var6 += var11;
					this.ints_b[var3] = var4;
					this.ints_b[var3 - -1] = var5;
					this.ints_b[var3 - -2] = var6;
					this.ints_b[3 + var3] = var7;
					this.ints_b[4 + var3] = var8;
					this.ints_b[var3 + 5] = var9;
					this.ints_b[6 + var3] = var10;
					this.ints_b[7 + var3] = var11;
					var3 += 8;
				} while (var3 < 256);
			}

			var3 = 0;
			if (var12 == 0 && var3 >= 256) {
				this.a(-640591166);
				this.int_a = 256;
			} else {
				do {
					var6 += this.ints_b[var3 + 2];
					var10 += this.ints_b[var3 - -6];
					var7 += this.ints_b[3 + var3];
					var4 += this.ints_b[var3];
					var8 += this.ints_b[4 + var3];
					var11 += this.ints_b[var3 - -7];
					var9 += this.ints_b[var3 - -5];
					var5 += this.ints_b[var3 - -1];
					var4 ^= var5 << 1579858571;
					var5 += var6;
					var5 ^= var6 >>> 1993222658;
					var7 += var4;
					var8 += var5;
					var6 += var7;
					var6 ^= var7 << 1907059688;
					var7 += var8;
					var9 += var6;
					var7 ^= var8 >>> -1366965456;
					var10 += var7;
					var8 += var9;
					var8 ^= var9 << 114485450;
					var11 += var8;
					var9 += var10;
					var9 ^= var10 >>> -1682993084;
					var4 += var9;
					var10 += var11;
					var10 ^= var11 << -114651960;
					var11 += var4;
					var11 ^= var4 >>> 1177889993;
					var5 += var10;
					var4 += var5;
					this.ints_b[var3] = var4;
					this.ints_b[var3 - -1] = var5;
					var6 += var11;
					this.ints_b[var3 - -2] = var6;
					this.ints_b[var3 + 3] = var7;
					this.ints_b[4 + var3] = var8;
					this.ints_b[var3 - -5] = var9;
					this.ints_b[6 + var3] = var10;
					this.ints_b[7 + var3] = var11;
					var3 += 8;
				} while (var3 < 256);

				this.a(-640591166);
				this.int_a = 256;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "bd.B(" + var1 + ')');
		}
	}

	public static void a(boolean var0) {
		try {
			lf_p = null;
			if (!var0) {
				a((lf) null, (lf) null, (byte) 124, (bg) null);
			}

			rc_g = null;
			bg_l = null;
			lf_m = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "bd.A(" + var0 + ')');
		}
	}

	final int c(int var1) {
		try {
			++int_i;
			if (var1 != -22198) {
				return 99;
			} else {
				if (this.int_a-- == 0) {
					this.a(-640591166);
					this.int_a = 255;
				}

				return this.ints_h[this.int_a];
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "bd.D(" + var1 + ')');
		}
	}

	static {
		lf_m = lf_p;
		boolean_n = true;
	}
}
