import java.awt.Font;

final class cb {

	static int int_a;
	static lf lf_b = dd.a("(U", 2);
	static lf lf_c;
	private eh eh_d = new eh(256);
	private static lf lf_e = dd.a("Error connecting to server)3", 2);
	static Font font_f;
	static int int_g;
	private static lf lf_h = dd.a("Loading textures )2 ", 2);
	private bg cache4;//bg_i
	static lf headicons_pk = dd.a("headicons_pk", 2);//lf_j
	private bg cache14;//bg_k
	static int int_l;
	static int sampleRate;//int_m
	private static lf lf_n = dd.a("as it was used to break our rules)3", 2);
	static lf lf_o;
	static boolean[][][][] booleans_p;
	static int int_q;
	static lf lf_r = dd.a("hel", 2);
	private eh eh_s = new eh(256);
	static lf lf_t;
	private static lf lf_u;
	static int int_v;
	static int int_w;
	static lf x;

	private final k a(int[] var1, int var2, int var3, int var4) {
		try {
			++int_l;
			int var5 = var4 ^ (var2 >>> 12 | (var2 & -805302273) << 4);
			var5 |= var2 << 16;
			long var6 = (long) var5 ^ 4294967296L;
			k var8 = (k) this.eh_s.a(var6, (byte) -95);
			if (var8 != null) {
				return var8;
			} else if (var1 != null && var1[0] <= 0) {
				return null;
			} else {
				if (var3 != -900517724) {
					headicons_pk = null;
				}

				fe var9 = (fe) this.eh_d.a(var6, (byte) -109);
				if (var9 == null) {
					var9 = fe.a(this.cache14, var2, var4);
					if (var9 == null) {
						return null;
					}

					this.eh_d.a(var6, false, var9);
				}

				var8 = var9.a(var1);
				if (var8 == null) {
					return null;
				} else {
					var9.a(true);
					this.eh_s.a(var6, false, var8);
					return var8;
				}
			}
		} catch (RuntimeException var10) {
			var10.printStackTrace();
			throw ec.a(var10, "cb.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static boolean a(vg var0, int var1) {
		int var5 = client.int_gc;

		try {
			++int_a;
			if (var0.ints_eb == null) {
				return false;
			} else {
				int var2 = var1;
				if (var5 == 0 && var1 >= var0.ints_eb.length) {
					return true;
				} else {
					do {
						int var3 = tf.a(var0, 10, var2);
						int var4 = var0.ints_e[var2];
						if (var0.ints_eb[var2] == 2) {
							if (var4 <= var3) {
								return false;
							}
						} else if (~var0.ints_eb[var2] == -4) {
							if (~var3 >= ~var4) {
								return false;
							}
						} else if (var0.ints_eb[var2] == 4) {
							if (var4 == var3) {
								return false;
							}
						} else if (var4 != var3) {
							return false;
						}

						++var2;
					} while (var2 < var0.ints_eb.length);

					return true;
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "cb.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	final k a(int[] var1, byte var2, int var3) {
		try {
			++int_g;
			if (this.cache4.a((byte) 97) == 1) {
				return this.b(var1, var3, 0, 1);
			} else if (this.cache4.b((byte) 69, (int) var3) == 1) {
				return this.b(var1, 0, var3, 1);
			} else {
				if (var2 >= -111) {
					lf_o = null;
				}

				throw new RuntimeException();
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "cb.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void a(boolean var0) {
		try {
			lf_u = null;
			booleans_p = null;
			lf_t = null;
			lf_r = null;
			lf_b = null;
			x = null;
			headicons_pk = null;
			lf_e = null;
			lf_n = null;
			font_f = null;
			lf_c = null;
			if (var0) {
				lf_o = null;
				lf_h = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "cb.E(" + var0 + ')');
		}
	}

	final k a(int var1, int var2, int[] var3) {
		try {
			++int_w;
			if (this.cache14.a((byte) 122) == var1) {
				return this.a(var3, 0, -900517724, var2);
			} else if (~this.cache14.b((byte) 87, (int) var2) == -2) {
				return this.a(var3, var2, -900517724, 0);
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "cb.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final k b(int[] var1, int var2, int var3, int var4) {
		try {
			int var5 = (var3 >>> -1409012916 | (var3 & -1342173185) << 1486877700) ^ var2;
			++int_q;
			var5 |= var3 << -1907794032;
			if (var4 != 1) {
				return null;
			} else {
				long var6 = (long) var5;
				k var8 = (k) this.eh_s.a(var6, (byte) -82);
				if (var8 != null) {
					return var8;
				} else if (var1 != null && ~var1[0] >= -1) {
					return null;
				} else {
					mh var9 = mh.a(this.cache4, var3, var2);
					if (var9 == null) {
						return null;
					} else {
						var8 = var9.c();
						this.eh_s.a(var6, false, var8);
						if (var1 != null) {
							var1[0] -= var8.bytes_q.length;
						}

						return var8;
					}
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "cb.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static void a(int heightCount, int x, int y, int[][][] vertexHeights) {
		ec.int_bb = heightCount;
		l.int_l = x;
		ge.int_c = y;
		i.Ib = new ab[heightCount][x][y];
		wd.ints_mb = new int[heightCount][x + 1][y + 1];
		ch.ints_g = vertexHeights;
		ce.a();
	}

	cb(bg cache4, bg cache14) {
		try {
			this.cache4 = cache4;
			this.cache14 = cache14;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "cb.<init>(" + (cache4 != null ? "{...}" : "null") + ',' + (cache14 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_o = lf_n;
		lf_c = lf_e;
		x = lf_h;
		lf_u = dd.a("Loading config )2 ", 2);
		lf_t = lf_u;
	}
}
