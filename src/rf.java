final class rf extends j {

	static int Q;
	static int R = 0;
	static int S;
	static int T;
	private static lf U = dd.a("Your account is already logged in)3", 2);
	private int V = 0;
	static bg W;
	static long[] X = new long[32];
	static int Y;
	static int Z;
	static int int_ab;
	static int int_bb;
	private static lf lf_cb;
	private int int_db = 4096;
	static int int_eb;
	static lf lf_fb;
	private static int int_gb;
	static int int_hb;
	static lf lf_ib;
	static int int_jb;
	static int int_kb;
	private static lf lf_lb;
	static lf lf_mb;

	public static void b(boolean var0) {
		try {
			lf_lb = null;
			lf_mb = null;
			W = null;
			lf_cb = null;
			lf_fb = null;
			X = null;
			if (var0) {
				lf_ib = null;
				U = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "rf.A(" + var0 + ')');
		}
	}

	static void a(ab var0, boolean var1) {
		v.tf_sb.a(var0, (int) 0);

		while (true) {
			ab var2 = (ab) v.tf_sb.a((byte) 99);
			if (var2 == null) {
				return;
			}

			if (var2.J) {
				int var3 = var2.int_w;
				int var4 = var2.int_n;
				int var5 = var2.int_v;
				int var6 = var2.F;
				ab[][] var7 = i.Ib[var5];
				ab var8;
				int var10;
				ed var11;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var20;
				boolean var21;
				ab var32;
				if (var2.B) {
					if (var1) {
						if (var5 > 0) {
							var8 = i.Ib[var5 - 1][var3][var4];
							if (var8 != null && var8.J) {
								continue;
							}
						}

						if (var3 <= ra.int_ab && var3 > ad.int_o) {
							var8 = var7[var3 - 1][var4];
							if (var8 != null && var8.J && (var8.B || (var2.x & 1) == 0)) {
								continue;
							}
						}

						if (var3 >= ra.int_ab && var3 < pa.int_d - 1) {
							var8 = var7[var3 + 1][var4];
							if (var8 != null && var8.J && (var8.B || (var2.x & 4) == 0)) {
								continue;
							}
						}

						if (var4 <= d.Z && var4 > cc.S) {
							var8 = var7[var3][var4 - 1];
							if (var8 != null && var8.J && (var8.B || (var2.x & 8) == 0)) {
								continue;
							}
						}

						if (var4 >= d.Z && var4 < d.V - 1) {
							var8 = var7[var3][var4 + 1];
							if (var8 != null && var8.J && (var8.B || (var2.x & 2) == 0)) {
								continue;
							}
						}
					} else {
						var1 = true;
					}

					var2.B = false;
					if (var2.A != null) {
						var8 = var2.A;
						if (var8.L != null) {
							if (!vh.a(0, var3, var4)) {
								od.a(var8.L, 0, pc.int_b, mf.C, ua.Q, ei.int_e, var3, var4);
							}
						} else if (var8.M != null && !vh.a(0, var3, var4)) {
							ph.a(var8.M, pc.int_b, mf.C, ua.Q, ei.int_e, var3, var4);
						}

						ba var9 = var8.H;
						if (var9 != null) {
							var9.ka_m.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var9.int_k - bg.int_l, var9.int_a - tc.int_lb, var9.int_i - pe.int_l, var9.long_h);
						}

						for (var10 = 0; var10 < var8.int_p; ++var10) {
							var11 = var8.eds_t[var10];
							if (var11 != null) {
								var11.ka_s.a(var11.int_q, pc.int_b, mf.C, ua.Q, ei.int_e, var11.int_n - bg.int_l, var11.int_k - tc.int_lb, var11.int_c - pe.int_l, var11.long_w);
							}
						}
					}

					var21 = false;
					if (var2.L != null) {
						if (!vh.a(var6, var3, var4)) {
							var21 = true;
							if (var2.L.int_e != 12345678 || ng.boolean_ab && var5 <= ad.int_l) {
								od.a(var2.L, var6, pc.int_b, mf.C, ua.Q, ei.int_e, var3, var4);
							}
						}
					} else if (var2.M != null && !vh.a(var6, var3, var4)) {
						var21 = true;
						ph.a(var2.M, pc.int_b, mf.C, ua.Q, ei.int_e, var3, var4);
					}

					var20 = 0;
					var10 = 0;
					ba var22 = var2.H;
					la var12 = var2.K;
					if (var22 != null || var12 != null) {
						if (ra.int_ab == var3) {
							++var20;
						} else if (ra.int_ab < var3) {
							var20 += 2;
						}

						if (d.Z == var4) {
							var20 += 3;
						} else if (d.Z > var4) {
							var20 += 6;
						}

						var10 = he.L[var20];
						var2.P = bi.P[var20];
					}

					if (var22 != null) {
						if ((var22.int_b & vg.Jc[var20]) != 0) {
							if (var22.int_b == 16) {
								var2.y = 3;
								var2.C = ah.ints_j[var20];
								var2.int_r = 3 - var2.C;
							} else if (var22.int_b == 32) {
								var2.y = 6;
								var2.C = pa.ints_v[var20];
								var2.int_r = 6 - var2.C;
							} else if (var22.int_b == 64) {
								var2.y = 12;
								var2.C = ad.ints_j[var20];
								var2.int_r = 12 - var2.C;
							} else {
								var2.y = 9;
								var2.C = qa.X[var20];
								var2.int_r = 9 - var2.C;
							}
						} else {
							var2.y = 0;
						}

						if ((var22.int_b & var10) != 0 && !md.a(var6, var3, var4, var22.int_b)) {
							var22.ka_m.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var22.int_k - bg.int_l, var22.int_a - tc.int_lb, var22.int_i - pe.int_l, var22.long_h);
						}

						if ((var22.int_l & var10) != 0 && !md.a(var6, var3, var4, var22.int_l)) {
							var22.ka_o.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var22.int_k - bg.int_l, var22.int_a - tc.int_lb, var22.int_i - pe.int_l, var22.long_h);
						}
					}

					if (var12 != null && !ce.a(var6, var3, var4, var12.ka_c.T)) {
						if ((var12.int_j & var10) != 0) {
							var12.ka_c.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var12.int_q - bg.int_l + var12.int_l, var12.int_a - tc.int_lb, var12.int_b - pe.int_l + var12.int_m, var12.long_i);
						} else if (var12.int_j == 256) {
							var13 = var12.int_q - bg.int_l;
							var14 = var12.int_a - tc.int_lb;
							var15 = var12.int_b - pe.int_l;
							var16 = var12.int_k;
							if (var16 != 1 && var16 != 2) {
								var17 = var13;
							} else {
								var17 = -var13;
							}

							if (var16 != 2 && var16 != 3) {
								var18 = var15;
							} else {
								var18 = -var15;
							}

							if (var18 < var17) {
								var12.ka_c.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var13 + var12.int_l, var14, var15 + var12.int_m, var12.long_i);
							} else if (var12.ka_d != null) {
								var12.ka_d.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var13, var14, var15, var12.long_i);
							}
						}
					}

					if (var21) {
						ei var27 = var2.D;
						if (var27 != null) {
							var27.ka_i.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var27.int_k - bg.int_l, var27.int_b - tc.int_lb, var27.int_f - pe.int_l, var27.long_l);
						}

						dg var31 = var2.O;
						if (var31 != null && var31.int_e == 0) {
							if (var31.ka_b != null) {
								var31.ka_b.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var31.int_c - bg.int_l, var31.int_h - tc.int_lb, var31.int_r - pe.int_l, var31.long_d);
							}

							if (var31.ka_i != null) {
								var31.ka_i.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var31.int_c - bg.int_l, var31.int_h - tc.int_lb, var31.int_r - pe.int_l, var31.long_d);
							}

							if (var31.ka_g != null) {
								var31.ka_g.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var31.int_c - bg.int_l, var31.int_h - tc.int_lb, var31.int_r - pe.int_l, var31.long_d);
							}
						}
					}

					var13 = var2.x;
					if (var13 != 0) {
						if (var3 < ra.int_ab && (var13 & 4) != 0) {
							var32 = var7[var3 + 1][var4];
							if (var32 != null && var32.J) {
								v.tf_sb.a(var32, (int) 0);
							}
						}

						if (var4 < d.Z && (var13 & 2) != 0) {
							var32 = var7[var3][var4 + 1];
							if (var32 != null && var32.J) {
								v.tf_sb.a(var32, (int) 0);
							}
						}

						if (var3 > ra.int_ab && (var13 & 1) != 0) {
							var32 = var7[var3 - 1][var4];
							if (var32 != null && var32.J) {
								v.tf_sb.a(var32, (int) 0);
							}
						}

						if (var4 > d.Z && (var13 & 8) != 0) {
							var32 = var7[var3][var4 - 1];
							if (var32 != null && var32.J) {
								v.tf_sb.a(var32, (int) 0);
							}
						}
					}
				}

				ba var23;
				if (var2.y != 0) {
					var21 = true;

					for (var20 = 0; var20 < var2.int_p; ++var20) {
						if (var2.eds_t[var20].int_e != kh.V && (var2.E[var20] & var2.y) == var2.C) {
							var21 = false;
							break;
						}
					}

					if (var21) {
						var23 = var2.H;
						if (!md.a(var6, var3, var4, var23.int_b)) {
							var23.ka_m.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var23.int_k - bg.int_l, var23.int_a - tc.int_lb, var23.int_i - pe.int_l, var23.long_h);
						}

						var2.y = 0;
					}
				}

				int var24;
				int var26;
				if (var2.boolean_u) {
					try {
						int var25 = var2.int_p;
						var2.boolean_u = false;
						var20 = 0;

						label541:
						for (var10 = 0; var10 < var25; ++var10) {
							var11 = var2.eds_t[var10];
							if (var11.int_e != kh.V) {
								for (var26 = var11.int_u; var26 <= var11.int_a; ++var26) {
									for (var13 = var11.int_f; var13 <= var11.int_r; ++var13) {
										var32 = var7[var26][var13];
										if (var32.B) {
											var2.boolean_u = true;
											continue label541;
										}

										if (var32.y != 0) {
											var15 = 0;
											if (var26 > var11.int_u) {
												++var15;
											}

											if (var26 < var11.int_a) {
												var15 += 4;
											}

											if (var13 > var11.int_f) {
												var15 += 8;
											}

											if (var13 < var11.int_r) {
												var15 += 2;
											}

											if ((var15 & var32.y) == var2.int_r) {
												var2.boolean_u = true;
												continue label541;
											}
										}
									}
								}

								f.eds_bb[var20++] = var11;
								var13 = ra.int_ab - var11.int_u;
								var14 = var11.int_a - ra.int_ab;
								if (var14 > var13) {
									var13 = var14;
								}

								var15 = d.Z - var11.int_f;
								var16 = var11.int_r - d.Z;
								if (var16 > var15) {
									var11.int_j = var13 + var16;
								} else {
									var11.int_j = var13 + var15;
								}
							}
						}

						while (var20 > 0) {
							var24 = -50;
							var26 = -1;

							ed var33;
							for (var13 = 0; var13 < var20; ++var13) {
								var33 = f.eds_bb[var13];
								if (var33.int_e != kh.V) {
									if (var33.int_j > var24) {
										var24 = var33.int_j;
										var26 = var13;
									} else if (var33.int_j == var24) {
										var15 = var33.int_n - bg.int_l;
										var16 = var33.int_c - pe.int_l;
										var17 = f.eds_bb[var26].int_n - bg.int_l;
										var18 = f.eds_bb[var26].int_c - pe.int_l;
										if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
											var26 = var13;
										}
									}
								}
							}

							if (var26 == -1) {
								break;
							}

							var33 = f.eds_bb[var26];
							var33.int_e = kh.V;
							if (!ag.a(var6, var33.int_u, var33.int_a, var33.int_f, var33.int_r, var33.ka_s.T)) {
								var33.ka_s.a(var33.int_q, pc.int_b, mf.C, ua.Q, ei.int_e, var33.int_n - bg.int_l, var33.int_k - tc.int_lb, var33.int_c - pe.int_l, var33.long_w);
							}

							for (var15 = var33.int_u; var15 <= var33.int_a; ++var15) {
								for (var16 = var33.int_f; var16 <= var33.int_r; ++var16) {
									ab var34 = var7[var15][var16];
									if (var34.y != 0) {
										v.tf_sb.a(var34, (int) 0);
									} else if ((var15 != var3 || var16 != var4) && var34.J) {
										v.tf_sb.a(var34, (int) 0);
									}
								}
							}
						}

						if (var2.boolean_u) {
							continue;
						}
					} catch (Exception var19) {
						var2.boolean_u = false;
					}
				}

				if (var2.J && var2.y == 0) {
					if (var3 <= ra.int_ab && var3 > ad.int_o) {
						var8 = var7[var3 - 1][var4];
						if (var8 != null && var8.J) {
							continue;
						}
					}

					if (var3 >= ra.int_ab && var3 < pa.int_d - 1) {
						var8 = var7[var3 + 1][var4];
						if (var8 != null && var8.J) {
							continue;
						}
					}

					if (var4 <= d.Z && var4 > cc.S) {
						var8 = var7[var3][var4 - 1];
						if (var8 != null && var8.J) {
							continue;
						}
					}

					if (var4 >= d.Z && var4 < d.V - 1) {
						var8 = var7[var3][var4 + 1];
						if (var8 != null && var8.J) {
							continue;
						}
					}

					var2.J = false;
					--de.int_u;
					dg var29 = var2.O;
					if (var29 != null && var29.int_e != 0) {
						if (var29.ka_b != null) {
							var29.ka_b.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var29.int_c - bg.int_l, var29.int_h - tc.int_lb - var29.int_e, var29.int_r - pe.int_l, var29.long_d);
						}

						if (var29.ka_i != null) {
							var29.ka_i.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var29.int_c - bg.int_l, var29.int_h - tc.int_lb - var29.int_e, var29.int_r - pe.int_l, var29.long_d);
						}

						if (var29.ka_g != null) {
							var29.ka_g.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var29.int_c - bg.int_l, var29.int_h - tc.int_lb - var29.int_e, var29.int_r - pe.int_l, var29.long_d);
						}
					}

					if (var2.P != 0) {
						la var28 = var2.K;
						if (var28 != null && !ce.a(var6, var3, var4, var28.ka_c.T)) {
							if ((var28.int_j & var2.P) != 0) {
								var28.ka_c.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var28.int_q - bg.int_l + var28.int_l, var28.int_a - tc.int_lb, var28.int_b - pe.int_l + var28.int_m, var28.long_i);
							} else if (var28.int_j == 256) {
								var10 = var28.int_q - bg.int_l;
								var24 = var28.int_a - tc.int_lb;
								var26 = var28.int_b - pe.int_l;
								var13 = var28.int_k;
								if (var13 != 1 && var13 != 2) {
									var14 = var10;
								} else {
									var14 = -var10;
								}

								if (var13 != 2 && var13 != 3) {
									var15 = var26;
								} else {
									var15 = -var26;
								}

								if (var15 >= var14) {
									var28.ka_c.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var10 + var28.int_l, var24, var26 + var28.int_m, var28.long_i);
								} else if (var28.ka_d != null) {
									var28.ka_d.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var10, var24, var26, var28.long_i);
								}
							}
						}

						var23 = var2.H;
						if (var23 != null) {
							if ((var23.int_l & var2.P) != 0 && !md.a(var6, var3, var4, var23.int_l)) {
								var23.ka_o.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var23.int_k - bg.int_l, var23.int_a - tc.int_lb, var23.int_i - pe.int_l, var23.long_h);
							}

							if ((var23.int_b & var2.P) != 0 && !md.a(var6, var3, var4, var23.int_b)) {
								var23.ka_m.a(0, pc.int_b, mf.C, ua.Q, ei.int_e, var23.int_k - bg.int_l, var23.int_a - tc.int_lb, var23.int_i - pe.int_l, var23.long_h);
							}
						}
					}

					ab var30;
					if (var5 < ec.int_bb - 1) {
						var30 = i.Ib[var5 + 1][var3][var4];
						if (var30 != null && var30.J) {
							v.tf_sb.a(var30, (int) 0);
						}
					}

					if (var3 < ra.int_ab) {
						var30 = var7[var3 + 1][var4];
						if (var30 != null && var30.J) {
							v.tf_sb.a(var30, (int) 0);
						}
					}

					if (var4 < d.Z) {
						var30 = var7[var3][var4 + 1];
						if (var30 != null && var30.J) {
							v.tf_sb.a(var30, (int) 0);
						}
					}

					if (var3 > ra.int_ab) {
						var30 = var7[var3 - 1][var4];
						if (var30 != null && var30.J) {
							v.tf_sb.a(var30, (int) 0);
						}
					}

					if (var4 > d.Z) {
						var30 = var7[var3][var4 - 1];
						if (var30 != null && var30.J) {
							v.tf_sb.a(var30, (int) 0);
						}
					}
				}
			}
		}
	}

	static void d(byte var0) {
		try {
			if (wc.Q != null) {
				synchronized (wc.Q) {
					wc.Q = null;
				}
			}

			++Q;
			if (var0 != -48) {
				R = 34;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rf.I(" + var0 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			++int_bb;
			if (var1 < -120) {
				if (~var2 != -1) {
					if (var2 == 1) {
						this.int_db = var3.b(true);
						return;
					}

					if (~var2 != -3) {
						return;
					}

					if (client.int_gc == 0) {
						super.x = ~var3.j((byte) 109) == -2;
						return;
					}
				}

				this.V = var3.b(true);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rf.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static void a(int var0, int var1, int var2, int var3, byte var4, int var5) {
		try {
			++int_hb;
			int var6 = (-32 + var5) * var5 / var2;
			if (var6 < 8) {
				var6 = 8;
			}

			if (var4 < 85) {
				a((lf) null, (bg) null, (byte) -119, (lf) null);
			}

			dg.dfs_s[0].a(var3, var0);
			int var7 = (var5 + -32 - var6) * var1 / (var2 + -var5);
			dg.dfs_s[1].a(var3, var0 - (-var5 - -16));
			b.e(var3, var0 + 16, 16, var5 - 32, int_gb);
			b.e(var3, var7 + var0 - -16, 16, var6, r.int_ab);
			b.b(var3, var7 + 16 + var0, var6, oa.Y);
			b.b(1 + var3, var7 + 16 + var0, var6, oa.Y);
			b.a(var3, 16 + var0 + var7, 16, oa.Y);
			b.a(var3, var7 + 17 + var0, 16, oa.Y);
			b.b(15 + var3, var7 + var0 - -16, var6, c.int_ib);
			b.b(14 + var3, var7 + 17 + var0, -1 + var6, c.int_ib);
			b.a(var3, var7 + (15 + var0 - -var6), 16, c.int_ib);
			b.a(1 + var3, var0 - (-14 - var7 - var6), 15, c.int_ib);
		} catch (RuntimeException var8) {
			throw ec.a(var8, "rf.H(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	public rf() {
		super(1, false);
	}

	final int[][] b(int var1, int var2) {
		int var15 = client.int_gc;

		try {
			if (var2 != 2177) {
				this.a(-104, 5);
			}

			++int_ab;
			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int[][] var4 = this.a(false, var1, 0);
				int[] var5 = var4[0];
				int[] var7 = var4[2];
				int[] var6 = var4[1];
				int[] var8 = var3[0];
				int[] var9 = var3[1];
				int[] var10 = var3[2];
				int var11 = 0;
				if (var15 != 0 || var11 < ff.int_a) {
					do {
						int var13;
						int var14;
						label76:
						{
							var14 = var7[var11];
							int var12 = var5[var11];
							var13 = var6[var11];
							if (this.V > var12) {
								var8[var11] = this.V;
								if (var15 == 0) {
									break label76;
								}
							}

							if (var12 <= this.int_db) {
								var8[var11] = var12;
								if (var15 == 0) {
									break label76;
								}
							}

							var8[var11] = this.int_db;
						}

						label77:
						{
							if (this.V > var13) {
								var9[var11] = this.V;
								if (var15 == 0) {
									break label77;
								}
							}

							if (this.int_db >= var13) {
								var9[var11] = var13;
								if (var15 == 0) {
									break label77;
								}
							}

							var9[var11] = this.int_db;
						}

						label38:
						{
							if (this.V <= var14) {
								if (~var14 < ~this.int_db) {
									var10[var11] = this.int_db;
									if (var15 == 0) {
										break label38;
									}
								}

								var10[var11] = var14;
								if (var15 == 0) {
									break label38;
								}
							}

							var10[var11] = this.V;
						}

						++var11;
					} while (var11 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var16) {
			throw ec.a(var16, "rf.E(" + var1 + ',' + var2 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var7 = client.int_gc;

		try {
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int[] var4 = this.a((int) var2, -128, 0);
				int var5 = 0;
				if (var7 != 0 || ff.int_a > var5) {
					do {
						label29:
						{
							int var6 = var4[var5];
							if (~var6 <= ~this.V) {
								if (~this.int_db <= ~var6) {
									var3[var5] = var6;
									if (var7 == 0) {
										break label29;
									}
								}

								var3[var5] = this.int_db;
								if (var7 == 0) {
									break label29;
								}
							}

							var3[var5] = this.V;
						}

						++var5;
					} while (ff.int_a > var5);
				}
			}

			++int_kb;
			if (var1 > -49) {
				lf_cb = null;
			}

			return var3;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "rf.G(" + var1 + ',' + var2 + ')');
		}
	}

	static lf c(int var0, int var1) {
		try {
			if (var1 != 2) {
				X = null;
			}

			++int_jb;
			return ~var0 > -100001 ? de.a(new lf[]{ra.T, fa.a((byte) 85, var0), jc.lf_o}, -80) : (~var0 > -10000001 ? de.a(new lf[]{fi.lf_s, fa.a((byte) 85, var0 / 1000), fb.lf_b, jc.lf_o}, 124) : de.a(new lf[]{u.Bc, fa.a((byte) 85, var0 / 1000000), bc.lf_s, jc.lf_o}, -77));
		} catch (RuntimeException var3) {
			throw ec.a(var3, "rf.C(" + var0 + ',' + var1 + ')');
		}
	}

	static df a(lf var0, bg var1, byte var2, lf var3) {
		try {
			int var4 = var1.a((byte) 106, var3);
			if (var2 != 75) {
				a(118, -110, 69, 6, (byte) 34, -90);
			}

			++Y;
			int var5 = var1.a((byte) -41, var0, var4);
			return rd.a(var4, false, var5, var1);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "rf.B(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_fb = U;
		int_eb = 0;
		lf_cb = dd.a("go back to the main RuneScape webpage", 2);
		int_gb = 2301979;
		lf_mb = lf_cb;
		lf_lb = dd.a("Loaded title screen", 2);
		lf_ib = lf_lb;
	}
}
