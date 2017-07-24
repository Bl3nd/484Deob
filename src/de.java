final class de extends hb {

	static int int_n;
	static int int_o;
	static lf mapedge = dd.a("mapedge", 2);//lf_p
	static boolean boolean_q = false;
	static lf lf_r = dd.a("VOLL", 2);
	static lf lf_s;
	byte[] bytes_t;
	static int int_u = 0;
	static int int_v;
	static boolean[] booleans_w;
	static int x;
	private static lf y = dd.a("Error loading your profile)3", 2);

	public static void a(int var0) {
		try {
			booleans_w = null;
			y = null;
			lf_s = null;
			if (var0 != 5685) {
				a(122, -83, 58, 76, (ka) null, (ka) null, -70, 77, -45, -83, 79L);
			}

			mapedge = null;
			lf_r = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "de.A(" + var0 + ')');
		}
	}

	static void a(int var0, int var1, int var2, int var3, ka var4, ka var5, int var6, int var7, int var8, int var9, long var10) {
		if (var4 != null) {
			la var12 = new la();
			var12.long_i = var10;
			var12.int_q = var1 * 128 + 64;
			var12.int_b = var2 * 128 + 64;
			var12.int_a = var3;
			var12.ka_c = var4;
			var12.ka_d = var5;
			var12.int_j = var6;
			var12.int_k = var7;
			var12.int_l = var8;
			var12.int_m = var9;

			for (int var13 = var0; var13 >= 0; --var13) {
				if (i.Ib[var13][var1][var2] == null) {
					i.Ib[var13][var1][var2] = new ab(var13, var1, var2);
				}
			}

			i.Ib[var0][var1][var2].K = var12;
		}
	}

	static void a(int var0, byte var1) {
		try {
			++x;
			if (ld.Z != var0) {
				if (ld.Z == 0) {
					jc.d(-67);
				}

				if (~var0 == -21 || ~var0 == -41) {
					ee.V = 0;
					d.int_jb = 0;
					d.W = 0;
				}

				if (~var0 != -21 && ~var0 != -41 && ed.z != null) {
					ed.z.a((byte) -52);
					ed.z = null;
				}

				if (ld.Z == 25) {
					kd.int_jb = 1;
					pb.int_h = 0;
					eh.int_n = 0;
					sf.V = 0;
					oh.int_sb = 1;
				}

				if (var0 != 5 && var0 != 10 && var0 != 20) {
					bg.a((int) 24831);
				} else {
					ff.a(hd.cache8, -117, dh.cache10, ae.U);
				}

				ld.Z = var0;
				if (var1 != -64) {
					a(-59, 23, 66, 16, (ka) null, (ka) null, -117, -36, -93, 58, 123L);
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "de.D(" + var0 + ',' + var1 + ')');
		}
	}

	de(byte[] var1) {
		try {
			this.bytes_t = var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "de.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static lf a(lf[] var0, int var1) {
		try {
			++int_o;
			if (var0.length < 2) {
				throw new IllegalArgumentException();
			} else {
				return ch.a(var0.length, (byte) 53, var0, 0);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "de.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static {
		lf_s = y;
	}
}
