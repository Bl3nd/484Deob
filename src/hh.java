final class hh extends ph {

	static int G;
	static int H;
	static lf J;
	private int[] K = new int[]{-1, -1, -1, -1, -1};
	static lf L;
	static int M = 0;
	static int N;
	static int O;
	private int[] P;
	private static lf Q = dd.a("glow3:", 2);
	int R = -1;
	static int S;
	boolean T = false;
	static int U;
	static lf V;
	static kf W;
	private short[] X;
	static int Y;
	static int Z;
	private short[] shorts_ab;
	private static lf lf_bb;
	private short[] shorts_cb;
	static int[] ints_db;
	private short[] shorts_eb;
	static int[] ints_fb;
	static int int_gb;

	static final long a(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		return var3 != null && var3.D != null ? var3.D.long_l : 0L;
	}

	final oe d(byte var1) {
		int var7 = client.int_gc;

		try {
			++U;
			oe[] var2 = new oe[5];
			if (var1 != -62) {
				J = null;
			}

			int var3 = 0;
			int var4 = 0;
			if (var7 != 0) {
				if (~this.K[var4] != 0) {
					var2[var3++] = oe.a(me.z, this.K[var4], 0);
				}

				++var4;
			}

			for (; ~var4 > -6; ++var4) {
				if (~this.K[var4] != 0) {
					var2[var3++] = oe.a(me.z, this.K[var4], 0);
				}
			}

			oe var5 = new oe(var2, var3);
			int var6;
			if (this.X != null) {
				var6 = 0;
				if (var7 != 0 || this.X.length > var6) {
					do {
						var5.a(this.X[var6], this.shorts_cb[var6]);
						++var6;
					} while (this.X.length > var6);
				}
			}

			if (this.shorts_ab != null) {
				var6 = 0;
				if (var7 != 0 || var6 < this.shorts_ab.length) {
					do {
						var5.b(this.shorts_ab[var6], this.shorts_eb[var6]);
						++var6;
					} while (var6 < this.shorts_ab.length);
				}
			}

			return var5;
		} catch (RuntimeException var8) {
			throw ec.a(var8, "hh.J(" + var1 + ')');
		}
	}

	final oe b(int var1) {
		int var6 = client.int_gc;

		try {
			++N;
			if (this.P == null) {
				return null;
			} else {
				oe[] var2 = new oe[this.P.length];
				int var3 = var1;
				if (var6 != 0) {
					var2[var1] = oe.a(me.z, this.P[var1], 0);
					var3 = var1 + 1;
				}

				while (var3 < this.P.length) {
					var2[var3] = oe.a(me.z, this.P[var3], 0);
					++var3;
				}

				oe var4;
				label51:
				{
					if (var2.length != 1) {
						var4 = new oe(var2, var2.length);
						if (var6 == 0) {
							break label51;
						}
					}

					var4 = var2[0];
				}

				int var5;
				if (this.X != null) {
					var5 = 0;
					if (var6 != 0 || var5 < this.X.length) {
						do {
							var4.a(this.X[var5], this.shorts_cb[var5]);
							++var5;
						} while (var5 < this.X.length);
					}
				}

				if (this.shorts_ab != null) {
					var5 = 0;
					if (var6 != 0 || ~var5 > ~this.shorts_ab.length) {
						do {
							var4.b(this.shorts_ab[var5], this.shorts_eb[var5]);
							++var5;
						} while (~var5 > ~this.shorts_ab.length);
					}
				}

				return var4;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "hh.G(" + var1 + ')');
		}
	}

	private final void a(int var1, int var2, ja var3) {
		int var6 = client.int_gc;

		try {
			++H;
			if (var2 == 0) {
				if (~var1 == -2) {
					this.R = var3.j((byte) 117);
				} else {
					int var4;
					int var5;
					if (~var1 != -3) {
						if (~var1 == -4) {
							this.T = true;
						} else {
							if (~var1 != -41) {
								if (var1 == 41) {
									var4 = var3.j((byte) 109);
									this.shorts_ab = new short[var4];
									this.shorts_eb = new short[var4];
									var5 = 0;
									if (var6 == 0 && var5 >= var4) {
										return;
									}

									do {
										this.shorts_ab[var5] = (short) var3.b(true);
										this.shorts_eb[var5] = (short) var3.b(true);
										++var5;
									} while (var5 < var4);

									return;
								}

								if (var1 >= 60 && var1 < 70) {
									this.K[-60 + var1] = var3.b(true);
									return;
								}
							} else {
								var4 = var3.j((byte) 89);
								this.X = new short[var4];
								this.shorts_cb = new short[var4];
								var5 = 0;
								if (var6 != 0 || ~var5 > ~var4) {
									do {
										this.X[var5] = (short) var3.b(true);
										this.shorts_cb[var5] = (short) var3.b(true);
										++var5;
									} while (~var5 > ~var4);
								}
							}

						}
					} else {
						var4 = var3.j((byte) 92);
						this.P = new int[var4];
						var5 = 0;
						if (var6 != 0 || var4 > var5) {
							do {
								this.P[var5] = var3.b(true);
								++var5;
							} while (var4 > var5);

						}
					}
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "hh.H(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean b(boolean var1) {
		int var4 = client.int_gc;

		try {
			++O;
			if (this.P == null) {
				return true;
			} else {
				boolean var2 = true;
				if (var1) {
					this.R = -91;
				}

				int var3 = 0;
				if (var4 == 0 && var3 >= this.P.length) {
					return var2;
				} else {
					do {
						if (!me.z.d(0, this.P[var3], -113)) {
							var2 = false;
						}

						++var3;
					} while (var3 < this.P.length);

					return var2;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "hh.I(" + var1 + ')');
		}
	}

	public static void e(byte var0) {
		try {
			L = null;
			Q = null;
			ints_db = null;
			lf_bb = null;
			W = null;
			V = null;
			if (var0 == -15) {
				ints_fb = null;
				J = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "hh.D(" + var0 + ')');
		}
	}

	final boolean c(int var1) {
		int var4 = client.int_gc;

		try {
			++Z;
			boolean var2 = true;
			int var3 = 0;
			if (var4 == 0 && ~var3 <= -6) {
				if (var1 != -1) {
					this.shorts_eb = null;
				}

				return var2;
			} else {
				do {
					if (~this.K[var3] != 0 && !me.z.d(0, this.K[var3], -121)) {
						var2 = false;
					}

					++var3;
				} while (~var3 > -6);

				if (var1 != -1) {
					this.shorts_eb = null;
				}

				return var2;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "hh.E(" + var1 + ')');
		}
	}

	final void a(int var1, ja var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var2.j((byte) 116);
				if (var3 == 0) {
					break;
				}

				this.a(var3, 0, var2);
			} while (var4 == 0);

			++Y;
			if (var1 != 60) {
				this.shorts_cb = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "hh.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(boolean var0, int var1, int var2, int var3, vg var4) {
		try {
			label22:
			{
				if (di.V < 3) {
					ea.kf_i.b(var2, var3, var4.int_ob, var4.Ib, ea.kf_i.Q / 2, ea.kf_i.P / 2, h.int_l, 256, var4.ints_a, var4.ints_jb);
					if (client.int_gc == 0) {
						break label22;
					}
				}

				b.a(var2, var3, 0, var4.ints_a, var4.ints_jb);
			}

			++S;
			ub.V[var1] = var0;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "hh.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	static final void f(byte var0) {
		int var9 = client.int_gc;

		try {
			++G;
			mc.a(tg.W, -23101);
			++n.int_i;
			if (fa.Q && cf.L) {
				int var1 = c.int_bb;
				int var2 = lf.int_c;
				var2 -= ph.E;
				var1 -= rd.G;
				if (var0 != 121) {
					f((byte) 31);
				}

				if (~v.int_nb < ~var2) {
					var2 = v.int_nb;
				}

				if (c.V > var1) {
					var1 = c.V;
				}

				if (ee.Q.Ib + v.int_nb < var2 + tg.W.Ib) {
					var2 = ee.Q.Ib + (v.int_nb - tg.W.Ib);
				}

				if (var1 + tg.W.int_ob > ee.Q.int_ob + c.V) {
					var1 = -tg.W.int_ob + c.V + ee.Q.int_ob;
				}

				int var4 = -hb.int_g + var2;
				int var3 = -p.Dc + var1;
				int var6 = var1 + -c.V + ee.Q.int_c;
				int var5 = tg.W.int_qb;
				if (~n.int_i < ~tg.W.int_fb && (~var5 > ~var3 || ~(-var5) < ~var3 || var5 < var4 || ~(-var5) < ~var4)) {
					p.Hc = true;
				}

				int var7 = -v.int_nb + var2 + ee.Q.Ac;
				id var8;
				if (tg.W.objects_vc != null && p.Hc) {
					var8 = new id();
					var8.vg_o = tg.W;
					var8.objects_t = tg.W.objects_vc;
					var8.G = var6;
					var8.int_r = var7;
					ea.a(24087, var8);
				}

				if (~wd.int_eb == -1) {
					label98:
					{
						if (!p.Hc) {
							if ((ne.int_e == 1 || cg.b(-1159860534, qa.int_eb + -1)) && ~qa.int_eb < -3) {
								nf.a((byte) -128);
								if (var9 == 0) {
									break label98;
								}
							}

							if (qa.int_eb <= 0) {
								break label98;
							}

							af.b((byte) 116, qa.int_eb + -1);
							if (var9 == 0) {
								break label98;
							}
						}

						if (tg.W.Ic != null) {
							var8 = new id();
							var8.objects_t = tg.W.Ic;
							var8.int_r = var7;
							var8.vg_p = eg.vg_a;
							var8.G = var6;
							var8.vg_o = tg.W;
							ea.a(24087, var8);
						}

						if (eg.vg_a != null && ac.a(true, tg.W) != null) {
							++uc.int_hb;
							vg.J.e((byte) 94, 161);
							vg.J.b((byte) 117, eg.vg_a.Z);
							vg.J.b(eg.vg_a.Hb, true);
							vg.J.b((byte) 117, tg.W.Z);
							vg.J.b(tg.W.Hb, true);
						}
					}

					tg.W = null;
				}
			} else {
				if (~n.int_i < -2) {
					tg.W = null;
				}

			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "hh.B(" + var0 + ')');
		}
	}

	static {
		L = Q;
		J = Q;
		lf_bb = dd.a("Drop", 2);
		int_gb = 0;
		V = lf_bb;
		ints_db = new int[32];
	}
}
