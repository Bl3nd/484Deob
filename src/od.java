final class od extends j {

	static int Q;
	static int R;
	static int S = -1;
	static int T;
	static lf U;
	static int V;
	static boolean W = false;
	static eh X;
	private static lf Y = dd.a("Unable to find ", 2);
	static int Z;
	static int int_ab;
	static vg vg_bb;

	public od() {
		super(0, true);
	}

	static final void a(int var0, int var1, int var2, int var3, byte var4) {
		int var20 = client.int_gc;

		try {
			if (~pa.int_u == -1 && !nb.boolean_a) {
				ba.a(var1 - var3, var2 - var0, cf.K, (short) 25, 0L, 500, sh.Gb);
				++ka.U;
			}

			++V;
			long var5 = -1L;
			if (var4 <= 16) {
				vg_bb = null;
			}

			int var7 = 0;
			if (var20 != 0 || ue.int_fb > var7) {
				do {
					long var8 = ue.longs_vb[var7];
					int var11 = (16378 & (int) var8) >> -296310521;
					int var13 = Integer.MAX_VALUE & (int) (var8 >>> -859412960);
					int var10 = (int) var8 & 127;
					int var12 = 3 & (int) var8 >> 38955197;
					if (var5 != var8) {
						label312:
						{
							var5 = var8;
							int var16;
							if (~var12 == -3 && dc.a(hc.int_pb, var10, var11, var8)) {
								label313:
								{
									i var14 = pa.a((int) var13, 0);
									if (var14.ints_mb != null) {
										var14 = var14.b(118);
									}

									if (var14 == null) {
										break label312;
									}

									if (pa.int_u == 1) {
										++ja.L;
										ba.a(var11, var10, ha.lf_o, (short) 31, var8, 500, de.a(new lf[]{wb.lf_b, w.lf_a, var14.zb}, 123));
										if (var20 == 0) {
											break label313;
										}
									}

									if (nb.boolean_a) {
										if (~(4 & qh.int_i) != -5) {
											break label313;
										}

										ba.a(var11, var10, md.lf_d, (short) 50, var8, 500, de.a(new lf[]{sd.U, w.lf_a, var14.zb}, -106));
										++lf.int_n;
										if (var20 == 0) {
											break label313;
										}
									}

									++o.int_h;
									lf[] var15 = var14.Q;
									if (ai.boolean_h) {
										var15 = l.a((byte) -84, var15);
									}

									if (var15 != null) {
										var16 = 4;
										if (var20 != 0 || ~var16 <= -1) {
											do {
												if (var15[var16] != null) {
													++ac.int_cb;
													short var17 = 0;
													if (~var16 == -1) {
														var17 = 58;
													}

													if (var16 == 1) {
														var17 = 19;
													}

													if (var16 == 2) {
														var17 = 23;
													}

													if (var16 == 3) {
														var17 = 40;
													}

													if (var16 == 4) {
														var17 = 1007;
													}

													ba.a(var11, var10, var15[var16], var17, var8, 500, de.a(new lf[]{ib.lf_l, var14.zb}, 119));
												}

												--var16;
											} while (~var16 <= -1);
										}
									}

									ba.a(var11, var10, fd.lf_h, (short) 1006, (long) var14.int_cb, 500, de.a(new lf[]{ib.lf_l, var14.zb}, 125));
								}
							}

							int var25;
							p var26;
							u var29;
							if (~var12 == -2) {
								p var22 = th.ps_g[var13];
								if (var22.xc.int_ib == 1 && ~(127 & var22.int_fb) == -65 && ~(127 & var22.int_nc) == -65) {
									var25 = 0;
									if (var20 != 0 || a.int_j > var25) {
										do {
											var26 = th.ps_g[a.ints_h[var25]];
											if (var26 != null && var22 != var26 && ~var26.xc.int_ib == -2 && var26.int_fb == var22.int_fb && var26.int_nc == var22.int_nc) {
												wh.a(var10, var26.xc, var11, 125, a.ints_h[var25]);
											}

											++var25;
										} while (a.int_j > var25);
									}

									var16 = 0;
									if (var20 != 0 || ~var16 > ~r.Y) {
										do {
											var29 = w.us_e[nd.ints_k[var16]];
											if (var29 != null && ~var29.int_fb == ~var22.int_fb && ~var29.int_nc == ~var22.int_nc) {
												pd.a(nd.ints_k[var16], var10, var29, (byte) 32, var11);
											}

											++var16;
										} while (~var16 > ~r.Y);
									}
								}

								wh.a(var10, var22.xc, var11, 118, var13);
							}

							if (~var12 == -1) {
								u var23 = w.us_e[var13];
								if (~(var23.int_fb & 127) == -65 && (127 & var23.int_nc) == 64) {
									var25 = 0;
									if (var20 != 0 || ~var25 > ~a.int_j) {
										do {
											var26 = th.ps_g[a.ints_h[var25]];
											if (var26 != null && ~var26.xc.int_ib == -2 && var23.int_fb == var26.int_fb && ~var26.int_nc == ~var23.int_nc) {
												wh.a(var10, var26.xc, var11, 101, a.ints_h[var25]);
											}

											++var25;
										} while (~var25 > ~a.int_j);
									}

									var16 = 0;
									if (var20 != 0 || ~r.Y < ~var16) {
										do {
											var29 = w.us_e[nd.ints_k[var16]];
											if (var29 != null && var23 != var29 && ~var29.int_fb == ~var23.int_fb && ~var29.int_nc == ~var23.int_nc) {
												pd.a(nd.ints_k[var16], var10, var29, (byte) 32, var11);
											}

											++var16;
										} while (~r.Y < ~var16);
									}
								}

								pd.a(var13, var10, var23, (byte) 32, var11);
							}

							if (var12 == 3) {
								tf var24 = vh.tfs_h[hc.int_pb][var10][var11];
								if (var24 != null) {
									hc var27 = (hc) var24.a((int) 121);
									if (var20 != 0 || var27 != null) {
										do {
											label323:
											{
												ie var28 = ng.a(var27.int_jb, (int) -4);
												if (~pa.int_u == -2) {
													ba.a(var11, var10, ha.lf_o, (short) 8, (long) var27.int_jb, 500, de.a(new lf[]{wb.lf_b, j.O, var28.U}, -52));
													++nb.int_n;
													if (var20 == 0) {
														break label323;
													}
												}

												if (!nb.boolean_a) {
													++ng.W;
													lf[] var30 = var28.Db;
													if (ai.boolean_h) {
														var30 = l.a((byte) -89, var30);
													}

													int var18 = 4;
													if (var20 != 0 || ~var18 <= -1) {
														do {
															label210:
															{
																if (var30 != null && var30[var18] != null) {
																	++ag.int_b;
																	byte var19 = 0;
																	if (~var18 == -1) {
																		var19 = 30;
																	}

																	if (var18 == 1) {
																		var19 = 2;
																	}

																	if (~var18 == -3) {
																		var19 = 13;
																	}

																	if (~var18 == -4) {
																		var19 = 49;
																	}

																	if (var18 == 4) {
																		var19 = 47;
																	}

																	ba.a(var11, var10, var30[var18], var19, (long) var27.int_jb, 500, de.a(new lf[]{ia.lf_b, var28.U}, 118));
																	if (var20 == 0) {
																		break label210;
																	}
																}

																if (var18 == 2) {
																	ba.a(var11, var10, nf.lf_n, (short) 13, (long) var27.int_jb, 500, de.a(new lf[]{ia.lf_b, var28.U}, -81));
																	++bc.int_j;
																}
															}

															--var18;
														} while (~var18 <= -1);
													}

													ba.a(var11, var10, fd.lf_h, (short) 1003, (long) var27.int_jb, 500, de.a(new lf[]{ia.lf_b, var28.U}, 126));
													if (var20 == 0) {
														break label323;
													}
												}

												if ((1 & qh.int_i) == 1) {
													++hc.int_kb;
													ba.a(var11, var10, md.lf_d, (short) 43, (long) var27.int_jb, 500, de.a(new lf[]{sd.U, j.O, var28.U}, 127));
												}
											}

											var27 = (hc) var24.b((byte) -101);
										} while (var27 != null);
									}
								}
							}
						}
					}

					++var7;
				} while (ue.int_fb > var7);

			}
		} catch (RuntimeException var21) {
			throw ec.a(var21, "od.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		try {
			if (var1 >= -49) {
				a(57, -31, -126, -104, -29, -80);
			}

			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				na.a(var3, 0, ff.int_a, fc.G[var2]);
			}

			++int_ab;
			return var3;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "od.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void e(int var0) {
		try {
			++Z;
			v.rc_kb.c(-51);
			va.J.c(-51);
			if (var0 < 108) {
				vg_bb = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "od.B(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var18 = client.int_gc;

		try {
			++T;
			if (var0 != 1536) {
				a((nf) null, -7, -14, -40, -49, 89, -54, -49);
			}

			long var6 = bg.c(var1, var5, var2);
			int var8;
			int var9;
			int var10;
			int var12;
			int var13;
			if (~var6 != -1L) {
				label150:
				{
					var8 = 3 & (int) var6 >> -1409323276;
					var10 = var4;
					int[] var11 = of.E.O;
					var9 = (int) var6 >> 1464011982 & 31;
					if (var6 > 0L) {
						var10 = var3;
					}

					var12 = (-(512 * var2) + '츀') * 4 + 24624 + 4 * var5;
					var13 = Integer.MAX_VALUE & (int) (var6 >>> 571641952);
					i var14 = pa.a(var13, var0 ^ 1536);
					if (var14.int_ob != -1) {
						df var15 = ef.dfs_o[var14.int_ob];
						if (var15 == null) {
							break label150;
						}

						int var16 = (-var15.N + var14.L * 4) / 2;
						int var17 = (4 * var14.I - var15.S) / 2;
						var15.a(48 - (-(var5 * 4) + -var16), var17 + (-var14.I + 104 + -var2) * 4 + 48);
						if (var18 == 0) {
							break label150;
						}
					}

					if (var9 == 0 || ~var9 == -3) {
						label149:
						{
							if (var8 != 0) {
								if (~var8 == -2) {
									var11[var12] = var10;
									var11[var12 - -1] = var10;
									var11[2 + var12] = var10;
									var11[3 + var12] = var10;
									if (var18 == 0) {
										break label149;
									}
								}

								if (~var8 == -3) {
									var11[3 + var12] = var10;
									var11[var12 + 515] = var10;
									var11[var12 + 1027] = var10;
									var11[3 + var12 + 1536] = var10;
									if (var18 == 0) {
										break label149;
									}
								}

								if (~var8 != -4) {
									break label149;
								}

								var11[1536 + var12] = var10;
								var11[1536 + (var12 - -1)] = var10;
								var11[1536 + var12 + 2] = var10;
								var11[3 + var12 + 1536] = var10;
								if (var18 == 0) {
									break label149;
								}
							}

							var11[var12] = var10;
							var11[var12 + 512] = var10;
							var11[1024 + var12] = var10;
							var11[1536 + var12] = var10;
						}
					}

					if (~var9 == -4) {
						label146:
						{
							if (~var8 == -1) {
								var11[var12] = var10;
								if (var18 == 0) {
									break label146;
								}
							}

							if (var8 == 1) {
								var11[var12 - -3] = var10;
								if (var18 == 0) {
									break label146;
								}
							}

							if (~var8 == -3) {
								var11[1539 + var12] = var10;
								if (var18 == 0) {
									break label146;
								}
							}

							if (~var8 == -4) {
								var11[var12 + 1536] = var10;
							}
						}
					}

					if (var9 == 2) {
						label97:
						{
							if (var8 != 3) {
								if (~var8 == -1) {
									var11[var12] = var10;
									var11[1 + var12] = var10;
									var11[var12 + 2] = var10;
									var11[3 + var12] = var10;
									if (var18 == 0) {
										break label97;
									}
								}

								if (~var8 != -2) {
									if (var8 != 2) {
										break label97;
									}

									var11[1536 + var12] = var10;
									var11[1536 + var12 + 1] = var10;
									var11[1538 + var12] = var10;
									var11[1536 + var12 + 3] = var10;
									if (var18 == 0) {
										break label97;
									}
								}

								var11[var12 - -3] = var10;
								var11[var12 + 515] = var10;
								var11[1024 + 3 + var12] = var10;
								var11[1536 + var12 - -3] = var10;
								if (var18 == 0) {
									break label97;
								}
							}

							var11[var12] = var10;
							var11[var12 + 512] = var10;
							var11[var12 - -1024] = var10;
							var11[1536 + var12] = var10;
						}
					}
				}
			}

			var6 = tc.d(var1, var5, var2);
			if (~var6 != -1L) {
				label83:
				{
					var9 = ((int) var6 & 513094) >> -511564978;
					var8 = 3 & (int) var6 >> -908380812;
					var10 = Integer.MAX_VALUE & (int) (var6 >>> 644366880);
					i var21 = pa.a(var10, var0 ^ 1536);
					int var25;
					if (~var21.int_ob != 0) {
						df var23 = ef.dfs_o[var21.int_ob];
						if (var23 == null) {
							break label83;
						}

						var13 = (4 * var21.L - var23.N) / 2;
						var25 = (-var23.S + 4 * var21.I) / 2;
						var23.a(48 - -(var5 * 4) + var13, (-var21.I + 104 - var2) * 4 + 48 + var25);
						if (var18 == 0) {
							break label83;
						}
					}

					if (~var9 == -10) {
						label151:
						{
							var12 = 15658734;
							var25 = (-(var2 * 512) + '츀') * 4 + var5 * 4 + 24624;
							if (var6 > 0L) {
								var12 = 15597568;
							}

							int[] var24 = of.E.O;
							if (var8 == 0 || ~var8 == -3) {
								var24[1536 + var25] = var12;
								var24[1 + var25 - -1024] = var12;
								var24[512 + var25 + 2] = var12;
								var24[var25 + 3] = var12;
								if (var18 == 0) {
									break label151;
								}
							}

							var24[var25] = var12;
							var24[1 + (var25 - -512)] = var12;
							var24[2 + var25 - -1024] = var12;
							var24[1536 + var25 + 3] = var12;
						}
					}
				}
			}

			var6 = hh.a(var1, var5, var2);
			if (~var6 != -1L) {
				var8 = (int) (var6 >>> 1387431712) & Integer.MAX_VALUE;
				i var20 = pa.a((int) var8, 0);
				if (~var20.int_ob != 0) {
					df var26 = ef.dfs_o[var20.int_ob];
					if (var26 != null) {
						int var22 = (-var26.N + var20.L * 4) / 2;
						var12 = (-var26.S + var20.I * 4) / 2;
						var26.a(var22 + 48 + 4 * var5, 4 * (-var20.I + -var2 + 104) + 48 + var12);
						return;
					}
				}
			}

		} catch (RuntimeException var19) {
			throw ec.a(var19, "od.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	static final void a(nf var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8;
		int var9 = var8 = (var6 << 7) - bg.int_l;
		int var10;
		int var11 = var10 = (var7 << 7) - pe.int_l;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14;
		int var15 = var14 = var11 + 128;
		int var16 = ch.ints_g[var1][var6][var7] - tc.int_lb;
		int var17 = ch.ints_g[var1][var6 + 1][var7] - tc.int_lb;
		int var18 = ch.ints_g[var1][var6 + 1][var7 + 1] - tc.int_lb;
		int var19 = ch.ints_g[var1][var6][var7 + 1] - tc.int_lb;
		int var20 = var11 * var4 + var9 * var5 >> 16;
		var11 = var11 * var5 - var9 * var4 >> 16;
		var9 = var20;
		var20 = var16 * var3 - var11 * var2 >> 16;
		var11 = var16 * var2 + var11 * var3 >> 16;
		var16 = var20;
		if (var11 >= 50) {
			var20 = var10 * var4 + var13 * var5 >> 16;
			var10 = var10 * var5 - var13 * var4 >> 16;
			var13 = var20;
			var20 = var17 * var3 - var10 * var2 >> 16;
			var10 = var17 * var2 + var10 * var3 >> 16;
			var17 = var20;
			if (var10 >= 50) {
				var20 = var15 * var4 + var12 * var5 >> 16;
				var15 = var15 * var5 - var12 * var4 >> 16;
				var12 = var20;
				var20 = var18 * var3 - var15 * var2 >> 16;
				var15 = var18 * var2 + var15 * var3 >> 16;
				var18 = var20;
				if (var15 >= 50) {
					var20 = var14 * var4 + var8 * var5 >> 16;
					var14 = var14 * var5 - var8 * var4 >> 16;
					var8 = var20;
					var20 = var19 * var3 - var14 * var2 >> 16;
					var14 = var19 * var2 + var14 * var3 >> 16;
					if (var14 >= 50) {
						int var21 = nc.O + (var9 << 9) / var11;
						int var22 = nc.V + (var16 << 9) / var11;
						int var23 = nc.O + (var13 << 9) / var10;
						int var24 = nc.V + (var17 << 9) / var10;
						int var25 = nc.O + (var12 << 9) / var15;
						int var26 = nc.V + (var18 << 9) / var15;
						int var27 = nc.O + (var8 << 9) / var14;
						int var28 = nc.V + (var20 << 9) / var14;
						nc.N = 0;
						int var29;
						if ((var25 - var27) * (var24 - var28) - (var26 - var28) * (var23 - var27) > 0) {
							if (ng.boolean_ab && ph.a(dc.int_ob, tb.int_db, var26, var28, var24, var25, var27, var23)) {
								ah.int_w = var6;
								client.V = var7;
							}

							nc.Y = false;
							if (var25 < 0 || var27 < 0 || var23 < 0 || var25 > nc.int_gb || var27 > nc.int_gb || var23 > nc.int_gb) {
								nc.Y = true;
							}

							if (var0.int_o == -1) {
								if (var0.int_e != 12345678) {
									nc.a(var26, var28, var24, var25, var27, var23, var0.int_e, var0.int_m, var0.int_a);
								}
							} else if (!va.W) {
								if (var0.boolean_h) {
									nc.b(var26, var28, var24, var25, var27, var23, var0.int_e, var0.int_m, var0.int_a, var9, var13, var8, var16, var17, var20, var11, var10, var14, var0.int_o);
								} else {
									nc.b(var26, var28, var24, var25, var27, var23, var0.int_e, var0.int_m, var0.int_a, var12, var8, var13, var18, var20, var17, var15, var14, var10, var0.int_o);
								}
							} else {
								var29 = nc.Z.a(var0.int_o, false);
								nc.a(var26, var28, var24, var25, var27, var23, p.a(var29, var0.int_e), p.a(var29, var0.int_m), p.a(var29, var0.int_a));
							}
						}

						if ((var21 - var23) * (var28 - var24) - (var22 - var24) * (var27 - var23) > 0) {
							if (ng.boolean_ab && ph.a(dc.int_ob, tb.int_db, var22, var24, var28, var21, var23, var27)) {
								ah.int_w = var6;
								client.V = var7;
							}

							nc.Y = false;
							if (var21 < 0 || var23 < 0 || var27 < 0 || var21 > nc.int_gb || var23 > nc.int_gb || var27 > nc.int_gb) {
								nc.Y = true;
							}

							if (var0.int_o == -1) {
								if (var0.int_j != 12345678) {
									nc.a(var22, var24, var28, var21, var23, var27, var0.int_j, var0.int_a, var0.int_m);
									return;
								}
							} else {
								if (!va.W) {
									nc.b(var22, var24, var28, var21, var23, var27, var0.int_j, var0.int_a, var0.int_m, var9, var13, var8, var16, var17, var20, var11, var10, var14, var0.int_o);
									return;
								}

								var29 = nc.Z.a(var0.int_o, false);
								nc.a(var22, var24, var28, var21, var23, var27, p.a(var29, var0.int_j), p.a(var29, var0.int_a), p.a(var29, var0.int_m));
							}
						}

					}
				}
			}
		}
	}

	public static void f(int var0) {
		try {
			X = null;
			if (var0 != 1536) {
				a(0, -75, -10, -60, 77, -125);
			}

			vg_bb = null;
			U = null;
			Y = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "od.C(" + var0 + ')');
		}
	}

	static final byte[] a(byte var0, byte[] var1) {
		try {
			++R;
			ja var2 = new ja(var1);
			int value = var2.j((byte) 103);
			if (var0 != -53) {
				f(125);
			}

			int length = var2.l(15);
			if (length >= 0 && (gb.int_rb == 0 || gb.int_rb >= length)) {
				if (value == 0) {
					byte[] var8 = new byte[length];
					var2.a(var8, 0, length, 1174839336);
					return var8;
				} else {
					int var5 = var2.l(15);
					if (var5 >= 0 && (gb.int_rb == 0 || var5 <= gb.int_rb)) {
						if (var5 >= 2000000) {
							return new byte[100];
						}
						byte[] var6 = new byte[var5];
						if (value == 1) {
							lg.a(var6, var5, var1, length, 9);
							if (client.int_gc == 0) {
								return var6;
							}
						}

						wh.e_a.a(28501, var2, var6);
						return var6;
					} else {
						return new byte[100];//throw new RuntimeException();
					}
				}
			} else {
				throw new RuntimeException();
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "od.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		U = Y;
		X = new eh(32);
	}
}
