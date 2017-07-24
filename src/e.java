import java.io.IOException;
import java.util.zip.Inflater;

final class e {

	static int int_a = 0;
	static int int_b;
	static int[] ints_c = new int[]{16776960, 16711680, '\uff00', '\uffff', 16711935, 16777215};
	static int int_d = 0;
	static int int_e;
	static int int_f;
	static int int_g;
	static int int_h;
	private Inflater inflater_i;
	static int int_j;
	static lf lf_k = dd.a("Lade Texturen )2 ", 2);
	static int int_l;
	static rc rc_m = new rc(64);
	static int int_n = 0;
	static s s_o;
	static ah ah_p;

	static final void a(int var0, boolean var1) {
		try {
			++int_g;
			if (vf.H != null) {
				try {
					if (var0 == -1) {
						ja var2 = new ja(4);
						var2.e(-13488, var1 ? 2 : 3);
						var2.a(0, var0 + -2139);
						vf.H.a(-74, 0, 4, var2.yb);
					}
				} catch (IOException ioException) {
					try {
						vf.H.a((byte) -46);
					} catch (Exception e) {
						e.printStackTrace();
					}

					vf.H = null;
					++hf.int_b;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "e.E(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(byte var0) {
		int var4 = client.int_gc;

		try {
			if (var0 > 38) {
				++int_f;
				gb var1 = (gb) ca.tf_n.c(58);
				if (var4 != 0 || var1 != null) {
					do {
						label64:
						{
							if (hc.int_pb == var1.int_ob && ~var1.Eb <= ~pd.int_i) {
								if (~pd.int_i > ~var1.Ab) {
									break label64;
								}

								if (~var1.Cb < -1) {
									p var2 = th.ps_g[-1 + var1.Cb];
									if (var2 != null && var2.int_fb >= 0 && ~var2.int_fb > -13313 && ~var2.int_nc <= -1 && var2.int_nc < 13312) {
										var1.b(pd.int_i, 42, var2.int_nc, bh.a(var2.int_nc, false, var1.int_ob, var2.int_fb) + -var1.int_cb, var2.int_fb);
									}
								}

								if (~var1.Cb > -1) {
									u var6;
									label52:
									{
										int var3 = -var1.Cb - 1;
										if (var3 == fh.int_d) {
											var6 = r.X;
											if (var4 == 0) {
												break label52;
											}
										}

										var6 = w.us_e[var3];
									}

									if (var6 != null && ~var6.int_fb <= -1 && ~var6.int_fb > -13313 && var6.int_nc >= 0 && var6.int_nc < 13312) {
										var1.b(pd.int_i, 47, var6.int_nc, bh.a(var6.int_nc, false, var1.int_ob, var6.int_fb) - var1.int_cb, var6.int_fb);
									}
								}

								var1.a(v.int_tb, (byte) 84);
								ka.a(hc.int_pb, (int) var1.double_wb, (int) var1.double_tb, (int) var1.double_qb, 60, var1, var1.int_lb, -1L, false);
								if (var4 == 0) {
									break label64;
								}
							}

							var1.a(true);
						}

						var1 = (gb) ca.tf_n.d(-1);
					} while (var1 != null);

				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "e.B(" + var0 + ')');
		}
	}

	final void a(int var1, ja var2, byte[] var3) {
		try {
			++int_j;
			if (var2.yb[var2.P] == 31 && var2.yb[var2.P + 1] == -117) {
				if (this.inflater_i == null) {
					this.inflater_i = new Inflater(true);
				}

				try {
					this.inflater_i.setInput(var2.yb, var2.P - -10, -8 + -10 + -var2.P + var2.yb.length);
					this.inflater_i.inflate(var3);
				} catch (Exception var5) {
					this.inflater_i.reset();
					throw new RuntimeException("Invalid GZIP compressed data!");
				}

				if (var1 != 28501) {
					a((byte) 59);
				}

				this.inflater_i.reset();
			} else {
				throw new RuntimeException("Invalid GZIP header!");
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "e.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean a(boolean var0, int var1) {
		try {
			++int_e;
			if (!var0) {
				lf_k = null;
			}

			return ~var1 <= -98 && var1 <= 122 ? true : (var1 >= 65 && var1 <= 90 ? true : var1 >= 48 && var1 <= 57);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "e.C(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_k = null;
			ints_c = null;
			if (var0 != -10) {
				a(true, 7);
			}

			rc_m = null;
			ah_p = null;
			s_o = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "e.F(" + var0 + ')');
		}
	}

	private e(int var1, int var2, int var3) {
	}

	public e() {
		this(-1, 1000000, 1000000);
	}

	static final boolean a(byte var0, int var1) {
		try {
			++int_b;
			return var0 != -19 ? false : (1 & var1) != 0;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "e.D(" + var0 + ',' + var1 + ')');
		}
	}
}
