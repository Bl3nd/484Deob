final class ic extends hb {

	int int_n;
	int int_o;
	static lf lf_p = dd.a(" steht bereits auf Ihrer Freunde)2Liste(Q", 2);
	int int_q;
	static int int_r;
	int int_s;
	static int int_t;
	int int_u;
	int int_v;
	int int_w;
	int x = -1;
	int y;
	int z;
	static int A;
	static short[][] C;
	int D = 0;
	int E;

	public static void a(int var0) {
		try {
			C = null;
			if (var0 != 380184944) {
				a(31, -6, -38, -15, (kf) null, (byte) -126, (vg) null);
			}

			lf_p = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ic.C(" + var0 + ')');
		}
	}

	static final byte[] a(byte var0, byte[] var1) {
		try {
			++int_t;
			if (var0 <= 31) {
				return null;
			} else {
				int var2 = var1.length;
				byte[] var3 = new byte[var2];
				na.a(var1, 0, var3, 0, var2);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ic.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, kf var4, byte var5, vg var6) {
		try {
			++A;
			if (var4 != null) {
				if (var5 != 110) {
					a((byte) 104, (byte[]) null);
				}

				int var9 = var0 * var0 - -(var2 * var2);
				int var7 = h.int_l + ef.int_c & 2047;
				int var8 = Math.max(var6.int_ob / 2, var6.Ib / 2) + 10;
				if (~(var8 * var8) <= ~var9) {
					int var11 = nc.ints_bb[var7];
					var11 = var11 * 256 / (256 + pe.int_j);
					int var10 = nc.X[var7];
					var10 = 256 * var10 / (pe.int_j - -256);
					int var12 = var0 * var11 + var2 * var10 >> 380184944;
					int var13 = -(var0 * var10) + var2 * var11 >> -2033192944;
					var4.a(-(var4.T / 2) + var12 + (var1 - -(var6.int_ob / 2)), -(var4.R / 2) + -var13 + var3 + var6.Ib / 2, var6.ints_a, var6.ints_jb);
				}
			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "ic.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ')');
		}
	}
}
