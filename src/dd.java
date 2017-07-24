final class dd extends j {

	static lf Q = a("<br>(X", 2);
	static int R;
	static int S;
	static int[] T;
	static int U;
	private int V;
	static int W = 0;
	private int X;
	private int Y;
	static int Z;
	static int int_ab;

	private dd(int var1) {
		super(0, false);

		try {
			this.a(var1, (byte) 27);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "dd.<init>(" + var1 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var8 = client.int_gc;

		try {
			if (var2 != 2177) {
				this.Y = -38;
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int[] var5 = var3[1];
				int[] var4 = var3[0];
				int[] var6 = var3[2];
				int var7 = 0;
				if (var8 != 0 || ~var7 > ~ff.int_a) {
					do {
						var4[var7] = this.X;
						var5[var7] = this.V;
						var6[var7] = this.Y;
						++var7;
					} while (~var7 > ~ff.int_a);
				}
			}

			++R;
			return var3;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "dd.E(" + var1 + ',' + var2 + ')');
		}
	}

	public static void e(int var0) {
		try {
			int var1 = -79 % ((var0 - 36) / 42);
			Q = null;
			T = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "dd.B(" + var0 + ')');
		}
	}

	private final void a(int var1, byte var2) {
		try {
			this.X = 4080 & var1 >> 2012739564;
			int var3 = -89 / ((88 - var2) / 36);
			++U;
			this.Y = (var1 & 255) << -930216796;
			this.V = var1 >> 386561668 & 4080;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "dd.A(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			++S;
			if (~var2 == -1) {
				this.a(var3.f((byte) 59), (byte) 127);
			}

			if (var1 >= -120) {
				this.a((byte) -127, -35, (ja) null);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "dd.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final lf a(String var0, int var1) {
		try {
			++int_ab;
			byte[] var2 = var0.getBytes();
			int var3 = var2.length;
			int var5 = 0;
			lf var4 = new lf();
			if (var1 != 2) {
				e(52);
			}

			var4.Y = new byte[var3];

			while (~var5 > ~var3) {
				int var6 = var2[var5++] & 255;
				if (var6 <= 45 && ~var6 <= -41) {
					if (~var3 >= ~var5) {
						break;
					}

					int var7 = var2[var5++] & 255;
					var4.Y[var4.S++] = (byte) (var7 + -48 + -1720 + var6 * 43);
				} else if (~var6 != -1) {
					var4.Y[var4.S++] = (byte) var6;
				}
			}

			var4.g(var1 + 18877);
			return var4.a(var1 + 18710);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "dd.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public dd() {
		this(0);
	}
}
