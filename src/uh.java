final class uh extends hb {

	da[] das_n;
	static int int_o;
	da[] das_p;
	int[] ints_q;
	static jc[] jcs_r;
	static int int_s;
	static int int_t;
	int int_u;
	byte[][][] bytes_v;
	int int_w;
	static int x;
	static int y = 0;
	static int z = 0;
	int[] A;
	int[] B;
	static int[][] C = new int[][]{{1, 1}, {-1, 1}, {1, -1}, {-1, -1}};

	static final void a(int var0, int var1, int var2, int var3) {
		ab var4 = i.Ib[var0][var1][var2];
		if (var4 != null) {
			i.Ib[var0][var1][var2].z = var3;
		}
	}

	static final sd a(byte var0, int var1) {
		try {
			sd var2 = (sd) i.O.a((long) var1, (int) -110);
			++int_o;
			if (var2 != null) {
				return var2;
			} else if (var0 != -99) {
				return null;
			} else {
				byte[] var3 = client.bg_nb.a(var0 ^ -99, var1, 9);
				var2 = new sd();
				var2.Ab = var1;
				if (var3 != null) {
					var2.a(0, new ja(var3));
				}

				var2.f(-36);
				i.O.a((long) var1, var0 + 121, var2);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "uh.C(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a(int var0) {
		try {
			jcs_r = null;
			if (var0 != -1) {
				a(101, -125, -95, 90);
			}

			C = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "uh.D(" + var0 + ')');
		}
	}

	static final void a(int var0, long var1) {
		int var5 = client.int_gc;

		try {
			++x;
			if (~var1 != -1L) {
				if (var0 == 3542) {
					int var3 = 0;
					if (var5 != 0 || ~var3 > ~bh.int_ob) {
						while (~id.longs_n[var3] != ~var1) {
							++var3;
							if (~var3 <= ~bh.int_ob) {
								return;
							}
						}

						++od.Q;
						--bh.int_ob;
						int var4 = var3;
						if (var5 != 0) {
							id.longs_n[var3] = id.longs_n[1 + var3];
							d.lfs_fb[var3] = d.lfs_fb[var3 - -1];
							var4 = var3 + 1;
						}

						while (~bh.int_ob < ~var4) {
							id.longs_n[var4] = id.longs_n[1 + var4];
							d.lfs_fb[var4] = d.lfs_fb[var4 - -1];
							++var4;
						}

						ld.int_db = hf.int_p;
						vg.J.e((byte) 92, 7);
						vg.J.a(var1, -562765672);
					}
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "uh.A(" + var0 + ',' + var1 + ')');
		}
	}
}
