import java.util.Random;

final class nb {

	static boolean boolean_a = false;
	static int int_b;
	static int[] ints_c;
	static int int_d;
	static int int_e;
	static lf lf_f;
	static lf lf_g = dd.a("null", 2);
	static lf lf_h = dd.a("Unerwartete Antwort vom Anmelde)2Server)3", 2);
	static int int_i;
	static int int_j;
	private static lf lf_k = dd.a("Please wait )2 attempting to reestablish)3", 2);
	static int int_l;
	static df[] dfs_m;
	static int int_n;

	static final synchronized long a(boolean var0) {
		try {
			++int_l;
			long var1 = System.currentTimeMillis();
			if (ff.long_i > var1) {
				pd.long_s += ff.long_i + -var1;
			}

			ff.long_i = var1;
			if (var0) {
				lf_h = null;
			}

			return var1 + pd.long_s;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nb.C(" + var0 + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, ka var8, int var9, boolean var10, long var11) {
		for (int var13 = var1; var13 < var1 + var3; ++var13) {
			for (int var14 = var2; var14 < var2 + var4; ++var14) {
				if (var13 < 0 || var14 < 0 || var13 >= l.int_l || var14 >= ge.int_c) {
					return false;
				}

				ab var15 = i.Ib[var0][var13][var14];
				if (var15 != null && var15.int_p >= 5) {
					return false;
				}
			}
		}

		ed var20 = new ed();
		var20.long_w = var11;
		var20.int_m = var0;
		var20.int_n = var5;
		var20.int_c = var6;
		var20.int_k = var7;
		var20.ka_s = var8;
		var20.int_q = var9;
		var20.int_u = var1;
		var20.int_f = var2;
		var20.int_a = var1 + var3 - 1;
		var20.int_r = var2 + var4 - 1;

		for (int var21 = var1; var21 < var1 + var3; ++var21) {
			for (int var16 = var2; var16 < var2 + var4; ++var16) {
				int var17 = 0;
				if (var21 > var1) {
					++var17;
				}

				if (var21 < var1 + var3 - 1) {
					var17 += 4;
				}

				if (var16 > var2) {
					var17 += 8;
				}

				if (var16 < var2 + var4 - 1) {
					var17 += 2;
				}

				for (int var18 = var0; var18 >= 0; --var18) {
					if (i.Ib[var18][var21][var16] == null) {
						i.Ib[var18][var21][var16] = new ab(var18, var21, var16);
					}
				}

				ab var19 = i.Ib[var0][var21][var16];
				var19.eds_t[var19.int_p] = var20;
				var19.E[var19.int_p] = var17;
				var19.x |= var17;
				++var19.int_p;
			}
		}

		if (var10) {
			n.eds_m[ug.int_bb++] = var20;
		}

		return true;
	}

	static final int a(int var0, Random var1, boolean var2) {
		try {
			++int_j;
			if (~var0 >= -1) {
				throw new IllegalArgumentException();
			} else {
				if (!var2) {
					a(true, 33);
				}

				if (ae.a(var0, (byte) 47)) {
					return (int) ((long) var0 * (4294967295L & (long) var1.nextInt()) >> 32);
				} else {
					int var3 = -((int) (4294967296L % (long) var0)) + Integer.MIN_VALUE;

					int var4;
					do {
						var4 = var1.nextInt();
					} while (var4 >= var3);

					return ad.a(var0, -1156100001, var4);
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "nb.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static final rd a(boolean var0, int var1) {
		try {
			++int_d;
			if (!var0) {
				return null;
			} else {
				rd var2 = (rd) kh.R.a((long) var1, (int) -117);
				if (var2 != null) {
					return var2;
				} else {
					byte[] var3 = gg.bg_j.a(0, var1, 14);
					var2 = new rd();
					if (var3 != null) {
						var2.a(new ja(var3), 28109);
					}

					kh.R.a((long) var1, -113, var2);
					return var2;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "nb.G(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a(int var0) {
		try {
			ints_c = null;
			int var1 = -52 / ((var0 - -16) / 33);
			dfs_m = null;
			lf_g = null;
			lf_h = null;
			lf_f = null;
			lf_k = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nb.A(" + var0 + ')');
		}
	}

	static final void b(int var0) {
		try {
			va.W = false;
			tf.boolean_q = false;
			++int_e;
			int var1 = 65 % ((63 - var0) / 42);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nb.B(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4) {
		int var10 = client.int_gc;

		try {
			++int_i;
			lc var5 = (lc) hg.eh_l.a((long) var3, (byte) -122);
			if (var5 == null) {
				var5 = new lc();
				hg.eh_l.a((long) var3, false, var5);
			}

			if (var4 != 4) {
				lf_h = null;
			}

			if (var5.ints_u.length <= var0) {
				int[] var6 = new int[1 + var0];
				int[] var7 = new int[var0 + 1];
				int var8 = 0;
				if (var10 != 0 || ~var5.ints_u.length < ~var8) {
					do {
						var6[var8] = var5.ints_u[var8];
						var7[var8] = var5.ints_n[var8];
						++var8;
					} while (~var5.ints_u.length < ~var8);
				}

				int var9 = var5.ints_u.length;
				if (var10 != 0 || ~var9 > ~var0) {
					do {
						var6[var9] = -1;
						var7[var9] = 0;
						++var9;
					} while (~var9 > ~var0);
				}

				var5.ints_u = var6;
				var5.ints_n = var7;
			}

			var5.ints_u[var0] = var2;
			var5.ints_n[var0] = var1;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "nb.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final void a(int baseX, int baseY, byte[] var2, int var3, lb[] collisionMaps) {
		try {
			++int_b;
			if (var3 >= 5) {
				int id = -1;
				ja class_ja = new ja(var2);

				do {
					int idOffset = class_ja.h((byte) 17);
					if (idOffset == 0) {
						break;
					}

					id += idOffset;
					int data = 0;

					while (true) {
						int dataOffset = class_ja.f(0);
						if (dataOffset == 0) {
							break;
						}

						data += -1 + dataOffset;
						int offsetX = (4035 & data) >> 6;
						int offsetY = 63 & data;
						int plane = data >> 12;
						int meta = class_ja.j((byte) 107);
						int type = meta >> 2;
						int rotation = 3 & meta;
						int lx = baseX + offsetX;
						int ly = offsetY + baseY;
						if (lx > 0 && ly > 0 && lx < 103 && ly < 103) {
							int currentPlane = plane;
							if ((2 & jc.bytes_q[1][lx][ly]) == 2) {
								currentPlane = plane - 1;
							}

							lb collisionMap = null;
							if (currentPlane >= 0) {
								collisionMap = collisionMaps[currentPlane];
							}

							w.a(plane, id, rotation, type, 16, collisionMap, lx, ly);
						}
					}
				} while (true);

			}
		} catch (RuntimeException var21) {
			throw ec.a(var21, "nb.F(" + baseX + ',' + baseY + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (collisionMaps != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_f = lf_k;
	}
}
