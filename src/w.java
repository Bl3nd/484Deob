final class w implements Runnable {

	static lf lf_a = dd.a(" )2> <col=00ffff>", 2);
	static int int_b;
	static int int_c = 0;
	static int int_d;
	static u[] us_e = new u[2048];
	static int[] ints_f;
	static int[] ints_g;
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k;
	static int int_l = 0;
	static int int_m = 0;

	static final void a(int var0, int var1, int var2, int var3, int var4, lb var5, int var6, int var7) {
		int var27 = client.int_gc;

		try {
			++int_j;
			if (tf.boolean_q && (jc.bytes_q[0][var6][var7] & 2) == 0) {
				if ((16 & jc.bytes_q[var0][var6][var7]) != 0) {
					return;
				}

				if (rd.a(var7, (byte) -99, var0, var6) != rh.V) {
					return;
				}
			}

			if (var0 < ie.Lb) {
				ie.Lb = var0;
			}

			i var8;
			int var9;
			int var10;
			label582:
			{
				var8 = pa.a((int) var1, 0);
				if (~var2 == -2 || ~var2 == -4) {
					var10 = var8.L;
					var9 = var8.I;
					if (var27 == 0) {
						break label582;
					}
				}

				var9 = var8.L;
				var10 = var8.I;
			}

			if (var4 != 16) {
				int_c = -18;
			}

			int var11;
			int var12;
			label520:
			{
				if (~(var9 + var6) >= -105) {
					var12 = (1 + var9 >> -2096129503) + var6;
					var11 = (var9 >> -700148767) + var6;
					if (var27 == 0) {
						break label520;
					}
				}

				var12 = 1 + var6;
				var11 = var6;
			}

			int var13;
			int var14;
			label515:
			{
				if (~(var7 + var10) < -105) {
					var13 = var7;
					var14 = var7 + 1;
					if (var27 == 0) {
						break label515;
					}
				}

				var13 = var7 - -(var10 >> -1836499167);
				var14 = var7 + (1 + var10 >> -84370143);
			}

			int[][] var15 = u.vertexHeights[var0];
			int var17 = (var6 << 1862520295) + (var9 << -933080346);
			int var18 = (var10 << -1165905242) + (var7 << -1557203353);
			int var16 = var15[var12][var14] + var15[var11][var14] + var15[var12][var13] + var15[var11][var13] >> -2060975742;
			long var19 = (long) (1073741824 | var6 | var7 << -1763396281 | var3 << -862928626 | var2 << -1385579116);
			if (~var8.int_lb == -1) {
				var19 |= Long.MIN_VALUE;
			}

			if (~var8.M == -2) {
				var19 |= 4194304L;
			}

			var19 |= (long) var1 << -1727464096;
			if (var8.d(var4 + -17)) {
				qd.a(var2, -107, var7, var8, var0, var6);
			}

			Object var21;
			if (~var3 == -23) {
				if (!tf.boolean_q || var8.int_lb != 0 || var8.V == 1 || var8.boolean_kb) {
					label564:
					{
						if (~var8.Cb != 0 || var8.ints_mb != null) {
							var21 = new bh(var1, 22, var2, var0, var6, var7, var8.Cb, true, (ka) null);
							if (var27 == 0) {
								break label564;
							}
						}

						var21 = var8.a(var18, var17, 22, var2, -1, var16, var15);
					}

					sc.a(var0, var6, var7, var16, (ka) var21, var19);
					if (var8.V == 1 && var5 != null) {
						var5.a(var7, var6, (byte) 123);
					}

				}
			} else {
				int var22;
				if (var3 != 10 && ~var3 != -12) {
					if (~var3 <= -13) {
						label565:
						{
							if (~var8.Cb != 0 || var8.ints_mb != null) {
								var21 = new bh(var1, var3, var2, var0, var6, var7, var8.Cb, true, (ka) null);
								if (var27 == 0) {
									break label565;
								}
							}

							var21 = var8.a(var18, var17, var3, var2, -1, var16, var15);
						}

						wd.a(var0, var6, var7, var16, 1, 1, (ka) var21, 0, var19);
						if (var3 >= 12 && var3 <= 17 && ~var3 != -14 && ~var0 < -1) {
							uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 2340);
						}

						if (var8.V != 0 && var5 != null) {
							var5.a(var6, var9, true, var8.xb, var7, var10);
						}

					} else if (~var3 == -1) {
						label566:
						{
							if (var8.Cb != -1 || var8.ints_mb != null) {
								var21 = new bh(var1, 0, var2, var0, var6, var7, var8.Cb, true, (ka) null);
								if (var27 == 0) {
									break label566;
								}
							}

							var21 = var8.a(var18, var17, 0, var2, -1, var16, var15);
						}

						label541:
						{
							nf.a(var0, var6, var7, var16, (ka) var21, (ka) null, c.T[var2], 0, var19);
							if (var2 == 0) {
								if (var8.boolean_wb) {
									wb.bytes_s[var0][var6][var7] = 50;
									wb.bytes_s[var0][var6][1 + var7] = 50;
								}

								if (!var8.boolean_vb) {
									break label541;
								}

								uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 585);
								if (var27 == 0) {
									break label541;
								}
							}

							if (~var2 == -2) {
								if (var8.boolean_wb) {
									wb.bytes_s[var0][var6][1 + var7] = 50;
									wb.bytes_s[var0][var6 - -1][1 + var7] = 50;
								}

								if (!var8.boolean_vb) {
									break label541;
								}

								uc.Hb[var0][var6][var7 + 1] = d.c(uc.Hb[var0][var6][var7 + 1], 1170);
								if (var27 == 0) {
									break label541;
								}
							}

							if (var2 == 2) {
								if (var8.boolean_wb) {
									wb.bytes_s[var0][var6 - -1][var7] = 50;
									wb.bytes_s[var0][1 + var6][1 + var7] = 50;
								}

								if (!var8.boolean_vb) {
									break label541;
								}

								uc.Hb[var0][1 + var6][var7] = d.c(uc.Hb[var0][1 + var6][var7], 585);
								if (var27 == 0) {
									break label541;
								}
							}

							if (var2 == 3) {
								if (var8.boolean_wb) {
									wb.bytes_s[var0][var6][var7] = 50;
									wb.bytes_s[var0][1 + var6][var7] = 50;
								}

								if (var8.boolean_vb) {
									uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 1170);
								}
							}
						}

						if (~var8.V != -1 && var5 != null) {
							var5.a(var6, var8.xb, var2, -1, var3, var7);
						}

						if (var8.U != 16) {
							ub.a(var0, var6, var7, var8.U);
						}

					} else if (~var3 == -2) {
						label364:
						{
							if (var8.Cb == -1 && var8.ints_mb == null) {
								var21 = var8.a(var18, var17, 1, var2, -1, var16, var15);
								if (var27 == 0) {
									break label364;
								}
							}

							var21 = new bh(var1, 1, var2, var0, var6, var7, var8.Cb, true, (ka) null);
						}

						nf.a(var0, var6, var7, var16, (ka) var21, (ka) null, cc.U[var2], 0, var19);
						if (var8.boolean_wb) {
							label357:
							{
								if (~var2 != -1) {
									if (var2 == 1) {
										wb.bytes_s[var0][var6 + 1][1 + var7] = 50;
										if (var27 == 0) {
											break label357;
										}
									}

									if (var2 == 2) {
										wb.bytes_s[var0][1 + var6][var7] = 50;
										if (var27 == 0) {
											break label357;
										}
									}

									if (var2 != 3) {
										break label357;
									}

									wb.bytes_s[var0][var6][var7] = 50;
									if (var27 == 0) {
										break label357;
									}
								}

								wb.bytes_s[var0][var6][1 + var7] = 50;
							}
						}

						if (var8.V != 0 && var5 != null) {
							var5.a(var6, var8.xb, var2, -1, var3, var7);
						}

					} else {
						int var29;
						if (~var3 == -3) {
							Object var31;
							Object var32;
							label387:
							{
								var29 = 3 & var2 - -1;
								if (var8.Cb == -1 && var8.ints_mb == null) {
									var32 = var8.a(var18, var17, 2, var2 + 4, -1, var16, var15);
									var31 = var8.a(var18, var17, 2, var29, var4 ^ -17, var16, var15);
									if (var27 == 0) {
										break label387;
									}
								}

								var32 = new bh(var1, 2, var2 + 4, var0, var6, var7, var8.Cb, true, (ka) null);
								var31 = new bh(var1, 2, var29, var0, var6, var7, var8.Cb, true, (ka) null);
							}

							nf.a(var0, var6, var7, var16, (ka) var32, (ka) var31, c.T[var2], c.T[var29], var19);
							if (var8.boolean_vb) {
								label548:
								{
									if (var2 == 0) {
										uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 585);
										uc.Hb[var0][var6][1 + var7] = d.c(uc.Hb[var0][var6][1 + var7], 1170);
										if (var27 == 0) {
											break label548;
										}
									}

									if (var2 != 1) {
										if (~var2 != -3) {
											if (var2 != 3) {
												break label548;
											}

											uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 1170);
											uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 585);
											if (var27 == 0) {
												break label548;
											}
										}

										uc.Hb[var0][var6 - -1][var7] = d.c(uc.Hb[var0][var6 - -1][var7], 585);
										uc.Hb[var0][var6][var7] = d.c(uc.Hb[var0][var6][var7], 1170);
										if (var27 == 0) {
											break label548;
										}
									}

									uc.Hb[var0][var6][var7 - -1] = d.c(uc.Hb[var0][var6][var7 - -1], 1170);
									uc.Hb[var0][var6 + 1][var7] = d.c(uc.Hb[var0][var6 + 1][var7], 585);
								}
							}

							if (~var8.V != -1 && var5 != null) {
								var5.a(var6, var8.xb, var2, -1, var3, var7);
							}

							if (~var8.U != -17) {
								ub.a(var0, var6, var7, var8.U);
							}

						} else if (var3 == 3) {
							label567:
							{
								if (~var8.Cb != 0 || var8.ints_mb != null) {
									var21 = new bh(var1, 3, var2, var0, var6, var7, var8.Cb, true, (ka) null);
									if (var27 == 0) {
										break label567;
									}
								}

								var21 = var8.a(var18, var17, 3, var2, -1, var16, var15);
							}

							nf.a(var0, var6, var7, var16, (ka) var21, (ka) null, cc.U[var2], 0, var19);
							if (var8.boolean_wb) {
								label550:
								{
									if (~var2 == -1) {
										wb.bytes_s[var0][var6][var7 - -1] = 50;
										if (var27 == 0) {
											break label550;
										}
									}

									if (var2 == 1) {
										wb.bytes_s[var0][var6 + 1][var7 + 1] = 50;
										if (var27 == 0) {
											break label550;
										}
									}

									if (var2 == 2) {
										wb.bytes_s[var0][var6 - -1][var7] = 50;
										if (var27 == 0) {
											break label550;
										}
									}

									if (~var2 == -4) {
										wb.bytes_s[var0][var6][var7] = 50;
									}
								}
							}

							if (~var8.V != -1 && var5 != null) {
								var5.a(var6, var8.xb, var2, -1, var3, var7);
							}

						} else if (var3 == 9) {
							label419:
							{
								if (~var8.Cb == 0 && var8.ints_mb == null) {
									var21 = var8.a(var18, var17, var3, var2, -1, var16, var15);
									if (var27 == 0) {
										break label419;
									}
								}

								var21 = new bh(var1, var3, var2, var0, var6, var7, var8.Cb, true, (ka) null);
							}

							wd.a(var0, var6, var7, var16, 1, 1, (ka) var21, 0, var19);
							if (var8.V != 0 && var5 != null) {
								var5.a(var6, var9, true, var8.xb, var7, var10);
							}

							if (var8.U != 16) {
								ub.a(var0, var6, var7, var8.U);
							}

						} else if (var3 == 4) {
							label568:
							{
								if (~var8.Cb != 0 || var8.ints_mb != null) {
									var21 = new bh(var1, 4, var2, var0, var6, var7, var8.Cb, true, (ka) null);
									if (var27 == 0) {
										break label568;
									}
								}

								var21 = var8.a(var18, var17, 4, var2, var4 ^ -17, var16, var15);
							}

							de.a(var0, var6, var7, var16, (ka) var21, (ka) null, c.T[var2], 0, 0, 0, var19);
						} else {
							long var30;
							Object var33;
							if (var3 == 5) {
								var30 = bg.c(var0, var6, var7);
								var29 = 16;
								if (~var30 != -1L) {
									var29 = pa.a((int) ((int) (var30 >>> 861988960) & Integer.MAX_VALUE), 0).U;
								}

								label437:
								{
									if (var8.Cb == -1 && var8.ints_mb == null) {
										var33 = var8.a(var18, var17, 4, var2, -1, var16, var15);
										if (var27 == 0) {
											break label437;
										}
									}

									var33 = new bh(var1, 4, var2, var0, var6, var7, var8.Cb, true, (ka) null);
								}

								de.a(var0, var6, var7, var16, (ka) var33, (ka) null, c.T[var2], 0, ka.N[var2] * var29, wa.Lb[var2] * var29, var19);
							} else if (~var3 == -7) {
								var29 = 8;
								var30 = bg.c(var0, var6, var7);
								if (~var30 != -1L) {
									var29 = pa.a((int) (Integer.MAX_VALUE & (int) (var30 >>> -1081880992)), 0).U / 2;
								}

								label569:
								{
									if (var8.Cb != -1 || var8.ints_mb != null) {
										var33 = new bh(var1, 4, 4 + var2, var0, var6, var7, var8.Cb, true, (ka) null);
										if (var27 == 0) {
											break label569;
										}
									}

									var33 = var8.a(var18, var17, 4, var2 + 4, -1, var16, var15);
								}

								de.a(var0, var6, var7, var16, (ka) var33, (ka) null, 256, var2, ea.ints_m[var2] * var29, var29 * l.ints_u[var2], var19);
							} else if (~var3 == -8) {
								label457:
								{
									var22 = 2 + var2 & 3;
									if (var8.Cb == -1 && var8.ints_mb == null) {
										var21 = var8.a(var18, var17, 4, 4 + var22, -1, var16, var15);
										if (var27 == 0) {
											break label457;
										}
									}

									var21 = new bh(var1, 4, var22 - -4, var0, var6, var7, var8.Cb, true, (ka) null);
								}

								de.a(var0, var6, var7, var16, (ka) var21, (ka) null, 256, var22, 0, 0, var19);
							} else if (~var3 == -9) {
								var30 = bg.c(var0, var6, var7);
								var29 = 8;
								if (~var30 != -1L) {
									var29 = pa.a((int) (Integer.MAX_VALUE & (int) (var30 >>> -415186592)), 0).U / 2;
								}

								Object var25;
								label570:
								{
									int var26 = 2 + var2 & 3;
									if (var8.Cb != -1 || var8.ints_mb != null) {
										var33 = new bh(var1, 4, var2 + 4, var0, var6, var7, var8.Cb, true, (ka) null);
										var25 = new bh(var1, 4, 4 + var26, var0, var6, var7, var8.Cb, true, (ka) null);
										if (var27 == 0) {
											break label570;
										}
									}

									var33 = var8.a(var18, var17, 4, var2 + 4, var4 ^ -17, var16, var15);
									var25 = var8.a(var18, var17, 4, var26 + 4, -1, var16, var15);
								}

								de.a(var0, var6, var7, var16, (ka) var33, (ka) var25, 256, var2, ea.ints_m[var2] * var29, l.ints_u[var2] * var29, var19);
							}
						}
					}
				} else {
					label506:
					{
						if (var8.Cb == -1 && var8.ints_mb == null) {
							var21 = var8.a(var18, var17, 10, var2, -1, var16, var15);
							if (var27 == 0) {
								break label506;
							}
						}

						var21 = new bh(var1, 10, var2, var0, var6, var7, var8.Cb, true, (ka) null);
					}

					if (var21 != null && wd.a(var0, var6, var7, var16, var9, var10, (ka) var21, ~var3 != -12 ? 0 : 256, var19) && var8.boolean_wb) {
						var22 = 15;
						if (var21 instanceof ue) {
							var22 = ((ue) var21).c() / 4;
							if (var22 > 30) {
								var22 = 30;
							}
						}

						int var23 = 0;
						if (var27 != 0 || var9 >= var23) {
							do {
								int var24 = 0;
								if (var27 == 0 && ~var24 < ~var10) {
									++var23;
								} else {
									do {
										if (~var22 < ~wb.bytes_s[var0][var6 - -var23][var24 + var7]) {
											wb.bytes_s[var0][var6 + var23][var7 - -var24] = (byte) var22;
										}

										++var24;
									} while (~var24 >= ~var10);

									++var23;
								}
							} while (var9 >= var23);
						}
					}

					if (var8.V != 0 && var5 != null) {
						var5.a(var6, var9, true, var8.xb, var7, var10);
					}

				}
			}
		} catch (RuntimeException var28) {
			throw ec.a(var28, "w.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			ints_g = null;
			if (var0 != -92) {
				a(35, (vg) null, 61, 51);
			}

			ints_f = null;
			lf_a = null;
			us_e = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "w.C(" + var0 + ')');
		}
	}

	public final void run() {
		try {
			++int_i;

			try {
				while (true) {
					of var1;
					synchronized (f.W) {
						var1 = (of) f.W.c(122);
					}

					Object var46;
					if (var1 != null) {
						if (~var1.int_p != -1) {
							if (var1.int_p == 1) {
								var1.y = var1.wb_n.a((int) ((int) var1.long_e), (byte) 97);
								synchronized (f.W) {
									hc.tf_fb.a(var1, (int) 0);
								}
							}
						} else {
							var1.wb_n.a(var1.y, (int) var1.long_e, 255, var1.y.length);
							synchronized (f.W) {
								var1.a(true);
							}
						}

						synchronized (wa.Cb) {
							if (c.X > 1) {
								c.X = 600;
								continue;
							}

							c.X = 0;
							wa.Cb.notifyAll();
							return;
						}
					} else {
						fc.a(100L, 69);
						synchronized (wa.Cb) {
							if (~c.X >= -2) {
								c.X = 0;
								wa.Cb.notifyAll();
							} else {
								--c.X;
								continue;
							}

							return;
						}
					}
				}
			} catch (Exception var44) {
				ah.a((String) null, -80, var44);
			}
		} catch (RuntimeException var45) {
			throw ec.a(var45, "w.run(" + ')');
		}
	}

	static final void b(byte var0) {
		int var2 = client.int_gc;

		try {
			++int_h;
			jf var1 = (jf) q.tf_cb.c(82);
			if (var2 != 0) {
				if (var1.i_w != null) {
					var1.a(0);
				}

				var1 = (jf) q.tf_cb.d(-1);
			}

			for (; var1 != null; var1 = (jf) q.tf_cb.d(-1)) {
				if (var1.i_w != null) {
					var1.a(0);
				}
			}

			if (var0 > -122) {
				a(-53, (vg) null, 116, 50);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "w.A(" + var0 + ')');
		}
	}

	static final void a(int var0, vg var1, int var2, int var3) {
		int var14 = client.int_gc;

		try {
			int var4 = -46 / ((var0 - -24) / 57);
			if (var1.int_dc == 1) {
				++of.int_t;
				ba.a(var1.Z, 0, var1.lf_d, (short) 34, 0L, 500, sh.Gb);
			}

			++int_k;
			if (var1.int_dc == 2 && !nb.boolean_a) {
				lf var5 = ag.a(0, var1);
				if (var5 != null) {
					ba.a(var1.Z, -1, var5, (short) 28, 0L, 500, de.a(new lf[]{di.Q, var1.lf_ec}, 127));
					++vf.O;
				}
			}

			if (~var1.int_dc == -4) {
				++oa.int_fb;
				ba.a(var1.Z, 0, tc.lf_gb, (short) 16, 0L, 500, sh.Gb);
			}

			if (var1.int_dc == 4) {
				ba.a(var1.Z, 0, var1.lf_d, (short) 21, 0L, 500, sh.Gb);
				++ph.int_s;
			}

			if (var1.int_dc == 5) {
				++dh.int_f;
				ba.a(var1.Z, 0, var1.lf_d, (short) 10, 0L, 500, sh.Gb);
			}

			if (var1.int_dc == 6 && rb.vg_d == null) {
				ba.a(var1.Z, -1, var1.lf_d, (short) 36, 0L, 500, sh.Gb);
				++vg.Gc;
			}

			int var7;
			int var16;
			if (var1.int_ib == 2) {
				var16 = 0;
				int var6 = 0;
				if (var14 != 0 || var1.Ib > var6) {
					do {
						var7 = 0;
						if (var14 == 0 && ~var7 <= ~var1.int_ob) {
							++var6;
						} else {
							do {
								int var8 = (32 - -var1.int_m) * var7;
								int var9 = var6 * (var1.Dc + 32);
								if (var16 < 20) {
									var8 += var1.ints_db[var16];
									var9 += var1.ints_rb[var16];
								}

								if (~var8 >= ~var3 && var2 >= var9 && var3 < var8 - -32 && ~(var9 + 32) < ~var2) {
									af.vg_v = var1;
									rb.int_b = var16;
									if (var1.ints_gc[var16] > 0) {
										label324:
										{
											ie var10 = ng.a(-1 + var1.ints_gc[var16], (int) -4);
											if (pa.int_u != 1 || !bg.b((int) ne.a(var1, 113), (int) 16908)) {
												if (!nb.boolean_a || !bg.b((int) ne.a(var1, 99), (int) 16908)) {
													++oa.int_cb;
													lf[] var11 = var10.Fb;
													if (ai.boolean_h) {
														var11 = l.a((byte) -95, var11);
													}

													int var12;
													byte var13;
													if (bg.b((int) ne.a(var1, 120), (int) 16908)) {
														var12 = 4;
														if (var14 != 0 || var12 >= 3) {
															do {
																label229:
																{
																	if (var11 != null && var11[var12] != null) {
																		label222:
																		{
																			if (var12 != 3) {
																				var13 = 3;
																				if (var14 == 0) {
																					break label222;
																				}
																			}

																			var13 = 20;
																		}

																		ba.a(var1.Z, var16, var11[var12], var13, (long) var10.P, 500, de.a(new lf[]{ia.lf_b, var10.U}, -47));
																		++int_d;
																		if (var14 == 0) {
																			break label229;
																		}
																	}

																	if (var12 == 4) {
																		++di.int_db;
																		ba.a(var1.Z, var16, hh.V, (short) 3, (long) var10.P, 500, de.a(new lf[]{ia.lf_b, var10.U}, -32));
																	}
																}

																--var12;
															} while (var12 >= 3);
														}
													}

													if (tc.c(1, ne.a(var1, 120))) {
														ba.a(var1.Z, var16, ha.lf_o, (short) 17, (long) var10.P, 500, de.a(new lf[]{ia.lf_b, var10.U}, 122));
														++sh.int_s;
													}

													if (bg.b((int) ne.a(var1, 125), (int) 16908) && var11 != null) {
														var12 = 2;
														if (var14 != 0 || var12 >= 0) {
															do {
																if (var11[var12] != null) {
																	++u.yc;
																	var13 = 0;
																	if (~var12 == -1) {
																		var13 = 15;
																	}

																	if (~var12 == -2) {
																		var13 = 29;
																	}

																	if (~var12 == -3) {
																		var13 = 7;
																	}

																	ba.a(var1.Z, var16, var11[var12], var13, (long) var10.P, 500, de.a(new lf[]{ia.lf_b, var10.U}, 127));
																}

																--var12;
															} while (var12 >= 0);
														}
													}

													var11 = var1.zc;
													if (ai.boolean_h) {
														var11 = l.a((byte) -97, var11);
													}

													if (var11 != null) {
														var12 = 4;
														if (var14 != 0 || var12 >= 0) {
															do {
																if (var11[var12] != null) {
																	++rf.T;
																	var13 = 0;
																	if (var12 == 0) {
																		var13 = 39;
																	}

																	if (var12 == 1) {
																		var13 = 45;
																	}

																	if (var12 == 2) {
																		var13 = 24;
																	}

																	if (var12 == 3) {
																		var13 = 41;
																	}

																	if (~var12 == -5) {
																		var13 = 42;
																	}

																	ba.a(var1.Z, var16, var11[var12], var13, (long) var10.P, 500, de.a(new lf[]{ia.lf_b, var10.U}, -3));
																}

																--var12;
															} while (var12 >= 0);
														}
													}

													ba.a(var1.Z, var16, fd.lf_h, (short) 1005, (long) var10.P, 500, de.a(new lf[]{ia.lf_b, var10.U}, 117));
													if (var14 == 0) {
														break label324;
													}
												}

												if ((16 & qh.int_i) != 16) {
													break label324;
												}

												++rf.S;
												ba.a(var1.Z, var16, md.lf_d, (short) 46, (long) var10.P, 500, de.a(new lf[]{sd.U, j.O, var10.U}, -16));
												if (var14 == 0) {
													break label324;
												}
											}

											if (~kb.int_h != ~var1.Z || ~var16 != ~ef.int_f) {
												++tc.Z;
												ba.a(var1.Z, var16, ha.lf_o, (short) 4, (long) var10.P, 500, de.a(new lf[]{wb.lf_b, j.O, var10.U}, -73));
											}
										}
									}
								}

								++var16;
								++var7;
							} while (~var7 > ~var1.int_ob);

							++var6;
						}
					} while (var1.Ib > var6);
				}
			}

			if (var1.Bc) {
				if (nb.boolean_a) {
					if (ea.a(ne.a(var1, 99), 2547355) && (32 & qh.int_i) == 32) {
						++rb.int_a;
						ba.a(var1.Z, var1.Hb, md.lf_d, (short) 44, 0L, 500, de.a(new lf[]{sd.U, mc.y, var1.lf_g}, -90));
						return;
					}
				} else {
					var16 = 9;
					lf var17;
					if (var14 != 0 || var16 >= 5) {
						do {
							var17 = cc.a(var1, (byte) 107, var16);
							if (var17 != null) {
								ba.a(var1.Z, var1.Hb, var17, (short) 1002, (long) (var16 - -1), 500, var1.lf_g);
								++tf.int_o;
							}

							--var16;
						} while (var16 >= 5);
					}

					var17 = ag.a(0, var1);
					if (var17 != null) {
						ba.a(var1.Z, var1.Hb, var17, (short) 28, 0L, 500, var1.lf_g);
						++vf.O;
					}

					var7 = 4;
					if (var14 != 0 || var7 >= 0) {
						do {
							lf var18 = cc.a(var1, (byte) 115, var7);
							if (var18 != null) {
								ba.a(var1.Z, var1.Hb, var18, (short) 14, (long) (1 + var7), 500, var1.lf_g);
								++tf.int_o;
							}

							--var7;
						} while (var7 >= 0);
					}

					if (!e.a((byte) -19, ne.a(var1, 124))) {
						return;
					}

					ba.a(var1.Z, var1.Hb, me.lf_o, (short) 36, 0L, 500, sh.Gb);
					++vg.Gc;
				}

			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "w.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
}
