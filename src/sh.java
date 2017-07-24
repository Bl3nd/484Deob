import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;

final class sh extends kc {

	int[] ints_r = new int[16];
	static int int_s;
	private int[] ints_t = new int[16];
	private int[] ints_u = new int[16];
	static int int_v;
	static int int_w;
	static int x;
	static int y;
	static int z;
	private int[] A = new int[16];
	static int B;
	static int C;
	static int D;
	private int[] E = new int[16];
	private int[] F = new int[16];
	private int[] G = new int[16];
	static int H;
	static int I;
	static int J;
	static int K;
	static int L;
	private int[] N = new int[16];
	private eh O;
	static int P;
	private int[] Q = new int[16];
	static int R;
	int[] S = new int[16];
	private int[] T = new int[16];
	static int U;
	private qf V = new qf();
	static int W;
	static int X;
	static int Y;
	private int Z = 256;
	static int int_ab;
	static int int_bb;
	static int int_cb;
	private vf[][] vfs_db = new vf[16][128];
	static int int_eb;
	private int[] ints_fb = new int[16];
	private static BigInteger bigInteger_gb = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
	static int int_hb;
	static int int_ib;
	static int int_jb;
	static int int_kb;
	int[] ints_lb = new int[16];
	static int int_mb;
	static int int_nb;
	static int int_ob;
	static int int_pb;
	static bg bg_qb;
	private vf[][] vfs_rb = new vf[16][128];
	static lf lf_sb = dd.a("<)4col> x", 2);
	private int[] ints_tb = new int[16];
	static int int_ub = 50;
	static int int_vb;
	static vg vg_wb;
	static oh cache7;
	static int yb = 0;
	static int zb;
	static int Ab = 0;
	static df Bb;
	static int Cb;
	static int Db;
	private int Eb = 1000000;
	static int Fb;
	static lf Gb = dd.a("", 2);
	private int[] Hb = new int[16];
	static int Ib;
	static lf Jb;
	static int Kb;
	private boolean Lb;
	private int Mb;
	private int Nb;
	private long Ob;
	private long Pb;
	private mf Qb = new mf(this);

	final synchronized int d() {
		try {
			++C;
			return 0;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sh.E(" + ')');
		}
	}

	final synchronized kc c() {
		try {
			++int_pb;
			return null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sh.B(" + ')');
		}
	}

	final synchronized void a(int[] var1, int var2, int var3) {
		int var8 = client.int_gc;

		try {
			if (this.V.f()) {
				int var4 = this.Eb * this.V.int_e / cb.sampleRate;

				do {
					long var5 = (long) var4 * (long) var3 + this.Ob;
					if (-var5 + this.Pb >= 0L) {
						this.Ob = var5;
						if (var8 == 0) {
							break;
						}
					}

					int var7 = (int) ((-1L + -this.Ob + this.Pb + (long) var4) / (long) var4);
					this.Ob += (long) var7 * (long) var4;
					var3 -= var7;
					this.Qb.a(var1, var2, var7);
					var2 += var7;
					this.e(0);
				} while (this.V.f());
			}

			this.Qb.a(var1, var2, var3);
			++P;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "sh.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void b(boolean var0) {
		int dummy = client.int_gc;//todo

		try {
			++U;

			try {
				if (d.int_jb == 0) {
					if (fd.nd_s != null) {
						fd.nd_s.a((byte) -59);
						fd.nd_s = null;
					}

					ac.Q = false;
					d.int_jb = 1;
					bi.M = null;
					ee.V = 0;
				} else if (d.int_jb == 1) {
					if (bi.M == null) {
						bi.M = eh.ke_o.a(nh.R, false, uf.string_f);
					}

					if (bi.M.int_a == 2) {
						throw new IOException();
					} else if (bi.M.int_a == 1) {
						fd.nd_s = new nd((Socket) bi.M.object_c, eh.ke_o);
						bi.M = null;
						d.int_jb = 2;
					}
				} else if (d.int_jb == 2) {
					long var1 = wa.Nb = pf.Q.a(false);
					vg.J.P = 0;
					int var3 = (int) (31L & var1 >> 16);
					vg.J.e(-13488, 14);
					vg.J.e(-13488, var3);
					fd.nd_s.a(-69, 0, 2, vg.J.yb);
					d.int_jb = 3;
					ka.I.P = 0;
				} else if (d.int_jb == 3) {
					if (rg.ah_f != null) {
						rg.ah_f.a(8);
					}

					if (e.ah_p != null) {
						e.ah_p.a(8);
					}

					int var7 = fd.nd_s.a(true);
					if (rg.ah_f != null) {
						rg.ah_f.a(8);
					}

					if (e.ah_p != null) {
						e.ah_p.a(8);
					}

					if (var7 != 0) {
						bi.a(var7, (byte) 90);
						return;
					}

					ka.I.P = 0;
					d.int_jb = 4;
				} else if (d.int_jb == 4) {
					if (ka.I.P < 8) {
						int var7 = fd.nd_s.a(-75);
						if (-ka.I.P + 8 < var7) {
							var7 = 8 + -ka.I.P;
						}

						if (var7 > 0) {
							fd.nd_s.a(5, var7, ka.I.yb, ka.I.P);
							ka.I.P += var7;
						}
					}

					if (ka.I.P == 8) {
						ka.I.P = 0;
						ka.Y = ka.I.i(-1495411552);
						d.int_jb = 5;
					}
				} else if (d.int_jb == 5) {
					int[] var8;
					label204:
					{
						vg.J.P = 0;
						var8 = new int[]{(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (ka.Y >> 32), (int) ka.Y};
						vg.J.e(-13488, 10);
						vg.J.b((byte) 101, var8[0]);
						vg.J.b((byte) 117, var8[1]);
						vg.J.b((byte) 113, var8[2]);
						vg.J.b((byte) 103, var8[3]);
						vg.J.a(pf.Q.a(false), -562765672);
						vg.J.a(pf.lf_kb, (byte) -108);
						vg.J.a(ci.bigInteger_db, bigInteger_gb, (byte) 108);
						ua.y.P = 0;
						if (ld.Z == 40) {
							ua.y.e(-13488, 18);
						} else {
							ua.y.e(-13488, 16);
						}
					}

					ua.y.e(-13488, vg.J.P + 93);
					ua.y.b((byte) 123, 484);
					ua.y.e(-13488, tf.boolean_q ? 1 : 0);
					ig.a(var0, ua.y);
					ua.y.b((byte) 109, ga.cache0.C);
					ua.y.b((byte) 112, ee.cache1.C);
					ua.y.b((byte) 115, ei.cache2.C);
					ua.y.b((byte) 107, ff.cache3.C);
					ua.y.b((byte) 117, of.cache4.C);
					ua.y.b((byte) 114, se.cache5.C);
					ua.y.b((byte) 110, l.cache6.C);
					ua.y.b((byte) 126, cache7.C);
					ua.y.b((byte) 111, hd.cache8.C);
					ua.y.b((byte) 125, ob.cache9.C);
					ua.y.b((byte) 113, dh.cache10.C);
					ua.y.b((byte) 119, ka.cache11.C);
					ua.y.b((byte) 127, ei.cache12.C);
					ua.y.b((byte) 124, gh.cache13.C);
					ua.y.b((byte) 127, ka.cache14.C);
					ua.y.b((byte) 105, p.cache15.C);
					ua.y.a(0, vg.J.P, vg.J.yb, var0);
					fd.nd_s.a(-118, 0, ua.y.P, ua.y.yb);
					vg.J.a(!var0, var8);
					int var2 = 0;
					if (dummy != 0 || ~var2 > -5) {
						do {
							var8[var2] += 50;
							++var2;
						} while (~var2 > -5);
					}

					ka.I.a(!var0, var8);
					d.int_jb = 6;
				}

				if (~d.int_jb == -7 && fd.nd_s.a(-110) > 0) {
					label223:
					{
						int var7 = fd.nd_s.a(true);
						if (var7 == 21 && ld.Z == 20) {
							d.int_jb = 7;
							if (dummy == 0) {
								break label223;
							}
						}

						if (~var7 == -3) {
							d.int_jb = 9;
							if (dummy == 0) {
								break label223;
							}
						}

						if (var7 == 15 && ~ld.Z == -41) {
							n.c(0);
							return;
						}

						if (var7 == 23 && ~d.W > -2) {
							++d.W;
							d.int_jb = 0;
							if (dummy == 0) {
								break label223;
							}
						}

						bi.a(var7, (byte) 90);
						return;
					}
				}

				if (!var0) {
					yb = 113;
				}

				if (d.int_jb == 7 && ~fd.nd_s.a(-100) < -1) {
					pf.int_lb = 180 + fd.nd_s.a(true) * 60;
					d.int_jb = 8;
				}

				if (d.int_jb == 8) {
					ee.V = 0;
					gg.a(95, de.a(new lf[]{fa.a((byte) 85, pf.int_lb / 60), m.S}, 121), vf.lf_s, ug.lf_ab);
					if (--pf.int_lb <= 0) {
						d.int_jb = 0;
					}

				} else {
					if (d.int_jb == 9 && fd.nd_s.a(-80) >= 9) {
						mc.x = fd.nd_s.a(true);
						w.int_c = fd.nd_s.a(true);
						td.T = ~fd.nd_s.a(true) == -2;
						fh.int_d = fd.nd_s.a(true);
						fh.int_d <<= 8;
						fh.int_d += fd.nd_s.a(true);
						ig.int_s = fd.nd_s.a(var0);
						fd.nd_s.a(112, 1, ka.I.yb, 0);
						ka.I.P = 0;
						of.int_r = ka.I.q(30882);
						fd.nd_s.a(-58, 2, ka.I.yb, 0);
						ka.I.P = 0;
						wb.int_g = ka.I.b(true);
						d.int_jb = 10;
					}

					if (d.int_jb == 10) {
						if (fd.nd_s.a(-91) >= wb.int_g) {
							ka.I.P = 0;
							fd.nd_s.a(-111, wb.int_g, ka.I.yb, 0);
							ig.a((byte) 104);
							lc.int_t = -1;
							jh.a(false, (byte) -111);
							of.int_r = -1;
						}

					} else {
						++ee.V;
						if (ee.V > 2000) {
							if (~d.W <= -2) {
								bi.a(-3, (byte) 90);
							} else {
								label159:
								{
									if (wd.int_lb != nh.R) {
										nh.R = wd.int_lb;
										if (dummy == 0) {
											break label159;
										}
									}

									nh.R = gb.int_hb;
								}

								++d.W;
								d.int_jb = 0;
							}
						}
					}
				}
			} catch (IOException var5) {
				if (~d.W > -2) {
					d.int_jb = 0;
					++d.W;
					if (nh.R != wd.int_lb) {
						nh.R = wd.int_lb;
					} else {
						nh.R = gb.int_hb;
					}
				} else {
					bi.a(-2, (byte) 90);
				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "sh.T(" + var0 + ')');
		}
	}

	final int c(byte var1) {
		try {
			if (var1 <= 35) {
				this.a(116, false, 11);
			}

			++Fb;
			return this.Z;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sh.R(" + var1 + ')');
		}
	}

	private int a(byte var1, vf var2) {
		try {
			int var3 = this.F[var2.Q];
			++int_cb;
			if (var1 <= 85) {
				this.E = null;
			}

			return var3 < 8192 ? var3 * var2.M - -32 >> -1849794650 : -(32 + (-var3 + 16384) * (128 - var2.M) >> -1017415066) + 16384;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sh.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	private void a(int var1, int var2, int var3, int var4) {
		int var8 = client.int_gc;

		try {
			vf var5 = this.vfs_rb[var1][var2];
			++L;
			if (var5 != null) {
				this.vfs_rb[var1][var2] = null;
				int var6 = 0 / ((var3 - 28) / 53);
				if (~(2 & this.ints_lb[var1]) == -1) {
					var5.int_p = 0;
				} else {
					vf var7 = (vf) this.Qb.tf_w.c(68);
					if (var8 != 0 || var7 != null) {
						do {
							if (~var7.Q == ~var5.Q && var7.int_p < 0 && var7 != var5) {
								var5.int_p = 0;
								return;
							}

							var7 = (vf) this.Qb.tf_w.d(-1);
						} while (var7 != null);

					}
				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "sh.BA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	private void a(byte var1, int var2) {
		int var4 = client.int_gc;

		try {
			++I;
			if (var2 >= 0) {
				this.ints_u[var2] = 12800;
				this.F[var2] = 8192;
				this.A[var2] = 16383;
				this.G[var2] = 8192;
				this.E[var2] = 0;
				this.ints_t[var2] = 8192;
				this.b(74, var2);
				this.e(var2, 128);
				this.ints_lb[var2] = 0;
				this.Hb[var2] = 32767;
				this.T[var2] = 256;
				if (var1 < -55) {
					this.ints_r[var2] = 0;
					this.b(var2, 8192, 2795);
				}
			} else {
				var2 = 0;
				if (var4 != 0) {
					this.a((byte) -103, var2);
					++var2;
				}

				while (~var2 > -17) {
					this.a((byte) -103, var2);
					++var2;
				}

			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.H(" + var1 + ',' + var2 + ')');
		}
	}

	final synchronized void a(boolean var1, byte var2, s var3) {
		int var6 = client.int_gc;

		try {
			this.f((byte) 126);
			++D;
			this.V.a(var3.bytes_n);
			this.Ob = 0L;
			this.Lb = var1;
			int var4 = this.V.d();
			int var5 = 0;
			if (var6 != 0) {
				this.V.c(var5);
				this.V.b(var5);
				this.V.d(var5);
				++var5;
			}

			while (~var5 > ~var4) {
				this.V.c(var5);
				this.V.b(var5);
				this.V.d(var5);
				++var5;
			}

			this.Nb = this.V.c();
			this.Mb = this.V.ints_f[this.Nb];
			this.Pb = this.V.f(this.Mb);
			if (var2 != -85) {
				this.e(-95);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sh.JA(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private void a(int var1, int var2) {
		int var4 = client.int_gc;

		try {
			++int_nb;
			vf var3 = (vf) this.Qb.tf_w.c(109);
			if (var4 == 0 && var3 == null) {
				if (var2 != 0) {
					a(-65L, 108);
				}
			} else {
				do {
					if ((var1 < 0 || var1 == var3.Q) && var3.int_p < 0) {
						this.vfs_rb[var3.Q][var3.V] = null;
						var3.int_p = 0;
					}

					var3 = (vf) this.Qb.tf_w.d(-1);
				} while (var3 != null);

				if (var2 != 0) {
					a(-65L, 108);
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.OA(" + var1 + ',' + var2 + ')');
		}
	}

	private void a(int var1, int var2, int var3) {
		int var5 = client.int_gc;

		try {
			++int_ob;
			if (this.ints_fb[var3] != var2) {
				this.ints_fb[var3] = var2;
				int var4 = 0;
				if (var5 != 0 || ~var4 > -129) {
					do {
						this.vfs_db[var3][var4] = null;
						++var4;
					} while (~var4 > -129);
				}
			}

			if (var1 > -90) {
				this.c(65);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "sh.IA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final synchronized void b(int var1) {
		int var4 = client.int_gc;

		try {
			int var2 = -115 % ((40 - var1) / 50);
			mb var3 = (mb) this.O.a((byte) 91);
			if (var4 == 0 && var3 == null) {
				++zb;
			} else {
				do {
					var3.a(true);
					var3 = (mb) this.O.c(1);
				} while (var3 != null);

				++zb;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.I(" + var1 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			bg_qb = null;
			Bb = null;
			vg_wb = null;
			Jb = null;
			lf_sb = null;
			Gb = null;
			cache7 = null;
			int var1 = 52 / ((var0 - -18) / 60);
			bigInteger_gb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sh.HA(" + var0 + ')');
		}
	}

	private void a(int var1, boolean var2, int var3) {
		try {
			this.ints_tb[9] = 128;
			this.N[9] = 128; //sd.a(-128, 128);
			if (!var2) {
				this.Lb = false;
			}

			this.a(-118, 128, 9);
			++Y;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.GA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(vf var1, boolean var2, int var3) {
		try {
			++int_v;
			if (var3 != -4123) {
				this.a(true, -46, -95, -124);
			}

			int var5;
			label30:
			{
				int var4 = var1.G.bytes_q.length;
				if (var2 && var1.G.boolean_o) {
					int var6 = -var1.G.int_p + var4 + var4;
					var5 = (int) ((long) var6 * (long) this.ints_r[var1.Q] >> 1116624326);
					var4 <<= 8;
					if (~var4 < ~var5) {
						break label30;
					}

					var5 = -var5 + var4 + var4 + -1;
					var1.z.b(true);
					if (client.int_gc == 0) {
						break label30;
					}
				}

				var5 = (int) ((long) var4 * (long) this.ints_r[var1.Q] >> 2091889926);
			}

			var1.z.c(var5);
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sh.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final void a(long var0, int var2) {
		try {
			try {
				Thread.sleep(var0);
				if (var2 > -82) {
					a(121L, 14);
				}
			} catch (InterruptedException var4) {
				;
			}

			++int_hb;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.FA(" + var0 + ',' + var2 + ')');
		}
	}

	private void c(int var1) {
		try {
			this.d(0, -1);
			this.a((byte) -125, -1);
			++int_jb;
			if (var1 < -14) {
				int var2 = 0;
				do {
					this.ints_fb[var2] = this.ints_tb[var2];
					++var2;
				} while (var2 < 16);

				int var3 = 0;
				do {
					this.N[var3] = sd.a(-128, this.ints_tb[var3]);
					++var3;
				} while (var3 < 16);

			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.LA(" + var1 + ')');
		}
	}

	final synchronized boolean d(int var1) {
		try {
			int var2 = -5 / ((-18 - var1) / 60);
			++X;
			return this.V.f();
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sh.O(" + var1 + ')');
		}
	}

	private void b(int var1, int var2) {
		int var4 = client.int_gc;

		try {
			if ((2 & this.ints_lb[var2]) != 0) {
				vf var3 = (vf) this.Qb.tf_w.c(113);
				if (var4 != 0 || var3 != null) {
					do {
						if (var2 == var3.Q && this.vfs_rb[var2][var3.V] == null && ~var3.int_p > -1) {
							var3.int_p = 0;
						}

						var3 = (vf) this.Qb.tf_w.d(-1);
					} while (var3 != null);
				}
			}

			++Ib;
			if (var1 < 50) {
				this.a(107);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.P(" + var1 + ',' + var2 + ')');
		}
	}

	final boolean a(int var1, int[] var2, int var3, vf var4, int var5) {
		int var11 = client.int_gc;

		try {
			var4.S = cb.sampleRate / 100;
			++B;
			if (~var4.int_p <= -1 && (var4.z == null || var4.z.f())) {
				var4.c((byte) 91);
				var4.a(true);
				if (var4.T > 0 && var4 == this.vfs_db[var4.Q][var4.T]) {
					this.vfs_db[var4.Q][var4.T] = null;
				}

				return true;
			} else if (var5 < 102) {
				return false;
			} else {
				boolean var8 = false;
				int var6 = var4.int_v;
				if (~var6 < -1) {
					var6 -= (int) (0.5D + Math.pow(2.0D, (double) this.ints_t[var4.Q] * 4.921259842519685E-4D) * 16.0D);
					if (var6 < 0) {
						var6 = 0;
					}

					var4.int_v = var6;
				}

				var4.z.d(this.b(var4, (byte) 37));
				double var9 = 5.086263020833333E-6D * (double) ((var4.V + -60 << 454423944) + (var4.P * var4.int_v >> -185019476));
				++var4.R;
				ne var7 = var4.W;
				var4.y += var7.int_a;
				if (~var7.int_b < -1) {
					label140:
					{
						if (var7.int_n <= 0) {
							var4.E += 128;
							if (var11 == 0) {
								break label140;
							}
						}

						var4.E += (int) (0.5D + 128.0D * Math.pow(2.0D, var9 * (double) var7.int_n));
					}

					if (~(var4.E * var7.int_b) <= -819201) {
						var8 = true;
					}
				}

				if (var7.bytes_i != null) {
					label132:
					{
						if (var7.int_f > 0) {
							var4.int_u += (int) (0.5D + Math.pow(2.0D, var9 * (double) var7.int_f) * 128.0D);
							if (var11 == 0) {
								break label132;
							}
						}

						var4.int_u += 128;
						if (var11 != 0) {
							var4.I += 2;
						}
					}

					while (~var4.I > ~(var7.bytes_i.length + -2) && (255 & var7.bytes_i[2 + var4.I]) << -926574392 < var4.int_u) {
						var4.I += 2;
					}

					if (~var4.I == ~(-2 + var7.bytes_i.length) && var7.bytes_i[var4.I + 1] == 0) {
						var8 = true;
					}
				}

				if (~var4.int_p <= -1 && var7.bytes_u != null && (this.ints_lb[var4.Q] & 1) == 0 && (var4.T < 0 || var4 != this.vfs_db[var4.Q][var4.T])) {
					label109:
					{
						if (var7.int_s > 0) {
							var4.int_p += (int) (0.5D + Math.pow(2.0D, var9 * (double) var7.int_s) * 128.0D);
							if (var11 == 0) {
								break label109;
							}
						}

						var4.int_p += 128;
						if (var11 != 0) {
							var4.x += 2;
						}
					}

					while (~var4.x > ~(-2 + var7.bytes_u.length) && ~var4.int_p < ~((255 & var7.bytes_u[var4.x - -2]) << -1737700728)) {
						var4.x += 2;
					}

					if (var4.x == -2 + var7.bytes_u.length) {
						var8 = true;
					}
				}

				if (!var8) {
					var4.z.a(var4.S, this.a(var4, (byte) 127), this.a((byte) 104, var4));
					return false;
				} else {
					label94:
					{
						var4.z.g(var4.S);
						if (var2 == null) {
							var4.z.a(var3);
							if (var11 == 0) {
								break label94;
							}
						}

						var4.z.a(var2, var1, var3);
					}

					if (var4.z.g()) {
						this.Qb.H.a(var4.z);
					}

					var4.c((byte) 88);
					if (var4.int_p >= 0) {
						var4.a(true);
						if (var4.T > 0 && this.vfs_db[var4.Q][var4.T] == var4) {
							this.vfs_db[var4.Q][var4.T] = null;
						}
					}

					return true;
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "sh.PA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	private void a(int var1, int var2, byte var3) {
		try {
			++W;
			if (var3 == -93) {
				this.G[var1] = var2;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.QA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final synchronized void a(int var1) {
		int var6 = client.int_gc;

		try {
			++J;
			if (this.V.f()) {
				int var2 = this.Eb * this.V.int_e / cb.sampleRate;

				do {
					long var3 = this.Ob - -((long) var1 * (long) var2);
					if (~(this.Pb - var3) <= -1L) {
						this.Ob = var3;
						if (var6 == 0) {
							break;
						}
					}

					int var5 = (int) (((long) var2 + this.Pb - (this.Ob + 1L)) / (long) var2);
					this.Ob += (long) var5 * (long) var2;
					this.Qb.a(var5);
					this.e(0);
					var1 -= var5;
				} while (this.V.f());
			}

			this.Qb.a(var1);
		} catch (RuntimeException var7) {
			throw ec.a(var7, "sh.A(" + var1 + ')');
		}
	}

	final synchronized void e(byte var1) {
		int var3 = client.int_gc;

		try {
			if (var1 >= -51) {
				b(true);
			}

			mb var2 = (mb) this.O.a((byte) 82);
			if (var3 == 0 && var2 == null) {
				++z;
			} else {
				do {
					var2.c((byte) 53);
					var2 = (mb) this.O.c(1);
				} while (var2 != null);

				++z;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sh.W(" + var1 + ')');
		}
	}

	private int a(vf var1, byte var2) {
		try {
			++int_kb;
			if (var2 < 90) {
				this.d();
			}

			int var4 = 4096 + this.ints_u[var1.Q] * this.A[var1.Q] >> 1163774637;
			ne var3 = var1.W;
			var4 = var4 * var4 + 16384 >> 871073007;
			var4 = 16384 + var1.F * var4 >> -1084688977;
			var4 = this.Z * var4 - -128 >> -682602936;
			if (~var3.int_b < -1) {
				var4 = (int) (0.5D + Math.pow(0.5D, 1.953125E-5D * (double) var1.E * (double) var3.int_b) * (double) var4);
			}

			int var5;
			int var6;
			int var7;
			int var8;
			if (var3.bytes_i != null) {
				var6 = var3.bytes_i[var1.I - -1];
				var5 = var1.int_u;
				if (var1.I < -2 + var3.bytes_i.length) {
					var8 = (255 & var3.bytes_i[2 + var1.I]) << 842686472;
					var7 = '\uff00' & var3.bytes_i[var1.I] << 1762972680;
					var6 += (var3.bytes_i[3 + var1.I] - var6) * (-var7 + var5) / (var8 + -var7);
				}

				var4 = var4 * var6 + 32 >> -108232506;
			}

			if (var1.int_p > 0 && var3.bytes_u != null) {
				var5 = var1.int_p;
				var6 = var3.bytes_u[1 + var1.x];
				if (var1.x < var3.bytes_u.length + -2) {
					var8 = '\uff00' & var3.bytes_u[2 + var1.x] << -1752945816;
					var7 = (var3.bytes_u[var1.x] & 255) << 1269161928;
					var6 += (-var7 + var5) * (var3.bytes_u[var1.x - -3] - var6) / (-var7 + var8);
				}

				var4 = var4 * var6 - -32 >> 551700102;
			}

			return var4;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "sh.RA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final synchronized kc b() {
		try {
			++Cb;
			return this.Qb;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sh.F(" + ')');
		}
	}

	final synchronized boolean a(int var1, s class_s, bg cache15, int var4, cb class_cb) {
		try {
			class_s.b();
			boolean var6 = true;
			int[] var7 = null;
			if (var4 > 0) {
				var7 = new int[]{var4};
			}

			de class_de = (de) class_s.eh_o.a((byte) 105);
			if (var1 <= 52) {
				return true;
			} else {
				for (; class_de != null; class_de = (de) class_s.eh_o.c(1)) {
					int fileID = (int) class_de.long_e;
					mb var10 = (mb) this.O.a((long) fileID, (byte) -76);
					if (var10 == null) {
						var10 = md.a((byte) 86, cache15, fileID);
						if (var10 == null) {
							var6 = false;
						} else {
							this.O.a((long) fileID, false, var10);
						}
					} else if (!var10.a(-8812, class_de.bytes_t, class_cb, var7)) {
						var6 = false;
					}
				}

				++Kb;
				if (var6) {
					class_s.a();
				}

				return var6;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "sh.KA(" + var1 + ',' + (class_s != null ? "{...}" : "null") + ',' + (cache15 != null ? "{...}" : "null") + ',' + var4 + ',' + (class_cb != null ? "{...}" : "null") + ')');
		}
	}

	private void a(int var1, int var2, byte var3, int var4) {
		int var9 = client.int_gc;

		try {
			++int_w;
			this.a(var1, var2, 85, 64);
			if (~(2 & this.ints_lb[var1]) != -1) {
				vf var5 = (vf) this.Qb.tf_w.a(127);
				if (var9 != 0 || var5 != null) {
					do {
						if (var1 == var5.Q && ~var5.int_p > -1) {
							this.vfs_rb[var1][var5.V] = null;
							this.vfs_rb[var1][var2] = var5;
							int var12 = var5.int_o + (var5.P * var5.int_v >> -653573460);
							var5.int_v = 4096;
							var5.int_o += var2 + -var5.V << 1782237960;
							var5.P = var12 - var5.int_o;
							var5.V = var2;
							return;
						}

						var5 = (vf) this.Qb.tf_w.b((byte) -101);
					} while (var5 != null);
				}
			}

			mb var11 = (mb) this.O.a((long) this.ints_fb[var1], (byte) -122);
			if (var11 != null) {
				k var6 = var11.ks_v[var2];
				if (var6 != null) {
					vf var7 = new vf();
					var7.G = var6;
					var7.N = var11;
					var7.Q = var1;
					var7.W = var11.nes_s[var2];
					var7.T = var11.bytes_q[var2];
					var7.V = var2;
					var7.F = var4 * var4 * var11.int_o * var11.bytes_r[var2] + 1024 >> -375767189;
					var7.M = var11.bytes_w[var2] & 255;
					var7.int_o = -(var11.shorts_n[var2] & 32767) + (var2 << -432701912);
					var7.E = 0;
					var7.int_u = 0;
					var7.int_p = -1;
					var7.x = 0;
					if (var3 == -28) {
						label74:
						{
							var7.I = 0;
							if (this.ints_r[var1] == 0) {
								var7.z = jb.a(var6, this.b(var7, (byte) 37), this.a(var7, (byte) 96), this.a((byte) 93, var7));
								if (var9 == 0) {
									break label74;
								}
							}

							var7.z = jb.a(var6, this.b(var7, (byte) 37), 0, this.a((byte) 125, var7));
							this.a(var7, ~var11.shorts_n[var2] > -1, -4123);
						}

						if (var11.shorts_n[var2] < 0) {
							var7.z.b(-1);
						}

						if (~var7.T <= -1) {
							vf var8 = this.vfs_db[var1][var7.T];
							if (var8 != null && ~var8.int_p > -1) {
								this.vfs_rb[var1][var8.V] = null;
								var8.int_p = 0;
							}

							this.vfs_db[var1][var7.T] = var7;
						}

						this.Qb.tf_w.a(var7, var3 + 28);
						this.vfs_rb[var1][var2] = var7;
					}
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "sh.U(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	private void b(int var1, int var2, byte var3) {
		try {
			++y;
			if (var3 != -9) {
				this.a((vf) null, (byte) -108);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.MA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private void a(boolean var1, int var2, int var3, int var4) {
		try {
			++int_mb;
			if (!var1) {
				this.c();
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "sh.V(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	private void b(int var1, int var2, int var3) {
		try {
			this.Q[var1] = var2;
			++K;
			this.S[var1] = (int) (0.5D + 2097152.0D * Math.pow(2.0D, (double) var2 * 5.4931640625E-4D));
			if (var3 != 2795) {
				this.a(-13, 123, 61, -58);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.EA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private void e(int var1) {
		int var7 = client.int_gc;

		try {
			++int_vb;
			int var2 = this.Nb;
			long var4 = this.Pb;
			int var3 = this.Mb;
			if (var7 == 0) {
				if (this.Mb != var3) {
					this.Mb = var3;
					this.Nb = var2;
					this.Pb = var4;
					if (var1 != 0) {
						this.ints_t = null;
						return;
					}

					return;
				}

				while (var3 != this.V.ints_f[var2]) {
					var2 = this.V.c();
					var3 = this.V.ints_f[var2];
					var4 = this.V.f(var3);
					if (this.Mb != var3) {
						this.Mb = var3;
						this.Nb = var2;
						this.Pb = var4;
						if (var1 != 0) {
							this.ints_t = null;
							return;
						}

						return;
					}
				}
			}

			while (true) {
				this.V.c(var2);
				int var6 = this.V.a(var2);
				if (var6 == 1) {
					this.V.e();
					this.V.d(var2);
					if (this.V.g()) {
						if (!this.Lb || ~var3 == -1) {
							break;
						}

						this.V.a(var4);
						if (var7 != 0) {
							break;
						}
					}

					var2 = this.V.c();
					var3 = this.V.ints_f[var2];
					var4 = this.V.f(var3);
					if (this.Mb != var3) {
						this.Mb = var3;
						this.Nb = var2;
						this.Pb = var4;
						if (var1 != 0) {
							this.ints_t = null;
							return;
						}

						return;
					}
				} else {
					if ((128 & var6) != 0) {
						this.c(var1 ^ -108, var6);
					}

					this.V.b(var2);
					this.V.d(var2);
				}

				while (var3 != this.V.ints_f[var2]) {
					var2 = this.V.c();
					var3 = this.V.ints_f[var2];
					var4 = this.V.f(var3);
					if (this.Mb != var3) {
						this.Mb = var3;
						this.Nb = var2;
						this.Pb = var4;
						if (var1 != 0) {
							this.ints_t = null;
							return;
						}

						return;
					}
				}
			}

			this.c(-59);
			this.V.a();
		} catch (RuntimeException var8) {
			throw ec.a(var8, "sh.Q(" + var1 + ')');
		}
	}

	final synchronized void c(int var1, int var2, int var3) {
		try {
			this.a(9, true, 128);
			++x;
			if (var2 != 16) {
				this.c(-64);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.DA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private void c(int var1, int var2) {
		int var8 = client.int_gc;

		try {
			if (var1 < -85) {
				++R;
				int var3 = 240 & var2;
				int var4;
				int var5;
				int var6;
				if (var3 == 128) {
					var5 = 127 & var2 >> 3560488;
					var6 = (var2 & 8380232) >> -507392080;
					var4 = var2 & 15;
					this.a(var4, var5, -110, var6);
				} else if (~var3 == -145) {
					var4 = var2 & 15;
					var5 = (32542 & var2) >> 1780957544;
					var6 = var2 >> -697716368 & 127;
					if (var6 <= 0) {
						this.a(var4, var5, 122, 64);
					} else {
						this.a(var4, var5, (byte) -28, var6);
					}
				} else if (~var3 == -161) {
					var4 = var2 & 15;
					var6 = (8334709 & var2) >> -158232752;
					var5 = var2 >> 296842088 & 127;
					this.a(true, var5, var4, var6);
				} else if (var3 != 176) {
					if (~var3 == -193) {
						var4 = var2 & 15;
						var5 = 127 & var2 >> 1492983432;
						this.a(-113, this.N[var4] - -var5, var4);
					} else if (~var3 == -209) {
						var4 = 15 & var2;
						var5 = (var2 & 32527) >> -712901496;
						this.b(var5, var4, (byte) -9);
					} else if (var3 == 224) {
						var4 = 15 & var2;
						var5 = (127 & var2 >> -1704325368) + ((var2 & 8323227) >> -370037047);
						this.a(var4, var5, (byte) -93);
					} else {
						var3 = var2 & 255;
						if (~var3 == -256) {
							this.c(-89);
						}
					}
				} else {
					var4 = var2 & 15;
					var5 = 127 & var2 >> 898787336;
					var6 = 127 & var2 >> -193154640;
					if (~var5 == -1) {
						this.N[var4] = sd.a(this.N[var4], -2080769) + (var6 << -1185174674);
					}

					if (var5 == 32) {
						this.N[var4] = (var6 << -1638588793) + sd.a(-16257, this.N[var4]);
					}

					if (var5 == 1) {
						this.E[var4] = sd.a(-16257, this.E[var4]) + (var6 << 1867342439);
					}

					if (var5 == 33) {
						this.E[var4] = sd.a(this.E[var4], -128) + var6;
					}

					if (~var5 == -6) {
						this.ints_t[var4] = sd.a(this.ints_t[var4], -16257) - -(var6 << 564716743);
					}

					if (~var5 == -38) {
						this.ints_t[var4] = sd.a(-128, this.ints_t[var4]) + var6;
					}

					if (~var5 == -8) {
						this.ints_u[var4] = sd.a(this.ints_u[var4], -16257) + (var6 << 287743335);
					}

					if (~var5 == -40) {
						this.ints_u[var4] = var6 + sd.a(-128, this.ints_u[var4]);
					}

					if (~var5 == -11) {
						this.F[var4] = (var6 << -1999304921) + sd.a(this.F[var4], -16257);
					}

					if (~var5 == -43) {
						this.F[var4] = var6 + sd.a(this.F[var4], -128);
					}

					if (var5 == 11) {
						this.A[var4] = (var6 << -1352670841) + sd.a(this.A[var4], -16257);
					}

					if (var5 == 43) {
						this.A[var4] = var6 + sd.a(-128, this.A[var4]);
					}

					if (~var5 == -65) {
						label155:
						{
							if (var6 >= 64) {
								this.ints_lb[var4] = d.c(this.ints_lb[var4], 1);
								if (var8 == 0) {
									break label155;
								}
							}

							this.ints_lb[var4] = sd.a(this.ints_lb[var4], -2);
						}
					}

					if (var5 == 65) {
						label149:
						{
							if (~var6 <= -65) {
								this.ints_lb[var4] = d.c(this.ints_lb[var4], 2);
								if (var8 == 0) {
									break label149;
								}
							}

							this.b(51, var4);
							this.ints_lb[var4] = sd.a(this.ints_lb[var4], -3);
						}
					}

					if (~var5 == -100) {
						this.Hb[var4] = (var6 << -1300144825) + sd.a(127, this.Hb[var4]);
					}

					if (~var5 == -99) {
						this.Hb[var4] = sd.a(this.Hb[var4], 16256) - -var6;
					}

					if (~var5 == -102) {
						this.Hb[var4] = (var6 << -1763471065) + sd.a(127, this.Hb[var4]) + 16384;
					}

					if (var5 == 100) {
						this.Hb[var4] = sd.a(16256, this.Hb[var4]) + 16384 - -var6;
					}

					if (var5 == 120) {
						this.d(0, var4);
					}

					if (~var5 == -122) {
						this.a((byte) -117, var4);
					}

					if (~var5 == -124) {
						this.a(var4, 0);
					}

					int var7;
					if (~var5 == -7) {
						var7 = this.Hb[var4];
						if (var7 == 16384) {
							this.T[var4] = sd.a(this.T[var4], -16257) - -(var6 << 697961799);
						}
					}

					if (var5 == 38) {
						var7 = this.Hb[var4];
						if (var7 == 16384) {
							this.T[var4] = var6 + sd.a(-128, this.T[var4]);
						}
					}

					if (var5 == 16) {
						this.ints_r[var4] = (var6 << 386995207) + sd.a(this.ints_r[var4], -16257);
					}

					if (~var5 == -49) {
						this.ints_r[var4] = sd.a(this.ints_r[var4], -128) - -var6;
					}

					if (~var5 == -82) {
						label127:
						{
							if (~var6 > -65) {
								this.e(var4, 128);
								this.ints_lb[var4] = sd.a(this.ints_lb[var4], -5);
								if (var8 == 0) {
									break label127;
								}
							}

							this.ints_lb[var4] = d.c(this.ints_lb[var4], 4);
						}
					}

					if (var5 == 17) {
						this.b(var4, (this.Q[var4] & -16257) - -(var6 << 1408065863), 2795);
					}

					if (~var5 == -50) {
						this.b(var4, var6 + (this.Q[var4] & -128), 2795);
					}

				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "sh.K(" + var1 + ',' + var2 + ')');
		}
	}

	private void d(int var1, int var2) {
		int var4 = client.int_gc;

		try {
			++Db;
			vf var3 = (vf) this.Qb.tf_w.c(27);
			if (var1 != 0) {
				this.S = null;
				if (var4 == 0 && var3 == null) {
					return;
				}
			} else if (var3 == null) {
				return;
			}

			do {
				if (var3 != null && (var2 < 9 || var3.Q == var2)) {
					if (var3.z != null) {
						var3.z.g(cb.sampleRate / 100);
						if (var3.z.g()) {
							this.Qb.H.a(var3.z);
						}

						var3.c((byte) 113);
					}

					if (var3.int_p < 0) {
						this.vfs_rb[var3.Q][var3.V] = null;
					}

					var3.a(true);
				}

				var3 = (vf) this.Qb.tf_w.d(-1);
			} while (var3 != null);

		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.NA(" + var1 + ',' + var2 + ')');
		}
	}

	private void e(int var1, int var2) {
		int var4 = client.int_gc;

		try {
			++H;
			if ((this.ints_lb[var1] & 4) != 0) {
				vf var3 = (vf) this.Qb.tf_w.c(var2 ^ 245);
				if (var4 != 0 || var3 != null) {
					do {
						if (~var1 == ~var3.Q) {
							var3.K = 0;
						}

						var3 = (vf) this.Qb.tf_w.d(-1);
					} while (var3 != null);
				}
			}

			if (var2 != 128) {
				this.f((byte) -62);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "sh.N(" + var1 + ',' + var2 + ')');
		}
	}

	final synchronized void a(int var1, byte var2) {
		try {
			this.Z = var1;
			if (var2 != -34) {
				this.Hb = null;
			}

			++int_ab;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sh.AA(" + var1 + ',' + var2 + ')');
		}
	}

	private int b(vf var1, byte var2) {
		try {
			++int_eb;
			int var3 = var1.int_o + (var1.int_v * var1.P >> -1913098676);
			ne var4 = var1.W;
			var3 += (-8192 + this.G[var1.Q]) * this.T[var1.Q] >> 381902828;
			int var5;
			if (var4.int_a > 0 && (~var4.int_g < -1 || this.E[var1.Q] > 0)) {
				int var6 = var4.int_o << -179638623;
				var5 = var4.int_g << -614127550;
				if (var1.R < var6) {
					var5 = var5 * var1.R / var6;
				}

				var5 += this.E[var1.Q] >> -653216633;
				double var7 = Math.sin(0.01227184630308513D * (double) (511 & var1.y));
				var3 += (int) (var7 * (double) var5);
			}

			if (var2 != 37) {
				this.O = null;
			}

			var5 = (int) ((double) (var1.G.int_s * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double) var3) / (double) cb.sampleRate + 0.5D);
			return var5 >= 1 ? var5 : 1;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "sh.S(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final boolean b(byte var1, vf var2) {
		try {
			if (var1 < 41) {
				a(-59L, 83);
			}

			++int_bb;
			if (var2.z == null) {
				if (var2.int_p >= 0) {
					var2.a(true);
					if (var2.T > 0 && this.vfs_db[var2.Q][var2.T] == var2) {
						this.vfs_db[var2.Q][var2.T] = null;
					}
				}

				return true;
			} else {
				return false;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "sh.J(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final synchronized void f(byte var1) {
		try {
			++int_ib;
			this.V.a();
			this.c(-106);
			if (var1 <= 20) {
				this.ints_u = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "sh.CA(" + var1 + ')');
		}
	}

	public sh() {
		try {
			this.O = new eh(128);
			this.c(-123);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "sh.<init>(" + ')');
		}
	}

	static {
		Jb = Gb;
	}
}
