import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Method;

final class pd implements MouseListener, MouseMotionListener, FocusListener {

	static int int_a;
	static int int_b;
	static int int_c;
	static byte[][] bytes_d;
	static int[] ints_e;
	static int int_f;
	static int int_g;
	static int[] ints_h;
	static int int_i = 0;
	static int int_j;
	static int int_k;
	static int int_l;
	static int int_m;
	static int int_n;
	static int int_o;
	static int int_p;
	static int int_q;
	static int int_r;
	static long long_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static lf lf_w = dd.a("Ihr Spielkonto wird bereits benutzt)3", 2);
	static lf x = dd.a("T", 2);
	static bg y;

	static void a(int var0) {
		try {
			if (var0 != -29672) {
				long_s = -95L;
			}

			gg.sh_n.f((byte) 33);
			be.bg_l = null;
			++int_f;
			ig.int_r = 1;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pd.E(" + var0 + ')');
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		try {
			if (j.z != null) {
				label27:
				{
					gg.int_h = 0;
					hg.int_g = var1.getX();
					ed.int_v = var1.getY();
					lc.D = nb.a(false);
					if (var1.isMetaDown()) {
						bh.int_bb = 2;
						fa.W = 2;
						if (client.int_gc == 0) {
							break label27;
						}
					}

					bh.int_bb = 1;
					fa.W = 1;
				}
			}

			++int_b;
			if (var1.isPopupTrigger()) {
				var1.consume();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mousePressed(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static void b(int var0) {
		int var8 = client.int_gc;

		try {
			if (var0 != 4) {
				a(35, 98, (u) null, (byte) 58, -92);
			}

			int var1 = 0;
			if (var8 == 0 && var1 >= kd.S) {
				++int_k;
			} else {
				do {
					int var2 = kh.T[var1];
					p var3 = th.ps_g[var2];
					int var4 = ka.I.j((byte) 77);
					int var5;
					int var6;
					if ((var4 & 8) != 0) {
						label99:
						{
							var5 = ka.I.p(var0 ^ 251);
							if (~var5 == -65536) {
								var5 = -1;
							}

							var6 = ka.I.j((byte) 71);
							if (var5 == var3.int_bc && var5 != -1) {
								int var7 = client.a(12, var5).int_db;
								if (~var7 == -2) {
									var3.int_ob = 0;
									var3.Zb = 0;
									var3.Ab = var6;
									var3.Yb = 0;
								}

								if (var7 != 2) {
									break label99;
								}

								var3.Yb = 0;
								if (var8 == 0) {
									break label99;
								}
							}

							if (~var5 == 0 || ~var3.int_bc == 0 || ~client.a(12, var5).int_kb <= ~client.a(var0 ^ 8, var3.int_bc).int_kb) {
								var3.int_ob = 0;
								var3.Zb = 0;
								var3.Ab = var6;
								var3.Yb = 0;
								var3.int_bc = var5;
								var3.int_qb = var3.int_tb;
							}
						}
					}

					if ((1 & var4) != 0) {
						var3.Sb = ka.I.e((byte) 87);
						var3.int_dc = 100;
					}

					if (~(32 & var4) != -1) {
						var3.int_ac = ka.I.b(255);
						var3.Tb = ka.I.b(true);
					}

					if ((2 & var4) != 0) {
						var5 = ka.I.o(var0 ^ 122);
						var6 = ka.I.n(28747);
						var3.a(var6, (byte) -123, var5, int_i);
					}

					if (~(var4 & 64) != -1) {
						var3.xc = uh.a((byte) -99, ka.I.b(var0 + 251));
						var3.int_ab = var3.xc.xb;
						var3.int_eb = var3.xc.int_hb;
						var3.int_uc = var3.xc.int_cb;
						var3.int_wb = var3.xc.int_ub;
						var3.zb = var3.xc.O;
						var3.Eb = var3.xc.Z;
						var3.int_pb = var3.xc.int_fb;
						var3.int_hc = var3.xc.int_pb;
						var3.int_qc = var3.xc.int_ib;
					}

					if (~(16 & var4) != -1) {
						var3.Mb = ka.I.b(true);
						if (var3.Mb == '\uffff') {
							var3.Mb = -1;
						}
					}

					if ((var4 & 128) != 0) {
						var5 = ka.I.n(28747);
						var6 = ka.I.j((byte) 96);
						var3.a(var6, (byte) -111, var5, int_i);
						var3.int_jc = 300 + int_i;
						var3.Wb = ka.I.j(var0 + 24259);
					}

					if ((4 & var4) != 0) {
						var3.Nb = ka.I.p(255);
						var5 = ka.I.g((byte) -24);
						var3.int_lc = var5 >> 810522608;
						var3.int_cc = 0;
						var3.int_kb = 0;
						if (var3.Nb == '\uffff') {
							var3.Nb = -1;
						}

						var3.int_tc = int_i + (var5 & '\uffff');
						if (var3.int_tc > int_i) {
							var3.int_cc = -1;
						}
					}

					++var1;
				} while (var1 < kd.S);

				++int_k;
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "pd.F(" + var0 + ')');
		}
	}

	static void a(byte var0, Component component) {
		try {
			++int_o;
			if (var0 < 123) {
				a(-13, -45, (u) null, (byte) -56, -91);
			}

			Method method = ke.method_r;
			if (method != null) {
				try {
					method.invoke(component, Boolean.FALSE);
				} catch (Throwable throwable) {
					throwable.printStackTrace();
				}
			}

			component.addKeyListener(wc.Q);
			component.addFocusListener(wc.Q);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "pd.C(" + var0 + ',' + (component != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void focusLost(FocusEvent var1) {
		try {
			if (j.z != null) {
				fa.W = 0;
			}

			++int_q;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		try {
			++int_p;
			if (j.z != null) {
				gg.int_h = 0;
				dh.int_g = var1.getX();
				fa.int_cb = var1.getY();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mouseMoved(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		try {
			++int_l;
			if (j.z != null) {
				gg.int_h = 0;
				dh.int_g = var1.getX();
				fa.int_cb = var1.getY();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mouseEntered(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void focusGained(FocusEvent var1) {
		try {
			++int_v;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(byte var0) {
		try {
			ints_h = null;
			y = null;
			if (var0 == -23) {
				ints_e = null;
				bytes_d = null;
				x = null;
				lf_w = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pd.D(" + var0 + ')');
		}
	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		try {
			++int_a;
			if (j.z != null) {
				gg.int_h = 0;
				dh.int_g = var1.getX();
				fa.int_cb = var1.getY();
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mouseDragged(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		try {
			if (j.z != null) {
				gg.int_h = 0;
				fa.W = 0;
			}

			if (var1.isPopupTrigger()) {
				var1.consume();
			}

			++int_u;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mouseReleased(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public final void mouseClicked(MouseEvent var1) {
		try {
			if (var1.isPopupTrigger()) {
				var1.consume();
			}

			++int_m;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mouseClicked(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static int a(lf var0, int var1) {
		try {
			++int_t;
			if (eh.int_q == 1) {
				return 7;
			} else if (var0.b((byte) -114, qe.lf_h)) {
				return 1;
			} else if (var0.b((byte) -126, fd.lf_e)) {
				return 1;
			} else if (var0.b((byte) -82, pe.lf_i)) {
				return 2;
			} else if (var0.b((byte) -122, hb.lf_m)) {
				return 2;
			} else if (var0.b((byte) -79, ch.lf_d)) {
				return 3;
			} else if (var0.b((byte) -97, cc.lf_eb)) {
				return 4;
			} else if (var0.b((byte) -111, p.Ic)) {
				return 4;
			} else {
				int var2 = -119 / ((-43 - var1) / 49);
				return var0.b((byte) -85, ac.L) ? 5 : (var0.b((byte) -82, cb.lf_r) ? 6 : 0);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		try {
			if (j.z != null) {
				gg.int_h = 0;
				dh.int_g = -1;
				fa.int_cb = -1;
			}

			++int_n;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "pd.mouseExited(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static void a(int var0, int var1, u var2, byte var3, int var4) {
		int var9 = client.int_gc;

		try {
			++int_j;
			if (r.X != var2) {
				if (qa.int_eb < 400) {
					if (var3 != 32) {
						b(46);
					}

					lf var5;
					label106:
					{
						if (var2.int_hd != 0) {
							var5 = de.a(new lf[]{var2.Dc, ch.lf_k, td.K, fa.a((byte) 85, var2.int_hd), ha.O}, var3 ^ 86);
							if (var9 == 0) {
								break label106;
							}
						}

						var5 = de.a(new lf[]{var2.Dc, bh.a(var2.Xc, r.X.Xc, var3 ^ 32171), ch.lf_k, jg.D, fa.a((byte) 85, var2.Xc), ha.O}, 119);
					}

					int var6;
					label115:
					{
						if (~pa.int_u == -2) {
							ba.a(var4, var1, ha.lf_o, (short) 1, (long) var0, var3 + 468, de.a(new lf[]{wb.lf_b, ld.W, var5}, var3 ^ -7));
							++rd.J;
							if (var9 == 0) {
								break label115;
							}
						}

						if (nb.boolean_a) {
							if ((8 & qh.int_i) != 8) {
								break label115;
							}

							ba.a(var4, var1, md.lf_d, (short) 12, (long) var0, 500, de.a(new lf[]{sd.U, ld.W, var5}, -103));
							++f.X;
							if (var9 == 0) {
								break label115;
							}
						}

						var6 = 7;
						if (var9 != 0 || var6 >= 0) {
							do {
								if (wd.lfs_kb[var6] != null) {
									short var7;
									label117:
									{
										var7 = 0;
										if (!wd.lfs_kb[var6].a((byte) -121, jf.B)) {
											if (!af.x[var6]) {
												break label117;
											}

											var7 = 2000;
											if (var9 == 0) {
												break label117;
											}
										}

										if (r.X.Xc < var2.Xc) {
											var7 = 2000;
										}

										if (r.X.Lc != 0 && ~var2.Lc != -1) {
											label59:
											{
												if (r.X.Lc == var2.Lc) {
													var7 = 2000;
													if (var9 == 0) {
														break label59;
													}
												}

												var7 = 0;
											}
										}
									}

									++uc.int_nb;
									boolean var8 = false;
									short var11 = tc.U[var6];
									var11 += var7;
									ba.a(var4, var1, wd.lfs_kb[var6], var11, (long) var0, 500, de.a(new lf[]{md.lf_m, var5}, 123));
								}

								--var6;
							} while (var6 >= 0);
						}
					}

					var6 = 0;
					if (var9 != 0 || qa.int_eb > var6) {
						do {
							if (d.Q[var6] == 25) {
								th.lfs_a[var6] = de.a(new lf[]{md.lf_m, var5}, 119);
								return;
							}

							++var6;
						} while (qa.int_eb > var6);

					}
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "pd.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
		}
	}
}
