import java.io.IOException;

final class sg {

	static int int_a = 0;
	static int[] ints_b = new int[]{7, 0, 0, -1, 0, 2, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 3, 1, 0, -2, 0, -1, -2, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 24, 0, 7, 6, 4, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 11, 6, 0, 0, 0, 0, 3, 0, 0, 0, -1, 6, 6, 10, 0, 6, 0, 0, 5, 0, 0, 7, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 6, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 4, 2, 0, 0, 0, 0, 0, 6, 0, 5, 10, 0, 0, 0, 0, 6, 0, 15, 0, 0, 0, 0, -2, 5, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 12, 2, 0, 0, 0, 0, 4, 0, -2, -1, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 3, -2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 6, 0, 0, 0, 0, 8, 0, 0, 0, 5, 11, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, -1, 0, 0, 0};
	static int int_c;
	static long long_d;
	static int int_e;
	static volatile boolean boolean_f = false;
	static int int_g;
	static int int_h;
	static int int_i;
	static int[] ints_j = new int[2000];
	static int int_k;

	public static void a(int var0) {
		try {
			if (var0 != -21365) {
				long_d = 8L;
			}

			ints_b = null;
			ints_j = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sg.C(" + var0 + ')');
		}
	}

	static final void b(int var0) {
		int var3 = client.int_gc;

		try {
			kd.S = 0;
			++int_k;
			u.int_bd = 0;
			rd.b(16636);
			fh.a(false);
			pd.b(4);
			int var1 = 0;
			int var2;
			if (var3 != 0) {
				var2 = ne.ints_m[var1];
				if (pd.int_i != th.ps_g[var2].int_rc) {
					th.ps_g[var2].xc = null;
					th.ps_g[var2] = null;
				}

				++var1;
			}

			for (; u.int_bd > var1; ++var1) {
				var2 = ne.ints_m[var1];
				if (pd.int_i != th.ps_g[var2].int_rc) {
					th.ps_g[var2].xc = null;
					th.ps_g[var2] = null;
				}
			}

			if (var0 >= 30) {
				if (wb.int_g != ka.I.P) {
					throw new RuntimeException("gnp1 pos:" + ka.I.P + " psize:" + wb.int_g);
				} else {
					var2 = 0;
					if (var3 != 0 || a.int_j > var2) {
						do {
							if (th.ps_g[a.ints_h[var2]] == null) {
								throw new RuntimeException("gnp2 pos:" + var2 + " size:" + a.int_j);
							}

							++var2;
						} while (a.int_j > var2);

					}
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sg.G(" + var0 + ')');
		}
	}

	static final void c(int var0) {
		try {
			if (var0 == 13238) {
				++int_e;

				while (true) {
					of var1;
					synchronized (f.W) {
						var1 = (of) hc.tf_fb.a((byte) 108);
					}

					if (var1 == null) {
						return;
					}

					var1.z.a(var1.y, var1.wb_n, false, false, (int) var1.long_e);
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "sg.F(" + var0 + ')');
		}
	}

	static final int a(int var0, int var1, int var2, byte var3) {
		try {
			++int_i;
			if (var3 < 97) {
				d(19);
			}

			int var4 = -var1 + 256;
			return (('\uff00' & var0) * var4 + (var2 & '\uff00') * var1 & 16711680) + (-16711936 & var1 * (16711935 & var2) + var4 * (var0 & 16711935)) >> -665372408;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sg.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final sc a(boolean var0) {
		try {
			if (ch.sc_c == null) {
				ch.sc_c = new sc();
			}

			if (!var0) {
				return null;
			} else {
				++int_h;
				return ch.sc_c;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sg.B(" + var0 + ')');
		}
	}

	static final boolean d(int var0) {
		int dummy = client.int_gc;

		try {
			long var1 = nb.a(false);
			++int_c;
			int var3 = (int) (-long_d + var1);
			long_d = var1;
			if (var3 > 200) {
				var3 = 200;
			}

			client.int_ob += var3;
			if (ad.int_s == 0 && rf.R == 0 && ce.R == 0 && qb.W == 0) {
				return true;
			} else if (vf.H == null) {
				return false;
			} else {
				try {
					if (client.int_ob > 30000) {
						throw new IOException();
					} else {
						label243:
						while (true) {
							te var4;
							ja var5;
							if (rf.R < 20) {
								if (qb.W > 0) {
									var4 = (te) qa.eh_cb.a((byte) 91);
									var5 = new ja(4);
									var5.e(-13488, 1);
									var5.a((int) var4.long_e, -2140);
									vf.H.a(-120, 0, 4, var5.yb);
									od.X.a(var4.long_e, false, var4);
									--qb.W;
									++rf.R;
									continue;
								}

								if (dummy == 0 && (ad.int_s >= 20 || ce.R <= 0)) {
									break;
								}
							} else if (ad.int_s >= 20 || ce.R <= 0) {
								break;
							}

							while (true) {
								var4 = (te) ad.l_f.a(false);
								var5 = new ja(4);
								var5.e(-13488, 0);
								assert var4 != null;
								var5.a((int) var4.long_e, -2140);
								vf.H.a(-88, 0, 4, var5.yb);
								var4.c((byte) 3);
								bb.eh_lb.a(var4.long_e, false, var4);
								++ad.int_s;
								--ce.R;
								if (ad.int_s >= 20 || ce.R <= 0) {
									break label243;
								}
							}
						}

						int var21 = 0;
						do {
							int var22 = vf.H.a(-87);
							if (var22 < 0) {
								throw new IOException();
							}

							if (var22 == 0) {
								break;
							}

							client.int_ob = 0;
							byte var6 = 0;
							if (l.te_g != null) {
								if (ia.int_k == 0) {
									var6 = 1;
								}
							} else {
								var6 = 8;
							}

							if (var6 <= 0) {
								int crcLen = -l.te_g.H + qb.ja_cb.yb.length;
								int len = 512 + -ia.int_k;
								if (-qb.ja_cb.P + crcLen < len) {
									len = crcLen - qb.ja_cb.P;
								}

								if (len > var22) {
									len = var22;
								}

								vf.H.a(var0 ^ 26874, len, qb.ja_cb.yb, qb.ja_cb.P);
								if (hf.A != 0) {
									int var9 = 0;
									if (dummy != 0 || len > var9) {
										do {
											qb.ja_cb.yb[var9 + qb.ja_cb.P] = (byte) cc.c(qb.ja_cb.yb[var9 + qb.ja_cb.P], hf.A);
											++var9;
										} while (len > var9);
									}
								}

								qb.ja_cb.P += len;
								ia.int_k += len;
								if (qb.ja_cb.P == crcLen) {
									if (l.te_g.long_e != 16711935L) {
										qa.crc32_ab.reset();
										qa.crc32_ab.update(qb.ja_cb.yb, 0, crcLen);
										int var9 = (int) qa.crc32_ab.getValue();
										if (var9 != l.te_g.Q) {
											try {
												vf.H.a((byte) -100);
											} catch (Exception e) {
												e.printStackTrace();
											}

											hf.A = (byte) ((int) (1.0D + 255.0D * Math.random()));
											++uh.z;
											vf.H = null;
											return false;
										}

										hf.int_b = 0;
										uh.z = 0;
										l.te_g.G.a(qb.ja_cb.yb, -50, (l.te_g.long_e & 16711680L) == 16711680L, nh.V, (int) (65535L & l.te_g.long_e));
									} else {
										mf.A = qb.ja_cb;
										int var9 = 0;
										do {
											oh var10 = f.U[var9];
											if (var10 != null) {
												mf.A.P = var9 * 8 + 5;
												int var11 = mf.A.l(15);
												int var12 = mf.A.l(15);
												var10.e(var0 ^ 26878, var11, var12);
											}

											++var9;
										} while (var9 < 256);
									}

									l.te_g.a(true);
									ia.int_k = 0;
									qb.ja_cb = null;
									l.te_g = null;
									if (nh.V) {
										--rf.R;
										++var21;
										continue;
									} else {
										--ad.int_s;
									}
								} else {
									if (ia.int_k != 512 && dummy == 0) {
										break;
									}

									ia.int_k = 0;
								}
							} else {
								int var7 = var6 + -lb.D.P;
								if (var22 < var7) {
									var7 = var22;
								}

								vf.H.a(-66, var7, lb.D.yb, lb.D.P);
								if (hf.A != 0) {
									int var8 = 0;
									if (dummy != 0 || var8 < var7) {
										do {
											lb.D.yb[var8 + lb.D.P] = (byte) cc.c(lb.D.yb[var8 + lb.D.P], hf.A);
											++var8;
										} while (~var8 > ~var7);
									}
								}

								lb.D.P += var7;
								if (~lb.D.P > ~var6) {
									break;
								}

								if (l.te_g == null) {
									lb.D.P = 0;
									int var8 = lb.D.j((byte) 78);
									int var9 = lb.D.b(true);
									long var24 = (long) (var9 + (var8 << 16));
									int var23 = lb.D.j((byte) 99);
									int var11 = lb.D.l(var0 + -26746);
									te var14 = (te) od.X.a(var24, (byte) -117);
									nh.V = true;
									if (var14 == null) {
										var14 = (te) bb.eh_lb.a(var24, (byte) -80);
										nh.V = false;
									}

									if (var14 == null) {
										throw new IOException();
									}

									l.te_g = var14;
									int var15 = var23 != 0 ? 9 : 5;
									qb.ja_cb = new ja(l.te_g.H + var15 + var11);
									qb.ja_cb.e(var0 + -40249, var23);
									qb.ja_cb.b((byte) 114, var11);
									ia.int_k = 8;
									lb.D.P = 0;
								} else if (ia.int_k == 0) {
									if (lb.D.yb[0] != -1) {
										l.te_g = null;
									} else {
										ia.int_k = 1;
										lb.D.P = 0;
									}
								}
							}

							++var21;
						} while (var21 < 100);

						if (var0 != 26761) {
							boolean_f = false;
						}

						return true;
					}
				} catch (IOException ioException) {
					try {
						vf.H.a((byte) -128);
					} catch (Exception e) {
						e.printStackTrace();
					}

					vf.H = null;
					++hf.int_b;
					return false;
				}
			}
		} catch (RuntimeException var20) {
			throw ec.a(var20, "sg.D(" + var0 + ')');
		}
	}

	static final void e(int var0) {
		int var3 = client.int_gc;

		try {
			++int_g;
			kd.S = 0;
			u.int_bd = 0;
			jc.c(1);
			me.a(14099);
			lc.a(5);
			hd.b(116);
			int var1 = 0;
			int var2;
			if (var3 != 0) {
				var2 = ne.ints_m[var1];
				if (w.us_e[var2].int_rc != pd.int_i) {
					w.us_e[var2] = null;
				}

				++var1;
			}

			for (; var1 < u.int_bd; ++var1) {
				var2 = ne.ints_m[var1];
				if (w.us_e[var2].int_rc != pd.int_i) {
					w.us_e[var2] = null;
				}
			}

			if (~ka.I.P != ~wb.int_g) {
				throw new RuntimeException("gpp1 pos:" + ka.I.P + " psize:" + wb.int_g);
			} else {
				if (var0 < 101) {
					int_a = 110;
				}

				var2 = 0;
				if (var3 != 0 || ~var2 > ~r.Y) {
					do {
						if (w.us_e[nd.ints_k[var2]] == null) {
							throw new RuntimeException("gpp2 pos:" + var2 + " size:" + r.Y);
						}

						++var2;
					} while (~var2 > ~r.Y);

				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sg.E(" + var0 + ')');
		}
	}
}
