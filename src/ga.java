final class ga {

	static int int_a;
	static oh cache0;//oh_b
	static int int_c = 0;
	static int int_d = 0;
	static int int_e;
	static lf lf_f = dd.a("Angreifen", 2);

	static final void a(bg var0, boolean var1, bg var2) {
		try {
			++int_e;
			af.bg_u = var0;
			if (!var1) {
				sh.bg_qb = var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ga.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0) {
		try {
			++int_a;
			if (var0 != 21504) {
				lf_f = null;
			}

			if (nb.boolean_a) {
				vg var1 = nh.c(sb.int_d, -1, ag.int_k);
				if (var1 != null && var1.objects_r != null) {
					id var2 = new id();
					var2.objects_t = var1.objects_r;
					var2.vg_o = var1;
					ea.a(24087, var2);
				}

				nb.boolean_a = false;
				mc.a(var1, var0 ^ -3645);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ga.A(" + var0 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			cache0 = null;
			lf_f = null;
			if (var0 != 97) {
				int_c = -95;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ga.C(" + var0 + ')');
		}
	}
}
