class hb {

	static lf lf_a = dd.a("<col=ffff00>*V", 2);
	static int int_b;
	static bg bg_c;
	static int int_d;
	long long_e;
	hb hb_f;
	static int int_g = -1;
	static int int_h;
	hb hb_i;
	static int int_j;
	private static lf lf_k = dd.a("Loaded textures", 2);
	static lf lf_l;
	static lf lf_m;

	public static void a(byte var0) {
		try {
			lf_l = null;
			lf_a = null;
			if (var0 < 116) {
				a((byte) -96);
			}

			bg_c = null;
			lf_k = null;
			lf_m = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hb.BC(" + var0 + ')');
		}
	}

	final boolean b(byte var1) {
		try {
			++int_b;
			if (var1 != -8) {
				this.hb_i = null;
			}

			return this.hb_f != null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hb.WB(" + var1 + ')');
		}
	}

	final void a(boolean var1) {
		try {
			++int_d;
			if (!var1) {
				this.b((byte) -53);
			}

			if (this.hb_f != null) {
				this.hb_f.hb_i = this.hb_i;
				this.hb_i.hb_f = this.hb_f;
				this.hb_i = null;
				this.hb_f = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "hb.VB(" + var1 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, vg[] var5, int var6, int var7, int var8) {
		int var24 = client.int_gc;

		try {
			if (var2 >= -35) {
				a(-100, 97, -35, -93, 19, null, 3, 11, -55);
			}

			++int_h;
			int var9 = 0;
			if (var24 != 0 || var5.length > var9) {
				do {
					vg var10 = var5[var9];
					if (var10 != null && (!var10.Bc || ~var10.int_ib == -1 || var10.xb || ~ne.a(var10, 101) != -1 || ee.Q == var10 || var10.Xb == 1338) && var7 == var10.int_bb && (!var10.Bc || !ma.a((byte) 20, var10))) {
						int var11 = var10.int_k - -var8;
						int var12 = var10.int_rc - -var4;
						if (var10 == tg.W) {
							int_g = var12;
							fa.Q = true;
							p.Dc = var11;
						}

						int var13;
						int var14;
						int var15;
						int var16;
						int var20;
						label452:
						{
							if (var10.int_ib != 2) {
								int var17;
								int var18;
								if (var10.int_ib != 9) {
									var13 = var11 <= var6 ? var6 : var11;
									var14 = ~var12 >= ~var3 ? var3 : var12;
									var18 = var12 - -var10.Ib;
									var17 = var11 + var10.int_ob;
									var15 = ~var1 >= ~var17 ? var1 : var17;
									var16 = var0 > var18 ? var18 : var0;
									if (var24 == 0) {
										break label452;
									}
								}

								var17 = var11;
								var18 = var12;
								var20 = var12 - -var10.Ib;
								int var19 = var10.int_ob + var11;
								if (~var11 < ~var19) {
									var17 = var19;
									var19 = var11;
								}

								if (var20 < var12) {
									var18 = var20;
									var20 = var12;
								}

								++var19;
								++var20;
								var13 = var6 >= var17 ? var6 : var17;
								var15 = var19 < var1 ? var19 : var1;
								var16 = ~var20 > ~var0 ? var20 : var0;
								var14 = var18 <= var3 ? var3 : var18;
								if (var24 == 0) {
									break label452;
								}
							}

							var16 = var0;
							var13 = var6;
							var14 = var3;
							var15 = var1;
						}

						if (!var10.Bc || var15 > var13 && (~var16 < ~var14 || var24 != 0)) {
							label589:
							{
								if (var10.Xb == 1337) {
									mc.a(var10, -23101);
									if (var24 == 0) {
										break label589;
									}
								}

								if (~var10.int_ib == -1) {
									if (!var10.Bc && ma.a((byte) -121, var10) && wg.vg_g != var10) {
										break label589;
									}

									a(var16, var15, -65, var14, var12 - var10.Ac, var5, var13, var10.Z, var11 + -var10.int_c);
									if (var10.Fb != null) {
										a(var16, var15, -83, var14, -var10.Ac + var12, var10.Fb, var13, var10.Z, var11 + -var10.int_c);
									}

									fi var26 = (fi) ma.eh_e.a((long) var10.Z, (byte) -101);
									if (var26 != null) {
										la.a(var11, (byte) 117, var16, var14, var13, var15, var12, var26.int_n);
									}
								}

								if (var10.Bc) {
									boolean var27;
									label582:
									{
										if (c.int_bb < var13 || ~var14 < ~lf.int_c || var15 <= c.int_bb || ~var16 >= ~lf.int_c) {
											var27 = false;
											if (var24 == 0) {
												break label582;
											}
										}

										var27 = true;
									}

									boolean var28 = false;
									if (wd.int_eb == 1 && var27) {
										var28 = true;
									}

									boolean var29 = false;
									if (~h.int_b == -2 && var13 <= nh.int_mb && var14 <= gg.int_o && nh.int_mb < var15 && var16 > gg.int_o) {
										var29 = true;
									}

									if (var10.Xb == 1338) {
										if (!var29) {
											break label589;
										}

										fi.a(-var12 + gg.int_o, var10, -var11 + nh.int_mb, (byte) 100);
										if (var24 == 0) {
											break label589;
										}
									}

									if (var29) {
										i.a(gg.int_o - var12, var10, nh.int_mb - var11, (byte) 89);
									}

									if (tg.W != null && var10 != tg.W && var27 && eh.a(1, ne.a(var10, 110))) {
										eg.vg_a = var10;
									}

									if (ee.Q == var10) {
										v.int_nb = var12;
										cf.L = true;
										c.V = var11;
									}

									if (var10.xb) {
										id var30;
										if (var27 && ee.Y != 0 && var10.objects_sc != null) {
											var30 = new id();
											var30.int_r = ee.Y;
											var30.objects_t = var10.objects_sc;
											var30.vg_o = var10;
											tb.V.a(var30, 0);
										}

										if (tg.W != null || sh.vg_wb != null || f.boolean_ab) {
											var29 = false;
											var27 = false;
											var28 = false;
										}

										if (!var10.yc && var29) {
											var10.yc = true;
											if (var10.yb != null) {
												var30 = new id();
												var30.vg_o = var10;
												var30.int_r = gg.int_o + -var12;
												var30.G = -var11 + nh.int_mb;
												var30.objects_t = var10.yb;
												tb.V.a(var30, (int) 0);
											}
										}

										if (var10.yc && var28 && var10.objects_pb != null) {
											var30 = new id();
											var30.objects_t = var10.objects_pb;
											var30.G = -var11 + c.int_bb;
											var30.vg_o = var10;
											var30.int_r = -var12 + lf.int_c;
											tb.V.a(var30, (int) 0);
										}

										if (var10.yc && !var28) {
											var10.yc = false;
											if (var10.objects_sb != null) {
												var30 = new id();
												var30.G = c.int_bb + -var11;
												var30.objects_t = var10.objects_sb;
												var30.int_r = -var12 + lf.int_c;
												var30.vg_o = var10;
												wh.tf_k.a(var30, (int) 0);
											}
										}

										if (var28 && var10.Yb != null) {
											var30 = new id();
											var30.int_r = -var12 + lf.int_c;
											var30.vg_o = var10;
											var30.G = c.int_bb + -var11;
											var30.objects_t = var10.Yb;
											tb.V.a(var30, (int) 0);
										}

										if (!var10.K && var27) {
											var10.K = true;
											if (var10.I != null) {
												var30 = new id();
												var30.G = c.int_bb + -var11;
												var30.objects_t = var10.I;
												var30.int_r = -var12 + lf.int_c;
												var30.vg_o = var10;
												tb.V.a(var30, (int) 0);
											}
										}

										if (var10.K && var27 && var10.objects_u != null) {
											var30 = new id();
											var30.vg_o = var10;
											var30.int_r = lf.int_c + -var12;
											var30.objects_t = var10.objects_u;
											var30.G = c.int_bb - var11;
											tb.V.a(var30, (int) 0);
										}

										if (var10.K && !var27) {
											var10.K = false;
											if (var10.objects_lb != null) {
												var30 = new id();
												var30.vg_o = var10;
												var30.int_r = lf.int_c + -var12;
												var30.G = -var11 + c.int_bb;
												var30.objects_t = var10.objects_lb;
												wh.tf_k.a(var30, (int) 0);
											}
										}

										if (var10.Cc != null) {
											var30 = new id();
											var30.vg_o = var10;
											var30.objects_t = var10.Cc;
											lf.tf_v.a(var30, (int) 0);
										}

										int var21;
										int var22;
										id var23;
										if (var10.F != null && ~var10.x > ~ga.int_d) {
											label583:
											{
												if (var10.X == null || ~(ga.int_d + -var10.x) < -33) {
													var30 = new id();
													var30.objects_t = var10.F;
													var30.vg_o = var10;
													tb.V.a(var30, (int) 0);
													if (var24 == 0) {
														break label583;
													}
												}

												var20 = var10.x;
												if (var24 != 0 || ~var20 > ~ga.int_d) {
													label401:
													do {
														var21 = se.ints_hb[31 & var20];
														var22 = 0;
														if (var24 == 0 && var10.X.length <= var22) {
															++var20;
														} else {
															do {
																if (~var21 == ~var10.X[var22]) {
																	var23 = new id();
																	var23.vg_o = var10;
																	var23.objects_t = var10.F;
																	tb.V.a(var23, (int) 0);
																	if (var24 == 0) {
																		break label401;
																	}
																}

																++var22;
															} while (var10.X.length > var22);

															++var20;
														}
													} while (~var20 > ~ga.int_d);
												}
											}

											var10.x = ga.int_d;
										}

										if (var10.Hc != null && ~p.Ec < ~var10.Ec) {
											label585:
											{
												if (var10.ints_p == null || -var10.Ec + p.Ec > 32) {
													var30 = new id();
													var30.objects_t = var10.Hc;
													var30.vg_o = var10;
													tb.V.a(var30, (int) 0);
													if (var24 == 0) {
														break label585;
													}
												}

												var20 = var10.Ec;
												if (var24 != 0 || var20 < p.Ec) {
													label367:
													do {
														var21 = hh.ints_db[31 & var20];
														var22 = 0;
														if (var24 == 0 && var10.ints_p.length <= var22) {
															++var20;
														} else {
															do {
																if (~var21 == ~var10.ints_p[var22]) {
																	var23 = new id();
																	var23.objects_t = var10.Hc;
																	var23.vg_o = var10;
																	tb.V.a(var23, (int) 0);
																	if (var24 == 0) {
																		break label367;
																	}
																}

																++var22;
															} while (var10.ints_p.length > var22);

															++var20;
														}
													} while (var20 < p.Ec);
												}
											}

											var10.Ec = p.Ec;
										}

										if (var10.objects_oc != null && var10.Zb < lc.int_r) {
											label587:
											{
												if (var10.ints_mb == null || ~(-var10.Zb + lc.int_r) < -33) {
													var30 = new id();
													var30.vg_o = var10;
													var30.objects_t = var10.objects_oc;
													tb.V.a(var30, (int) 0);
													if (var24 == 0) {
														break label587;
													}
												}

												var20 = var10.Zb;
												if (var24 != 0 || ~var20 > ~lc.int_r) {
													label333:
													do {
														var21 = jf.J[31 & var20];
														var22 = 0;
														if (var24 == 0 && ~var10.ints_mb.length >= ~var22) {
															++var20;
														} else {
															do {
																if (var21 == var10.ints_mb[var22]) {
																	var23 = new id();
																	var23.vg_o = var10;
																	var23.objects_t = var10.objects_oc;
																	tb.V.a(var23, (int) 0);
																	if (var24 == 0) {
																		break label333;
																	}
																}

																++var22;
															} while (~var10.ints_mb.length < ~var22);

															++var20;
														}
													} while (~var20 > ~lc.int_r);
												}
											}

											var10.Zb = lc.int_r;
										}

										if (var10.Nb < tg.T && var10.Sb != null) {
											var30 = new id();
											var30.objects_t = var10.Sb;
											var30.vg_o = var10;
											tb.V.a(var30, (int) 0);
										}

										if (~ld.int_db < ~var10.Nb && var10.objects_qc != null) {
											var30 = new id();
											var30.objects_t = var10.objects_qc;
											var30.vg_o = var10;
											tb.V.a(var30, (int) 0);
										}

										if (~re.int_c < ~var10.Nb && var10.objects_wb != null) {
											var30 = new id();
											var30.vg_o = var10;
											var30.objects_t = var10.objects_wb;
											tb.V.a(var30, (int) 0);
										}

										if (var10.Nb < ph.A && var10.T != null) {
											var30 = new id();
											var30.vg_o = var10;
											var30.objects_t = var10.T;
											tb.V.a(var30, (int) 0);
										}

										if (~var10.Nb > ~kd.int_db && var10.objects_q != null) {
											var30 = new id();
											var30.objects_t = var10.objects_q;
											var30.vg_o = var10;
											tb.V.a(var30, (int) 0);
										}

										var10.Nb = hf.int_p;
										if (var10.Mb != null) {
											var20 = 0;
											if (var24 != 0 || var20 < eg.int_g) {
												do {
													id var31 = new id();
													var31.vg_o = var10;
													var31.J = cc.ints_bb[var20];
													var31.int_v = vh.ints_j[var20];
													var31.objects_t = var10.Mb;
													tb.V.a(var31, (int) 0);
													++var20;
												} while (var20 < eg.int_g);
											}
										}
									}
								}

								if (!var10.Bc) {
									if (tg.W != null || sh.vg_wb != null || f.boolean_ab) {
										return;
									}

									if ((~var10.Pb <= -1 || var10.y != 0) && ~var13 >= ~c.int_bb && ~lf.int_c <= ~var14 && c.int_bb < var15 && ~lf.int_c > ~var16) {
										label457:
										{
											if (~var10.Pb <= -1) {
												wg.vg_g = var5[var10.Pb];
												if (var24 == 0) {
													break label457;
												}
											}

											wg.vg_g = var10;
										}
									}

									if (var10.int_ib == 8 && ~var13 >= ~c.int_bb && ~var14 >= ~lf.int_c && ~c.int_bb > ~var15 && ~lf.int_c > ~var16) {
										jg.vg_p = var10;
									}

									if (~var10.G < ~var10.Ib) {
										q.a(var10.G, true, c.int_bb, var10.Ib, var10, var10.int_ob + var11, var12, lf.int_c);
									}
								}
							}
						}
					}

					++var9;
				} while (var5.length > var9);

			}
		} catch (RuntimeException var25) {
			throw ec.a(var25, "hb.UB(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + var8 + ')');
		}
	}

	static final void a(lb[] var0, byte var1) {
		int dummy = client.int_gc;

		try {
			++int_j;
			int var2 = 0;
			int var3;
			int var4;
			int var5;
			while (var2 < 4) {
				var3 = 0;
				if (var3 >= 104) {
					++var2;
				} else {
					do {
						var4 = 0;
						if (var4 >= 104) {
							++var3;
						} else {
							do {
								if ((jc.bytes_q[var2][var3][var4] & 1) == 1) {
									var5 = var2;
									if ((jc.bytes_q[1][var3][var4] & 2) == 2) {
										var5 = var2 - 1;
									}

									if (var5 >= 0) {
										var0[var5].a(var1 ^ -2097263, var3, var4);
									}
								}

								++var4;
							} while (var4 < 104);

							++var3;
						}
					} while (var3 < 104);

					++var2;
				}
			}

			wa.Jb += (int) (5.0D * Math.random()) - 2;
			ib.int_f += -2 + (int) (5.0D * Math.random());
			if (wa.Jb < -16) {
				wa.Jb = -16;
			}

			if (wa.Jb > 16) {
				wa.Jb = 16;
			}

			int[][] var41 = new int[104][104];
			var4 = wa.Jb >> 1;
			if (ib.int_f < -8) {
				ib.int_f = -8;
			}

			int[][] var6 = new int[104][104];
			if (ib.int_f > 8) {
				ib.int_f = 8;
			}

			var3 = ib.int_f >> 2 << 10;
			int var7 = 0;
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var42;
			int var43;
			int var44;
			short var48;
			if (var7 >= 4) {
				kh.c(-50, -10, -50);
				var42 = 0;
				if (var42 < 104) {
					do {
						var43 = 0;
						if (~var43 <= -105) {
							++var42;
						} else {
							do {
								if ((2 & jc.bytes_q[1][var42][var43]) == 2) {
									fi.a(var42, var43);
								}

								++var43;
							} while (~var43 > -105);

							++var42;
						}
					} while (var42 < 104);
				}

				var43 = 1;
				var44 = 2;
				var11 = 4;
				var12 = 0;
				if (dummy == 0 && ~var12 <= -5) {
					if (var1 != -111) {
						bg_c = null;
					}
				} else {
					do {
						if (var12 > 0) {
							var44 <<= 3;
							var43 <<= 3;
							var11 <<= 3;
						}

						var13 = 0;
						if (dummy == 0 && ~var12 > ~var13) {
							++var12;
						} else {
							do {
								var14 = 0;
								if (dummy == 0 && var14 > 104) {
									++var13;
								} else {
									do {
										var15 = 0;
										if (dummy == 0 && var15 > 104) {
											++var14;
										} else {
											do {
												if (~(var43 & uc.Hb[var13][var15][var14]) != -1) {
													var16 = var14;
													if (dummy != 0) {
														var16 = var14 - 1;
													}

													while (~var16 < -1 && ~(uc.Hb[var13][var15][-1 + var16] & var43) != -1) {
														--var16;
													}

													var17 = var14;
													if (dummy != 0) {
														var17 = var14 + 1;
													}

													while (var17 < 104 && ~(var43 & uc.Hb[var13][var15][1 + var17]) != -1) {
														++var17;
													}

													var18 = var13;
													if (dummy != 0 || ~var13 < -1) {
														label1220:
														do {
															var20 = var16;
															if (dummy == 0 && var17 < var16) {
																--var18;
															} else {
																do {
																	if ((uc.Hb[-1 + var18][var15][var20] & var43) == 0 && dummy == 0) {
																		break label1220;
																	}

																	++var20;
																} while (var17 >= var20);

																--var18;
															}
														} while (~var18 < -1);
													}

													var19 = var13;
													if (dummy != 0 || ~var13 > ~var12) {
														label1258:
														do {
															var20 = var16;
															if (dummy == 0 && var17 < var16) {
																++var19;
															} else {
																do {
																	if (~(uc.Hb[var19 + 1][var15][var20] & var43) == -1 && dummy == 0) {
																		break label1258;
																	}

																	++var20;
																} while (var17 >= var20);

																++var19;
															}
														} while (~var19 > ~var12);
													}

													var20 = (1 + var19 + -var18) * (1 + -var16 + var17);
													if (~var20 <= -9) {
														var48 = 240;
														var22 = -var48 + u.vertexHeights[var19][var15][var16];
														var23 = u.vertexHeights[var18][var15][var16];
														ac.b(var12, 1, 128 * var15, 128 * var15, 128 * var16, var17 * 128 + 128, var22, var23);
														var24 = var18;
														if (dummy != 0 || ~var18 >= ~var19) {
															do {
																var25 = var16;
																if (dummy == 0 && ~var16 < ~var17) {
																	++var24;
																} else {
																	do {
																		uc.Hb[var24][var15][var25] = sd.a(uc.Hb[var24][var15][var25], ~var43);
																		++var25;
																	} while (~var25 >= ~var17);

																	++var24;
																}
															} while (~var24 >= ~var19);
														}
													}
												}

												if ((var44 & uc.Hb[var13][var15][var14]) != 0) {
													var16 = var15;
													var17 = var15;
													var18 = var13;
													if (dummy != 0) {
														var17 = var15 + 1;
													}

													while (var17 < 104 && (var44 & uc.Hb[var13][var17 + 1][var14]) != 0) {
														++var17;
													}

													var19 = var13;
													if (dummy != 0) {
														var16 = var15 - 1;
													}

													label1351:
													while (true) {
														label1360:
														{
															if (var16 > 0) {
																if ((uc.Hb[var13][-1 + var16][var14] & var44) != 0) {
																	--var16;
																	continue;
																}

																if (dummy == 0 && ~var13 >= -1) {
																	if (dummy == 0 && ~var12 >= ~var13) {
																		break;
																	}
																	break label1360;
																}
															} else if (~var13 >= -1) {
																if (dummy == 0 && ~var12 >= ~var13) {
																	break;
																}
																break label1360;
															}

															label1363:
															while (true) {
																var20 = var16;
																if (dummy != 0) {
																	if (~(uc.Hb[var18 + -1][var16][var14] & var44) == -1) {
																		if (dummy == 0) {
																			if (~var12 >= ~var13) {
																				break label1351;
																			}
																			break;
																		}

																		var20 = var16 + 1;
																	} else {
																		var20 = var16 + 1;
																	}
																}

																while (var20 <= var17) {
																	if (~(uc.Hb[var18 + -1][var20][var14] & var44) == -1) {
																		if (dummy == 0) {
																			if (~var12 >= ~var13) {
																				break label1351;
																			}
																			break label1363;
																		}

																		++var20;
																	} else {
																		++var20;
																	}
																}

																--var18;
																if (~var18 >= -1) {
																	if (dummy == 0 && ~var12 >= ~var13) {
																		break label1351;
																	}
																	break;
																}
															}
														}

														while (true) {
															var20 = var16;
															if (dummy == 0 && var17 < var16) {
																++var19;
															} else {
																while (true) {
																	if (~(uc.Hb[var19 - -1][var20][var14] & var44) == -1 && dummy == 0) {
																		break label1351;
																	}

																	++var20;
																	if (var17 < var20) {
																		++var19;
																		break;
																	}
																}
															}

															if (~var12 >= ~var19) {
																break label1351;
															}
														}
													}

													var20 = (1 + var17 + -var16) * (-var18 + var19 + 1);
													if (var20 >= 8) {
														var48 = 240;
														var22 = -var48 + u.vertexHeights[var19][var16][var14];
														var23 = u.vertexHeights[var18][var16][var14];
														ac.b(var12, 2, var16 * 128, 128 + 128 * var17, 128 * var14, 128 * var14, var22, var23);
														var24 = var18;
														if (dummy != 0 || ~var18 >= ~var19) {
															do {
																var25 = var16;
																if (dummy == 0 && var17 < var16) {
																	++var24;
																} else {
																	do {
																		uc.Hb[var24][var25][var14] = sd.a(uc.Hb[var24][var25][var14], ~var44);
																		++var25;
																	} while (var17 >= var25);

																	++var24;
																}
															} while (~var24 >= ~var19);
														}
													}
												}

												if (~(var11 & uc.Hb[var13][var15][var14]) != -1) {
													var17 = var15;
													var19 = var14;
													var16 = var15;
													var18 = var14;
													if (dummy != 0) {
														var19 = var14 + 1;
													}

													label1510:
													while (true) {
														if (var19 < 104) {
															if ((var11 & uc.Hb[var13][var15][var19 - -1]) != 0) {
																++var19;
																continue;
															}

															if (dummy != 0) {
																var18 = var14 - 1;
															}
														}

														while (true) {
															label1536:
															{
																if (~var18 < -1) {
																	if ((var11 & uc.Hb[var13][var15][var18 - 1]) != 0) {
																		--var18;
																		continue;
																	}

																	if (dummy == 0 && var15 <= 0) {
																		if (dummy == 0 && var15 >= 104) {
																			break label1510;
																		}
																		break label1536;
																	}
																} else if (var15 <= 0) {
																	if (dummy == 0 && var15 >= 104) {
																		break label1510;
																	}
																	break label1536;
																}

																label1539:
																while (true) {
																	var20 = var18;
																	if (dummy != 0 || ~var18 >= ~var19) {
																		do {
																			if ((uc.Hb[var13][var16 + -1][var20] & var11) == 0) {
																				if (dummy == 0) {
																					if (var15 >= 104) {
																						break label1510;
																					}
																					break label1539;
																				}

																				++var20;
																			} else {
																				++var20;
																			}
																		} while (~var20 >= ~var19);
																	}

																	--var16;
																	if (var16 <= 0) {
																		if (dummy == 0 && var15 >= 104) {
																			break label1510;
																		}
																		break;
																	}
																}
															}

															while (true) {
																var20 = var18;
																if (dummy == 0 && ~var19 > ~var18) {
																	++var17;
																} else {
																	while (true) {
																		if (~(uc.Hb[var13][var17 - -1][var20] & var11) == -1 && dummy == 0) {
																			break label1510;
																		}

																		++var20;
																		if (~var19 > ~var20) {
																			++var17;
																			break;
																		}
																	}
																}

																if (var17 >= 104) {
																	break label1510;
																}
															}
														}
													}

													if (~((var19 - var18 - -1) * (1 + -var16 + var17)) <= -5) {
														var20 = u.vertexHeights[var13][var16][var18];
														ac.b(var12, 4, var16 * 128, 128 * var17 - -128, var18 * 128, 128 * var19 + 128, var20, var20);
														var21 = var16;
														if (dummy != 0 || ~var17 <= ~var16) {
															do {
																var22 = var18;
																if (dummy == 0 && var18 > var19) {
																	++var21;
																} else {
																	do {
																		uc.Hb[var13][var21][var22] = sd.a(uc.Hb[var13][var21][var22], ~var11);
																		++var22;
																	} while (var22 <= var19);

																	++var21;
																}
															} while (~var17 <= ~var21);
														}
													}
												}

												++var15;
											} while (var15 <= 104);

											++var14;
										}
									} while (var14 <= 104);

									++var13;
								}
							} while (~var12 <= ~var13);

							++var12;
						}
					} while (~var12 > -5);

					if (var1 != -111) {
						bg_c = null;
					}
				}
			} else {
				do {
					byte[][] var8 = wb.bytes_s[var7];
					byte var9 = 96;
					var11 = (int) Math.sqrt(5100.0D);
					short var10 = 768;
					var12 = var10 * var11 >> 8;
					var13 = 1;
					if (dummy != 0) {
						var14 = 1;
						if (dummy == 0 && ~var14 <= -104) {
							++var13;
						} else {
							while (true) {
								var16 = -u.vertexHeights[var7][-1 + var14][var13] + u.vertexHeights[var7][1 + var14][var13];
								var17 = -u.vertexHeights[var7][var14][var13 - 1] + u.vertexHeights[var7][var14][1 + var13];
								var18 = (int) Math.sqrt((double) (var17 * var17 + 65536 + var16 * var16));
								var19 = (var16 << 8) / var18;
								var21 = (var17 << 8) / var18;
								var20 = 65536 / var18;
								var15 = var9 + (-50 * var21 + var19 * -50 - -(var20 * -10)) / var12;
								var22 = (var8[var14][var13] >> 1) + (var8[var14][var13 - 1] >> 2) + (var8[var14 + 1][var13] >> 3) + ((var8[var14 + -1][var13] >> 2) - -(var8[var14][1 + var13] >> 3));
								var6[var14][var13] = -var22 + var15;
								++var14;
								if (~var14 <= -104) {
									++var13;
									break;
								}
							}
						}
					}

					while (~var13 > -104) {
						var14 = 1;
						if (dummy == 0 && ~var14 <= -104) {
							++var13;
						} else {
							do {
								var16 = -u.vertexHeights[var7][-1 + var14][var13] + u.vertexHeights[var7][1 + var14][var13];
								var17 = -u.vertexHeights[var7][var14][var13 - 1] + u.vertexHeights[var7][var14][1 + var13];
								var18 = (int) Math.sqrt((double) (var17 * var17 + 65536 + var16 * var16));
								var19 = (var16 << 8) / var18;
								var21 = (var17 << 8) / var18;
								var20 = 65536 / var18;
								var15 = var9 + (-50 * var21 + var19 * -50 - -(var20 * -10)) / var12;
								var22 = (var8[var14][var13] >> 1) + (var8[var14][var13 - 1] >> 2) + (var8[var14 + 1][var13] >> 3) + ((var8[var14 + -1][var13] >> 2) - -(var8[var14][1 + var13] >> 3));
								var6[var14][var13] = -var22 + var15;
								++var14;
							} while (~var14 > -104);

							++var13;
						}
					}

					var14 = 0;
					if (dummy != 0) {
						l.ints_t[var14] = 0;
						dd.T[var14] = 0;
						ua.K[var14] = 0;
						fh.ints_i[var14] = 0;
						di.W[var14] = 0;
						++var14;
					}

					while (var14 < 104) {
						l.ints_t[var14] = 0;
						dd.T[var14] = 0;
						ua.K[var14] = 0;
						fh.ints_i[var14] = 0;
						di.W[var14] = 0;
						++var14;
					}

					var15 = -5;
					ng var45;
					ng var46;
					if (dummy != 0) {
						var16 = 0;
						if (dummy == 0 && ~var16 <= -105) {
							if (var15 >= 0) {
								var17 = 0;
								var19 = 0;
								var21 = 0;
								var18 = 0;
								var20 = 0;
								var22 = -5;
								if (dummy != 0 || var22 < 104) {
									do {
										var24 = var22 - 5;
										var23 = 5 + var22;
										if (~var23 > -105) {
											var20 += fh.ints_i[var23];
											var18 += dd.T[var23];
											var21 += di.W[var23];
											var19 += ua.K[var23];
											var17 += l.ints_t[var23];
										}

										if (~var24 <= -1) {
											var19 -= ua.K[var24];
											var17 -= l.ints_t[var24];
											var20 -= fh.ints_i[var24];
											var18 -= dd.T[var24];
											var21 -= di.W[var24];
										}

										if (~var22 <= -1 && var21 > 0) {
											var41[var15][var22] = uc.b(0, var17 * 256 / var20, var18 / var21, var19 / var21);
										}

										++var22;
									} while (var22 < 104);
								}
							}

							++var15;
						} else {
							while (true) {
								var17 = 5 + var15;
								if (~var17 > -105) {
									var18 = 255 & jc.z[var7][var17][var16];
									if (~var18 < -1) {
										var45 = d.a((byte) 55, var18 + -1);
										l.ints_t[var16] += var45.R;
										dd.T[var16] += var45.U;
										ua.K[var16] += var45.Q;
										fh.ints_i[var16] += var45.L;
										++di.W[var16];
									}
								}

								var18 = -5 + var15;
								if (var18 >= 0) {
									var19 = 255 & jc.z[var7][var18][var16];
									if (~var19 < -1) {
										var46 = d.a((byte) 55, var19 + -1);
										l.ints_t[var16] -= var46.R;
										dd.T[var16] -= var46.U;
										ua.K[var16] -= var46.Q;
										fh.ints_i[var16] -= var46.L;
										--di.W[var16];
									}
								}

								++var16;
								if (~var16 <= -105) {
									if (var15 >= 0) {
										var17 = 0;
										var19 = 0;
										var21 = 0;
										var18 = 0;
										var20 = 0;
										var22 = -5;
										if (dummy != 0 || var22 < 104) {
											do {
												var24 = var22 - 5;
												var23 = 5 + var22;
												if (~var23 > -105) {
													var20 += fh.ints_i[var23];
													var18 += dd.T[var23];
													var21 += di.W[var23];
													var19 += ua.K[var23];
													var17 += l.ints_t[var23];
												}

												if (~var24 <= -1) {
													var19 -= ua.K[var24];
													var17 -= l.ints_t[var24];
													var20 -= fh.ints_i[var24];
													var18 -= dd.T[var24];
													var21 -= di.W[var24];
												}

												if (~var22 <= -1 && var21 > 0) {
													var41[var15][var22] = uc.b(0, var17 * 256 / var20, var18 / var21, var19 / var21);
												}

												++var22;
											} while (var22 < 104);
										}
									}

									++var15;
									break;
								}
							}
						}
					}

					while (~var15 > -105) {
						var16 = 0;
						if (dummy == 0 && ~var16 <= -105) {
							if (var15 >= 0) {
								var17 = 0;
								var19 = 0;
								var21 = 0;
								var18 = 0;
								var20 = 0;
								var22 = -5;
								if (dummy != 0 || var22 < 104) {
									do {
										var24 = var22 - 5;
										var23 = 5 + var22;
										if (~var23 > -105) {
											var20 += fh.ints_i[var23];
											var18 += dd.T[var23];
											var21 += di.W[var23];
											var19 += ua.K[var23];
											var17 += l.ints_t[var23];
										}

										if (~var24 <= -1) {
											var19 -= ua.K[var24];
											var17 -= l.ints_t[var24];
											var20 -= fh.ints_i[var24];
											var18 -= dd.T[var24];
											var21 -= di.W[var24];
										}

										if (~var22 <= -1 && var21 > 0) {
											var41[var15][var22] = uc.b(0, var17 * 256 / var20, var18 / var21, var19 / var21);
										}

										++var22;
									} while (var22 < 104);
								}
							}

							++var15;
						} else {
							do {
								var17 = 5 + var15;
								if (~var17 > -105) {
									var18 = 255 & jc.z[var7][var17][var16];
									if (~var18 < -1) {
										var45 = d.a((byte) 55, var18 + -1);
										l.ints_t[var16] += var45.R;
										dd.T[var16] += var45.U;
										ua.K[var16] += var45.Q;
										fh.ints_i[var16] += var45.L;
										++di.W[var16];
									}
								}

								var18 = -5 + var15;
								if (var18 >= 0) {
									var19 = 255 & jc.z[var7][var18][var16];
									if (~var19 < -1) {
										var46 = d.a((byte) 55, var19 + -1);
										l.ints_t[var16] -= var46.R;
										dd.T[var16] -= var46.U;
										ua.K[var16] -= var46.Q;
										fh.ints_i[var16] -= var46.L;
										--di.W[var16];
									}
								}

								++var16;
							} while (~var16 > -105);

							if (var15 >= 0) {
								var17 = 0;
								var19 = 0;
								var21 = 0;
								var18 = 0;
								var20 = 0;
								var22 = -5;
								if (dummy != 0 || var22 < 104) {
									do {
										var24 = var22 - 5;
										var23 = 5 + var22;
										if (~var23 > -105) {
											var20 += fh.ints_i[var23];
											var18 += dd.T[var23];
											var21 += di.W[var23];
											var19 += ua.K[var23];
											var17 += l.ints_t[var23];
										}

										if (~var24 <= -1) {
											var19 -= ua.K[var24];
											var17 -= l.ints_t[var24];
											var20 -= fh.ints_i[var24];
											var18 -= dd.T[var24];
											var21 -= di.W[var24];
										}

										if (~var22 <= -1 && var21 > 0) {
											var41[var15][var22] = uc.b(0, var17 * 256 / var20, var18 / var21, var19 / var21);
										}

										++var22;
									} while (var22 < 104);
								}
							}

							++var15;
						}
					}

					var16 = 1;
					if (dummy != 0 || ~var16 > -104) {
						do {
							var17 = 1;
							if (dummy == 0 && var17 >= 103) {
								++var16;
							} else {
								do {
									if (!tf.boolean_q || (2 & jc.bytes_q[0][var16][var17]) != 0 || (jc.bytes_q[var7][var16][var17] & 16) == 0 && (~rd.a(var17, (byte) -99, var7, var16) == ~rh.V || dummy != 0)) {
										if (~ie.Lb < ~var7) {
											ie.Lb = var7;
										}

										var19 = pc.bytes_d[var7][var16][var17] & 255;
										var18 = 255 & jc.z[var7][var16][var17];
										if (var18 > 0 || var19 > 0) {
											label1832:
											{
												var21 = u.vertexHeights[var7][var16 + 1][var17];
												var20 = u.vertexHeights[var7][var16][var17];
												var22 = u.vertexHeights[var7][1 + var16][var17 + 1];
												var23 = u.vertexHeights[var7][var16][var17 + 1];
												if (var7 > 0) {
													boolean var47 = true;
													if (var18 == 0 && ah.bytes_d[var7][var16][var17] != 0) {
														var47 = false;
													}

													if (~var19 < -1 && !fd.a(85, var19 - 1).G) {
														var47 = false;
													}

													if (var47 && var20 == var21 && var20 == var22 && ~var20 == ~var23) {
														uc.Hb[var7][var16][var17] = d.c(uc.Hb[var7][var16][var17], 2340);
													}
												}

												int var26;
												int var27;
												label764:
												{
													if (~var18 < -1) {
														label759:
														{
															var24 = var41[var16][var17];
															var26 = var4 + (var24 & 127);
															if (~var26 > -1) {
																var26 = 0;
																if (dummy == 0) {
																	break label759;
																}
															}

															if (var26 > 127) {
																var26 = 127;
															}
														}

														var27 = var26 + (896 & var24) + ('ﰀ' & var24 + var3);
														var25 = nc.U[mf.a(96, -14538, var27)];
														if (dummy == 0) {
															break label764;
														}
													}

													var25 = 0;
													var24 = -1;
												}

												var26 = var6[var16][var17];
												var27 = var6[var16 + 1][var17];
												int var28 = var6[1 + var16][1 + var17];
												int var29 = var6[var16][1 + var17];
												if (var19 == 0) {
													hd.a(var7, var16, var17, 0, 0, -1, var20, var21, var22, var23, mf.a(var26, -14538, var24), mf.a(var27, -14538, var24), mf.a(var28, -14538, var24), mf.a(var29, -14538, var24), 0, 0, 0, 0, var25, 0);
													if (dummy == 0) {
														break label1832;
													}
												}

												byte var31 = lc.B[var7][var16][var17];
												int var30 = ah.bytes_d[var7][var16][var17] - -1;
												cg var32 = fd.a(67, -1 + var19);
												int var33 = var32.N;
												if (var33 >= 0 && !nc.Z.d(-113, var33)) {
													var33 = -1;
												}

												int var34;
												int var35;
												int var36;
												int var37;
												label1807:
												{
													if (~var33 <= -1) {
														var35 = nc.U[cf.a(nc.Z.a(var33, false), (byte) -128, 96)];
														var34 = -1;
														if (dummy == 0) {
															break label1807;
														}
													}

													if (var32.M != -1) {
														label740:
														{
															var34 = var32.M;
															var36 = (var34 & 127) - -var4;
															if (~var36 <= -1) {
																if (~var36 >= -128) {
																	break label740;
																}

																var36 = 127;
																if (dummy == 0) {
																	break label740;
																}
															}

															var36 = 0;
														}

														var37 = (var34 + var3 & 'ﰀ') + (896 & var34) + var36;
														var35 = nc.U[cf.a(var37, (byte) -128, 96)];
														if (dummy == 0) {
															break label1807;
														}
													}

													var35 = 0;
													var34 = -2;
												}

												if (~var32.K <= -1) {
													label731:
													{
														var36 = var32.K;
														var37 = var4 + (var36 & 127);
														if (var37 >= 0) {
															if (~var37 >= -128) {
																break label731;
															}

															var37 = 127;
															if (dummy == 0) {
																break label731;
															}
														}

														var37 = 0;
													}

													int var38 = (896 & var36) + ((var36 + var3 & 'ﰀ') - -var37);
													var35 = nc.U[cf.a(var38, (byte) -128, 96)];
												}

												hd.a(var7, var16, var17, var30, var31, var33, var20, var21, var22, var23, mf.a(var26, -14538, var24), mf.a(var27, -14538, var24), mf.a(var28, -14538, var24), mf.a(var29, var1 ^ 14503, var24), cf.a(var34, (byte) -128, var26), cf.a(var34, (byte) -128, var27), cf.a(var34, (byte) -128, var28), cf.a(var34, (byte) -128, var29), var25, var35);
											}
										}
									}

									++var17;
								} while (var17 < 103);

								++var16;
							}
						} while (~var16 > -104);

						var17 = 1;
						if (dummy != 0) {
							var18 = 1;
							if (dummy == 0 && ~var18 <= -104) {
								++var17;
							} else {
								while (true) {
									uh.a(var7, var18, var17, rd.a(var17, (byte) -99, var7, var18));
									++var18;
									if (~var18 <= -104) {
										++var17;
										break;
									}
								}
							}
						}

						while (~var17 > -104) {
							var18 = 1;
							if (dummy == 0 && ~var18 <= -104) {
								++var17;
							} else {
								do {
									uh.a(var7, var18, var17, rd.a(var17, (byte) -99, var7, var18));
									++var18;
								} while (~var18 > -104);

								++var17;
							}
						}

						jc.z[var7] = null;
						pc.bytes_d[var7] = null;
						ah.bytes_d[var7] = null;
						lc.B[var7] = null;
						wb.bytes_s[var7] = null;
						++var7;
					} else {
						var17 = 1;
						if (dummy != 0) {
							var18 = 1;
							if (dummy == 0 && ~var18 <= -104) {
								++var17;
							} else {
								while (true) {
									uh.a(var7, var18, var17, rd.a(var17, (byte) -99, var7, var18));
									++var18;
									if (~var18 <= -104) {
										++var17;
										break;
									}
								}
							}
						}

						while (~var17 > -104) {
							var18 = 1;
							if (dummy == 0 && ~var18 <= -104) {
								++var17;
							} else {
								do {
									uh.a(var7, var18, var17, rd.a(var17, (byte) -99, var7, var18));
									++var18;
								} while (~var18 > -104);

								++var17;
							}
						}

						jc.z[var7] = null;
						pc.bytes_d[var7] = null;
						ah.bytes_d[var7] = null;
						lc.B[var7] = null;
						wb.bytes_s[var7] = null;
						++var7;
					}
				} while (var7 < 4);

				kh.c(-50, -10, -50);
				var42 = 0;
				if (dummy != 0 || var42 < 104) {
					do {
						var43 = 0;
						if (dummy == 0 && ~var43 <= -105) {
							++var42;
						} else {
							do {
								if ((2 & jc.bytes_q[1][var42][var43]) == 2) {
									fi.a(var42, var43);
								}

								++var43;
							} while (~var43 > -105);

							++var42;
						}
					} while (var42 < 104);
				}

				var43 = 1;
				var44 = 2;
				var11 = 4;
				var12 = 0;
				if (dummy == 0 && ~var12 <= -5) {
					if (var1 != -111) {
						bg_c = null;
					}
				} else {
					do {
						if (var12 > 0) {
							var44 <<= 3;
							var43 <<= 3;
							var11 <<= 3;
						}

						var13 = 0;
						if (dummy == 0 && ~var12 > ~var13) {
							++var12;
						} else {
							do {
								var14 = 0;
								if (dummy == 0 && var14 > 104) {
									++var13;
								} else {
									do {
										var15 = 0;
										if (dummy == 0 && var15 > 104) {
											++var14;
										} else {
											do {
												if (~(var43 & uc.Hb[var13][var15][var14]) != -1) {
													var16 = var14;
													if (dummy != 0) {
														var16 = var14 - 1;
													}

													while (~var16 < -1 && ~(uc.Hb[var13][var15][-1 + var16] & var43) != -1) {
														--var16;
													}

													var17 = var14;
													if (dummy != 0) {
														var17 = var14 + 1;
													}

													while (var17 < 104 && ~(var43 & uc.Hb[var13][var15][1 + var17]) != -1) {
														++var17;
													}

													var18 = var13;
													if (dummy != 0 || ~var13 < -1) {
														label590:
														do {
															var20 = var16;
															if (dummy == 0 && var17 < var16) {
																--var18;
															} else {
																do {
																	if ((uc.Hb[-1 + var18][var15][var20] & var43) == 0 && dummy == 0) {
																		break label590;
																	}

																	++var20;
																} while (var17 >= var20);

																--var18;
															}
														} while (~var18 < -1);
													}

													var19 = var13;
													if (dummy != 0 || ~var13 > ~var12) {
														label566:
														do {
															var20 = var16;
															if (dummy == 0 && var17 < var16) {
																++var19;
															} else {
																do {
																	if (~(uc.Hb[var19 + 1][var15][var20] & var43) == -1 && dummy == 0) {
																		break label566;
																	}

																	++var20;
																} while (var17 >= var20);

																++var19;
															}
														} while (~var19 > ~var12);
													}

													var20 = (1 + var19 + -var18) * (1 + -var16 + var17);
													if (~var20 <= -9) {
														var48 = 240;
														var22 = -var48 + u.vertexHeights[var19][var15][var16];
														var23 = u.vertexHeights[var18][var15][var16];
														ac.b(var12, 1, 128 * var15, 128 * var15, 128 * var16, var17 * 128 + 128, var22, var23);
														var24 = var18;
														if (dummy != 0 || ~var18 >= ~var19) {
															do {
																var25 = var16;
																if (dummy == 0 && ~var16 < ~var17) {
																	++var24;
																} else {
																	do {
																		uc.Hb[var24][var15][var25] = sd.a(uc.Hb[var24][var15][var25], ~var43);
																		++var25;
																	} while (~var25 >= ~var17);

																	++var24;
																}
															} while (~var24 >= ~var19);
														}
													}
												}

												if ((var44 & uc.Hb[var13][var15][var14]) != 0) {
													var16 = var15;
													var17 = var15;
													var18 = var13;
													if (dummy != 0) {
														var17 = var15 + 1;
													}

													while (var17 < 104 && (var44 & uc.Hb[var13][var17 + 1][var14]) != 0) {
														++var17;
													}

													var19 = var13;
													if (dummy != 0) {
														var16 = var15 - 1;
													}

													label508:
													while (true) {
														label503:
														{
															if (var16 > 0) {
																if ((uc.Hb[var13][-1 + var16][var14] & var44) != 0) {
																	--var16;
																	continue;
																}

																if (dummy == 0 && ~var13 >= -1) {
																	if (dummy == 0 && ~var12 >= ~var13) {
																		break;
																	}
																	break label503;
																}
															} else if (~var13 >= -1) {
																if (dummy == 0 && ~var12 >= ~var13) {
																	break;
																}
																break label503;
															}

															label499:
															while (true) {
																var20 = var16;
																if (dummy != 0) {
																	if (~(uc.Hb[var18 + -1][var16][var14] & var44) == -1) {
																		if (dummy == 0) {
																			if (~var12 >= ~var13) {
																				break label508;
																			}
																			break;
																		}

																		var20 = var16 + 1;
																	} else {
																		var20 = var16 + 1;
																	}
																}

																while (var20 <= var17) {
																	if (~(uc.Hb[var18 + -1][var20][var14] & var44) == -1) {
																		if (dummy == 0) {
																			if (~var12 >= ~var13) {
																				break label508;
																			}
																			break label499;
																		}

																		++var20;
																	} else {
																		++var20;
																	}
																}

																--var18;
																if (~var18 >= -1) {
																	if (dummy == 0 && ~var12 >= ~var13) {
																		break label508;
																	}
																	break;
																}
															}
														}

														while (true) {
															var20 = var16;
															if (dummy == 0 && var17 < var16) {
																++var19;
															} else {
																while (true) {
																	if (~(uc.Hb[var19 - -1][var20][var14] & var44) == -1 && dummy == 0) {
																		break label508;
																	}

																	++var20;
																	if (var17 < var20) {
																		++var19;
																		break;
																	}
																}
															}

															if (~var12 >= ~var19) {
																break label508;
															}
														}
													}

													var20 = (1 + var17 + -var16) * (-var18 + var19 + 1);
													if (var20 >= 8) {
														var48 = 240;
														var22 = -var48 + u.vertexHeights[var19][var16][var14];
														var23 = u.vertexHeights[var18][var16][var14];
														ac.b(var12, 2, var16 * 128, 128 + 128 * var17, 128 * var14, 128 * var14, var22, var23);
														var24 = var18;
														if (dummy != 0 || ~var18 >= ~var19) {
															do {
																var25 = var16;
																if (dummy == 0 && var17 < var16) {
																	++var24;
																} else {
																	do {
																		uc.Hb[var24][var25][var14] = sd.a(uc.Hb[var24][var25][var14], ~var44);
																		++var25;
																	} while (var17 >= var25);

																	++var24;
																}
															} while (~var24 >= ~var19);
														}
													}
												}

												if (~(var11 & uc.Hb[var13][var15][var14]) != -1) {
													var17 = var15;
													var19 = var14;
													var16 = var15;
													var18 = var14;
													if (dummy != 0) {
														var19 = var14 + 1;
													}

													label399:
													while (true) {
														if (var19 < 104) {
															if ((var11 & uc.Hb[var13][var15][var19 - -1]) != 0) {
																++var19;
																continue;
															}

															if (dummy != 0) {
																var18 = var14 - 1;
															}
														}

														while (true) {
															label384:
															{
																if (~var18 < -1) {
																	if ((var11 & uc.Hb[var13][var15][var18 - 1]) != 0) {
																		--var18;
																		continue;
																	}

																	if (dummy == 0 && var15 <= 0) {
																		if (dummy == 0 && var15 >= 104) {
																			break label399;
																		}
																		break label384;
																	}
																} else if (var15 <= 0) {
																	if (dummy == 0 && var15 >= 104) {
																		break label399;
																	}
																	break label384;
																}

																label380:
																while (true) {
																	var20 = var18;
																	if (dummy != 0 || ~var18 >= ~var19) {
																		do {
																			if ((uc.Hb[var13][var16 + -1][var20] & var11) == 0) {
																				if (dummy == 0) {
																					if (var15 >= 104) {
																						break label399;
																					}
																					break label380;
																				}

																				++var20;
																			} else {
																				++var20;
																			}
																		} while (~var20 >= ~var19);
																	}

																	--var16;
																	if (var16 <= 0) {
																		if (dummy == 0 && var15 >= 104) {
																			break label399;
																		}
																		break;
																	}
																}
															}

															while (true) {
																var20 = var18;
																if (dummy == 0 && ~var19 > ~var18) {
																	++var17;
																} else {
																	while (true) {
																		if (~(uc.Hb[var13][var17 - -1][var20] & var11) == -1 && dummy == 0) {
																			break label399;
																		}

																		++var20;
																		if (~var19 > ~var20) {
																			++var17;
																			break;
																		}
																	}
																}

																if (var17 >= 104) {
																	break label399;
																}
															}
														}
													}

													if (~((var19 - var18 - -1) * (1 + -var16 + var17)) <= -5) {
														var20 = u.vertexHeights[var13][var16][var18];
														ac.b(var12, 4, var16 * 128, 128 * var17 - -128, var18 * 128, 128 * var19 + 128, var20, var20);
														var21 = var16;
														if (dummy != 0 || ~var17 <= ~var16) {
															do {
																var22 = var18;
																if (dummy == 0 && var18 > var19) {
																	++var21;
																} else {
																	do {
																		uc.Hb[var13][var21][var22] = sd.a(uc.Hb[var13][var21][var22], ~var11);
																		++var22;
																	} while (var22 <= var19);

																	++var21;
																}
															} while (~var17 <= ~var21);
														}
													}
												}

												++var15;
											} while (var15 <= 104);

											++var14;
										}
									} while (var14 <= 104);

									++var13;
								}
							} while (~var12 <= ~var13);

							++var12;
						}
					} while (~var12 > -5);

					if (var1 != -111) {
						bg_c = null;
					}
				}
			}
		} catch (RuntimeException var40) {
			throw ec.a(var40, "hb.AC(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static {
		lf_l = lf_k;
		lf_m = dd.a("jlv", 2);
	}
}
