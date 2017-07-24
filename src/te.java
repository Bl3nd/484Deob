final class te extends ph {

	oh G;
	byte H;
	static lf I = dd.a("Standort", 2);
	static int J = -1;
	static int K;
	static int L;
	static int M = 0;
	private static lf N = dd.a("Please enter your username)3", 2);
	static int O;
	static lf P;
	int Q;

	static final void a(ua paramua, byte paramByte) {
		//System.out.println("Method void a(ua, byte) in class te could not be decompiled");
		int i5 = client.int_gc;
		try {
			O += 1;
			if (od.W) {
				ge.a(paramua, 12346);
				return;
			}
			if (h.int_b == 1 && nh.int_mb >= 715 && gg.int_o >= 453) {
				ef.boolean_l = !ef.boolean_l;
				if (ef.boolean_l) {
					pd.a(-29672);
				} else {
					cc.a(255, og.scape_main, pf.Y, false, l.cache6, 0);
				}
			}
			if (ld.Z == 5) {
				return;
			}
			rb.int_c += 1;
			if (ld.Z != 10) {
				return;
			}
			if (vh.int_b != 2 && eh.int_q == 0) {
				if (h.int_b == 1) {
					int i = 5;
					int j = 463;
					int m = 35;
					int k = 100;
					if (i <= nh.int_mb && k + i >= nh.int_mb && j <= gg.int_o && gg.int_o <= m + j) {
						di.d((byte) -105);
						return;
					}
				}
				if (mf.F != null) {
					di.d((byte) -105);
				}
			}
			int k = 73 / ((10 - paramByte) / 41);
			int j = nh.int_mb;
			int vali = h.int_b;
			int m = gg.int_o;
			int n;
			int i1;
			int i2;
			if (lf.J != 0) {
				if (lf.J == 2) {
					n = 231;
					n += 30;
					if (vali == 1 && m >= n + -15 && m < n) {
						pg.int_i = 0;
					}
					n += 15;
					i1 = 302;
					i2 = 321;
					if (vali == 1 && m >= -15 + n && n > m) {
						pg.int_i = 1;
					}
					n += 15;
					if (vali == 1 && j >= -75 + i1 && 75 + i1 >= j && m >= -20 + i2 && 20 + i2 >= m) {
						pf.Q = pf.Q.d(true).e(true);
						if (pf.Q.e(34943) == 0) {
							gg.a(112, bc.lf_e, P, bc.I);
							return;
						}
						if (~pf.lf_kb.e(34943) == -1) {
							gg.a(95, bc.lf_i, sf.Q, bc.lf_a);
							return;
						}
						gg.a(87, bc.lf_n, vd.lf_db, bc.lf_eb);
						de.a(20, (byte) -64);
						return;
					}
					i1 = 462;
					if (vali == 1 && -75 + i1 <= j && i1 + 75 >= j && m >= i2 + -20 && m <= i2 + 20) {
						pf.Q = pf.Y;
						lf.J = 0;
						pf.lf_kb = pf.Y;
					}
					while (la.a(0)) {
						int i3 = 0;
						int i4 = 0;
						while (~i4 > ~ig.lf_j.e(-30593)) {
							if (~i.X == ~ig.lf_j.a(44, i4)) {
								i3 = 1;
								if (i5 == 0) {
									break;
								}
							}
							i4++;
						}
						if (pg.int_i == 0) {
							if (wb.int_f == 85 && pf.Q.e(-30593) > 0) {
								pf.Q = pf.Q.a(-1 + pf.Q.e(-30593), 0, 95);
							}
							if (wb.int_f == 84 || wb.int_f == 80) {
								pg.int_i = 1;
							}
							if (i3 != 0 && ~pf.Q.e(-30593) > -13) {
								pf.Q = pf.Q.d(117, i.X);
							}
						} else if (~pg.int_i == -2) {
							if (~wb.int_f == -86 && pf.lf_kb.e(-30593) > 0) {
								pf.lf_kb = pf.lf_kb.a(-1 + pf.lf_kb.e(-30593), 0, 126);
							}
							if (wb.int_f == 84 || ~wb.int_f == -81) {
								pg.int_i = 0;
							}
							if (~ch.int_s != -1 && ~wb.int_f == -85) {
								pf.Q = pf.Q.d(true).e(true);
								if (pf.Q.e(-30593) == 0) {
									gg.a(122, bc.lf_e, P, bc.I);
									return;
								}
								if (~pf.lf_kb.e(-30593) == -1) {
									gg.a(96, bc.lf_i, sf.Q, bc.lf_a);
									return;
								}
								gg.a(90, bc.lf_n, vd.lf_db, bc.lf_eb);
								de.a(20, (byte) -64);
								return;
							}
							if (i3 != 0 && ~pf.lf_kb.e(-30593) > -21) {
								pf.lf_kb = pf.lf_kb.d(117, i.X);
							}
						}
					}
					return;
				}
				if (lf.J == 3) {
					n = 382;
					i1 = 321;
					if (vali == 1 && -75 + n <= j && j <= n + 75 && i1 + -20 <= m && i1 + 20 >= m) {
						lf.J = 0;
					}
				}
			} else {
				n = 302;
				i1 = 291;
				i2 = 0;
				if (vali == 1 && n - 75 <= j && n + 75 >= j && i1 + -20 <= m && i1 + 20 >= m) {
					pg.int_i = 0;
					lf.J = 3;
				}
				if (ch.int_s != 0) {
					while (la.a(0)) {
						if (wb.int_f == 84) {
							i2 = 1;
							if (i5 == 0) {
								break;
							}
						}
					}
				}
				n = 462;
				if (i2 != 0 || vali == 1 && -75 + n <= j && 75 + n >= j && -20 + i1 <= m && m <= 20 + i1) {
					pf.X = bc.lf_ib;
					pg.int_i = 0;
					lf.J = 2;
					pf.lf_ib = qb.X;
					pf.lf_jb = bc.lf_r;
				}
			}
		} catch (RuntimeException localRuntimeException) {
			throw ec.a(localRuntimeException, "te.B(" + (paramua != null ? "{...}" : "null") + ',' + paramByte + ')');
		}
	}

	static final void a(int var0, uc var1) {
		try {
			if (~pd.int_i == ~var1.int_jb || ~var1.int_bc == 0 || var1.Ab != 0 || ~(1 + var1.Zb) < ~client.a(var0 ^ -15, var1.int_bc).T[var1.int_ob]) {
				int var2 = var1.int_jb + -var1.int_bb;
				int var3 = pd.int_i + -var1.int_bb;
				int var4 = var1.int_kc * 128 + 64 * var1.int_qc;
				int var5 = 64 * var1.int_qc + var1.int_ib * 128;
				int var6 = 128 * var1.Bb + var1.int_qc * 64;
				var1.int_fb = (var4 * (-var3 + var2) + var3 * var6) / var2;
				int var7 = 128 * var1.int_oc - -(64 * var1.int_qc);
				var1.int_nc = ((var2 - var3) * var5 - -(var3 * var7)) / var2;
			}

			var1.int_gb = 0;
			if (~var1.int_rb == -1) {
				var1.int_ec = 1024;
			}

			++L;
			if (~var1.int_rb == -2) {
				var1.int_ec = 1536;
			}

			if (~var1.int_rb == var0) {
				var1.int_ec = 0;
			}

			if (var1.int_rb == 3) {
				var1.int_ec = 512;
			}

			var1.int_mb = var1.int_ec;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "te.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void b(boolean var0) {
		try {
			if (var0) {
				N = null;
			}

			P = null;
			I = null;
			N = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "te.A(" + var0 + ')');
		}
	}

	static {
		P = N;
	}
}
