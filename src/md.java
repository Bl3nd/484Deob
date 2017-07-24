final class md {

	static lf lf_a = dd.a("leuchten1:", 2);
	static int int_b = 0;
	static int int_c;
	static lf lf_d = null;
	static int int_e;
	static int int_f;
	static lf lf_g = dd.a("Stufe)2", 2);
	static lf[] lfs_h = new lf[1000];
	static lf lf_i;
	static lf lf_j;
	static lf[] lfs_k = new lf[100];
	private static lf lf_l = dd.a("scroll:", 2);
	static lf lf_m;

	static mb a(byte var0, bg cache15, int fileID) {
		try {
			int var3 = 62 / ((49 - var0) / 35);
			++int_e;
			byte[] var4 = cache15.f(0, fileID);
			return var4 == null ? null : new mb(var4);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "md.A(" + var0 + ',' + (cache15 != null ? "{...}" : "null") + ',' + fileID + ')');
		}
	}

	static boolean a(int var0, int var1, int var2, int var3) {
		if (!vh.a(var0, var1, var2)) {
			return false;
		} else {
			int var4 = var1 << 7;
			int var5 = var2 << 7;
			int var6 = ch.ints_g[var0][var1][var2] - 1;
			int var7 = var6 - 120;
			int var8 = var6 - 230;
			int var9 = var6 - 238;
			if (var3 < 16) {
				if (var3 == 1) {
					if (var4 > bg.int_l) {
						if (!a.a(var4, var6, var5)) {
							return false;
						}

						if (!a.a(var4, var6, var5 + 128)) {
							return false;
						}
					}

					if (var0 > 0) {
						if (!a.a(var4, var7, var5)) {
							return false;
						}

						if (!a.a(var4, var7, var5 + 128)) {
							return false;
						}
					}

					if (!a.a(var4, var8, var5)) {
						return false;
					}

					if (!a.a(var4, var8, var5 + 128)) {
						return false;
					}

					return true;
				}

				if (var3 == 2) {
					if (var5 < pe.int_l) {
						if (!a.a(var4, var6, var5 + 128)) {
							return false;
						}

						if (!a.a(var4 + 128, var6, var5 + 128)) {
							return false;
						}
					}

					if (var0 > 0) {
						if (!a.a(var4, var7, var5 + 128)) {
							return false;
						}

						if (!a.a(var4 + 128, var7, var5 + 128)) {
							return false;
						}
					}

					if (!a.a(var4, var8, var5 + 128)) {
						return false;
					}

					if (!a.a(var4 + 128, var8, var5 + 128)) {
						return false;
					}

					return true;
				}

				if (var3 == 4) {
					if (var4 < bg.int_l) {
						if (!a.a(var4 + 128, var6, var5)) {
							return false;
						}

						if (!a.a(var4 + 128, var6, var5 + 128)) {
							return false;
						}
					}

					if (var0 > 0) {
						if (!a.a(var4 + 128, var7, var5)) {
							return false;
						}

						if (!a.a(var4 + 128, var7, var5 + 128)) {
							return false;
						}
					}

					if (!a.a(var4 + 128, var8, var5)) {
						return false;
					}

					if (!a.a(var4 + 128, var8, var5 + 128)) {
						return false;
					}

					return true;
				}

				if (var3 == 8) {
					if (var5 > pe.int_l) {
						if (!a.a(var4, var6, var5)) {
							return false;
						}

						if (!a.a(var4 + 128, var6, var5)) {
							return false;
						}
					}

					if (var0 > 0) {
						if (!a.a(var4, var7, var5)) {
							return false;
						}

						if (!a.a(var4 + 128, var7, var5)) {
							return false;
						}
					}

					if (!a.a(var4, var8, var5)) {
						return false;
					}

					if (!a.a(var4 + 128, var8, var5)) {
						return false;
					}

					return true;
				}
			}

			return !a.a(var4 + 64, var9, var5 + 64) ? false : (var3 == 16 ? a.a(var4, var8, var5 + 128) : (var3 == 32 ? a.a(var4 + 128, var8, var5 + 128) : (var3 == 64 ? a.a(var4 + 128, var8, var5) : (var3 == 128 ? a.a(var4, var8, var5) : true))));
		}
	}

	public static void a(int var0) {
		try {
			lfs_h = null;
			lf_j = null;
			lf_m = null;
			lf_i = null;
			int var1 = -46 % ((var0 - -24) / 32);
			lfs_k = null;
			lf_g = null;
			lf_d = null;
			lf_a = null;
			lf_l = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "md.D(" + var0 + ')');
		}
	}

	static void a(int var0, int var1, oh var2) {
		try {
			++int_c;
			if (mf.A != null) {
				mf.A.P = 5 + 8 * var1;
				int var3 = mf.A.l(15);
				int var4 = mf.A.l(15);
				var2.e(106, var3, var4);
			} else {
				j.a(var0, (byte) 0, (oh) null, true, 255, var0 + 118, 255);
				f.U[var1] = var2;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "md.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_j = lf_l;
		lf_i = lf_l;
		lf_m = dd.a("<col=ffffff>", 2);
	}
}
