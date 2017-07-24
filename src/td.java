final class td extends ph {

	static int G;
	static lf H = dd.a("60 Sekunden noch einmal)3)3)3", 2);
	static int I;
	static int J;
	static lf K;
	vb[] L;
	static int M;
	static int N;
	static lf O;
	private static lf Q = dd.a("skill)2", 2);
	private static lf R;
	static hf S;
	static boolean T;
	static lf sl_flags;
	static df[] V;
	static lf W;

	static final void b(int var0) {
		int var4 = client.int_gc;

		try {
			if (var0 == 127) {
				++G;
				if (ne.ints_d == null || lf.P == null) {
					lf.P = new int[256];
					ne.ints_d = new int[256];
					int var1 = 0;
					if (var4 != 0 || ~var1 > -257) {
						do {
							double var2 = (double) var1 / 255.0D * 6.283185307179586D;
							ne.ints_d[var1] = (int) (Math.sin(var2) * 4096.0D);
							lf.P[var1] = (int) (Math.cos(var2) * 4096.0D);
							++var1;
						} while (~var1 > -257);
					}
				}

			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "td.C(" + var0 + ')');
		}
	}

	static final void a(bg var0, int var1, bg var2, bg var3) {
		try {
			if (var1 != 1156412167) {
				W = null;
			}

			ua.S = var2;
			hb.bg_c = var3;
			++M;
			ch.bg_i = var0;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "td.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean a(byte var1, int var2) {
		try {
			int var3 = -120 % ((var1 - 48) / 51);
			++J;
			return this.L[var2].boolean_m;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "td.F(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(int var0, int var1, vg[] var2) {
		int var8 = client.int_gc;

		try {
			++I;
			if (var0 == -1682905504) {
				int var3 = 0;
				if (var8 != 0 || var3 < var2.length) {
					do {
						vg var4 = var2[var3];
						if (var4 != null && ~var1 == ~var4.int_bb && (!var4.Bc || !ma.a((byte) -121, var4))) {
							label123:
							{
								if (~var4.int_ib == -1) {
									if (!var4.Bc && ma.a((byte) -123, var4) && wg.vg_g != var4) {
										break label123;
									}

									a(-1682905504, var4.Z, var2);
									if (var4.Fb != null) {
										a(var0, var4.Z, var4.Fb);
									}

									fi var5 = (fi) ma.eh_e.a((long) var4.Z, (byte) -126);
									if (var5 != null) {
										nf.a(112, var5.int_n);
									}
								}

								if (~var4.int_ib == -7) {
									int var6;
									if (var4.Db != -1 || var4.Q != -1) {
										label84:
										{
											boolean var10 = cb.a(var4, var0 + 1682905504);
											if (!var10) {
												var6 = var4.Db;
												if (var8 == 0) {
													break label84;
												}
											}

											var6 = var4.Q;
										}

										if (~var6 != 0) {
											bi var7 = client.a(12, var6);
											var4.int_h += v.int_tb;
											if (var8 != 0 || var7.T[var4.int_uc] < var4.int_h) {
												do {
													var4.int_h -= var7.T[var4.int_uc];
													++var4.int_uc;
													if (var4.int_uc >= var7.Q.length) {
														var4.int_uc -= var7.int_fb;
														if (var4.int_uc < 0 || ~var7.Q.length >= ~var4.int_uc) {
															var4.int_uc = 0;
														}
													}

													mc.a(var4, -23101);
												} while (var7.T[var4.int_uc] < var4.int_h);
											}
										}
									}

									if (~var4.int_ac != -1 && !var4.Bc) {
										int var11 = var4.int_ac >> 899438192;
										var6 = var4.int_ac << 1080719184 >> -301200048;
										var11 *= v.int_tb;
										var6 *= v.int_tb;
										var4.int_gb = 2047 & var4.int_gb + var11;
										var4.Ab = 2047 & var6 + var4.Ab;
										mc.a(var4, -23101);
									}
								}
							}
						}

						++var3;
					} while (var3 < var2.length);

				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "td.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public static void c(int var0) {
		try {
			W = null;
			Q = null;
			O = null;
			V = null;
			if (var0 > -9) {
				O = null;
			}

			H = null;
			S = null;
			sl_flags = null;
			R = null;
			K = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "td.D(" + var0 + ')');
		}
	}

	static final void a(byte var0, boolean var1) {
		int var8 = client.int_gc;

		try {
			int var2 = 0;
			if (var8 == 0 && ~var2 <= ~a.int_j) {
				if (var0 >= -5) {
					a((bg) null, -34, (bg) null, (bg) null);
				}

				++N;
			} else {
				do {
					p var3 = th.ps_g[a.ints_h[var2]];
					long var4 = 536870912L | (long) a.ints_h[var2] << -1682905504;
					if (var3 != null && var3.c(0) && var1 != !var3.xc.J && var3.xc.d(-102)) {
						int var6 = var3.int_fb >> 573173191;
						int var7 = var3.int_nc >> 1156412167;
						if (var6 >= 0 && ~var6 > -105 && ~var7 <= -1 && var7 < 104) {
							label76:
							{
								if (var3.int_qc == 1 && (127 & var3.int_fb) == 64 && ~(var3.int_nc & 127) == -65) {
									if (~ig.ints_q[var6][var7] == ~fd.int_t) {
										break label76;
									}

									ig.ints_q[var6][var7] = fd.int_t;
								}

								if (!var3.xc.zb) {
									var4 |= Long.MIN_VALUE;
								}

								var3.Ob = bh.a(var3.int_nc - -((var3.int_qc - 1) * 64), false, hc.int_pb, var3.int_fb + 64 * (var3.int_qc - 1));
								ka.a(hc.int_pb, var3.int_fb, var3.int_nc, var3.Ob, 60 + (-1 + var3.int_qc) * 64, var3, var3.int_mb, var4, var3.boolean_fc);
							}
						}
					}

					++var2;
				} while (~var2 > ~a.int_j);

				if (var0 >= -5) {
					a((bg) null, -34, (bg) null, (bg) null);
				}

				++N;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "td.E(" + var0 + ',' + var1 + ')');
		}
	}

	td(bg var1, bg var2, int var3, boolean var4) {
		int var14 = client.int_gc;

		try {
			tf var5 = new tf();
			int var6 = var1.b((byte) 101, (int) var3);
			this.L = new vb[var6];
			int[] var7 = var1.a((byte) 117, (int) var3);
			int var8 = 0;
			if (var14 != 0 || ~var8 > ~var7.length) {
				do {
					ha var10 = null;
					byte[] var9 = var1.a(0, var7[var8], var3);
					int var11 = var9[1] & 255 | (var9[0] & 255) << 259373128;
					ha var12 = (ha) var5.c(89);
					if (var14 != 0 || var12 != null) {
						do {
							if (~var12.int_p == ~var11) {
								var10 = var12;
								break;
							}

							var12 = (ha) var5.d(-1);
						} while (var12 != null);
					}

					if (var10 == null) {
						byte[] var13;
						label38:
						{
							if (var4) {
								var13 = var2.b(var11, 55, 0);
								if (var14 == 0) {
									break label38;
								}
							}

							var13 = var2.b(0, 99, var11);
						}

						var10 = new ha(var11, var13);
						var5.a(var10, (int) 0);
					}

					this.L[var7[var8]] = new vb(var9, var10);
					++var8;
				} while (~var8 > ~var7.length);

			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "td.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	static {
		K = Q;
		R = dd.a("Username: ", 2);
		O = R;
		sl_flags = dd.a("sl_flags", 2);
		W = dd.a(" ", 2);
		T = false;
	}
}
