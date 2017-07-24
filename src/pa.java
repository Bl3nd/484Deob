final class pa {

	static kf[] kfs_a;
	static lf lf_b = dd.a("Weiter", 2);
	static lf lf_c = dd.a("blaugr-Un:", 2);
	static int int_d;
	static int int_e;
	static int int_f;
	static int int_g;
	static int int_h;
	static boolean[] booleans_i = new boolean[5];
	private int[][] ints_j;
	private int int_k;
	static lf lf_l;
	static lf lf_m;
	private int int_n;
	static int int_o;
	private static lf lf_p;
	static int int_q;
	private static lf lf_r = dd.a("You need a members account to login to this world)3", 2);
	static int int_s;
	static lf lf_t;
	static int int_u;
	static int[] ints_v;
	static lf lf_w;
	static int x;

	static final int a(int var0, byte[] var1, int var2) {
		try {
			++int_q;
			if (var0 != -14629) {
				a((int) -65, -4);
			}

			return vh.a((byte) -19, var1, var2, 0);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "pa.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			lf_c = null;
			ints_v = null;
			if (var0 < -69) {
				lf_w = null;
				lf_l = null;
				lf_p = null;
				lf_t = null;
				lf_m = null;
				kfs_a = null;
				booleans_i = null;
				lf_b = null;
				lf_r = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "pa.C(" + var0 + ')');
		}
	}

	static final i a(int var0, int var1) {
		try {
			++int_s;
			i var2 = (i) ob.rc_b.a((long) var0, (int) -121);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = gh.bg_ab.a(var1 + var1, var0, 6);
				var2 = new i();
				var2.int_cb = var0;
				if (var3 != null) {
					var2.a(0, new ja(var3));
				}

				var2.d((byte) -62);
				if (var2.H) {
					var2.xb = false;
					var2.V = 0;
				}

				ob.rc_b.a((long) var0, var1 ^ -24, var2);
				return var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "pa.B(" + var0 + ',' + var1 + ')');
		}
	}

	final int a(byte var1, int var2) {
		try {
			++int_f;
			if (var1 != 63) {
				a(100, (byte[]) null, -128);
			}

			if (this.ints_j != null) {
				var2 = (int) ((long) this.int_n * (long) var2 / (long) this.int_k) + 6;
			}

			return var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "pa.H(" + var1 + ',' + var2 + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2, int var3, ka var4, int var5, long var6, int var8, int var9, int var10, int var11) {
		return var4 == null ? true : nb.a(var0, var8, var9, var10 - var8 + 1, var11 - var9 + 1, var1, var2, var3, var4, var5, true, var6);
	}

	static final void a(int var0, byte var1, u var2, int var3) {
		int var12 = client.int_gc;

		try {
			int var4;
			int var5;
			if (~(var3 & 8) != -1) {
				var4 = ka.I.n(28747);
				var5 = ka.I.n(28747);
				var2.a(var5, (byte) -103, var4, pd.int_i);
				var2.int_jc = 300 + pd.int_i;
				var2.Wb = ka.I.o(var1 ^ -121);
			}

			++int_h;
			if ((var3 & 32) != 0) {
				var4 = ka.I.b(255);
				var5 = ka.I.n(28747);
				int var6 = ka.I.o(53);
				int var7 = ka.I.P;
				if (var2.Dc != null && var2.be_id != null) {
					long var8 = var2.Dc.a(false);
					boolean var10 = false;
					if (~var5 >= -2) {
						int var11 = 0;
						if (var12 != 0 || ~var11 > ~bh.int_ob) {
							do {
								if (id.longs_n[var11] == var8) {
									var10 = true;
									if (var12 == 0) {
										break;
									}
								}

								++var11;
							} while (~var11 > ~bh.int_ob);
						}
					}

					if (!var10 && dd.W == 0) {
						label104:
						{
							hg.ja_h.P = 0;
							ka.I.b(0, 0, var6, hg.ja_h.yb);
							hg.ja_h.P = 0;
							lf var16 = bf.c(ff.a(hg.ja_h, (byte) 88).d((byte) -68));
							var2.Sb = var16.a((byte) 62);
							var2.Fb = var4 >> 1948337800;
							var2.Vb = var4 & 255;
							var2.int_dc = 150;
							if (var5 != 2 && var5 != 3) {
								if (~var5 == -2) {
									kd.a(de.a(new lf[]{h.lf_p, var2.Dc}, var1 + -36), false, var16, 1);
									if (var12 == 0) {
										break label104;
									}
								}

								kd.a(var2.Dc, false, var16, 2);
								if (var12 == 0) {
									break label104;
								}
							}

							kd.a(de.a(new lf[]{ai.lf_j, var2.Dc}, -3), false, var16, 1);
						}
					}
				}

				ka.I.P = var7 - -var6;
			}

			if (~(0x2 & var3) != -1) {//todo: implement update player protocol
				var4 = ka.I.n(var1 ^ -28783);
				byte[] var14 = new byte[var4];
				ja var15 = new ja(var14);
				ka.I.a(0, var4, 69, var14);
				qb.Q[var0] = var15;
				var2.a(true, var15);
			}

			if ((var3 & 256) != 0) {
				var2.int_kc = ka.I.o(127);
				var2.int_ib = ka.I.n(var1 ^ -28783);
				var2.Bb = ka.I.j((int) 24263);
				var2.int_oc = ka.I.j(var1 + 24301);
				var2.int_bb = ka.I.b(255) - -pd.int_i;
				var2.int_jb = ka.I.b(true) - -pd.int_i;
				var2.int_rb = ka.I.j((byte) 127);
				var2.int_tb = 1;
				var2.int_qb = 0;
			}

			if ((var3 & 64) != 0) {
				var2.int_ac = ka.I.b(255);
				var2.Tb = ka.I.p(var1 ^ -219);
			}

			if (~(0x80 & var3) != -1) {
				label89:
				{
					var2.Sb = ka.I.e((byte) 87);
					if (var2.Sb.a(118, (int) 0) != 126) {
						if (var2 != r.X) {
							break label89;
						}

						kd.a(var2.Dc, false, var2.Sb, 2);
						if (var12 == 0) {
							break label89;
						}
					}

					var2.Sb = var2.Sb.c(var1 ^ 13, 1);
					kd.a(var2.Dc, false, var2.Sb, 2);
				}

				var2.Fb = 0;
				var2.int_dc = 150;
				var2.Vb = 0;
			}

			if ((var3 & 16) != 0) {
				var4 = ka.I.k(1440014816);
				if (~var4 == -65536) {
					var4 = -1;
				}

				var5 = ka.I.j(var1 ^ -24291);
				ai.a(var5, var4, false, var2);
			}

			if (~(var3 & 1) != -1) {
				var2.Mb = ka.I.k(1440014816);
				if (~var2.Mb == -65536) {
					var2.Mb = -1;
				}
			}

			if (~(512 & var3) != -1) {
				var2.Nb = ka.I.p(255);
				var4 = ka.I.l(15);
				var2.int_lc = var4 >> 1345318800;
				if (~var2.Nb == -65536) {
					var2.Nb = -1;
				}

				var2.int_tc = pd.int_i - -('\uffff' & var4);
				var2.int_kb = 0;
				var2.int_cc = 0;
				if (~pd.int_i > ~var2.int_tc) {
					var2.int_cc = -1;
				}
			}

			if (~(var3 & 1024) != -1) {
				var4 = ka.I.j((byte) 118);
				var5 = ka.I.j((byte) 109);
				var2.a(var5, (byte) -95, var4, pd.int_i);
			}

			if (var1 != -38) {
				a(-80, -19, 51, -54, (ka) null, 85, -94L, 32, 0, -4, 100);
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "pa.E(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final byte[] a(int var1, byte[] var2) {
		int var12 = client.int_gc;

		try {
			if (var1 != 25709) {
				lf_r = null;
			}

			++int_g;
			if (this.ints_j != null) {
				int var3 = (int) ((long) var2.length * (long) this.int_n / (long) this.int_k) - -14;
				int[] var4 = new int[var3];
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				if (var12 != 0 || var2.length > var7) {
					do {
						int[] var9 = this.ints_j[var6];
						byte var8 = var2[var7];
						int var10 = 0;
						if (var12 != 0) {
							var4[var10 + var5] += var9[var10] * var8;
							++var10;
						}

						while (var10 < 14) {
							var4[var10 + var5] += var9[var10] * var8;
							++var10;
						}

						var6 += this.int_n;
						int var11 = var6 / this.int_k;
						var5 += var11;
						var6 -= var11 * this.int_k;
						++var7;
					} while (var2.length > var7);
				}

				var2 = new byte[var3];
				int var14 = 0;
				if (var12 != 0 || var3 > var14) {
					do {
						label41:
						{
							int var15 = '耀' + var4[var14] >> -534727120;
							if (var15 >= -128) {
								if (var15 > 127) {
									var2[var14] = 127;
									if (var12 == 0) {
										break label41;
									}
								}

								var2[var14] = (byte) var15;
								if (var12 == 0) {
									break label41;
								}
							}

							var2[var14] = -128;
						}

						++var14;
					} while (var3 > var14);
				}
			}

			return var2;
		} catch (RuntimeException var13) {
			throw ec.a(var13, "pa.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	pa(int var1, int sampleRate) {
		try {
			if (var1 != sampleRate) {
				int var3 = rd.a(true, var1, sampleRate);
				sampleRate /= var3;
				var1 /= var3;
				this.ints_j = new int[var1][14];
				this.int_k = var1;
				this.int_n = sampleRate;
				int var4 = 0;
				if (var1 > var4) {
					do {
						double var6 = 6.0D + (double) var4 / (double) var1;
						int[] var5 = this.ints_j[var4];
						int var8 = (int) Math.floor(1.0D + (var6 - 7.0D));
						int var9 = (int) Math.ceil(7.0D + var6);
						if (var9 > 14) {
							var9 = 14;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						double var10 = (double) sampleRate / (double) var1;
						if (var8 >= var9) {
							++var4;
						} else {
							do {
								double var14 = var10;
								double var12 = ((double) var8 - var6) * 3.141592653589793D;
								if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
									var14 = var10 * (Math.sin(var12) / var12);
								}

								var14 *= 0.54D + Math.cos(0.2243994752564138D * (-var6 + (double) var8)) * 0.46D;
								var5[var8] = (int) Math.floor(65536.0D * var14 + 0.5D);
								++var8;
							} while (var8 < var9);

							++var4;
						}
					} while (var1 > var4);
				}
			}
		} catch (RuntimeException var17) {
			throw ec.a(var17, "pa.<init>(" + var1 + ',' + sampleRate + ')');
		}
	}

	final int b(int var1, int var2) {
		try {
			if (var1 != -23741) {
				a((int) 120, 17);
			}

			++int_o;
			if (this.ints_j != null) {
				var2 = (int) ((long) var2 * (long) this.int_n / (long) this.int_k);
			}

			return var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "pa.F(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		lf_t = lf_r;
		lf_p = dd.a("Please use a different world)3", 2);
		lf_w = lf_p;
		lf_m = dd.a("(U5", 2);
		int_u = 0;
		ints_v = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		lf_l = lf_p;
		x = 0;
	}
}
