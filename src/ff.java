import java.awt.Component;

final class ff {

	static int int_a;
	static short[] shorts_b;
	static lf lf_c;
	private static lf lf_d;
	private static lf lf_e = dd.a("Cancel", 2);
	static int int_f;
	static int int_g;
	static int int_h;
	static long long_i;
	static oh cache3;//oh_j
	static lf lf_k;
	static int int_l;
	static int int_m;

	static boolean a(int var0, boolean var1, long var2, int var4) {
		int var12 = client.int_gc;

		try {
			++int_l;
			int var6 = (int) var2 >> 719061908 & 3;
			int var7 = Integer.MAX_VALUE & (int) (var2 >>> 1080817888);
			if (var1) {
				return true;
			} else {
				label42:
				{
					int var5 = ((int) var2 & 515505) >> 648629518;
					if (~var5 != -11 && ~var5 != -12 && var5 != 22) {
						fd.a(0, 0, 0, var4, var6, 2, r.X.xb[0], r.X.ints_db[0], true, var0, var5 - -1, 0);
						if (var12 == 0) {
							break label42;
						}
					}

					int var9;
					int var10;
					int var11;
					label29:
					{
						i var8 = pa.a((int) var7, 0);
						var11 = var8.int_tb;
						if (var6 != 0 && ~var6 != -3) {
							var10 = var8.L;
							var9 = var8.I;
							if (var12 == 0) {
								break label29;
							}
						}

						var10 = var8.I;
						var9 = var8.L;
					}

					if (~var6 != -1) {
						var11 = (15 & var11 << var6) - -(var11 >> 4 + -var6);
					}

					fd.a(0, var9, var10, var4, 0, 2, r.X.xb[0], r.X.ints_db[0], true, var0, 0, var11);
				}

				pf.int_eb = gg.int_o;
				je.int_k = 0;
				fi.y = nh.int_mb;
				vf.U = 2;
				return true;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "ff.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var4 + ')');
		}
	}

	static void a(oe var0, int var1, int var2, int var3) {
		ab var4;
		oe var5;
		if (var2 < l.int_l) {
			var4 = i.Ib[var1][var2 + 1][var3];
			if (var4 != null && var4.D != null && var4.D.ka_i instanceof oe) {
				var5 = (oe) var4.D.ka_i;
				oe.a(var0, var5, 128, 0, 0, true);
			}
		}

		if (var3 < l.int_l) {
			var4 = i.Ib[var1][var2][var3 + 1];
			if (var4 != null && var4.D != null && var4.D.ka_i instanceof oe) {
				var5 = (oe) var4.D.ka_i;
				oe.a(var0, var5, 0, 0, 128, true);
			}
		}

		if (var2 < l.int_l && var3 < ge.int_c) {
			var4 = i.Ib[var1][var2 + 1][var3 + 1];
			if (var4 != null && var4.D != null && var4.D.ka_i instanceof oe) {
				var5 = (oe) var4.D.ka_i;
				oe.a(var0, var5, 128, 0, 128, true);
			}
		}

		if (var2 < l.int_l && var3 > 0) {
			var4 = i.Ib[var1][var2 + 1][var3 - 1];
			if (var4 != null && var4.D != null && var4.D.ka_i instanceof oe) {
				var5 = (oe) var4.D.ka_i;
				oe.a(var0, var5, 128, 0, -128, true);
			}
		}

	}

	public static void a(byte var0) {
		try {
			lf_k = null;
			if (var0 >= -43) {
				int_a = -89;
			}

			cache3 = null;
			lf_d = null;
			shorts_b = null;
			lf_e = null;
			lf_c = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ff.D(" + var0 + ')');
		}
	}

	static lf a(ja var0, byte var1) {
		try {
			++int_g;
			if (var1 <= 52) {
				cache3 = null;
			}

			return lb.a(var0, 0, 32767);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ff.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static kf[] b(byte var0) {
		int var8 = client.int_gc;

		try {
			++int_h;
			kf[] var1 = new kf[oa.int_hb];
			int var3 = -33 / ((var0 - 21) / 33);
			int var2 = 0;
			if (var8 == 0 && oa.int_hb <= var2) {
				h.b(-109);
				return var1;
			} else {
				do {
					kf var4 = new kf();
					var4.R = sb.int_c;
					var4.T = md.int_f;
					var4.S = rc.ints_a[var2];
					var4.U = w.ints_f[var2];
					var4.Q = c.ints_db[var2];
					var4.P = h.ints_n[var2];
					int var5 = var4.Q * var4.P;
					byte[] var6 = ai.bytes_i[var2];
					var4.O = new int[var5];
					int var7 = 0;
					if (var8 != 0) {
						var4.O[var7] = f.V[sd.a(255, var6[var7])];
						++var7;
					}

					while (~var7 > ~var5) {
						var4.O[var7] = f.V[sd.a(255, var6[var7])];
						++var7;
					}

					var1[var2] = var4;
					++var2;
				} while (oa.int_hb > var2);

				h.b(-109);
				return var1;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ff.G(" + var0 + ')');
		}
	}

	static boolean a(int var0, int var1) {
		try {
			++int_m;
			return var1 != -13101 ? true : ~var0 <= -98 && var0 <= 122 || ~var0 <= -66 && ~var0 >= -91;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ff.F(" + var0 + ',' + var1 + ')');
		}
	}

	static void a(bg cache8, int var1, bg cache10, Component component) {
		int dummy = client.int_gc;

		try {
			++int_f;
			if (!ie.Pb) {
				int var5 = 115 % ((var1 - -68) / 48);
				b.a();
				byte[] titleJPGData = cache10.a(83, pf.Y, ob.title_jpg);
				kd.kf_mb = new kf(titleJPGData, component);
				f.S = kd.kf_mb.g();
				ra.Q = rf.a(pf.Y, cache8, (byte) 75, ia.logo);
				dc.df_ib = rf.a(pf.Y, cache8, (byte) 75, ig.titlebox);
				ng.df_db = rf.a(pf.Y, cache8, (byte) 75, bi.titlebutton);
				wh.dfs_c = pb.a(pf.Y, 107, wb.runes, cache8);
				id.dfs_s = pb.a(pf.Y, -78, rd.title_mute, cache8);
				hg.ints_m = new int[256];
				int var6 = 0;
				if (dummy != 0 || ~var6 > -65) {
					do {
						hg.ints_m[var6] = var6 * 262144;
						++var6;
					} while (~var6 > -65);
				}

				int var7 = 0;
				if (dummy != 0) {
					hg.ints_m[64 + var7] = 16711680 - -(var7 * 1024);
					++var7;
				}

				while (var7 < 64) {
					hg.ints_m[64 + var7] = 16711680 - -(var7 * 1024);
					++var7;
				}

				int var8 = 0;
				if (dummy != 0 || ~var8 > -65) {
					do {
						hg.ints_m[var8 + 128] = 4 * var8 + 16776960;
						++var8;
					} while (~var8 > -65);
				}

				int var9 = 0;
				if (dummy != 0) {
					hg.ints_m[var9 - -192] = 16777215;
					++var9;
				}

				while (~var9 > -65) {
					hg.ints_m[var9 - -192] = 16777215;
					++var9;
				}

				pd.ints_h = new int[256];
				int var10 = 0;
				if (dummy != 0 || var10 < 64) {
					do {
						pd.ints_h[var10] = 1024 * var10;
						++var10;
					} while (var10 < 64);
				}

				int var11 = 0;
				if (dummy != 0) {
					pd.ints_h[64 + var11] = '\uff00' - -(4 * var11);
					++var11;
				}

				while (~var11 > -65) {
					pd.ints_h[64 + var11] = '\uff00' - -(4 * var11);
					++var11;
				}

				int var12 = 0;
				if (dummy != 0 || var12 < 64) {
					do {
						pd.ints_h[var12 - -128] = '\uffff' + var12 * 262144;
						++var12;
					} while (var12 < 64);
				}

				int var13 = 0;
				if (dummy != 0) {
					pd.ints_h[192 + var13] = 16777215;
					++var13;
				}

				while (~var13 > -65) {
					pd.ints_h[192 + var13] = 16777215;
					++var13;
				}

				sd.ints_ab = new int[256];
				int var14 = 0;
				if (dummy != 0 || var14 < 64) {
					do {
						sd.ints_ab[var14] = 4 * var14;
						++var14;
					} while (var14 < 64);
				}

				int var15 = 0;
				if (dummy != 0) {
					sd.ints_ab[var15 - -64] = 255 + var15 * 262144;
					++var15;
				}

				while (~var15 > -65) {
					sd.ints_ab[var15 - -64] = 255 + var15 * 262144;
					++var15;
				}

				int var16 = 0;
				if (dummy != 0 || var16 < 64) {
					do {
						sd.ints_ab[var16 - -128] = 16711935 - -(1024 * var16);
						++var16;
					} while (var16 < 64);
				}

				int var17 = 0;
				if (dummy != 0) {
					sd.ints_ab[var17 - -192] = 16777215;
					++var17;
				}

				while (var17 < 64) {
					sd.ints_ab[var17 - -192] = 16777215;
					++var17;
				}

				label80:
				{
					mc.ints_s = new int[256];
					uf.ints_a = new int['耀'];
					ai.ints_d = new int['耀'];
					c.a((df) null, (byte) -86);
					od.W = false;
					if (~tc.R == -1) {
						ef.boolean_l = true;
						if (dummy == 0) {
							break label80;
						}
					}

					ef.boolean_l = false;
				}

				label75:
				{
					lf.J = 0;
					pf.lf_kb = pf.Y;
					pf.Q = pf.Y;
					dg.ints_k = new int['耀'];
					ba.ints_d = new int['耀'];
					if (!ef.boolean_l) {
						tf.a(og.scape_main, 2, l.cache6, pf.Y, (byte) 122, false, 255);
						if (dummy == 0) {
							break label75;
						}
					}

					eh.b(2, 1);
				}

				e.a(-1, false);
				ie.Pb = true;
				kd.kf_mb.b(0, 0);
				f.S.b(382, 0);
				ra.Q.a(382 - ra.Q.N / 2, 18);
				hh.W = new kf(128, 254);
				rc.kf_l = new kf(128, 254);
			}
		} catch (RuntimeException var19) {
			throw ec.a(var19, "ff.C(" + (cache8 != null ? "{...}" : "null") + ',' + var1 + ',' + (cache10 != null ? "{...}" : "null") + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_c = lf_e;
		lf_d = dd.a("Invalid username or password)3", 2);
		shorts_b = new short[]{(short) -1, (short) -1, (short) -1, (short) -1, (short) -1};
		lf_k = lf_d;
	}
}
