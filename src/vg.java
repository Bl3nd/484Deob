final class vg {

	int[] ints_a;
	int int_b = 0;
	int int_c;
	lf lf_d;
	int[] ints_e;
	static int int_f;
	lf lf_g;
	int int_h;
	int int_i;
	int int_j;
	int int_k;
	int int_l;
	int int_m = 0;
	int int_n;
	static int int_o;
	int[] ints_p;
	Object[] objects_q;
	Object[] objects_r;
	int[][] ints_s;
	private int int_t;
	Object[] objects_u;
	int int_v;
	boolean boolean_w;
	int x;
	int y;
	int z;
	vg A;
	boolean B;
	int C;
	static int D;
	boolean E;
	Object[] F;
	int G;
	lf H;
	Object[] I;
	static wa J = new wa(5000);
	boolean K;
	static int L;
	boolean M;
	int N;
	int O;
	int P;
	int Q;
	static lf R = dd.a("Welt", 2);
	static int S;
	Object[] T;
	Object[] U;
	int V;
	int W;
	int[] X;
	int Y;
	int Z;
	int int_ab;
	int int_bb;
	lf[] lfs_cb;
	int[] ints_db;
	int[] ints_eb;
	int int_fb;
	int int_gb;
	int int_hb;
	int int_ib;
	int[] ints_jb;
	int int_kb;
	Object[] objects_lb;
	int[] ints_mb;
	int int_nb;
	int int_ob;
	Object[] objects_pb;
	int int_qb;
	int[] ints_rb;
	Object[] objects_sb;
	boolean boolean_tb;
	static int int_ub;
	static int int_vb;
	Object[] objects_wb;
	boolean xb;
	Object[] yb;
	static lf zb = dd.a("Untersuchen", 2);
	int Ab;
	lf Bb;
	Object[] Cb;
	int Db;
	int Eb;
	vg[] Fb;
	private int Gb;
	int Hb;
	int Ib;
	static int Jb;
	int Kb;
	static lf mapscene = dd.a("mapscene", 2);
	Object[] Mb;
	int Nb;
	int Ob;
	int Pb;
	int Qb;
	boolean Rb;
	Object[] Sb;
	int Tb;
	int[] Ub;
	static int Vb;
	Object[] Wb;
	int Xb;
	Object[] Yb;
	int Zb;
	int int_ac;
	int int_bc;
	boolean boolean_cc;
	int int_dc;
	lf lf_ec;
	int int_fc;
	int[] ints_gc;
	int[] ints_hc;
	int int_ic;
	static int int_jc;
	int int_kc;
	Object[] objects_lc;
	int int_mc;
	boolean boolean_nc;
	Object[] objects_oc;
	Object[] objects_pc;
	Object[] objects_qc;
	int int_rc;
	Object[] objects_sc;
	int int_tc;
	int int_uc;
	Object[] objects_vc;
	static int int_wc;
	int xc;
	boolean yc;
	lf[] zc;
	int Ac;
	boolean Bc;
	Object[] Cc;
	int Dc;
	int Ec;
	lf Fc;
	static int Gc;
	Object[] Hc;
	Object[] Ic;
	static int[] Jc = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
	static h Kc;
	static int[] Lc = new int[100];
	static boolean[] Mc = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false};

	final ue a(boolean var1, int var2, be var3, byte var4, bi var5) {
		try {
			hg.boolean_o = false;
			++int_wc;
			if (var4 <= 86) {
				return null;
			} else {
				int var6;
				int var7;
				label91:
				{
					if (var1) {
						var6 = this.int_t;
						var7 = this.Gb;
						if (client.int_gc == 0) {
							break label91;
						}
					}

					var6 = this.Eb;
					var7 = this.int_mc;
				}

				if (var6 == 0) {
					return null;
				} else if (~var6 == -2 && var7 == -1) {
					return null;
				} else {
					ue var8;
					if (var6 == 1) {
						var8 = (ue) bd.rc_g.a((long) (var7 + (var6 << -416139760)), (int) -107);
						if (var8 == null) {
							oe var12 = oe.a(cc.cache7, var7, 0);
							if (var12 == null) {
								hg.boolean_o = true;
								return null;
							}

							var8 = var12.a(64, 768, -50, -10, -50, true, true);
						}

						bd.rc_g.a((long) ((var6 << -572063920) - -var7), -123, var8);
						if (var5 != null) {
							var8 = var5.a(var8, var2, 516678064);
						}

						return var8;
					} else if (~var6 == -3) {
						var8 = uh.a((byte) -99, var7).a((byte) 22, var2, (bi) var5);
						if (var8 == null) {
							hg.boolean_o = true;
							return null;
						} else {
							return var8;
						}
					} else if (var6 == 3) {
						if (var3 == null) {
							return null;
						} else {
							var8 = var3.a(1073741823, var5, var2);
							if (var8 == null) {
								hg.boolean_o = true;
								return null;
							} else {
								return var8;
							}
						}
					} else if (~var6 == -5) {
						ie var11 = ng.a(var7, (int) -4);
						ue var9 = var11.a(-90, var5, var2, 10);
						if (var9 == null) {
							hg.boolean_o = true;
							return null;
						} else {
							return var9;
						}
					} else if (var6 == 6) {
						var8 = uh.a((byte) -99, var7).a(-107, var5, 0, var2, (bi) null);
						if (var8 == null) {
							hg.boolean_o = true;
							return null;
						} else {
							return var8;
						}
					} else {
						return null;
					}
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "vg.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean a(int var1) {
		int var8 = client.int_gc;

		try {
			++int_f;
			if (this.ints_a != null) {
				return true;
			} else {
				df var2 = rd.a(this.int_fc, false, 0, nd.cache8);
				if (var2 == null) {
					return false;
				} else {
					var2.d();
					this.ints_jb = new int[var2.S];
					this.ints_a = new int[var2.S];
					if (var1 <= 92) {
						this.b(-6, (ja) null);
					}

					int var3 = 0;
					if (var8 == 0 && ~var2.S >= ~var3) {
						return true;
					} else {
						do {
							int var4 = 0;
							int var5 = var2.N;
							int var6 = 0;
							if (var8 != 0 || var6 < var2.N) {
								do {
									if (var2.O[var6 - -(var2.N * var3)] == 0) {
										var4 = var6;
										if (var8 == 0) {
											break;
										}
									}

									++var6;
								} while (var6 < var2.N);
							}

							int var7 = var4;
							if (var8 != 0 || ~var2.N < ~var4) {
								do {
									if (var2.O[var3 * var2.N + var7] != 0) {
										var5 = var7;
										if (var8 == 0) {
											break;
										}
									}

									++var7;
								} while (~var2.N < ~var7);
							}

							this.ints_a[var3] = var4;
							this.ints_jb[var3] = var5 + -var4;
							++var3;
						} while (~var2.S < ~var3);

						return true;
					}
				}
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "vg.D(" + var1 + ')');
		}
	}

	final void a(int var1, int var2, lf var3) {
		int var6 = client.int_gc;

		try {
			if (var2 >= -3) {
				this.a(false, 60, (be) null, (byte) 110, (bi) null);
			}

			++int_ub;
			if (this.lfs_cb == null || ~var1 <= ~this.lfs_cb.length) {
				lf[] var4 = new lf[var1 + 1];
				if (this.lfs_cb != null) {
					int var5 = 0;
					if (var6 != 0 || var5 < this.lfs_cb.length) {
						do {
							var4[var5] = this.lfs_cb[var5];
							++var5;
						} while (var5 < this.lfs_cb.length);
					}
				}

				this.lfs_cb = var4;
			}

			this.lfs_cb[var1] = var3;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "vg.H(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, byte var2, int var3) {
		try {
			if (var2 != 79) {
				a((byte) 109);
			}

			++int_jc;
			int var4 = this.ints_gc[var1];
			this.ints_gc[var1] = this.ints_gc[var3];
			this.ints_gc[var3] = var4;
			var4 = this.Ub[var1];
			this.Ub[var1] = this.Ub[var3];
			this.Ub[var3] = var4;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "vg.I(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	final void a(byte var1, ja var2) {
		int var12 = client.int_gc;

		try {
			label307:
			{
				++L;
				this.Bc = false;
				this.int_ib = var2.j((byte) 107);
				this.int_dc = var2.j((byte) 83);
				this.Xb = var2.b(true);
				this.int_l = this.int_k = var2.c(true);
				this.int_nb = this.int_rc = var2.c(true);
				this.int_ob = var2.b(true);
				this.Ib = var2.b(true);
				this.N = var2.j((byte) 79);
				this.int_bb = var2.b(true);
				if (this.int_bb != '\uffff') {
					this.int_bb = (this.Z & -65536) - -this.int_bb;
				} else {
					this.int_bb = -1;
				}
			}

			this.Pb = var2.b(true);
			if (~this.Pb == -65536) {
				this.Pb = -1;
			}

			int var3 = var2.j((byte) 107);
			int var4;
			if (var3 > 0) {
				this.ints_eb = new int[var3];
				this.ints_e = new int[var3];
				var4 = 0;
				if (var12 != 0 || ~var3 < ~var4) {
					do {
						this.ints_eb[var4] = var2.j((byte) 117);
						this.ints_e[var4] = var2.b(true);
						++var4;
					} while (~var3 < ~var4);
				}
			}

			var4 = var2.j((byte) 83);
			int var5;
			int var6;
			int var7;
			if (var4 > 0) {
				this.ints_s = new int[var4][];
				var5 = 0;
				if (var12 != 0 || var5 < var4) {
					do {
						var6 = var2.b(true);
						this.ints_s[var5] = new int[var6];
						var7 = 0;
						if (var12 == 0 && var7 >= var6) {
							++var5;
						} else {
							do {
								this.ints_s[var5][var7] = var2.b(true);
								if (this.ints_s[var5][var7] == '\uffff') {
									this.ints_s[var5][var7] = -1;
								}

								++var7;
							} while (var7 < var6);

							++var5;
						}
					} while (var5 < var4);
				}
			}

			if (~this.int_ib == -1) {
				this.G = var2.b(true);
				this.B = var2.j((byte) 121) == 1;
			}

			if (this.int_ib == 1) {
				var2.b(true);
				var2.j((byte) 81);
			}

			if (this.int_ib == 2) {
				this.Ub = new int[this.int_ob * this.Ib];
				this.ints_gc = new int[this.Ib * this.int_ob];
				var5 = var2.j((byte) 81);
				if (~var5 == -2) {
					this.Kb |= 268435456;
				}

				var6 = var2.j((byte) 94);
				if (var6 == 1) {
					this.Kb |= 1073741824;
				}

				var7 = var2.j((byte) 83);
				if (~var7 == -2) {
					this.Kb |= Integer.MIN_VALUE;
				}

				int var8 = var2.j((byte) 90);
				if (var8 == 1) {
					this.Kb |= 536870912;
				}

				this.int_m = var2.j((byte) 81);
				this.Dc = var2.j((byte) 122);
				this.ints_hc = new int[20];
				this.ints_rb = new int[20];
				this.ints_db = new int[20];
				int var9 = 0;
				int var10;
				if (var12 != 0 || var9 < 20) {
					do {
						label247:
						{
							var10 = var2.j((byte) 94);
							if (var10 != 1) {
								this.ints_hc[var9] = -1;
								if (var12 == 0) {
									break label247;
								}
							}

							this.ints_db[var9] = var2.c(true);
							this.ints_rb[var9] = var2.c(true);
							this.ints_hc[var9] = var2.l(15);
						}

						++var9;
					} while (var9 < 20);
				}

				this.zc = new lf[5];
				var10 = 0;
				if (var12 != 0 || var10 < 5) {
					do {
						lf var11 = var2.e((byte) 87);
						if (var11.e(-30593) > 0) {
							this.zc[var10] = var11;
							this.Kb |= 1 << var10 + 23;
						}

						++var10;
					} while (var10 < 5);
				}
			}

			if (this.int_ib == 3) {
				this.boolean_nc = var2.j((byte) 115) == 1;
			}

			if (~this.int_ib == -5 || this.int_ib == 1) {
				this.int_n = var2.j((byte) 79);
				this.int_v = var2.j((byte) 112);
				this.xc = var2.j((byte) 97);
				this.z = var2.b(true);
				if (this.z == '\uffff') {
					this.z = -1;
				}

				this.Rb = var2.j((byte) 87) == 1;
			}

			if (~this.int_ib == -5) {
				this.Fc = var2.e((byte) 87);
				this.Bb = var2.e((byte) 87);
			}

			if (~this.int_ib == -2 || ~this.int_ib == -4 || this.int_ib == 4) {
				this.C = var2.l(15);
			}

			if (this.int_ib == 3 || ~this.int_ib == -5) {
				this.Y = var2.l(15);
				this.y = var2.l(15);
				this.Qb = var2.l(15);
			}

			if (this.int_ib == 5) {
				this.int_fc = var2.l(15);
				this.W = var2.l(15);
			}

			if (var1 < 43) {
				this.b(-79, false);
			}

			if (~this.int_ib == -7) {
				this.Eb = 1;
				this.int_mc = var2.b(true);
				this.int_t = 1;
				if (~this.int_mc == -65536) {
					this.int_mc = -1;
				}

				this.Gb = var2.b(true);
				if (this.Gb == '\uffff') {
					this.Gb = -1;
				}

				this.Db = var2.b(true);
				if (~this.Db == -65536) {
					this.Db = -1;
				}

				this.Q = var2.b(true);
				if (~this.Q == -65536) {
					this.Q = -1;
				}

				this.Tb = var2.b(true);
				this.int_gb = var2.b(true);
				this.Ab = var2.b(true);
			}

			if (~this.int_ib == -8) {
				this.ints_gc = new int[this.int_ob * this.Ib];
				this.Ub = new int[this.int_ob * this.Ib];
				this.int_n = var2.j((byte) 75);
				this.z = var2.b(true);
				if (~this.z == -65536) {
					this.z = -1;
				}

				this.Rb = ~var2.j((byte) 97) == -2;
				this.C = var2.l(15);
				this.int_m = var2.c(true);
				this.Dc = var2.c(true);
				var5 = var2.j((byte) 69);
				if (~var5 == -2) {
					this.Kb |= 1073741824;
				}

				this.zc = new lf[5];
				var6 = 0;
				if (var12 != 0 || var6 < 5) {
					do {
						lf var14 = var2.e((byte) 87);
						if (var14.e(-30593) > 0) {
							this.zc[var6] = var14;
							this.Kb |= 1 << var6 + 23;
						}

						++var6;
					} while (var6 < 5);
				}
			}

			if (~this.int_ib == -9) {
				this.Fc = var2.e((byte) 87);
			}

			if (~this.int_dc == -3 || ~this.int_ib == -3) {
				this.H = var2.e((byte) 87);
				this.lf_ec = var2.e((byte) 87);
				var5 = var2.b(true) & 63;
				this.Kb |= var5 << -928554997;
			}

			if (this.int_dc == 1 || ~this.int_dc == -5 || this.int_dc == 5 || this.int_dc == 6) {
				this.lf_d = var2.e((byte) 87);
				if (~this.lf_d.e(-30593) == -1) {
					if (~this.int_dc == -2) {
						this.lf_d = jg.lf_w;
					}

					if (~this.int_dc == -5) {
						this.lf_d = he.G;
					}

					if (this.int_dc == 5) {
						this.lf_d = he.G;
					}

					if (this.int_dc == 6) {
						this.lf_d = me.lf_o;
					}
				}
			}

			if (this.int_dc == 1 || this.int_dc == 4 || this.int_dc == 5) {
				this.Kb |= 4194304;
			}

			if (this.int_dc == 6) {
				this.Kb |= 1;
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "vg.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, ja var2) {
		int var5 = client.int_gc;

		try {
			label122:
			{
				++S;
				var2.j((byte) 77);
				this.Bc = true;
				this.int_ib = var2.j((byte) 95);
				this.Xb = var2.b(true);
				this.int_l = this.int_k = var2.c(true);
				this.int_nb = this.int_rc = var2.c(true);
				this.int_ob = var2.b(true);
				if (~this.int_ib != -10) {
					this.Ib = var2.b(true);
				} else {
					this.Ib = var2.c(true);
				}
			}

			label117:
			{
				this.int_bb = var2.b(true);
				if (this.int_bb != '\uffff') {
					this.int_bb += this.Z & -65536;
				} else {
					this.int_bb = -1;
				}
			}

			this.B = ~var2.j((byte) 103) == -2;
			if (~this.int_ib == -1) {
				this.int_hb = var2.b(true);
				this.G = var2.b(true);
			}

			if (this.int_ib == 5) {
				this.int_fc = var2.l(15);
				this.V = var2.b(true);
				this.E = var2.j((byte) 118) == 1;
				this.N = var2.j((byte) 78);
				this.int_kc = var2.j((byte) 81);
				this.int_ic = var2.l(15);
				this.boolean_cc = ~var2.j((byte) 87) == -2;
				this.boolean_w = ~var2.j((byte) 107) == -2;
			}

			if (~this.int_ib == -7) {
				this.Eb = 1;
				this.int_mc = var2.b(true);
				if (~this.int_mc == -65536) {
					this.int_mc = -1;
				}

				this.int_i = var2.c(true);
				this.int_ab = var2.c(true);
				this.int_gb = var2.b(true);
				this.Ab = var2.b(true);
				this.Ob = var2.b(true);
				this.Tb = var2.b(true);
				this.Db = var2.b(true);
				if (this.Db == '\uffff') {
					this.Db = -1;
				}

				this.M = ~var2.j((byte) 100) == -2;
			}

			if (~this.int_ib == -5) {
				this.z = var2.b(true);
				if (this.z == '\uffff') {
					this.z = -1;
				}

				this.Fc = var2.e((byte) 87);
				this.xc = var2.j((byte) 90);
				this.int_n = var2.j((byte) 126);
				this.int_v = var2.j((byte) 117);
				this.Rb = var2.j((byte) 114) == 1;
				this.C = var2.l(var1 ^ 14);
			}

			if (~this.int_ib == -4) {
				this.C = var2.l(15);
				this.boolean_nc = var2.j((byte) 81) == 1;
				this.N = var2.j((byte) 97);
			}

			if (~this.int_ib == -10) {
				this.int_tc = var2.j((byte) 110);
				this.C = var2.l(var1 ^ 14);
			}

			this.Kb = var2.f((byte) 59);
			this.lf_g = var2.e((byte) 87);
			int var3 = var2.j((byte) 121);
			if (var3 > 0) {
				this.lfs_cb = new lf[var3];
				int var4 = 0;
				if (var5 != 0 || var3 > var4) {
					do {
						this.lfs_cb[var4] = var2.e((byte) 87);
						++var4;
					} while (var3 > var4);
				}
			}

			this.int_qb = var2.j((byte) 86);
			this.int_fb = var2.j((byte) 111);
			this.boolean_tb = var2.j((byte) 103) == var1;
			this.H = var2.e((byte) 87);
			this.Cb = this.a(var2, (byte) -31);
			this.I = this.a(var2, (byte) -58);
			this.objects_lb = this.a(var2, (byte) -54);
			this.objects_r = this.a(var2, (byte) -38);
			this.objects_lc = this.a(var2, (byte) -112);
			this.F = this.a(var2, (byte) -126);
			this.Hc = this.a(var2, (byte) -32);
			this.objects_oc = this.a(var2, (byte) -101);
			this.Cc = this.a(var2, (byte) -122);
			this.U = this.a(var2, (byte) -88);
			this.objects_u = this.a(var2, (byte) -113);
			this.yb = this.a(var2, (byte) -45);
			this.objects_pb = this.a(var2, (byte) -105);
			this.objects_sb = this.a(var2, (byte) -128);
			this.Yb = this.a(var2, (byte) -31);
			this.objects_vc = this.a(var2, (byte) -24);
			this.Ic = this.a(var2, (byte) -17);
			this.objects_sc = this.a(var2, (byte) -51);
			this.X = this.b(-63, var2);
			this.ints_p = this.b(-63, var2);
			this.ints_mb = this.b(-101, var2);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "vg.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	private final Object[] a(ja var1, byte var2) {
		int var7 = client.int_gc;

		try {
			++Jb;
			int var3 = var1.j((byte) 73);
			if (var3 == 0) {
				return null;
			} else {
				if (var2 >= -15) {
					this.E = true;
				}

				Object[] var4 = new Object[var3];
				int var5 = 0;
				if (var7 == 0 && ~var3 >= ~var5) {
					this.xb = true;
					return var4;
				} else {
					do {
						label34:
						{
							int var6 = var1.j((byte) 115);
							if (~var6 == -1) {
								var4[var5] = new Integer(var1.l(15));
							} else if (~var6 == -2) {
								var4[var5] = var1.e((byte) 87);
							}
						}

						++var5;
					} while (~var3 < ~var5);

					this.xb = true;
					return var4;
				}
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "vg.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final kf a(int var1, boolean var2) {
		try {
			int var3;
			label64:
			{
				hg.boolean_o = false;
				if (!var2) {
					var3 = this.int_fc;
					if (client.int_gc == 0) {
						break label64;
					}
				}

				var3 = this.W;
			}

			++int_vb;
			if (var1 <= 120) {
				this.b(80, (ja) null);
			}

			if (~var3 == 0) {
				return null;
			} else {
				long var4 = ((long) this.int_ic << 1954722216) + ((!this.boolean_cc ? 0L : 1L) << 2143509542) + (long) var3 + ((long) this.int_kc << 799712036) + ((!this.boolean_w ? 0L : 1L) << 1774496487);
				kf var6 = (kf) ha.y.a(var4, (int) -127);
				if (var6 != null) {
					return var6;
				} else {
					var6 = re.a(0, var3, (byte) 114, nd.cache8);
					if (var6 == null) {
						hg.boolean_o = true;
						return null;
					} else {
						if (this.boolean_cc) {
							var6.h();
						}

						if (this.boolean_w) {
							var6.e();
						}

						if (this.int_kc > 0) {
							var6.b(this.int_kc);
						}

						if (this.int_kc >= 1) {
							var6.d(1);
						}

						if (this.int_kc >= 2) {
							var6.d(16777215);
						}

						if (this.int_ic != 0) {
							var6.c(this.int_ic);
						}

						ha.y.a(var4, 97, var6);
						return var6;
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "vg.K(" + var1 + ',' + var2 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			mapscene = null;
			Kc = null;
			Jc = null;
			zb = null;
			Mc = null;
			Lc = null;
			J = null;
			R = null;
			if (var0 < 35) {
				a((byte) 28);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "vg.C(" + var0 + ')');
		}
	}

	final db a(boolean var1, df[] var2) {
		try {
			hg.boolean_o = var1;
			++D;
			if (this.z == -1) {
				return null;
			} else {
				db var3 = (db) ag.rc_c.a((long) this.z, (int) -127);
				if (var3 != null) {
					return var3;
				} else {
					var3 = je.a((byte) -102, this.z, 0, nd.cache8, se.cache13);
					if (var3 != null) {
						var3.a(var2, (int[]) null);
						ag.rc_c.a((long) this.z, -118, var3);
						if (client.int_gc == 0) {
							return var3;
						}
					}

					hg.boolean_o = true;
					return var3;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "vg.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	final kf b(int var1, boolean var2) {
		try {
			++Vb;
			hg.boolean_o = false;
			if (~var1 <= -1 && ~this.ints_hc.length < ~var1) {
				if (!var2) {
					return null;
				} else {
					int var3 = this.ints_hc[var1];
					if (~var3 == 0) {
						return null;
					} else {
						kf var4 = (kf) ha.y.a((long) var3, (int) -103);
						if (var4 != null) {
							return var4;
						} else {
							var4 = re.a(0, var3, (byte) 59, nd.cache8);
							if (var4 == null) {
								hg.boolean_o = true;
								if (client.int_gc == 0) {
									return var4;
								}
							}

							ha.y.a((long) var3, 88, var4);
							return var4;
						}
					}
				}
			} else {
				return null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "vg.F(" + var1 + ',' + var2 + ')');
		}
	}

	private final int[] b(int var1, ja var2) {
		int var6 = client.int_gc;

		try {
			++int_o;
			int var3 = var2.j((byte) 96);
			if (var3 == 0) {
				return null;
			} else {
				int[] var4 = new int[var3];
				int var5 = 0;
				if (var6 != 0) {
					var4[var5] = var2.l(15);
					++var5;
				}

				while (var3 > var5) {
					var4[var5] = var2.l(15);
					++var5;
				}

				if (var1 > -62) {
					this.int_gb = -62;
				}

				return var4;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "vg.J(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public vg() {
		this.lf_d = jg.lf_w;
		this.x = 0;
		this.lf_g = se.lf_kb;
		this.int_v = 0;
		this.int_j = -1;
		this.N = 0;
		this.G = 0;
		this.H = se.lf_kb;
		this.int_fb = 0;
		this.int_l = 0;
		this.M = false;
		this.int_qb = 0;
		this.int_k = 0;
		this.W = -1;
		this.Q = -1;
		this.int_n = 0;
		this.int_h = 0;
		this.boolean_tb = false;
		this.int_ob = 0;
		this.K = false;
		this.int_gb = 0;
		this.P = 0;
		this.Hb = -1;
		this.V = 0;
		this.C = 0;
		this.Ob = 0;
		this.E = false;
		this.int_i = 0;
		this.Db = -1;
		this.y = 0;
		this.z = -1;
		this.Kb = 0;
		this.int_bb = -1;
		this.Gb = -1;
		this.Eb = 1;
		this.Bb = se.lf_kb;
		this.int_bc = -1;
		this.int_fc = -1;
		this.int_t = 1;
		this.Xb = 0;
		this.O = -1;
		this.lf_ec = se.lf_kb;
		this.Pb = -1;
		this.B = false;
		this.int_mc = -1;
		this.int_hb = 0;
		this.Ib = 0;
		this.xb = false;
		this.int_tc = 1;
		this.Zb = 0;
		this.int_c = 0;
		this.Rb = false;
		this.Qb = 0;
		this.int_ab = 0;
		this.Y = 0;
		this.int_ac = 0;
		this.int_rc = 0;
		this.int_ic = 0;
		this.int_kb = 0;
		this.Z = -1;
		this.A = null;
		this.xc = 0;
		this.Ac = 0;
		this.yc = false;
		this.Dc = 0;
		this.Ab = 0;
		this.Ec = 0;
		this.boolean_nc = false;
		this.Nb = -1;
		this.int_nb = 0;
		this.int_uc = 0;
		this.Fc = se.lf_kb;
		this.Tb = 100;
		this.int_dc = 0;
		this.int_kc = 0;
		this.Bc = false;
	}
}
