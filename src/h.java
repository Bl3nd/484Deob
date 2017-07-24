final class h implements Runnable {

	static int int_a;
	static int int_b = 0;
	volatile boolean boolean_c = false;
	static int int_d;
	ke ke_e;
	volatile boolean boolean_f = false;
	static int int_g;
	static int int_h;
	static lf lf_i = dd.a("Benutzen Sie die (WPasswort -=ndern(W Option", 2);
	static int int_j;
	static lf lf_k = dd.a(" <col=00ff80>", 2);
	static int int_l = 0;
	static int int_m;
	static int[] ints_n;
	volatile ah[] ahs_o = new ah[2];
	static lf lf_p = dd.a("<img=0>", 2);
	static lf lf_q = dd.a("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 2);

	public final void run() {
		try {
			this.boolean_c = true;
			++int_a;

			try {
				if (!this.boolean_f) {
					do {
						for (int var3 = 0; var3 < 2; ++var3) {
							ah class_ah = this.ahs_o[var3];
							if (class_ah != null) {
								class_ah.c(1);
							}
						}

						fc.a(10L, 95);
						q.a(this.ke_e, 0, null);
					} while (!this.boolean_f);
				}
			} catch (Exception e) {
				ah.a(null, -80, e);
			} finally {
				this.boolean_c = false;
			}

		} catch (RuntimeException var11) {
			throw ec.a(var11, "h.run(" + ')');
		}
	}

	static final void a(int var0) {
		int dummy = client.int_gc;

		try {
			++int_j;
			fh.a(false, (byte) 75);
			eh.int_n = 0;
			boolean var1 = true;
			int var2 = 0;
			for (; pd.bytes_d.length > var2; ++var2) {
				if (eh.ints_s[var2] != -1 && pd.bytes_d[var2] == null) {
					pd.bytes_d[var2] = se.cache5.a(0, 0, eh.ints_s[var2]);
					if (pd.bytes_d[var2] == null) {
						++eh.int_n;
						var1 = false;
					}
				}

				if (hh.ints_fb[var2] != -1 && ig.bytes_g[var2] == null) {
					ig.bytes_g[var2] = se.cache5.a(119, cc.X[var2], hh.ints_fb[var2], 0);
					if (ig.bytes_g[var2] == null) {
						++eh.int_n;
						var1 = false;
					}
				}
			}

			if (!var1) {
				sf.V = 1;
			} else {
				pb.int_h = 0;
				var1 = true;
				int var3 = 0;
				byte[] var4;
				int var5;
				int var6;
				for (; var3 < pd.bytes_d.length; ++var3) {
					var4 = ig.bytes_g[var3];
					if (var4 != null) {
						var5 = 64 * (l.ints_m[var3] >> 8) + -fb.int_m;
						var6 = 64 * (l.ints_m[var3] & 255) - ea.int_h;
						if (ae.V) {
							var6 = 10;
							var5 = 10;
						}

						var1 &= ng.a(var4, -94, var6, var5);
					}
				}

				if (!var1) {
					sf.V = 2;
				} else {
					if (sf.V != 0) {
						l.a(de.a(new lf[]{me.loading_pleaseWait, ea.lf_n}, 122), -1, true);
					}

					uf.a((byte) 82);
					nd.b((byte) -91);
					uf.a((byte) 106);
					ce.a();
					uf.a((byte) 101);
					System.gc();
					int var21 = 0;
					do {
						sb.lbs_e[var21].a(true);
						++var21;
					} while (var21 < 4);

					var5 = 0;
					int var7;
					while (var5 < 4) {
						var6 = 0;
						do {
							var7 = 0;
							do {
								jc.bytes_q[var5][var6][var7] = 0;
								++var7;
							} while (var7 < 104);

							++var6;
						} while (var6 < 104);

						++var5;
					}

					uf.a((byte) 110);
					fc.b(104);
					var6 = pd.bytes_d.length;
					lf.c(91);
					fh.a(true, (byte) -123);
					int var8;
					int var9;
					int var12;
					int var22;
					int var24;
					if (!ae.V) {
						var7 = 0;
						byte[] var10;
						if (var7 < var6) {
							do {
								var8 = -fb.int_m + (l.ints_m[var7] >> 8) * 64;
								var10 = pd.bytes_d[var7];
								var9 = (255 & l.ints_m[var7]) * 64 - ea.int_h;
								if (var10 != null) {
									uf.a((byte) 81);
									dc.a(var10, 8 * lc.int_t + -48, 3752, (-6 + tb.int_bb) * 8, var8, var9, sb.lbs_e);
								}

								++var7;
							} while (var7 < var6);
						}

						var8 = 0;
						if (var8 < var6) {
							do {
								var22 = 64 * (l.ints_m[var8] & 255) + -ea.int_h;
								var9 = 64 * (l.ints_m[var8] >> 8) + -fb.int_m;
								byte[] var11 = pd.bytes_d[var8];
								if (var11 == null && tb.int_bb < 800) {
									uf.a((byte) 101);
									og.a(var9, false, 64, 64, var22);
								}

								++var8;
							} while (var8 < var6);
						}

						fh.a(true, (byte) -128);
						var9 = 0;
						if (var6 > var9) {
							do {
								var10 = ig.bytes_g[var9];
								if (var10 != null) {
									var24 = (l.ints_m[var9] >> 8) * 64 - fb.int_m;
									var12 = 64 * (255 & l.ints_m[var9]) + -ea.int_h;
									uf.a((byte) 90);
									nb.a(var24, var12, var10, 97, sb.lbs_e);
								}

								++var9;
							} while (var6 > var9);
						}
					}

					int var13;
					int var14;
					int var15;
					if (ae.V) {
						var7 = 0;
						int var16;
						int var17;
						if (dummy != 0 || ~var7 > -5) {
							do {
								uf.a((byte) 123);
								var8 = 0;
								if (dummy == 0 && ~var8 <= -14) {
									++var7;
								} else {
									do {
										var9 = 0;
										if (dummy == 0 && ~var9 <= -14) {
											++var8;
										} else {
											do {
												var24 = ai.ints_g[var7][var8][var9];
												boolean var23 = false;
												if (~var24 != 0) {
													var12 = (var24 & 50361536) >> 579252184;
													var13 = (var24 & 7) >> -422784127;
													var15 = 2047 & var24 >> -531425917;
													var14 = (var24 & 16770331) >> 1395750414;
													var16 = (var14 / 8 << -1068261848) + var15 / 8;
													var17 = 0;
													if (dummy != 0 || l.ints_m.length > var17) {
														do {
															if (var16 == l.ints_m[var17] && pd.bytes_d[var17] != null) {
																var23 = true;
																i.a(var12, -15, var13, sb.lbs_e, 8 * var8, pd.bytes_d[var17], var9 * 8, var7, 8 * (7 & var15), (7 & var14) * 8);
																if (dummy == 0) {
																	break;
																}
															}

															++var17;
														} while (l.ints_m.length > var17);
													}
												}

												if (!var23) {
													u.a(false, var7, var8 * 8, 8 * var9);
												}

												++var9;
											} while (~var9 > -14);

											++var8;
										}
									} while (~var8 > -14);

									++var7;
								}
							} while (~var7 > -5);
						}

						var8 = 0;
						if (dummy != 0 || var8 < 13) {
							do {
								var9 = 0;
								if (dummy == 0 && ~var9 <= -14) {
									++var8;
								} else {
									do {
										var22 = ai.ints_g[0][var8][var9];
										if (~var22 == 0) {
											og.a(var8 * 8, false, 8, 8, var9 * 8);
										}

										++var9;
									} while (~var9 > -14);

									++var8;
								}
							} while (var8 < 13);
						}

						fh.a(true, (byte) 33);
						var9 = 0;
						if (dummy != 0 || ~var9 > -5) {
							do {
								uf.a((byte) 93);
								var22 = 0;
								if (dummy == 0 && ~var22 <= -14) {
									++var9;
								} else {
									do {
										var24 = 0;
										if (dummy == 0 && ~var24 <= -14) {
											++var22;
										} else {
											do {
												var12 = ai.ints_g[var9][var22][var24];
												if (var12 != -1) {
													var13 = (58535234 & var12) >> 995842264;
													var14 = (var12 & 6) >> 1200571521;
													var15 = 1023 & var12 >> 966872654;
													var16 = 2047 & var12 >> -1249590013;
													var17 = (var15 / 8 << 1682509448) - -(var16 / 8);
													int var18 = 0;
													if (dummy != 0 || l.ints_m.length > var18) {
														do {
															if (var17 == l.ints_m[var18] && ig.bytes_g[var18] != null) {
																nd.a(var14, 8 * var22, sb.lbs_e, ig.bytes_g[var18], var13, (7 & var16) * 8, 8 * var24, (var15 & 7) * 8, var9, -121);
																if (dummy == 0) {
																	break;
																}
															}

															++var18;
														} while (l.ints_m.length > var18);
													}
												}

												++var24;
											} while (~var24 > -14);

											++var22;
										}
									} while (~var22 > -14);

									++var9;
								}
							} while (~var9 > -5);
						}
					}

					fh.a(true, (byte) 87);
					nd.b((byte) -128);
					uf.a((byte) 113);
					hb.a(sb.lbs_e, (byte) -111);
					fh.a(true, (byte) 2);
					var7 = ie.Lb;
					if (var7 > hc.int_pb) {
						var7 = hc.int_pb;
					}

					if (-1 + hc.int_pb > var7) {
						var7 = hc.int_pb + -1;
					}

					if (!tf.boolean_q) {
						q.h(0);
					} else {
						q.h(ie.Lb);
					}

					var8 = 0;
					var9 = -44 / ((var0 - 26) / 38);
					while (var8 < 104) {
						var22 = 0;
						while (var22 < 104) {
							se.c(var8, -28592, var22);
							++var22;
						}

						++var8;
					}

					uf.a((byte) 120);
					ab.c((byte) 111);
					nd.b((byte) -72);
					if (ce.Z != null) {
						++ng.S;
						vg.J.e((byte) 88, 24);
						vg.J.b((byte) 122, 1057001181);
					}

					if (!ae.V) {
						var22 = (-6 + lc.int_t) / 8;
						var12 = (tb.int_bb + -6) / 8;
						var13 = (6 + tb.int_bb) / 8;
						var24 = (6 + lc.int_t) / 8;
						var14 = var22 - 1;
						if (var14 <= 1 + var24) {
							do {
								var15 = -1 + var12;
								if (var15 > 1 + var13) {
									++var14;
								} else {
									do {
										if (var14 < var22 || var14 > var24 || var15 < var12 || var15 > var13) {
											se.cache5.a(true, de.a(new lf[]{vf.D, fa.a((byte) 85, var14), rb.lf_f, fa.a((byte) 85, var15)}, -8));
											se.cache5.a(true, de.a(new lf[]{pg.lf_d, fa.a((byte) 85, var14), rb.lf_f, fa.a((byte) 85, var15)}, -36));
										}

										++var15;
									} while (var15 <= 1 + var13);

									++var14;
								}
							} while (var14 <= 1 + var24);
						}
					}

					de.a(30, (byte) -64);
					uf.a((byte) 108);
					ug.d((byte) -41);
					vg.J.e((byte) 118, 4);
					dh.a((byte) 1);
				}
			}
		} catch (RuntimeException var20) {
			throw ec.a(var20, "h.A(" + var0 + ')');
		}
	}

	static final void b(int var0) {
		try {
			++int_m;
			rc.ints_a = null;
			if (var0 >= -85) {
				lf_q = null;
			}

			ai.bytes_i = null;
			f.V = null;
			c.ints_db = null;
			ints_n = null;
			w.ints_f = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "h.E(" + var0 + ')');
		}
	}

	static final void a(int var0, int var1) {
		int var19 = client.int_gc;

		try {
			++int_g;
			int[] var2 = of.E.O;
			if (var0 != -1401834104) {
				lf_i = null;
			}

			int var3 = var2.length;
			int var4 = 0;
			if (var19 != 0 || var4 < var3) {
				do {
					var2[var4] = 1;
					++var4;
				} while (var4 < var3);
			}

			int var5 = 1;
			int var6;
			int var7;
			if (var19 != 0) {
				var6 = ('츀' + -(var5 * 512)) * 4 + 24628;
				var7 = 1;
				if (var19 == 0 && var7 >= 103) {
					++var5;
				} else {
					while (true) {
						if ((jc.bytes_q[var1][var7][var5] & 24) == 0) {
							hf.a(var2, var6, 512, var1, var7, var5);
						}

						if (~var1 > -4 && (8 & jc.bytes_q[1 + var1][var7][var5]) != 0) {
							hf.a(var2, var6, 512, var1 - -1, var7, var5);
						}

						var6 += 4;
						++var7;
						if (var7 >= 103) {
							++var5;
							break;
						}
					}
				}
			}

			while (~var5 > -104) {
				var6 = ('츀' + -(var5 * 512)) * 4 + 24628;
				var7 = 1;
				if (var19 == 0 && var7 >= 103) {
					++var5;
				} else {
					do {
						if ((jc.bytes_q[var1][var7][var5] & 24) == 0) {
							hf.a(var2, var6, 512, var1, var7, var5);
						}

						if (~var1 > -4 && (8 & jc.bytes_q[1 + var1][var7][var5]) != 0) {
							hf.a(var2, var6, 512, var1 - -1, var7, var5);
						}

						var6 += 4;
						++var7;
					} while (var7 < 103);

					++var5;
				}
			}

			of.E.d();
			var7 = 228 + (int) (Math.random() * 20.0D) << -2043357584;
			var6 = -10 - (-238 + (-((int) (Math.random() * 20.0D)) - (228 + (int) (20.0D * Math.random()) << 1568587632)) - ((int) (20.0D * Math.random()) + 228 << -1401834104));
			int var8 = 1;
			int var9;
			if (var19 != 0 || ~var8 > -104) {
				do {
					var9 = 1;
					if (var19 == 0 && var9 >= 103) {
						++var8;
					} else {
						do {
							if ((jc.bytes_q[var1][var9][var8] & 24) == 0) {
								od.a(var0 + 1401835640, var1, var8, var7, var6, var9);
							}

							if (var1 < 3 && ~(jc.bytes_q[1 + var1][var9][var8] & 8) != -1) {
								od.a(1536, var1 + 1, var8, var7, var6, var9);
							}

							++var9;
						} while (var9 < 103);

						++var8;
					}
				} while (~var8 > -104);
			}

			rf.int_eb = 0;
			var9 = 0;
			if (var19 == 0 && var9 >= 104) {
				gh.Z.a((byte) 10);
			} else {
				do {
					int var10 = 0;
					if (var19 == 0 && ~var10 <= -105) {
						++var9;
					} else {
						do {
							long var11 = hh.a(hc.int_pb, var9, var10);
							if (~var11 != -1L) {
								int var13 = pa.a((int) (var11 >>> 1335760352) & Integer.MAX_VALUE, 0).Hb;
								if (~var13 <= -1) {
									int var14 = var9;
									int var15 = var10;
									if (var13 != 22 && ~var13 != -30 && var13 != 34 && var13 != 36 && ~var13 != -47 && ~var13 != -48 && var13 != 48) {
										int[][] var16 = sb.lbs_e[hc.int_pb].ints_g;
										int var17 = 0;
										if (var19 != 0 || ~var17 > -11) {
											do {
												int var18 = (int) (Math.random() * 4.0D);
												if (var18 == 0 && var14 > 0 && ~(-3 + var9) > ~var14 && (var16[var14 + -1][var15] & 19661064) == 0) {
													--var14;
												}

												if (var18 == 1 && ~var14 > -104 && ~var14 > ~(3 + var9) && (19661184 & var16[var14 - -1][var15]) == 0) {
													++var14;
												}

												if (var18 == 2 && ~var15 < -1 && ~var15 < ~(var10 - 3) && ~(19661058 & var16[var14][-1 + var15]) == -1) {
													--var15;
												}

												if (var18 == 3 && ~var15 > -104 && var15 < var10 - -3 && (19661088 & var16[var14][var15 + 1]) == 0) {
													++var15;
												}

												++var17;
											} while (~var17 > -11);
										}
									}

									mf.kfs_t[rf.int_eb] = pg.kfs_a[var13];
									l.ints_c[rf.int_eb] = var14;
									ag.ints_g[rf.int_eb] = var15;
									++rf.int_eb;
								}
							}

							++var10;
						} while (~var10 > -105);

						++var9;
					}
				} while (var9 < 104);

				gh.Z.a((byte) 10);
			}
		} catch (RuntimeException var20) {
			throw ec.a(var20, "h.D(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			lf_q = null;
			lf_i = null;
			if (var0 < 78) {
				a(-92, 74, (byte) 87);
			}

			lf_k = null;
			lf_p = null;
			ints_n = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "h.C(" + var0 + ')');
		}
	}

	static final int a(int var0, int var1, byte var2) {
		try {
			if (var2 > -31) {
				return -26;
			} else {
				++int_d;
				int var3 = ja.a(var1 + -1, (byte) 127, var0 - 1) - -ja.a(var1 + 1, (byte) 123, var0 - 1) + ja.a(-1 + var1, (byte) 121, 1 + var0) + ja.a(1 + var1, (byte) 127, 1 + var0);
				int var4 = ja.a(-1 + var1, (byte) 125, var0) + (ja.a(1 + var1, (byte) 123, var0) - (-ja.a(var1, (byte) 122, -1 + var0) - ja.a(var1, (byte) 121, 1 + var0)));
				int var5 = ja.a(var1, (byte) 123, var0);
				return var4 / 8 + var3 / 16 + var5 / 4;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "h.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}
}
