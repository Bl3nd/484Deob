final class bb extends j {

	static int Q;
	static int R;
	static int S = 0;
	static int U;
	static tf V;
	static int W;
	static lf X;
	static lf Y = dd.a("Benutzen", 2);
	static int Z;
	private static lf lf_ab = dd.a("Please reload this page)3", 2);
	static int int_bb = 0;
	static int int_cb;
	static int int_db;
	static bg cache4;//bg_eb
	static int int_fb;
	static lf[] lfs_gb;
	static lf lf_hb;
	static long long_ib;
	private static lf lf_jb;
	static lf lf_kb;
	static eh eh_lb;

	final void a(byte var1, int var2, ja var3) {
		try {
			++R;
			if (var2 == 0) {
				super.x = ~var3.j((byte) 93) == -2;
			}

			if (var1 >= -120) {
				this.a((byte) 61, -105, null);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bb.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static void e(int var0) {
		int dummy = client.int_gc;
		try {
			++Q;
			int var1 = var0;
			if (var0 >= jg.int_q) {
				if (de.boolean_q && !hf.d((byte) -107)) {
					if (tc.R != 0 && oa.R != -1) {
						be.a(0, -127, tc.R, oa.R, false, l.cache6);
					}

					de.boolean_q = false;
				} else if (tc.R != 0 && oa.R != -1 && !hf.d((byte) 97)) {
					++gb.int_pb;
					vg.J.e((byte) 109, 34);
					vg.J.b((byte) 103, oa.R);
					oa.R = -1;
				}
			} else {
				do {
					label144:
					{
						--qa.V[var1];
						if (qa.V[var1] < -10) {
							--jg.int_q;
							int var2 = var1;
							if (jg.int_q > var1) {
								do {
									hc.ints_gb[var2] = hc.ints_gb[var2 + 1];
									ob.mhs_e[var2] = ob.mhs_e[1 + var2];
									rg.D[var2] = rg.D[var2 + 1];
									qa.V[var2] = qa.V[var2 + 1];
									d.ints_eb[var2] = d.ints_eb[1 + var2];
									++var2;
								} while (jg.int_q > var2);
							}

							--var1;
						} else {
							mh var12 = ob.mhs_e[var1];
							if (var12 == null) {
								var12 = mh.a(of.cache4, hc.ints_gb[var1], 0);
								if (var12 == null) {
									break label144;
								} else {
									qa.V[var1] += var12.b();
									ob.mhs_e[var1] = var12;
								}
							}

							if (qa.V[var1] < 0) {
								label145:
								{
									int var3;
									if (d.ints_eb[var1] == 0) {
										var3 = ai.int_e;
									} else {
										int var4 = 128 * (255 & d.ints_eb[var1]);
										int var5 = (16755319 & d.ints_eb[var1]) >> 16;
										int var6 = 64 + 128 * var5 + -r.X.int_fb;
										if (var6 < 0) {
											var6 = -var6;
										}

										int var7 = ('ｕ' & d.ints_eb[var1]) >> 8;
										int var8 = -r.X.int_nc + var7 * 128 + 64;
										if (var8 < 0) {
											var8 = -var8;
										}

										int var9 = var8 + var6 + -128;
										if (var4 < var9) {
											qa.V[var1] = -100;
											if (dummy == 0) {
												break label145;
											}
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = sd.Db * (-var9 + var4) / var4;
									}

									if (var3 > 0) {
										k var13 = var12.c().a(af.pa_w);
										jb var14 = jb.a(var13, 100, var3);
										if (var14 != null) {
											var14.b(-1 + rg.D[var1]);
										}
										pe.t_b.a(var14);
									}

									qa.V[var1] = -100;
								}
							}
						}
					}

					++var1;
				} while (var1 < jg.int_q);

				if (de.boolean_q && !hf.d((byte) -107)) {
					if (tc.R != 0 && ~oa.R != 0) {
						be.a(0, -127, tc.R, oa.R, false, l.cache6);
					}

					de.boolean_q = false;
				} else if (tc.R != 0 && oa.R != -1 && !hf.d((byte) 97)) {
					++gb.int_pb;
					vg.J.e((byte) 109, 34);
					vg.J.b((byte) 103, oa.R);
					oa.R = -1;
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "bb.B(" + var0 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var9 = client.int_gc;

		try {
			++int_fb;
			if (var2 != 2177) {
				return null;
			} else {
				int[][] var3 = super.jh_q.a((byte) -128, var1);
				int[] var4 = var3[0];
				int[] var5 = var3[1];
				int[] var6 = var3[2];
				if (super.jh_q.boolean_w) {
					int var7 = 0;
					if (var9 != 0 || ~var7 > ~ff.int_a) {
						do {
							this.a(var7, true, var1);
							int[][] var8 = this.a(false, tg.X, 0);
							var4[var7] = var8[0][je.int_e];
							var5[var7] = var8[1][je.int_e];
							var6[var7] = var8[2][je.int_e];
							++var7;
						} while (~var7 > ~ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "bb.E(" + var1 + ',' + var2 + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			Y = null;
			V = null;
			lf_kb = null;
			X = null;
			lf_hb = null;
			lf_jb = null;
			eh_lb = null;
			lfs_gb = null;
			if (!var0) {
				V = null;
			}

			cache4 = null;
			lf_ab = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "bb.D(" + var0 + ')');
		}
	}

	private final void a(int var1, boolean var2, int var3) {
		int var7 = client.int_gc;

		try {
			if (var2) {
				label83:
				{
					++W;
					int var5 = fc.G[var3];
					int var4 = ef.ints_m[var1];
					float var6 = (float) Math.atan2((double) (-2048 + var4), (double) (-2048 + var5));
					if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
						tg.X = var3;
						je.int_e = var1;
						if (var7 == 0) {
							break label83;
						}
					}

					if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
						tg.X = var1;
						je.int_e = var3;
						if (var7 == 0) {
							break label83;
						}
					}

					if ((double) var6 > -0.7853981633974483D || (double) var6 < -1.5707963267948966D) {
						if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
							je.int_e = var1;
							tg.X = -var3 + dg.int_p;
							if (var7 == 0) {
								break label83;
							}
						}

						if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
							tg.X = -var3 + dg.int_p;
							je.int_e = -var1 + ff.int_a;
							if (var7 == 0) {
								break label83;
							}
						}

						if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
							je.int_e = ff.int_a - var3;
							tg.X = dg.int_p - var1;
							if (var7 == 0) {
								break label83;
							}
						}

						if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
							je.int_e = var3;
							tg.X = dg.int_p + -var1;
							if (var7 == 0) {
								break label83;
							}
						}

						if ((double) var6 < 2.356194490192345D || (double) var6 > 3.141592653589793D) {
							break label83;
						}

						je.int_e = -var1 + ff.int_a;
						tg.X = var3;
						if (var7 == 0) {
							break label83;
						}
					}

					je.int_e = ff.int_a + -var3;
					tg.X = var1;
				}

				je.int_e &= ch.int_h;
				tg.X &= qb.Z;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "bb.A(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public bb() {
		super(1, false);
	}

	static boolean a(int var0, sh var1, bg cache15, bg cache4, bg cache14) {
		try {
			if (var0 != -27635) {
				b(false);
			}

			gg.sh_n = var1;
			bb.cache4 = cache4;
			++Z;
			v.cache15 = cache15;
			me.cache14 = cache14;
			return true;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bb.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (cache15 != null ? "{...}" : "null") + ',' + (cache4 != null ? "{...}" : "null") + ',' + (cache14 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var6 = client.int_gc;

		try {
			int[] var3 = super.H.a(-314, var2);
			if (var1 >= -49) {
				b(true);
			}

			++int_cb;
			if (super.H.boolean_v) {
				int var4 = 0;
				if (var6 != 0 || ~ff.int_a < ~var4) {
					do {
						this.a(var4, true, var2);
						int[] var5 = this.a(tg.X, -23, 0);
						var3[var4] = var5[je.int_e];
						++var4;
					} while (~ff.int_a < ~var4);
				}
			}

			return var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "bb.G(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		X = lf_ab;
		lfs_gb = new lf[1000];
		V = new tf();
		lf_jb = dd.a("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 2);
		lf_hb = lf_jb;
		lf_kb = dd.a("gleiten:", 2);
		long_ib = 0L;
		eh_lb = new eh(4096);
	}
}
