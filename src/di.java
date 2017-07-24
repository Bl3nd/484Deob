final class di extends j {

	static lf Q = dd.a("<col=00ff00>", 2);
	static int R;
	private int S = 1365;
	private int T = 20;
	private int U = 0;
	static int V = 0;
	static int[] W;
	static int X;
	static lf Y = dd.a("Ung-Ultiger Benutzername", 2);
	static int Z;
	static int int_ab;
	private int int_bb = 0;
	static lf lf_cb = dd.a("Ihr Charakter)2Profil wird in:", 2);
	static int int_db;
	static int int_eb;
	static int int_fb;
	static short[][] shorts_gb;

	static final void a(byte var0, uc var1, int var2) {
		try {
			if (var0 != 58) {
				Q = null;
			}

			if (var1.int_bb > pd.int_i) {
				lh.a(var1, var0 ^ 58);
			} else {
				if (var1.int_jb >= pd.int_i) {
					te.a(-3, var1);
				} else {
					ab.a(var1, (byte) -25);
				}
			}

			++R;
			if (var1.int_fb < 128 || var1.int_nc < 128 || var1.int_fb >= 13184 || var1.int_nc >= 13184) {
				var1.int_jb = 0;
				var1.Nb = -1;
				var1.int_nc = 128 * var1.xb[0] + (var1.int_qc * 64);
				var1.int_fb = 128 * var1.ints_db[0] + (64 * var1.int_qc);
				var1.int_bb = 0;
				var1.int_bc = -1;
				var1.c(true);
			}

			if (r.X == var1 && (var1.int_fb < 1536 || var1.int_nc < 1536 || var1.int_fb >= 11776 || var1.int_nc >= 11776)) {
				var1.Nb = -1;
				var1.int_nc = 128 * var1.xb[0] + var1.int_qc * 64;
				var1.int_bb = 0;
				var1.int_bc = -1;
				var1.int_jb = 0;
				var1.int_fb = 64 * var1.int_qc + var1.ints_db[0] * 128;
				var1.c(true);
			}

			bi.a(true, var1);
			d.a(1, var1);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "di.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static final void a(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		try {
			if (var3) {
				++X;
				if (var2 >= 1 && ~var0 <= -2 && ~var2 >= -103 && var0 <= 102) {
					if (tf.boolean_q && hc.int_pb != var1) {
						return;
					}

					long var8 = 0L;
					boolean var10 = true;
					boolean var11 = false;
					if (var5 == 0) {
						var8 = bg.c(var1, var2, var0);
					}

					boolean var12 = false;
					if (var5 == 1) {
						var8 = hd.a(var1, var2, var0);
					}

					if (var5 == 2) {
						var8 = tc.d(var1, var2, var0);
					}

					if (var5 == 3) {
						var8 = hh.a(var1, var2, var0);
					}

					if (var8 != 0L) {
						int var17 = (int) var8 >> -341410348 & 3;
						int var15 = Integer.MAX_VALUE & (int) (var8 >>> 1180575072);
						int var16 = (int) var8 >> -144623378 & 31;
						i var13;
						if (~var5 == -1) {
							d.c(var1, var2, var0);
							var13 = pa.a((int) var15, 0);
							if (~var13.V != -1) {
								sb.lbs_e[var1].a(var13.xb, var0, var2, var17, var16, 115);
							}
						}

						if (var5 == 1) {
							nh.d(var1, var2, var0);
						}

						if (~var5 == -3) {
							tc.c(var1, var2, var0);
							var13 = pa.a((int) var15, 0);
							if (var13.L + var2 > 103 || ~(var13.L + var0) < -104 || var2 - -var13.I > 103 || var13.I + var0 > 103) {
								return;
							}

							if (var13.V != 0) {
								sb.lbs_e[var1].a((boolean) var3, var17, var13.L, var0, var13.I, var13.xb, var2);
							}
						}

						if (~var5 == -4) {
							j.b(var1, var2, var0);
							var13 = pa.a((int) var15, 0);
							if (~var13.V == -2) {
								sb.lbs_e[var1].b(var0, var2, (byte) -33);
							}
						}
					}

					if (~var7 <= -1) {
						int var18 = var1;
						if (var1 < 3 && ~(2 & jc.bytes_q[1][var2][var0]) == -3) {
							var18 = var1 + 1;
						}

						wh.a(var7, var6, var4, var0, sb.lbs_e[var1], true, var18, var2, var1);
						return;
					}
				}

			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "di.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	public di() {
		super(0, true);
	}

	static final void a(int var0, bg var1) {
		try {
			if (var0 == 11432) {
				gh.bg_hb = var1;
				++int_eb;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "di.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var14 = client.int_gc;

		try {
			++int_fb;
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int var4 = 0;
				if (var14 != 0 || ~var4 > ~ff.int_a) {
					do {
						int var5 = this.int_bb + (ef.ints_m[var4] << -354911988) / this.S;
						int var6 = this.U + (fc.G[var2] << -1326903444) / this.S;
						int var7 = var5;
						int var8 = var6;
						int var10 = var6;
						int var11 = var5 * var5 >> 135964300;
						int var9 = var5;
						int var13 = 0;
						int var12 = var6 * var6 >> 353062316;
						if (var14 != 0 || var11 + var12 < 16384 && ~this.T < ~var13) {
							do {
								++var13;
								var10 = (var9 * var10 >> -2127482356) * 2 - -var8;
								var9 = var11 - var12 + var7;
								var11 = var9 * var9 >> -989408756;
								var12 = var10 * var10 >> -507070740;
							} while (var11 + var12 < 16384 && ~this.T < ~var13);
						}

						var3[var4] = ~var13 > ~(this.T - 1) ? (var13 << 1903516332) / this.T : 0;
						++var4;
					} while (~var4 > ~ff.int_a);
				}
			}

			return var1 > -49 ? null : var3;
		} catch (RuntimeException var15) {
			throw ec.a(var15, "di.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void d(byte var0) {
		int var6 = client.int_gc;

		try {
			try {
				label44:
				{
					if (mf.F != null) {
						byte[] var1 = mf.F.b(1);
						if (var1 == null) {
							break label44;
						}

						ja var2 = new ja(var1);
						gb.int_fb = var2.b(true);
						sb.fds_j = new fd[gb.int_fb];
						int var3 = 0;
						if (var6 != 0 || var3 < gb.int_fb) {
							do {
								fd var4 = sb.fds_j[var3] = new fd();
								int var5 = var2.b(true);
								var4.boolean_p = ('耀' & var5) != 0;
								var4.int_r = 32767 & var5;
								var4.lf_c = var2.e((byte) 87);
								var4.int_k = var2.c(true);
								var4.int_i = var3;
								var4.int_o = pd.a(var4.lf_c, -95);
								++var3;
							} while (var3 < gb.int_fb);
						}

						jg.a(r.ints_db, 0, -1 + sb.fds_j.length, sb.fds_j, var0 ^ -107, ne.ints_h);
						od.W = true;
						mf.F = null;
						if (var6 == 0) {
							break label44;
						}
					}

					mf.F = new ib(eh.ke_o, de.a(new lf[]{ge.lf_a, sh.Jb, ef.lf_p}, -46).f(var0 + 105));
				}
			} catch (Exception var7) {
				var7.printStackTrace();
				mf.F = null;
			}

			if (var0 == -105) {
				++Z;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "di.H(" + var0 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			if (var1 >= -120) {
				V = -56;
			}

			label47:
			{
				label46:
				{
					label45:
					{
						label44:
						{
							if (var2 != 0) {
								if (var2 == 1) {
									break label44;
								}

								if (var2 == 2) {
									break label45;
								}

								if (~var2 != -4) {
									break label47;
								}

								if (var5 == 0) {
									break label46;
								}
							}

							this.S = var3.b(true);
							if (var5 == 0) {
								break label47;
							}
						}

						this.T = var3.b(true);
						if (var5 == 0) {
							break label47;
						}
					}

					this.int_bb = var3.b(true);
					if (var5 == 0) {
						break label47;
					}
				}

				this.U = var3.b(true);
			}

			++int_ab;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "di.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void e(byte var0) {
		try {
			W = null;
			Q = null;
			lf_cb = null;
			shorts_gb = null;
			Y = null;
			if (var0 < 52) {
				W = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "di.B(" + var0 + ')');
		}
	}
}
