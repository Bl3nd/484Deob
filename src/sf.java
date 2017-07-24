final class sf extends j {

	static lf Q;
	static lf R;
	private static lf S;
	static int T;
	private static lf U = dd.a("This world is full)3", 2);
	static int V;
	static lf tradereqFlag = dd.a(":tradereq:", 2);
	static int X;

	public sf() {
		super(1, true);
	}

	public static void e(int var0) {
		try {
			U = null;
			if (var0 != -2) {
				tradereqFlag = null;
			}

			S = null;
			R = null;
			Q = null;
			tradereqFlag = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sf.A(" + var0 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var9 = client.int_gc;

		try {
			if (var1 > -49) {
				U = null;
			}

			++T;
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int[][] var4 = this.a(false, var2, 0);
				int[] var5 = var4[0];
				int[] var7 = var4[2];
				int[] var6 = var4[1];
				int var8 = 0;
				if (var9 != 0 || var8 < ff.int_a) {
					do {
						var3[var8] = (var6[var8] + var5[var8] + var7[var8]) / 3;
						++var8;
					} while (var8 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var10) {
			throw ec.a(var10, "sf.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, vg[] var8, int var9) {
		int var41 = client.int_gc;

		try {
			b.c(var9, var0, var7, var2);
			nc.d();
			++X;
			if (var5 < -6) {
				int var10 = 0;
				if (var41 != 0 || ~var10 > ~var8.length) {
					do {
						vg var11 = var8[var10];
						if (var11 != null && (var11.int_bb == var1 || var1 == -1412584499 && (tg.W == var11 || var41 != 0))) {
							int var12;
							label864:
							{
								if (~var3 != 0) {
									var12 = var3;
									if (var41 == 0) {
										break label864;
									}
								}

								fi.ints_p[ma.int_h] = var6 + var11.int_k;
								cf.B[ma.int_h] = var4 + var11.int_rc;
								vg.Lc[ma.int_h] = var11.int_ob;
								gh.W[ma.int_h] = var11.Ib;
								var12 = ma.int_h++;
							}

							var11.int_bc = pd.int_i;
							var11.O = var12;
							if (!var11.Bc || !ma.a((byte) 4, var11)) {
								label948:
								{
									if (~var11.Xb < -1) {
										ph.a(-1753, var11);
									}

									int var15 = var11.N;
									int var13 = var11.int_k - -var6;
									int var14 = var4 + var11.int_rc;
									int var16;
									int var17;
									if (tg.W == var11) {
										if (~var1 != 1412584498 && !var11.boolean_tb) {
											mc.int_o = var4;
											c.U = var6;
											pf.V = var8;
											if (var41 == 0) {
												break label948;
											}
										}

										if (!var11.boolean_tb) {
											var15 = 128;
										}

										if (p.Hc && cf.L) {
											var16 = c.int_bb;
											var16 -= rd.G;
											var17 = lf.int_c;
											var17 -= ph.E;
											if (var17 < v.int_nb) {
												var17 = v.int_nb;
											}

											if (v.int_nb + ee.Q.Ib < var17 + var11.Ib) {
												var17 = ee.Q.Ib + v.int_nb - var11.Ib;
											}

											var14 = var17;
											if (c.V > var16) {
												var16 = c.V;
											}

											if (~(var11.int_ob + var16) < ~(ee.Q.int_ob + c.V)) {
												var16 = ee.Q.int_ob + c.V + -var11.int_ob;
											}

											var13 = var16;
										}
									}

									int var18;
									int var19;
									int var20;
									int var21;
									int var22;
									int var23;
									label856:
									{
										if (var11.int_ib != 2) {
											if (var11.int_ib == 9) {
												var20 = var13;
												var21 = var14;
												var22 = var13 - -var11.int_ob;
												if (~var22 > ~var13) {
													var20 = var22;
													var22 = var13;
												}

												var23 = var11.Ib + var14;
												++var22;
												var16 = ~var20 >= ~var9 ? var9 : var20;
												if (var23 < var14) {
													var21 = var23;
													var23 = var14;
												}

												var18 = ~var22 <= ~var7 ? var7 : var22;
												var17 = var0 < var21 ? var21 : var0;
												++var23;
												var19 = var2 <= var23 ? var2 : var23;
												if (var41 == 0) {
													break label856;
												}
											}

											var17 = ~var0 > ~var14 ? var14 : var0;
											var20 = var11.int_ob + var13;
											var16 = ~var13 < ~var9 ? var13 : var9;
											var18 = var7 <= var20 ? var7 : var20;
											var21 = var11.Ib + var14;
											var19 = var21 >= var2 ? var2 : var21;
											if (var41 == 0) {
												break label856;
											}
										}

										var18 = var7;
										var17 = var0;
										var19 = var2;
										var16 = var9;
									}

									if (!var11.Bc || ~var18 < ~var16 && (~var17 > ~var19 || var41 != 0)) {
										label967:
										{
											if (~var11.Xb != -1) {
												if (var11.Xb == 1337) {
													od.S = var13;
													gh.int_kb = var14;
													qh.a(var14, var11.int_ob, var11.Ib, false, var13);
													b.c(var9, var0, var7, var2);
													if (var41 == 0) {
														break label967;
													}
												}

												if (var11.Xb == 1338) {
													if (!var11.a((int) 122)) {
														break label967;
													}

													fd.a(var12, var13, var11, var14, (byte) 38);
													b.c(var9, var0, var7, var2);
													if (var41 == 0) {
														break label967;
													}
												}

												if (~var11.Xb == -1340) {
													if (!var11.a((int) 126)) {
														break label967;
													}

													hh.a(true, var12, var13, var14, var11);
													b.c(var9, var0, var7, var2);
													if (var41 == 0) {
														break label967;
													}
												}
											}

											var20 = c.int_bb;
											var21 = lf.int_c;
											if (!f.boolean_ab && var16 <= var20 && ~var21 <= ~var17 && ~var20 > ~var18 && ~var21 > ~var19) {
												w.a(100, var11, -var14 + var21, var20 + -var13);
											}

											if (var11.int_ib == 0) {
												if (!var11.Bc && ma.a((byte) -124, var11) && wg.vg_g != var11) {
													break label967;
												}

												if (!var11.Bc) {
													if (~(var11.G + -var11.Ib) > ~var11.Ac) {
														var11.Ac = var11.G + -var11.Ib;
													}

													if (var11.Ac < 0) {
														var11.Ac = 0;
													}
												}

												a(var17, var11.Z, var19, var12, -var11.Ac + var14, -114, var13 + -var11.int_c, var18, var8, var16);
												if (var11.Fb != null) {
													a(var17, var11.Z, var19, var12, var14 - var11.Ac, -25, -var11.int_c + var13, var18, var11.Fb, var16);
												}

												fi var43 = (fi) ma.eh_e.a((long) var11.Z, (byte) -111);
												if (var43 != null) {
													if (var43.x == 0 && ~c.int_bb <= ~var16 && ~var17 >= ~lf.int_c && c.int_bb < var18 && ~var19 < ~lf.int_c && !f.boolean_ab && !ra.Y) {
														d.Q[0] = 1001;
														qa.int_eb = 1;
														mc.z[0] = ff.lf_c;
														th.lfs_a[0] = sh.Gb;
													}

													ed.a(var14, var18, var12, var43.int_n, var16, (byte) 16, var17, var13, var19);
												}

												b.c(var9, var0, var7, var2);
												nc.d();
											}

											if (o.booleans_d[var12] || ~sg.int_a < -2) {
												if (var11.int_ib == 0 && !var11.Bc && var11.G > var11.Ib) {
													rf.a(var14, var11.Ac, var11.G, var11.int_ob + var13, (byte) 89, var11.Ib);
												}

												if (~var11.int_ib != -2) {
													label932:
													{
														int var24;
														int var25;
														int var26;
														int var29;
														int var32;
														int var33;
														int var34;
														int var48;
														int var50;
														if (~var11.int_ib == -3) {
															var22 = 0;
															var23 = 0;
															if (var41 != 0 || var11.Ib > var23) {
																do {
																	var24 = 0;
																	if (var41 == 0 && ~var11.int_ob >= ~var24) {
																		++var23;
																	} else {
																		do {
																			var26 = var23 * (var11.Dc + 32) + var14;
																			var25 = var13 + (32 + var11.int_m) * var24;
																			if (~var22 > -21) {
																				var26 += var11.ints_rb[var22];
																				var25 += var11.ints_db[var22];
																			}

																			label806:
																			{
																				if (var11.ints_gc[var22] > 0) {
																					boolean var27 = false;
																					boolean var28 = false;
																					var29 = var11.ints_gc[var22] - 1;
																					if ((~(var25 - -32) >= ~var9 || ~var7 >= ~var25 || ~var0 <= ~(32 + var26) || var2 <= var26) && (var11 != sh.vg_wb || var22 != ai.int_a)) {
																						break label806;
																					}

																					kf var30;
																					label957:
																					{
																						if (pa.int_u != 1 || ef.int_f != var22 || kb.int_h != var11.Z) {
																							var30 = bc.a(var11.Ub[var22], var29, 3153952, (byte) 123, 1, false);
																							if (var41 == 0) {
																								break label957;
																							}
																						}

																						var30 = bc.a(var11.Ub[var22], var29, 0, (byte) 126, 2, false);
																					}

																					if (var30 != null) {
																						if (sh.vg_wb != var11 || ai.int_a != var22) {
																							if (lc.y == var11 && ~var22 == ~hh.int_gb) {
																								var30.b(var25, var26, 128);
																								if (var41 == 0) {
																									break label806;
																								}
																							}

																							var30.a(var25, var26);
																							if (var41 == 0) {
																								break label806;
																							}
																						}

																						var48 = c.int_bb + -ga.int_c;
																						var50 = -e.int_n + lf.int_c;
																						if (var48 < 5 && var48 > -5) {
																							var48 = 0;
																						}

																						if (~var50 > -6 && var50 > -5) {
																							var50 = 0;
																						}

																						if (~rg.int_e > -6) {
																							var48 = 0;
																							var50 = 0;
																						}

																						var30.b(var25 + var48, var26 - -var50, 128);
																						if (~var1 == 0) {
																							break label806;
																						}

																						vg var31 = var8[var1 & '\uffff'];
																						var32 = b.H;
																						var33 = b.L;
																						if (~var32 < ~(var26 - -var50) && var31.Ac > 0) {
																							var34 = (-var50 + var32 - var26) * v.int_tb / 3;
																							if (~var34 < ~(v.int_tb * 10)) {
																								var34 = 10 * v.int_tb;
																							}

																							if (~var31.Ac > ~var34) {
																								var34 = var31.Ac;
																							}

																							var31.Ac -= var34;
																							e.int_n += var34;
																							mc.a(var31, -23101);
																						}

																						if (var33 >= var50 + (var26 - -32) || var31.Ac >= -var31.Ib + var31.G) {
																							break label806;
																						}

																						var34 = (var50 + (var26 + 32 - var33)) * v.int_tb / 3;
																						if (var34 > v.int_tb * 10) {
																							var34 = 10 * v.int_tb;
																						}

																						if (~(-var31.Ac + (var31.G - var31.Ib)) > ~var34) {
																							var34 = var31.G - (var31.Ib - -var31.Ac);
																						}

																						var31.Ac += var34;
																						e.int_n -= var34;
																						mc.a(var31, -23101);
																						if (var41 == 0) {
																							break label806;
																						}
																					}

																					mc.a(var11, -23101);
																					if (var41 == 0) {
																						break label806;
																					}
																				}

																				if (var11.ints_hc != null && var22 < 20) {
																					label749:
																					{
																						kf var52 = var11.b(var22, true);
																						if (var52 == null) {
																							if (!hg.boolean_o) {
																								break label749;
																							}

																							mc.a(var11, -23101);
																							if (var41 == 0) {
																								break label749;
																							}
																						}

																						var52.a(var25, var26);
																					}
																				}
																			}

																			++var22;
																			++var24;
																		} while (~var11.int_ob < ~var24);

																		++var23;
																	}
																} while (var11.Ib > var23);
															}

															if (var41 == 0) {
																break label932;
															}
														}

														if (var11.int_ib == 3) {
															label740:
															{
																if (!cb.a(var11, 0)) {
																	var22 = var11.C;
																	if (var11 != wg.vg_g || var11.y == 0) {
																		break label740;
																	}

																	var22 = var11.y;
																	if (var41 == 0) {
																		break label740;
																	}
																}

																var22 = var11.Y;
																if (var11 == wg.vg_g && ~var11.Qb != -1) {
																	var22 = var11.Qb;
																}
															}

															if (var15 != 0) {
																if (var11.boolean_nc) {
																	b.a(var13, var14, var11.int_ob, var11.Ib, var22, -(255 & var15) + 256);
																	if (var41 == 0) {
																		break label932;
																	}
																}

																b.c(var13, var14, var11.int_ob, var11.Ib, var22, -(255 & var15) + 256);
																if (var41 == 0) {
																	break label932;
																}
															}

															if (!var11.boolean_nc) {
																b.c(var13, var14, var11.int_ob, var11.Ib, var22);
																if (var41 == 0) {
																	break label932;
																}
															}

															b.e(var13, var14, var11.int_ob, var11.Ib, var22);
															if (var41 == 0) {
																break label932;
															}
														}

														db var46;
														if (var11.int_ib == 4) {
															var46 = var11.a(false, pf.dfs_bb);
															if (var46 == null) {
																if (!hg.boolean_o) {
																	break label932;
																}

																mc.a(var11, -23101);
																if (var41 == 0) {
																	break label932;
																}
															}

															lf var44;
															label728:
															{
																var44 = var11.Fc;
																if (cb.a(var11, 0)) {
																	var23 = var11.Y;
																	if (wg.vg_g == var11 && var11.Qb != 0) {
																		var23 = var11.Qb;
																	}

																	if (~var11.Bb.e(-30593) >= -1) {
																		break label728;
																	}

																	var44 = var11.Bb;
																	if (var41 == 0) {
																		break label728;
																	}
																}

																var23 = var11.C;
																if (var11 == wg.vg_g && ~var11.y != -1) {
																	var23 = var11.y;
																}
															}

															if (var11.Bc && ~var11.int_j != 0) {
																ie var45 = ng.a(var11.int_j, (int) -4);
																var44 = var45.U;
																if (var44 == null) {
																	var44 = dc.Y;
																}

																if ((~var45.L == -2 || var11.int_b != 1) && var11.int_b != -1) {
																	var44 = de.a(new lf[]{ia.lf_b, var44, sh.lf_sb, wd.c(27, var11.int_b)}, 120);
																}
															}

															if (var11 == rb.vg_d) {
																var44 = og.lf_i;
																var23 = var11.C;
															}

															if (!var11.Bc) {
																var44 = nd.a(var11, 1024, var44);
															}

															var46.a(var44, var13, var14, var11.int_ob, var11.Ib, var23, !var11.Rb ? -1 : 0, var11.int_n, var11.int_v, var11.xc);
															if (var41 == 0) {
																break label932;
															}
														}

														if (~var11.int_ib == -6) {
															kf var47;
															if (!var11.Bc) {
																var47 = var11.a(126, cb.a(var11, 0));
																if (var47 != null) {
																	var47.a(var13, var14);
																	if (var41 == 0) {
																		break label932;
																	}
																}

																if (!hg.boolean_o) {
																	break label932;
																}

																mc.a(var11, -23101);
																if (var41 == 0) {
																	break label932;
																}
															}

															label709:
															{
																if (var11.int_j != -1) {
																	var47 = bc.a(var11.int_b, var11.int_j, var11.int_ic, (byte) 127, var11.int_kc, false);
																	if (var41 == 0) {
																		break label709;
																	}
																}

																var47 = var11.a(122, false);
															}

															if (var47 == null) {
																if (!hg.boolean_o) {
																	break label932;
																}

																mc.a(var11, -23101);
																if (var41 == 0) {
																	break label932;
																}
															}

															var23 = var47.T;
															var24 = var47.R;
															if (var11.E) {
																b.d(var13, var14, var11.int_ob + var13, var11.Ib + var14);
																var25 = (var11.int_ob + -1 + var23) / var23;
																var26 = (-1 + var24 + var11.Ib) / var24;
																var48 = 0;
																if (var41 != 0 || var25 > var48) {
																	do {
																		var50 = 0;
																		if (var41 == 0 && ~var50 <= ~var26) {
																			++var48;
																		} else {
																			do {
																				label680:
																				{
																					if (var11.V == 0) {
																						if (var15 == 0) {
																							var47.a(var48 * var23 + var13, var14 - -(var50 * var24));
																							if (var41 == 0) {
																								break label680;
																							}
																						}

																						var47.b(var13 - -(var48 * var23), var14 + var50 * var24, 256 + -(255 & var15));
																						if (var41 == 0) {
																							break label680;
																						}
																					}

																					var47.g(var23 / 2 + var23 * var48 + var13, var24 / 2 + var50 * var24 + var14, var11.V, 4096);
																				}

																				++var50;
																			} while (~var50 > ~var26);

																			++var48;
																		}
																	} while (var25 > var48);
																}

																b.c(var9, var0, var7, var2);
																if (var41 == 0) {
																	break label932;
																}
															}

															var25 = var11.int_ob * 4096 / var23;
															if (var11.V != 0) {
																var47.g(var11.int_ob / 2 + var13, var14 + var11.Ib / 2, var11.V, var25);
																if (var41 == 0) {
																	break label932;
																}
															}

															if (~var15 == -1) {
																if (~var11.int_ob != ~var23 || var11.Ib != var24) {
																	var47.f(var13, var14, var11.int_ob, var11.Ib);
																	if (var41 == 0) {
																		break label932;
																	}
																}

																var47.a(var13, var14);
																if (var41 == 0) {
																	break label932;
																}
															}

															var47.f(var13, var14, var11.int_ob, var11.Ib, 256 + -(var15 & 255));
															if (var41 == 0) {
																break label932;
															}
														}

														ie var55;
														if (var11.int_ib == 6) {
															ue var49;
															boolean var51;
															label661:
															{
																var51 = cb.a(var11, 0);
																var49 = null;
																if (!var51) {
																	var23 = var11.Db;
																	if (var41 == 0) {
																		break label661;
																	}
																}

																var23 = var11.Q;
															}

															var25 = 0;
															if (var11.int_j == -1) {
																if (~var11.Eb == -6) {
																	if (var11.int_mc != -1) {
																		var26 = 2047 & var11.int_mc;
																		if (fh.int_d == var26) {
																			var26 = 2047;
																		}

																		u var56 = w.us_e[var26];
																		bi var57 = var23 != -1 ? client.a(12, var23) : null;
																		if (var56 != null && (int) var56.Dc.a(false) << 852622507 == (-2048 & var11.int_mc)) {
																			var49 = var56.be_id.a(0, var11.int_uc, var57, (bi) null, (byte) 48);
																		}
																	} else {
																		var49 = pe.be_c.a(-1, -1, (bi) null, (bi) null, (byte) 48);
																	}
																} else if (~var23 == 0) {
																	var49 = var11.a(var51, -1, r.X.be_id, (byte) 124, (bi) null);
																	if (var49 == null && hg.boolean_o) {
																		mc.a(var11, -23101);
																	}
																} else {
																	bi var54 = client.a(12, var23);
																	var49 = var11.a(var51, var11.int_uc, r.X.be_id, (byte) 101, var54);
																	if (var49 == null && hg.boolean_o) {
																		mc.a(var11, -23101);
																	}
																}
															} else {
																var55 = ng.a(var11.int_j, (int) -4);
																if (var55 != null) {
																	label654:
																	{
																		var55 = var55.a(var11.int_b, 10);
																		var49 = var55.a(-83, (bi) null, 0, 1);
																		if (var49 == null) {
																			mc.a(var11, -23101);
																			if (var41 == 0) {
																				break label654;
																			}
																		}

																		var49.a();
																		var25 = -var49.T / 2;
																	}
																}
															}

															if (var49 == null) {
																break label932;
															}

															label648:
															{
																nc.b(var11.int_ob / 2 + var13 + var11.int_i, var11.int_ab + var11.Ib / 2 + var14);
																var26 = var11.Tb * nc.X[var11.int_gb] >> -1119725648;
																var48 = nc.ints_bb[var11.int_gb] * var11.Tb >> -1419436528;
																if (var11.Bc) {
																	if (var11.M) {
																		var49.b(0, var11.Ab, var11.Ob, var11.int_gb, var11.int_kb, var11.P + var26 + var25, var11.P + var48, var11.Tb);
																		if (var41 == 0) {
																			break label648;
																		}
																	}

																	var49.a(0, var11.Ab, var11.Ob, var11.int_gb, var11.int_kb, var26 + var25 + var11.P, var48 - -var11.P);
																	if (var41 == 0) {
																		break label648;
																	}
																}

																var49.a(0, var11.Ab, 0, var11.int_gb, 0, var26, var48);
															}

															nc.e();
															if (var41 == 0) {
																break label932;
															}
														}

														if (var11.int_ib == 7) {
															var46 = var11.a(false, pf.dfs_bb);
															if (var46 == null) {
																if (!hg.boolean_o) {
																	break label932;
																}

																mc.a(var11, -23101);
																if (var41 == 0) {
																	break label932;
																}
															}

															var23 = 0;
															var24 = 0;
															if (var41 != 0 || ~var24 > ~var11.Ib) {
																do {
																	var25 = 0;
																	if (var41 == 0 && ~var11.int_ob >= ~var25) {
																		++var24;
																	} else {
																		do {
																			if (~var11.ints_gc[var23] < -1) {
																				label910:
																				{
																					lf var58;
																					label615:
																					{
																						var55 = ng.a(-1 + var11.ints_gc[var23], (int) -4);
																						if (var55.L != 1 && ~var11.Ub[var23] == -2) {
																							var58 = de.a(new lf[]{ia.lf_b, var55.U, hc.lf_mb}, 118);
																							if (var41 == 0) {
																								break label615;
																							}
																						}

																						var58 = de.a(new lf[]{ia.lf_b, var55.U, sh.lf_sb, wd.c(117, var11.Ub[var23])}, -21);
																					}

																					var29 = (12 - -var11.Dc) * var24 + var14;
																					var50 = (115 + var11.int_m) * var25 + var13;
																					if (~var11.int_n != -1) {
																						if (~var11.int_n != -2) {
																							var46.b(var58, -1 + var11.int_ob + var50, var29, var11.C, !var11.Rb ? -1 : 0);
																							if (var41 == 0) {
																								break label910;
																							}
																						}

																						var46.c(var58, var50 - -(var11.int_ob / 2), var29, var11.C, !var11.Rb ? -1 : 0);
																						if (var41 == 0) {
																							break label910;
																						}
																					}

																					var46.a(var58, var50, var29, var11.C, !var11.Rb ? -1 : 0);
																				}
																			}

																			++var23;
																			++var25;
																		} while (~var11.int_ob < ~var25);

																		++var24;
																	}
																} while (~var24 > ~var11.Ib);
															}
														}

														int var59;
														if (~var11.int_ib == -9 && var11 == jg.vg_p && ~sh.int_ub == ~ua.M) {
															var22 = 0;
															var23 = 0;
															db var62 = jg.db_r;
															lf var53 = var11.Fc;
															var53 = nd.a(var11, 1024, var53);
															lf var60;
															if (var41 != 0 || var53.e(-30593) > 0) {
																do {
																	label586:
																	{
																		var48 = var53.c(wh.lf_n, 87);
																		if (~var48 != 0) {
																			var60 = var53.a(var48, (int) 0, 73);
																			var53 = var53.c(-41, var48 - -4);
																			if (var41 == 0) {
																				break label586;
																			}
																		}

																		var60 = var53;
																		var53 = sh.Gb;
																	}

																	var50 = var62.b(var60);
																	var23 += 1 + var62.Z;
																	if (~var50 < ~var22) {
																		var22 = var50;
																	}
																} while (var53.e(-30593) > 0);
															}

															var23 += 7;
															var22 += 6;
															var48 = -var22 + -5 + var11.int_ob + var13;
															var50 = 5 + var14 - -var11.Ib;
															if (~(var50 + var23) < ~var2) {
																var50 = -var23 + var2;
															}

															if (~(5 + var13) < ~var48) {
																var48 = var13 - -5;
															}

															if (~var7 > ~(var22 + var48)) {
																var48 = -var22 + var7;
															}

															b.e(var48, var50, var22, var23, 16777120);
															b.c(var48, var50, var22, var23, 0);
															var29 = 2 + var62.Z + var50;
															var53 = var11.Fc;
															var53 = nd.a(var11, 1024, var53);
															if (var41 != 0 || var53.e(-30593) > 0) {
																do {
																	label567:
																	{
																		var59 = var53.c(wh.lf_n, 116);
																		if (var59 != -1) {
																			var60 = var53.a(var59, (int) 0, 49);
																			var53 = var53.c(-41, 4 + var59);
																			if (var41 == 0) {
																				break label567;
																			}
																		}

																		var60 = var53;
																		var53 = sh.Gb;
																	}

																	var62.a(var60, var48 + 3, var29, 0, -1);
																	var29 += 1 + var62.Z;
																} while (var53.e(-30593) > 0);
															}
														}

														if (var11.int_ib == 9) {
															label941:
															{
																if (var11.int_tc == 1) {
																	b.a(var13, var14, var11.int_ob + var13, var11.Ib + var14, var11.C);
																	if (var41 == 0) {
																		break label941;
																	}
																}

																var23 = var11.Ib < 0 ? -var11.Ib : var11.Ib;
																var22 = var11.int_ob >= 0 ? var11.int_ob : -var11.int_ob;
																var24 = var22;
																if (var23 > var22) {
																	var24 = var23;
																}

																if (var24 != 0) {
																	label557:
																	{
																		var25 = (var11.int_ob << -1499455696) / var24;
																		var26 = (var11.Ib << 1705833776) / var24;
																		if (var25 >= var26) {
																			var25 = -var25;
																			if (var41 == 0) {
																				break label557;
																			}
																		}

																		var26 = -var26;
																	}

																	var48 = var26 * var11.int_tc >> 1542896529;
																	var50 = var26 * var11.int_tc - -1 >> -1048661903;
																	var29 = var25 * var11.int_tc >> 1238674289;
																	var59 = 1 + var25 * var11.int_tc >> 733013489;
																	int var61 = -var9 + var13;
																	int var35 = -var50 + var61 - -var11.int_ob;
																	var33 = var48 + var61;
																	var32 = -var0 + var14;
																	int var36 = var48 + var11.int_ob + var61;
																	int var37 = var29 + var32;
																	var34 = -var50 + var61;
																	int var38 = var32 + -var59;
																	int var39 = var32 + (var11.Ib - var59);
																	int var40 = var11.Ib + var32 + var29;
																	nc.a(var33, var34, var35);
																	nc.a(var37, var38, var39, var33, var34, var35, var11.C);
																	nc.a(var33, var35, var36);
																	nc.a(var37, var39, var40, var33, var35, var36, var11.C);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

						++var10;
					} while (~var10 > ~var8.length);

				}
			}
		} catch (RuntimeException var42) {
			throw ec.a(var42, "sf.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + (var8 != null ? "{...}" : "null") + ',' + var9 + ')');
		}
	}

	static {
		R = U;
		V = 0;
		S = dd.a("Please enter your password)3", 2);
		Q = S;
	}
}
