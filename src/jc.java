final class jc extends hb {

	static int int_n;
	static lf lf_o = dd.a("<)4col>", 2);
	lf lf_p;
	static byte[][][] bytes_q;
	static int int_r;
	byte byte_s;
	static int int_t;
	private static lf lf_u = dd.a("RuneScape has been updated(Q", 2);
	int int_v;
	static lf lf_w;
	static lf x;
	static lf y;
	static byte[][][] z;
	static lf A = dd.a(")1", 2);
	static int B;
	static boolean C;
	private static lf D;
	static lf[] E;
	static int F;

	static void a(int var0) {
		try {
			ug.Y.c(var0 ^ -1998);
			++int_r;
			if (var0 != 2047) {
				E = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jc.E(" + var0 + ')');
		}
	}

	public static void b(int var0) {
		try {
			lf_u = null;
			lf_o = null;
			y = null;
			x = null;
			A = null;
			D = null;
			E = null;
			z = null;
			bytes_q = null;
			lf_w = null;
			if (var0 >= -72) {
				C = true;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jc.F(" + var0 + ')');
		}
	}

	static void c(int var0) {
		try {
			++int_t;
			ka.I.s(11045);
			int var1 = ka.I.f((byte) 106, var0);
			if (var1 != 0) {
				int var2 = ka.I.f((byte) 118, 2);
				if (~var2 == -1) {
					kh.T[kd.S++] = 2047;
				} else {
					int var3;
					int var4;
					if (var2 == 1) {
						var3 = ka.I.f((byte) 124, 3);
						r.X.a(false, var3, var0 + 119);
						var4 = ka.I.f((byte) 92, 1);
						if (~var4 == -2) {
							kh.T[kd.S++] = 2047;
						}

					} else {
						if (var2 == 2) {
							var3 = ka.I.f((byte) 68, 3);
							r.X.a(true, var3, var0 + -65);
							var4 = ka.I.f((byte) 119, 3);
							r.X.a(true, var4, -77);
							int var5 = ka.I.f((byte) 63, 1);
							if (~var5 == -2) {
								kh.T[kd.S++] = 2047;
							}

						} else if (var2 == 3) {
							var3 = ka.I.f((byte) 123, 1);
							hc.int_pb = ka.I.f((byte) 102, 2);
							var4 = ka.I.f((byte) 81, 1);
							if (~var4 == -2) {
								kh.T[kd.S++] = 2047;
							}

							int localX = ka.I.f((byte) 110, 7);
							int localY = ka.I.f((byte) 70, 7);
							r.X.a(true, localY, var3 == 1, localX);
						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "jc.C(" + var0 + ')');
		}
	}

	static int a(int var0, int var1, int[] var2, int var3) {
		try {
			++B;
			if (var3 != 4003) {
				z = null;
			}

			return var0 * var2[0] - -(var2[1] * var1);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "jc.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	static int a(int var0, int var1, int var2, int var3) {
		try {
			if (var1 != 667494220) {
				C = true;
			}

			++int_n;
			return var2 * var3 + (-var2 + 4096) * var0 >> 667494220;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "jc.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static void d(int var0) {
		try {
			++F;
			pf.R = null;
			int var1 = 87 % ((var0 - 36) / 59);
			cb.font_f = null;
			cf.x = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jc.A(" + var0 + ')');
		}
	}

	static {
		lf_w = lf_u;
		bytes_q = new byte[4][104][104];
		D = dd.a(" from your ignore list first)3", 2);
		y = dd.a("Fallen lassen", 2);
		x = D;
		E = new lf[100];
	}
}
