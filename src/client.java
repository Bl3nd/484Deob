import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class client extends ua {

	static int E;
	static int I;
	static int V = -1;
	static int W;
	static int X;
	static int Y;
	static int Z;
	static int[] ints_ab = new int[5];
	static int int_bb;
	static int int_cb;
	static int int_db;
	static int int_eb;
	static int int_fb;
	static int int_gb;
	static int int_hb;
	static int int_ib;
	static int[] ints_jb = new int[32];
	static int int_kb;
	static int int_lb;
	static int int_mb;
	static bg bg_nb;
	static int int_ob;
	static kf[] kfs_pb;
	static hf hf_qb;
	static int int_rb;
	// $FF: synthetic field
	static Class class_sb;
	// $FF: synthetic field
	static Class class_tb;
	// $FF: synthetic field
	static Class class_ub;
	// $FF: synthetic field
	static Class class_vb;
	// $FF: synthetic field
	static Class class_wb;
	// $FF: synthetic field
	static Class xb;
	// $FF: synthetic field
	static Class yb;
	// $FF: synthetic field
	static Class zb;
	// $FF: synthetic field
	static Class Ab;
	// $FF: synthetic field
	static Class Bb;
	// $FF: synthetic field
	static Class Cb;
	// $FF: synthetic field
	static Class Db;
	// $FF: synthetic field
	static Class Eb;
	// $FF: synthetic field
	static Class Fb;
	// $FF: synthetic field
	static Class Gb;
	// $FF: synthetic field
	static Class Hb;
	// $FF: synthetic field
	static Class Ib;
	// $FF: synthetic field
	static Class Jb;
	// $FF: synthetic field
	static Class Kb;
	// $FF: synthetic field
	static Class Lb;
	// $FF: synthetic field
	static Class Mb;
	// $FF: synthetic field
	static Class Nb;
	// $FF: synthetic field
	static Class Ob;
	// $FF: synthetic field
	static Class Pb;
	// $FF: synthetic field
	static Class Qb;
	// $FF: synthetic field
	static Class Rb;
	// $FF: synthetic field
	static Class Sb;
	// $FF: synthetic field
	static Class Tb;
	// $FF: synthetic field
	static Class Ub;
	// $FF: synthetic field
	static Class Vb;
	// $FF: synthetic field
	static Class Wb;
	// $FF: synthetic field
	static Class Xb;
	// $FF: synthetic field
	static Class Yb;
	// $FF: synthetic field
	static Class Zb;
	// $FF: synthetic field
	static Class class_ac;
	// $FF: synthetic field
	static Class class_bc;
	// $FF: synthetic field
	static Class class_cc;
	// $FF: synthetic field
	static Class class_dc;
	// $FF: synthetic field
	static Class class_ec;
	// $FF: synthetic field
	static Class class_fc;
	public static int int_gc;

	public final void init() {
		int var5 = int_gc;

		try {
			++int_eb;
			if (this.b(true)) {
				label64:
				{
					hd.int_u = Integer.parseInt(this.getParameter("worldid"));
					ch.int_o = Integer.parseInt(this.getParameter("modewhat"));
					ch.int_s = Integer.parseInt(this.getParameter("modewhere"));
					String var1 = this.getParameter("lowmem");
					if (var1 == null || !var1.equals("1")) {
						nb.b(6);
						if (var5 == 0) {
							break label64;
						}
					}

					pg.a(true);
				}

				label49:
				{
					String var2 = this.getParameter("members");
					if (var2 != null && var2.equals("1")) {
						gh.boolean_fb = true;
						if (var5 == 0) {
							break label49;
						}
					}

					gh.boolean_fb = false;
				}

				String var3 = this.getParameter("lang");
				if (var3 != null && var3.equals("1")) {
					qh.a((byte) 73);
					sh.Jb = of.lf_v;
					eh.int_q = 1;
				}

				label65:
				{
					String var4 = this.getParameter("game");
					if (var4 == null || !var4.equals("1")) {
						sb.int_i = 0;
						if (var5 == 0) {
							break label65;
						}
					}

					sb.int_i = 1;
				}

				try {
					p.Bc = Integer.parseInt(this.getParameter("js"));
					vh.int_b = Integer.parseInt(this.getParameter("plug"));
				} catch (Exception var6) {
					;
				}

				uf.string_f = this.getCodeBase().getHost();
				this.a(765, 503, (byte) -120, 32 + ch.int_o, 484);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "client.init(" + ')');
		}
	}

	private final void e(int var1) {
		try {
			++int_lb;
			if (uh.z >= 4) {
				this.a((byte) -62, "js5crc");
				ld.Z = 1000;
			} else {
				if (hf.int_b >= 4) {
					if (ld.Z > 5) {
						ea.int_e = 3000;
						hf.int_b = 3;
					} else {
						this.a((byte) -70, "js5io");
						ld.Z = 1000;
						return;
					}
				}

				if (ea.int_e-- <= 0) {
					if (var1 != -34) {
						b(123, -4);
					}

					try {
						switch (e.int_a) {//todo handle this!
							case 0:
								ob.da_n = eh.ke_o.a(nh.R, false, uf.string_f);
								++e.int_a;
								break;
							case 1:
								if (ob.da_n.int_a == 2) {
									this.a(-1, true);
								} else if (ob.da_n.int_a == 1) {
									++e.int_a;
								}
								break;
							case 2:
								ad.nd_u = new nd((Socket) ob.da_n.object_c, eh.ke_o);
								ja var2 = new ja(5);
								var2.e(-13488, 15);
								var2.b((byte) 108, 484);
								ad.nd_u.a(var1 + -17, 0, 5, var2.yb);
								++e.int_a;
								vh.long_c = nb.a(false);
								break;
							case 3:
								if (ld.Z > 5 && ad.nd_u.a(-83) <= 0) {
									if (nb.a(false) + -vh.long_c > 30000L) {
										this.a(-2, true);
									}
								} else {
									int dataByteRead = ad.nd_u.a(true);
									if (dataByteRead != 0) {
										this.a(dataByteRead, true);
										return;
									}

									++e.int_a;
								}
								break;
							case 4:
								hg.a(ad.nd_u, ld.Z > 20, true);
								oa.U = 0;
								e.int_a = 0;
								ad.nd_u = null;
								ob.da_n = null;
								break;
						}
					} catch (IOException var3) {
						this.a(-3, true);
					}
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "client.AA(" + var1 + ')');
		}
	}

	static bi a(int fileID, int cacheID) {
		try {
			++X;
			bi var2 = (bi) v.rc_kb.a((long) cacheID, -110);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = hb.bg_c.a(0, cacheID, fileID);
				var2 = new bi();
				if (var3 != null) {
					var2.a(new ja(var3), (byte) 70);
				}

				var2.c(-121);
				v.rc_kb.a((long) cacheID, 62, var2);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "client.T(" + fileID + ',' + cacheID + ')');
		}
	}

	static void f(int var0) {
		try {
			++I;
			int var1 = var0;
			if (var0 < a.int_j) {
				do {
					int var2 = a.ints_h[var1];
					p var3 = th.ps_g[var2];
					if (var3 != null) {
						di.a((byte) 58, var3, var3.xc.int_ib);
					}

					++var1;
				} while (var1 < a.int_j);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "client.W(" + var0 + ')');
		}
	}

	private static void g(int var0) {
		int dummy = int_gc;

		try {
			++Z;
			synchronized (wc.Q) {
				if (var0 < 58) {
					bg_nb = null;
				}

				tb.int_fb = fc.L;
				int var3;
				if (hh.M >= 0) {
					if (dummy != 0 || ~hh.M != ~fd.int_q) {
						do {
							var3 = rb.ints_i[fd.int_q];
							fd.int_q = 1 + fd.int_q & 127;
							if (var3 >= 0) {
								he.N[var3] = true;
								if (dummy == 0) {
									continue;
								}
							}

							he.N[~var3] = false;
						} while (~hh.M != ~fd.int_q);
					}
				} else {
					var3 = 0;
					while (~var3 > -113) {
						he.N[var3] = false;
						++var3;
					}

					hh.M = fd.int_q;
				}

				fc.L = mc.int_p;
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "client.DA(" + var0 + ')');
		}
	}

	private final void h(int var1) {
		try {
			if (var1 < 75) {
				int_rb = -65;
			}

			++Y;
			if (~ld.Z != -1001) {
				boolean var2 = sg.d(26761);
				if (!var2) {
					this.e((int) -34);
				}
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "client.V(" + var1 + ')');
		}
	}

	static void a(int var0, int var1, int dummy, boolean var3) {
		try {
			++int_fb;
			if (var0 >= 8000 && var0 <= 48000) {
				sc.channel = var3;
				fc.K = var1;
				if (dummy != 28352) {
					a(-124, -114);
				}

				cb.sampleRate = var0;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "client.U(" + var0 + ',' + var1 + ',' + dummy + ',' + var3 + ')');
		}
	}

	public static void e(byte var0) {
		try {
			if (var0 < 56) {
				kfs_pb = null;
			}

			hf_qb = null;
			ints_ab = null;
			bg_nb = null;
			ints_jb = null;
			kfs_pb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "client.S(" + var0 + ')');
		}
	}

	public static void main(String[] var0) {
		int var2 = int_gc;

		try {
			++int_cb;

			try {
				if (~var0.length != -8) {
					nh.f(14750);
				}

				label111:
				{
					hd.int_u = Integer.parseInt(var0[0]);
					if (!var0[1].equals("live")) {
						if (!var0[1].equals("office")) {
							if (var0[1].equals("local")) {
								ch.int_s = 2;
								if (var2 == 0) {
									break label111;
								}
							}

							nh.f(14750);
							if (var2 == 0) {
								break label111;
							}
						}

						ch.int_s = 1;
						if (var2 == 0) {
							break label111;
						}
					}

					ch.int_s = 0;
				}

				label100:
				{
					if (!var0[2].equals("live")) {
						if (!var0[2].equals("rc")) {
							if (var0[2].equals("wip")) {
								ch.int_o = 2;
								if (var2 == 0) {
									break label100;
								}
							}

							nh.f(14750);
							if (var2 == 0) {
								break label100;
							}
						}

						ch.int_o = 1;
						if (var2 == 0) {
							break label100;
						}
					}

					ch.int_o = 0;
				}

				label89:
				{
					if (!var0[3].equals("lowmem")) {
						if (!var0[3].equals("highmem")) {
							nh.f(14750);
							if (var2 == 0) {
								break label89;
							}
						}

						nb.b(115);
						if (var2 == 0) {
							break label89;
						}
					}

					pg.a(true);
				}

				label119:
				{
					if (var0[4].equals("free")) {
						gh.boolean_fb = false;
						if (var2 == 0) {
							break label119;
						}
					}

					if (var0[4].equals("members")) {
						gh.boolean_fb = true;
						if (var2 == 0) {
							break label119;
						}
					}

					nh.f(14750);
				}

				label72:
				{
					if (!var0[5].equals("english")) {
						if (!var0[5].equals("german")) {
							nh.f(14750);
							if (var2 == 0) {
								break label72;
							}
						}

						qh.a((byte) 113);
						eh.int_q = 1;
						sh.Jb = of.lf_v;
						if (var2 == 0) {
							break label72;
						}
					}

					eh.int_q = 0;
				}

				label120:
				{
					if (var0[6].equals("game0")) {
						sb.int_i = 0;
						if (var2 == 0) {
							break label120;
						}
					}

					if (!var0[6].equals("game1")) {
						nh.f(14750);
						if (var2 == 0) {
							break label120;
						}
					}

					sb.int_i = 1;
				}

				uf.string_f = "127.0.0.1";
				client var1 = new client();
				var1.a(765, 484, "runescape", 37, 503, 32 + ch.int_o, 16);
				ce.Z.setLocation(40, 40);
			} catch (Exception var3) {
				ah.a((String) null, -36, var3);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "client.main(" + (var0 != null ? "{...}" : "null") + ')');
		}
	}

	private static void f(byte var0) {
		try {
			synchronized (wa.Cb) {
				if (~c.X != -1) {
					c.X = 1;

					try {
						wa.Cb.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			}

			++int_db;
			int var8 = -22 / ((var0 - -10) / 63);
		} catch (RuntimeException var7) {
			throw ec.a(var7, "client.R(" + var0 + ')');
		}
	}

	final void c(int var1) {
		int var5 = int_gc;

		try {
			if (var1 == 16) {
				++int_bb;
				boolean var2 = dc.f(-105);
				if (var2 && de.boolean_q && rg.ah_f != null) {
					rg.ah_f.a((byte) 119);
				}

				if (sg.boolean_f) {
					n.a(-1, ae.U);
					ad.a((byte) -106, ae.U);
					if (pb.kb_j != null) {
						pb.kb_j.a((byte) 118, ae.U);
					}

					this.a((int) 0);
					pd.a((byte) 124, ae.U);
					d.a(ae.U, (byte) 78);
					if (pb.kb_j != null) {
						pb.kb_j.a(ae.U, -44);
					}
				}

				label147:
				{
					if (ld.Z == 0) {
						jf.a((Color) null, ja.int_cb, pf.lf_ab, var1 ^ 316);
						if (var5 == 0) {
							break label147;
						}
					}

					if (~ld.Z == -6) {
						va.a(he.Q, ee.S, false);
						if (var5 == 0) {
							break label147;
						}
					}

					if (~ld.Z == -11) {
						va.a(he.Q, ee.S, false);
						if (var5 == 0) {
							break label147;
						}
					}

					if (ld.Z == 20) {
						va.a(he.Q, ee.S, false);
						if (var5 == 0) {
							break label147;
						}
					}

					if (ld.Z == 25) {
						int var3;
						if (sf.V != 1) {
							if (sf.V == 2) {
								if (kd.int_jb < pb.int_h) {
									kd.int_jb = pb.int_h;
								}

								var3 = (kd.int_jb + -pb.int_h) * 50 / kd.int_jb + 50;
								l.a(de.a(new lf[]{me.loading_pleaseWait, dd.Q, fa.a((byte) 85, var3), cg.S}, 126), -1, false);
							} else {
								l.a(me.loading_pleaseWait, var1 + -17, false);
							}
						} else {
							if (eh.int_n > oh.int_sb) {
								oh.int_sb = eh.int_n;
							}

							var3 = 50 * (oh.int_sb - eh.int_n) / oh.int_sb;
							l.a(de.a(new lf[]{me.loading_pleaseWait, dd.Q, fa.a((byte) 85, var3), cg.S}, var1 ^ 104), -1, false);
						}
					} else if (ld.Z != 30) {
						if (ld.Z == 40) {
							l.a(de.a(new lf[]{tb.Z, wh.lf_n, nb.lf_f}, 126), -1, false);
						}
					} else {
						th.a((byte) 79);
					}
				}

				int var4;
				Graphics graphics;
				if (ld.Z == 30 && sg.int_a == 0 && !ib.boolean_s) {
					try {
						graphics = ae.U.getGraphics();
						var4 = 0;
						if (ma.int_h > var4) {
							do {
								if (ub.V[var4]) {
									gh.Z.a(gh.W[var4], vg.Lc[var4], 0, graphics, cf.B[var4], fi.ints_p[var4]);
									ub.V[var4] = false;
								}

								++var4;
							} while (~ma.int_h < ~var4);

						}
					} catch (Exception var7) {
						ae.U.repaint();
					}
				} else if (~ld.Z < -1) {
					try {
						graphics = ae.U.getGraphics();
						gh.Z.a(0, (byte) -65, (Graphics) graphics, 0);
						ib.boolean_s = false;
						var4 = 0;
						if (var5 != 0 || var4 < ma.int_h) {
							do {
								ub.V[var4] = false;
								++var4;
							} while (var4 < ma.int_h);

						}
					} catch (Exception var6) {
						ae.U.repaint();
					}
				}
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "client.D(" + var1 + ')');
		}
	}

	private final void a(int var1, boolean var2) {
		try {
			++W;
			ob.da_n = null;
			++oa.U;
			e.int_a = 0;
			if (!var2) {
				this.d((byte) -59);
			}

			label47:
			{
				if (wd.int_lb != nh.R) {
					nh.R = wd.int_lb;
					if (int_gc == 0) {
						break label47;
					}
				}

				nh.R = gb.int_hb;
			}

			ad.nd_u = null;
			if (~oa.U <= -3 && (~var1 == -8 || ~var1 == -10)) {
				if (~ld.Z >= -6) {
					this.a((byte) -52, "js5connect_full");
					ld.Z = 1000;
				} else {
					ea.int_e = 3000;
				}
			} else if (oa.U >= 2 && ~var1 == -7) {
				this.a((byte) -63, "js5connect_outofdate");
				ld.Z = 1000;
			} else if (~oa.U <= -5) {
				if (ld.Z > 5) {
					ea.int_e = 3000;
				} else {
					this.a((byte) -38, "js5connect");
					ld.Z = 1000;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "client.Q(" + var1 + ',' + var2 + ')');
		}
	}

	static Class b(byte var0, String var1) throws ClassNotFoundException {
		try {
			++int_mb;
			if (var1.equals("B")) {
				return Byte.TYPE;
			} else if (var1.equals("I")) {
				return Integer.TYPE;
			} else if (var1.equals("S")) {
				return Short.TYPE;
			} else if (var1.equals("J")) {
				return Long.TYPE;
			} else if (var1.equals("Z")) {
				return Boolean.TYPE;
			} else if (var1.equals("F")) {
				return Float.TYPE;
			} else {
				if (var0 != -63) {
					ints_jb = null;
				}

				return var1.equals("D") ? Double.TYPE : (var1.equals("C") ? Character.TYPE : Class.forName(var1));
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "client.BA(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void d(int var1) {
		int dummy = int_gc;

		try {
			if (sb.int_i == 1) {
				di.shorts_gb = d.U;
				ic.C = r.shorts_bb;
				rg.shorts_t = ig.shorts_t;
				ig.shorts_k = ff.shorts_b;
			} else {
				di.shorts_gb = wa.Hb;
				ig.shorts_k = sc.R;
				rg.shorts_t = vh.shorts_a;
				ic.C = je.shorts_m;
			}

			wd.int_lb = ch.int_s != 0 ? hd.int_u + '鱀' : 'ꩊ';
			nh.R = wd.int_lb;
			++int_kb;
			gb.int_hb = ch.int_s != 0 ? '썐' + hd.int_u : 443;
			ib.a(-120);
			if (var1 != '鱀') {
				f((int) -12);
			}

			pd.a((byte) 127, ae.U);
			d.a(ae.U, (byte) 78);
			pb.kb_j = dg.b(5);
			if (pb.kb_j != null) {
				pb.kb_j.a(ae.U, -126);
			}

			h.int_h = ke.int_o;

			try {
				if (eh.ke_o.sa_a != null) {
					td.S = new hf(eh.ke_o.sa_a, 5200, 0);
					int var2 = 0;
					do {
						jh.hfs_d[var2] = new hf(eh.ke_o.sas_l[var2], 6000, 0);
						++var2;
					} while (var2 < 16);

					o.hf_g = new hf(eh.ke_o.sa_c, 6000, 0);
					be.wb_q = new wb(255, td.S, o.hf_g, 500000);
					hf_qb = new hf(eh.ke_o.sa_d, 24, 0);
					eh.ke_o.sa_d = null;
					eh.ke_o.sas_l = null;
					eh.ke_o.sa_a = null;
					eh.ke_o.sa_c = null;
				}
			} catch (IOException var4) {
				hf_qb = null;
				be.wb_q = null;
				td.S = null;
				o.hf_g = null;
			}

			if (ch.int_s != 0) {
				oa.V = true;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "client.F(" + var1 + ')');
		}
	}

	final void d(byte var1) {
		try {
			++int_hb;
			e((byte) 112);
			lf.c(true);
			ua.b((int) 31);
			uf.a((int) 42);
			eg.a((int) 108);
			qh.b((byte) -113);
			ja.c((byte) 119);
			nd.b(var1 ^ -1147533846);
			oh.e(-1);
			hf.b((byte) 100);
			wb.a(-99);
			p.d(true);
			wa.r(5681);
			lb.b(false);
			vg.a((byte) 90);
			u.e((byte) -124);
			tf.a(true);
			eh.b(-8917);
			kb.a((byte) 121);
			jc.b(-82);
			ob.a((byte) 123);
			ah.d(16128);
			pa.a((byte) -115);
			be.b(1073741823);
			bi.b(125);
			uc.d((byte) 108);
			ic.a(380184944);
			sd.c(1);
			fi.a(-27022);
			hb.a((byte) 118);
			bd.a(true);
			o.a((byte) -102);
			rc.b(1);
			ue.b();
			sg.a(-21365);
			qe.a(95);
			pc.a((byte) 116);
			ab.d((byte) 126);
			ed.b((byte) -119);
			rg.a((byte) 13);
			ka.b(false);
			ba.a(0);
			la.b((byte) -105);
			ei.b(0);
			oe.a();
			nf.a((int) 512);
			eb.a();
			th.a((int) -1);
			ge.a(-5115);
			ia.a((byte) 93);
			pd.a((byte) -23);
			nb.a(-97);
			w.a((byte) -92);
			ga.a((byte) 97);
			bg.c((byte) 61);
			sh.d((byte) -115);
			cb.a(true);
			dh.a(-818007391);
			ib.c(var1 ^ -9853);
			fd.a((byte) -115);
			h.a((byte) 127);
			sb.a((byte) -128);
			og.a(126);
			l.a((int) 255);
			te.b(false);
			ig.a((int) -101);
			e.a((int) -10);
			a.a(var1);
			b.b();
			ph.a(57);
			nc.f();
			vf.b(true);
			qf.b();
			mf.b(-1);
			mb.b(2);
			ff.a((byte) -91);
			cg.b(-103);
			ng.b(true);
			hh.e((byte) -15);
			i.c(-126);
			ie.d(13799);
			gf.g();
			td.c(-58);
			lh.e((byte) -42);
			rd.d((byte) 17);
			he.b(true);
			fc.b(false);
			ac.d((byte) 89);
			bf.d();
			bc.a((byte) 81);
			sc.c(var1 + 2045);
			ad.a((byte) -106);
			if (var1 != 2) {
				ints_jb = null;
			}

			vh.b(-1048);
			re.a(0);
			ai.a((byte) -13);
			lc.c(-64);
			jf.b(false);
			va.b(var1 ^ 75);
			fh.a(var1 + -1);
			qd.a(var1 ^ 83);
			id.c((byte) -79);
			ag.a(-1);
			ef.a(-1);
			vc.a();
			ci.c(-119);
			me.d((byte) -77);
			bh.d((byte) -42);
			hc.c(false);
			gg.a((int) 20617);
			af.c((byte) -124);
			rb.a((byte) -68);
			pe.a(true);
			wh.a(-84);
			n.d(0);
			mc.c(105);
			pg.a((byte) -117);
			ea.a(-11830);
			ca.a((int) -67);
			hg.a(-122);
			mg.e();
			we.a();
			fb.a(false);
			vb.a();
			dg.a(var1 ^ 7);
			ha.c((byte) -28);
			of.a(-30878);
			lg.a();
			cf.a(true);
			de.a(5685);
			ne.a((byte) 23);
			fe.a();
			g.a();
			md.a(8);
			wg.a(0);
			j.a(13218);
			uh.a(var1 ^ -3);
			pb.a((byte) 101);
			ra.e(-4);
			jh.a(var1 + 2);
			ma.a((int) 2);
			qa.e(var1 ^ -117);
			qb.b(false);
			dd.e(96);
			d.e(var1 ^ -88);
			od.f(var1 ^ 1538);
			wd.e(-111);
			tg.d((byte) 81);
			rf.b(true);
			ld.e(17);
			tc.d((byte) -74);
			oa.d((byte) -126);
			rh.e(124);
			ce.b(false);
			f.b(true);
			ub.b(false);
			tb.e(59);
			nh.e(84);
			ee.e(1);
			m.e(93);
			v.e((byte) 121);
			ec.e(var1 ^ 2);
			wc.d((byte) 44);
			pf.f(var1 + -100);
			gh.e(var1 ^ 11762);
			bb.b(true);
			sf.e(-2);
			ae.d((byte) 110);
			cc.d((byte) -85);
			vd.d((byte) 73);
			kd.d((byte) -86);
			r.f(4382);
			fa.e(var1 ^ 2);
			di.e((byte) 105);
			se.f(var1 ^ -1566999954);
			ug.e(var1 ^ 119);
			q.f(-16);
			kh.d((byte) -119);
			c.d((byte) 0);
			dc.d((byte) -87);
			je.a((byte) -71);
			jg.c((byte) 127);
			hd.a(var1 ^ -2829);
			ch.a(0);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "client.C(" + var1 + ')');
		}
	}

	final void a(byte var1) {
		try {
			++pd.int_i;
			if (pd.int_i % 1000 == 1) {
				GregorianCalendar gregorianCalendar = new GregorianCalendar();
				je.int_n = gregorianCalendar.get(Calendar.HOUR_OF_DAY) * 600
						+ (gregorianCalendar.get(Calendar.MINUTE) * 10)
						+ (gregorianCalendar.get(Calendar.SECOND) / 6);
				je.random_h.setSeed((long) je.int_n);
			}

			this.h(91);
			++int_gb;
			sg.c(13238);
			ba.a(false);
			uf.a((byte) 111);
			g(93);
			lh.b(false);
			if (pb.kb_j != null) {
				ee.Y = pb.kb_j.b((byte) 31);
			}

			if (ld.Z != 0) {
				if (ld.Z != 5) {
					if (ld.Z == 10) {
						te.a(this, (byte) -42);
					} else if (ld.Z == 20) {
						te.a(this, (byte) 101);
						sh.b(true);
					} else if (ld.Z == 25) {
						h.a((int) -83);
					}
				} else {
					te.a(this, (byte) -59);
					sd.e(126);
					dh.a((byte) 1);
				}
			} else {
				sd.e(100);
				dh.a((byte) 1);
			}

			if (var1 > -86) {
				main((String[]) null);
			}

			if (ld.Z == 30) {
				vh.a(-7866);
			} else if (~ld.Z == -41) {
				sh.b(true);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "client.K(" + var1 + ')');
		}
	}

	static Class b(int var0, int var1) {
		try {
			++int_ib;
			if (var1 != -13) {
				return null;
			} else {
				if (var0 != 0) {
					if (~var0 == -2) {
						if (class_tb != null) {
							return class_tb;
						}

						return class_tb = a("dd");
					}

					if (var0 == 2) {
						if (class_ub != null) {
							return class_ub;
						}

						return class_ub = a("d");
					}

					if (~var0 == -4) {
						if (class_vb != null) {
							return class_vb;
						}

						return class_vb = a("od");
					}

					if (~var0 == -5) {
						if (class_wb != null) {
							return class_wb;
						}

						return class_wb = a("wd");
					}

					if (var0 == 5) {
						if (xb != null) {
							return xb;
						}

						return xb = a("tg");
					}

					if (var0 == 6) {
						if (yb != null) {
							return yb;
						}

						return yb = a("rf");
					}

					if (~var0 == -8) {
						if (zb != null) {
							return zb;
						}

						return zb = a("ld");
					}

					if (~var0 == -9) {
						if (Ab != null) {
							return Ab;
						}

						return Ab = a("tc");
					}

					if (~var0 == -10) {
						if (Bb != null) {
							return Bb;
						}

						return Bb = a("oa");
					}

					if (~var0 == -11) {
						if (Cb != null) {
							return Cb;
						}

						return Cb = a("rh");
					}

					if (var0 == 11) {
						if (Db != null) {
							return Db;
						}

						return Db = a("ce");
					}

					if (~var0 == -13) {
						if (Eb != null) {
							return Eb;
						}

						return Eb = a("f");
					}

					if (~var0 == -14) {
						if (Fb != null) {
							return Fb;
						}

						return Fb = a("ub");
					}

					if (~var0 == -15) {
						if (Gb != null) {
							return Gb;
						}

						return Gb = a("tb");
					}

					if (var0 == 15) {
						if (Hb != null) {
							return Hb;
						}

						return Hb = a("nh");
					}

					if (var0 == 16) {
						if (Ib != null) {
							return Ib;
						}

						return Ib = a("ee");
					}

					if (~var0 == -18) {
						if (Jb != null) {
							return Jb;
						}

						return Jb = a("m");
					}

					if (var0 == 18) {
						if (Kb != null) {
							return Kb;
						}

						return Kb = a("v");
					}

					if (~var0 == -20) {
						if (Lb != null) {
							return Lb;
						}

						return Lb = a("ec");
					}

					if (var0 == 20) {
						if (Mb != null) {
							return Mb;
						}

						return Mb = a("wc");
					}

					if (var0 == 21) {
						if (Nb != null) {
							return Nb;
						}

						return Nb = a("pf");
					}

					if (var0 == 22) {
						if (Ob != null) {
							return Ob;
						}

						return Ob = a("gh");
					}

					if (var0 == 23) {
						if (Pb != null) {
							return Pb;
						}

						return Pb = a("bb");
					}

					if (var0 == 24) {
						if (Qb != null) {
							return Qb;
						}

						return Qb = a("sf");
					}

					if (~var0 == -26) {
						if (Rb != null) {
							return Rb;
						}

						return Rb = a("ae");
					}

					if (var0 == 26) {
						if (Sb != null) {
							return Sb;
						}

						return Sb = a("cc");
					}

					if (~var0 == -28) {
						if (Tb != null) {
							return Tb;
						}

						return Tb = a("vd");
					}

					if (~var0 == -29) {
						if (Ub != null) {
							return Ub;
						}

						return Ub = a("kd");
					}

					if (~var0 == -30) {
						if (Vb != null) {
							return Vb;
						}

						return Vb = a("r");
					}

					if (var0 == 30) {
						if (Wb != null) {
							return Wb;
						}

						return Wb = a("fa");
					}

					if (var0 == 31) {
						if (Xb != null) {
							return Xb;
						}

						return Xb = a("di");
					}

					if (~var0 == -33) {
						if (Yb != null) {
							return Yb;
						}

						return Yb = a("se");
					}

					if (~var0 == -34) {
						if (Zb != null) {
							return Zb;
						}

						return Zb = a("ug");
					}

					if (~var0 == -35) {
						if (class_ac != null) {
							return class_ac;
						}

						return class_ac = a("q");
					}

					if (~var0 == -36) {
						if (class_bc != null) {
							return class_bc;
						}

						return class_bc = a("kh");
					}

					if (var0 == 36) {
						if (class_cc != null) {
							return class_cc;
						}

						return class_cc = a("qb");
					}

					if (~var0 == -38) {
						if (class_dc != null) {
							return class_dc;
						}

						return class_dc = a("c");
					}

					if (var0 == 38) {
						if (class_ec != null) {
							return class_ec;
						}

						return class_ec = a("dc");
					}

					if (~var0 != -40) {
						return null;
					}

					if (int_gc == 0) {
						if (class_fc != null) {
							return class_fc;
						}

						return class_fc = a("qa");
					}
				}

				return class_sb != null ? class_sb : (class_sb = a("ra"));
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "client.CA(" + var0 + ',' + var1 + ')');
		}
	}

	final void a(boolean var1) {
		int var3 = int_gc;

		try {
			if (je.qh_j != null) {
				je.qh_j.boolean_h = false;
			}

			je.qh_j = null;
			++E;
			if (fd.nd_s != null) {
				fd.nd_s.a((byte) -40);
				fd.nd_s = null;
			}

			rf.d((byte) -48);
			ef.a(var1);
			pb.kb_j = null;
			if (rg.ah_f != null) {
				rg.ah_f.e(2);
			}

			if (e.ah_p != null) {
				e.ah_p.e(2);
			}

			jf.c(!var1);
			f((byte) 61);

			try {
				if (td.S != null) {
					td.S.a((int) 2);
				}

				if (jh.hfs_d != null) {
					int var2 = 0;
					if (var3 != 0 || ~var2 > ~jh.hfs_d.length) {
						do {
							if (jh.hfs_d[var2] != null) {
								jh.hfs_d[var2].a((int) 2);
							}

							++var2;
						} while (~var2 > ~jh.hfs_d.length);
					}
				}

				if (o.hf_g != null) {
					o.hf_g.a((int) 2);
				}

				if (hf_qb != null) {
					hf_qb.a((int) 2);
				}
			} catch (IOException var4) {
				;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "client.E(" + var1 + ')');
		}
	}

	// $FF: synthetic method
	static Class a(String var0) {
		try {
			return Class.forName(var0);
		} catch (ClassNotFoundException var2) {
			throw new NoClassDefFoundError(var2.getMessage());
		}
	}

	static {
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			ints_jb[var1] = var0 - 1;
			var0 += var0;
		}

		int_ob = 0;
		int_rb = 3;
	}
}
