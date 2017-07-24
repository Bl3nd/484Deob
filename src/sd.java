import java.util.Arrays;

final class sd extends ph {

	static int G;
	static int H;
	static int I;
	boolean J = false;
	static int K;
	static int L;
	private short[] M;
	lf N;
	int O;
	int P;
	static int Q;
	private int R;
	private int S;
	private int[] T;
	static lf U = null;
	int V;
	boolean W;
	private int X;
	short Y;
	int Z;
	static int[] ints_ab;
	private int int_bb;
	int int_cb;
	int[] ints_db;
	static int int_eb;
	int int_fb;
	boolean boolean_gb;
	int int_hb;
	int int_ib;
	private int[] ints_jb;
	static int int_kb;
	short short_lb;
	private int int_mb;
	private short[] shorts_nb;
	static int int_ob;
	int int_pb;
	private int int_qb;
	lf[] lfs_rb;
	static int int_sb;
	private short[] shorts_tb;
	int int_ub;
	private short[] shorts_vb;
	static rc rc_wb = new rc(30);
	int xb;
	static int yb;
	boolean zb;
	int Ab;
	static lf Bb = dd.a("Das ist eine Mitglieder)2Welt(Q", 2);
	static lf chalreqFlag = dd.a(":chalreq:", 2);
	static int Db = 127;
	static lf Eb = dd.a("Schrifts-=tze geladen)3", 2);
	static lf Fb = dd.a("null", 2);

	final sd b(int var1) {
		try {
			++Q;
			int var2 = var1;
			if (~this.int_qb == 0) {
				if (this.X == -1) {
					return var2 >= 0 && this.ints_db.length > var2 && this.ints_db[var2] != -1 ? uh.a((byte) -99, this.ints_db[var2]) : null;
				}

				var2 = uc.ints_ub[this.X];
				if (client.int_gc == 0) {
					return var2 >= 0 && this.ints_db.length > var2 && this.ints_db[var2] != -1 ? uh.a((byte) -99, this.ints_db[var2]) : null;
				}
			}

			var2 = mc.a((byte) 105, this.int_qb);
			return var2 >= 0 && this.ints_db.length > var2 && this.ints_db[var2] != -1 ? uh.a((byte) -99, this.ints_db[var2]) : null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sd.A(" + var1 + ')');
		}
	}

	static void a(boolean var0, lf var1) {
		int var5 = client.int_gc;

		try {
			++L;
			if (uh.jcs_r != null) {
				int var2 = 0;
				long var3 = var1.a(!var0);
				if (~var3 != -1L) {
					label54:
					{
						if (!var0) {
							Fb = null;
							if (var5 == 0 && var2 >= uh.jcs_r.length) {
								break label54;
							}
						} else if (var2 >= uh.jcs_r.length) {
							break label54;
						}

						while (uh.jcs_r[var2].long_e != var3 || var5 != 0) {
							++var2;
							if (var2 >= uh.jcs_r.length) {
								break;
							}
						}
					}

					if (~uh.jcs_r.length < ~var2 && uh.jcs_r[var2] != null) {
						++de.int_v;
						vg.J.e((byte) 111, 1);
						vg.J.a(uh.jcs_r[var2].long_e, -562765672);
					}
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "sd.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final ue a(byte var1, int var2, bi var3) {
		int var11 = client.int_gc;

		try {
			++int_kb;
			if (this.ints_db != null) {
				sd var13 = this.b(-1);
				return var13 == null ? null : var13.a((byte) 97, var2, var3);
			} else if (this.T == null) {
				return null;
			} else {
				ue var4 = (ue) dg.rc_j.a((long) this.Ab, -108);
				if (var4 == null) {
					boolean var5 = false;
					int var6 = 0;
					if (var11 != 0 || ~var6 > ~this.T.length) {
						do {
							if (!og.bg_n.d(0, this.T[var6], -126)) {
								var5 = true;
							}

							++var6;
						} while (~var6 > ~this.T.length);
					}

					if (var5) {
						return null;
					}

					oe[] var7 = new oe[this.T.length];
					int var8 = 0;
					if (var11 != 0 || var8 < this.T.length) {
						do {
							var7[var8] = oe.a(og.bg_n, this.T[var8], 0);
							++var8;
						} while (var8 < this.T.length);
					}

					oe var9;
					label84:
					{
						if (var7.length != 1) {
							var9 = new oe(var7, var7.length);
							if (var11 == 0) {
								break label84;
							}
						}

						var9 = var7[0];
					}

					int var10;
					if (this.M != null) {
						var10 = 0;
						if (var11 != 0 || var10 < this.M.length) {
							do {
								var9.a(this.M[var10], this.shorts_nb[var10]);
								++var10;
							} while (var10 < this.M.length);
						}
					}

					if (this.shorts_vb != null) {
						var10 = 0;
						if (var11 != 0 || var10 < this.shorts_vb.length) {
							do {
								var9.b(this.shorts_vb[var10], this.shorts_tb[var10]);
								++var10;
							} while (var10 < this.shorts_vb.length);
						}
					}

					var4 = var9.a(64, 768, -50, -10, -50, true, true);
					dg.rc_j.a((long) this.Ab, -10, var4);
				}

				if (var1 < 18) {
					this.int_ub = -38;
				}

				if (var3 != null) {
					var4 = var3.a(var4, var2, 516678064);
				}

				return var4;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "sd.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static int a(int var0, int var1) {
		try {
			return var0 & var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sd.H(" + var0 + ',' + var1 + ')');
		}
	}

	private final void a(int var1, int var2, ja var3) {
		int var6 = client.int_gc;

		try {
			if (var2 != -1) {
				e(88);
			}

			++G;
			int var4;
			int var5;
			if (var1 != 1) {
				if (var1 != 2) {
					if (~var1 == -13) {
						this.int_ib = var3.j((byte) 103);
					} else if (var1 != 13) {
						if (var1 == 14) {
							this.int_cb = var3.b(true);
						} else if (~var1 != -16) {
							if (~var1 == -17) {
								this.Z = var3.b(true);
							} else {
								if (var1 != 17) {
									if (var1 < 30 || ~var1 <= -36) {
										if (~var1 != -41) {
											if (var1 != 41) {
												if (~var1 != -61) {
													if (~var1 != -94) {
														if (~var1 == -96) {
															this.P = var3.b(true);
															return;
														}

														if (~var1 == -98) {
															this.int_mb = var3.b(true);
															return;
														}

														if (~var1 == -99) {
															this.int_bb = var3.b(true);
															return;
														}

														if (var1 != 99) {
															if (var1 == 100) {
																this.S = var3.m(var2 + 4);
																return;
															}

															if (var1 == 101) {
																this.R = var3.m(3) * 5;
																return;
															}

															if (~var1 == -103) {
																this.V = var3.b(true);
																return;
															}

															if (var1 == 103) {
																this.int_ub = var3.b(true);
																return;
															}

															if (~var1 != -107) {
																if (var1 == 107) {
																	this.zb = false;
																	return;
																}

																if (var1 != 109) {
																	if (var1 != 111) {
																		if (var1 != 113) {
																			if (~var1 != -115) {
																				if (var1 == 115) {
																					this.short_lb = (short) (var3.j((byte) 81) * 4);
																					this.Y = (short) (4 * var3.j((byte) 80));
																					return;
																				}
																			} else {
																				var3.m(3);
																				var3.m(var2 + 4);
																			}

																			return;
																		}

																		var3.b(true);
																		var3.b(true);
																		return;
																	}
																} else {
																	this.boolean_gb = false;
																}

																return;
															}

															this.int_qb = var3.b(true);
															if (~this.int_qb == -65536) {
																this.int_qb = -1;
															}

															this.X = var3.b(true);
															if (this.X == '\uffff') {
																this.X = -1;
															}

															var4 = var3.j((byte) 78);
															this.ints_db = new int[1 + var4];
															var5 = 0;
															if (var6 == 0 && var5 > var4) {
																return;
															}

															do {
																this.ints_db[var5] = var3.b(true);
																if (~this.ints_db[var5] == -65536) {
																	this.ints_db[var5] = -1;
																}

																++var5;
															} while (var5 <= var4);

															return;
														}

														this.J = true;
														return;
													}

													this.W = false;
													return;
												}

												var4 = var3.j((byte) 121);
												this.T = new int[var4];
												var5 = 0;
												if (var6 == 0 && ~var5 <= ~var4) {
													return;
												}

												do {
													this.T[var5] = var3.b(true);
													++var5;
												} while (~var5 > ~var4);

												return;
											}

											var4 = var3.j((byte) 70);
											this.shorts_tb = new short[var4];
											this.shorts_vb = new short[var4];
											var5 = 0;
											if (var6 == 0 && ~var5 <= ~var4) {
												return;
											}

											do {
												this.shorts_vb[var5] = (short) var3.b(true);
												this.shorts_tb[var5] = (short) var3.b(true);
												++var5;
											} while (~var5 > ~var4);

											return;
										}

										var4 = var3.j((byte) 98);
										this.M = new short[var4];
										this.shorts_nb = new short[var4];
										var5 = 0;
										if (var6 == 0 && ~var5 <= ~var4) {
											return;
										}

										do {
											this.M[var5] = (short) var3.b(true);
											this.shorts_nb[var5] = (short) var3.b(true);
											++var5;
										} while (~var5 > ~var4);

										return;
									}

									this.lfs_rb[-30 + var1] = var3.e((byte) 87);
									if (this.lfs_rb[var1 - 30].a((byte) -121, rb.lf_o)) {
										this.lfs_rb[var1 + -30] = null;
										return;
									}
								} else {
									this.int_cb = var3.b(true);
									this.int_fb = var3.b(true);
									this.O = var3.b(true);
									this.int_pb = var3.b(true);
								}

							}
						} else {
							this.int_hb = var3.b(true);
						}
					} else {
						this.xb = var3.b(true);
					}
				} else {
					this.N = var3.e((byte) 87);
				}
			} else {
				var4 = var3.j((byte) 112);
				this.ints_jb = new int[var4];
				var5 = 0;
				if (var6 != 0 || var5 < var4) {
					do {
						this.ints_jb[var5] = var3.b(true);
						++var5;
					} while (var5 < var4);

				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sd.J(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void c(int var0) {
		try {
			chalreqFlag = null;
			Bb = null;
			U = null;
			ints_ab = null;
			Eb = null;
			if (var0 != 1) {
				a(false, null);
			}

			Fb = null;
			rc_wb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sd.K(" + var0 + ')');
		}
	}

	final boolean d(int var1) {
		try {
			++yb;
			if (this.ints_db == null) {
				return true;
			} else {
				int var2;
				label32:
				{
					var2 = -1;
					if (~this.int_qb == 0) {
						if (this.X == -1) {
							break label32;
						}

						var2 = uc.ints_ub[this.X];
						if (client.int_gc == 0) {
							break label32;
						}
					}

					var2 = mc.a((byte) 99, this.int_qb);
				}

				if (~var2 <= -1 && ~var2 > ~this.ints_db.length && this.ints_db[var2] != -1) {
					if (var1 >= -73) {
						this.a(21, (ja) null);
					}

					return true;
				} else {
					return false;
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sd.G(" + var1 + ')');
		}
	}

	private static void a(byte var0, bg cache3, bg cache8, bg cache7, bg cache13) {
		try {
			cc.cache7 = cache7;
			if (var0 > 68) {
				fd.cache3 = cache3;
				se.cache13 = cache13;
				++K;
				nd.cache8 = cache8;
				sc.vgs_db = new vg[fd.cache3.a((byte) 94)][];
				de.booleans_w = new boolean[fd.cache3.a((byte) 114)];
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "sd.C(" + var0 + ',' + (cache3 != null ? "{...}" : "null") + ',' + (cache8 != null ? "{...}" : "null") + ',' + (cache7 != null ? "{...}" : "null") + ',' + (cache13 != null ? "{...}" : "null") + ')');
		}
	}

	static void e(int var0) {
		int dummy = client.int_gc;

		try {
			++int_sb;
			if (uf.int_g != 0) {
				if (var0 <= 68) {
					U = null;
				}

				if (uf.int_g != 20) {
					if (uf.int_g == 30) {
						ga.cache0 = ad.a(true, false, 0, -20347, true);
						ee.cache1 = ad.a(true, false, 1, -20347, true);
						ei.cache2 = ad.a(false, true, 2, -20347, true);
						ff.cache3 = ad.a(true, false, 3, -20347, true);
						of.cache4 = ad.a(true, false, 4, -20347, true);
						se.cache5 = ad.a(true, true, 5, -20347, true);
						l.cache6 = ad.a(true, true, 6, -20347, false);
						sh.cache7 = ad.a(true, false, 7, -20347, true);
						hd.cache8 = ad.a(true, false, 8, -20347, true);
						ob.cache9 = ad.a(false, true, 9, -20347, true);
						dh.cache10 = ad.a(true, false, 10, -20347, true);
						ka.cache11 = ad.a(true, false, 11, -20347, true);
						ei.cache12 = ad.a(true, false, 12, -20347, true);
						gh.cache13 = ad.a(false, true, 13, -20347, true);
						ka.cache14 = ad.a(true, false, 14, -20347, false);
						p.cache15 = ad.a(true, false, 15, -20347, true);
						ja.int_cb = 20;
						pf.lf_ab = bd.lf_m;
						uf.int_g = 40;
					} else if (uf.int_g == 40) {
						int percentage = ga.cache0.f(-23) * 4 / 100;
						percentage += 4 * ee.cache1.f(-110) / 100;
						percentage += 2 * ei.cache2.f(-45) / 100;
						percentage += 2 * ff.cache3.f(-57) / 100;
						percentage += of.cache4.f(-91) * 6 / 100;
						percentage += 4 * se.cache5.f(-37) / 100;
						percentage += 2 * l.cache6.f(-68) / 100;
						percentage += 60 * sh.cache7.f(-91) / 100;
						percentage += hd.cache8.f(-54) * 2 / 100;
						percentage += ob.cache9.f(-20) * 2 / 100;
						percentage += 2 * dh.cache10.f(-26) / 100;
						percentage += ka.cache11.f(-106) * 2 / 100;
						percentage += 2 * ei.cache12.f(-92) / 100;
						percentage += gh.cache13.f(-78) * 2 / 100;
						percentage += 2 * ka.cache14.f(-61) / 100;
						percentage += 2 * p.cache15.f(-55) / 100;
						if (percentage != 100) {
							if (percentage != 0) {
								pf.lf_ab = de.a(new lf[]{wg.lf_e, fa.a((byte) 85, percentage), cb.lf_b}, -90);
							}

							ja.int_cb = 30;
						} else {
							uf.int_g = 45;
							ja.int_cb = 30;
							pf.lf_ab = oa.X;
						}
					} else if (uf.int_g == 45) {
						client.a(22050, 2, 28352, !tf.boolean_q);
						sh class_sh = new sh();
						class_sh.c(128, 16, 9);
						rg.ah_f = ci.a(ae.U, eh.ke_o, (byte) -105, 0, 22050);
						rg.ah_f.a(-28922, class_sh);
						bb.a(-27635, class_sh, p.cache15, of.cache4, ka.cache14);
						e.ah_p = ci.a(ae.U, eh.ke_o, (byte) -57, 1, 2048);
						pe.t_b = new t();
						e.ah_p.a(-28922, pe.t_b);
						af.pa_w = new pa(22050, cb.sampleRate);
						pf.lf_ab = u.lf_jd;
						ja.int_cb = 35;
						uf.int_g = 50;
					} else if (uf.int_g == 50) {
						int var1 = 0;
						if (he.Q != null) {
							++var1;
						} else {
							he.Q = bg.a(hd.cache8, sh.Gb, gh.cache13, false, qe.p11_full);
						}

						if (jh.db_l != null) {
							++var1;
						} else {
							jh.db_l = he.Q;
						}

						if (jg.db_r == null) {
							jg.db_r = bg.a(hd.cache8, sh.Gb, gh.cache13, false, fd.p12_full);
						} else {
							++var1;
						}

						if (ee.S == null) {
							ee.S = bg.a(hd.cache8, sh.Gb, gh.cache13, false, ug.b12_full);
						} else {
							++var1;
						}

						if (var1 < 4) {
							pf.lf_ab = de.a(new lf[]{ph.lf_t, fa.a((byte) 85, 100 * var1 / 4), cb.lf_b}, 119);
							ja.int_cb = 40;
						} else {
							pf.lf_ab = uc.Qb;
							ja.int_cb = 40;
							uf.int_g = 60;
						}
					} else if (uf.int_g == 60) {
						int sprites = ja.a(dh.cache10, hd.cache8, (byte) 116);
						int length = q.e(-51);
						if (length > sprites) {
							pf.lf_ab = de.a(new lf[]{of.lf_q, fa.a((byte) 85, 100 * sprites / length), cb.lf_b}, 115);
							ja.int_cb = 50;
						} else {
							pf.lf_ab = rf.lf_ib;
							ja.int_cb = 50;
							de.a(5, (byte) -64);
							uf.int_g = 70;
						}
					} else if (~uf.int_g == -71) {
						if (!ei.cache2.b((byte) -68)) {
							pf.lf_ab = de.a(new lf[]{cb.lf_t, fa.a((byte) 85, ei.cache2.d(-31160)), cb.lf_b}, 120);
							ja.int_cb = 60;
						} else {
							nd.a(false, ei.cache2);
							di.a(11432, ei.cache2);
							fc.a(sh.cache7, 32413, ei.cache2);
							bh.a(tf.boolean_q, sh.cache7, ei.cache2, 82);
							ca.a(sh.cache7, (byte) 121, ei.cache2);
							rg.a((byte) 45, ei.cache2, gh.boolean_fb, jh.db_l, sh.cache7);
							td.a(ga.cache0, 1156412167, ee.cache1, ei.cache2);
							ga.a(ei.cache2, false, sh.cache7);
							of.a(ei.cache2, (byte) 74);
							kd.a(ei.cache2, 16);
							a((byte) 98, ff.cache3, hd.cache8, sh.cache7, gh.cache13);
							bg.a(false, ei.cache2);
							f.a(ei.cache2, 117);
							pf.lf_ab = ng.G;
							ja.int_cb = 60;
							lh.d((byte) 127);
							uf.int_g = 80;
						}
					} else if (~uf.int_g != -81) {
						if (~uf.int_g == -91) {
							if (!ob.cache9.b((byte) -68)) {
								pf.lf_ab = de.a(new lf[]{cb.x, fa.a((byte) 85, ob.cache9.d(-31160)), cb.lf_b}, -47);
								ja.int_cb = 90;
							} else {
								bc var11 = new bc(ob.cache9, hd.cache8, 20, !tf.boolean_q ? 128 : 64);
								nc.a(var11);
								nc.a(0.7F);
								pf.lf_ab = hb.lf_l;
								ja.int_cb = 90;
								uf.int_g = 110;
							}
						} else if (~uf.int_g == -111) {
							je.qh_j = new qh();
							eh.ke_o.a(je.qh_j, 10, (byte) 46);
							ja.int_cb = 94;
							pf.lf_ab = ea.lf_f;
							uf.int_g = 120;
						} else if (uf.int_g == 120) {
							if (!dh.cache10.b(-1, ad.huffman, sh.Gb)) {
								pf.lf_ab = de.a(new lf[]{id.lf_u, ug.lf_cb}, 2);
								ja.int_cb = 96;
							} else {
								ad var10 = new ad(dh.cache10.a(113, sh.Gb, ad.huffman));
								gh.a(32184, var10);
								ja.int_cb = 96;
								pf.lf_ab = f.lf_fb;
								uf.int_g = 130;
							}
						} else if (uf.int_g == 130) {
							if (!ff.cache3.b((byte) -68)) {
								pf.lf_ab = de.a(new lf[]{lb.lf_r, fa.a((byte) 85, ff.cache3.d(-31160) * 4 / 5), cb.lf_b}, 127);
								ja.int_cb = 100;
							} else if (!ei.cache12.b((byte) -68)) {
								pf.lf_ab = de.a(new lf[]{lb.lf_r, fa.a((byte) 85, 80 + ei.cache12.d(-31160) / 6), cb.lf_b}, -4);
								ja.int_cb = 100;
							} else if (!gh.cache13.b((byte) -68)) {
								pf.lf_ab = de.a(new lf[]{lb.lf_r, fa.a((byte) 85, gh.cache13.d(-31160) / 20 + 96), cb.lf_b}, -8);
								ja.int_cb = 100;
							} else {
								ja.int_cb = 100;
								uf.int_g = 140;
								pf.lf_ab = lc.x;
							}
						} else if (~uf.int_g == -141) {
							de.a(10, (byte) -64);
						}
					} else {
						int var1 = 0;
						label266:
						{
							if (ea.kf_i == null) {
								ea.kf_i = bd.a(nd.compass, sh.Gb, (byte) -107, hd.cache8);
								if (dummy == 0) {
									break label266;
								}
							}

							++var1;
						}

						label261:
						{
							if (rg.kf_k != null) {
								++var1;
								if (dummy == 0) {
									break label261;
								}
							}

							rg.kf_k = bd.a(de.mapedge, sh.Gb, (byte) -107, hd.cache8);
						}

						label256:
						{
							if (ef.dfs_o == null) {
								ef.dfs_o = pb.a(sh.Gb, -45, vg.mapscene, hd.cache8);
								if (dummy == 0) {
									break label256;
								}
							}

							++var1;
						}

						label251:
						{
							if (pg.kfs_a != null) {
								++var1;
								if (dummy == 0) {
									break label251;
								}
							}

							pg.kfs_a = me.a(bi.mapfunction, hd.cache8, (byte) 78, sh.Gb);
						}

						label246:
						{
							if (pa.kfs_a != null) {
								++var1;
								if (dummy == 0) {
									break label246;
								}
							}

							pa.kfs_a = me.a(ua.hitmarks, hd.cache8, (byte) 120, sh.Gb);
						}

						label241:
						{
							if (n.kfs_k != null) {
								++var1;
								if (dummy == 0) {
									break label241;
								}
							}

							n.kfs_k = me.a(cb.headicons_pk, hd.cache8, (byte) 80, sh.Gb);
						}

						label236:
						{
							if (qd.kfs_b == null) {
								qd.kfs_b = me.a(gg.headicons_prayer, hd.cache8, (byte) 121, sh.Gb);
								if (dummy == 0) {
									break label236;
								}
							}

							++var1;
						}

						label231:
						{
							if (og.kfs_k == null) {
								og.kfs_k = me.a(ag.headicons_hint, hd.cache8, (byte) 76, sh.Gb);
								if (dummy == 0) {
									break label231;
								}
							}

							++var1;
						}

						label226:
						{
							if (jh.kfs_h == null) {
								jh.kfs_h = me.a(vf.mapmarker, hd.cache8, (byte) 84, sh.Gb);
								if (dummy == 0) {
									break label226;
								}
							}

							++var1;
						}

						label221:
						{
							if (client.kfs_pb == null) {
								client.kfs_pb = me.a(fi.lf_u, hd.cache8, (byte) 76, sh.Gb);
								if (dummy == 0) {
									break label221;
								}
							}

							++var1;
						}

						label216:
						{
							if (bc.kfs_bb == null) {
								bc.kfs_bb = me.a(kd.mapdots, hd.cache8, (byte) 84, sh.Gb);
								if (dummy == 0) {
									break label216;
								}
							}

							++var1;
						}

						label211:
						{
							if (dg.dfs_s != null) {
								++var1;
								if (dummy == 0) {
									break label211;
								}
							}

							dg.dfs_s = pb.a(sh.Gb, 109, l.scrollbar, hd.cache8);
						}

						label206:
						{
							if (pf.dfs_bb == null) {
								pf.dfs_bb = pb.a(sh.Gb, -66, ed.mod_icons, hd.cache8);
								if (dummy == 0) {
									break label206;
								}
							}

							++var1;
						}

						if (var1 < 13) {
							pf.lf_ab = de.a(new lf[]{id.lf_q, fa.a((byte) 85, 100 * var1 / 13), cb.lf_b}, -102);
							ja.int_cb = 70;
						} else {
							int var2 = -10 + (int) (21.0D * Math.random());
							int var4 = (int) (21.0D * Math.random()) - 10;
							int var3 = -10 + (int) (Math.random() * 21.0D);
							int var5 = -20 + (int) (Math.random() * 41.0D);
							he.Q.a(pf.dfs_bb, null);
							jg.db_r.a(pf.dfs_bb, null);
							ee.S.a(pf.dfs_bb, null);
							if (he.Q != jh.db_l) {
								jh.db_l.a(pf.dfs_bb, null);
							}

							rg.kf_k.f();
							ea.kf_i.f();
							int var6 = 0;
							if (dummy != 0) {
								pg.kfs_a[var6].a(var2 + var5, var3 + var5, var5 + var4);
								++var6;
							}

							while (~pg.kfs_a.length < ~var6) {
								pg.kfs_a[var6].a(var2 + var5, var3 + var5, var5 + var4);
								++var6;
							}

							ef.dfs_o[0].a(var5 + var2, var3 + var5, var5 + var4);
							uf.int_g = 90;
							pf.lf_ab = qd.lf_d;
							ja.int_cb = 70;
						}
					}
				} else {
					int[] visibilityMapData = new int[9];
					int index = 0;
					do {
						int var3 = 143 + 32 * index;
						int var4 = 3 * var3 + 600;
						int var5 = nc.X[var3];
						visibilityMapData[index] = var4 * var5 >> 16;
						++index;
					} while (index < 9);

					System.out.println(Arrays.toString(visibilityMapData));
					mb.a(visibilityMapData, 500, 800, 512, 334, 25, 3500);
					ja.int_cb = 10;
					uf.int_g = 30;
					pf.lf_ab = jg.preparedVisibilityMap;
				}
			} else {
				cb.a(4, 104, 104, u.vertexHeights);
				int height = 0;
				while (height < 4) {
					sb.lbs_e[height] = new lb(104, 104);
					++height;
				}

				of.E = new kf(512, 512);
				pf.lf_ab = vf.startingGameEngine;
				ja.int_cb = 5;
				uf.int_g = 20;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "sd.L(" + var0 + ')');
		}
	}

	final void f(int var1) {
		try {
			if (var1 != -36) {
				this.f(1);
			}

			++int_eb;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sd.E(" + var1 + ')');
		}
	}

	final ue a(int var1, bi var2, int var3, int var4, bi var5) {
		int var13 = client.int_gc;

		try {
			++int_ob;
			if (this.ints_db != null) {
				sd var15 = this.b(-1);
				return var15 == null ? null : var15.a(-107, var2, var3, var4, var5);
			} else {
				ue var6 = (ue) ie.rc_ob.a((long) this.Ab, -106);
				if (var6 == null) {
					boolean var7 = false;
					int var8 = 0;
					if (var13 != 0 || ~var8 > ~this.ints_jb.length) {
						do {
							if (!og.bg_n.d(0, this.ints_jb[var8], -121)) {
								var7 = true;
							}

							++var8;
						} while (~var8 > ~this.ints_jb.length);
					}

					if (var7) {
						return null;
					}

					oe[] var10 = new oe[this.ints_jb.length];
					int var11 = 0;
					if (var13 != 0 || ~this.ints_jb.length < ~var11) {
						do {
							var10[var11] = oe.a(og.bg_n, this.ints_jb[var11], 0);
							++var11;
						} while (~this.ints_jb.length < ~var11);
					}

					oe var9;
					label112:
					{
						if (var10.length == 1) {
							var9 = var10[0];
							if (var13 == 0) {
								break label112;
							}
						}

						var9 = new oe(var10, var10.length);
					}

					int var12;
					if (this.M != null) {
						var12 = 0;
						if (var13 != 0 || ~var12 > ~this.M.length) {
							do {
								var9.a(this.M[var12], this.shorts_nb[var12]);
								++var12;
							} while (~var12 > ~this.M.length);
						}
					}

					if (this.shorts_vb != null) {
						var12 = 0;
						if (var13 != 0 || this.shorts_vb.length > var12) {
							do {
								var9.b(this.shorts_vb[var12], this.shorts_tb[var12]);
								++var12;
							} while (this.shorts_vb.length > var12);
						}
					}

					var6 = var9.a(64 + this.S, 850 - -this.R, -30, -50, -30, true, true);
					ie.rc_ob.a((long) this.Ab, -118, var6);
				}

				ue var16;
				label143:
				{
					if (var2 != null && var5 != null) {
						var16 = var2.a(var5, var1 ^ -120, var4, var6, var3);
						if (var13 == 0) {
							break label143;
						}
					}

					if (var2 == null) {
						if (var5 == null) {
							var16 = var6.c(true);
							if (var13 == 0) {
								break label143;
							}
						}

						var16 = var5.a(var3, var6, (byte) -58);
						if (var13 == 0) {
							break label143;
						}
					}

					var16 = var2.a(var4, var6, (byte) -58);
				}

				if (var1 != -107) {
					return null;
				} else {
					if (this.int_mb != 128 || ~this.int_bb != -129) {
						var16.b(this.int_mb, this.int_bb, this.int_mb);
					}

					return var16;
				}
			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "sd.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, ja var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var2.j((byte) 126);
				if (var3 == 0) {
					break;
				}

				this.a(var3, -1, var2);
			} while (var4 == 0);

			if (var1 == 0) {
				++H;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sd.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public sd() {
		this.N = fb.lf_c;
		this.R = 0;
		this.int_cb = -1;
		this.int_fb = -1;
		this.X = -1;
		this.int_bb = 128;
		this.S = 0;
		this.P = -1;
		this.Z = -1;
		this.int_hb = -1;
		this.int_ib = 1;
		this.boolean_gb = true;
		this.O = -1;
		this.V = -1;
		this.int_ub = 32;
		this.xb = -1;
		this.int_mb = 128;
		this.short_lb = 0;
		this.W = true;
		this.zb = true;
		this.int_qb = -1;
		this.int_pb = -1;
		this.lfs_rb = new lf[5];
		this.Y = 0;
	}
}
