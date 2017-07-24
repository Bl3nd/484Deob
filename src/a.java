final class a {

	static lf lf_a = dd.a("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 2);
	static lf lf_b = dd.a("Texturen geladen)3", 2);
	static lf lf_c = dd.a("Anmelde)2Limit -Uberschritten)3", 2);
	static lf lf_d = dd.a(" zuerst von Ihrer Ignorieren)2Liste(Q", 2);
	static int int_e;
	static volatile long long_f = 0L;
	static lf lf_g = dd.a(" x ", 2);
	static int[] ints_h = new int[32768];
	static eh eh_i;
	static int int_j = 0;

	static boolean a(int var0, int var1, int var2) {
		for (int var3 = 0; var3 < nd.int_r; ++var3) {
			rg class_rg = ig.rgs_c[var3];
			switch (class_rg.int_h) {
				case 1: {
					int var5 = class_rg.B - var0;
					if (var5 > 0) {
						int var6 = class_rg.y + (class_rg.int_v * var5 >> 8);
						int var7 = class_rg.int_g + (class_rg.int_n * var5 >> 8);
						int var8 = class_rg.x + (class_rg.int_i * var5 >> 8);
						int var9 = class_rg.int_u + (class_rg.z * var5 >> 8);
						if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
							return true;
						}
					}
					break;
				}
				case 2: {
					int var5 = var0 - class_rg.B;
					if (var5 > 0) {
						int var6 = class_rg.y + (class_rg.int_v * var5 >> 8);
						int var7 = class_rg.int_g + (class_rg.int_n * var5 >> 8);
						int var8 = class_rg.x + (class_rg.int_i * var5 >> 8);
						int var9 = class_rg.int_u + (class_rg.z * var5 >> 8);
						if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
							return true;
						}
					}
					break;
				}
				case 3: {
					int var5 = class_rg.y - var2;
					if (var5 > 0) {
						int var6 = class_rg.B + (class_rg.int_r * var5 >> 8);
						int var7 = class_rg.int_q + (class_rg.int_a * var5 >> 8);
						int var8 = class_rg.x + (class_rg.int_i * var5 >> 8);
						int var9 = class_rg.int_u + (class_rg.z * var5 >> 8);
						if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
							return true;
						}
					}
					break;
				}
				case 4: {
					int var5 = var2 - class_rg.y;
					if (var5 > 0) {
						int var6 = class_rg.B + (class_rg.int_r * var5 >> 8);
						int var7 = class_rg.int_q + (class_rg.int_a * var5 >> 8);
						int var8 = class_rg.x + (class_rg.int_i * var5 >> 8);
						int var9 = class_rg.int_u + (class_rg.z * var5 >> 8);
						if (var0 >= var6 && var0 <= var7 && var1 >= var8 && var1 <= var9) {
							return true;
						}
					}
					break;
				}
				case 5: {
					int var5 = var1 - class_rg.x;
					if (var5 > 0) {
						int var6 = class_rg.B + (class_rg.int_r * var5 >> 8);
						int var7 = class_rg.int_q + (class_rg.int_a * var5 >> 8);
						int var8 = class_rg.y + (class_rg.int_v * var5 >> 8);
						int var9 = class_rg.int_g + (class_rg.int_n * var5 >> 8);
						if (var0 >= var6 && var0 <= var7 && var2 >= var8 && var2 <= var9) {
							return true;
						}
					}
					break;
				}
			}
		}

		return false;
	}

	public static void a(int var0) {
		try {
			lf_g = null;
			lf_a = null;
			if (var0 != 2) {
				a(-56, 72, 106);
			}

			lf_b = null;
			lf_c = null;
			ints_h = null;
			lf_d = null;
			eh_i = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "a.A(" + var0 + ')');
		}
	}
}
