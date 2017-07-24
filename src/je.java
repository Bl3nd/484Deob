import java.util.Random;

final class je {

	private static lf lf_a = dd.a("Players", 2);
	static int int_b;
	static int int_c;
	static lf lf_d;
	static int int_e;
	static int int_f;
	static lf lf_g;
	static Random random_h;
	static int int_i;
	static qh qh_j;
	static int int_k;
	static lf lf_l;
	static short[][] shorts_m;
	static int int_n;

	static void a(db var0, int var1, db var2) {
		int var18 = client.int_gc;

		try {
			++int_c;
			if (tc.S == null) {
				tc.S = me.a(ld.sl_back, hd.cache8, (byte) 99, pf.Y);
			}

			if (td.V == null) {
				td.V = pb.a(pf.Y, 64, td.sl_flags, hd.cache8);
			}

			if (nb.dfs_m == null) {
				nb.dfs_m = pb.a(pf.Y, -95, ub.sl_arrows, hd.cache8);
			}

			if (ie.Nb == null) {
				ie.Nb = pb.a(pf.Y, -71, m.sl_stars, hd.cache8);
			}

			b.e(0, 23, 765, 480, 0);
			b.b(0, 0, 125, 23, 12425273, 9135624);
			b.b(125, 0, 640, 23, 5197647, 2697513);
			var0.c(gh.lf_eb, 62, 15, 0, -1);
			if (ie.Nb != null) {
				ie.Nb[1].a(140, 1);
				var2.a(pf.S, 152, 10, 16777215, -1);
				ie.Nb[0].a(140, 12);
				var2.a(lh.U, 152, 21, 16777215, -1);
			}

			if (nb.dfs_m != null) {
				short var3;
				short var4;
				label228:
				{
					var3 = 280;
					var4 = 390;
					if (r.ints_db[0] == 0 && ~ne.ints_h[0] == -1) {
						nb.dfs_m[2].a(var3, 4);
						if (var18 == 0) {
							break label228;
						}
					}

					nb.dfs_m[0].a(var3, 4);
				}

				label264:
				{
					if (r.ints_db[0] != 0 || ~ne.ints_h[0] != -2) {
						nb.dfs_m[1].a(15 + var3, 4);
						if (var18 == 0) {
							break label264;
						}
					}

					nb.dfs_m[3].a(var3 + 15, 4);
				}

				short var5;
				short var6;
				label261:
				{
					var5 = 500;
					var6 = 610;
					var0.a(d.lf_bb, var3 - -32, 17, 16777215, -1);
					if (~r.ints_db[0] != -2 || ne.ints_h[0] != 0) {
						nb.dfs_m[0].a(var4, 4);
						if (var18 == 0) {
							break label261;
						}
					}

					nb.dfs_m[2].a(var4, 4);
				}

				label206:
				{
					if (~r.ints_db[0] == -2 && ne.ints_h[0] == 1) {
						nb.dfs_m[3].a(var4 - -15, 4);
						if (var18 == 0) {
							break label206;
						}
					}

					nb.dfs_m[1].a(15 + var4, 4);
				}

				label262:
				{
					var0.a(lf_d, 32 + var4, 17, 16777215, -1);
					if (~r.ints_db[0] != -3 || ne.ints_h[0] != 0) {
						nb.dfs_m[0].a(var5, 4);
						if (var18 == 0) {
							break label262;
						}
					}

					nb.dfs_m[2].a(var5, 4);
				}

				label265:
				{
					if (~r.ints_db[0] != -3 || ~ne.ints_h[0] != -2) {
						nb.dfs_m[1].a(15 + var5, 4);
						if (var18 == 0) {
							break label265;
						}
					}

					nb.dfs_m[3].a(var5 + 15, 4);
				}

				label263:
				{
					var0.a(hd.lf_q, var5 + 32, 17, 16777215, -1);
					if (r.ints_db[0] != 3 || ne.ints_h[0] != 0) {
						nb.dfs_m[0].a(var6, 4);
						if (var18 == 0) {
							break label263;
						}
					}

					nb.dfs_m[2].a(var6, 4);
				}

				label266:
				{
					if (~r.ints_db[0] != -4 || ~ne.ints_h[0] != -2) {
						nb.dfs_m[1].a(15 + var6, 4);
						if (var18 == 0) {
							break label266;
						}
					}

					nb.dfs_m[3].a(var6 - -15, 4);
				}

				var0.a(fi.lf_v, 32 + var6, 17, 16777215, -1);
			}

			b.e(708, 4, 50, 16, 0);
			if (var1 >= 104) {
				var2.c(ff.lf_c, 733, 16, 16777215, -1);
				vd.Z = -1;
				if (tc.S != null) {
					byte var20 = 88;
					int var22 = 765 / (var20 + 1);
					byte var21 = 19;
					int var23 = 480 / (var21 - -1);

					int var7;
					int var8;
					do {
						var7 = var23;
						var8 = var22;
						if (~gb.int_fb >= ~(var23 * (var22 + -1))) {
							--var22;
						}

						if (gb.int_fb <= var22 * (var23 - 1)) {
							--var23;
						}

						if (var22 * (var23 - 1) >= gb.int_fb) {
							--var23;
						}
					} while (~var23 != ~var7 || ~var8 != ~var22);

					var7 = (765 - var22 * var20) / (1 + var22);
					if (var7 > 5) {
						var7 = 5;
					}

					int var9 = (765 + (-(var22 * var20) - var7 * (var22 + -1))) / 2;
					int var12 = var9;
					int var13 = 0;
					var8 = (480 - var23 * var21) / (var23 - -1);
					if (~var8 < -6) {
						var8 = 5;
					}

					int var10 = (-(var21 * var23) + 480 - var8 * (-1 + var23)) / 2;
					int var11 = var10 + 23;
					int var14 = 0;
					if (var18 != 0 || var14 < gb.int_fb) {
						do {
							fd var15;
							boolean var16;
							lf var17;
							label146:
							{
								var15 = sb.fds_j[var14];
								var16 = true;
								var17 = fa.a((byte) 85, var15.int_k);
								if (~var15.int_k != 0) {
									if (~var15.int_k >= -1981) {
										break label146;
									}

									var17 = pf.lf_mb;
									var16 = false;
									if (var18 == 0) {
										break label146;
									}
								}

								var16 = false;
								var17 = vh.lf_g;
							}

							label246:
							{
								if (c.int_bb >= var12 && lf.int_c >= var11 && ~(var20 + var12) < ~c.int_bb && ~lf.int_c > ~(var11 + var21) && var16) {
									vd.Z = var14;
									tc.S[!var15.boolean_p ? 0 : 1].e(var12, var11, 128, 16777215);
									if (var18 == 0) {
										break label246;
									}
								}

								tc.S[!var15.boolean_p ? 0 : 1].b(var12, var11);
							}

							if (td.V != null) {
								td.V[(var15.boolean_p ? 8 : 0) + var15.int_o].a(29 + var12, var11);
							}

							var0.c(fa.a((byte) 85, var15.int_r), 15 + var12, 5 + var21 / 2 + var11, 0, -1);
							var2.c(var17, var12 + 60, 5 + var21 / 2 + var11, 268435455, -1);
							var11 += var8 + var21;
							int var10000 = ~var23;
							++var13;
							if (var10000 >= ~var13) {
								var13 = 0;
								var12 += var7 - -var20;
								var11 = 23 + var10;
							}

							++var14;
						} while (var14 < gb.int_fb);

					}
				}
			}
		} catch (RuntimeException var19) {
			throw ec.a(var19, "je.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(byte var0) {
		try {
			random_h = null;
			qh_j = null;
			lf_a = null;
			lf_g = null;
			shorts_m = null;
			if (var0 != -71) {
				a(43, 9, (byte) -26, 64, 68);
			}

			lf_d = null;
			lf_l = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "je.A(" + var0 + ')');
		}
	}

	static db a(byte var0, int fileID, int var2, bg cache8, bg cache13) {
		try {
			if (var0 >= -44) {
				return null;
			} else {
				++int_f;
				return !wa.a(-21957, cache8, var2, fileID) ? null : re.a(cache13.a(0, var2, fileID), 0);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "je.D(" + var0 + ',' + fileID + ',' + var2 + ',' + (cache8 != null ? "{...}" : "null") + ',' + (cache13 != null ? "{...}" : "null") + ')');
		}
	}

	static void a(int var0, int var1, byte var2, int var3, int var4) {
		int var17 = client.int_gc;

		try {
			++int_i;
			rb.int_e = 0;
			int var5 = -40 % ((-50 - var2) / 57);
			int var6 = -1;
			int var21;
			if (var17 != 0 || ~(r.Y - -a.int_j) < ~var6) {
				do {
					Object var7;
					label359:
					{
						if (~var6 != 0) {
							if (r.Y > var6) {
								var7 = w.us_e[nd.ints_k[var6]];
								if (var17 == 0) {
									break label359;
								}
							}

							var7 = th.ps_g[a.ints_h[var6 + -r.Y]];
							if (var17 == 0) {
								break label359;
							}
						}

						var7 = r.X;
					}

					if (var7 != null && (((uc) var7).c(0) || var17 != 0)) {
						label407:
						{
							sd var8;
							if (var7 instanceof p) {
								var8 = ((p) var7).xc;
								if (var8.ints_db != null) {
									var8 = var8.b(-1);
								}

								if (var8 == null && var17 == 0) {
									break label407;
								}
							}

							label408:
							{
								if (r.Y <= var6) {
									var8 = ((p) var7).xc;
									if (var8.ints_db != null) {
										var8 = var8.b(-1);
									}

									if (~var8.V <= -1 && qd.kfs_b.length > var8.V) {
										pe.a(-25993, (uc) var7, ((uc) var7).d(-106) - -15);
										if (~th.int_c < 0) {
											qd.kfs_b[var8.V].a(var3 - -th.int_c + -12, -30 + var1 + uc.int_ic);
										}
									}

									if (~hg.int_a != -2 || cc.int_fb != a.ints_h[-r.Y + var6] || ~(pd.int_i % 20) <= -11) {
										break label408;
									}

									pe.a(-25993, (uc) var7, 15 + ((uc) var7).d(-112));
									if (~th.int_c >= 0) {
										break label408;
									}

									og.kfs_k[0].a(th.int_c + var3 - 12, -28 + var1 - -uc.int_ic);
									if (var17 == 0) {
										break label408;
									}
								}

								u var9 = (u) var7;
								var21 = 30;
								if (~var9.Mc != 0 || var9.Tc != -1) {
									pe.a(-25993, (uc) var7, ((uc) var7).d(-101) + 15);
									if (th.int_c > -1) {
										if (var9.Mc != -1) {
											n.kfs_k[var9.Mc].a(th.int_c + var3 + -12, uc.int_ic + (var1 - var21));
											var21 += 25;
										}

										if (~var9.Tc != 0) {
											qd.kfs_b[var9.Tc].a(-12 + th.int_c + var3, -var21 + uc.int_ic + var1);
											var21 += 25;
										}
									}
								}

								if (var6 >= 0 && ~hg.int_a == -11 && ~lb.F == ~nd.ints_k[var6]) {
									pe.a(-25993, (uc) var7, ((uc) var7).d(-102) - -15);
									if (~th.int_c < 0) {
										og.kfs_k[1].a(var3 + th.int_c - 12, -var21 + var1 + uc.int_ic);
									}
								}
							}

							if (((uc) var7).Sb != null && (~var6 <= ~r.Y || ~id.H == -1 || ~id.H == -4 || ~id.H == -2 && ca.a(((u) var7).Dc, -72))) {
								pe.a(-25993, (uc) var7, ((uc) var7).d(-101));
								if (th.int_c > -1 && dc.int_pb > rb.int_e) {
									dc.Z[rb.int_e] = ee.S.b(((uc) var7).Sb) / 2;
									dc.ints_nb[rb.int_e] = ee.S.Z;
									dc.T[rb.int_e] = th.int_c;
									dc.Q[rb.int_e] = uc.int_ic;
									dc.W[rb.int_e] = ((uc) var7).Fb;
									dc.ints_jb[rb.int_e] = ((uc) var7).Vb;
									dc.ints_cb[rb.int_e] = ((uc) var7).int_dc;
									dc.lfs_gb[rb.int_e] = ((uc) var7).Sb;
									++rb.int_e;
								}
							}

							if (pd.int_i < ((uc) var7).int_jc) {
								pe.a(-25993, (uc) var7, 15 + ((uc) var7).d(-117));
								if (th.int_c > -1) {
									b.e(var3 + th.int_c - 15, -3 + var1 + uc.int_ic, ((uc) var7).Wb, 5, '\uff00');
									b.e(var3 - -th.int_c - 15 + ((uc) var7).Wb, uc.int_ic + var1 + -3, -((uc) var7).Wb + 30, 5, 16711680);
								}
							}

							var21 = 0;
							if (var17 != 0 || ~var21 > -5) {
								do {
									if (((uc) var7).Gb[var21] > pd.int_i) {
										pe.a(-25993, (uc) var7, ((uc) var7).d(-73) / 2);
										if (~th.int_c < 0) {
											if (~var21 == -2) {
												uc.int_ic -= 20;
											}

											if (var21 == 2) {
												uc.int_ic -= 10;
												th.int_c -= 15;
											}

											if (var21 == 3) {
												uc.int_ic -= 10;
												th.int_c += 15;
											}

											pa.kfs_a[((uc) var7).Cb[var21]].a(-12 + th.int_c + var3, var1 + (uc.int_ic - 12));
											he.Q.c(fa.a((byte) 85, ((uc) var7).Kb[var21]), -1 + th.int_c + var3, 3 + uc.int_ic + var1, 16777215, 0);
										}
									}

									++var21;
								} while (~var21 > -5);
							}
						}
					}

					++var6;
				} while (~(r.Y - -a.int_j) < ~var6);
			}

			int var19 = 0;
			if (var17 != 0 || var19 < rb.int_e) {
				do {
					var21 = dc.T[var19];
					int var20 = dc.Q[var19];
					int var10 = dc.Z[var19];
					int var11 = dc.ints_nb[var19];
					boolean var12 = true;
					int var13;
					if (var17 != 0) {
						var12 = false;
						var13 = 0;
						if (var17 != 0 || ~var13 > ~var19) {
							do {
								if (dc.Q[var13] + -dc.ints_nb[var13] < 2 + var20 && var20 + -var11 < dc.Q[var13] + 2 && ~(dc.T[var13] - -dc.Z[var13]) < ~(var21 - var10) && ~(var21 - -var10) < ~(dc.T[var13] + -dc.Z[var13]) && ~var20 < ~(-dc.ints_nb[var13] + dc.Q[var13])) {
									var12 = true;
									var20 = dc.Q[var13] + -dc.ints_nb[var13];
								}

								++var13;
							} while (~var13 > ~var19);
						}
					}

					while (var12) {
						var12 = false;
						var13 = 0;
						if (var17 != 0 || ~var13 > ~var19) {
							while (true) {
								if (dc.Q[var13] + -dc.ints_nb[var13] < 2 + var20 && var20 + -var11 < dc.Q[var13] + 2 && ~(dc.T[var13] - -dc.Z[var13]) < ~(var21 - var10) && ~(var21 - -var10) < ~(dc.T[var13] + -dc.Z[var13]) && ~var20 < ~(-dc.ints_nb[var13] + dc.Q[var13])) {
									var12 = true;
									var20 = dc.Q[var13] + -dc.ints_nb[var13];
								}

								++var13;
								if (~var13 <= ~var19) {
									break;
								}
							}
						}
					}

					label248:
					{
						th.int_c = dc.T[var19];
						uc.int_ic = dc.Q[var19] = var20;
						lf var22 = dc.lfs_gb[var19];
						if (~fc.P == -1) {
							int var14 = 16776960;
							if (~dc.W[var19] > -7) {
								var14 = e.ints_c[dc.W[var19]];
							}

							if (dc.W[var19] == 6) {
								var14 = ~(fd.int_t % 20) <= -11 ? 16776960 : 16711680;
							}

							if (dc.W[var19] == 7) {
								var14 = ~(fd.int_t % 20) <= -11 ? '\uffff' : 255;
							}

							if (dc.W[var19] == 8) {
								var14 = ~(fd.int_t % 20) > -11 ? '뀀' : 8454016;
							}

							int var15;
							if (dc.W[var19] == 9) {
								label395:
								{
									var15 = -dc.ints_cb[var19] + 150;
									if (var15 < 50) {
										var14 = 16711680 - -(1280 * var15);
										if (var17 == 0) {
											break label395;
										}
									}

									if (var15 < 100) {
										var14 = 16776960 + -(327680 * (var15 + -50));
										if (var17 == 0) {
											break label395;
										}
									}

									if (~var15 > -151) {
										var14 = '\uff00' - -(5 * var15) - 500;
									}
								}
							}

							if (dc.W[var19] == 10) {
								label211:
								{
									var15 = -dc.ints_cb[var19] + 150;
									if (~var15 <= -51) {
										if (~var15 <= -101) {
											if (~var15 <= -151) {
												break label211;
											}

											var14 = 500 + -(var15 * 5) + -32768000 - -(var15 * 327680) + 255;
											if (var17 == 0) {
												break label211;
											}
										}

										var14 = -((var15 - 50) * 327680) + 16711935;
										if (var17 == 0) {
											break label211;
										}
									}

									var14 = 16711680 - -(5 * var15);
								}
							}

							if (dc.W[var19] == 11) {
								label404:
								{
									var15 = -dc.ints_cb[var19] + 150;
									if (~var15 > -51) {
										var14 = -(var15 * 327685) + 16777215;
										if (var17 == 0) {
											break label404;
										}
									}

									if (~var15 > -101) {
										var14 = -16384250 - -(var15 * 327685) + '\uff00';
										if (var17 == 0) {
											break label404;
										}
									}

									if (~var15 > -151) {
										var14 = 16777215 + -((var15 - 100) * 327680);
									}
								}
							}

							if (dc.ints_jb[var19] == 0) {
								ee.S.c(var22, th.int_c + var3, uc.int_ic + var1, var14, 0);
							}

							if (dc.ints_jb[var19] == 1) {
								ee.S.b(var22, th.int_c + var3, uc.int_ic + var1, var14, 0, fd.int_t);
							}

							if (~dc.ints_jb[var19] == -3) {
								ee.S.a(var22, th.int_c + var3, uc.int_ic + var1, var14, 0, fd.int_t);
							}

							if (dc.ints_jb[var19] == 3) {
								ee.S.a(var22, th.int_c + var3, var1 - -uc.int_ic, var14, 0, fd.int_t, 150 - dc.ints_cb[var19]);
							}

							if (dc.ints_jb[var19] == 4) {
								var15 = (-dc.ints_cb[var19] + 150) * (100 + ee.S.b(var22)) / 150;
								b.d(-50 + th.int_c + var3, var1, 50 + th.int_c + var3, var1 + var0);
								ee.S.a(var22, th.int_c + var3 - (-50 - -var15), uc.int_ic + var1, var14, 0);
								b.c(var3, var1, var3 - -var4, var1 + var0);
							}

							if (dc.ints_jb[var19] != 5) {
								break label248;
							}

							int var16;
							label239:
							{
								var15 = -dc.ints_cb[var19] + 150;
								var16 = 0;
								b.d(var3, -ee.S.Z + var1 + uc.int_ic - 1, var3 + var4, var1 - (-uc.int_ic - 5));
								if (var15 < 25) {
									var16 = -25 + var15;
									if (var17 == 0) {
										break label239;
									}
								}

								if (~var15 < -126) {
									var16 = -125 + var15;
								}
							}

							ee.S.c(var22, var3 - -th.int_c, var16 + (var1 - -uc.int_ic), var14, 0);
							b.c(var3, var1, var3 + var4, var0 + var1);
							if (var17 == 0) {
								break label248;
							}
						}

						ee.S.c(var22, var3 - -th.int_c, uc.int_ic + var1, 16776960, 0);
					}

					++var19;
				} while (var19 < rb.int_e);

			}
		} catch (RuntimeException var18) {
			throw ec.a(var18, "je.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static void a(kc var0, boolean var1) {
		try {
			if (var0.cd_p != null) {
				var0.cd_p.int_n = 0;
			}

			var0.boolean_n = false;
			kc var2 = var0.b();
			while (var2 != null) {
				a(var2, var1);
				var2 = var0.c();
			}

			if (!var1) {
				a(null, false);
			}

			++int_b;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "je.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static {
		lf_d = lf_a;
		lf_g = dd.a("Bitte laden Sie die Seite neu)3", 2);
		int_e = 0;
		random_h = new Random();
		lf_l = dd.a("Update)2Liste geladen)3", 2);
		shorts_m = new short[][]{{(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270}, {(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076, (short) 4574}};
		int_k = 0;
	}
}
