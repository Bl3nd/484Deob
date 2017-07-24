abstract class j extends hb {

	static int int_n;
	static int int_o;
	static int int_p;
	jh jh_q;
	static int int_r;
	static int int_s;
	static int int_t;
	static int int_u;
	static lf lf_v = dd.a("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", 2);
	static int int_w;
	boolean x;
	static int y;
	static pd z = new pd();
	int A;
	int B;
	static int C;
	static int D;
	static cb E;
	static int F;
	j[] G;
	ma H;
	static int I;
	private static lf J = dd.a("flash1:", 2);
	static lf K;
	static lf L;
	static int M;
	static int N;
	static lf O;
	static int P;

	static final void a(int var0, long var1) {
		int var6 = client.int_gc;

		try {
			++I;
			if (var1 != 0L) {
				if ((vf.int_t < 100 || ~ig.int_s == -2) && ~vf.int_t > -201) {
					lf var3 = of.a((byte) 84, var1).e(true);
					int var4 = 0;
					if (var6 != 0) {
						if (lf.C[var4] == var1) {
							kd.a(sh.Gb, false, de.a(new lf[]{var3, bi.lf_cb}, 124), 0);
							return;
						}

						++var4;
					}

					while (~vf.int_t < ~var4) {
						if (lf.C[var4] == var1) {
							kd.a(sh.Gb, false, de.a(new lf[]{var3, bi.lf_cb}, 124), 0);
							return;
						}

						++var4;
					}

					if (var0 > 48) {
						int var5 = 0;
						if (var6 != 0) {
							if (var1 == id.longs_n[var5]) {
								kd.a(sh.Gb, false, de.a(new lf[]{wh.lf_j, var3, jc.x}, -117), 0);
								return;
							}

							++var5;
						}

						while (bh.int_ob > var5) {
							if (var1 == id.longs_n[var5]) {
								kd.a(sh.Gb, false, de.a(new lf[]{wh.lf_j, var3, jc.x}, -117), 0);
								return;
							}

							++var5;
						}

						if (var3.e(r.X.Dc, -1)) {
							kd.a(sh.Gb, false, tb.U, 0);
						} else {
							mb.y[vf.int_t] = var3;
							lf.C[vf.int_t] = var1;
							++int_r;
							jh.ints_t[vf.int_t] = 0;
							pc.ints_c[vf.int_t] = 0;
							++vf.int_t;
							ld.int_db = hf.int_p;
							vg.J.e((byte) 95, 46);
							vg.J.a(var1, -562765672);
						}
					}
				} else {
					kd.a(sh.Gb, false, bb.lf_hb, 0);
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "j.W(" + var0 + ',' + var1 + ')');
		}
	}

	final int[] a(int var1, int var2, int var3) {
		try {
			++int_n;
			int var4 = -26 / ((-75 - var2) / 49);
			return this.G[var3].x ? this.G[var3].a(-72, var1) : this.G[var3].b(var1, 2177)[0];
		} catch (RuntimeException var5) {
			throw ec.a(var5, "j.AA(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_v = null;
			E = null;
			O = null;
			L = null;
			z = null;
			J = null;
			K = null;
			if (var0 != 13218) {
				P = -79;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "j.DA(" + var0 + ')');
		}
	}

	void a(byte var1, int var2, ja var3) {
		try {
			++y;
			if (var1 >= -120) {
				K = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "j.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, byte var1, oh var2, boolean var3, int var4, int var5, int var6) {
		try {
			long var7 = (long) (var6 + (var4 << 16));
			++int_o;
			te var9 = (te) qa.eh_cb.a(var7, (byte) -93);
			if (var5 < 86) {
				O = null;
			}

			if (var9 == null) {
				var9 = (te) od.X.a(var7, (byte) -106);
				if (var9 == null) {
					var9 = (te) ca.eh_c.a(var7, (byte) -78);
					if (var9 != null) {
						if (var3) {
							var9.c((byte) 3);
							qa.eh_cb.a(var7, false, var9);
							--ce.R;
							++qb.W;
						}

					} else {
						if (!var3) {
							var9 = (te) bb.eh_lb.a(var7, (byte) -126);
							if (var9 != null) {
								return;
							}
						}

						var9 = new te();
						var9.H = var1;
						var9.G = var2;
						var9.Q = var0;
						if (!var3) {
							ad.l_f.a((int) 18619, (ph) var9);
							ca.eh_c.a(var7, false, var9);
							++ce.R;
						} else {
							qa.eh_cb.a(var7, false, var9);
							++qb.W;
						}
					}
				}
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "j.U(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	static final void b(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		if (var3 != null) {
			var3.D = null;
		}
	}

	int[] a(int var1, int var2) {
		try {
			++C;
			if (var1 > -49) {
				this.G = null;
			}

			throw new IllegalStateException("This operation does not have a monochrome output");
		} catch (RuntimeException var4) {
			throw ec.a(var4, "j.G(" + var1 + ',' + var2 + ')');
		}
	}

	final int[][] a(boolean var1, int var2, int var3) {
		try {
			if (var1) {
				M = -92;
			}

			++int_t;
			if (!this.G[var3].x) {
				return this.G[var3].b(var2, 2177);
			} else {
				int[] var4 = this.G[var3].a(-55, var2);
				int[][] var5 = new int[][]{var4, var4, var4};
				return var5;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "j.V(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	int b(int var1) {
		try {
			++int_p;
			return var1 != 24649 ? -5 : -1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "j.Q(" + var1 + ')');
		}
	}

	void c(int var1) {
		try {
			++int_s;
			if (var1 != 25614) {
				lf_v = null;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "j.M(" + var1 + ')');
		}
	}

	final void a(byte var1, int var2, int var3) {
		try {
			if (var1 >= 13) {
				label21:
				{
					int var4 = ~this.A != -256 ? this.A : var3;
					if (this.x) {
						this.H = new ma(var4, var3, var2);
						if (client.int_gc == 0) {
							break label21;
						}
					}

					this.jh_q = new jh(var4, var3, var2);
				}

				++D;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "j.T(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	int d(int var1) {
		try {
			if (var1 != -1) {
				return -103;
			} else {
				++int_u;
				return -1;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "j.CA(" + var1 + ')');
		}
	}

	j(int var1, boolean var2) {
		try {
			this.G = new j[var1];
			this.x = var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "j.<init>(" + var1 + ',' + var2 + ')');
		}
	}

	final void c(byte var1) {
		try {
			if (var1 != -113) {
				O = null;
			}

			label18:
			{
				if (!this.x) {
					this.jh_q.a(false);
					this.jh_q = null;
					if (client.int_gc == 0) {
						break label18;
					}
				}

				this.H.b(27);
				this.H = null;
			}

			++F;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "j.S(" + var1 + ')');
		}
	}

	int[][] b(int var1, int var2) {
		try {
			++N;
			if (var2 != 2177) {
				this.c((int) 56);
			}

			throw new IllegalStateException("This operation does not have a colour output");
		} catch (RuntimeException var4) {
			throw ec.a(var4, "j.E(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		L = J;
		K = J;
		O = dd.a(" )2> <col=ff9040>", 2);
		P = 1;
	}
}
