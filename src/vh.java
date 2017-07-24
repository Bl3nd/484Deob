import java.io.IOException;

final class vh {

	static short[] shorts_a = new short[]{(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
	static int int_b = 0;
	static long long_c;
	private static int int_d;
	static int int_e;
	private static lf lf_f = dd.a("OFF", 2);
	static lf lf_g;
	static tf[][][] tfs_h = new tf[4][104][104];
	static int[] ints_i = new int[500];
	static int[] ints_j;
	static int int_k;
	static lf lf_l;
	static ua ua_m;

	static final int a(byte var0, byte[] var1, int var2, int var3) {
		int var7 = client.int_gc;

		try {
			int var4 = -1;
			++int_k;
			int var5 = var3;
			if (var7 != 0) {
				var4 = var4 >>> 8 ^ re.ints_i[255 & (var1[var3] ^ var4)];
				var5 = var3 + 1;
			}

			while (~var5 > ~var2) {
				var4 = var4 >>> 8 ^ re.ints_i[255 & (var1[var5] ^ var4)];
				++var5;
			}

			int var6 = 48 / ((var0 - 66) / 42);
			var4 = ~var4;
			return var4;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "vh.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(int var0) {
		int dummy = client.int_gc;
		try {
			if (ci.int_tb > 1) {
				--ci.int_tb;
			}

			++int_e;
			if (bb.S > 0) {
				--bb.S;
			}

			if (ac.Q) {
				ac.Q = false;
				fa.d((byte) -125);
			} else {
				int var1 = 0;
				while (tf.b(var0 + 7865)) {
					++var1;
					if (var1 >= 100) {
						break;
					}
				}

				if (ld.Z == 30) {
					ci.a(157, (byte) 35, vg.J);
					int var4;
					int var5;
					int var6;
					int var7;
					int var8;
					synchronized (je.qh_j.object_f) {
						if (!td.T) {
							je.qh_j.int_p = 0;
						} else {
							if (h.int_b != 0 || je.qh_j.int_p >= 40) {
								label1231:
								{
									vg.J.e((byte) 110, 210);
									++vd.S;
									vg.J.e(var0 + -5622, 0);
									var4 = vg.J.P;
									var5 = 0;
									var6 = 0;
									if (dummy != 0 || ~var6 > ~je.qh_j.int_p) {
										while (~(-var4 + vg.J.P) > -241) {
											label1156:
											{
												var7 = je.qh_j.ints_o[var6];
												++var5;
												var8 = je.qh_j.ints_q[var6];
												if (var8 < 0) {
													var8 = 0;
													if (dummy == 0) {
														break label1156;
													}
												}

												if (~var8 < -765) {
													var8 = 764;
												}
											}

											label1150:
											{
												if (var7 >= 0) {
													if (var7 <= 502) {
														break label1150;
													}

													var7 = 502;
													if (dummy == 0) {
														break label1150;
													}
												}

												var7 = 0;
											}

											int var9 = var7 * 765 + var8;
											if (je.qh_j.ints_o[var6] == -1 && je.qh_j.ints_q[var6] == -1) {
												var9 = 524287;
												var8 = -1;
												var7 = -1;
											}

											label1206:
											{
												if (~var8 == ~gg.int_i && ~var7 == ~jf.int_n) {
													if (ka.O >= 2047) {
														break label1206;
													}

													++ka.O;
													if (dummy == 0) {
														break label1206;
													}
												}

												int var10 = var8 + -gg.int_i;
												int var11 = var7 + -jf.int_n;
												jf.int_n = var7;
												gg.int_i = var8;
												if (ka.O < 8 && var10 >= -32 && ~var10 >= -32 && var11 >= -32 && ~var11 >= -32) {
													var10 += 32;
													var11 += 32;
													vg.J.c(var0 ^ -15196, var11 + (var10 << 6) + (ka.O << 12));
													ka.O = 0;
													if (dummy == 0) {
														break label1206;
													}
												}

												if (ka.O < 8) {
													vg.J.a((int) ((ka.O << 19) + 8388608 - -var9), (int) -2140);
													ka.O = 0;
													if (dummy == 0) {
														break label1206;
													}
												}

												vg.J.b((byte) 115, (ka.O << 19) + -1073741824 + var9);
												ka.O = 0;
											}

											++var6;
											if (~var6 <= ~je.qh_j.int_p) {
												break;
											}
										}
									}

									vg.J.d((int) (vg.J.P + -var4), 87);
									if (~je.qh_j.int_p >= ~var5) {
										je.qh_j.int_p = 0;
										if (dummy == 0) {
											break label1231;
										}
									}

									je.qh_j.int_p -= var5;
									var7 = 0;
									if (dummy != 0 || je.qh_j.int_p > var7) {
										do {
											je.qh_j.ints_q[var7] = je.qh_j.ints_q[var7 - -var5];
											je.qh_j.ints_o[var7] = je.qh_j.ints_o[var7 - -var5];
											++var7;
										} while (je.qh_j.int_p > var7);
									}
								}
							}
						}
					}

					if (h.int_b != 0) {
						long var19;
						++tf.int_e;
						var19 = (-bb.long_ib + ec.Y) / 50L;
						bb.long_ib = ec.Y;
						var4 = gg.int_o;
						if (~var4 > -1) {
							var4 = 0;
						} else {
							if (var4 > 502) {
								var4 = 502;
							}
						}

						if (var19 > 4095L) {
							var19 = 4095L;
						}

						var5 = nh.int_mb;
						var8 = (int) var19;
						if (var5 >= 0) {
							if (var5 > 764) {
								var5 = 764;
							}
						} else {
							var5 = 0;
						}

						var6 = 765 * var4 + var5;
						byte var26 = 0;
						if (~h.int_b == -3) {
							var26 = 1;
						}

						vg.J.e((byte) 119, 242);
						vg.J.c((byte) -98, (var26 << 19) + ((var8 << 20) - -var6));
					}

					if (he.N[96] || he.N[97] || he.N[98] || he.N[99]) {
						ua.N = true;
					}

					if (~rb.int_l < -1) {
						--rb.int_l;
					}

					if (ua.N && ~rb.int_l >= -1) {
						ua.N = false;
						rb.int_l = 20;
						++pe.int_g;
						vg.J.e((byte) 87, 230);
						vg.J.f(1174839336, pc.int_a);
						vg.J.h(h.int_l, var0 + 7994);
					}

					if (wc.S && !m.V) {
						m.V = true;
						++ob.int_h;
						vg.J.e((byte) 81, 143);
						vg.J.e(-13488, 1);
					}

					if (!wc.S && m.V) {
						m.V = false;
						++ob.int_h;
						vg.J.e((byte) 100, 143);
						vg.J.e(-13488, 0);
					}

					ei.a(0);
					if (ld.Z == 30) {
						mb.a(var0 ^ 7873);
						bb.e(0);
						++mc.A;
						if (mc.A > 750) {
							fa.d((byte) -125);
						} else {
							hc.c(1);
							client.f(0);
							ca.a((byte) 122);
							if (vf.U != 0) {
								je.int_k += 20;
								if (je.int_k >= 400) {
									vf.U = 0;
								}
							}

							++v.int_tb;
							if (lc.y != null) {
								++u.int_cd;
								if (u.int_cd >= 15) {
									mc.a(lc.y, var0 ^ 17541);
									lc.y = null;
								}
							}

							vg var20;
							if (sh.vg_wb != null) {
								mc.a(sh.vg_wb, -23101);
								++rg.int_e;
								if (ga.int_c - -5 < c.int_bb || c.int_bb < ga.int_c - 5 || ~lf.int_c < ~(5 + e.int_n) || lf.int_c < -5 + e.int_n) {
									ne.boolean_k = true;
								}

								if (wd.int_eb == 0) {
									label1233:
									{
										if (ne.boolean_k && rg.int_e >= 5) {
											if (af.vg_v != sh.vg_wb || rb.int_b == ai.int_a) {
												break label1233;
											}

											++o.int_c;
											var20 = sh.vg_wb;
											byte var3 = 0;
											if (bb.int_bb == 1 && var20.Xb == 206) {
												var3 = 1;
											}

											if (var20.ints_gc[rb.int_b] <= 0) {
												var3 = 0;
											}

											label1210:
											{
												if (ra.c(610157134, ne.a(var20, 100))) {
													var4 = ai.int_a;
													var5 = rb.int_b;
													var20.ints_gc[var5] = var20.ints_gc[var4];
													var20.Ub[var5] = var20.Ub[var4];
													var20.ints_gc[var4] = -1;
													var20.Ub[var4] = 0;
													if (dummy == 0) {
														break label1210;
													}
												}

												if (var3 == 1) {
													var5 = rb.int_b;
													var4 = ai.int_a;
													if (dummy != 0 || ~var5 != ~var4) {
														do {
															if (~var4 >= ~var5) {
																if (var4 >= var5) {
																	continue;
																}

																var20.a(var4, (byte) 79, var4 + 1);
																++var4;
																if (dummy == 0) {
																	continue;
																}
															}

															var20.a(var4, (byte) 79, -1 + var4);
															--var4;
														} while (~var5 != ~var4);
													}

													if (dummy == 0) {
														break label1210;
													}
												}

												var20.a(ai.int_a, (byte) 79, rb.int_b);
											}

											vg.J.e((byte) 83, 10);
											vg.J.b(sh.vg_wb.Z, var0 + -2125503870);
											vg.J.b(rb.int_b, true);
											vg.J.a((byte) -36, (int) var3);
											vg.J.f(var0 ^ -1174847122, ai.int_a);
											if (dummy == 0) {
												break label1233;
											}
										}

										if ((~ne.int_e == -2 || cg.b(var0 ^ 1159860108, qa.int_eb + -1)) && ~qa.int_eb < -3) {
											nf.a((byte) -124);
											if (dummy == 0) {
												break label1233;
											}
										}

										if (qa.int_eb > 0) {
											af.b((byte) 116, -1 + qa.int_eb);
										}
									}

									u.int_cd = 10;
									sh.vg_wb = null;
									h.int_b = 0;
								}
							}

							eg.vg_a = null;
							var20 = wg.vg_g;
							cf.L = false;
							fa.Q = false;
							wg.vg_g = null;
							vg var21 = jg.vg_p;
							jg.vg_p = null;
							eg.int_g = 0;
							if (la.a(var0 + 7866) && eg.int_g < 128) {
								do {
									cc.ints_bb[eg.int_g] = wb.int_f;
									ints_j[eg.int_g] = i.X;
									++eg.int_g;
								} while (la.a(var0 + 7866) && eg.int_g < 128);
							}

							if (ac.int_ab != -1) {
								la.a(0, (byte) 126, 503, 0, 0, 765, 0, ac.int_ab);
							}

							++hf.int_p;

							vg var22;
							id var23;
							vg var24;
							while (true) {
								var23 = (id) lf.tf_v.a((byte) 70);
								if (var23 == null) {
									break;
								}

								var24 = var23.vg_o;
								if (var24.Hb >= 0) {
									var22 = ra.a(var24.int_bb, (byte) 112);
									if (var22 == null || var22.Fb == null || var24.Hb >= var22.Fb.length || var24 != var22.Fb[var24.Hb] && dummy == 0) {
										continue;
									}
								}

								ea.a(24087, var23);
								if (dummy != 0) {
									break;
								}
							}

							while (true) {
								var23 = (id) wh.tf_k.a((byte) 85);
								if (var23 == null) {
									break;
								}

								var24 = var23.vg_o;
								if (~var24.Hb <= -1) {
									var22 = ra.a(var24.int_bb, (byte) 116);
									if (var22 == null || var22.Fb == null || var22.Fb.length <= var24.Hb || var22.Fb[var24.Hb] != var24 && dummy == 0) {
										continue;
									}
								}

								ea.a(24087, var23);
								if (dummy != 0) {
									break;
								}
							}

							while (true) {
								var23 = (id) tb.V.a((byte) 121);
								if (var23 == null) {
									break;
								}

								var24 = var23.vg_o;
								if (var24.Hb >= 0) {
									var22 = ra.a(var24.int_bb, (byte) 123);
									if (var22 == null || var22.Fb == null || ~var24.Hb <= ~var22.Fb.length || var24 != var22.Fb[var24.Hb] && dummy == 0) {
										continue;
									}
								}

								ea.a(24087, var23);
								if (dummy != 0) {
									break;
								}
							}

							if (tg.W != null) {
								hh.f((byte) 121);
							}

							if (ah.int_w != -1) {
								var4 = ah.int_w;
								var5 = client.V;
								boolean var25 = fd.a(var0 + 7866, 0, 0, var4, 0, 0, r.X.xb[0], r.X.ints_db[0], true, var5, 0, 0);
								ah.int_w = -1;
								if (var25) {
									je.int_k = 0;
									pf.int_eb = gg.int_o;
									fi.y = nh.int_mb;
									vf.U = 1;
								}
							}

							ca.b(15859);
							if (wg.vg_g != var20) {
								if (var20 != null) {
									mc.a(var20, -23101);
								}

								if (wg.vg_g != null) {
									mc.a(wg.vg_g, -23101);
								}
							}

							if (jg.vg_p != var21 && ua.M == sh.int_ub) {
								if (var21 != null) {
									mc.a(var21, -23101);
								}

								if (jg.vg_p != null) {
									mc.a(jg.vg_p, -23101);
								}
							}

							if (jg.vg_p != null) {
								if (sh.int_ub > ua.M) {
									++ua.M;
									if (ua.M == sh.int_ub) {
										mc.a(jg.vg_p, -23101);
									}
								}
							} else {
								if (ua.M > 0) {
									--ua.M;
								}
							}

							ra.b(false);
							if (lf.boolean_q) {
								sc.b(var0 ^ 7880);
							}

							var4 = 0;
							while (var4 < 5) {
								++gh.Q[var4];
								++var4;
							}

							var5 = pg.a(-1);
							var6 = v.b(true);
							if (var5 > 4500 && var6 > 4500) {
								bb.S = 250;
								++ja.int_hb;
								fh.b(-123, 4000);
								vg.J.e((byte) 98, 36);
							}

							++ra.int_bb;
							if (ra.int_bb > 500) {
								ra.int_bb = 0;
								var7 = (int) (8.0D * Math.random());
								if ((var7 & 4) == 4) {
									hg.int_j += nd.int_a;
								}

								if ((var7 & 1) == 1) {
									fh.int_h += q.int_hb;
								}

								if ((var7 & 2) == 2) {
									sh.Ab += int_d;
								}
							}

							++wb.int_q;
							if (hg.int_j < -40) {
								nd.int_a = 1;
							}

							if (wb.int_q > 500) {
								wb.int_q = 0;
								var7 = (int) (8.0D * Math.random());
								if ((var7 & 2) == 2) {
									pe.int_j += rh.Q;
								}

								if ((var7 & 1) == 1) {
									ef.int_c += nh.int_fb;
								}
							}

							++wd.int_ob;
							if (pe.int_j < -20) {
								rh.Q = 1;
							}

							if (ef.int_c < -60) {
								nh.int_fb = 2;
							}

							if (fh.int_h < -50) {
								q.int_hb = 2;
							}

							if (pe.int_j > 10) {
								rh.Q = -1;
							}

							if (fh.int_h > 50) {
								q.int_hb = -2;
							}

							if (sh.Ab < -55) {
								int_d = 2;
							}

							if (ef.int_c > 60) {
								nh.int_fb = -2;
							}

							if (hg.int_j > 40) {
								nd.int_a = -1;
							}

							if (sh.Ab > 55) {
								int_d = -2;
							}

							if (wd.int_ob > 50) {
								++cc.Q;
								vg.J.e((byte) 94, 20);
							}

							try {
								if (fd.nd_s != null && vg.J.P > 0) {
									fd.nd_s.a(-123, 0, vg.J.P, vg.J.yb);
									wd.int_ob = 0;
									vg.J.P = 0;
								}
							} catch (IOException var16) {
								fa.d((byte) -125);
							}
						}
					}
				}
			}
		} catch (RuntimeException var18) {
			throw ec.a(var18, "vh.A(" + var0 + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2) {
		int var3 = wd.ints_mb[var0][var1][var2];
		if (var3 == -kh.V) {
			return false;
		} else if (var3 == kh.V) {
			return true;
		} else {
			int var4 = var1 << 7;
			int var5 = var2 << 7;
			if (a.a(var4 + 1, ch.ints_g[var0][var1][var2], var5 + 1) && a.a(var4 + 128 - 1, ch.ints_g[var0][var1 + 1][var2], var5 + 1) && a.a(var4 + 128 - 1, ch.ints_g[var0][var1 + 1][var2 + 1], var5 + 128 - 1) && a.a(var4 + 1, ch.ints_g[var0][var1][var2 + 1], var5 + 128 - 1)) {
				wd.ints_mb[var0][var1][var2] = kh.V;
				return true;
			} else {
				wd.ints_mb[var0][var1][var2] = -kh.V;
				return false;
			}
		}
	}

	public static void b(int var0) {
		try {
			shorts_a = null;
			ints_j = null;
			lf_l = null;
			lf_f = null;
			ints_i = null;
			tfs_h = null;
			lf_g = null;
			if (var0 != -1048) {
				shorts_a = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "vh.D(" + var0 + ')');
		}
	}

	static {
		lf_g = lf_f;
		ints_j = new int[128];
		lf_l = dd.a("zur-Uck auf die RuneScape)2Webseite gehen", 2);
		int_d = 2;
		ua_m = null;
	}
}
