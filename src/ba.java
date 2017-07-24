final class ba {

	int int_a;
	int int_b;
	static lf lf_c = dd.a("Bitte entfernen Sie ", 2);
	static int[] ints_d;
	static int int_e;
	static int int_f = 0;
	static lf lf_g = dd.a("<col=40ff00>", 2);
	long long_h = 0L;
	int int_i;
	static int int_j;
	int int_k;
	int int_l;
	ka ka_m;
	static int int_n;
	ka ka_o;

	static final void a(boolean var0) {
		try {
			++int_j;

			try {
				if (~ig.int_r == -2) {
					int var1 = gg.sh_n.c((byte) 110);
					if (var1 > 0 && gg.sh_n.d((int) -90)) {
						var1 -= hc.int_ob;
						if (var1 < 0) {
							var1 = 0;
						}

						gg.sh_n.a(var1, (byte) -34);
						return;
					}

					label34:
					{
						gg.sh_n.f((byte) 94);
						gg.sh_n.b(-102);
						if (be.bg_l == null) {
							ig.int_r = 0;
							if (client.int_gc == 0) {
								break label34;
							}
						}

						ig.int_r = 2;
					}

					j.E = null;
					e.s_o = null;
				}
			} catch (Exception var2) {
				var2.printStackTrace();
				gg.sh_n.f((byte) 102);
				ig.int_r = 0;
				e.s_o = null;
				j.E = null;
				be.bg_l = null;
			}

			if (var0) {
				int_n = 48;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ba.A(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, lf var2, short var3, long var4, int var6, lf var7) {
		try {
			++int_e;
			if (!f.boolean_ab) {
				if (qa.int_eb < var6) {
					mc.z[qa.int_eb] = var2;
					th.lfs_a[qa.int_eb] = var7;
					d.Q[qa.int_eb] = var3;
					hc.longs_cb[qa.int_eb] = var4;
					pg.ints_j[qa.int_eb] = var1;
					vh.ints_i[qa.int_eb] = var0;
					++qa.int_eb;
				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ba.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(int var0) {
		try {
			ints_d = null;
			lf_c = null;
			lf_g = null;
			if (var0 != 0) {
				lf_c = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ba.B(" + var0 + ')');
		}
	}
}
