final class bi extends ph {

	static int G;
	boolean H = false;
	static lf I = dd.a("Schlie-8en", 2);
	static int K;
	int L = -1;
	static da M;
	private static lf N = dd.a(" is already on your friend list)3", 2);
	static int O;
	static int[] P = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
	int[] Q;
	static lf R;
	int[] T;
	private int[] U;
	int V = -1;
	static int W;
	static lf X = dd.a("welle2:", 2);
	static int Y;
	static lf Z = dd.a("(Y<)4col>", 2);
	static int int_ab;
	static int int_bb;
	static lf lf_cb;
	int int_db = 2;
	private int[] ints_eb;
	int int_fb = -1;
	static lf mapfunction = dd.a("mapfunction", 2);//lf_gb
	int int_hb = -1;
	int int_ib = 99;
	static int int_jb;
	int int_kb = 5;
	static int int_lb;
	static lf titlebutton = dd.a("titlebutton", 2);//lf_mb
	static int int_nb;
	static int int_ob;
	int[] ints_pb;
	static int int_qb;
	private static lf lf_rb = dd.a("This computers address has been blocked", 2);
	int int_sb = -1;

	static final void a(int var0, int var1) {
		int var4 = client.int_gc;

		try {
			++int_qb;
			if (var1 != -1) {
				if (de.booleans_w[var1]) {
					fd.cache3.e(var1, 120);
					if (sc.vgs_db[var1] != null) {
						boolean var2 = true;
						int var3 = 0;
						if (var4 == 0 && sc.vgs_db[var1].length <= var3) {
							if (var2) {
								sc.vgs_db[var1] = null;
							}

							if (var0 > -51) {
								b(-103);
							}

							de.booleans_w[var1] = false;
						} else {
							do {
								if (sc.vgs_db[var1][var3] != null) {
									label37:
									{
										if (~sc.vgs_db[var1][var3].int_ib == -3) {
											var2 = false;
											if (var4 == 0) {
												break label37;
											}
										}

										sc.vgs_db[var1][var3] = null;
									}
								}

								++var3;
							} while (sc.vgs_db[var1].length > var3);

							if (var2) {
								sc.vgs_db[var1] = null;
							}

							if (var0 > -51) {
								b(-103);
							}

							de.booleans_w[var1] = false;
						}
					}
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bi.J(" + var0 + ',' + var1 + ')');
		}
	}

	public static void b(int var0) {
		try {
			M = null;
			titlebutton = null;
			N = null;
			Z = null;
			mapfunction = null;
			lf_rb = null;
			X = null;
			I = null;
			if (var0 <= 85) {
				a(63, (int) 63);
			}

			lf_cb = null;
			R = null;
			P = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "bi.L(" + var0 + ')');
		}
	}

	final void a(ja var1, byte var2) {
		int var4 = client.int_gc;

		try {
			++int_ab;

			int var3;
			do {
				var3 = var1.j((byte) 85);
				if (~var3 == -1) {
					break;
				}

				this.a(var3, (byte) 6, var1);
			} while (var4 == 0);

			var3 = -96 / ((var2 - -30) / 49);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "bi.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final ue a(bi var1, int var2, int var3, ue var4, int var5) {
		try {
			var3 = this.Q[var3];
			td var6 = uf.a(var3 >> -353034640, (byte) 72);
			var3 &= '\uffff';
			++G;
			if (var6 == null) {
				return var1.a(var5, var4, (byte) -58);
			} else {
				var5 = var1.Q[var5];
				td var7 = uf.a(var5 >> -2074312752, (byte) 33);
				var5 &= '\uffff';
				int var8 = -23 / ((-71 - var2) / 45);
				ue var9;
				if (var7 == null) {
					var9 = var4.c(!var6.a((byte) 101, var3));
					var9.a(var6, var3);
					return var9;
				} else {
					var9 = var4.c(!var6.a((byte) -113, var3) & !var7.a((byte) 105, var5));
					var9.a(var6, var3, var7, var5, this.ints_eb);
					return var9;
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "bi.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	private final void a(int var1, byte var2, ja var3) {
		int var8 = client.int_gc;

		try {
			if (var2 != 6) {
				this.a(-7, (byte) -127, (ja) null);
			}

			label191:
			{
				int var4;
				int var5;
				int var6;
				if (~var1 != -2) {
					if (var1 == 2) {
						this.int_fb = var3.b(true);
						if (var8 == 0) {
							break label191;
						}
					}

					if (var1 == 3) {
						var4 = var3.j((byte) 124);
						this.ints_eb = new int[1 + var4];
						var5 = 0;
						if (var8 != 0 || var4 > var5) {
							do {
								this.ints_eb[var5] = var3.j((byte) 121);
								++var5;
							} while (var4 > var5);
						}

						this.ints_eb[var4] = 9999999;
						if (var8 == 0) {
							break label191;
						}
					}

					if (~var1 != -5) {
						if (~var1 == -6) {
							this.int_kb = var3.j((byte) 119);
							if (var8 == 0) {
								break label191;
							}
						}

						if (~var1 != -7) {
							if (var1 == 7) {
								this.int_hb = var3.b(true);
								if (var8 == 0) {
									break label191;
								}
							}

							if (~var1 == -9) {
								this.int_ib = var3.j((byte) 123);
								if (var8 == 0) {
									break label191;
								}
							}

							if (var1 != 9) {
								if (~var1 == -11) {
									this.int_sb = var3.j((byte) 100);
									if (var8 == 0) {
										break label191;
									}
								}

								if (~var1 == -12) {
									this.int_db = var3.j((byte) 120);
									if (var8 == 0) {
										break label191;
									}
								}

								if (~var1 == -13) {
									var4 = var3.j((byte) 111);
									this.U = new int[var4];
									var5 = 0;
									if (var8 != 0 || var5 < var4) {
										do {
											this.U[var5] = var3.b(true);
											++var5;
										} while (var5 < var4);
									}

									var6 = 0;
									if (var8 != 0 || var4 > var6) {
										do {
											this.U[var6] += var3.b(true) << -595659888;
											++var6;
										} while (var4 > var6);
									}

									if (var8 == 0) {
										break label191;
									}
								}

								if (~var1 != -14) {
									break label191;
								}

								var4 = var3.j((byte) 125);
								this.ints_pb = new int[var4];
								var5 = 0;
								if (var8 != 0 || ~var5 > ~var4) {
									do {
										this.ints_pb[var5] = var3.f((byte) 59);
										++var5;
									} while (~var5 > ~var4);
								}

								if (var8 == 0) {
									break label191;
								}
							}

							this.V = var3.j((byte) 72);
							if (var8 == 0) {
								break label191;
							}
						}

						this.L = var3.b(true);
						if (var8 == 0) {
							break label191;
						}
					}

					this.H = true;
					if (var8 == 0) {
						break label191;
					}
				}

				var4 = var3.b(true);
				this.T = new int[var4];
				var5 = 0;
				if (var8 != 0 || ~var4 < ~var5) {
					do {
						this.T[var5] = var3.b(true);
						++var5;
					} while (~var4 < ~var5);
				}

				this.Q = new int[var4];
				var6 = 0;
				if (var8 != 0 || var4 > var6) {
					do {
						this.Q[var6] = var3.b(true);
						++var6;
					} while (var4 > var6);
				}

				int var7 = 0;
				if (var8 != 0 || ~var4 < ~var7) {
					do {
						this.Q[var7] = (var3.b(true) << 1635697488) - -this.Q[var7];
						++var7;
					} while (~var4 < ~var7);
				}
			}

			++int_nb;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "bi.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final ue a(ue var1, int var2, int var3) {
		try {
			++int_lb;
			int var4 = this.Q[var2];
			td var5 = uf.a(var4 >> 516678064, (byte) 103);
			var4 &= '\uffff';
			if (var3 != 516678064) {
				I = null;
			}

			if (var5 == null) {
				return var1.c(true);
			} else {
				int var7 = 0;
				td var6 = null;
				if (this.U != null && ~var2 > ~this.U.length) {
					var7 = this.U[var2];
					var6 = uf.a(var7 >> 333341392, (byte) 43);
					var7 &= '\uffff';
				}

				ue var8;
				if (var6 != null && ~var7 != -65536) {
					var8 = var1.c(!var5.a((byte) 99, var4) & !var6.a((byte) -111, var7));
					var8.a(var5, var4);
					var8.a(var6, var7);
					return var8;
				} else {
					var8 = var1.c(!var5.a((byte) 104, var4));
					var8.a(var5, var4);
					return var8;
				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "bi.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	final ue b(ue var1, int var2, int var3) {
		try {
			if (var3 != 2047) {
				this.c(-48);
			}

			++int_ob;
			var2 = this.Q[var2];
			td var4 = uf.a(var2 >> 792058128, (byte) -76);
			var2 &= '\uffff';
			if (var4 == null) {
				return var1.d(true);
			} else {
				ue var5 = var1.d(!var4.a((byte) -40, var2));
				var5.a(var4, var2);
				return var5;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bi.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(boolean var0, uc class_uc) {
		try {
			++W;
			if (class_uc.int_wb != 0) {
				int var3;
				int var4;
				if (class_uc.Mb != -1 && class_uc.Mb < '耀') {
					p var2 = th.ps_g[class_uc.Mb];
					if (var2 != null) {
						var4 = class_uc.int_nc + -var2.int_nc;
						var3 = -var2.int_fb + class_uc.int_fb;
						if (var3 != 0 || var4 != 0) {
							class_uc.int_ec = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047;
						}
					}
				}

				int var8;
				if (class_uc.Mb >= '耀') {
					var8 = class_uc.Mb - '耀';
					if (fh.int_d == var8) {
						var8 = 2047;
					}

					u var9 = w.us_e[var8];
					if (var9 != null) {
						var4 = class_uc.int_fb - var9.int_fb;
						int var5 = class_uc.int_nc + -var9.int_nc;
						if (var4 != 0 || var5 != 0) {
							class_uc.int_ec = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
						}
					}
				}

				if ((class_uc.int_ac != 0 || class_uc.Tb != 0) && (class_uc.int_tb == 0 || class_uc.int_gb > 0)) {
					var3 = class_uc.int_nc + -((-ea.int_h + -ea.int_h + class_uc.Tb) * 64);
					var8 = class_uc.int_fb - (class_uc.int_ac - fb.int_m - fb.int_m) * 64;
					if (var8 != 0 || var3 != 0) {
						class_uc.int_ec = 2047 & (int) (Math.atan2((double) var8, (double) var3) * 325.949D);
					}

					class_uc.int_ac = 0;
					class_uc.Tb = 0;
				}

				var8 = 2047 & class_uc.int_ec - class_uc.int_mb;
				if (var0) {
					if (var8 == 0) {
						class_uc.Ub = 0;
					} else {
						++class_uc.Ub;
						boolean var10;
						if (var8 > 1024) {
							class_uc.int_mb -= class_uc.int_wb;
							var10 = true;
							if (class_uc.int_wb > var8 || -class_uc.int_wb + 2048 < var8) {
								var10 = false;
								class_uc.int_mb = class_uc.int_ec;
							}

							if (class_uc.Jb == class_uc.int_ab && (class_uc.Ub > 25 || var10)) {
								if (class_uc.int_eb != -1) {
									class_uc.Jb = class_uc.int_eb;
								} else {
									class_uc.Jb = class_uc.int_uc;
								}
							}
						} else {
							class_uc.int_mb += class_uc.int_wb;
							var10 = true;
							if (var8 < class_uc.int_wb || 2048 - class_uc.int_wb < var8) {
								class_uc.int_mb = class_uc.int_ec;
								var10 = false;
							}

							if (class_uc.Jb == class_uc.int_ab && (class_uc.Ub > 25 || var10)) {
								if (class_uc.Eb == -1) {
									class_uc.Jb = class_uc.int_uc;
								} else {
									class_uc.Jb = class_uc.Eb;
								}
							}
						}

						class_uc.int_mb &= 2047;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "bi.G(" + var0 + ',' + "{...}" + ')');
		}
	}

	final void c(int var1) {
		try {
			++int_jb;
			if (~this.int_sb == 0) {
				label28:
				{
					if (this.ints_eb == null) {
						this.int_sb = 0;
						if (client.int_gc == 0) {
							break label28;
						}
					}

					this.int_sb = 2;
				}
			}

			if (var1 >= -118) {
				this.a((bi) null, -72, -52, (ue) null, 104);
			}

			if (this.V == -1) {
				if (this.ints_eb == null) {
					this.V = 0;
				} else {
					this.V = 2;
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "bi.H(" + var1 + ')');
		}
	}

	final ue a(int var1, ue var2, int var3, byte var4) {
		int var7 = client.int_gc;

		try {
			++K;
			var1 = this.Q[var1];
			td var5 = uf.a(var1 >> 1220047344, (byte) -47);
			var1 &= '\uffff';
			if (var5 == null) {
				return var2.c(true);
			} else {
				if (var4 != -57) {
					this.a((ja) null, (byte) -52);
				}

				ue var6;
				label64:
				{
					var3 &= 3;
					var6 = var2.c(!var5.a((byte) -91, var1));
					if (var3 == 1) {
						var6.e();
						if (var7 == 0) {
							break label64;
						}
					}

					if (var3 == 2) {
						var6.d();
						if (var7 == 0) {
							break label64;
						}
					}

					if (~var3 == -4) {
						var6.f();
					}
				}

				var6.a(var5, var1);
				if (~var3 != -2) {
					if (~var3 != -3) {
						if (var3 != 3) {
							return var6;
						}

						var6.e();
						if (var7 == 0) {
							return var6;
						}
					}

					var6.d();
					if (var7 == 0) {
						return var6;
					}
				}

				var6.f();
				return var6;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "bi.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final void a(int var0, byte var1) {
		int var3 = client.int_gc;

		try {
			if (var1 == 90) {
				label152:
				{
					++int_bb;
					if (~var0 == 2) {
						gg.a(96, bc.H, pb.lf_c, jf.lf_v);
						if (var3 == 0) {
							break label152;
						}
					}

					if (~var0 == 1) {
						gg.a(var1 ^ 44, bc.lf_l, cb.lf_c, bc.lf_ab);
						if (var3 == 0) {
							break label152;
						}
					}

					if (var0 != -1) {
						if (~var0 != -4) {
							if (var0 != 4) {
								if (~var0 == -6) {
									gg.a(121, bc.lf_db, ie.Ob, rf.lf_fb);
									if (var3 == 0) {
										break label152;
									}
								}

								if (~var0 == -7) {
									gg.a(102, bc.K, bb.X, jc.lf_w);
									if (var3 == 0) {
										break label152;
									}
								}

								if (~var0 == -8) {
									gg.a(121, bc.Z, pa.lf_w, sf.R);
									if (var3 == 0) {
										break label152;
									}
								}

								if (~var0 == -9) {
									gg.a(113, bc.lf_w, nf.lf_g, ph.lf_n);
									if (var3 == 0) {
										break label152;
									}
								}

								if (~var0 == -10) {
									gg.a(125, bc.lf_fb, lb.lf_s, re.lf_m);
									if (var3 == 0) {
										break label152;
									}
								}

								if (~var0 != -11) {
									if (var0 == 11) {
										gg.a(107, bc.lf_q, pb.lf_l, tc.lf_mb);
										if (var3 == 0) {
											break label152;
										}
									}

									if (~var0 != -13) {
										if (var0 != 13) {
											if (~var0 != -15) {
												if (~var0 == -17) {
													gg.a(110, bc.U, d.T, bg.lf_a);
													if (var3 == 0) {
														break label152;
													}
												}

												if (var0 == 17) {
													gg.a(86, bc.S, ch.lf_r, uf.lf_e);
													if (var3 == 0) {
														break label152;
													}
												}

												if (~var0 == -19) {
													gg.a(95, bc.R, ka.Z, re.lf_n);
													if (var3 == 0) {
														break label152;
													}
												}

												if (var0 == 19) {
													gg.a(114, pa.lf_l, ne.lf_c, ig.lf_l);
													if (var3 == 0) {
														break label152;
													}
												}

												if (var0 != 20) {
													if (~var0 == -23) {
														gg.a(93, bc.L, wc.W, lb.lf_w);
														if (var3 == 0) {
															break label152;
														}
													}

													if (var0 != 23) {
														if (~var0 == -25) {
															gg.a(122, bc.lf_jb, ma.lf_s, de.lf_s);
															if (var3 == 0) {
																break label152;
															}
														}

														if (~var0 == -26) {
															gg.a(var1 ^ 55, bc.lf_b, pb.lf_d, kb.lf_i);
															if (var3 == 0) {
																break label152;
															}
														}

														if (var0 != 26) {
															if (var0 != 27) {
																gg.a(86, bc.G, pb.lf_k, dh.lf_e);
																if (var3 == 0) {
																	break label152;
																}
															}

															gg.a(110, bc.lf_hb, rc.lf_g, bc.lf_c);
															if (var3 == 0) {
																break label152;
															}
														}

														gg.a(111, bc.V, cb.lf_o, R);
														if (var3 == 0) {
															break label152;
														}
													}

													gg.a(var1 + 17, bc.lf_f, ad.pleaseWait1MinuteAndTryAgain2, ad.noReplyFromLoginserver);
													if (var3 == 0) {
														break label152;
													}
												}

												gg.a(106, bc.lf_p, pb.lf_m, va.lf_fb);
												if (var3 == 0) {
													break label152;
												}
											}

											gg.a(var1 + 10, bc.lf_k, ad.pleaseWait1MinuteAndTryAgain, pf.W);
											if (var3 == 0) {
												break label152;
											}
										}

										gg.a(var1 ^ 33, bc.lf_kb, pb.lf_a, p.yc);
										if (var3 == 0) {
											break label152;
										}
									}

									gg.a(127, bc.lf_g, of.D, pa.lf_t);
									if (var3 == 0) {
										break label152;
									}
								}

								gg.a(var1 + 17, bc.y, dg.lf_n, ph.lf_v);
								if (var3 == 0) {
									break label152;
								}
							}

							gg.a(123, bc.lf_v, ph.x, oh.lf_wb);
							if (var3 == 0) {
								break label152;
							}
						}

						gg.a(120, bc.Y, ff.lf_k, bc.E);
						if (var3 == 0) {
							break label152;
						}
					}

					gg.a(var1 ^ 57, bc.z, pb.lf_b, ub.lf_ab);
				}

				de.a(10, (byte) -64);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "bi.F(" + var0 + ',' + var1 + ')');
		}
	}

	final ue a(int var1, ue var2, byte var3) {
		try {
			++O;
			var1 = this.Q[var1];
			td var4 = uf.a(var1 >> 2064164816, (byte) -109);
			var1 &= '\uffff';
			if (var4 == null) {
				return var2.c(true);
			} else {
				ue var5 = var2.c(!var4.a((byte) 100, var1));
				if (var3 != -58) {
					this.int_fb = -6;
				}

				var5.a(var4, var1);
				return var5;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "bi.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	static {
		lf_cb = N;
		R = lf_rb;
	}
}
