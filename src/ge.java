final class ge {

	static lf lf_a = dd.a("http:)4)4www)3runescape)3com", 2);
	static int int_b;
	static int int_c;
	static int int_d;
	static int int_e;
	private static lf lf_f = dd.a(")4l", 2);
	static byte byte_g;
	static int int_h;
	static int int_i;

	static final void a(ua var0, int var1) {
		try {
			if (var1 != 12346) {
				byte_g = -58;
			}

			++int_e;
			if (~h.int_b == -2) {
				short var2 = 280;
				if (var2 <= nh.int_mb && var2 + 14 >= nh.int_mb && ~gg.int_o <= -5 && gg.int_o <= 18) {
					jg.a(0, 0, 2001);
					return;
				}

				if (~nh.int_mb <= ~(var2 + 15) && ~(var2 + 80) <= ~nh.int_mb && gg.int_o >= 4 && ~gg.int_o >= -19) {
					jg.a(1, 0, 2001);
					return;
				}

				short var3 = 390;
				if (var3 <= nh.int_mb && var3 - -14 >= nh.int_mb && ~gg.int_o <= -5 && ~gg.int_o >= -19) {
					jg.a(0, 1, 2001);
					return;
				}

				if (var3 - -15 <= nh.int_mb && ~(var3 - -80) <= ~nh.int_mb && gg.int_o >= 4 && ~gg.int_o >= -19) {
					jg.a(1, 1, 2001);
					return;
				}

				short var4 = 500;
				if (~var4 >= ~nh.int_mb && var4 + 14 >= nh.int_mb && ~gg.int_o <= -5 && ~gg.int_o >= -19) {
					jg.a(0, 2, 2001);
					return;
				}

				if (15 + var4 <= nh.int_mb && nh.int_mb <= 80 + var4 && gg.int_o >= 4 && gg.int_o <= 18) {
					jg.a(1, 2, 2001);
					return;
				}

				short var5 = 610;
				if (nh.int_mb >= var5 && 14 + var5 >= nh.int_mb && ~gg.int_o <= -5 && ~gg.int_o >= -19) {
					jg.a(0, 3, 2001);
					return;
				}

				if (nh.int_mb >= var5 + 15 && ~(var5 + 80) <= ~nh.int_mb && ~gg.int_o <= -5 && ~gg.int_o >= -19) {
					jg.a(1, 3, 2001);
					return;
				}

				if (~nh.int_mb <= -709 && gg.int_o >= 4 && nh.int_mb <= 758 && ~gg.int_o >= -21) {
					od.W = false;
					kd.kf_mb.b(0, 0);
					f.S.b(382, 0);
					ra.Q.a(382 + -(ra.Q.N / 2), 18);
					return;
				}

				if (~vd.Z != 0) {
					fd var6 = sb.fds_j[vd.Z];
					if (gh.boolean_fb != !var6.boolean_p) {
						byte[] var10 = de.a(new lf[]{var6.lf_c, pg.lf_e}, var1 ^ -12311).c((byte) 62);
						uf.string_f = new String(var10, 0, var10.length);
						hd.int_u = var6.int_r;
						if (~ch.int_s != -1) {
							ch.int_s = 0;
							gb.int_hb = 443;
							nh.R = 'ꩊ';
							wd.int_lb = 'ꩊ';
						}

						od.W = false;
						kd.kf_mb.b(0, 0);
						f.S.b(382, 0);
						ra.Q.a(382 - ra.Q.N / 2, 18);
						return;
					}

					lf var7 = de.a(new lf[]{th.lf_f, var6.lf_c, pg.lf_e, sh.Jb, lf_f, fa.a((byte) 85, !tf.boolean_q ? 0 : 1), ja.Y, fa.a((byte) 85, vh.int_b), lb.C, fa.a((byte) 85, p.Bc)}, 123);

					try {
						var0.getAppletContext().showDocument(var7.f(0), "_self");
						return;
					} catch (Exception var8) {
						return;
					}
				}
			}

		} catch (RuntimeException var9) {
			throw ec.a(var9, "ge.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static final void a(byte var0, int regionY, int regionX, int localX, int localY, int height) {
		int dummy = client.int_gc;

		try {
			++int_i;
			if (regionX != lc.int_t || regionY != tb.int_bb || height != rh.V && tf.boolean_q) {
				tb.int_bb = regionY;
				rh.V = height;
				lc.int_t = regionX;
				if (!tf.boolean_q) {
					rh.V = 0;
				}

				de.a(25, (byte) -64);
				l.a(me.loading_pleaseWait, var0 ^ -95, true);
				int var7 = ea.int_h;
				ea.int_h = -48 + 8 * regionY;
				int var6 = fb.int_m;
				int var9 = -var7 + ea.int_h;
				var7 = ea.int_h;
				fb.int_m = 8 * (regionX - 6);
				int var8 = -var6 + fb.int_m;
				var6 = fb.int_m;
				int var10 = 0;
				do {
					p var11 = th.ps_g[var10];
					if (var11 != null) {
						int var12 = 0;
						do {
							var11.ints_db[var12] -= var8;
							var11.xb[var12] -= var9;
							++var12;
						} while (var12 < 10);

						var11.int_fb -= var8 * 128;
						var11.int_nc -= var9 * 128;
					}

					++var10;
				} while (var10 < 32768);

				int var25 = 0;
				int var13;
				u var26;
				for (; var25 < 2048; ++var25) {
					var26 = w.us_e[var25];
					if (var26 != null) {
						var13 = 0;
						do {
							var26.ints_db[var13] -= var8;
							var26.xb[var13] -= var9;
							++var13;
						} while (var13 < 10);

						var26.int_nc -= 128 * var9;
						var26.int_fb -= 128 * var8;
					}
				}

				hc.int_pb = height;
				byte var27 = 0;
				byte var28 = 104;
				r.X.a(true, localY, false, localX);
				if (var0 != 94) {
					lf_a = null;
				}

				byte var16 = 104;
				byte var14 = 1;
				byte var15 = 0;
				if (~var8 > -1) {
					var28 = -1;
					var27 = 103;
					var14 = -1;
				}

				byte var17 = 1;
				if (var9 < 0) {
					var15 = 103;
					var17 = -1;
					var16 = -1;
				}

				int var18 = var27;
				do {
					int var19 = var15;
					do {
						int var20 = var18 + var8;
						int var21 = var9 + var19;
						int var22 = 0;
						do {
							if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
								vh.tfs_h[var22][var18][var19] = vh.tfs_h[var22][var20][var21];
							} else {
								vh.tfs_h[var22][var18][var19] = null;
							}

							++var22;
						} while (var22 < 4);

						var19 += var17;
					} while (var16 != var19);

					var18 += var14;
				} while (var18 != var28);

				ic var29 = (ic) ef.tf_i.c(81);
				if (var29 == null) {
					if (e.int_d != 0) {
						ka.S -= var9;
						e.int_d -= var8;
					}

					wh.int_p = -1;
					lf.boolean_q = false;
					jg.int_q = 0;
					bb.V.e(var0 ^ -15046);
					ca.tf_n.e(-15004);
				} else {
					do {
						var29.int_n -= var9;
						var29.int_s -= var8;
						if (var29.int_s < 0 || var29.int_n < 0 || ~var29.int_s <= -105 || var29.int_n >= 104) {
							var29.a(true);
						}

						var29 = (ic) ef.tf_i.d(-1);
					} while (var29 != null);

					if (e.int_d != 0) {
						ka.S -= var9;
						e.int_d -= var8;
					}

					wh.int_p = -1;
					lf.boolean_q = false;
					jg.int_q = 0;
					bb.V.e(var0 ^ -15046);
					ca.tf_n.e(-15004);
				}
			}
		} catch (RuntimeException var24) {
			throw ec.a(var24, "ge.C(" + var0 + ',' + regionY + ',' + regionX + ',' + localX + ',' + localY + ',' + height + ')');
		}
	}

	static final void a(int var0, int var1, int var2) {
		try {
			++int_h;
			if (hg.int_a == 2) {
				ec.a((-fb.int_m + pa.x << 522231847) - -ag.int_h, (va.V + -ea.int_h << 13778631) + i.N, (byte) 124, vf.A * 2);
				if (var1 == -28) {
					if (~th.int_c < 0 && ~(pd.int_i % 20) > -11) {
						og.kfs_k[0].a(-12 + th.int_c + var2, -28 + uc.int_ic + var0);
					}
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ge.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_f = null;
			if (var0 == -5115) {
				lf_a = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ge.D(" + var0 + ')');
		}
	}
}
