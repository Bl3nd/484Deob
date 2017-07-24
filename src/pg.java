abstract class pg {

	static kf[] kfs_a;
	static int int_b;
	static int int_c;
	static lf lf_d = dd.a("l", 2);
	static lf lf_e = dd.a(")3runescape)3com", 2);
	static int int_f;
	static int int_g;
	static int int_h;
	static int int_i = 0;
	static int[] ints_j = new int[500];
	static int int_k;

	static final void a(boolean var0) {
		try {
			++int_c;
			tf.boolean_q = var0;
			va.W = true;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pg.G(" + var0 + ')');
		}
	}

	static final int a(int var0) {
		try {
			++int_g;
			if (var0 != -1) {
				lf_e = null;
			}

			return gg.int_h++;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pg.D(" + var0 + ')');
		}
	}

	abstract void a(byte var1, byte[] var2);

	public static void a(byte var0) {
		try {
			kfs_a = null;
			ints_j = null;
			lf_d = null;
			lf_e = null;
			if (var0 != -117) {
				kfs_a = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pg.C(" + var0 + ')');
		}
	}

	static final void a(boolean var0, int var1) {
		int var4 = client.int_gc;

		try {
			++int_f;
			lc var2 = (lc) hg.eh_l.a((long) var1, (byte) -109);
			if (var2 != null) {
				int var3 = 0;
				if (!var0) {
					a((byte) -61);
					if (var4 != 0) {
						var2.ints_u[var3] = -1;
						var2.ints_n[var3] = 0;
						++var3;
					}
				}

				while (~var3 > ~var2.ints_u.length) {
					var2.ints_u[var3] = -1;
					var2.ints_n[var3] = 0;
					++var3;
				}

			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "pg.E(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(int var0, boolean var1, int var2, byte var3, int var4, bi var5) {
		try {
			++int_k;
			if (~jg.int_q > -51) {
				if (var5.ints_pb != null && var5.ints_pb.length > var4) {
					int var6 = var5.ints_pb[var4];
					if (var6 != 0) {
						int var8 = (var6 & 117) >> -1213571420;
						int var7 = var6 >> 89272808;
						int var9 = 15 & var6;
						if (var9 == 0) {
							if (var1) {
								ag.a(var8, var7, 0, 0);
							}

						} else if (~sd.Db != -1) {
							int var10 = (-64 + var2) / 128;
							int var11 = (var0 - 64) / 128;
							hc.ints_gb[jg.int_q] = var7;
							rg.D[jg.int_q] = var8;
							qa.V[jg.int_q] = 0;
							ob.mhs_e[jg.int_q] = null;
							d.ints_eb[jg.int_q] = (var11 << -1394208888) + (var10 << 1281763696) + var9;
							++jg.int_q;
							if (var3 >= -23) {
								ints_j = null;
							}
						}
					}
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "pg.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	abstract byte[] b(byte var1);
}
