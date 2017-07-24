abstract class ch {

	int int_a;
	static lf lf_b = dd.a("::autoshadow on", 2);
	static sc sc_c;
	static lf lf_d = dd.a("au", 2);
	static lf lf_e = dd.a(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 2);
	int int_f;
	static int[][][] ints_g;
	static int int_h;
	static bg bg_i;
	static int int_j;
	static lf lf_k;
	private static lf lf_l = dd.a("To play on this world move to a free area first)3", 2);
	static int int_m;
	static lf lf_n = dd.a("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 2);
	static int int_o = 0;
	static int int_p;
	static int int_q;
	static lf lf_r;
	static int int_s;

	public static void a(int var0) {
		try {
			lf_d = null;
			ints_g = null;
			lf_b = null;
			lf_k = null;
			lf_n = null;
			lf_r = null;
			sc_c = null;
			lf_l = null;
			if (var0 == 0) {
				bg_i = null;
				lf_e = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ch.G(" + var0 + ')');
		}
	}

	abstract void a(int var1, int var2, int var3);

	static lf a(int length, byte var1, lf[] lfArray, int var3) {
		try {
			++int_j;
			int var4 = 0;
			int var5 = 0;
			while (length > var5) {
				if (lfArray[var3 + var5] == null) {
					lfArray[var5 + var3] = lc.E;
				}

				var4 += lfArray[var5 + var3].S;
				++var5;
			}

			if (var1 != 53) {
				int_h = -100;
			}

			byte[] var6 = new byte[var4];
			int var7 = 0;
			int var8 = 0;
			lf var9;
			if (length <= var8) {
				var9 = new lf();
				var9.S = var4;
				var9.Y = var6;
				return var9;
			} else {
				do {
					var9 = lfArray[var3 + var8];
					na.a(var9.Y, 0, var6, var7, var9.S);
					var7 += var9.S;
					++var8;
				} while (length > var8);

				var9 = new lf();
				var9.S = var4;
				var9.Y = var6;
				return var9;
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "ch.E(" + length + ',' + var1 + ',' + (lfArray != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	abstract void a(int var1, int var2, byte var3);

	static int b(int var0, int var1, int var2) {
		try {
			++int_m;
			if (var1 <= 91) {
				b(-109, 104, -117);
			}

			lc var3 = (lc) hg.eh_l.a((long) var2, (byte) -110);
			return var3 == null ? 0 : (var0 >= 0 && ~var3.ints_n.length < ~var0 ? var3.ints_n[var0] : 0);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ch.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a(int plane, int var1, int var2, int var3, int y, int x, int var6, ja class_ja) {
		try {
			++int_q;
			if (x >= 0 && x < 104 && y >= 0 && y < 104) {
				jc.bytes_q[plane][x][y] = 0;

				while (true) {
					int var8 = class_ja.j((byte) 104);
					if (var8 == 0) {
						if (plane != 0) {
							u.vertexHeights[plane][x][y] = -240 + u.vertexHeights[-1 + plane][x][y];
							return;
						} else {
							u.vertexHeights[0][x][y] = -kh.a(556238 - (-y + -var2), (byte) 3, var6 + x + 932731) * 8;
							return;
						}
					} else if (var8 == 1) {
						int var9 = class_ja.j((byte) 82);
						if (var9 == 1) {
							var9 = 0;
						}

						if (plane != 0) {
							u.vertexHeights[plane][x][y] = u.vertexHeights[-1 + plane][x][y] + -(8 * var9);
							return;
						} else {
							u.vertexHeights[0][x][y] = 8 * -var9;
							return;
						}
					} else if (var8 <= 49) {
						pc.bytes_d[plane][x][y] = class_ja.m(3);
						ah.bytes_d[plane][x][y] = (byte) ((var8 - 2) / 4);
						lc.B[plane][x][y] = (byte) sd.a(var3 + (var8 - 2), 3);
					} else if (var8 <= 81) {
						jc.bytes_q[plane][x][y] = (byte) (var8 + -49);
					} else {
						jc.z[plane][x][y] = (byte) (var8 + -81);
					}
				}
			}

			while (true) {
				int var8 = class_ja.j((byte) 120);
				if (var8 == 0) {
					break;
				} else if (var8 == 1) {
					class_ja.j((byte) 109);
					return;
				} else if (var8 <= 49) {
					class_ja.j((byte) 111);
				}
			}

			if (var1 <= 119) {
				lf_r = null;
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "ch.D(" + plane + ',' + var1 + ',' + var2 + ',' + var3 + ',' + y + ',' + x + ',' + var6 + ',' + (class_ja != null ? "{...}" : "null") + ')');
		}
	}

	abstract void c(int var1, int var2, int var3);

	static {
		lf_r = lf_l;
		lf_k = dd.a(" (X", 2);
		int_s = 0;
	}
}
