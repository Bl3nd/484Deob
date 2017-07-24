import java.util.Random;

final class vc {

	private ta ta_a;
	private int[] ints_b = new int[5];
	int int_c = 500;
	private static int[] ints_d;
	private static int[] ints_e;
	private ta ta_f;
	private int[] ints_g = new int[5];
	private ta ta_h;
	private ta ta_i;
	private ta ta_j;
	private int int_k = 0;
	private int[] ints_l = new int[5];
	private ta ta_m;
	private ta ta_n;
	private we we_o;
	private static int[] ints_p = new int['耀'];
	private ta ta_q;
	private static int[] ints_r;
	private static int[] ints_s;
	private int int_t = 100;
	int int_u = 0;
	private static int[] ints_v;
	private ta ta_w;
	private static int[] x;
	private static int[] y;

	final void a(ja var1) {
		this.ta_j = new ta();
		this.ta_j.b(var1);
		this.ta_i = new ta();
		this.ta_i.b(var1);
		int var2 = var1.j((byte) 75);
		if (var2 != 0) {
			--var1.P;
			this.ta_q = new ta();
			this.ta_q.b(var1);
			this.ta_m = new ta();
			this.ta_m.b(var1);
		}

		var2 = var1.j((byte) 85);
		if (var2 != 0) {
			--var1.P;
			this.ta_a = new ta();
			this.ta_a.b(var1);
			this.ta_n = new ta();
			this.ta_n.b(var1);
		}

		var2 = var1.j((byte) 98);
		if (var2 != 0) {
			--var1.P;
			this.ta_w = new ta();
			this.ta_w.b(var1);
			this.ta_h = new ta();
			this.ta_h.b(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.f((int) 0);
			if (var4 == 0) {
				break;
			}

			this.ints_b[var3] = var4;
			this.ints_g[var3] = var1.a(128);
			this.ints_l[var3] = var1.f((int) 0);
		}

		this.int_k = var1.f((int) 0);
		this.int_t = var1.f((int) 0);
		this.int_c = var1.b(true);
		this.int_u = var1.b(true);
		this.we_o = new we();
		this.ta_f = new ta();
		this.we_o.a(var1, this.ta_f);
	}

	public static void a() {
		ints_d = null;
		ints_p = null;
		ints_e = null;
		y = null;
		x = null;
		ints_r = null;
		ints_s = null;
		ints_v = null;
	}

	private final int a(int var1, int var2, int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2) : (var3 == 2 ? ints_e[var1 & 32767] * var2 >> 14 : (var3 == 3 ? ((var1 & 32767) * var2 >> 14) - var2 : (var3 == 4 ? ints_p[var1 / 2607 & 32767] * var2 : 0)));
	}

	final int[] a(int var1, int var2) {
		na.a(ints_d, 0, var1);
		if (var2 < 10) {
			return ints_d;
		} else {
			double var3 = (double) var1 / ((double) var2 + 0.0D);
			this.ta_j.a();
			this.ta_i.a();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.ta_q != null) {
				this.ta_q.a();
				this.ta_m.a();
				var5 = (int) ((double) (this.ta_q.int_a - this.ta_q.int_e) * 32.768D / var3);
				var6 = (int) ((double) this.ta_q.int_e * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.ta_a != null) {
				this.ta_a.a();
				this.ta_n.a();
				var8 = (int) ((double) (this.ta_a.int_a - this.ta_a.int_e) * 32.768D / var3);
				var9 = (int) ((double) this.ta_a.int_e * 32.768D / var3);
			}

			for (int var11 = 0; var11 < 5; ++var11) {
				if (this.ints_b[var11] != 0) {
					y[var11] = 0;
					x[var11] = (int) ((double) this.ints_l[var11] * var3);
					ints_r[var11] = (this.ints_b[var11] << 14) / 100;
					ints_s[var11] = (int) ((double) (this.ta_j.int_a - this.ta_j.int_e) * 32.768D * Math.pow(1.0057929410678534D, (double) this.ints_g[var11]) / var3);
					ints_v[var11] = (int) ((double) this.ta_j.int_e * 32.768D / var3);
				}
			}

			int var13;
			int var14;
			int var15;
			int var16;
			for (int var12 = 0; var12 < var1; ++var12) {
				var13 = this.ta_j.a(var1);
				var14 = this.ta_i.a(var1);
				if (this.ta_q != null) {
					var15 = this.ta_q.a(var1);
					var16 = this.ta_m.a(var1);
					var13 += this.a(var7, var16, this.ta_q.int_c) >> 1;
					var7 += (var15 * var5 >> 16) + var6;
				}

				if (this.ta_a != null) {
					var15 = this.ta_a.a(var1);
					var16 = this.ta_n.a(var1);
					var14 = var14 * ((this.a(var10, var16, this.ta_a.int_c) >> 1) + '耀') >> 15;
					var10 += (var15 * var8 >> 16) + var9;
				}

				for (var15 = 0; var15 < 5; ++var15) {
					if (this.ints_b[var15] != 0) {
						var16 = var12 + x[var15];
						if (var16 < var1) {
							ints_d[var16] += this.a(y[var15], var14 * ints_r[var15] >> 15, this.ta_j.int_c);
							y[var15] += (var13 * ints_s[var15] >> 16) + ints_v[var15];
						}
					}
				}
			}

			int var17;
			int var18;
			if (this.ta_w != null) {
				this.ta_w.a();
				this.ta_h.a();
				var13 = 0;
				boolean var21 = false;
				boolean var22 = true;

				for (var16 = 0; var16 < var1; ++var16) {
					var17 = this.ta_w.a(var1);
					var18 = this.ta_h.a(var1);
					if (var22) {
						var14 = this.ta_w.int_e + ((this.ta_w.int_a - this.ta_w.int_e) * var17 >> 8);
					} else {
						var14 = this.ta_w.int_e + ((this.ta_w.int_a - this.ta_w.int_e) * var18 >> 8);
					}

					var13 += 256;
					if (var13 >= var14) {
						var13 = 0;
						var22 = !var22;
					}

					if (var22) {
						ints_d[var16] = 0;
					}
				}
			}

			if (this.int_k > 0 && this.int_t > 0) {
				var13 = (int) ((double) this.int_k * var3);

				for (var14 = var13; var14 < var1; ++var14) {
					ints_d[var14] += ints_d[var14 - var13] * this.int_t / 100;
				}
			}

			if (this.we_o.ints_d[0] > 0 || this.we_o.ints_d[1] > 0) {
				this.ta_f.a();
				var13 = this.ta_f.a(var1 + 1);
				var14 = this.we_o.a(0, (float) var13 / 65536.0F);
				var15 = this.we_o.a(1, (float) var13 / 65536.0F);
				if (var1 >= var14 + var15) {
					var16 = 0;
					var17 = var15;
					if (var15 > var1 - var14) {
						var17 = var1 - var14;
					}

					int var19;
					int var20;
					while (var16 < var17) {
						var18 = (int) ((long) ints_d[var16 + var14] * (long) we.int_a >> 16);

						for (var19 = 0; var19 < var14; ++var19) {
							var18 += (int) ((long) ints_d[var16 + var14 - 1 - var19] * (long) we.ints_b[0][var19] >> 16);
						}

						for (var20 = 0; var20 < var16; ++var20) {
							var18 -= (int) ((long) ints_d[var16 - 1 - var20] * (long) we.ints_b[1][var20] >> 16);
						}

						ints_d[var16] = var18;
						var13 = this.ta_f.a(var1 + 1);
						++var16;
					}

					var17 = 128;

					while (true) {
						if (var17 > var1 - var14) {
							var17 = var1 - var14;
						}

						while (var16 < var17) {
							var18 = (int) ((long) ints_d[var16 + var14] * (long) we.int_a >> 16);

							for (var19 = 0; var19 < var14; ++var19) {
								var18 += (int) ((long) ints_d[var16 + var14 - 1 - var19] * (long) we.ints_b[0][var19] >> 16);
							}

							for (var20 = 0; var20 < var15; ++var20) {
								var18 -= (int) ((long) ints_d[var16 - 1 - var20] * (long) we.ints_b[1][var20] >> 16);
							}

							ints_d[var16] = var18;
							var13 = this.ta_f.a(var1 + 1);
							++var16;
						}

						if (var16 >= var1 - var14) {
							while (var16 < var1) {
								var18 = 0;

								for (var19 = var16 + var14 - var1; var19 < var14; ++var19) {
									var18 += (int) ((long) ints_d[var16 + var14 - 1 - var19] * (long) we.ints_b[0][var19] >> 16);
								}

								for (var20 = 0; var20 < var15; ++var20) {
									var18 -= (int) ((long) ints_d[var16 - 1 - var20] * (long) we.ints_b[1][var20] >> 16);
								}

								ints_d[var16] = var18;
								this.ta_f.a(var1 + 1);
								++var16;
							}
							break;
						}

						var14 = this.we_o.a(0, (float) var13 / 65536.0F);
						var15 = this.we_o.a(1, (float) var13 / 65536.0F);
						var17 += 128;
					}
				}
			}

			for (var13 = 0; var13 < var1; ++var13) {
				if (ints_d[var13] < -32768) {
					ints_d[var13] = -32768;
				}

				if (ints_d[var13] > 32767) {
					ints_d[var13] = 32767;
				}
			}

			return ints_d;
		}
	}

	static {
		Random var0 = new Random(0L);

		for (int var1 = 0; var1 < '耀'; ++var1) {
			ints_p[var1] = (var0.nextInt() & 2) - 1;
		}

		ints_e = new int['耀'];

		for (int var2 = 0; var2 < '耀'; ++var2) {
			ints_e[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}

		ints_d = new int[220500];
		ints_s = new int[5];
		ints_v = new int[5];
		y = new int[5];
		ints_r = new int[5];
		x = new int[5];
	}
}
