import java.io.IOException;

final class tf {

	static int int_a;
	static lf lf_b = dd.a("und Ihr Passwort ein)3", 2);
	static int int_c;
	static boolean boolean_d = false;
	static int int_e;
	static lf lf_f = dd.a("Okay", 2);
	static int int_g;
	static int int_h;
	static int int_i;
	static int int_j;
	static int int_k;
	static int int_l;
	static int int_m;
	hb hb_n = new hb();
	static int int_o;
	static int int_p;
	static boolean boolean_q = false;
	static lf lf_r = dd.a("Verbindung konnte nicht hergestellt werden)3", 2);
	static int int_s;
	private hb hb_t;
	static int int_u;

	final hb a(int var1) {
		try {
			++int_a;
			hb var2 = this.hb_n.hb_f;
			if (this.hb_n == var2) {
				this.hb_t = null;
				return null;
			} else {
				this.hb_t = var2.hb_f;
				if (var1 <= 116) {
					this.a((hb) null, (byte) 99);
				}

				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tf.K(" + var1 + ')');
		}
	}

	final void a(hb var1, byte var2) {
		try {
			++int_c;
			if (var1.hb_f != null) {
				var1.a(true);
			}

			var1.hb_f = this.hb_n;
			var1.hb_i = this.hb_n.hb_i;
			var1.hb_f.hb_i = var1;
			if (var2 != -69) {
				lf_b = null;
			}

			var1.hb_i.hb_f = var1;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "tf.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	static final boolean b(int var0) {
		int var16 = client.int_gc;

		try {
			++int_j;
			if (fd.nd_s == null) {
				return false;
			} else {
				int var3;
				try {
					int var1 = fd.nd_s.a(var0 ^ 65);
					if (~var1 == -1) {
						return false;
					}

					if (of.int_r == -1) {
						--var1;
						fd.nd_s.a(-120, 1, ka.I.yb, 0);
						ka.I.P = 0;
						of.int_r = ka.I.q(30882);
						wb.int_g = sg.ints_b[of.int_r];
					}

					if (wb.int_g == var0) {
						if (~var1 >= -1) {
							return false;
						}

						--var1;
						fd.nd_s.a(125, 1, ka.I.yb, 0);
						wb.int_g = ka.I.yb[0] & 255;
					}

					if (wb.int_g == -2) {
						if (~var1 >= -2) {
							return false;
						}

						fd.nd_s.a(116, 2, ka.I.yb, 0);
						var1 -= 2;
						ka.I.P = 0;
						wb.int_g = ka.I.b(true);
					}

					if (~var1 > ~wb.int_g) {
						return false;
					}

					ka.I.P = 0;
					fd.nd_s.a(123, wb.int_g, ka.I.yb, 0);
					mc.A = 0;
					id.C = va.int_bb;
					va.int_bb = bd.int_o;
					bd.int_o = of.int_r;
					int var4;
					int var5;
					int var6;
					int var20;
					int var28;
					if (of.int_r == 56) {
						var20 = ka.I.d(true);
						var3 = ka.I.b(true);
						var5 = 31 & var3 >> 5;
						var6 = 31 & var3;
						var4 = var3 >> 10 & 31;
						var28 = (var5 << 11) + ((var4 << 19) - -(var6 << 3));
						vg var60 = ra.a(var20, (byte) 126);
						if (~var28 != ~var60.C) {
							var60.C = var28;
							mc.a(var60, -23101);
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 61) {
						ci.int_tb = ka.I.b(true) * 30;
						of.int_r = -1;
						kd.int_db = hf.int_p;
						return true;
					}

					if (of.int_r == 207) {
						var20 = ka.I.k(1440014816);
						ac.int_ab = var20;
						wb.a((byte) 58, (int) var20);
						bc.f(2000000, ac.int_ab);
						var3 = 0;
						if (var16 != 0) {
							va.booleans_db[var3] = true;
							++var3;
						}

						while (~var3 > -101) {
							va.booleans_db[var3] = true;
							++var3;
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -224) {
						hg.int_a = ka.I.j((byte) 76);
						if (hg.int_a == 1) {
							cc.int_fb = ka.I.b(true);
						}

						if (hg.int_a >= 2 && hg.int_a <= 6) {
							if (~hg.int_a == -3) {
								i.N = 64;
								ag.int_h = 64;
							}

							if (~hg.int_a == -4) {
								i.N = 64;
								ag.int_h = 0;
							}

							if (hg.int_a == 4) {
								ag.int_h = 128;
								i.N = 64;
							}

							if (~hg.int_a == -6) {
								i.N = 0;
								ag.int_h = 64;
							}

							if (hg.int_a == 6) {
								i.N = 128;
								ag.int_h = 64;
							}

							hg.int_a = 2;
							pa.x = ka.I.b(true);
							va.V = ka.I.b(true);
							vf.A = ka.I.j((byte) 93);
						}

						if (hg.int_a == 10) {
							lb.F = ka.I.b(true);
						}

						of.int_r = -1;
						return true;
					}

					lf var22;
					long var47;
					if (~of.int_r == -253) {
						var47 = ka.I.i(var0 + -1495411551);
						var22 = bf.c(ff.a(ka.I, (byte) 78).d((byte) -68));
						kd.a(of.a((byte) 117, var47).e(true), false, var22, 6);
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 31) {
						jh.a(false, (byte) 104);
						of.int_r = -1;
						return true;
					}

					int var8;
					int var12;
					long var36;
					int var49;
					if (of.int_r == 17) {
						re.int_c = hf.int_p;
						var47 = ka.I.i(-1495411552);
						if (~var47 == -1L) {
							uh.jcs_r = null;
							of.int_r = -1;
							bh.lf_ib = null;
							ec.lf_db = null;
							n.int_h = 0;
							return true;
						}

						var36 = ka.I.i(var0 + -1495411551);
						bh.lf_ib = of.a((byte) -106, var36);
						ec.lf_db = of.a((byte) 108, var47);
						of.x = ka.I.m(3);
						var6 = ka.I.j((byte) 88);
						if (var6 == 255) {
							of.int_r = -1;
							return true;
						}

						n.int_h = var6;
						jc[] var62 = new jc[100];
						var8 = 0;
						if (var16 != 0) {
							var62[var8] = new jc();
							var62[var8].long_e = ka.I.i(-1495411552);
							var62[var8].lf_p = of.a((byte) -86, var62[var8].long_e);
							var62[var8].int_v = ka.I.b(true);
							var62[var8].byte_s = ka.I.m(3);
							if (~wa.Nb == ~var62[var8].long_e) {
								ge.byte_g = var62[var8].byte_s;
							}

							++var8;
						}

						for (; ~var8 > ~n.int_h; ++var8) {
							var62[var8] = new jc();
							var62[var8].long_e = ka.I.i(-1495411552);
							var62[var8].lf_p = of.a((byte) -86, var62[var8].long_e);
							var62[var8].int_v = ka.I.b(true);
							var62[var8].byte_s = ka.I.m(3);
							if (~wa.Nb == ~var62[var8].long_e) {
								ge.byte_g = var62[var8].byte_s;
							}
						}

						boolean var44 = false;
						var49 = n.int_h;
						if (var16 != 0 || var49 > 0) {
							do {
								var44 = true;
								--var49;
								var12 = 0;
								if (var16 != 0 || var12 < var49) {
									do {
										if (var62[var12].lf_p.a((lf) var62[1 + var12].lf_p, (int) -10166) > 0) {
											var44 = false;
											jc var45 = var62[var12];
											var62[var12] = var62[var12 + 1];
											var62[var12 - -1] = var45;
										}

										++var12;
									} while (var12 < var49);
								}
							} while ((!var44 || var16 != 0) && var49 > 0);
						}

						uh.jcs_r = var62;
						of.int_r = -1;
						return true;
					}

					vg var25;
					if (of.int_r == 28) {
						label1547:
						{
							var20 = ka.I.l(15);
							var3 = ka.I.b(true);
							if (~var20 > -1) {
								var25 = null;
								if (var16 == 0) {
									break label1547;
								}
							}

							var25 = ra.a(var20, (byte) 120);
						}

						if (~var20 > 69999) {
							var3 += '耀';
							if (var16 != 0) {
								var5 = ka.I.f((int) 0);
								var6 = ka.I.b(true);
								var28 = 0;
								if (~var6 != -1) {
									var28 = ka.I.j((byte) 91);
									if (var28 == 255) {
										var28 = ka.I.l(15);
									}
								}

								if (var25 != null && ~var5 <= -1 && var5 < var25.ints_gc.length) {
									var25.ints_gc[var5] = var6;
									var25.Ub[var5] = var28;
								}

								nb.a(var5, var28, -1 + var6, var3, 4);
							}
						}

						for (; ~wb.int_g < ~ka.I.P; nb.a(var5, var28, -1 + var6, var3, 4)) {
							var5 = ka.I.f((int) 0);
							var6 = ka.I.b(true);
							var28 = 0;
							if (~var6 != -1) {
								var28 = ka.I.j((byte) 91);
								if (var28 == 255) {
									var28 = ka.I.l(15);
								}
							}

							if (var25 != null && ~var5 <= -1 && var5 < var25.ints_gc.length) {
								var25.ints_gc[var5] = var6;
								var25.Ub[var5] = var28;
							}
						}

						if (var25 != null) {
							mc.a(var25, -23101);
						}

						ah.f(var0 ^ 122);
						hh.ints_db[sd.a(31, p.Ec++)] = sd.a(32767, var3);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -76) {
						var20 = ka.I.d(true);
						var3 = ka.I.b(255);
						if (~var3 == -65536) {
							var3 = -1;
						}

						var25 = ra.a(var20, (byte) 116);
						if (~var25.Eb != -2 || ~var3 != ~var25.int_mc) {
							var25.int_mc = var3;
							var25.Eb = 1;
							mc.a(var25, var0 ^ 23100);
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -142) {
						var20 = ka.I.g((byte) 48);
						var3 = ka.I.b(255);
						var25 = ra.a(var20, (byte) 118);
						if (var25 != null && ~var25.int_ib == -1) {
							if (var25.G + -var25.Ib < var3) {
								var3 = var25.G - var25.Ib;
							}

							if (var3 < 0) {
								var3 = 0;
							}

							if (var25.Ac != var3) {
								var25.Ac = var3;
								mc.a(var25, -23101);
							}
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -209) {
						bh.int_ob = wb.int_g / 8;
						var20 = 0;
						if (var16 == 0 && ~bh.int_ob >= ~var20) {
							ld.int_db = hf.int_p;
							of.int_r = -1;
							return true;
						}

						do {
							id.longs_n[var20] = ka.I.i(-1495411552);
							d.lfs_fb[var20] = of.a((byte) 93, id.longs_n[var20]);
							++var20;
						} while (~bh.int_ob < ~var20);

						ld.int_db = hf.int_p;
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -152) {
						if (~ac.int_ab != 0) {
							ce.c(0, 59, ac.int_ab);
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -26) {
						cf.a(eh.ke_o, ka.I, ~var0, wb.int_g);
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 192) {
						var20 = 0;
						if (var16 != 0) {
							if (w.us_e[var20] != null) {
								w.us_e[var20].int_bc = -1;
							}

							++var20;
						}

						for (; ~var20 > ~w.us_e.length; ++var20) {
							if (w.us_e[var20] != null) {
								w.us_e[var20].int_bc = -1;
							}
						}

						var3 = 0;
						if (var16 != 0) {
							if (th.ps_g[var3] != null) {
								th.ps_g[var3].int_bc = -1;
							}

							++var3;
						}

						for (; ~th.ps_g.length < ~var3; ++var3) {
							if (th.ps_g[var3] != null) {
								th.ps_g[var3].int_bc = -1;
							}
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 204) {
						rf.Z = ka.I.j((int) 24263);
						ci.int_ub = ka.I.n(var0 + 28748);
						if (var16 != 0) {
							of.int_r = ka.I.j((byte) 107);
							va.c(382);
						}

						while (ka.I.P < wb.int_g) {
							of.int_r = ka.I.j((byte) 107);
							va.c(382);
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -88) {
						var20 = ka.I.p(255);
						var3 = ka.I.k(var0 + 1440014817);
						var4 = ka.I.b(true);
						var5 = ka.I.d((byte) 88);
						vg var61 = ra.a(var5, (byte) 112);
						if (~var4 != ~var61.int_gb || ~var3 != ~var61.Ab || var20 != var61.Tb) {
							var61.Ab = var3;
							var61.int_gb = var4;
							var61.Tb = var20;
							mc.a(var61, -23101);
						}

						of.int_r = -1;
						return true;
					}

					int var10;
					fi var30;
					int var38;
					long var50;
					if (~of.int_r == -60) {
						var20 = wb.int_g + ka.I.P;
						var3 = ka.I.b(true);
						var4 = ka.I.b(true);
						fi var48;
						if (~ac.int_ab != ~var3) {
							ac.int_ab = var3;
							wb.a((byte) 58, (int) ac.int_ab);
							bc.f(2000000, ac.int_ab);
							var5 = 0;
							if (var16 != 0 || var5 < 100) {
								do {
									va.booleans_db[var5] = true;
									++var5;
								} while (var5 < 100);
							}

							if (var16 != 0) {
								var5 = ka.I.l(15);
								var6 = ka.I.b(true);
								var28 = ka.I.j((byte) 125);
								var48 = (fi) ma.eh_e.a((long) var5, (byte) -107);
								if (var48 != null && ~var48.int_n != ~var6) {
									r.a(true, (byte) 119, var48);
									var48 = null;
								}

								if (var48 == null) {
									var48 = fd.a(var28, var5, true, var6);
								}

								var48.boolean_t = true;
							}
						}

						for (; ~(var4--) < -1; var48.boolean_t = true) {
							var5 = ka.I.l(15);
							var6 = ka.I.b(true);
							var28 = ka.I.j((byte) 125);
							var48 = (fi) ma.eh_e.a((long) var5, (byte) -107);
							if (var48 != null && ~var48.int_n != ~var6) {
								r.a(true, (byte) 119, var48);
								var48 = null;
							}

							if (var48 == null) {
								var48 = fd.a(var28, var5, true, var6);
							}
						}

						var30 = (fi) ma.eh_e.a((byte) 104);
						if (var16 != 0) {
							label1406:
							{
								if (!var30.boolean_t) {
									r.a(true, (byte) 126, var30);
									if (var16 == 0) {
										break label1406;
									}
								}

								var30.boolean_t = false;
							}

							var30 = (fi) ma.eh_e.c(1);
						}

						for (; var30 != null; var30 = (fi) ma.eh_e.c(1)) {
							if (!var30.boolean_t) {
								r.a(true, (byte) 126, var30);
								if (var16 == 0) {
									continue;
								}
							}

							var30.boolean_t = false;
						}

						va.X = new eh(512);
						if (var16 == 0 && var20 <= ka.I.P) {
							of.int_r = -1;
							return true;
						}

						do {
							var6 = ka.I.l(15);
							var28 = ka.I.b(true);
							var8 = ka.I.b(true);
							var38 = ka.I.l(15);
							var10 = var28;
							if (var16 != 0 || var28 <= var8) {
								do {
									var50 = (long) var10 + ((long) var6 << 32);
									va.X.a(var50, false, new me(var38));
									++var10;
								} while (var10 <= var8);
							}
						} while (var20 > ka.I.P);

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -149) {
						var20 = ka.I.l(15);
						var3 = ka.I.b(true);
						if (~var20 > 69999) {
							var3 += '耀';
						}

						label1375:
						{
							if (~var20 > -1) {
								var25 = null;
								if (var16 == 0) {
									break label1375;
								}
							}

							var25 = ra.a(var20, (byte) 113);
						}

						if (var25 != null) {
							var5 = 0;
							if (var16 != 0 || ~var25.ints_gc.length < ~var5) {
								do {
									var25.ints_gc[var5] = 0;
									var25.Ub[var5] = 0;
									++var5;
								} while (~var25.ints_gc.length < ~var5);
							}
						}

						pg.a(true, var3);
						var5 = ka.I.b(true);
						var6 = 0;
						if (var16 == 0 && ~var5 >= ~var6) {
							if (var25 != null) {
								mc.a(var25, -23101);
							}

							ah.f(-127);
							hh.ints_db[sd.a(31, p.Ec++)] = sd.a(32767, var3);
							of.int_r = -1;
							return true;
						}

						do {
							var28 = ka.I.j((int) 24263);
							if (~var28 == -256) {
								var28 = ka.I.l(var0 ^ -16);
							}

							var8 = ka.I.b(255);
							if (var25 != null && ~var6 > ~var25.ints_gc.length) {
								var25.ints_gc[var6] = var8;
								var25.Ub[var6] = var28;
							}

							nb.a(var6, var28, -1 + var8, var3, var0 + 5);
							++var6;
						} while (~var5 < ~var6);

						if (var25 != null) {
							mc.a(var25, -23101);
						}

						ah.f(-127);
						hh.ints_db[sd.a(31, p.Ec++)] = sd.a(32767, var3);
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 80) {
						var20 = ka.I.b(true);
						byte var59 = ka.I.d((int) 10786);
						sg.ints_j[var20] = var59;
						if (uc.ints_ub[var20] != var59) {
							uc.ints_ub[var20] = var59;
							ub.c(99, var20);
						}

						se.ints_hb[sd.a(31, ga.int_d++)] = var20;
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -111) {
						var20 = ka.I.k((byte) -76);
						var3 = ka.I.d(true);
						var25 = ra.a(var3, (byte) 121);
						if (~var25.Db != ~var20 || ~var20 == 0) {
							var25.int_h = 0;
							var25.Db = var20;
							var25.int_uc = 0;
							mc.a(var25, -23101);
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 173) {
						sg.e(127);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -128) {
						var20 = ka.I.b(true);
						if (var20 == '\uffff') {
							var20 = -1;
						}

						th.a(var0 + -97, var20);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -182) {
						var20 = ka.I.b(true);
						if (~var20 == -65536) {
							var20 = -1;
						}

						var3 = ka.I.g((int) -1);
						qe.a(var0 + 1, var3, var20);
						of.int_r = -1;
						return true;
					}

					lf var42;
					if (of.int_r == 35) {
						var20 = ka.I.g((byte) -96);
						var42 = ka.I.e((byte) 87);
						var25 = ra.a(var20, (byte) 113);
						if (!var42.e(var25.Fc, var0)) {
							var25.Fc = var42;
							mc.a(var25, -23101);
						}

						of.int_r = -1;
						return true;
					}

					lf var55;
					if (~of.int_r == -153) {
						var55 = ka.I.e((byte) 87);
						Object[] var56 = new Object[var55.e(-30593) + 1];
						var4 = -1 + var55.e(-30593);
						if (var16 != 0) {
							label1321:
							{
								if (~var55.a(109, (int) var4) == -116) {
									var56[var4 - -1] = ka.I.e((byte) 87);
									if (var16 == 0) {
										break label1321;
									}
								}

								var56[var4 - -1] = new Integer(ka.I.l(15));
							}

							--var4;
						}

						for (; ~var4 <= -1; --var4) {
							if (~var55.a(109, (int) var4) == -116) {
								var56[var4 - -1] = ka.I.e((byte) 87);
								if (var16 == 0) {
									continue;
								}
							}

							var56[var4 - -1] = new Integer(ka.I.l(15));
						}

						var56[0] = new Integer(ka.I.l(15));
						id var35 = new id();
						var35.objects_t = var56;
						ea.a(var0 + 24088, var35);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -23) {
						var20 = ka.I.o(111);
						var3 = ka.I.o(62);
						var4 = ka.I.o(var0 ^ -108);
						hc.int_pb = var20 >> 1;
						r.X.a(true, var4, (1 & var20) == 1, var3);
						of.int_r = -1;
						return true;
					}

					vg var31;
					if (of.int_r == 240) {
						var20 = ka.I.b(var0 ^ -256);
						var3 = ka.I.g((byte) -126);
						var4 = ka.I.b(true);
						var31 = ra.a(var3, (byte) 114);
						of.int_r = -1;
						var31.int_ac = (var20 << 16) + var4;
						return true;
					}

					if (of.int_r == 92 || ~of.int_r == -96 || of.int_r == 197 || of.int_r == 55 || of.int_r == 123 || ~of.int_r == -144 || ~of.int_r == -12 || ~of.int_r == -233 || of.int_r == 126 || ~of.int_r == -162 || ~of.int_r == -172) {
						va.c(382);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -221) {
						sg.b(57);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -161) {
						jh.a(true, (byte) -111);
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 108) {
						var20 = ka.I.k(1440014816);
						if (var20 == '\uffff') {
							var20 = -1;
						}

						var3 = ka.I.d(true);
						var25 = ra.a(var3, (byte) 126);
						if (var25.Eb != 2 || var20 != var25.int_mc) {
							var25.int_mc = var20;
							var25.Eb = 2;
							mc.a(var25, -23101);
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -167) {
						ci.int_ub = ka.I.j((int) 24263);
						rf.Z = ka.I.j((int) 24263);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -137) {
						var20 = ka.I.d((byte) 101);
						var3 = ka.I.g((byte) 47);
						var4 = ka.I.p(255);
						var31 = ra.a(var3, (byte) 113);
						if (~var4 == -65536) {
							var4 = -1;
						}

						label1688:
						{
							ie var58;
							if (var31.Bc) {
								var31.int_b = var20;
								var31.int_j = var4;
								var58 = ng.a(var4, (int) -4);
								var31.Ob = var58.int_vb;
								var31.Ab = var58.Ib;
								var31.P = var58.xb;
								var31.int_kb = var58.int_eb;
								var31.Tb = var58.int_mb;
								var31.int_gb = var58.M;
								if (~var31.int_ob < -1) {
									var31.Tb = 32 * var31.Tb / var31.int_ob;
								}

								mc.a(var31, -23101);
								if (var16 == 0) {
									break label1688;
								}
							}

							if (~var4 == 0) {
								of.int_r = -1;
								var31.Eb = 0;
								return true;
							}

							var58 = ng.a(var4, (int) -4);
							var31.int_mc = var4;
							var31.int_gb = var58.M;
							var31.Ab = var58.Ib;
							var31.Tb = 100 * var58.int_mb / var20;
							var31.Eb = 4;
							mc.a(var31, var0 + -23100);
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 186) {
						label1288:
						{
							var20 = ka.I.j((byte) 102);
							if (ka.I.j((byte) 95) != 0) {
								--ka.I.P;
								bg.y[var20] = new ob(ka.I);
								if (var16 == 0) {
									break label1288;
								}
							}

							bg.y[var20] = new ob();
						}

						ph.A = hf.int_p;
						of.int_r = -1;
						return true;
					}

					boolean var27;
					if (~of.int_r == -28) {
						label1689:
						{
							var55 = ka.I.e((byte) 87);
							if (var55.d(sf.tradereqFlag, var0 + 1)) {
								var42 = var55.a(var55.c(r.S, var0 + 52), (int) 0, var0 ^ -108);
								var36 = var42.a(false);
								var27 = false;
								var28 = 0;
								if (var16 != 0 || ~bh.int_ob < ~var28) {
									do {
										if (var36 == id.longs_n[var28]) {
											var27 = true;
											if (var16 == 0) {
												break;
											}
										}

										++var28;
									} while (~bh.int_ob < ~var28);
								}

								if (var27 || dd.W != 0) {
									break label1689;
								}

								kd.a(var42, false, fb.lf_p, 4);
								if (var16 == 0) {
									break label1689;
								}
							}

							if (var55.d(sd.chalreqFlag, 0)) {
								var42 = var55.a(var55.c(r.S, var0 + 107), (int) 0, 95);
								var27 = false;
								var36 = var42.a(false);
								var28 = 0;
								if (var16 != 0 || bh.int_ob > var28) {
									do {
										if (~var36 == ~id.longs_n[var28]) {
											var27 = true;
											if (var16 == 0) {
												break;
											}
										}

										++var28;
									} while (bh.int_ob > var28);
								}

								if (var27 || ~dd.W != -1) {
									break label1689;
								}

								lf var46 = var55.a(var55.e(-30593) - 9, (int) (1 + var55.c(r.S, 46)), 124);
								kd.a(var42, false, var46, 8);
								if (var16 == 0) {
									break label1689;
								}
							}

							if (var55.d(ug.assistreqFlag, var0 + 1)) {
								var42 = var55.a(var55.c(r.S, 42), (int) 0, 103);
								var27 = false;
								var36 = var42.a(false);
								var28 = 0;
								if (var16 != 0 || ~bh.int_ob < ~var28) {
									do {
										if (~var36 == ~id.longs_n[var28]) {
											var27 = true;
											if (var16 == 0) {
												break;
											}
										}

										++var28;
									} while (~bh.int_ob < ~var28);
								}

								if (var27 || dd.W != 0) {
									break label1689;
								}

								kd.a(var42, false, sh.Gb, 10);
								if (var16 == 0) {
									break label1689;
								}
							}

							if (!var55.d(tc.clanFlag, 0)) {
								if (!var55.d(kb.tradeFlag, 0)) {
									if (var55.d(nd.assistFlag, ~var0)) {
										var42 = var55.a(var55.c(nd.assistFlag, 79), (int) 0, var0 ^ -76);
										if (~dd.W != -1) {
											break label1689;
										}

										kd.a(sh.Gb, false, var42, 13);
										if (var16 == 0) {
											break label1689;
										}
									}

									if (var55.d(ab.duelStakeAttribute, 0)) {
										var42 = var55.a(var55.c(r.S, 127), (int) 0, 93);
										var36 = var42.a(false);
										var27 = false;
										var28 = 0;
										if (var16 != 0 || var28 < bh.int_ob) {
											do {
												if (var36 == id.longs_n[var28]) {
													var27 = true;
													if (var16 == 0) {
														break;
													}
												}

												++var28;
											} while (var28 < bh.int_ob);
										}

										if (var27 || dd.W != 0) {
											break label1689;
										}

										kd.a(var42, false, sh.Gb, 14);
										if (var16 == 0) {
											break label1689;
										}
									}

									if (var55.d(fd.duelfriendFlag, ~var0)) {
										var27 = false;
										var42 = var55.a(var55.c(r.S, var0 ^ -36), (int) 0, 97);
										var36 = var42.a(false);
										var28 = 0;
										if (var16 != 0 || var28 < bh.int_ob) {
											do {
												if (~id.longs_n[var28] == ~var36) {
													var27 = true;
													if (var16 == 0) {
														break;
													}
												}

												++var28;
											} while (var28 < bh.int_ob);
										}

										if (var27 || dd.W != 0) {
											break label1689;
										}

										kd.a(var42, false, sh.Gb, 15);
										if (var16 == 0) {
											break label1689;
										}
									}

									if (var55.d(fi.clanreqFlag, 0)) {
										var42 = var55.a(var55.c(r.S, var0 ^ -38), (int) 0, 73);
										var27 = false;
										var36 = var42.a(false);
										var28 = 0;
										if (var16 != 0 || var28 < bh.int_ob) {
											do {
												if (var36 == id.longs_n[var28]) {
													var27 = true;
													if (var16 == 0) {
														break;
													}
												}

												++var28;
											} while (var28 < bh.int_ob);
										}

										if (var27 || ~dd.W != -1) {
											break label1689;
										}

										kd.a(var42, false, sh.Gb, 16);
										if (var16 == 0) {
											break label1689;
										}
									}

									kd.a(sh.Gb, false, var55, 0);
									if (var16 == 0) {
										break label1689;
									}
								}

								var42 = var55.a(var55.c(kb.tradeFlag, 52), (int) 0, var0 + 77);
								if (dd.W != 0) {
									break label1689;
								}

								kd.a(sh.Gb, false, var42, 12);
								if (var16 == 0) {
									break label1689;
								}
							}

							var42 = var55.a(var55.c(tc.clanFlag, 94), (int) 0, 55);
							kd.a(sh.Gb, false, var42, 11);
						}

						of.int_r = -1;
						return true;
					}

					int var15;
					long var32;
					if (~of.int_r == -175) {
						var47 = ka.I.i(-1495411552);
						ka.I.m(var0 + 4);
						boolean var54 = false;
						var36 = ka.I.i(-1495411552);
						var32 = (long) ka.I.b(true);
						long var43 = (long) ka.I.f((byte) 59);
						var10 = ka.I.j((byte) 111);
						var50 = var43 + (var32 << 32);
						int var14 = 0;
						if (var16 != 0 || ~var14 > -101) {
							do {
								if (var50 == th.longs_d[var14]) {
									var54 = true;
									if (var16 == 0) {
										break;
									}
								}

								++var14;
							} while (~var14 > -101);
						}

						if (var10 <= 1) {
							var15 = 0;
							if (var16 != 0 || ~var15 > ~bh.int_ob) {
								do {
									if (id.longs_n[var15] == var47) {
										var54 = true;
										if (var16 == 0) {
											break;
										}
									}

									++var15;
								} while (~var15 > ~bh.int_ob);
							}
						}

						if (!var54 && ~dd.W == -1) {
							label1112:
							{
								th.longs_d[kh.Z] = var50;
								kh.Z = (kh.Z + 1) % 100;
								lf var57 = bf.c(ff.a(ka.I, (byte) 127).d((byte) -68));
								if (~var10 != -3 && ~var10 != -4) {
									if (~var10 == -2) {
										mc.a(de.a(new lf[]{h.lf_p, of.a((byte) 114, var47).e(true)}, var0 ^ -124), of.a((byte) 126, var36).e(true), 9, var57, var0 ^ -118);
										if (var16 == 0) {
											break label1112;
										}
									}

									mc.a(of.a((byte) -52, var47).e(true), of.a((byte) 116, var36).e(true), 9, var57, 116);
									if (var16 == 0) {
										break label1112;
									}
								}

								mc.a(de.a(new lf[]{ai.lf_j, of.a((byte) 118, var47).e(true)}, 125), of.a((byte) -87, var36).e(true), 9, var57, var0 + 98);
							}
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 228) {
						var20 = ka.I.k((byte) -75);
						var3 = ka.I.g((byte) -64);
						var4 = ka.I.e((int) -2);
						var31 = ra.a(var3, (byte) 113);
						var6 = var31.int_l - -var4;
						var28 = var31.int_nb + var20;
						if (~var6 != ~var31.int_k || var28 != var31.int_rc) {
							var31.int_k = var6;
							var31.int_rc = var28;
							mc.a(var31, -23101);
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -24) {
						ah.f(71);
						tb.int_cb = ka.I.j((byte) 83);
						of.int_r = -1;
						kd.int_db = hf.int_p;
						return true;
					}

					if (of.int_r == 175) {
						di.V = ka.I.j((byte) 101);
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 0) {
						var20 = ka.I.p(255);
						var3 = ka.I.d(true);
						var4 = ka.I.j(24263);
						var30 = (fi) ma.eh_e.a((long) var3, (byte) -106);
						if (var30 != null) {
							r.a(var20 != var30.int_n, (byte) 126, var30);
						}

						fd.a(var4, var3, true, var20);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -106) {
						var20 = 0;
						if (var16 == 0 && var20 >= ia.int_f) {
							ah.f(var0 + -122);
							ga.int_d += 32;
							of.int_r = -1;
							return true;
						}

						do {
							he var40 = tb.c(-87, var20);
							if (var40 != null && ~var40.P == -1) {
								sg.ints_j[var20] = 0;
								uc.ints_ub[var20] = 0;
							}

							++var20;
						} while (var20 < ia.int_f);

						ah.f(var0 + -122);
						ga.int_d += 32;
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 74) {
						var47 = ka.I.i(-1495411552);
						var4 = ka.I.b(true);
						var5 = ka.I.j((byte) 126);
						lf var33 = of.a((byte) 80, var47).e(true);
						var28 = 0;
						if (var16 != 0 || ~var28 > ~vf.int_t) {
							do {
								if (~lf.C[var28] == ~var47) {
									if (~jh.ints_t[var28] != ~var4) {
										jh.ints_t[var28] = var4;
										if (~var4 < -1) {
											kd.a(sh.Gb, false, de.a(new lf[]{var33, va.P}, var0 + 120), 5);
										}

										if (~var4 == -1) {
											kd.a(sh.Gb, false, de.a(new lf[]{var33, pe.lf_p}, 125), 5);
										}
									}

									pc.ints_c[var28] = var5;
									var33 = null;
									break;
								}

								++var28;
							} while (~var28 > ~vf.int_t);
						}

						if (var33 != null && vf.int_t < 200) {
							lf.C[vf.int_t] = var47;
							mb.y[vf.int_t] = var33;
							jh.ints_t[vf.int_t] = var4;
							pc.ints_c[vf.int_t] = var5;
							++vf.int_t;
						}

						ld.int_db = hf.int_p;
						boolean var39 = false;
						var38 = vf.int_t;
						if (var16 != 0 || var38 > 0) {
							do {
								var39 = true;
								--var38;
								var10 = 0;
								if (var16 != 0 || var38 > var10) {
									do {
										if (~jh.ints_t[var10] != ~hd.int_u && hd.int_u == jh.ints_t[var10 + 1] || jh.ints_t[var10] == 0 && jh.ints_t[1 + var10] != 0) {
											var39 = false;
											var49 = jh.ints_t[var10];
											jh.ints_t[var10] = jh.ints_t[var10 - -1];
											jh.ints_t[var10 - -1] = var49;
											lf var51 = mb.y[var10];
											mb.y[var10] = mb.y[1 + var10];
											mb.y[var10 + 1] = var51;
											long var53 = lf.C[var10];
											lf.C[var10] = lf.C[1 + var10];
											lf.C[1 + var10] = var53;
											var15 = pc.ints_c[var10];
											pc.ints_c[var10] = pc.ints_c[1 + var10];
											pc.ints_c[var10 - -1] = var15;
										}

										++var10;
									} while (var38 > var10);
								}
							} while ((!var39 || var16 != 0) && var38 > 0);
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 3) {
						var47 = ka.I.i(-1495411552);
						var36 = (long) ka.I.b(true);
						boolean var11 = false;
						var32 = (long) ka.I.f((byte) 59);
						var8 = ka.I.j((byte) 85);
						long var41 = var32 + (var36 << 32);
						var12 = 0;
						if (var16 != 0 || var12 < 100) {
							do {
								if (~th.longs_d[var12] == ~var41) {
									var11 = true;
									if (var16 == 0) {
										break;
									}
								}

								++var12;
							} while (var12 < 100);
						}

						if (~var8 >= -2) {
							int var13 = 0;
							if (var16 != 0 || ~var13 > ~bh.int_ob) {
								do {
									if (~id.longs_n[var13] == ~var47) {
										var11 = true;
										if (var16 == 0) {
											break;
										}
									}

									++var13;
								} while (~var13 > ~bh.int_ob);
							}
						}

						if (!var11 && ~dd.W == -1) {
							label1770:
							{
								th.longs_d[kh.Z] = var41;
								kh.Z = (1 + kh.Z) % 100;
								lf var52 = bf.c(ff.a(ka.I, (byte) 65).d((byte) -68));
								if (~var8 == -3 || ~var8 == -4) {
									kd.a(de.a(new lf[]{ai.lf_j, of.a((byte) -100, var47).e(true)}, 121), false, var52, 7);
									if (var16 == 0) {
										break label1770;
									}
								}

								if (~var8 == -2) {
									kd.a(de.a(new lf[]{h.lf_p, of.a((byte) -118, var47).e(true)}, var0 ^ 27), false, var52, 7);
									if (var16 == 0) {
										break label1770;
									}
								}

								kd.a(of.a((byte) 114, var47).e(true), false, var52, 3);
							}
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 233) {
						var47 = ka.I.i(-1495411552);
						var4 = ka.I.b(true);
						byte var26 = ka.I.m(3);
						var27 = false;
						if ((var47 & Long.MIN_VALUE) != 0L) {
							var27 = true;
						}

						label1771:
						{
							if (var27) {
								if (~n.int_h == -1) {
									of.int_r = -1;
									return true;
								}

								var47 &= Long.MAX_VALUE;
								boolean var29 = false;
								var28 = 0;
								if (var16 != 0 || ~var28 > ~n.int_h) {
									while (~var47 != ~uh.jcs_r[var28].long_e || var4 != uh.jcs_r[var28].int_v || var16 != 0) {
										++var28;
										if (~var28 <= ~n.int_h) {
											break;
										}
									}
								}

								if (~n.int_h >= ~var28) {
									break label1771;
								}

								if (var16 != 0 || var28 < n.int_h + -1) {
									do {
										uh.jcs_r[var28] = uh.jcs_r[var28 + 1];
										++var28;
									} while (var28 < n.int_h + -1);
								}

								--n.int_h;
								uh.jcs_r[n.int_h] = null;
								if (var16 == 0) {
									break label1771;
								}
							}

							jc var37 = new jc();
							var37.long_e = var47;
							var37.lf_p = of.a((byte) 126, var37.long_e);
							var37.int_v = var4;
							var37.byte_s = var26;
							var8 = n.int_h + -1;
							if (var16 != 0 || ~var8 <= -1) {
								do {
									var38 = uh.jcs_r[var8].lf_p.a((lf) var37.lf_p, (int) -10166);
									if (var38 == 0) {
										uh.jcs_r[var8].int_v = var4;
										uh.jcs_r[var8].byte_s = var26;
										re.int_c = hf.int_p;
										if (var47 == wa.Nb) {
											ge.byte_g = var26;
										}

										of.int_r = -1;
										return true;
									}

									if (var38 < 0 && var16 == 0) {
										break;
									}

									--var8;
								} while (~var8 <= -1);
							}

							if (uh.jcs_r.length <= n.int_h) {
								of.int_r = -1;
								return true;
							}

							var38 = -1 + n.int_h;
							if (var16 != 0 || var8 < var38) {
								do {
									uh.jcs_r[1 + var38] = uh.jcs_r[var38];
									--var38;
								} while (var8 < var38);
							}

							if (n.int_h == 0) {
								uh.jcs_r = new jc[100];
							}

							uh.jcs_r[1 + var8] = var37;
							++n.int_h;
							if (~wa.Nb == ~var47) {
								ge.byte_g = var26;
							}
						}

						of.int_r = -1;
						re.int_c = hf.int_p;
						return true;
					}

					if (of.int_r == 244) {
						rc.int_k = ka.I.j((byte) 71);
						of.int_r = -1;
						ld.int_db = hf.int_p;
						return true;
					}

					if (~of.int_r == -114) {
						var20 = ka.I.p(255);
						n.a(255, var20);
						hh.ints_db[sd.a(p.Ec++, 31)] = sd.a(32767, var20);
						of.int_r = -1;
						return true;
					}

					vg var24;
					if (of.int_r == 250) {
						var20 = ka.I.g((byte) 85);
						var24 = ra.a(var20, (byte) 115);
						var4 = 0;
						if (var16 != 0) {
							var24.ints_gc[var4] = -1;
							var24.ints_gc[var4] = 0;
							++var4;
						}

						while (var4 < var24.ints_gc.length) {
							var24.ints_gc[var4] = -1;
							var24.ints_gc[var4] = 0;
							++var4;
						}

						mc.a(var24, -23101);
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 72) {
						var20 = ka.I.d((byte) 91);
						fd.da_l = eh.ke_o.a(7249, var20);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -11) {
						var20 = ka.I.l(15);
						var3 = ka.I.p(255);
						sg.ints_j[var3] = var20;
						if (var20 != uc.ints_ub[var3]) {
							uc.ints_ub[var3] = var20;
							ub.c(66, var3);
						}

						se.ints_hb[sd.a(31, ga.int_d++)] = var3;
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 53) {
						ee.a(71, ka.I);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -136) {
						var20 = ka.I.b(true);
						if (~var20 == -65536) {
							var20 = -1;
						}

						var3 = ka.I.j((byte) 112);
						var4 = ka.I.b(true);
						ag.a(var3, var20, 0, var4);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -141) {
						var20 = 0;
						if (var16 == 0 && var20 >= uc.ints_ub.length) {
							of.int_r = -1;
							return true;
						}

						do {
							if (~sg.ints_j[var20] != ~uc.ints_ub[var20]) {
								uc.ints_ub[var20] = sg.ints_j[var20];
								ub.c(-89, var20);
								se.ints_hb[sd.a(ga.int_d++, 31)] = var20;
							}

							++var20;
						} while (var20 < uc.ints_ub.length);

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -53) {
						ci.int_ub = ka.I.j((int) 24263);
						rf.Z = ka.I.n(28747);
						var20 = ci.int_ub;
						if (var16 != 0) {
							var3 = rf.Z;
							if (var16 == 0 && ~(8 + rf.Z) >= ~var3) {
								++var20;
							} else {
								while (true) {
									if (vh.tfs_h[hc.int_pb][var20][var3] != null) {
										vh.tfs_h[hc.int_pb][var20][var3] = null;
										se.c(var20, -28592, var3);
									}

									++var3;
									if (~(8 + rf.Z) >= ~var3) {
										++var20;
										break;
									}
								}
							}
						}

						while (~var20 > ~(ci.int_ub - -8)) {
							var3 = rf.Z;
							if (var16 == 0 && ~(8 + rf.Z) >= ~var3) {
								++var20;
							} else {
								do {
									if (vh.tfs_h[hc.int_pb][var20][var3] != null) {
										vh.tfs_h[hc.int_pb][var20][var3] = null;
										se.c(var20, -28592, var3);
									}

									++var3;
								} while (~(8 + rf.Z) < ~var3);

								++var20;
							}
						}

						ic var34 = (ic) ef.tf_i.c(var0 ^ -28);
						if (var16 == 0 && var34 == null) {
							of.int_r = -1;
							return true;
						}

						do {
							if (~var34.int_s <= ~ci.int_ub && ~var34.int_s > ~(ci.int_ub + 8) && ~rf.Z >= ~var34.int_n && ~(rf.Z - -8) < ~var34.int_n && ~var34.int_o == ~hc.int_pb) {
								var34.x = 0;
							}

							var34 = (ic) ef.tf_i.d(-1);
						} while (var34 != null);

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -150) {
						boolean var23 = ~ka.I.j((int) 24263) == -2;
						var3 = ka.I.g((byte) -82);
						var25 = ra.a(var3, (byte) 118);
						if (var25.B != var23) {
							var25.B = var23;
							mc.a(var25, -23101);
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 218) {
						var20 = ka.I.d((byte) 83);
						var24 = ra.a(var20, (byte) 113);
						var24.Eb = 3;
						var24.int_mc = r.X.be_id.a((byte) -127);
						mc.a(var24, -23101);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -85) {
						var20 = ka.I.j((int) 24263);
						var3 = ka.I.n(28747);
						var22 = ka.I.e((byte) 87);
						if (~var3 <= -2 && var3 <= 8) {
							if (var22.a((byte) -121, dc.Y)) {
								var22 = null;
							}

							wd.lfs_kb[-1 + var3] = var22;
							af.x[-1 + var3] = ~var20 == -1;
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 101) {
						lf.boolean_q = true;
						bb.U = ka.I.j((byte) 110);
						oa.Z = ka.I.j((byte) 119);
						j.M = ka.I.b(true);
						uc.int_sc = ka.I.j((byte) 79);
						d.int_db = ka.I.j((byte) 81);
						if (d.int_db >= 100) {
							mb.A = oa.Z * 128 + 64;
							dh.int_i = 64 + bb.U * 128;
							nd.y = bh.a(mb.A, false, hc.int_pb, dh.int_i) - j.M;
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -90) {
						ah.f(var0 + 70);
						var20 = ka.I.d(true);
						var3 = ka.I.o(39);
						var4 = ka.I.n(28747);
						va.Z[var4] = var20;
						bg.ints_t[var4] = var3;
						ua.R[var4] = 1;
						var5 = 0;
						if (var16 != 0) {
							if (se.R[var5] <= var20) {
								ua.R[var4] = 2 + var5;
							}

							++var5;
						}

						for (; var5 < 98; ++var5) {
							if (se.R[var5] <= var20) {
								ua.R[var4] = 2 + var5;
							}
						}

						jf.J[sd.a(lc.int_r++, 31)] = var4;
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -134) {
						lf.boolean_q = true;
						n.int_p = ka.I.j((byte) 75);
						rg.int_l = ka.I.j((byte) 83);
						c.Y = ka.I.b(true);
						tg.int_ab = ka.I.j((byte) 85);
						qh.int_l = ka.I.j((byte) 118);
						if (qh.int_l >= 100) {
							var20 = 64 + 128 * n.int_p;
							var3 = 128 * rg.int_l - -64;
							var4 = bh.a(var3, false, hc.int_pb, var20) - c.Y;
							var28 = -mb.A + var3;
							var6 = var4 - nd.y;
							var5 = -dh.int_i + var20;
							var8 = (int) Math.sqrt((double) (var28 * var28 + var5 * var5));
							hc.int_hb = (int) (Math.atan2((double) var6, (double) var8) * 325.949D) & 2047;
							pd.int_c = 2047 & (int) (-325.949D * Math.atan2((double) var5, (double) var28));
							if (hc.int_hb < 128) {
								hc.int_hb = 128;
							}

							if (hc.int_hb > 383) {
								hc.int_hb = 383;
							}
						}

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 24) {
						of.int_r = -1;
						e.int_d = 0;
						return true;
					}

					if (~of.int_r == -238) {
						n.e(-1);
						of.int_r = -1;
						return false;
					}

					if (of.int_r == 57) {
						var20 = ka.I.l(15);
						fi var21 = (fi) ma.eh_e.a((long) var20, (byte) -83);
						if (var21 != null) {
							r.a(true, (byte) 113, var21);
						}

						if (rb.vg_d != null) {
							mc.a(rb.vg_d, var0 ^ 23100);
							rb.vg_d = null;
						}

						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -6) {
						ah.f(-5);
						ua.P = ka.I.c(true);
						kd.int_db = hf.int_p;
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -87) {
						var20 = ka.I.j((byte) 88);
						var3 = ka.I.j((byte) 110);
						var4 = ka.I.j((byte) 112);
						var5 = ka.I.j((byte) 112);
						var6 = ka.I.b(true);
						pa.booleans_i[var20] = true;
						ld.T[var20] = var3;
						client.ints_ab[var20] = var4;
						tg.Q[var20] = var5;
						gh.Q[var20] = var6;
						of.int_r = -1;
						return true;
					}

					if (of.int_r == 203) {
						id.H = ka.I.j((byte) 89);
						pe.int_m = ka.I.j((byte) 127);
						ba.int_f = ka.I.j((byte) 102);
						of.int_r = -1;
						return true;
					}

					if (~of.int_r == -166) {
						var20 = ka.I.l(15);
						var3 = ka.I.b(255);
						if (var3 == '\uffff') {
							var3 = -1;
						}

						var4 = ka.I.p(255);
						var5 = ka.I.g((byte) 50);
						if (var4 == '\uffff') {
							var4 = -1;
						}

						var6 = var4;
						if (var16 == 0 && ~var3 > ~var4) {
							of.int_r = -1;
							return true;
						}

						do {
							long var7 = ((long) var5 << 32) + (long) var6;
							hb var9 = va.X.a(var7, (byte) -113);
							if (var9 != null) {
								var9.a(true);
							}

							va.X.a(var7, false, new me(var20));
							++var6;
						} while (~var3 <= ~var6);

						of.int_r = -1;
						return true;
					}

					if (of.int_r == 189) {
						lf.boolean_q = false;
						var20 = 0;
						if (var16 != 0) {
							pa.booleans_i[var20] = false;
							++var20;
						}

						while (var20 < 5) {
							pa.booleans_i[var20] = false;
							++var20;
						}

						of.int_r = -1;
						return true;
					}

					ah.a("T1 - " + of.int_r + "," + va.int_bb + "," + id.C + " - " + wb.int_g, -105, (Throwable) null);
					n.e(-1);
				} catch (IOException var17) {
					fa.d((byte) -125);
				} catch (Exception var18) {
					String var2 = "T2 - " + of.int_r + "," + va.int_bb + "," + id.C + " - " + wb.int_g + "," + (r.X.ints_db[0] + fb.int_m) + "," + (ea.int_h - -r.X.xb[0]) + " - ";
					var3 = 0;
					if (var16 != 0 || ~var3 > ~wb.int_g && ~var3 > -51) {
						do {
							var2 = var2 + ka.I.yb[var3] + ",";
							++var3;
						} while (~var3 > ~wb.int_g && ~var3 > -51);
					}

					ah.a(var2, -78, var18);
					n.e(-1);
				}

				return true;
			}
		} catch (RuntimeException var19) {
			throw ec.a(var19, "tf.G(" + var0 + ')');
		}
	}

	final hb a(byte var1) {
		try {
			++int_g;
			hb var2 = this.hb_n.hb_i;
			if (var2 == this.hb_n) {
				return null;
			} else {
				var2.a(true);
				return var1 < 46 ? null : var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tf.C(" + var1 + ')');
		}
	}

	final hb c(int var1) {
		try {
			++int_l;
			if (var1 < 23) {
				this.hb_n = null;
			}

			hb var2 = null;
			if (this.hb_n != null) {
				var2 = this.hb_n.hb_i;
			}
			if (this.hb_n == var2) {
				this.hb_t = null;
				return null;
			} else {
				this.hb_t = var2.hb_i;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tf.A(" + var1 + ')');
		}
	}

	final void a(hb var1, int var2) {
		try {
			if (var2 != 0) {
				this.hb_n = null;
			}

			++int_k;
			if (var1.hb_f != null) {
				var1.a(true);
			}

			var1.hb_i = this.hb_n;
			var1.hb_f = this.hb_n.hb_f;
			var1.hb_f.hb_i = var1;
			var1.hb_i.hb_f = var1;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "tf.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void a(boolean var0) {
		try {
			lf_r = null;
			lf_b = null;
			lf_f = null;
			if (!var0) {
				a((lf) null, 67, (bg) null, (lf) null, (byte) 101, true, 37);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "tf.M(" + var0 + ')');
		}
	}

	final hb b(byte var1) {
		try {
			++int_p;
			hb var2 = this.hb_t;
			if (var1 != -101) {
				return null;
			} else if (this.hb_n == var2) {
				this.hb_t = null;
				return null;
			} else {
				this.hb_t = var2.hb_f;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tf.H(" + var1 + ')');
		}
	}

	final hb d(int var1) {
		try {
			if (var1 != -1) {
				lf_r = null;
			}

			++int_m;
			hb var2 = this.hb_t;
			if (var2 == this.hb_n) {
				this.hb_t = null;
				return null;
			} else {
				this.hb_t = var2.hb_i;
				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tf.F(" + var1 + ')');
		}
	}

	static final int a(vg var0, int var1, int var2) {
		int var14 = client.int_gc;

		try {
			++int_i;
			if (var0.ints_s != null && ~var0.ints_s.length < ~var2) {
				try {
					int[] var3 = var0.ints_s[var2];
					int var4 = 0;
					int var5 = 0;
					byte var6 = 0;

					while (true) {
						int var7 = var3[var5++];
						int var8 = 0;
						byte var9 = 0;
						if (var7 == 0) {
							return var4;
						}

						if (~var7 == -16) {
							var9 = 1;
						}

						if (~var7 == -17) {
							var9 = 2;
						}

						if (var7 == 1) {
							var8 = bg.ints_t[var3[var5++]];
						}

						if (~var7 == -3) {
							var8 = ua.R[var3[var5++]];
						}

						if (~var7 == -18) {
							var9 = 3;
						}

						if (var7 == 3) {
							var8 = va.Z[var3[var5++]];
						}

						int var10;
						vg var11;
						int var12;
						int var13;
						if (var7 == 4) {
							var10 = var3[var5++] << 16;
							var10 += var3[var5++];
							var11 = ra.a(var10, (byte) 117);
							var12 = var3[var5++];
							if (var12 != -1 && (!ng.a(var12, (int) -4).S || gh.boolean_fb)) {
								var13 = 0;
								if (var14 != 0 || ~var13 > ~var11.ints_gc.length) {
									do {
										if (~var11.ints_gc[var13] == ~(1 + var12)) {
											var8 += var11.Ub[var13];
										}

										++var13;
									} while (~var13 > ~var11.ints_gc.length);
								}
							}
						}

						if (var7 == 5) {
							var8 = uc.ints_ub[var3[var5++]];
						}

						if (var7 == 6) {
							var8 = se.R[-1 + ua.R[var3[var5++]]];
						}

						if (~var7 == -8) {
							var8 = 100 * uc.ints_ub[var3[var5++]] / '뜛';
						}

						if (var7 == 8) {
							var8 = r.X.Xc;
						}

						if (var7 == 9) {
							var10 = 0;
							if (var14 != 0 || var10 < 25) {
								do {
									if (vg.Mc[var10]) {
										var8 += ua.R[var10];
									}

									++var10;
								} while (var10 < 25);
							}
						}

						if (var7 == 10) {
							var10 = var3[var5++] << 16;
							var10 += var3[var5++];
							var11 = ra.a(var10, (byte) 117);
							var12 = var3[var5++];
							if (var12 != -1 && (!ng.a(var12, (int) -4).S || gh.boolean_fb)) {
								var13 = 0;
								if (var14 != 0 || var11.ints_gc.length > var13) {
									do {
										if (~var11.ints_gc[var13] == ~(1 + var12)) {
											var8 = 999999999;
											if (var14 == 0) {
												break;
											}
										}

										++var13;
									} while (var11.ints_gc.length > var13);
								}
							}
						}

						if (var7 == 11) {
							var8 = tb.int_cb;
						}

						if (var7 == 12) {
							var8 = ua.P;
						}

						if (var7 == 13) {
							var10 = uc.ints_ub[var3[var5++]];
							int var17 = var3[var5++];
							var8 = ~(var10 & 1 << var17) != -1 ? 1 : 0;
						}

						if (~var7 == -15) {
							var10 = var3[var5++];
							var8 = mc.a((byte) 119, var10);
						}

						if (var7 == 18) {
							var8 = fb.int_m + (r.X.int_fb >> 7);
						}

						if (var7 == 19) {
							var8 = (r.X.int_nc >> 7) + ea.int_h;
						}

						if (var7 == 20) {
							var8 = var3[var5++];
						}

						if (var9 == 0) {
							if (~var6 == -1) {
								var4 += var8;
							}

							if (var6 == 1) {
								var4 -= var8;
							}

							if (~var6 == -3 && var8 != 0) {
								var4 /= var8;
							}

							if (~var6 == -4) {
								var4 *= var8;
							}

							var6 = 0;
							if (var14 == 0) {
								continue;
							}
						}

						var6 = var9;
					}
				} catch (Exception var15) {
					if (var1 != 10) {
						lf_r = null;
					}

					return -1;
				}
			} else {
				return -2;
			}
		} catch (RuntimeException var16) {
			throw ec.a(var16, "tf.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	final void a(int var1, hb var2, hb var3) {
		try {
			if (var3.hb_f != null) {
				var3.a(true);
			}

			++int_h;
			var3.hb_i = var2;
			var3.hb_f = var2.hb_f;
			var3.hb_f.hb_i = var3;
			var3.hb_i.hb_f = var3;
			if (var1 != 0) {
				lf_r = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "tf.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void e(int var1) {
		try {
			if (var1 != -15004) {
				this.a((hb) null, (int) 12);
			}

			++int_u;

			while (true) {
				hb var2 = this.hb_n.hb_i;
				if (this.hb_n == var2) {
					return;
				}

				var2.a(true);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "tf.E(" + var1 + ')');
		}
	}

	static final void a(lf var0, int var1, bg var2, lf var3, byte var4, boolean var5, int var6) {
		try {
			++int_s;
			int var7 = var2.a((byte) 106, var0);
			int var8 = 85 % ((var4 - 22) / 50);
			int var9 = var2.a((byte) -95, var3, var7);
			oh.a(-24390, var1, var7, var9, var2, var5, var6);
		} catch (RuntimeException var10) {
			throw ec.a(var10, "tf.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	public tf() {
		try {
			this.hb_n.hb_f = this.hb_n;
			this.hb_n.hb_i = this.hb_n;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "tf.<init>(" + ')');
		}
	}
}
