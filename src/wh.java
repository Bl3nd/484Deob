final class wh {

	static e e_a = new e();
	static int int_b;
	static df[] dfs_c;
	static int int_d;
	static lf lf_e = dd.a("Ladevorgang )2 bitte warten Sie)3", 2);
	static lf gcCommand = dd.a("::gc", 2);//lf_f
	private static lf lf_g = dd.a("Please remove ", 2);
	static lf lf_h;
	static rc rc_i;
	static lf lf_j;
	static tf tf_k;
	static lf lf_l;
	private static lf lf_m;
	static lf lf_n;
	static lf lf_o;
	static int int_p;
	static lf lf_q;

	static final void a(int var0, sd var1, int var2, int var3, int var4) {
		int var10 = client.int_gc;

		try {
			++int_d;
			if (~qa.int_eb > -401) {
				if (var1.ints_db != null) {
					var1 = var1.b(-1);
				}

				if (var1 != null) {
					if (var1.zb) {
						if (var3 <= 98) {
							gcCommand = null;
						}

						lf var5 = var1.N;
						if (~var1.P != -1) {
							var5 = de.a(new lf[]{var5, bh.a(var1.P, r.X.Xc, 32139), ch.lf_k, jg.D, fa.a((byte) 85, var1.P), ha.O}, -104);
						}

						if (pa.int_u == 1) {
							++ld.int_ab;
							ba.a(var2, var0, ha.lf_o, (short) 26, (long) var4, 500, de.a(new lf[]{wb.lf_b, ka.P, var5}, -87));
						} else {
							if (nb.boolean_a) {
								if (~(qh.int_i & 2) == -3) {
									++ee.T;
									ba.a(var2, var0, md.lf_d, (short) 51, (long) var4, 500, de.a(new lf[]{sd.U, ka.P, var5}, 119));
									return;
								}
							} else {
								++bg.W;
								lf[] var6 = var1.lfs_rb;
								if (ai.boolean_h) {
									var6 = l.a((byte) -104, var6);
								}

								int var7;
								if (var6 != null) {
									var7 = 4;
									if (var10 != 0 || var7 >= 0) {
										do {
											if (var6[var7] != null && !var6[var7].a((byte) -121, jf.B)) {
												++rc.int_m;
												byte var8 = 0;
												if (~var7 == -1) {
													var8 = 37;
												}

												if (~var7 == -2) {
													var8 = 6;
												}

												if (var7 == 2) {
													var8 = 35;
												}

												if (var7 == 3) {
													var8 = 9;
												}

												if (var7 == 4) {
													var8 = 32;
												}

												ba.a(var2, var0, var6[var7], var8, (long) var4, 500, de.a(new lf[]{lh.H, var5}, 123));
											}

											--var7;
										} while (var7 >= 0);
									}
								}

								if (var6 != null) {
									var7 = 4;
									if (var10 != 0 || var7 >= 0) {
										do {
											if (var6[var7] != null && var6[var7].a((byte) -121, jf.B)) {
												++rb.int_g;
												short var12 = 0;
												if (~var1.P < ~r.X.Xc) {
													var12 = 2000;
												}

												short var9 = 0;
												if (var7 == 0) {
													var9 = 37;
												}

												if (var7 == 1) {
													var9 = 6;
												}

												if (~var7 == -3) {
													var9 = 35;
												}

												if (var7 == 3) {
													var9 = 9;
												}

												if (~var7 == -5) {
													var9 = 32;
												}

												if (var9 != 0) {
													var9 += var12;
												}

												ba.a(var2, var0, var6[var7], var9, (long) var4, 500, de.a(new lf[]{lh.H, var5}, -8));
											}

											--var7;
										} while (var7 >= 0);
									}
								}

								ba.a(var2, var0, fd.lf_h, (short) 1004, (long) var4, 500, de.a(new lf[]{lh.H, var5}, 121));
							}

						}
					}
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "wh.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	public static void a(int var0) {
		try {
			rc_i = null;
			lf_q = null;
			if (var0 <= -52) {
				lf_j = null;
				e_a = null;
				lf_l = null;
				lf_g = null;
				dfs_c = null;
				lf_e = null;
				lf_m = null;
				lf_n = null;
				lf_o = null;
				tf_k = null;
				lf_h = null;
				gcCommand = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wh.A(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, int var3, lb var4, boolean var5, int var6, int var7, int var8) {
		int var28 = client.int_gc;

		try {
			i var9;
			int var10;
			int var11;
			label301:
			{
				++int_b;
				var9 = pa.a((int) var0, 0);
				if (var1 != 1 && ~var1 != -4) {
					var10 = var9.L;
					var11 = var9.I;
					if (var28 == 0) {
						break label301;
					}
				}

				var11 = var9.L;
				var10 = var9.I;
			}

			int var14;
			int var15;
			label295:
			{
				if (var3 - -var11 <= 104) {
					var15 = var3 - -(var11 + 1 >> -1125028511);
					var14 = (var11 >> -2004673023) + var3;
					if (var28 == 0) {
						break label295;
					}
				}

				var15 = var3 + 1;
				var14 = var3;
			}

			int var12;
			int var13;
			label290:
			{
				if (~(var7 + var10) >= -105) {
					var12 = var7 + (var10 >> -1092085599);
					var13 = var7 - -(1 + var10 >> 1401181185);
					if (var28 == 0) {
						break label290;
					}
				}

				var12 = var7;
				var13 = var7 - -1;
			}

			int[][] var16 = u.vertexHeights[var6];
			if (!var5) {
				lf_e = null;
			}

			int var17 = var16[var13][var15] + var16[var12][var14] - (-var16[var13][var14] + -var16[var12][var15]) >> -1989796478;
			int var18 = (var10 << 331675334) + (var7 << -2103614297);
			int var19 = (var11 << 480989990) + (var3 << 506130599);
			long var20 = (long) (var1 << -1781710028 | var2 << 570939470 | var7 | var3 << 1949709575 | 1073741824);
			if (~var9.int_lb == -1) {
				var20 |= Long.MIN_VALUE;
			}

			if (var9.M == 1) {
				var20 |= 4194304L;
			}

			var20 |= (long) var0 << -302814752;
			Object var22;
			if (var2 == 22) {
				label167:
				{
					if (~var9.Cb == 0 && var9.ints_mb == null) {
						var22 = var9.a(true, var18, var1, var17, var16, 22, var19);
						if (var28 == 0) {
							break label167;
						}
					}

					var22 = new bh(var0, 22, var1, var6, var7, var3, var9.Cb, true, (ka) null);
				}

				sc.a(var8, var7, var3, var17, (ka) var22, var20);
				if (var9.V == 1) {
					var4.a(var3, var7, (byte) 123);
				}

			} else if (var2 != 10 && ~var2 != -12) {
				if (var2 >= 12) {
					label323:
					{
						if (~var9.Cb != 0 || var9.ints_mb != null) {
							var22 = new bh(var0, var2, var1, var6, var7, var3, var9.Cb, true, (ka) null);
							if (var28 == 0) {
								break label323;
							}
						}

						var22 = var9.a(true, var18, var1, var17, var16, var2, var19);
					}

					wd.a(var8, var7, var3, var17, 1, 1, (ka) var22, 0, var20);
					if (~var9.V != -1) {
						var4.a(var7, var10, true, var9.xb, var3, var11);
					}

				} else if (~var2 == -1) {
					label184:
					{
						if (~var9.Cb == 0 && var9.ints_mb == null) {
							var22 = var9.a(true, var18, var1, var17, var16, 0, var19);
							if (var28 == 0) {
								break label184;
							}
						}

						var22 = new bh(var0, 0, var1, var6, var7, var3, var9.Cb, true, (ka) null);
					}

					nf.a(var8, var7, var3, var17, (ka) var22, (ka) null, c.T[var1], 0, var20);
					if (var9.V != 0) {
						var4.a(var7, var9.xb, var1, -1, var2, var3);
					}

				} else if (~var2 == -2) {
					label192:
					{
						if (~var9.Cb == 0 && var9.ints_mb == null) {
							var22 = var9.a(true, var18, var1, var17, var16, 1, var19);
							if (var28 == 0) {
								break label192;
							}
						}

						var22 = new bh(var0, 1, var1, var6, var7, var3, var9.Cb, true, (ka) null);
					}

					nf.a(var8, var7, var3, var17, (ka) var22, (ka) null, cc.U[var1], 0, var20);
					if (~var9.V != -1) {
						var4.a(var7, var9.xb, var1, -1, var2, var3);
					}

				} else {
					int var30;
					if (var2 == 2) {
						Object var24;
						Object var32;
						label324:
						{
							var30 = var1 + 1 & 3;
							if (var9.Cb != -1 || var9.ints_mb != null) {
								var32 = new bh(var0, 2, var1 + 4, var6, var7, var3, var9.Cb, true, (ka) null);
								var24 = new bh(var0, 2, var30, var6, var7, var3, var9.Cb, true, (ka) null);
								if (var28 == 0) {
									break label324;
								}
							}

							var32 = var9.a(true, var18, 4 + var1, var17, var16, 2, var19);
							var24 = var9.a(true, var18, var30, var17, var16, 2, var19);
						}

						nf.a(var8, var7, var3, var17, (ka) var32, (ka) var24, c.T[var1], c.T[var30], var20);
						if (~var9.V != -1) {
							var4.a(var7, var9.xb, var1, -1, var2, var3);
						}

					} else if (var2 == 3) {
						label325:
						{
							if (var9.Cb != -1 || var9.ints_mb != null) {
								var22 = new bh(var0, 3, var1, var6, var7, var3, var9.Cb, true, (ka) null);
								if (var28 == 0) {
									break label325;
								}
							}

							var22 = var9.a(true, var18, var1, var17, var16, 3, var19);
						}

						nf.a(var8, var7, var3, var17, (ka) var22, (ka) null, cc.U[var1], 0, var20);
						if (~var9.V != -1) {
							var4.a(var7, var9.xb, var1, -1, var2, var3);
						}

					} else if (var2 == 9) {
						label326:
						{
							if (var9.Cb != -1 || var9.ints_mb != null) {
								var22 = new bh(var0, var2, var1, var6, var7, var3, var9.Cb, true, (ka) null);
								if (var28 == 0) {
									break label326;
								}
							}

							var22 = var9.a(true, var18, var1, var17, var16, var2, var19);
						}

						wd.a(var8, var7, var3, var17, 1, 1, (ka) var22, 0, var20);
						if (var9.V != 0) {
							var4.a(var7, var10, true, var9.xb, var3, var11);
						}

					} else if (~var2 == -5) {
						label230:
						{
							if (~var9.Cb == 0 && var9.ints_mb == null) {
								var22 = var9.a((boolean) var5, var18, var1, var17, var16, 4, var19);
								if (var28 == 0) {
									break label230;
								}
							}

							var22 = new bh(var0, 4, var1, var6, var7, var3, var9.Cb, true, (ka) null);
						}

						de.a(var8, var7, var3, var17, (ka) var22, (ka) null, c.T[var1], 0, 0, 0, var20);
					} else {
						long var23;
						Object var25;
						if (var2 == 5) {
							var23 = bg.c(var8, var7, var3);
							var30 = 16;
							if (~var23 != -1L) {
								var30 = pa.a((int) ((int) (var23 >>> -451435680) & Integer.MAX_VALUE), 0).U;
							}

							label238:
							{
								if (var9.Cb == -1 && var9.ints_mb == null) {
									var25 = var9.a(true, var18, var1, var17, var16, 4, var19);
									if (var28 == 0) {
										break label238;
									}
								}

								var25 = new bh(var0, 4, var1, var6, var7, var3, var9.Cb, true, (ka) null);
							}

							de.a(var8, var7, var3, var17, (ka) var25, (ka) null, c.T[var1], 0, var30 * ka.N[var1], var30 * wa.Lb[var1], var20);
						} else if (var2 == 6) {
							var30 = 8;
							var23 = bg.c(var8, var7, var3);
							if (var23 != 0L) {
								var30 = pa.a((int) (Integer.MAX_VALUE & (int) (var23 >>> 2062931296)), 0).U / 2;
							}

							label327:
							{
								if (~var9.Cb != 0 || var9.ints_mb != null) {
									var25 = new bh(var0, 4, var1 + 4, var6, var7, var3, var9.Cb, true, (ka) null);
									if (var28 == 0) {
										break label327;
									}
								}

								var25 = var9.a((boolean) var5, var18, 4 + var1, var17, var16, 4, var19);
							}

							de.a(var8, var7, var3, var17, (ka) var25, (ka) null, 256, var1, var30 * ea.ints_m[var1], l.ints_u[var1] * var30, var20);
						} else if (var2 == 7) {
							int var31;
							label328:
							{
								var31 = 2 + var1 & 3;
								if (~var9.Cb != 0 || var9.ints_mb != null) {
									var22 = new bh(var0, 4, var31 - -4, var6, var7, var3, var9.Cb, true, (ka) null);
									if (var28 == 0) {
										break label328;
									}
								}

								var22 = var9.a(true, var18, var31 - -4, var17, var16, 4, var19);
							}

							de.a(var8, var7, var3, var17, (ka) var22, (ka) null, 256, var31, 0, 0, var20);
						} else if (var2 == 8) {
							var23 = bg.c(var8, var7, var3);
							var30 = 8;
							if (var23 != 0L) {
								var30 = pa.a((int) (Integer.MAX_VALUE & (int) (var23 >>> -1721350816)), 0).U / 2;
							}

							Object var26;
							label268:
							{
								int var27 = var1 - -2 & 3;
								if (var9.Cb == -1 && var9.ints_mb == null) {
									var25 = var9.a(true, var18, var1 - -4, var17, var16, 4, var19);
									var26 = var9.a(true, var18, 4 + var27, var17, var16, 4, var19);
									if (var28 == 0) {
										break label268;
									}
								}

								var25 = new bh(var0, 4, var1 - -4, var6, var7, var3, var9.Cb, true, (ka) null);
								var26 = new bh(var0, 4, var27 - -4, var6, var7, var3, var9.Cb, true, (ka) null);
							}

							de.a(var8, var7, var3, var17, (ka) var25, (ka) var26, 256, var1, ea.ints_m[var1] * var30, l.ints_u[var1] * var30, var20);
						}
					}
				}
			} else {
				label281:
				{
					if (var9.Cb == -1 && var9.ints_mb == null) {
						var22 = var9.a((boolean) var5, var18, var1, var17, var16, 10, var19);
						if (var28 == 0) {
							break label281;
						}
					}

					var22 = new bh(var0, 10, var1, var6, var7, var3, var9.Cb, true, (ka) null);
				}

				if (var22 != null) {
					wd.a(var8, var7, var3, var17, var10, var11, (ka) var22, ~var2 == -12 ? 256 : 0, var20);
				}

				if (~var9.V != -1) {
					var4.a(var7, var10, (boolean) var5, var9.xb, var3, var11);
				}

			}
		} catch (RuntimeException var29) {
			throw ec.a(var29, "wh.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
		}
	}

	static {
		lf_h = lf_g;
		lf_j = lf_g;
		rc_i = new rc(30);
		tf_k = new tf();
		lf_m = dd.a("glow1:", 2);
		lf_l = lf_m;
		int_p = -1;
		lf_o = dd.a("Willkommen auf RuneScape", 2);
		lf_n = dd.a("<br>", 2);
		lf_q = lf_m;
	}
}
