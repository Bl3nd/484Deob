final class ra extends j {

	static df Q;
	static int R;
	static int S;
	static lf T = dd.a("<col=ffff00>", 2);
	static int U;
	private int V;
	static int W;
	static lf X = dd.a("null", 2);
	static boolean Y = false;
	static int Z;
	static int int_ab;
	static int int_bb = 0;

	final void a(byte var1, int var2, ja var3) {
		try {
			if (var2 == 0) {
				this.V = (var3.j((byte) 101) << 12) / 255;
			}

			if (var1 >= -120) {
				this.a(-60, (int) -64);
			}

			++R;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ra.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void e(int var0) {
		try {
			T = null;
			if (var0 != -4) {
				e(76);
			}

			Q = null;
			X = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ra.A(" + var0 + ')');
		}
	}

	static final void b(boolean var0) {
		try {
			++Z;
			if (he.N[98]) {
				vf.B += (-vf.B + 12) / 2;
			} else if (!he.N[99]) {
				vf.B /= 2;
			} else {
				vf.B += (-12 - vf.B) / 2;
			}

			if (he.N[96]) {
				sh.yb += (-24 + -sh.yb) / 2;
			} else if (!he.N[97]) {
				sh.yb /= 2;
			} else {
				sh.yb += (24 - sh.yb) / 2;
			}

			pc.int_a += vf.B / 2;
			h.int_l = 2047 & sh.yb / 2 + h.int_l;
			int var1 = fh.int_h + r.X.int_fb;
			if (pc.int_a < 128) {
				pc.int_a = 128;
			}

			int var2 = sh.Ab + r.X.int_nc;
			if (var0) {
				b(true);
			}

			if (pc.int_a > 383) {
				pc.int_a = 383;
			}

			if (ba.int_n - var1 < -500 || -var1 + ba.int_n > 500 || -var2 + a.int_e < -500 || -var2 + a.int_e > 500) {
				a.int_e = var2;
				ba.int_n = var1;
			}

			if (ba.int_n != var1) {
				ba.int_n += (-ba.int_n + var1) / 16;
			}

			if (var2 != a.int_e) {
				a.int_e += (-a.int_e + var2) / 16;
			}

			int var4 = a.int_e >> 7;
			int var3 = ba.int_n >> 7;
			int var5 = bh.a(a.int_e, var0, hc.int_pb, ba.int_n);
			int var6 = 0;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				int x = var3 + -4;
				if (4 + var3 >= x) {
					do {
						int y = -4 + var4;
						if (y > var4 + 4) {
							++x;
						} else {
							do {
								int height = hc.int_pb;
								if (height < 3 && (2 & jc.bytes_q[1][x][y]) == 2) {
									++height;
								}

								int var10 = -u.vertexHeights[height][x][y] + var5;
								if (var10 > var6) {
									var6 = var10;
								}

								++y;
							} while (y <= var4 + 4);

							++x;
						}
					} while (x <= 4 + var3);
				}
			}

			int var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}

			if (var7 < 32768) {
				var7 = '耀';
			}

			if (var7 <= ah.int_i) {
				if (ah.int_i > var7) {
					ah.int_i += (-ah.int_i + var7) / 80;
				}
			} else {
				ah.int_i += (-ah.int_i + var7) / 24;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "ra.H(" + var0 + ')');
		}
	}

	public ra() {
		this(4096);
	}

	static final boolean c(int var0, int var1) {
		try {
			++S;
			if (var0 != 610157134) {
				Q = null;
			}

			return (var1 & 610157134) >> 29 != 0;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ra.B(" + var0 + ',' + var1 + ')');
		}
	}

	static final vg a(int var0, byte var1) {
		try {
			++W;
			if (var1 < 111) {
				return null;
			} else {
				int var2 = var0 >> 16;
				if (sc.vgs_db[var2] == null || sc.vgs_db[var2][var0] == null) {
					boolean var4 = ua.a(false, var2);
					if (!var4) {
						return null;
					}
				}

				return sc.vgs_db[var2][var0];
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ra.C(" + var0 + ',' + var1 + ')');
		}
	}

	private ra(int var1) {
		super(0, true);
		this.V = 4096;

		try {
			this.V = var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ra.<init>(" + var1 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		try {
			if (var1 >= -49) {
				return null;
			} else {
				int[] var3 = super.H.a(-314, var2);
				++U;
				if (super.H.boolean_v) {
					na.a(var3, 0, ff.int_a, this.V);
				}

				return var3;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ra.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(ed var0) {
		for (int var1 = var0.int_u; var1 <= var0.int_a; ++var1) {
			for (int var2 = var0.int_f; var2 <= var0.int_r; ++var2) {
				ab var3 = i.Ib[var0.int_m][var1][var2];
				if (var3 != null) {
					int var5;
					for (int var4 = 0; var4 < var3.int_p; ++var4) {
						if (var3.eds_t[var4] == var0) {
							--var3.int_p;

							for (var5 = var4; var5 < var3.int_p; ++var5) {
								var3.eds_t[var5] = var3.eds_t[var5 + 1];
								var3.E[var5] = var3.E[var5 + 1];
							}

							var3.eds_t[var3.int_p] = null;
							break;
						}
					}

					var3.x = 0;

					for (var5 = 0; var5 < var3.int_p; ++var5) {
						var3.x |= var3.E[var5];
					}
				}
			}
		}

	}
}
