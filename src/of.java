import java.util.Date;

final class of extends hb {

	wb wb_n;
	static oh cache4;//oh_o
	int int_p;
	static lf lf_q;
	static int int_r = 0;
	static int int_s;
	static int int_t;
	static int int_u;
	static lf lf_v;
	static boolean[][] booleans_w;
	static byte x;
	byte[] y;
	oh z;
	private static lf A = dd.a("Loading title screen )2 ", 2);
	static int B;
	private static lf C = dd.a("Please subscribe)1 or use a different world)3", 2);
	static lf D;
	static kf E;
	static int F;

	public static void a(int var0) {
		try {
			C = null;
			booleans_w = null;
			cache4 = null;
			lf_v = null;
			A = null;
			D = null;
			E = null;
			lf_q = null;
			if (var0 != -30878) {
				booleans_w = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "of.D(" + var0 + ')');
		}
	}

	static final void a(bg var0, byte var1) {
		try {
			if (var1 <= 3) {
				cache4 = null;
			}

			gg.bg_j = var0;
			++F;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "of.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static final void a(boolean var0, id var1, int var2) {
		int dummy = client.int_gc;

		try {
			++int_u;
			Object[] var3 = var1.objects_t;
			int var4 = (Integer) var3[0];
			va var5 = ca.a(true, var4);
			if (var5 != null) {
				int var6 = 0;
				int[] var9 = var5.Q;
				int var7 = 0;
				hc.int_nb = 0;
				int[] var10 = var5.T;
				byte var11 = -1;
				int var8 = -1;
				int var14;
				int var15;
				try {
					if (!var0) {
						pd.ints_e = new int[var5.U];
						int var12 = 0;
						vd.W = new lf[var5.R];
						int var27 = 0;
						var14 = 1;
						lf var28;
						for (; var3.length > var14; ++var14) {
							if (!(var3[var14] instanceof Integer)) {
								if ((var3[var14] instanceof lf)) {
									var28 = (lf) var3[var14];
									if (var28.e(ci.event_opbase, -1)) {
										var28 = var1.I;
									}

									vd.W[var27++] = var28;
								}
							} else {
								var15 = (Integer) var3[var14];
								if (var15 == -2147483647) {
									var15 = var1.G;
								}

								if (var15 == -2147483646) {
									var15 = var1.int_r;
								}

								if (~var15 == 2147483644) {
									var15 = var1.vg_o != null ? var1.vg_o.Z : -1;
								}

								if (var15 == -2147483644) {
									var15 = var1.z;
								}

								if (~var15 == 2147483642) {
									var15 = var1.vg_o != null ? var1.vg_o.Hb : -1;
								}

								if (var15 == -2147483642) {
									var15 = var1.vg_p == null ? -1 : var1.vg_p.Z;
								}

								if (~var15 == 2147483640) {
									var15 = var1.vg_p == null ? -1 : var1.vg_p.Hb;
								}

								if (~var15 == 2147483639) {
									var15 = var1.J;
								}

								if (~var15 == 2147483638) {
									var15 = var1.int_v;
								}

								pd.ints_e[var12++] = var15;
							}
						}

						var15 = 0;

						while (true) {
							++var15;
							if (var2 < var15) {
								throw new RuntimeException("slow");
							}

							++var8;
							int var26 = var9[var8];
							lf var17;
							int var20;
							int var21;
							int var31;
							int var32;
							if (~var26 > -101) {
								if (var26 == 0) {
									l.ints_b[var6++] = var10[var8];
									if (dummy == 0) {
									}
								} else {
									int var16;
									if (var26 == 1) {
										var16 = var10[var8];
										l.ints_b[var6++] = uc.ints_ub[var16];
										if (dummy == 0) {
										}
									} else if (var26 == 2) {
										var16 = var10[var8];
										--var6;
										uc.ints_ub[var16] = l.ints_b[var6];
										if (dummy == 0) {
										}
									} else if (var26 == 3) {
										bb.lfs_gb[var7++] = var5.K[var8];
										if (dummy == 0) {
										}
									} else if (~var26 == -7) {
										var8 += var10[var8];
										if (dummy == 0) {
										}
									} else if (~var26 == -8) {
										var6 -= 2;
										if (l.ints_b[var6 + 1] != l.ints_b[var6]) {
											var8 += var10[var8];
											if (dummy == 0) {
											}
										}
									} else if (var26 == 8) {
										var6 -= 2;
										if (l.ints_b[var6] == l.ints_b[1 + var6]) {
											var8 += var10[var8];
											if (dummy == 0) {
											}
										}
									} else if (~var26 == -10) {
										var6 -= 2;
										if (l.ints_b[1 + var6] > l.ints_b[var6]) {
											var8 += var10[var8];
											if (dummy == 0) {
											}
										}
									} else if (~var26 == -11) {
										var6 -= 2;
										if (l.ints_b[var6 - -1] < l.ints_b[var6]) {
											var8 += var10[var8];
											if (dummy == 0) {
											}
										}
									} else if (~var26 == -22) {
										if (~hc.int_nb == -1) {
											return;
										}

										ef var29 = og.efs_c[--hc.int_nb];
										var5 = var29.va_a;
										var8 = var29.int_j;
										vd.W = var29.lfs_g;
										var9 = var5.Q;
										pd.ints_e = var29.ints_d;
										var10 = var5.T;
										if (dummy == 0) {
										}
									} else if (var26 == 25) {
										var16 = var10[var8];
										l.ints_b[var6++] = mc.a((byte) 115, var16);
										if (dummy == 0) {
										}
									} else if (var26 == 27) {
										var16 = var10[var8];
										--var6;
										ua.a(var16, l.ints_b[var6], (byte) 13);
										if (dummy == 0) {
										}
									} else if (~var26 == -32) {
										var6 -= 2;
										if (~l.ints_b[1 + var6] <= ~l.ints_b[var6]) {
											var8 += var10[var8];
											if (dummy == 0) {
											}
										}
									} else if (~var26 == -33) {
										var6 -= 2;
										if (l.ints_b[1 + var6] <= l.ints_b[var6]) {
											var8 += var10[var8];
											if (dummy == 0) {
											}
										}
									} else if (~var26 == -34) {
										l.ints_b[var6++] = pd.ints_e[var10[var8]];
										if (dummy == 0) {
										}
									} else {
										int var10001;
										if (~var26 == -35) {
											var10001 = var10[var8];
											--var6;
											pd.ints_e[var10001] = l.ints_b[var6];
											if (dummy == 0) {
											}
										} else if (~var26 == -36) {
											bb.lfs_gb[var7++] = vd.W[var10[var8]];
											if (dummy == 0) {
											}
										} else if (~var26 == -37) {
											var10001 = var10[var8];
											--var7;
											vd.W[var10001] = bb.lfs_gb[var7];
											if (dummy == 0) {
											}
										} else if (~var26 == -38) {
											var16 = var10[var8];
											var7 -= var16;
											var17 = ch.a(var16, (byte) 53, bb.lfs_gb, var7);
											bb.lfs_gb[var7++] = var17;
											if (dummy == 0) {
											}
										} else if (~var26 == -39) {
											--var6;
											if (dummy == 0) {
											}
										} else if (var26 == 39) {
											--var7;
											if (dummy == 0) {
											}
										} else if (var26 == 40) {
											var16 = var10[var8];
											va var30 = ca.a(true, var16);
											int[] var18 = new int[var30.U];
											lf[] var19 = new lf[var30.R];
											var20 = 0;
											if (dummy != 0 || var20 < var30.M) {
												do {
													var18[var20] = l.ints_b[var6 - (var30.M - var20)];
													++var20;
												} while (var20 < var30.M);
											}

											var21 = 0;
											if (dummy != 0 || ~var21 > ~var30.G) {
												do {
													var19[var21] = bb.lfs_gb[var7 + -var30.G + var21];
													++var21;
												} while (~var21 > ~var30.G);
											}

											var6 -= var30.M;
											var7 -= var30.G;
											ef var22 = new ef();
											var22.va_a = var5;
											var22.ints_d = pd.ints_e;
											var22.lfs_g = vd.W;
											var22.int_j = var8;
											if (~og.efs_c.length >= ~hc.int_nb) {
												throw new RuntimeException();
											}

											var8 = -1;
											og.efs_c[hc.int_nb++] = var22;
											pd.ints_e = var18;
											vd.W = var19;
											var5 = var30;
											var10 = var30.T;
											var9 = var30.Q;
											if (dummy == 0) {
											}
										} else if (~var26 == -43) {
											l.ints_b[var6++] = ea.ints_g[var10[var8]];
											if (dummy == 0) {
											}
										} else if (~var26 == -44) {
											var10001 = var10[var8];
											--var6;
											ea.ints_g[var10001] = l.ints_b[var6];
											if (dummy == 0) {
											}
										} else if (var26 == 44) {
											var16 = var10[var8] >> 16;
											--var6;
											var32 = l.ints_b[var6];
											var31 = '\uffff' & var10[var8];
											if (~var32 > -1 || ~var32 < -5001) {
												throw new RuntimeException();
											}

											ib.ints_g[var16] = var32;
											byte var34 = -1;
											if (var31 == 105) {
												var34 = 0;
											}

											var20 = 0;
											while (~var32 < ~var20) {
												ng.ints_cb[var16][var20] = var34;
												++var20;
											}

											if (dummy == 0) {
											}
										} else if (var26 == 45) {
											--var6;
											var31 = l.ints_b[var6];
											var16 = var10[var8];
											if (~var31 > -1 || ~var31 <= ~ib.ints_g[var16]) {
												throw new RuntimeException();
											}

											l.ints_b[var6++] = ng.ints_cb[var16][var31];
											if (dummy == 0) {
											}
										} else if (var26 == 46) {
											var16 = var10[var8];
											var6 -= 2;
											var31 = l.ints_b[var6];
											if (~var31 > -1 || ~var31 <= ~ib.ints_g[var16]) {
												throw new RuntimeException();
											}

											ng.ints_cb[var16][var31] = l.ints_b[var6 - -1];
											if (dummy == 0) {
											}
										} else if (var26 == 47) {
											lf var35 = md.lfs_h[var10[var8]];
											if (var35 == null) {
												var35 = sd.Fb;
											}

											bb.lfs_gb[var7++] = var35;
											if (dummy == 0) {
											}
										} else if (var26 == 48) {
											var10001 = var10[var8];
											--var7;
											md.lfs_h[var10001] = bb.lfs_gb[var7];
											if (dummy == 0) {
											}
										}
									}
								}
							} else {
								boolean var38;
								if (~var10[var8] != -2) {
									var38 = false;
								} else {
									var38 = true;
								}

								vg var39;
								int var40;
								int var42;
								vg var60;
								vg var61;
								if (~var26 <= -301) {
									if (var26 < 500) {
										if (~var26 == -404) {
											var6 -= 2;
											var31 = l.ints_b[var6];
											if (var31 >= 7) {
												var31 -= 7;
											}

											var32 = l.ints_b[1 + var6];
											r.X.be_id.b(-8621, var32, var31);
											if (dummy == 0) {
											}
										} else if (var26 == 404) {
											var6 -= 2;
											var31 = l.ints_b[var6];
											var32 = l.ints_b[1 + var6];
											r.X.be_id.a(var31, var32, 12);
											if (dummy == 0) {
											}
										} else if (~var26 != -411) {
											throw new IllegalStateException();
										} else {
											--var6;
											boolean var36 = ~l.ints_b[var6] != -1;
											r.X.be_id.a(-68, var36);
											if (dummy == 0) {
											}
										}
									} else if (var26 >= 1000 && ~var26 > -1101 || ~var26 <= -2001 && var26 < 2100) {
										label3169:
										{
											if (var26 >= 2000) {
												var26 -= 1000;
												--var6;
												var39 = ra.a(l.ints_b[var6], (byte) 123);
												if (dummy == 0) {
												}
											} else {
												var39 = var38 ? od.vg_bb : ne.vg_l;
											}
										}

										if (~var26 == -1001) {
											var6 -= 2;
											var39.int_k = l.ints_b[var6];
											var39.int_rc = l.ints_b[var6 - -1];
											mc.a(var39, -23101);
											if (dummy == 0) {
											}
										} else if (~var26 == -1002) {
											var6 -= 2;
											var39.int_ob = l.ints_b[var6];
											var39.Ib = l.ints_b[1 + var6];
											mc.a(var39, -23101);
											if (dummy == 0) {
											}
										} else if (~var26 != -1004) {
											throw new IllegalStateException();
										} else {
											--var6;
											boolean var33 = l.ints_b[var6] == 1;
											if (var33 == var39.B) {
											} else {
												var39.B = var33;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											}
										}
									} else {
										lf var37;
										if (~var26 <= -1101 && var26 < 1200 || ~var26 <= -2101 && ~var26 > -2201) {
											label2736:
											{
												if (var26 < 2000) {
													var39 = !var38 ? ne.vg_l : od.vg_bb;
												} else {
													--var6;
													var39 = ra.a(l.ints_b[var6], (byte) 115);
													var26 -= 1000;
												}
											}

											if (~var26 == -1101) {
												var6 -= 2;
												var39.int_c = l.ints_b[var6];
												if (~var39.int_c < ~(-var39.int_ob + var39.int_hb)) {
													var39.int_c = var39.int_hb - var39.int_ob;
												}

												if (var39.int_c < 0) {
													var39.int_c = 0;
												}

												var39.Ac = l.ints_b[1 + var6];
												if (~var39.Ac < ~(var39.G + -var39.Ib)) {
													var39.Ac = var39.G - var39.Ib;
												}

												if (var39.Ac < 0) {
													var39.Ac = 0;
												}

												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1102) {
												--var6;
												var39.C = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1103) {
												--var6;
												var39.boolean_nc = l.ints_b[var6] == 1;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1104) {
												--var6;
												var39.N = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (var26 == 1104) {
												--var6;
												var39.int_tc = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1106) {
												--var6;
												var39.int_fc = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1107) {
												--var6;
												var39.V = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1108) {
												--var6;
												var39.E = l.ints_b[var6] == 1;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1109) {
												var39.Eb = 1;
												--var6;
												var39.int_mc = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1110) {
												var6 -= 6;
												var39.int_kb = l.ints_b[var6];
												var39.P = l.ints_b[var6 - -1];
												var39.int_gb = l.ints_b[var6 - -2];
												var39.Ab = l.ints_b[var6 + 3];
												var39.Ob = l.ints_b[4 + var6];
												var39.Tb = l.ints_b[var6 + 5];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (var26 == 1110) {
												--var6;
												var32 = l.ints_b[var6];
												if (var39.Db == var32) {
												} else {
													var39.int_h = 0;
													var39.int_uc = 0;
													var39.Db = var32;
													mc.a(var39, -23101);
													if (dummy == 0) {
													}
												}
											} else if (var26 == 1111) {
												--var6;
												var39.M = l.ints_b[var6] == 1;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1113) {
												--var7;
												var37 = bb.lfs_gb[var7];
												if (!var37.e(var39.Fc, -1)) {
													var39.Fc = var37;
													mc.a(var39, -23101);
													if (dummy == 0) {
													}
												}
											} else if (var26 == 1113) {
												--var6;
												var39.z = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1115) {
												var6 -= 3;
												var39.int_n = l.ints_b[var6];
												var39.int_v = l.ints_b[1 + var6];
												var39.xc = l.ints_b[2 + var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (var26 == 1115) {
												--var6;
												var39.Rb = ~l.ints_b[var6] == -2;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (var26 == 1116) {
												--var6;
												var39.int_kc = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1118) {
												--var6;
												var39.int_ic = l.ints_b[var6];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 == -1119) {
												--var6;
												var39.boolean_cc = ~l.ints_b[var6] == -2;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (var26 == 1119) {
												--var6;
												var39.boolean_w = ~l.ints_b[var6] == -2;
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											} else if (~var26 != -1121) {
												throw new IllegalStateException();
											} else {
												var6 -= 2;
												var39.int_hb = l.ints_b[var6];
												var39.G = l.ints_b[var6 - -1];
												mc.a(var39, -23101);
												if (dummy == 0) {
												}
											}
										} else if ((~var26 > -1201 || var26 >= 1300) && (~var26 > -2201 || ~var26 <= -2301)) {
											if (var26 >= 1300 && var26 < 1400 || var26 >= 2300 && var26 < 2400) {
												label2681:
												{
													if (~var26 > -2001) {
														var39 = var38 ? od.vg_bb : ne.vg_l;
													} else {
														--var6;
														var39 = ra.a(l.ints_b[var6], (byte) 120);
														var26 -= 1000;
													}
												}

												if (var26 == 1300) {
													--var6;
													var32 = l.ints_b[var6] + -1;
													if (~var32 > -1 || ~var32 < -10) {
														--var7;
														if (dummy == 0) {
														}
													} else {
														--var7;
														var39.a(var32, -59, bb.lfs_gb[var7]);
														if (dummy == 0) {
														}
													}
												} else if (~var26 == -1302) {
													var6 -= 2;
													var32 = l.ints_b[var6];
													var40 = l.ints_b[var6 + 1];
													var39.A = nh.c(var32, -1, var40);
													if (dummy == 0) {
													}
												} else if (~var26 == -1303) {
													--var6;
													var39.boolean_tb = l.ints_b[var6] == 1;
													if (dummy == 0) {
													}
												} else if (var26 == 1303) {
													--var6;
													var39.int_qb = l.ints_b[var6];
													if (dummy == 0) {
													}
												} else if (~var26 == -1305) {
													--var6;
													var39.int_fb = l.ints_b[var6];
													if (dummy == 0) {
													}
												} else if (var26 == 1305) {
													--var7;
													var39.lf_g = bb.lfs_gb[var7];
													if (dummy == 0) {
													}
												} else if (~var26 == -1307) {
													--var7;
													var39.H = bb.lfs_gb[var7];
													if (dummy == 0) {
													}
												} else if (var26 != 1307) {
													throw new IllegalStateException();
												} else {
													var39.lfs_cb = null;
													if (dummy == 0) {
													}
												}
											} else if (~var26 <= -1401 && var26 < 1500 || ~var26 <= -2401 && ~var26 > -2501) {
												label3183:
												{
													if (~var26 <= -2001) {
														var26 -= 1000;
														--var6;
														var39 = ra.a(l.ints_b[var6], (byte) 113);
													} else {
														var39 = !var38 ? ne.vg_l : od.vg_bb;
													}
												}

												int[] var41 = null;
												--var7;
												var37 = bb.lfs_gb[var7];
												if (var37.e(-30593) > 0 && var37.a(-106, (int) (-1 + var37.e(-30593))) == 89) {
													--var6;
													var20 = l.ints_b[var6];
													if (var20 > 0) {
														var41 = new int[var20];
														if (dummy != 0 || var20-- > 0) {
															do {
																--var6;
																var41[var20] = l.ints_b[var6];
															} while (var20-- > 0);
														}
													}

													var37 = var37.a(var37.e(-30593) + -1, (int) 0, 113);
												}

												Object[] var45 = new Object[1 + var37.e(-30593)];
												var21 = var45.length - 1;
												if (dummy != 0 || ~var21 <= -2) {
													do {
														label2614:
														{
															if (~var37.a(-97, (int) (-1 + var21)) != -116) {
																--var6;
																var45[var21] = new Integer(l.ints_b[var6]);
															} else {
																--var7;
																var45[var21] = bb.lfs_gb[var7];
															}
														}

														--var21;
													} while (~var21 <= -2);
												}

												label2608:
												{
													--var6;
													var42 = l.ints_b[var6];
													if (~var42 != 0) {
														var45[0] = new Integer(var42);
													} else {
														var45 = null;
													}
												}

												if (var26 == 1402) {
													var39.objects_sb = var45;
												}

												if (var26 == 1425) {
													var39.T = var45;
												}

												if (~var26 == -1422) {
													var39.objects_wb = var45;
												}

												if (~var26 == -1406) {
													var39.objects_vc = var45;
												}

												if (var26 == 1403) {
													var39.I = var45;
												}

												if (var26 == 1423) {
													var39.Wb = var45;
												}

												if (~var26 == -1412) {
													var39.objects_pb = var45;
												}

												if (~var26 == -1401) {
													var39.yb = var45;
												}

												if (~var26 == -1413) {
													var39.objects_u = var45;
												}

												if (~var26 == -1411) {
													var39.Ic = var45;
												}

												if (var26 == 1416) {
													var39.objects_lc = var45;
												}

												if (~var26 == -1405) {
													var39.objects_lb = var45;
												}

												if (~var26 == -1408) {
													var39.F = var45;
													var39.X = var41;
												}

												if (~var26 == -1409) {
													var39.Cc = var45;
												}

												var39.xb = true;
												if (var26 == 1424) {
													var39.objects_pc = var45;
												}

												if (~var26 == -1421) {
													var39.objects_qc = var45;
												}

												if (~var26 == -1418) {
													var39.objects_sc = var45;
												}

												if (~var26 == -1407) {
													var39.objects_r = var45;
												}

												if (var26 == 1401) {
													var39.Yb = var45;
												}

												if (var26 == 1414) {
													var39.ints_p = var41;
													var39.Hc = var45;
												}

												if (~var26 == -1420) {
													var39.Mb = var45;
												}

												if (~var26 == -1416) {
													var39.ints_mb = var41;
													var39.objects_oc = var45;
												}

												if (~var26 == -1423) {
													var39.objects_q = var45;
												}

												if (~var26 == -1419) {
													var39.Sb = var45;
												}

												if (~var26 != -1410) {
												} else {
													var39.U = var45;
													if (dummy == 0) {
													}
												}
											} else if (var26 < 1600) {
												var39 = var38 ? od.vg_bb : ne.vg_l;
												if (var26 == 1500) {
													l.ints_b[var6++] = var39.int_k;
													if (dummy == 0) {
													}
												} else if (~var26 == -1502) {
													l.ints_b[var6++] = var39.int_rc;
													if (dummy == 0) {
													}
												} else if (~var26 == -1503) {
													l.ints_b[var6++] = var39.int_ob;
													if (dummy == 0) {
													}
												} else if (var26 == 1503) {
													l.ints_b[var6++] = var39.Ib;
													if (dummy == 0) {
													}
												} else if (~var26 == -1505) {
													l.ints_b[var6++] = !var39.B ? 0 : 1;
													if (dummy == 0) {
													}
												} else if (var26 != 1505) {
													throw new IllegalStateException();
												} else {
													l.ints_b[var6++] = var39.int_bb;
													if (dummy == 0) {
													}
												}
											} else if (~var26 > -1701) {
												var39 = var38 ? od.vg_bb : ne.vg_l;
												if (var26 == 1600) {
													l.ints_b[var6++] = var39.int_c;
													if (dummy == 0) {
													}
												} else if (~var26 == -1602) {
													l.ints_b[var6++] = var39.Ac;
													if (dummy == 0) {
													}
												} else if (~var26 == -1603) {
													bb.lfs_gb[var7++] = var39.Fc;
													if (dummy == 0) {
													}
												} else if (~var26 == -1604) {
													l.ints_b[var6++] = var39.int_hb;
													if (dummy == 0) {
													}
												} else if (~var26 == -1605) {
													l.ints_b[var6++] = var39.G;
													if (dummy == 0) {
													}
												} else if (var26 == 1605) {
													l.ints_b[var6++] = var39.Tb;
													if (dummy == 0) {
													}
												} else if (~var26 == -1607) {
													l.ints_b[var6++] = var39.int_gb;
													if (dummy == 0) {
													}
												} else if (var26 == 1607) {
													l.ints_b[var6++] = var39.Ob;
													if (dummy == 0) {
													}
												} else if (~var26 == -1609) {
													l.ints_b[var6++] = var39.Ab;
													if (dummy == 0) {
													}
												} else if (var26 != 1609) {
													throw new IllegalStateException();
												} else {
													l.ints_b[var6++] = var39.N;
													if (dummy == 0) {
													}
												}
											} else if (~var26 > -1801) {
												var39 = var38 ? od.vg_bb : ne.vg_l;
												if (~var26 == -1701) {
													l.ints_b[var6++] = var39.int_j;
													if (dummy == 0) {
													}
												} else if (~var26 == -1702) {
													if (~var39.int_j != 0) {
														l.ints_b[var6++] = var39.int_b;
														if (dummy == 0) {
														}
													} else {
														l.ints_b[var6++] = 0;
														if (dummy == 0) {
														}
													}
												} else if (~var26 != -1703) {
													throw new IllegalStateException();
												} else {
													l.ints_b[var6++] = var39.Hb;
													if (dummy == 0) {
													}
												}
											} else if (~var26 > -1901) {
												var39 = !var38 ? ne.vg_l : od.vg_bb;
												if (~var26 == -1801) {
													l.ints_b[var6++] = ci.a(71, (int) ne.a(var39, 99));
													if (dummy == 0) {
													}
												} else if (var26 == 1801) {
													--var6;
													var32 = l.ints_b[var6];
													--var32;
													if (var39.lfs_cb == null || var39.lfs_cb.length <= var32 || var39.lfs_cb[var32] == null) {
														bb.lfs_gb[var7++] = fb.lf_h;
														if (dummy == 0) {
														}
													} else {
														bb.lfs_gb[var7++] = var39.lfs_cb[var32];
														if (dummy == 0) {
														}
													}
												} else if (~var26 != -1803) {
													throw new IllegalStateException();
												} else {
													if (var39.lf_g != null) {
														bb.lfs_gb[var7++] = var39.lf_g;
														if (dummy == 0) {
														}
													} else {
														bb.lfs_gb[var7++] = fb.lf_h;
														if (dummy == 0) {
														}
													}
												}
											} else if (var26 >= 2600) {
												if (var26 < 2700) {
													--var6;
													var39 = ra.a(l.ints_b[var6], (byte) 126);
													if (~var26 == -2601) {
														l.ints_b[var6++] = var39.int_c;
														if (dummy == 0) {
														}
													} else if (var26 == 2601) {
														l.ints_b[var6++] = var39.Ac;
														if (dummy == 0) {
														}
													} else if (~var26 == -2603) {
														bb.lfs_gb[var7++] = var39.Fc;
														if (dummy == 0) {
														}
													} else if (~var26 == -2604) {
														l.ints_b[var6++] = var39.int_hb;
														if (dummy == 0) {
														}
													} else if (~var26 == -2605) {
														l.ints_b[var6++] = var39.G;
														if (dummy == 0) {
														}
													} else if (~var26 == -2606) {
														l.ints_b[var6++] = var39.Tb;
														if (dummy == 0) {
														}
													} else if (var26 == 2606) {
														l.ints_b[var6++] = var39.int_gb;
														if (dummy == 0) {
														}
													} else if (var26 == 2607) {
														l.ints_b[var6++] = var39.Ob;
														if (dummy == 0) {
														}
													} else if (~var26 == -2609) {
														l.ints_b[var6++] = var39.Ab;
														if (dummy == 0) {
														}
													} else if (var26 != 2609) {
														throw new IllegalStateException();
													} else {
														l.ints_b[var6++] = var39.N;
														if (dummy == 0) {
														}
													}
												} else if (var26 < 2800) {
													if (var26 == 2700) {
														--var6;
														var39 = ra.a(l.ints_b[var6], (byte) 123);
														l.ints_b[var6++] = var39.int_j;
														if (dummy == 0) {
														}
													} else if (~var26 == -2702) {
														--var6;
														var39 = ra.a(l.ints_b[var6], (byte) 115);
														if (~var39.int_j != 0) {
															l.ints_b[var6++] = var39.int_b;
															if (dummy == 0) {
															}
														} else {
															l.ints_b[var6++] = 0;
															if (dummy == 0) {
															}
														}
													} else if (~var26 == -2703) {
														--var6;
														var31 = l.ints_b[var6];
														fi var44 = (fi) ma.eh_e.a((long) var31, (byte) -78);
														if (var44 != null) {
															l.ints_b[var6++] = 1;
															if (dummy == 0) {
															}
														} else {
															l.ints_b[var6++] = 0;
															if (dummy == 0) {
															}
														}
													} else if (var26 == 2703) {
														--var6;
														var39 = ra.a(l.ints_b[var6], (byte) 121);
														if (var39.Fb == null) {
															l.ints_b[var6++] = 0;
															if (dummy == 0) {
															}
														} else {
															var32 = var39.Fb.length;
															var40 = 0;
															if (dummy != 0 || var40 < var39.Fb.length) {
																do {
																	if (var39.Fb[var40] == null) {
																		var32 = var40;
																		if (dummy == 0) {
																			break;
																		}
																	}

																	++var40;
																} while (var40 < var39.Fb.length);
															}

															l.ints_b[var6++] = var32;
															if (dummy == 0) {
															}
														}
													} else if (~var26 != -2705 && ~var26 != -2706) {
														throw new IllegalStateException();
													} else {
														var6 -= 2;
														var31 = l.ints_b[var6];
														var32 = l.ints_b[1 + var6];
														fi var46 = (fi) ma.eh_e.a((long) var31, (byte) -107);
														if (var46 == null || var46.int_n != var32) {
															l.ints_b[var6++] = 0;
															if (dummy == 0) {
															}
														} else {
															l.ints_b[var6++] = 1;
															if (dummy == 0) {
															}
														}
													}
												} else if (var26 >= 2900) {
													if (~var26 <= -3201) {
														if (var26 >= 3300) {
															if (~var26 > -3401) {
																if (var26 == 3300) {
																	l.ints_b[var6++] = pd.int_i;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3302) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	l.ints_b[var6++] = fc.a(var32, -26917, var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3302) {
																	var6 -= 2;
																	var32 = l.ints_b[1 + var6];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = ch.b(var32, 104, var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3303) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[var6 + 1];
																	l.ints_b[var6++] = jh.a(var31, var32, -125);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3304) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = bg.c(-119, var31).U;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3306) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = bg.ints_t[var31];
																	if (dummy == 0) {
																	}
																} else if (var26 == 3306) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = ua.R[var31];
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3308) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = va.Z[var31];
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3309) {
																	var31 = hc.int_pb;
																	var32 = (r.X.int_fb >> 7) - -fb.int_m;
																	var40 = ea.int_h + (r.X.int_nc >> 7);
																	l.ints_b[var6++] = (var32 << 14) + (var31 << 28) - -var40;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3309) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = sd.a(var31, 268422251) >> 14;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3310) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = var31 >> 28;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3311) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = sd.a(var31, 16383);
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3313) {
																	l.ints_b[var6++] = !gh.boolean_fb ? 0 : 1;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3313) {
																	var6 -= 2;
																	var31 = l.ints_b[var6] - -32768;
																	var32 = l.ints_b[1 + var6];
																	l.ints_b[var6++] = fc.a(var32, -26917, var31);
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3315) {
																	var6 -= 2;
																	var32 = l.ints_b[1 + var6];
																	var31 = l.ints_b[var6] + '耀';
																	l.ints_b[var6++] = ch.b(var32, 100, var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3315) {
																	var6 -= 2;
																	var31 = l.ints_b[var6] - -32768;
																	var32 = l.ints_b[1 + var6];
																	l.ints_b[var6++] = jh.a(var31, var32, -122);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3316) {
																	if (~mc.x <= -3) {
																		l.ints_b[var6++] = mc.x;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3317) {
																	l.ints_b[var6++] = ci.int_tb;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3318) {
																	l.ints_b[var6++] = hd.int_u;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3322) {
																	l.ints_b[var6++] = tb.int_cb;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3323) {
																	l.ints_b[var6++] = ua.P;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3324) {
																	if (~mc.x != -2) {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 1;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3324) {
																	if (w.int_c >= 5 && ~w.int_c >= -10) {
																		l.ints_b[var6++] = w.int_c;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3325) {
																	if (ig.int_s > 0) {
																		l.ints_b[var6++] = 1;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3327) {
																	l.ints_b[var6++] = r.X.Xc;
																	if (dummy == 0) {
																	}
																} else if (~var26 != -3328) {
																	throw new IllegalStateException();
																} else {
																	l.ints_b[var6++] = !r.X.be_id.boolean_r ? 0 : 1;
																	if (dummy == 0) {
																	}
																}
															} else if (~var26 > -3501) {
																if (var26 == 3400) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[var6 - -1];
																	ac var47 = hc.a(1, var31);
																	var20 = 0;
																	if (dummy != 0 || ~var20 > ~var47.M) {
																		do {
																			if (var47.S[var20] == var32) {
																				bb.lfs_gb[var7++] = var47.N[var20];
																				var47 = null;
																				break;
																			}

																			++var20;
																		} while (~var20 > ~var47.M);
																	}

																	if (var47 == null) {
																	} else {
																		bb.lfs_gb[var7++] = var47.Z;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 != 3408) {
																	throw new IllegalStateException();
																} else {
																	var6 -= 4;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	var40 = l.ints_b[2 + var6];
																	var20 = l.ints_b[3 + var6];
																	ac var43 = hc.a(1, var40);
																	if (var43.P != var31 || var32 != var43.int_bb) {
																		if (~var32 != -116) {
																			l.ints_b[var6++] = 0;
																			if (dummy == 0) {
																			}
																		} else {
																			bb.lfs_gb[var7++] = sd.Fb;
																			if (dummy == 0) {
																			}
																		}
																	} else {
																		var42 = 0;
																		if (dummy != 0 || ~var42 > ~var43.M) {
																			do {
																				if (~var43.S[var42] == ~var20) {
																					label2424:
																					{
																						if (~var32 != -116) {
																							l.ints_b[var6++] = var43.H[var42];
																						} else {
																							bb.lfs_gb[var7++] = var43.N[var42];
																						}
																					}

																					var43 = null;
																					break;
																				}

																				++var42;
																			} while (~var42 > ~var43.M);
																		}

																		if (var43 == null) {
																		} else {
																			if (~var32 == -116) {
																				bb.lfs_gb[var7++] = var43.Z;
																				if (dummy == 0) {
																				}
																			} else {
																				l.ints_b[var6++] = var43.G;
																				if (dummy == 0) {
																				}
																			}
																		}
																	}
																}
															} else if (var26 < 3700) {
																if (~var26 == -3601) {
																	if (~rc.int_k != -1) {
																		if (~rc.int_k != -2) {
																			l.ints_b[var6++] = vf.int_t;
																			if (dummy == 0) {
																			}
																		} else {
																			l.ints_b[var6++] = -1;
																			if (dummy == 0) {
																			}
																		}
																	} else {
																		l.ints_b[var6++] = -2;
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3602) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (~rc.int_k != -3 || ~var31 <= ~vf.int_t) {
																		bb.lfs_gb[var7++] = fb.lf_h;
																		if (dummy == 0) {
																		}
																	} else {
																		bb.lfs_gb[var7++] = mb.y[var31];
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3602) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (rc.int_k != 2 || vf.int_t <= var31) {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = jh.ints_t[var31];
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3603) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (rc.int_k == 2 && ~vf.int_t < ~var31) {
																		l.ints_b[var6++] = pc.ints_c[var31];
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3605) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	--var6;
																	var32 = l.ints_b[var6];
																	bc.a(var32, var17, 78);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3605) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	j.a(98, var17.a(false));
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3607) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	lb.a(var17.a(false), 1);
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3608) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	fa.a(var17.a(false), false);
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3609) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	uh.a(3542, var17.a(false));
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3610) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	if (var17.b((byte) -102, ia.lf_l) || var17.b((byte) -81, ec.Q)) {
																		var17 = var17.c(-41, 7);
																	}

																	l.ints_b[var6++] = !ca.a(var17, -95) ? 0 : 1;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3611) {
																	if (bh.lf_ib != null) {
																		bb.lfs_gb[var7++] = bh.lf_ib.e(true);
																		if (dummy == 0) {
																		}
																	} else {
																		bb.lfs_gb[var7++] = fb.lf_h;
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3613) {
																	if (bh.lf_ib == null) {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = n.int_h;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3613) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (bh.lf_ib == null || ~var31 <= ~n.int_h) {
																		bb.lfs_gb[var7++] = fb.lf_h;
																		if (dummy == 0) {
																		}
																	} else {
																		bb.lfs_gb[var7++] = uh.jcs_r[var31].lf_p.e(!var0);
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3614) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (bh.lf_ib != null && var31 < n.int_h) {
																		l.ints_b[var6++] = uh.jcs_r[var31].int_v;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3616) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (bh.lf_ib != null && ~n.int_h < ~var31) {
																		l.ints_b[var6++] = uh.jcs_r[var31].byte_s;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3617) {
																	l.ints_b[var6++] = x;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3618) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	sd.a(true, var17);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3618) {
																	l.ints_b[var6++] = ge.byte_g;
																	if (dummy == 0) {
																	}
																} else if (var26 == 3619) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	v.a(var17.a(var0), -22946);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3620) {
																	lc.b(false);
																	if (dummy == 0) {
																	}
																} else if (var26 == 3621) {
																	if (~rc.int_k == -1) {
																		l.ints_b[var6++] = -1;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = bh.int_ob;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 3622) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (~rc.int_k == -1 || bh.int_ob <= var31) {
																		bb.lfs_gb[var7++] = fb.lf_h;
																		if (dummy == 0) {
																		}
																	} else {
																		bb.lfs_gb[var7++] = a((byte) -81, id.longs_n[var31]).e(true);
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -3624) {
																	--var7;
																	var17 = bb.lfs_gb[var7];
																	if (var17.b((byte) -70, ia.lf_l) || var17.b((byte) -85, ec.Q)) {
																		var17 = var17.c(-41, 7);
																	}

																	l.ints_b[var6++] = v.a(var17, 125) ? 1 : 0;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -3625) {
																	--var6;
																	var31 = l.ints_b[var6];
																	if (uh.jcs_r == null || var31 >= n.int_h || !uh.jcs_r[var31].lf_p.a((byte) -121, r.X.Dc)) {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = 1;
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 != 3625) {
																	throw new IllegalStateException();
																} else {
																	if (ec.lf_db == null) {
																		bb.lfs_gb[var7++] = fb.lf_h;
																		if (dummy == 0) {
																		}
																	} else {
																		bb.lfs_gb[var7++] = ec.lf_db.e(true);
																		if (dummy == 0) {
																		}
																	}
																}
															} else if (~var26 <= -4001) {
																if (var26 >= 4100) {
																	if (~var26 <= -4201) {
																		if (var26 < 4300) {
																			if (var26 == 4200) {
																				--var6;
																				var31 = l.ints_b[var6];
																				bb.lfs_gb[var7++] = ng.a(var31, (int) -4).U;
																				if (dummy == 0) {
																				}
																			} else {
																				ie var49;
																				if (var26 == 4201) {
																					var6 -= 2;
																					var32 = l.ints_b[1 + var6];
																					var31 = l.ints_b[var6];
																					var49 = ng.a(var31, (int) -4);
																					if (~var32 <= -2 && ~var32 >= -6 && var49.Db[var32 + -1] != null) {
																						bb.lfs_gb[var7++] = var49.Db[-1 + var32];
																						if (dummy == 0) {
																						}
																					} else {
																						bb.lfs_gb[var7++] = fb.lf_h;
																						if (dummy == 0) {
																						}
																					}
																				} else if (~var26 == -4203) {
																					var6 -= 2;
																					var31 = l.ints_b[var6];
																					var32 = l.ints_b[var6 - -1];
																					var49 = ng.a(var31, (int) -4);
																					if (var32 >= 1 && ~var32 >= -6 && var49.Fb[-1 + var32] != null) {
																						bb.lfs_gb[var7++] = var49.Fb[-1 + var32];
																						if (dummy == 0) {
																						}
																					} else {
																						bb.lfs_gb[var7++] = fb.lf_h;
																						if (dummy == 0) {
																						}
																					}
																				} else if (~var26 == -4204) {
																					--var6;
																					var31 = l.ints_b[var6];
																					l.ints_b[var6++] = ng.a(var31, (int) -4).int_jb;
																					if (dummy == 0) {
																					}
																				} else if (~var26 == -4205) {
																					--var6;
																					var31 = l.ints_b[var6];
																					l.ints_b[var6++] = ~ng.a(var31, (int) -4).L != -2 ? 0 : 1;
																					if (dummy == 0) {
																					}
																				} else {
																					ie var54;
																					if (~var26 == -4206) {
																						--var6;
																						var31 = l.ints_b[var6];
																						var54 = ng.a(var31, (int) -4);
																						if (~var54.int_ub == 0 && ~var54.R <= -1) {
																							l.ints_b[var6++] = var54.R;
																							if (dummy == 0) {
																							}
																						} else {
																							l.ints_b[var6++] = var31;
																							if (dummy == 0) {
																							}
																						}
																					} else if (~var26 == -4207) {
																						--var6;
																						var31 = l.ints_b[var6];
																						var54 = ng.a(var31, (int) -4);
																						if (var54.int_ub >= 0 && ~var54.R <= -1) {
																							l.ints_b[var6++] = var54.R;
																							if (dummy == 0) {
																							}
																						} else {
																							l.ints_b[var6++] = var31;
																							if (dummy == 0) {
																							}
																						}
																					} else if (~var26 == -4208) {
																						--var6;
																						var31 = l.ints_b[var6];
																						l.ints_b[var6++] = ng.a(var31, (int) -4).S ? 1 : 0;
																						if (dummy == 0) {
																						}
																					} else if (var26 == 4210) {
																						--var7;
																						var17 = bb.lfs_gb[var7];
																						--var6;
																						var32 = l.ints_b[var6];
																						ai.a(var32 == 1, var17, (byte) 127);
																						l.ints_b[var6++] = bb.int_db;
																						if (dummy == 0) {
																						}
																					} else if (var26 == 4211) {
																						if (dh.shorts_k != null && ~rd.P > ~bb.int_db) {
																							l.ints_b[var6++] = sd.a('\uffff', dh.shorts_k[rd.P++]);
																							if (dummy == 0) {
																							}
																						} else {
																							l.ints_b[var6++] = -1;
																							if (dummy == 0) {
																							}
																						}
																					} else if (~var26 != -4213) {
																						throw new IllegalStateException();
																					} else {
																						rd.P = 0;
																						if (dummy == 0) {
																						}
																					}
																				}
																			}
																		} else if (~var26 <= -5101) {
																			throw new IllegalStateException();
																		} else if (var26 == 5000) {
																			l.ints_b[var6++] = id.H;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 5001) {
																			++gg.int_g;
																			var6 -= 3;
																			id.H = l.ints_b[var6];
																			pe.int_m = l.ints_b[1 + var6];
																			ba.int_f = l.ints_b[var6 + 2];
																			vg.J.e((byte) 101, 42);
																			vg.J.e(-13488, id.H);
																			vg.J.e(-13488, pe.int_m);
																			vg.J.e(-13488, ba.int_f);
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -5003) {
																			++lf.H;
																			var6 -= 2;
																			var32 = l.ints_b[var6];
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			var40 = l.ints_b[var6 + 1];
																			vg.J.e((byte) 107, 165);
																			vg.J.a(var17.a(var0), -562765672);
																			vg.J.e(-13488, var32 + -1);
																			vg.J.e(-13488, var40);
																			if (dummy == 0) {
																			}
																		} else if (var26 == 5003) {
																			--var6;
																			var31 = l.ints_b[var6];
																			var37 = null;
																			if (~var31 > -101) {
																				var37 = jc.E[var31];
																			}

																			if (var37 == null) {
																				var37 = fb.lf_h;
																			}

																			bb.lfs_gb[var7++] = var37;
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -5005) {
																			var32 = -1;
																			--var6;
																			var31 = l.ints_b[var6];
																			if (var31 < 100 && jc.E[var31] != null) {
																				var32 = lc.A[var31];
																			}

																			l.ints_b[var6++] = var32;
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -5006) {
																			l.ints_b[var6++] = pe.int_m;
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -5009) {
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			if (var17.b((byte) -122, o.lf_e)) {
																				re.a((lf) var17, 4);
																				if (dummy == 0) {
																				}
																			} else {
																				byte var53;
																				byte var55;
																				label2273:
																				{
																					++e.int_h;
																					var37 = var17.b((int) -10180);
																					var53 = 0;
																					var55 = 0;
																					if (!var37.b((byte) -93, og.lf_l)) {
																						if (var37.b((byte) -70, r.Z)) {
																							var53 = 1;
																							var17 = var17.c(-41, r.Z.e(-30593));
																							if (dummy == 0) {
																							}
																						} else if (var37.b((byte) -111, fb.lf_e)) {
																							var53 = 2;
																							var17 = var17.c(-41, fb.lf_e.e(-30593));
																							if (dummy == 0) {
																							}
																						} else if (!var37.b((byte) -74, gg.lf_d)) {
																							if (var37.b((byte) -114, ld.V)) {
																								var53 = 4;
																								var17 = var17.c(-41, ld.V.e(-30593));
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -89, ca.lf_a)) {
																								var53 = 5;
																								var17 = var17.c(-41, ca.lf_a.e(-30593));
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -114, j.L)) {
																								var53 = 6;
																								var17 = var17.c(-41, j.L.e(-30593));
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -92, qh.lf_m)) {
																								var53 = 7;
																								var17 = var17.c(-41, qh.lf_m.e(-30593));
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -73, fa.lf_ib)) {
																								var53 = 8;
																								var17 = var17.c(-41, fa.lf_ib.e(-30593));
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -68, wh.lf_q)) {
																								var53 = 9;
																								var17 = var17.c(-41, wh.lf_q.e(-30593));
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -104, ac.J)) {
																								var17 = var17.c(-41, ac.J.e(-30593));
																								var53 = 10;
																								if (dummy == 0) {
																								}
																							} else if (var37.b((byte) -112, hh.L)) {
																								var17 = var17.c(-41, hh.L.e(-30593));
																								var53 = 11;
																								if (dummy == 0) {
																								}
																							} else if (eh.int_q == 0) {
																							} else {
																								if (!var37.b((byte) -119, og.lf_q)) {
																									if (!var37.b((byte) -126, r.lf_cb)) {
																										if (!var37.b((byte) -83, fb.lf_d)) {
																											if (var37.b((byte) -98, gg.lf_c)) {
																												var53 = 3;
																												var17 = var17.c(-41, gg.lf_c.e(-30593));
																												if (dummy == 0) {
																												}
																											} else if (!var37.b((byte) -68, ld.U)) {
																												if (!var37.b((byte) -92, ca.lf_d)) {
																													if (!var37.b((byte) -95, j.K)) {
																														if (!var37.b((byte) -111, qh.lf_e)) {
																															if (var37.b((byte) -69, fa.S)) {
																																var17 = var17.c(-41, fa.S.e(-30593));
																																var53 = 8;
																																if (dummy == 0) {
																																}
																															} else if (!var37.b((byte) -116, wh.lf_l)) {
																																if (!var37.b((byte) -71, ac.lf_db)) {
																																	if (!var37.b((byte) -75, hh.J)) {
																																	} else {
																																		var53 = 11;
																																		var17 = var17.c(-41, hh.J.e(-30593));
																																		if (dummy == 0) {
																																		}
																																	}
																																} else {
																																	var53 = 10;
																																	var17 = var17.c(-41, ac.lf_db.e(-30593));
																																	if (dummy == 0) {
																																	}
																																}
																															} else {
																																var53 = 9;
																																var17 = var17.c(-41, wh.lf_l.e(-30593));
																																if (dummy == 0) {
																																}
																															}
																														} else {
																															var53 = 7;
																															var17 = var17.c(-41, qh.lf_e.e(-30593));
																															if (dummy == 0) {
																															}
																														}
																													} else {
																														var17 = var17.c(-41, j.K.e(-30593));
																														var53 = 6;
																														if (dummy == 0) {
																														}
																													}
																												} else {
																													var53 = 5;
																													var17 = var17.c(-41, ca.lf_d.e(-30593));
																													if (dummy == 0) {
																													}
																												}
																											} else {
																												var53 = 4;
																												var17 = var17.c(-41, ld.U.e(-30593));
																												if (dummy == 0) {
																												}
																											}
																										} else {
																											var53 = 2;
																											var17 = var17.c(-41, fb.lf_d.e(-30593));
																											if (dummy == 0) {
																											}
																										}
																									} else {
																										var17 = var17.c(-41, r.lf_cb.e(-30593));
																										var53 = 1;
																										if (dummy == 0) {
																										}
																									}
																								} else {
																									var17 = var17.c(-41, og.lf_q.e(-30593));
																									var53 = 0;
																									if (dummy == 0) {
																									}
																								}
																							}
																						} else {
																							var17 = var17.c(-41, gg.lf_d.e(-30593));
																							var53 = 3;
																							if (dummy == 0) {
																							}
																						}
																					} else {
																						var17 = var17.c(-41, og.lf_l.e(-30593));
																						var53 = 0;
																					}
																				}

																				label2198:
																				{
																					var37 = var17.b((int) -10180);
																					if (!var37.b((byte) -114, gh.X)) {
																						if (!var37.b((byte) -97, oh.lf_rb)) {
																							if (!var37.b((byte) -127, ma.lf_d)) {
																								if (var37.b((byte) -97, md.lf_j)) {
																									var17 = var17.c(-41, md.lf_j.e(-30593));
																									var55 = 4;
																									if (dummy == 0) {
																									}
																								} else if (var37.b((byte) -101, tc.lf_nb)) {
																									var55 = 5;
																									var17 = var17.c(-41, tc.lf_nb.e(-30593));
																									if (dummy == 0) {
																									}
																								} else if (eh.int_q == 0) {
																								} else if (var37.b((byte) -90, gh.lf_jb)) {
																									var17 = var17.c(-41, gh.lf_jb.e(-30593));
																									var55 = 1;
																									if (dummy == 0) {
																									}
																								} else if (!var37.b((byte) -73, oh.lf_cb)) {
																									if (!var37.b((byte) -120, ma.lf_l)) {
																										if (var37.b((byte) -73, md.lf_i)) {
																											var17 = var17.c(-41, md.lf_i.e(-30593));
																											var55 = 4;
																											if (dummy == 0) {
																											}
																										} else if (!var37.b((byte) -94, tc.Q)) {
																										} else {
																											var17 = var17.c(-41, tc.Q.e(-30593));
																											var55 = 5;
																											if (dummy == 0) {
																											}
																										}
																									} else {
																										var17 = var17.c(-41, ma.lf_l.e(-30593));
																										var55 = 3;
																										if (dummy == 0) {
																										}
																									}
																								} else {
																									var55 = 2;
																									var17 = var17.c(-41, oh.lf_cb.e(-30593));
																									if (dummy == 0) {
																									}
																								}
																							} else {
																								var17 = var17.c(-41, ma.lf_d.e(-30593));
																								var55 = 3;
																								if (dummy == 0) {
																								}
																							}
																						} else {
																							var55 = 2;
																							var17 = var17.c(-41, oh.lf_rb.e(-30593));
																							if (dummy == 0) {
																							}
																						}
																					} else {
																						var17 = var17.c(-41, gh.X.e(-30593));
																						var55 = 1;
																					}
																				}

																				vg.J.e((byte) 93, 218);
																				vg.J.e(-13488, 0);
																				var21 = vg.J.P;
																				vg.J.e(-13488, var53);
																				vg.J.e(-13488, var55);
																				sc.a(vg.J, true, var17);
																				vg.J.d((int) (-var21 + vg.J.P), -124);
																				if (dummy == 0) {
																				}
																			}
																		} else if (~var26 == -5010) {
																			++pd.int_r;
																			var7 -= 2;
																			var37 = bb.lfs_gb[var7 - -1];
																			var17 = bb.lfs_gb[var7];
																			vg.J.e((byte) 98, 178);
																			vg.J.e(-13488, 0);
																			var40 = vg.J.P;
																			vg.J.a(var17.a(false), -562765672);
																			sc.a(vg.J, !var0, var37);
																			vg.J.d((int) (vg.J.P - var40), -70);
																			if (dummy == 0) {
																			}
																		} else if (var26 == 5010) {
																			--var6;
																			var31 = l.ints_b[var6];
																			var37 = null;
																			if (~var31 > -101) {
																				var37 = md.lfs_k[var31];
																			}

																			if (var37 == null) {
																				var37 = fb.lf_h;
																			}

																			bb.lfs_gb[var7++] = var37;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 5011) {
																			--var6;
																			var31 = l.ints_b[var6];
																			var37 = null;
																			if (~var31 > -101) {
																				var37 = hf.x[var31];
																			}

																			if (var37 == null) {
																				var37 = fb.lf_h;
																			}

																			bb.lfs_gb[var7++] = var37;
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -5016) {
																			label2155:
																			{
																				if (r.X != null && r.X.Dc != null) {
																					var17 = r.X.Dc;
																				} else {
																					var17 = pf.Q;
																				}
																			}

																			bb.lfs_gb[var7++] = var17;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 5016) {
																			l.ints_b[var6++] = ba.int_f;
																			if (dummy == 0) {
																			}
																		} else if (~var26 != -5018) {
																			throw new IllegalStateException();
																		} else {
																			l.ints_b[var6++] = ad.int_r;
																			if (dummy == 0) {
																			}
																		}
																	} else if (~var26 == -4101) {
																		--var6;
																		var32 = l.ints_b[var6];
																		--var7;
																		var17 = bb.lfs_gb[var7];
																		bb.lfs_gb[var7++] = de.a(new lf[]{var17, fa.a((byte) 85, var32)}, 118);
																		if (dummy == 0) {
																		}
																	} else if (~var26 == -4102) {
																		var7 -= 2;
																		var17 = bb.lfs_gb[var7];
																		var37 = bb.lfs_gb[1 + var7];
																		bb.lfs_gb[var7++] = de.a(new lf[]{var17, var37}, 116);
																		if (dummy == 0) {
																		}
																	} else if (~var26 == -4103) {
																		--var7;
																		var17 = bb.lfs_gb[var7];
																		--var6;
																		var32 = l.ints_b[var6];
																		bb.lfs_gb[var7++] = de.a(new lf[]{var17, sc.a(40, true, var32)}, 124);
																		if (dummy == 0) {
																		}
																	} else if (~var26 == -4104) {
																		--var7;
																		var17 = bb.lfs_gb[var7];
																		bb.lfs_gb[var7++] = var17.b((int) -10180);
																		if (dummy == 0) {
																		}
																	} else if (~var26 == -4105) {
																		--var6;
																		var31 = l.ints_b[var6];
																		long var57 = 1014768000000L + 86400000L * (long) var31;
																		cc.Z.setTime(new Date(var57));
																		var20 = cc.Z.get(5);
																		var21 = cc.Z.get(2);
																		var42 = cc.Z.get(1);
																		bb.lfs_gb[var7++] = de.a(new lf[]{fa.a((byte) 85, var20), ub.S, ha.G[var21], ub.S, fa.a((byte) 85, var42)}, -85);
																		if (dummy == 0) {
																		}
																	} else if (var26 == 4105) {
																		var7 -= 2;
																		var17 = bb.lfs_gb[var7];
																		var37 = bb.lfs_gb[var7 + 1];
																		if (r.X.be_id == null || !r.X.be_id.boolean_r) {
																			bb.lfs_gb[var7++] = var17;
																			if (dummy == 0) {
																			}
																		} else {
																			bb.lfs_gb[var7++] = var37;
																			if (dummy == 0) {
																			}
																		}
																	} else if (~var26 == -4107) {
																		--var6;
																		var31 = l.ints_b[var6];
																		bb.lfs_gb[var7++] = fa.a((byte) 85, var31);
																		if (dummy == 0) {
																		}
																	} else if (~var26 == -4108) {
																		var7 -= 2;
																		l.ints_b[var6++] = bb.lfs_gb[var7].a((int) -112, bb.lfs_gb[1 + var7]);
																		if (dummy == 0) {
																		}
																	} else {
																		db var48;
																		byte[] var58;
																		if (~var26 == -4109) {
																			var6 -= 2;
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			var32 = l.ints_b[var6];
																			var40 = l.ints_b[1 + var6];
																			var58 = gh.cache13.a(0, 0, var40);
																			var48 = new db(var58);
																			var48.a(pf.dfs_bb, (int[]) null);
																			l.ints_b[var6++] = var48.c(var17, var32);
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -4110) {
																			var6 -= 2;
																			var32 = l.ints_b[var6];
																			var40 = l.ints_b[1 + var6];
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			var58 = gh.cache13.a(0, 0, var40);
																			var48 = new db(var58);
																			var48.a(pf.dfs_bb, (int[]) null);
																			l.ints_b[var6++] = var48.b(var17, var32);
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -4111) {
																			var7 -= 2;
																			var17 = bb.lfs_gb[var7];
																			var37 = bb.lfs_gb[var7 - -1];
																			--var6;
																			if (l.ints_b[var6] != 1) {
																				bb.lfs_gb[var7++] = var37;
																				if (dummy == 0) {
																				}
																			} else {
																				bb.lfs_gb[var7++] = var17;
																				if (dummy == 0) {
																				}
																			}
																		} else if (var26 == 4111) {
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			bb.lfs_gb[var7++] = bf.c(var17);
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -4113) {
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			--var6;
																			var32 = l.ints_b[var6];
																			bb.lfs_gb[var7++] = var17.d(117, var32);
																			if (dummy == 0) {
																			}
																		} else if (var26 == 4113) {
																			--var6;
																			var31 = l.ints_b[var6];
																			l.ints_b[var6++] = !lc.a(var31, (byte) 114) ? 0 : 1;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 4114) {
																			--var6;
																			var31 = l.ints_b[var6];
																			l.ints_b[var6++] = e.a(true, var31) ? 1 : 0;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 4115) {
																			--var6;
																			var31 = l.ints_b[var6];
																			l.ints_b[var6++] = ff.a(var31, -13101) ? 1 : 0;
																			if (dummy == 0) {
																			}
																		} else if (~var26 == -4117) {
																			--var6;
																			var31 = l.ints_b[var6];
																			l.ints_b[var6++] = !hf.a(48, var31) ? 0 : 1;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 4117) {
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			if (var17 != null) {
																				l.ints_b[var6++] = var17.e(-30593);
																				if (dummy == 0) {
																				}
																			} else {
																				l.ints_b[var6++] = 0;
																				if (dummy == 0) {
																				}
																			}
																		} else if (var26 == 4118) {
																			var6 -= 2;
																			var40 = l.ints_b[var6 + 1];
																			var32 = l.ints_b[var6];
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			bb.lfs_gb[var7++] = var17.a(var40, (int) var32, 99);
																			if (dummy == 0) {
																			}
																		} else if (var26 == 4119) {
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			var37 = u.a(-13, var17.e(-30593));
																			boolean var56 = false;
																			var20 = 0;
																			if (dummy != 0 || ~var20 > ~var17.e(-30593)) {
																				do {
																					label3242:
																					{
																						var21 = var17.a(109, (int) var20);
																						if (var21 == 60) {
																							var56 = true;
																							if (dummy == 0) {
																							}
																						} else if (var21 == 62) {
																							var56 = false;
																							if (dummy == 0) {
																							}
																						} else {
																							if (!var56) {
																								var37.e(-64, var21);
																							}
																						}
																					}

																					++var20;
																				} while (~var20 > ~var17.e(-30593));
																			}

																			var37.g(18879);
																			bb.lfs_gb[var7++] = var37;
																			if (dummy == 0) {
																			}
																		} else if (var26 == 4120) {
																			var6 -= 2;
																			--var7;
																			var17 = bb.lfs_gb[var7];
																			var40 = l.ints_b[var6 + 1];
																			var32 = l.ints_b[var6];
																			l.ints_b[var6++] = var17.a(var32, (byte) 102, var40);
																			if (dummy == 0) {
																			}
																		} else if (~var26 != -4122) {
																			throw new IllegalStateException();
																		} else {
																			var7 -= 2;
																			var17 = bb.lfs_gb[var7];
																			var37 = bb.lfs_gb[var7 + 1];
																			--var6;
																			var40 = l.ints_b[var6];
																			l.ints_b[var6++] = var17.a(-42, var40, var37);
																			if (dummy == 0) {
																			}
																		}
																	}
																} else if (var26 == 4000) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[var6 - -1];
																	l.ints_b[var6++] = var32 + var31;
																	if (dummy == 0) {
																	}
																} else if (var26 == 4001) {
																	var6 -= 2;
																	var32 = l.ints_b[1 + var6];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = -var32 + var31;
																	if (dummy == 0) {
																	}
																} else if (var26 == 4002) {
																	var6 -= 2;
																	var32 = l.ints_b[1 + var6];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = var32 * var31;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -4004) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	l.ints_b[var6++] = var31 / var32;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -4005) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = (int) (Math.random() * (double) var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 4005) {
																	--var6;
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = (int) ((double) (var31 + 1) * Math.random());
																	if (dummy == 0) {
																	}
																} else if (var26 == 4006) {
																	var6 -= 5;
																	var32 = l.ints_b[1 + var6];
																	var31 = l.ints_b[var6];
																	var40 = l.ints_b[2 + var6];
																	var20 = l.ints_b[3 + var6];
																	var21 = l.ints_b[4 + var6];
																	l.ints_b[var6++] = (var32 - var31) * (var21 + -var40) / (var20 - var40) + var31;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -4008) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	l.ints_b[var6++] = var31 - -(var32 * var31 / 100);
																	if (dummy == 0) {
																	}
																} else if (var26 == 4008) {
																	var6 -= 2;
																	var32 = l.ints_b[1 + var6];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = d.c(var31, 1 << var32);
																	if (dummy == 0) {
																	}
																} else if (~var26 == -4010) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[var6 - -1];
																	l.ints_b[var6++] = sd.a(-(1 << var32) + -1, var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 4010) {
																	var6 -= 2;
																	var32 = l.ints_b[var6 - -1];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = ~sd.a(var31, 1 << var32) == -1 ? 0 : 1;
																	if (dummy == 0) {
																	}
																} else if (var26 == 4011) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[var6 - -1];
																	l.ints_b[var6++] = var31 % var32;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -4013) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	if (~var31 == -1) {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = (int) Math.pow((double) var31, (double) var32);
																		if (dummy == 0) {
																		}
																	}
																} else if (~var26 == -4014) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	if (var31 == 0) {
																		l.ints_b[var6++] = 0;
																		if (dummy == 0) {
																		}
																	} else if (var32 == 0) {
																		l.ints_b[var6++] = Integer.MAX_VALUE;
																		if (dummy == 0) {
																		}
																	} else {
																		l.ints_b[var6++] = (int) Math.pow((double) var31, 1.0D / (double) var32);
																		if (dummy == 0) {
																		}
																	}
																} else if (var26 == 4014) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[var6 + 1];
																	l.ints_b[var6++] = sd.a(var32, var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 4015) {
																	var6 -= 2;
																	var31 = l.ints_b[var6];
																	var32 = l.ints_b[1 + var6];
																	l.ints_b[var6++] = d.c(var32, var31);
																	if (dummy == 0) {
																	}
																} else if (var26 == 4016) {
																	var6 -= 2;
																	var32 = l.ints_b[var6 - -1];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = ~var32 < ~var31 ? var31 : var32;
																	if (dummy == 0) {
																	}
																} else if (~var26 == -4018) {
																	var6 -= 2;
																	var32 = l.ints_b[var6 + 1];
																	var31 = l.ints_b[var6];
																	l.ints_b[var6++] = var31 <= var32 ? var32 : var31;
																	if (dummy == 0) {
																	}
																} else if (~var26 != -4019) {
																	throw new IllegalStateException();
																} else {
																	var6 -= 3;
																	long var64 = (long) l.ints_b[var6];
																	long var59 = (long) l.ints_b[var6 - -1];
																	long var50 = (long) l.ints_b[var6 + 2];
																	l.ints_b[var6++] = (int) (var50 * var64 / var59);
																	if (dummy == 0) {
																	}
																}
															} else if (~var26 == -3904) {
																--var6;
																var31 = l.ints_b[var6];
																l.ints_b[var6++] = bg.y[var31].a(true);
																if (dummy == 0) {
																}
															} else if (~var26 == -3905) {
																--var6;
																var31 = l.ints_b[var6];
																l.ints_b[var6++] = bg.y[var31].int_g;
																if (dummy == 0) {
																}
															} else if (var26 == 3905) {
																--var6;
																var31 = l.ints_b[var6];
																l.ints_b[var6++] = bg.y[var31].int_l;
																if (dummy == 0) {
																}
															} else if (var26 == 3906) {
																--var6;
																var31 = l.ints_b[var6];
																l.ints_b[var6++] = bg.y[var31].int_p;
																if (dummy == 0) {
																}
															} else if (~var26 == -3908) {
																--var6;
																var31 = l.ints_b[var6];
																l.ints_b[var6++] = bg.y[var31].int_i;
																if (dummy == 0) {
																}
															} else if (~var26 == -3909) {
																--var6;
																var31 = l.ints_b[var6];
																l.ints_b[var6++] = bg.y[var31].int_k;
																if (dummy == 0) {
																}
															} else if (~var26 == -3911) {
																--var6;
																var31 = l.ints_b[var6];
																var32 = bg.y[var31].a((int) 7);
																l.ints_b[var6++] = var32 != 0 ? 0 : 1;
																if (dummy == 0) {
																}
															} else if (~var26 == -3912) {
																--var6;
																var31 = l.ints_b[var6];
																var32 = bg.y[var31].a((int) 7);
																l.ints_b[var6++] = ~var32 != -3 ? 0 : 1;
																if (dummy == 0) {
																}
															} else if (var26 == 3912) {
																--var6;
																var31 = l.ints_b[var6];
																var32 = bg.y[var31].a((int) 7);
																l.ints_b[var6++] = ~var32 != -6 ? 0 : 1;
																if (dummy == 0) {
																}
															} else if (var26 != 3913) {
																throw new IllegalStateException();
															} else {
																--var6;
																var31 = l.ints_b[var6];
																var32 = bg.y[var31].a((int) 7);
																l.ints_b[var6++] = ~var32 != -2 ? 0 : 1;
																if (dummy == 0) {
																}
															}
														} else if (~var26 == -3201) {
															var6 -= 3;
															ag.a(l.ints_b[1 + var6], l.ints_b[var6], 0, l.ints_b[var6 + 2]);
															if (dummy == 0) {
															}
														} else if (~var26 == -3202) {
															--var6;
															th.a(-90, l.ints_b[var6]);
															if (dummy == 0) {
															}
														} else if (~var26 != -3203) {
															throw new IllegalStateException();
														} else {
															var6 -= 2;
															qe.a(0, l.ints_b[var6 - -1], l.ints_b[var6]);
															if (dummy == 0) {
															}
														}
													} else if (var26 == 3100) {
														--var7;
														var17 = bb.lfs_gb[var7];
														kd.a(fb.lf_h, false, var17, 0);
														if (dummy == 0) {
														}
													} else if (var26 == 3101) {
														var6 -= 2;
														ai.a(l.ints_b[var6 + 1], l.ints_b[var6], false, r.X);
														if (dummy == 0) {
														}
													} else if (~var26 == -3104) {
														pf.e(103);
														if (dummy == 0) {
														}
													} else if (var26 == 3104) {
														--var7;
														var17 = bb.lfs_gb[var7];
														++eg.int_f;
														var32 = 0;
														if (var17.d((int) -29838)) {
															var32 = var17.b((byte) 126);
														}

														vg.J.e((byte) 114, 171);
														vg.J.b((byte) 117, var32);
														if (dummy == 0) {
														}
													} else if (~var26 == -3106) {
														++B;
														--var7;
														var17 = bb.lfs_gb[var7];
														vg.J.e((byte) 81, 150);
														vg.J.a(var17.a(var0), -562765672);
														if (dummy == 0) {
														}
													} else if (~var26 == -3107) {
														++sd.I;
														--var7;
														var17 = bb.lfs_gb[var7];
														vg.J.e((byte) 108, 39);
														vg.J.e(-13488, 1 + var17.e(-30593));
														vg.J.a(var17, (byte) -17);
														if (dummy == 0) {
														}
													} else if (var26 == 3107) {
														--var6;
														var31 = l.ints_b[var6];
														--var7;
														var37 = bb.lfs_gb[var7];
														oa.a((int) -59, var31, (lf) var37);
														if (dummy == 0) {
														}
													} else if (var26 == 3108) {
														var6 -= 3;
														var32 = l.ints_b[1 + var6];
														var31 = l.ints_b[var6];
														var40 = l.ints_b[2 + var6];
														var60 = ra.a(var40, (byte) 125);
														i.a(var32, var60, var31, (byte) 101);
														if (dummy == 0) {
														}
													} else if (~var26 == -3110) {
														var6 -= 2;
														var31 = l.ints_b[var6];
														var32 = l.ints_b[1 + var6];
														var61 = var38 ? od.vg_bb : ne.vg_l;
														i.a(var32, var61, var31, (byte) 104);
														if (dummy == 0) {
														}
													} else if (~var26 != -3111) {
														throw new IllegalStateException();
													} else {
														++w.int_b;
														--var6;
														var31 = l.ints_b[var6];
														vg.J.e((byte) 91, 43);
														vg.J.c((int) 9698, var31);
														if (dummy == 0) {
														}
													}
												} else {
													--var6;
													var39 = ra.a(l.ints_b[var6], (byte) 114);
													if (~var26 == -2801) {
														l.ints_b[var6++] = ci.a(-14, (int) ne.a(var39, 116));
														if (dummy == 0) {
														}
													} else if (var26 == 2801) {
														--var6;
														var32 = l.ints_b[var6];
														--var32;
														if (var39.lfs_cb == null || var39.lfs_cb.length <= var32 || var39.lfs_cb[var32] == null) {
															bb.lfs_gb[var7++] = fb.lf_h;
															if (dummy == 0) {
															}
														} else {
															bb.lfs_gb[var7++] = var39.lfs_cb[var32];
															if (dummy == 0) {
															}
														}
													} else if (~var26 != -2803) {
														throw new IllegalStateException();
													} else {
														if (var39.lf_g == null) {
															bb.lfs_gb[var7++] = fb.lf_h;
															if (dummy == 0) {
															}
														} else {
															bb.lfs_gb[var7++] = var39.lf_g;
															if (dummy == 0) {
															}
														}
													}
												}
											} else {
												--var6;
												var39 = ra.a(l.ints_b[var6], (byte) 121);
												if (var26 == 2500) {
													l.ints_b[var6++] = var39.int_k;
													if (dummy == 0) {
													}
												} else if (~var26 == -2502) {
													l.ints_b[var6++] = var39.int_rc;
													if (dummy == 0) {
													}
												} else if (~var26 == -2503) {
													l.ints_b[var6++] = var39.int_ob;
													if (dummy == 0) {
													}
												} else if (~var26 == -2504) {
													l.ints_b[var6++] = var39.Ib;
													if (dummy == 0) {
													}
												} else if (var26 == 2504) {
													l.ints_b[var6++] = !var39.B ? 0 : 1;
													if (dummy == 0) {
													}
												} else if (var26 != 2505) {
													throw new IllegalStateException();
												} else {
													l.ints_b[var6++] = var39.int_bb;
													if (dummy == 0) {
													}
												}
											}
										} else {
											label3249:
											{
												if (var26 >= 2000) {
													var26 -= 1000;
													--var6;
													var39 = ra.a(l.ints_b[var6], (byte) 114);
												} else {
													var39 = !var38 ? ne.vg_l : od.vg_bb;
												}
											}

											mc.a(var39, -23101);
											if (~var26 == -1201) {
												var6 -= 2;
												var32 = l.ints_b[var6];
												var40 = l.ints_b[var6 + 1];
												if (var32 == -1) {
													var39.Eb = 1;
													var39.int_mc = -1;
													var39.int_j = -1;
												} else {
													var39.int_j = var32;
													var39.int_b = var40;
													ie var62 = ng.a(var32, (int) -4);
													var39.Ob = var62.int_vb;
													var39.int_gb = var62.M;
													var39.P = var62.xb;
													var39.Ab = var62.Ib;
													var39.Tb = var62.int_mb;
													var39.int_kb = var62.int_eb;
													if (var39.int_ob > 0) {
														var39.Tb = 32 * var39.Tb / var39.int_ob;
													}
												}
											} else if (~var26 == -1202) {
												var39.Eb = 2;
												--var6;
												var39.int_mc = l.ints_b[var6];
											} else if (~var26 == -1203) {
												var39.Eb = 3;
												var39.int_mc = r.X.be_id.a((byte) -91);
											} else if (~var26 == -1204) {
												var39.Eb = 6;
												--var6;
												var39.int_mc = l.ints_b[var6];
											} else if (var26 != 1204) {
												throw new IllegalStateException();
											} else {
												var39.Eb = 5;
												--var6;
												var39.int_mc = l.ints_b[var6];
											}
										}
									}
								} else if (var26 == 100) {
									var6 -= 3;
									var32 = l.ints_b[1 + var6];
									var40 = l.ints_b[2 + var6];
									var31 = l.ints_b[var6];
									if (var32 == 0) {
										throw new RuntimeException();
									}

									var60 = ra.a(var31, (byte) 116);
									if (var60.Fb == null) {
										var60.Fb = new vg[1 + var40];
									}

									if (~var40 <= ~var60.Fb.length) {
										vg[] var51 = new vg[var40 + 1];
										var42 = 0;
										while (~var60.Fb.length < ~var42) {
											var51[var42] = var60.Fb[var42];
											++var42;
										}

										var60.Fb = var51;
									}

									if (var40 > 0 && var60.Fb[var40 - 1] == null) {
										throw new RuntimeException("Gap at:" + (var40 + -1));
									}

									label1937:
									{
										vg var52 = new vg();
										var52.int_bb = var52.Z = var60.Z;
										var52.int_ib = var32;
										var52.Hb = var40;
										var52.Bc = true;
										var60.Fb[var40] = var52;
										if (!var38) {
											ne.vg_l = var52;
										} else {
											od.vg_bb = var52;
										}
									}

									mc.a(var60, -23101);
								} else {
									vg var63;
									if (var26 == 101) {
										var39 = var38 ? od.vg_bb : ne.vg_l;
										if (var39.Hb == -1) {
											if (!var38) {
												throw new RuntimeException("Tried to cc_delete static active-component!");
											}

											throw new RuntimeException("Tried to .cc_delete static .active-component!");
										}

										var63 = ra.a(var39.Z, (byte) 114);
										var63.Fb[var39.Hb] = null;
										mc.a(var63, -23101);
									} else if (~var26 == -103) {
										--var6;
										var39 = ra.a(l.ints_b[var6], (byte) 116);
										var39.Fb = null;
										mc.a(var39, -23101);
									} else if (~var26 == -201) {
										var6 -= 2;
										var31 = l.ints_b[var6];
										var32 = l.ints_b[var6 + 1];
										var61 = nh.c(var31, -1, var32);
										if (var61 != null && var32 != -1) {
											l.ints_b[var6++] = 1;
											if (var38) {
												od.vg_bb = var61;
											} else {
												ne.vg_l = var61;
											}
										} else {
											l.ints_b[var6++] = 0;
										}
									} else if (var26 == 201) {
										--var6;
										var31 = l.ints_b[var6];
										var63 = ra.a(var31, (byte) 121);
										if (var63 == null) {
											l.ints_b[var6++] = 0;
										} else {
											l.ints_b[var6++] = 1;
											if (!var38) {
												ne.vg_l = var63;
											} else {
												od.vg_bb = var63;
											}
										}
									} else {
										throw new IllegalStateException();
									}
								}
							}
						}
					}
				} catch (Exception var24) {
					if (var5.S == null) {
						if (~ch.int_s != -1) {
							kd.a(fb.lf_h, var0, hg.lf_e, 0);
						}

						ah.a("CS2 - scr:" + var5.long_e + " op:" + var11, -38, var24);
					} else {
						lf var13 = u.a(-13, 30);
						var13.b(rc.lf_h, -102).b(var5.S, -126);
						var14 = hc.int_nb + -1;
						if (dummy != 0) {
							var13.b(og.lf_o, -57).b(og.efs_c[var14].va_a.S, -118);
							--var14;
						}

						while (var14 >= 0) {
							var13.b(og.lf_o, -57).b(og.efs_c[var14].va_a.S, -118);
							--var14;
						}

						if (~var11 == -41) {
							var15 = var10[var8];
							var13.b(dg.lf_l, -56).b(fa.a((byte) 85, var15), -112);
						}

						if (ch.int_s != 0) {
							kd.a(fb.lf_h, false, de.a(new lf[]{rh.Y, var5.S}, 127), 0);
						}

						ah.a("CS2 - scr:" + var5.long_e + " op:" + var11 + new String(var13.c((byte) 62)), -111, var24);
					}
				}
			}
		} catch (RuntimeException var25) {
			throw ec.a(var25, "of.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static final lf a(byte var0, long var1) {
		int var10 = client.int_gc;

		try {
			++int_s;
			int var3 = -15 / ((var0 - 19) / 60);
			if (~var1 < -1L && var1 < 6582952005840035281L) {
				if (~(var1 % 37L) == -1L) {
					return null;
				} else {
					long var5 = var1;
					int var4 = 0;
					if (var10 != 0) {
						++var4;
						var5 = var1 / 37L;
					}

					while (~var5 != -1L) {
						++var4;
						var5 /= 37L;
					}

					byte[] var7 = new byte[var4];
					lf var12;
					if (var10 == 0 && ~var1 == -1L) {
						var12 = new lf();
						var12.Y = var7;
						var12.S = var7.length;
						return var12;
					} else {
						do {
							long var8 = var1;
							var1 /= 37L;
							--var4;
							var7[var4] = ld.Q[(int) (-(37L * var1) + var8)];
						} while (~var1 != -1L);

						var12 = new lf();
						var12.Y = var7;
						var12.S = var7.length;
						return var12;
					}
				}
			} else {
				return null;
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "of.A(" + var0 + ',' + var1 + ')');
		}
	}

	static {
		D = C;
		lf_q = A;
		lf_v = dd.a(")4lang)4de", 2);
	}
}
