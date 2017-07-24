final class fd {

	static int int_a;
	static lf p12_full = dd.a("p12_full", 2);//lf_b
	lf lf_c;
	static int int_d;
	static lf lf_e;
	static lf duelfriendFlag = dd.a(":duelfriend:", 2);//lf_f
	static lf lf_g;
	static lf lf_h;
	int int_i;
	static bg cache3;//bg_j
	int int_k;
	static da da_l;
	static int int_m;
	private static lf lf_n = dd.a("Examine", 2);
	int int_o;
	boolean boolean_p;
	static int int_q;
	int int_r;
	static nd nd_s;
	static int int_t;
	static int int_u;
	static int int_v;

	static fi a(int var0, int var1, boolean var2, int var3) {
		try {
			if (!var2) {
				return null;
			} else {
				++int_v;
				fi var4 = new fi();
				var4.x = var0;
				var4.int_n = var3;
				ma.eh_e.a((long) var1, false, var4);
				wb.a((byte) 58, var3);
				bc.f(2000000, var3);
				vg var5 = ra.a(var1, (byte) 125);
				if (var5 != null) {
					mc.a(var5, -23101);
				}

				if (rb.vg_d != null) {
					mc.a(rb.vg_d, -23101);
					rb.vg_d = null;
				}

				f.boolean_ab = false;
				qa.int_eb = 0;
				v.a(ng.M, lb.E, la.int_e, lh.I, 188);
				if (ac.int_ab != -1) {
					ce.c(1, 106, ac.int_ab);
				}

				return var4;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "fd.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11) {
		int var28 = client.int_gc;

		try {
			int var12 = 0;
			int var13;
			if (var28 != 0) {
				var13 = 0;
				if (var28 == 0 && var13 >= 104) {
					++var12;
				} else {
					while (true) {
						qb.ints_hb[var12][var13] = 0;
						jh.ints_b[var12][var13] = 99999999;
						++var13;
						if (var13 >= 104) {
							++var12;
							break;
						}
					}
				}
			}

			while (var12 < 104) {
				var13 = 0;
				if (var28 == 0 && var13 >= 104) {
					++var12;
				} else {
					do {
						qb.ints_hb[var12][var13] = 0;
						jh.ints_b[var12][var13] = 99999999;
						++var13;
					} while (var13 < 104);

					++var12;
				}
			}

			qb.ints_hb[var7][var6] = 99;
			++int_d;
			var13 = var7;
			jh.ints_b[var7][var6] = 0;
			int var14 = var6;
			byte var15 = 0;
			ua.ints_g[var15] = var7;
			int var30 = var15 + 1;
			c.ints_lb[var15] = var6;
			int var16 = var0;
			boolean var17 = false;
			int var18 = ua.ints_g.length;
			int[][] var19 = sb.lbs_e[hc.int_pb].ints_g;
			int var20;
			if (var28 != 0 || ~var30 != ~var0) {
				do {
					var13 = ua.ints_g[var16];
					var14 = c.ints_lb[var16];
					var16 = (var16 + 1) % var18;
					if (~var13 == ~var3 && var14 == var9) {
						var17 = true;
						if (var28 == 0) {
							break;
						}
					}

					if (var10 != 0) {
						label410:
						{
							if (var10 >= 5 && ~var10 != -11 || !sb.lbs_e[hc.int_pb].a(var13, var9, (byte) 33, -1 + var10, var3, var14, var4)) {
								if (var10 >= 10 || !sb.lbs_e[hc.int_pb].a(32, var13, (int) var9, -1 + var10, var3, var14, var4)) {
									break label410;
								}

								var17 = true;
								if (var28 == 0) {
									break;
								}
							}

							var17 = true;
							if (var28 == 0) {
								break;
							}
						}
					}

					if (~var1 != -1 && ~var2 != -1 && sb.lbs_e[hc.int_pb].a(var1, var3, var14, var11, var2, (byte) 125, var9, var13)) {
						var17 = true;
						if (var28 == 0) {
							break;
						}
					}

					var20 = 1 + jh.ints_b[var13][var14];
					if (var13 > 0 && ~qb.ints_hb[var13 + -1][var14] == -1 && (19661064 & var19[var13 - 1][var14]) == 0) {
						ua.ints_g[var30] = -1 + var13;
						c.ints_lb[var30] = var14;
						var30 = (1 + var30) % var18;
						qb.ints_hb[var13 + -1][var14] = 2;
						jh.ints_b[-1 + var13][var14] = var20;
					}

					if (~var13 > -104 && ~qb.ints_hb[var13 - -1][var14] == -1 && ~(var19[1 + var13][var14] & 19661184) == -1) {
						ua.ints_g[var30] = 1 + var13;
						c.ints_lb[var30] = var14;
						var30 = (var30 - -1) % var18;
						qb.ints_hb[1 + var13][var14] = 8;
						jh.ints_b[var13 - -1][var14] = var20;
					}

					if (~var14 < -1 && ~qb.ints_hb[var13][-1 + var14] == -1 && (var19[var13][var14 - 1] & 19661058) == 0) {
						ua.ints_g[var30] = var13;
						c.ints_lb[var30] = var14 - 1;
						var30 = (var30 + 1) % var18;
						qb.ints_hb[var13][var14 + -1] = 1;
						jh.ints_b[var13][var14 + -1] = var20;
					}

					if (~var14 > -104 && qb.ints_hb[var13][var14 - -1] == 0 && ~(19661088 & var19[var13][1 + var14]) == -1) {
						ua.ints_g[var30] = var13;
						c.ints_lb[var30] = 1 + var14;
						qb.ints_hb[var13][var14 + 1] = 4;
						jh.ints_b[var13][var14 - -1] = var20;
						var30 = (1 + var30) % var18;
					}

					if (var13 > 0 && ~var14 < -1 && ~qb.ints_hb[var13 - 1][-1 + var14] == -1 && (var19[-1 + var13][-1 + var14] & 19661070) == 0 && ~(var19[-1 + var13][var14] & 19661064) == -1 && (19661058 & var19[var13][-1 + var14]) == 0) {
						ua.ints_g[var30] = var13 + -1;
						c.ints_lb[var30] = var14 + -1;
						var30 = (1 + var30) % var18;
						qb.ints_hb[var13 - 1][var14 + -1] = 3;
						jh.ints_b[-1 + var13][var14 + -1] = var20;
					}

					if (var13 < 103 && ~var14 < -1 && qb.ints_hb[var13 + 1][-1 + var14] == 0 && (var19[var13 - -1][-1 + var14] & 19661187) == 0 && ~(var19[var13 - -1][var14] & 19661184) == -1 && ~(var19[var13][-1 + var14] & 19661058) == -1) {
						ua.ints_g[var30] = var13 - -1;
						c.ints_lb[var30] = var14 - 1;
						var30 = (var30 + 1) % var18;
						qb.ints_hb[1 + var13][var14 + -1] = 9;
						jh.ints_b[1 + var13][var14 + -1] = var20;
					}

					if (~var13 < -1 && ~var14 > -104 && qb.ints_hb[var13 + -1][var14 + 1] == 0 && ~(var19[var13 + -1][var14 + 1] & 19661112) == -1 && (19661064 & var19[var13 - 1][var14]) == 0 && ~(var19[var13][1 + var14] & 19661088) == -1) {
						ua.ints_g[var30] = -1 + var13;
						c.ints_lb[var30] = 1 + var14;
						var30 = (var30 - -1) % var18;
						qb.ints_hb[var13 - 1][1 + var14] = 6;
						jh.ints_b[-1 + var13][var14 + 1] = var20;
					}

					if (~var13 > -104 && ~var14 > -104 && ~qb.ints_hb[1 + var13][1 + var14] == -1 && ~(19661280 & var19[1 + var13][var14 + 1]) == -1 && (19661184 & var19[1 + var13][var14]) == 0 && (19661088 & var19[var13][var14 + 1]) == 0) {
						ua.ints_g[var30] = var13 - -1;
						c.ints_lb[var30] = var14 + 1;
						var30 = (1 + var30) % var18;
						qb.ints_hb[var13 - -1][1 + var14] = 12;
						jh.ints_b[var13 + 1][var14 - -1] = var20;
					}
				} while (~var30 != ~var16);
			}

			id.x = 0;
			int var21;
			int var23;
			int var24;
			if (!var17) {
				if (!var8) {
					return false;
				}

				var20 = 1000;
				byte var22 = 10;
				var21 = 100;
				var23 = -var22 + var3;
				if (var28 != 0 || ~var23 >= ~(var3 - -var22)) {
					do {
						var24 = -var22 + var9;
						if (var28 == 0 && ~(var22 + var9) > ~var24) {
							++var23;
						} else {
							do {
								if (~var23 <= -1 && ~var24 <= -1 && ~var23 > -105 && ~var24 > -105 && ~jh.ints_b[var23][var24] > -101) {
									int var25;
									int var26;
									label248:
									{
										var26 = 0;
										var25 = 0;
										if (var3 <= var23) {
											if (~(-1 + var1 + var3) <= ~var23) {
												break label248;
											}

											var25 = var23 + 1 + (-var3 - var1);
											if (var28 == 0) {
												break label248;
											}
										}

										var25 = var3 - var23;
									}

									label241:
									{
										if (~var24 > ~var9) {
											var26 = -var24 + var9;
											if (var28 == 0) {
												break label241;
											}
										}

										if (var24 > -1 + var2 + var9) {
											var26 = 1 - var9 + -var2 + var24;
										}
									}

									int var27 = var26 * var26 + var25 * var25;
									if (~var20 < ~var27 || var27 == var20 && ~jh.ints_b[var23][var24] > ~var21) {
										var20 = var27;
										var14 = var24;
										var21 = jh.ints_b[var23][var24];
										var13 = var23;
									}
								}

								++var24;
							} while (~(var22 + var9) <= ~var24);

							++var23;
						}
					} while (~var23 >= ~(var3 - -var22));
				}

				if (~var20 == -1001) {
					return false;
				}

				if (var7 == var13 && ~var14 == ~var6) {
					return false;
				}

				id.x = 1;
			}

			byte var31 = 0;
			ua.ints_g[var31] = var13;
			var16 = var31 + 1;
			c.ints_lb[var31] = var14;
			var20 = var21 = qb.ints_hb[var13][var14];
			if (var28 != 0) {
				if (var21 != var20) {
					var21 = var20;
					ua.ints_g[var16] = var13;
					c.ints_lb[var16++] = var14;
				}

				label288:
				{
					if (~(var20 & 2) == -1) {
						if (~(var20 & 8) == -1) {
							break label288;
						}

						--var13;
						if (var28 == 0) {
							break label288;
						}
					}

					++var13;
				}

				label302:
				{
					if ((1 & var20) == 0) {
						if ((var20 & 4) == 0) {
							break label302;
						}

						--var14;
						if (var28 == 0) {
							break label302;
						}
					}

					++var14;
				}

				var20 = qb.ints_hb[var13][var14];
			}

			for (; var13 != var7 || var14 != var6; var20 = qb.ints_hb[var13][var14]) {
				if (var21 != var20) {
					var21 = var20;
					ua.ints_g[var16] = var13;
					c.ints_lb[var16++] = var14;
				}

				label229:
				{
					if (~(var20 & 2) == -1) {
						if (~(var20 & 8) == -1) {
							break label229;
						}

						--var13;
						if (var28 == 0) {
							break label229;
						}
					}

					++var13;
				}

				if ((1 & var20) == 0) {
					if ((var20 & 4) == 0) {
						continue;
					}

					--var14;
					if (var28 == 0) {
						continue;
					}
				}

				++var14;
			}

			if (var16 <= 0) {
				if (var5 == 1) {
					return false;
				} else {
					return true;
				}
			} else {
				var18 = var16;
				if (var16 > 25) {
					var18 = 25;
				}

				--var16;
				int var32 = ua.ints_g[var16];
				var23 = c.ints_lb[var16];
				if (var5 == 0) {
					++qe.int_b;
					vg.J.e((byte) 127, 146);
					vg.J.e(-13488, var18 + (var18 - -3));
				}

				if (~var5 == -2) {
					vg.J.e((byte) 121, 96);
					vg.J.e(-13488, 14 + 3 + var18 + var18);
					++ef.int_e;
				}

				if (var5 == 2) {
					++ed.int_o;
					vg.J.e((byte) 108, 175);
					vg.J.e(-13488, 3 + var18 + var18);
				}

				ka.S = c.ints_lb[0];
				e.int_d = ua.ints_g[0];
				var24 = 1;
				if (var28 != 0) {
					--var16;
					vg.J.e(var0 + -13488, ua.ints_g[var16] - var32);
					vg.J.e(-13488, c.ints_lb[var16] - var23);
					++var24;
				}

				while (var24 < var18) {
					--var16;
					vg.J.e(var0 + -13488, ua.ints_g[var16] - var32);
					vg.J.e(-13488, c.ints_lb[var16] - var23);
					++var24;
				}

				vg.J.a((int) (!he.N[82] ? 0 : 1), (byte) 34);
				vg.J.b(fb.int_m + var32, true);
				vg.J.f(1174839336, var23 + ea.int_h);
				return true;
			}
		} catch (RuntimeException var29) {
			throw ec.a(var29, "fd.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ',' + var11 + ')');
		}
	}

	static cg a(int var0, int var1) {
		try {
			cg var2 = (cg) ug.Y.a((long) var1, (int) -96);
			++int_m;
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = qb.T.a(0, var1, 4);
				var2 = new cg();
				if (var3 != null) {
					var2.a((byte) 110, var1, new ja(var3));
				}

				if (var0 <= 66) {
					return null;
				} else {
					ug.Y.a((long) var1, 94, var2);
					return var2;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "fd.E(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			lf_e = null;
			nd_s = null;
			lf_g = null;
			int var1 = -15 % ((var0 - -29) / 42);
			duelfriendFlag = null;
			lf_h = null;
			da_l = null;
			cache3 = null;
			p12_full = null;
			lf_n = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "fd.A(" + var0 + ')');
		}
	}

	static int a(int var0) {
		int var10 = client.int_gc;

		try {
			int var1 = 3;
			if (var0 <= 4) {
				nd_s = null;
			}

			++int_u;
			if (hc.int_hb < 310) {
				label141:
				{
					int var2 = dh.int_i >> -1363218713;
					int var3 = mb.A >> -1720324697;
					if (~(4 & jc.bytes_q[hc.int_pb][var2][var3]) != -1) {
						var1 = hc.int_pb;
					}

					int var4;
					int var5;
					int var6;
					label132:
					{
						var4 = r.X.int_fb >> -1307656697;
						var5 = r.X.int_nc >> 781352551;
						if (~var2 <= ~var4) {
							var6 = var2 - var4;
							if (var10 == 0) {
								break label132;
							}
						}

						var6 = var4 - var2;
					}

					int var7;
					label127:
					{
						if (var5 <= var3) {
							var7 = -var5 + var3;
							if (var10 == 0) {
								break label127;
							}
						}

						var7 = -var3 + var5;
					}

					int var8;
					int var9;
					if (var6 <= var7) {
						var8 = var6 * 65536 / var7;
						var9 = '耀';
						if (var10 != 0 || var3 != var5) {
							do {
								label108:
								{
									if (var5 <= var3) {
										if (var3 <= var5) {
											break label108;
										}

										--var3;
										if (var10 == 0) {
											break label108;
										}
									}

									++var3;
								}

								if ((jc.bytes_q[hc.int_pb][var2][var3] & 4) != 0) {
									var1 = hc.int_pb;
								}

								var9 += var8;
								if (~var9 <= -65537) {
									label98:
									{
										if (~var2 <= ~var4) {
											if (~var4 <= ~var2) {
												break label98;
											}

											--var2;
											if (var10 == 0) {
												break label98;
											}
										}

										++var2;
									}

									if ((4 & jc.bytes_q[hc.int_pb][var2][var3]) != 0) {
										var1 = hc.int_pb;
									}

									var9 -= 65536;
								}
							} while (var3 != var5);
						}

						if (var10 == 0) {
							break label141;
						}
					}

					var8 = var7 * 65536 / var6;
					var9 = '耀';
					if (var10 != 0 || var4 != var2) {
						do {
							label81:
							{
								if (~var2 > ~var4) {
									++var2;
									if (var10 == 0) {
										break label81;
									}
								}

								if (var4 < var2) {
									--var2;
								}
							}

							if (~(jc.bytes_q[hc.int_pb][var2][var3] & 4) != -1) {
								var1 = hc.int_pb;
							}

							var9 += var8;
							if (var9 >= 65536) {
								label73:
								{
									if (var5 <= var3) {
										if (~var3 >= ~var5) {
											break label73;
										}

										--var3;
										if (var10 == 0) {
											break label73;
										}
									}

									++var3;
								}

								if (~(4 & jc.bytes_q[hc.int_pb][var2][var3]) != -1) {
									var1 = hc.int_pb;
								}

								var9 -= 65536;
							}
						} while (var4 != var2);
					}
				}
			}

			if ((jc.bytes_q[hc.int_pb][r.X.int_fb >> -1137268569][r.X.int_nc >> 1254169703] & 4) != 0) {
				var1 = hc.int_pb;
			}

			return var1;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "fd.D(" + var0 + ')');
		}
	}

	static void a(int var0, int var1, vg var2, int var3, byte var4) {
		int var20 = client.int_gc;

		try {
			label214:
			{
				++int_a;
				uf.a((byte) 101);
				b.c(var1, var3, var1 - -var2.int_ob, var2.Ib + var3);
				if (di.V == 2 || di.V == 5) {
					b.a(var1, var3, 0, var2.ints_a, var2.ints_jb);
					if (var20 == 0) {
						break label214;
					}
				}

				int var5 = ef.int_c + h.int_l & 2047;
				int var7 = -(r.X.int_nc / 32) + 464;
				int var6 = 48 - -(r.X.int_fb / 32);
				of.E.a(var1, var3, var2.int_ob, var2.Ib, var6, var7, var5, pe.int_j + 256, var2.ints_a, var2.ints_jb);
				int var8 = 0;
				int var9;
				int var10;
				if (var20 != 0 || ~rf.int_eb < ~var8) {
					do {
						var10 = -(r.X.int_nc / 32) + 4 * ag.ints_g[var8] + 2;
						var9 = -(r.X.int_fb / 32) + (4 * l.ints_c[var8] - -2);
						ic.a(var9, var1, var10, var3, mf.kfs_t[var8], (byte) 110, var2);
						++var8;
					} while (~rf.int_eb < ~var8);
				}

				var9 = 0;
				int var12;
				int var13;
				if (var20 != 0 || var9 < 104) {
					do {
						var10 = 0;
						if (var20 == 0 && var10 >= 104) {
							++var9;
						} else {
							do {
								tf var11 = vh.tfs_h[hc.int_pb][var9][var10];
								if (var11 != null) {
									var12 = -(r.X.int_fb / 32) + var9 * 4 - -2;
									var13 = 2 + 4 * var10 + -(r.X.int_nc / 32);
									ic.a(var12, var1, var13, var3, bc.kfs_bb[0], (byte) 110, var2);
								}

								++var10;
							} while (var10 < 104);

							++var9;
						}
					} while (var9 < 104);
				}

				var10 = 0;
				int var14;
				if (var20 != 0 || ~a.int_j < ~var10) {
					do {
						p var22 = th.ps_g[a.ints_h[var10]];
						if (var22 != null && var22.c(0)) {
							sd var24 = var22.xc;
							if (var24 != null && var24.ints_db != null) {
								var24 = var24.b(-1);
							}

							if (var24 != null && var24.W && var24.zb) {
								var13 = -(r.X.int_fb / 32) + var22.int_fb / 32;
								var14 = -(r.X.int_nc / 32) + var22.int_nc / 32;
								ic.a(var13, var1, var14, var3, bc.kfs_bb[1], (byte) 110, var2);
							}
						}

						++var10;
					} while (~a.int_j < ~var10);
				}

				int var23 = 0;
				u var25;
				if (var20 != 0 || var23 < r.Y) {
					do {
						var25 = w.us_e[nd.ints_k[var23]];
						if (var25 != null && var25.c(0)) {
							label215:
							{
								var13 = -(r.X.int_fb / 32) + var25.int_fb / 32;
								var14 = var25.int_nc / 32 - r.X.int_nc / 32;
								boolean var15 = false;
								long var16 = var25.Dc.a(false);
								int var18 = 0;
								if (var20 != 0 || ~var18 > ~vf.int_t) {
									do {
										if (~lf.C[var18] == ~var16 && jh.ints_t[var18] != 0) {
											var15 = true;
											if (var20 == 0) {
												break;
											}
										}

										++var18;
									} while (~var18 > ~vf.int_t);
								}

								boolean var19 = false;
								if (r.X.Lc != 0 && ~var25.Lc != -1 && r.X.Lc == var25.Lc) {
									var19 = true;
								}

								if (var15) {
									ic.a(var13, var1, var14, var3, bc.kfs_bb[3], (byte) 110, var2);
									if (var20 == 0) {
										break label215;
									}
								}

								if (!var19) {
									ic.a(var13, var1, var14, var3, bc.kfs_bb[2], (byte) 110, var2);
									if (var20 == 0) {
										break label215;
									}
								}

								ic.a(var13, var1, var14, var3, bc.kfs_bb[4], (byte) 110, var2);
							}
						}

						++var23;
					} while (var23 < r.Y);
				}

				if (~hg.int_a != -1 && pd.int_i % 20 < 10) {
					if (hg.int_a == 1 && cc.int_fb >= 0 && th.ps_g.length > cc.int_fb) {
						p var26 = th.ps_g[cc.int_fb];
						if (var26 != null) {
							var13 = var26.int_fb / 32 - r.X.int_fb / 32;
							var14 = var26.int_nc / 32 - r.X.int_nc / 32;
							ia.a(var13, var2, var1, 118, jh.kfs_h[1], var3, var14);
						}
					}

					if (~hg.int_a == -3) {
						var13 = 2 + (4 * (-ea.int_h + va.V) - r.X.int_nc / 32);
						var12 = 2 + 4 * (pa.x - fb.int_m) + -(r.X.int_fb / 32);
						ia.a(var12, var2, var1, -97, jh.kfs_h[1], var3, var13);
					}

					if (hg.int_a == 10 && ~lb.F <= -1 && lb.F < w.us_e.length) {
						var25 = w.us_e[lb.F];
						if (var25 != null) {
							var14 = var25.int_nc / 32 - r.X.int_nc / 32;
							var13 = -(r.X.int_fb / 32) + var25.int_fb / 32;
							ia.a(var13, var2, var1, -126, jh.kfs_h[1], var3, var14);
						}
					}
				}

				if (e.int_d != 0) {
					var13 = 2 + ka.S * 4 + -(r.X.int_nc / 32);
					var12 = 4 * e.int_d - (-2 - -(r.X.int_fb / 32));
					ic.a(var12, var1, var13, var3, jh.kfs_h[0], (byte) 110, var2);
				}

				b.e(var2.int_ob / 2 + (var1 - 1), var2.Ib / 2 + var3 + -1, 3, 3, 16777215);
			}

			if (var4 != 38) {
				a(-36, -99);
			}

			ub.V[var0] = true;
		} catch (RuntimeException var21) {
			throw ec.a(var21, "fd.F(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	static {
		lf_h = lf_n;
		lf_g = dd.a("Konfig geladen)3", 2);
		int_t = 0;
		int_q = 0;
		lf_e = dd.a("jolt", 2);
	}
}
