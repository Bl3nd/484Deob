final class fi extends hb {

	int int_n;
	static int int_o;
	static int[] ints_p = new int[100];
	static int int_q;
	static lf clanreqFlag = dd.a(":clanreq:", 2);//lf_r
	static lf lf_s = dd.a("<col=ffffff>", 2);
	boolean boolean_t = false;
	static lf lf_u = dd.a("cross", 2);
	static lf lf_v;
	private static lf lf_w = dd.a("Type", 2);
	int x;
	static int y;

	static final ba a(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		return var3 == null ? null : var3.H;
	}

	static final void a(int var0, vg var1, int var2, byte var3) {
		try {
			++int_q;
			if (di.V == 0 || ~di.V == -4) {
				var2 -= var1.int_ob / 2;
				var0 -= var1.Ib / 2;
				int var4 = h.int_l - -ef.int_c & 2047;
				int var5 = nc.X[var4];
				var5 = (pe.int_j - -256) * var5 >> -807666872;
				int var6 = nc.ints_bb[var4];
				var6 = (pe.int_j - -256) * var6 >> 1271338664;
				int var8 = -(var5 * var2) + var0 * var6 >> 2049303339;
				int var10 = -var8 + r.X.int_nc >> -1784486489;
				if (var3 <= 84) {
					lf_s = null;
				}

				int var7 = var6 * var2 + var5 * var0 >> -877973;
				int var9 = r.X.int_fb + var7 >> -1969993369;
				boolean var11 = fd.a(0, 0, 0, var9, 0, 1, r.X.xb[0], r.X.ints_db[0], true, var10, 0, 0);
				if (var11) {
					vg.J.e(-13488, var2);
					vg.J.e(-13488, var0);
					vg.J.c((int) 9698, h.int_l);
					vg.J.e(-13488, 57);
					vg.J.e(-13488, ef.int_c);
					vg.J.e(-13488, pe.int_j);
					vg.J.e(-13488, 89);
					vg.J.c((int) 9698, r.X.int_fb);
					vg.J.c((int) 9698, r.X.int_nc);
					vg.J.e(-13488, id.x);
					vg.J.e(-13488, 63);
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "fi.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_w = null;
			lf_s = null;
			ints_p = null;
			clanreqFlag = null;
			lf_v = null;
			lf_u = null;
			if (var0 != -27022) {
				a(29, (vg) null, -94, (byte) 102);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fi.C(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1) {
		ab var2 = i.Ib[0][var0][var1];

		for (int var3 = 0; var3 < 3; ++var3) {
			ab var4 = i.Ib[var3][var0][var1] = i.Ib[var3 + 1][var0][var1];
			if (var4 != null) {
				--var4.int_v;

				for (int var5 = 0; var5 < var4.int_p; ++var5) {
					ed var6 = var4.eds_t[var5];
					if ((var6.long_w >> 29 & 3L) == 2L && var6.int_u == var0 && var6.int_f == var1) {
						--var6.int_m;
					}
				}
			}
		}

		if (i.Ib[0][var0][var1] == null) {
			i.Ib[0][var0][var1] = new ab(0, var0, var1);
		}

		i.Ib[0][var0][var1].A = var2;
		i.Ib[3][var0][var1] = null;
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, byte var5, int var6, int var7, int var8, int var9) {
		int var12 = client.int_gc;

		try {
			if (var5 != 41) {
				a(105, -58);
			}

			++int_o;
			ic var10 = null;
			ic var11 = (ic) ef.tf_i.c(53);
			if (var12 != 0 || var11 != null) {
				do {
					if (var3 == var11.int_o && var0 == var11.int_s && var11.int_n == var1 && var11.E == var2) {
						var10 = var11;
						break;
					}

					var11 = (ic) ef.tf_i.d(-1);
				} while (var11 != null);
			}

			if (var10 == null) {
				var10 = new ic();
				var10.int_n = var1;
				var10.int_s = var0;
				var10.E = var2;
				var10.int_o = var3;
				sb.a(var5 + -41, var10);
				ef.tf_i.a(var10, (int) (var5 + -41));
			}

			var10.y = var6;
			var10.z = var8;
			var10.x = var9;
			var10.int_v = var7;
			var10.D = var4;
		} catch (RuntimeException var13) {
			throw ec.a(var13, "fi.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static {
		lf_v = lf_w;
		y = 0;
	}
}
