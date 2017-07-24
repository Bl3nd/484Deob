abstract class uc extends ka {

	int int_ab = -1;
	int int_bb;
	static int int_cb;
	int[] ints_db = new int[10];
	int int_eb = -1;
	int int_fb;
	int int_gb = 0;
	static int int_hb;
	int int_ib;
	int int_jb;
	int int_kb = 0;
	static int int_lb;
	int int_mb;
	static int int_nb;
	int int_ob = 0;
	int int_pb = -1;
	int int_qb = 0;
	int int_rb;
	static int int_sb;
	int int_tb = 0;
	static int[] ints_ub = new int[2000];
	static int int_vb;
	int int_wb = 32;
	int[] xb = new int[10];
	static int yb;
	int zb = -1;
	int Ab = 0;
	int Bb;
	int[] Cb = new int[4];
	int Db = 0;
	int Eb = -1;
	int Fb = 0;
	int[] Gb = new int[4];
	static int[][][] Hb;
	static int Ib;
	int Jb = -1;
	int[] Kb = new int[4];
	static int Lb;
	int Mb = -1;
	int Nb = -1;
	int Ob;
	static int Pb;
	static lf Qb;
	int Rb = -1;
	lf Sb = null;
	int Tb = 0;
	int Ub = 0;
	int Vb = 0;
	int Wb;
	boolean[] Xb = new boolean[10];
	int Yb = 0;
	int Zb = 0;
	int int_ac = 0;
	int int_bc = -1;
	int int_cc = 0;
	int int_dc = 100;
	int int_ec;
	boolean boolean_fc = false;
	int int_gc = 0;
	int int_hc = -1;
	static int int_ic = -1;
	int int_jc = -1000;
	int int_kc;
	int int_lc;
	private static lf lf_mc = dd.a("Loaded fonts", 2);
	int int_nc;
	int int_oc;
	static int int_pc;
	int int_qc = 1;
	int int_rc = 0;
	static int int_sc;
	int int_tc;
	int int_uc = -1;

	final void c(boolean var1) {
		try {
			if (var1) {
				++yb;
				this.int_tb = 0;
				this.int_qb = 0;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "uc.K(" + var1 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			int var1 = -49 % ((8 - var0) / 61);
			Hb = null;
			Qb = null;
			lf_mc = null;
			ints_ub = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "uc.H(" + var0 + ')');
		}
	}

	boolean c(int var1) {
		try {
			++int_sb;
			return var1 != 0 ? false : false;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "uc.C(" + var1 + ')');
		}
	}

	final int d(int var1) {
		try {
			if (var1 > -61) {
				this.int_rc = 59;
			}

			++int_cb;
			return ~super.T == 32767 ? 200 : -super.T;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "uc.P(" + var1 + ')');
		}
	}

	final void a(boolean var1, int localY, boolean var3, int localX) {
		try {
			if (this.int_bc != -1 && client.a(12, this.int_bc).int_sb == 1) {
				this.int_bc = -1;
			}

			if (var1) {
				++Lb;
				if (!var3) {
					int var5 = localX - this.ints_db[0];
					int var6 = localY + -this.xb[0];
					if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
						if (this.int_tb < 9) {
							++this.int_tb;
						}

						int var7 = this.int_tb;
						if (var7 <= 0) {
							this.Xb[0] = false;
							this.ints_db[0] = localX;
							this.xb[0] = localY;
							return;
						}

						do {
							this.ints_db[var7] = this.ints_db[var7 - 1];
							this.xb[var7] = this.xb[var7 + -1];
							this.Xb[var7] = this.Xb[-1 + var7];
							--var7;
						} while (var7 > 0);

						this.Xb[0] = false;
						this.ints_db[0] = localX;
						this.xb[0] = localY;
						return;
					}
				}

				this.int_tb = 0;
				this.int_qb = 0;
				this.int_gb = 0;
				this.ints_db[0] = localX;
				this.xb[0] = localY;
				this.int_fb = this.int_qc * 64 + 128 * this.ints_db[0];
				this.int_nc = this.int_qc * 64 + 128 * this.xb[0];
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "uc.L(" + var1 + ',' + localY + ',' + var3 + ',' + localX + ')');
		}
	}

	static final td a(int var0, boolean var1, bg var2, bg var3, int var4) {
		int var11 = client.int_gc;

		try {
			++int_lb;
			boolean var5 = true;
			if (var4 != -9) {
				Qb = null;
			}

			int[] var6 = var2.a((byte) 127, (int) var0);
			int var7 = 0;
			if (var11 == 0 && var6.length <= var7) {
				if (!var5) {
					return null;
				} else {
					try {
						return new td(var2, var3, var0, var1);
					} catch (Exception var13) {
						return null;
					}
				}
			} else {
				do {
					label79:
					{
						byte[] var8 = var2.b(var6[var7], var4 ^ -126, var0);
						if (var8 == null) {
							var5 = false;
							if (var11 == 0) {
								break label79;
							}
						}

						byte[] var10;
						label47:
						{
							int var9 = var8[1] & 255 | var8[0] << -481428120 & '\uff00';
							if (var1) {
								var10 = var3.b(var9, 39, 0);
								if (var11 == 0) {
									break label47;
								}
							}

							var10 = var3.b(0, 39, var9);
						}

						if (var10 == null) {
							var5 = false;
						}
					}

					++var7;
				} while (var6.length > var7);

				if (!var5) {
					return null;
				} else {
					try {
						return new td(var2, var3, var0, var1);
					} catch (Exception var12) {
						return null;
					}
				}
			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "uc.M(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}

	static final Object a(int var0, byte[] var1, boolean var2) {
		try {
			++Ib;
			if (var1 == null) {
				return null;
			} else {
				if (~var1.length < -137 && !tf.boolean_d) {
					try {
						pg var3 = (pg) Class.forName("ve").newInstance();
						var3.a((byte) -35, var1);
						return var3;
					} catch (Throwable var4) {
						tf.boolean_d = true;
					}
				}

				if (var0 != 28199) {
					Hb = null;
				}

				return !var2 ? var1 : ic.a((byte) 68, var1);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "uc.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final void a(int var1, byte var2, int var3, int var4) {
		int var6 = client.int_gc;

		try {
			if (var2 >= -77) {
				this.c(-32);
			}

			++int_vb;
			int var5 = 0;
			if (var6 != 0 || var5 < 4) {
				do {
					if (~this.Gb[var5] >= ~var4) {
						this.Kb[var5] = var3;
						this.Cb[var5] = var1;
						this.Gb[var5] = 70 + var4;
						return;
					}

					++var5;
				} while (var5 < 4);

			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "uc.J(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void a(boolean var1, int var2, int var3) {
		int var8 = client.int_gc;

		try {
			++int_pc;
			int var4 = this.ints_db[0];
			int var5 = this.xb[0];
			if (~var2 == -1) {
				--var4;
				++var5;
			}

			if (var2 == 1) {
				++var5;
			}

			if (~this.int_bc != 0 && ~client.a(12, this.int_bc).int_sb == -2) {
				this.int_bc = -1;
			}

			if (var2 == 2) {
				++var5;
				++var4;
			}

			if (~this.int_tb > -10) {
				++this.int_tb;
			}

			int var6 = this.int_tb;
			if (var8 != 0) {
				this.ints_db[var6] = this.ints_db[var6 + -1];
				this.xb[var6] = this.xb[-1 + var6];
				this.Xb[var6] = this.Xb[var6 - 1];
				--var6;
			}

			while (var6 > 0) {
				this.ints_db[var6] = this.ints_db[var6 + -1];
				this.xb[var6] = this.xb[-1 + var6];
				this.Xb[var6] = this.Xb[var6 - 1];
				--var6;
			}

			if (~var2 == -4) {
				--var4;
			}

			if (var2 == 4) {
				++var4;
			}

			this.Xb[0] = var1;
			if (~var2 == -6) {
				--var4;
				--var5;
			}

			if (var2 == 6) {
				--var5;
			}

			if (~var2 == -8) {
				++var4;
				--var5;
			}

			int var7 = -53 / ((var3 - 17) / 47);
			this.ints_db[0] = var4;
			this.xb[0] = var5;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "uc.N(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static final int b(int var0, int var1, int var2, int var3) {
		int var5 = client.int_gc;

		try {
			++Pb;
			if (var3 > 243) {
				var2 >>= 4;
				if (var5 == 0) {
					return var0 != 0 ? 111 : (var1 >> 955008866 << 780696330) - (-(var2 >> -1055872411 << 695281319) - (var3 >> -1207213535));
				}
			}

			if (~var3 < -218) {
				var2 >>= 3;
				if (var5 == 0) {
					return var0 != 0 ? 111 : (var1 >> 955008866 << 780696330) - (-(var2 >> -1055872411 << 695281319) - (var3 >> -1207213535));
				}
			}

			if (~var3 >= -193) {
				if (~var3 >= -180) {
					return var0 != 0 ? 111 : (var1 >> 955008866 << 780696330) - (-(var2 >> -1055872411 << 695281319) - (var3 >> -1207213535));
				}

				var2 >>= 1;
				if (var5 == 0) {
					return var0 != 0 ? 111 : (var1 >> 955008866 << 780696330) - (-(var2 >> -1055872411 << 695281319) - (var3 >> -1207213535));
				}
			}

			var2 >>= 2;
			return var0 != 0 ? 111 : (var1 >> 955008866 << 780696330) - (-(var2 >> -1055872411 << 695281319) - (var3 >> -1207213535));
		} catch (RuntimeException var6) {
			throw ec.a(var6, "uc.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static {
		Qb = lf_mc;
	}
}
