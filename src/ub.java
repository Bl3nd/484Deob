final class ub extends j {

	static int Q;
	static int R;
	static lf S = dd.a(")2", 2);
	static int T;
	static lf U = dd.a("Mitglieder)2Welt", 2);
	static boolean[] V = new boolean[100];
	static lf sl_arrows = dd.a("sl_arrows", 2);
	private static lf X = dd.a("No response from server)3", 2);
	static lf Y = dd.a("Benutzeroberfl-=che geladen)3", 2);
	static int Z;
	static lf lf_ab;

	static final void e(int var0) {
		try {
			e.rc_m.c(-51);
			++Q;
			sd.rc_wb.c(-51);
			if (var0 != 5041) {
				lf_ab = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ub.D(" + var0 + ')');
		}
	}

	public ub() {
		super(0, true);
	}

	public static void b(boolean var0) {
		try {
			V = null;
			Y = null;
			X = null;
			lf_ab = null;
			sl_arrows = null;
			U = null;
			S = null;
			if (var0) {
				c(22, -3);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ub.C(" + var0 + ')');
		}
	}

	private final int a(int var1, int var2, byte var3) {
		try {
			++T;
			if (var3 != -51) {
				this.a(-74, 59);
			}

			int var4 = 57 * var2 + var1;
			var4 ^= var4 << -704690719;
			return -((Integer.MAX_VALUE & var4 * (var4 * var4 * 15731 + 789221) - -1376312589) / 262144) + 4096;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ub.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3) {
		ab var4 = i.Ib[var0][var1][var2];
		if (var4 != null) {
			la var5 = var4.K;
			if (var5 != null) {
				var5.int_l = var5.int_l * var3 / 16;
				var5.int_m = var5.int_m * var3 / 16;
			}
		}
	}

	final int[] a(int var1, int var2) {
		int var6 = client.int_gc;

		try {
			++R;
			if (var1 > -49) {
				S = null;
			}

			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int var4 = fc.G[var2];
				int var5 = 0;
				if (var6 != 0 || ~ff.int_a < ~var5) {
					do {
						var3[var5] = this.a(ef.ints_m[var5], var4, (byte) -51) % 4096;
						++var5;
					} while (~ff.int_a < ~var5);
				}
			}

			return var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ub.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void c(int var0, int var1) {
		int var6 = client.int_gc;

		try {
			++Z;
			ah.f(89);
			w.b((byte) -127);
			int var2 = tb.c(-102, var1).P;
			if (var2 != 0) {
				int var3 = uc.ints_ub[var1];
				if (~var2 == -2) {
					client.int_rb = var3;
					if (client.int_rb == 1) {
						nc.a(0.9F);
					}

					if (client.int_rb == 2) {
						nc.a(0.8F);
					}

					if (client.int_rb == 3) {
						nc.a(0.7F);
					}

					if (client.int_rb == 4) {
						nc.a(0.6F);
					}

					lc.b(15359);
				}

				int var4 = 31 / ((12 - var0) / 42);
				if (~var2 == -4) {
					short var5 = 0;
					if (var3 == 0) {
						var5 = 255;
					}

					if (var3 == 1) {
						var5 = 192;
					}

					if (~var3 == -3) {
						var5 = 128;
					}

					if (var3 == 3) {
						var5 = 64;
					}

					if (~var3 == -5) {
						var5 = 0;
					}

					if (~var5 != ~tc.R) {
						label137:
						{
							if (tc.R == 0 && oa.R != -1) {
								be.a(0, -110, var5, oa.R, false, l.cache6);
								de.boolean_q = false;
								if (var6 == 0) {
									break label137;
								}
							}

							if (var5 != 0) {
								c.c(7920, var5);
								if (var6 == 0) {
									break label137;
								}
							}

							pd.a((int) -29672);
							de.boolean_q = false;
						}

						tc.R = var5;
					}
				}

				if (~var2 == -5) {
					if (var3 == 0) {
						ai.int_e = 127;
					}

					if (var3 == 1) {
						ai.int_e = 96;
					}

					if (var3 == 2) {
						ai.int_e = 64;
					}

					if (var3 == 3) {
						ai.int_e = 32;
					}

					if (~var3 == -5) {
						ai.int_e = 0;
					}
				}

				if (var2 == 9) {
					bb.int_bb = var3;
				}

				if (var2 == 6) {
					fc.P = var3;
				}

				if (var2 == 10) {
					if (var3 == 0) {
						sd.Db = 127;
					}

					if (~var3 == -2) {
						sd.Db = 96;
					}

					if (~var3 == -3) {
						sd.Db = 64;
					}

					if (~var3 == -4) {
						sd.Db = 32;
					}

					if (~var3 == -5) {
						sd.Db = 0;
					}
				}

				if (var2 == 5) {
					ne.int_e = var3;
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ub.A(" + var0 + ',' + var1 + ')');
		}
	}

	static {
		lf_ab = X;
	}
}
