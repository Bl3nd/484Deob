import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class wg {

	private j j_a;
	static int int_b;
	static int int_c;
	private int[] ints_d;
	static lf lf_e;
	private j j_f;
	static vg vg_g;
	static int int_h;
	static int int_i;
	private int[] ints_j;
	static int int_k;
	private j[] js_l;
	private static lf lf_m = dd.a("Checking for updates )2 ", 2);
	static int int_n = 0;
	static int int_o;
	static int int_p;

	final boolean a(int var1, aa var2, bg var3) {
		int var6 = client.int_gc;

		try {
			++int_c;
			int var4 = var1;
			if (var6 != 0 || this.ints_j.length > var1) {
				do {
					if (!var3.d(-5526, this.ints_j[var4])) {
						return false;
					}

					++var4;
				} while (this.ints_j.length > var4);
			}

			int var5 = 0;
			if (var6 == 0 && var5 >= this.ints_d.length) {
				return true;
			} else {
				do {
					if (!var2.b(this.ints_d[var5], var1 ^ -17678)) {
						return false;
					}

					++var5;
				} while (var5 < this.ints_d.length);

				return true;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "wg.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_e = null;
			lf_m = null;
			if (var0 != 0) {
				a(-120, (vg[]) null, -11);
			}

			vg_g = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wg.B(" + var0 + ')');
		}
	}

	static final void a(byte var0, int var1) {
		int var3 = client.int_gc;

		try {
			++int_k;
			if (var0 != -64) {
				a(121);
			}

			me var2 = (me) va.X.a((byte) 99);
			if (var3 != 0 || var2 != null) {
				do {
					if (~(var2.long_e >> -507915792 & 65535L) == ~((long) var1)) {
						var2.a(true);
					}

					var2 = (me) va.X.c(1);
				} while (var2 != null);

			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "wg.C(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(int var0, vg[] var1, int var2) {
		int var6 = client.int_gc;

		try {
			++int_o;
			int var3 = 0;
			if (var6 == 0 && ~var3 <= ~var1.length) {
				if (var0 != -4019) {
					lf_m = null;
				}
			} else {
				do {
					vg var4 = var1[var3];
					if (var4 != null) {
						if (var4.int_ib == 0) {
							if (var4.Fb != null) {
								a(-4019, var4.Fb, var2);
							}

							fi var5 = (fi) ma.eh_e.a((long) var4.Z, (byte) -85);
							if (var5 != null) {
								ce.c(var2, var0 ^ -3995, var5.int_n);
							}
						}

						id var8;
						if (~var2 == -1 && var4.Wb != null) {
							var8 = new id();
							var8.vg_o = var4;
							var8.objects_t = var4.Wb;
							ea.a(var0 + 28106, var8);
						}

						if (var2 == 1 && var4.objects_pc != null) {
							label60:
							{
								if (var4.Hb >= 0) {
									vg var9 = ra.a(var4.Z, (byte) 115);
									if (var9 == null || var9.Fb == null || var9.Fb.length <= var4.Hb || var9.Fb[var4.Hb] != var4 && var6 == 0) {
										break label60;
									}
								}

								var8 = new id();
								var8.vg_o = var4;
								var8.objects_t = var4.objects_pc;
								ea.a(24087, var8);
							}
						}
					}

					++var3;
				} while (~var3 > ~var1.length);

				if (var0 != -4019) {
					lf_m = null;
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "wg.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public wg() {
		try {
			this.ints_d = new int[0];
			this.ints_j = new int[0];
			this.j_a = new ra();
			this.j_f = new ra();
			this.js_l = new j[]{this.j_a, this.j_f};
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wg.<init>(" + ')');
		}
	}

	static final String a(byte var0, Throwable var1) throws IOException {
		int var13 = client.int_gc;

		try {
			String var2;
			label38:
			{
				if (!(var1 instanceof qe)) {
					var2 = "";
					if (var13 == 0) {
						break label38;
					}
				}

				qe var3 = (qe) var1;
				var1 = var3.throwable_f;
				var2 = var3.string_e + " | ";
			}

			++int_b;
			StringWriter var15 = new StringWriter();
			PrintWriter var4 = new PrintWriter(var15);
			var1.printStackTrace(var4);
			var4.close();
			String var5 = var15.toString();
			BufferedReader var6 = new BufferedReader(new StringReader(var5));
			String var7 = var6.readLine();
			if (var0 > -34) {
				vg_g = null;
			}

			while (true) {
				String var8 = var6.readLine();
				if (var8 == null) {
					break;
				}

				int var9 = var8.indexOf(40);
				int var10 = var8.indexOf(41, 1 + var9);
				if (var9 >= 0 && var10 >= 0) {
					String var11 = var8.substring(1 + var9, var10);
					int var12 = var11.indexOf(".java:");
					if (~var12 <= -1) {
						var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
						var2 = var2 + var11 + ' ';
						if (var13 == 0) {
							continue;
						}
					}

					var8 = var8.substring(0, var9);
				}

				var8 = var8.trim();
				var8 = var8.substring(1 + var8.lastIndexOf(32));
				var8 = var8.substring(1 + var8.lastIndexOf(9));
				var2 = var2 + var8 + ' ';
				if (var13 != 0) {
					break;
				}
			}

			var2 = var2 + "| " + var7;
			return var2;
		} catch (RuntimeException var14) {
			throw var14;
		}
	}

	final int[] a(double var1, int var3, int var4, int var5, boolean var6, bg var7, aa var8) {
		int var29 = client.int_gc;

		try {
			ma.aa_q = var8;
			sb.bg_b = var7;
			rg.a(var4, 1669028716, var5);
			++int_p;
			int[] var9 = new int[var5 * var4];
			int var10 = 0;
			if (var29 != 0) {
				this.js_l[var10].a((byte) 24, var5, var4);
				++var10;
			}

			while (this.js_l.length > var10) {
				this.js_l[var10].a((byte) 24, var5, var4);
				++var10;
			}

			int var11;
			int var12;
			byte var13;
			label102:
			{
				if (!var6) {
					var12 = var5;
					var11 = 0;
					var13 = 1;
					if (var29 == 0) {
						break label102;
					}
				}

				var13 = -1;
				var11 = var5 + -1;
				var12 = -1;
			}

			int var14 = 0;
			int var15 = 0;
			if (var29 != 0 || var4 > var15) {
				do {
					int[] var16;
					int[] var17;
					int[] var18;
					label79:
					{
						if (!this.j_a.x) {
							int[][] var19 = this.j_a.b(var15, 2177);
							var18 = var19[2];
							var17 = var19[1];
							var16 = var19[0];
							if (var29 == 0) {
								break label79;
							}
						}

						int[] var32 = this.j_a.a(-108, var15);
						var16 = var32;
						var18 = var32;
						var17 = var32;
					}

					int var33 = var11;
					if (var29 == 0 && var12 == var11) {
						++var15;
					} else {
						do {
							double var20 = Math.pow((double) var16[var33] / 4096.0D, var1);
							double var22 = Math.pow((double) var17[var33] / 4096.0D, var1);
							int var26 = (int) (var20 * 256.0D);
							if (var26 > 255) {
								var26 = 255;
							}

							double var24 = Math.pow((double) var18[var33] / 4096.0D, var1);
							int var27 = (int) (256.0D * var22);
							if (var27 > 255) {
								var27 = 255;
							}

							if (~var26 > -1) {
								var26 = 0;
							}

							int var28 = (int) (var24 * 256.0D);
							if (~var27 > -1) {
								var27 = 0;
							}

							if (~var28 < -256) {
								var28 = 255;
							}

							if (var28 < 0) {
								var28 = 0;
							}

							var9[var14++] = (var27 << 1165870280) + (var26 << 893750256) + var28;
							var33 += var13;
						} while (var12 != var33);

						++var15;
					}
				} while (var4 > var15);
			}

			int var31 = var3;
			if (var29 != 0) {
				this.js_l[var3].c((byte) -113);
				var31 = var3 + 1;
			}

			while (~var31 > ~this.js_l.length) {
				this.js_l[var31].c((byte) -113);
				++var31;
			}

			return var9;
		} catch (RuntimeException var30) {
			throw ec.a(var30, "wg.E(" + var1 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + (var7 != null ? "{...}" : "null") + ',' + (var8 != null ? "{...}" : "null") + ')');
		}
	}

	wg(ja var1) {
		int var13 = client.int_gc;

		try {
			int var2 = var1.j((byte) 69);
			eh var3 = new eh(64);
			eh var4 = new eh(64);
			eh var5 = new eh(64);
			int[][] var6 = new int[var2][];
			this.js_l = new j[var2];
			int var7 = 0;
			int var10;
			int var11;
			int var12;
			if (var13 != 0 || var7 < var2) {
				do {
					j var8 = p.a(-93, var1);
					int var9 = var8.d(-1);
					var10 = var8.b(24649);
					if (~var9 <= -1 && ~var9 <= -1 && var4.a((long) var9, (byte) -120) == null) {
						var4.a((long) var9, false, new me(var9));
					}

					if (~var10 <= -1 && var10 >= 0 && var5.a((long) var10, (byte) -82) == null) {
						var5.a((long) var10, false, new me(var10));
					}

					var11 = var8.G.length;
					var6[var7] = new int[var11];
					var12 = 0;
					if (var13 != 0) {
						var6[var7][var12] = var1.j((byte) 71);
						++var12;
					}

					while (var12 < var11) {
						var6[var7][var12] = var1.j((byte) 71);
						++var12;
					}

					var3.a((long) var8.B, false, var8);
					this.js_l[var7] = var8;
					++var7;
				} while (var7 < var2);
			}

			int var16 = 0;
			j var17;
			j var20;
			if (var13 != 0) {
				var17 = this.js_l[var16];
				var10 = var17.G.length;
				var11 = 0;
				if (var13 == 0 && ~var11 <= ~var10) {
					var6[var16] = null;
					++var16;
				} else {
					while (true) {
						var20 = (j) var3.a((long) var6[var16][var11], (byte) -97);
						var17.G[var11] = var20;
						++var11;
						if (~var11 <= ~var10) {
							var6[var16] = null;
							++var16;
							break;
						}
					}
				}
			}

			while (~var16 > ~var2) {
				var17 = this.js_l[var16];
				var10 = var17.G.length;
				var11 = 0;
				if (var13 == 0 && ~var11 <= ~var10) {
					var6[var16] = null;
					++var16;
				} else {
					do {
						var20 = (j) var3.a((long) var6[var16][var11], (byte) -97);
						var17.G[var11] = var20;
						++var11;
					} while (~var11 > ~var10);

					var6[var16] = null;
					++var16;
				}
			}

			this.j_a = (j) var3.a((long) var1.j((byte) 79), (byte) -92);
			Object var15 = null;
			this.j_f = (j) var3.a((long) var1.j((byte) 101), (byte) -86);
			var3 = null;
			this.ints_j = new int[var4.d(0)];
			this.ints_d = new int[var5.d(0)];
			hb[] var18 = new hb[var4.d(0)];
			hb[] var19 = new hb[var5.d(0)];
			var4.a(var18, 102);
			var4 = null;
			var5.a(var19, 104);
			var5 = null;
			var11 = 0;
			if (var13 != 0 || ~var18.length < ~var11) {
				do {
					this.ints_j[var11] = ((me) var18[var11]).int_r;
					++var11;
				} while (~var18.length < ~var11);
			}

			var12 = 0;
			if (var13 != 0 || var12 < var19.length) {
				do {
					this.ints_d[var12] = ((me) var19[var12]).int_r;
					++var12;
				} while (var12 < var19.length);

			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "wg.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_e = lf_m;
	}
}
