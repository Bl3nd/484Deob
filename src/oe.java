final class oe extends ka {

	int[] ints_ab;
	byte byte_bb = 0;
	int[] ints_cb;
	private byte[] bytes_db;
	private short short_eb;
	int[] ints_fb;
	short[] shorts_gb;
	int[] ints_hb;
	byte[] bytes_ib;
	private short short_jb;
	private short short_kb;
	int int_lb;
	hg[] hgs_mb;
	byte[] bytes_nb;
	short[] shorts_ob;
	private static int[] ints_pb;
	int[][] ints_qb;
	private static int int_rb;
	int int_sb = 0;
	int[] ints_tb;
	private short short_ub;
	ca[] cas_vb;
	short short_wb;
	private static int[] xb = new int[10000];
	byte[] yb;
	hg[] zb;
	short Ab;
	private byte[] Bb;
	int[] Cb;
	private boolean Db = false;
	private byte[] Eb;
	private short[] Fb;
	int Gb = 0;
	private static int[] Hb;
	private byte[] Ib;
	private static int[] Jb;
	private int[] Kb;
	private short[] Lb;
	short[] Mb;
	private int[] Nb;
	private short Ob;
	private byte[] Pb;
	byte[] Qb;
	short[] Rb;
	short[] Sb;
	byte[] Tb;
	private short[] Ub;
	int[][] Vb;

	public static void a() {
		xb = null;
		Hb = null;
		ints_pb = null;
		Jb = null;
	}

	final void b() {
		for (int var1 = 0; var1 < this.Gb; ++var1) {
			int var2 = this.ints_fb[var1];
			this.ints_fb[var1] = this.Cb[var1];
			this.Cb[var1] = -var2;
		}

		this.i();
	}

	final void c() {
		for (int var1 = 0; var1 < this.Gb; ++var1) {
			this.ints_fb[var1] = -this.ints_fb[var1];
		}

		this.i();
	}

	final void d() {
		for (int var1 = 0; var1 < this.Gb; ++var1) {
			this.Cb[var1] = -this.Cb[var1];
			this.ints_fb[var1] = -this.ints_fb[var1];
		}

		this.i();
	}

	final void e() {
		for (int var1 = 0; var1 < this.int_sb; ++var1) {
			int var2 = this.ints_cb[var1];
			this.ints_cb[var1] = this.ints_hb[var1];
			this.ints_hb[var1] = var2;
		}

		this.i();
	}

	static final void a(oe var0, oe var1, int var2, int var3, int var4, boolean var5) {
		var0.k();
		var0.j();
		var1.k();
		var1.j();
		++int_rb;
		int var6 = 0;
		int[] var7 = var1.Cb;
		int var8 = var1.Gb;

		int var11;
		for (int var9 = 0; var9 < var0.Gb; ++var9) {
			hg var10 = var0.zb[var9];
			if (var10.int_b != 0) {
				var11 = var0.ints_ab[var9] - var3;
				if (var11 >= var1.T && var11 <= var1.short_eb) {
					int var12 = var0.Cb[var9] - var2;
					if (var12 >= var1.short_kb && var12 <= var1.Ob) {
						int var13 = var0.ints_fb[var9] - var4;
						if (var13 >= var1.short_jb && var13 <= var1.short_ub) {
							for (int var14 = 0; var14 < var8; ++var14) {
								hg var15 = var1.zb[var14];
								if (var12 == var7[var14] && var13 == var1.ints_fb[var14] && var11 == var1.ints_ab[var14] && var15.int_b != 0) {
									if (var0.hgs_mb == null) {
										var0.hgs_mb = new hg[var0.Gb];
									}

									if (var1.hgs_mb == null) {
										var1.hgs_mb = new hg[var8];
									}

									hg var16 = var0.hgs_mb[var9];
									if (var16 == null) {
										var16 = var0.hgs_mb[var9] = new hg(var10);
									}

									hg var17 = var1.hgs_mb[var14];
									if (var17 == null) {
										var17 = var1.hgs_mb[var14] = new hg(var15);
									}

									var16.int_f += var15.int_f;
									var16.int_d += var15.int_d;
									var16.int_i += var15.int_i;
									var16.int_b += var15.int_b;
									var17.int_f += var10.int_f;
									var17.int_d += var10.int_d;
									var17.int_i += var10.int_i;
									var17.int_b += var10.int_b;
									++var6;
									xb[var9] = int_rb;
									Hb[var14] = int_rb;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (int var18 = 0; var18 < var0.int_sb; ++var18) {
				if (xb[var0.ints_cb[var18]] == int_rb && xb[var0.ints_tb[var18]] == int_rb && xb[var0.ints_hb[var18]] == int_rb) {
					if (var0.yb == null) {
						var0.yb = new byte[var0.int_sb];
					}

					var0.yb[var18] = 2;
				}
			}

			for (var11 = 0; var11 < var1.int_sb; ++var11) {
				if (Hb[var1.ints_cb[var11]] == int_rb && Hb[var1.ints_tb[var11]] == int_rb && Hb[var1.ints_hb[var11]] == int_rb) {
					if (var1.yb == null) {
						var1.yb = new byte[var1.int_sb];
					}

					var1.yb[var11] = 2;
				}
			}

		}
	}

	final oe f() {
		oe var1 = new oe();
		if (this.yb != null) {
			var1.yb = new byte[this.int_sb];

			for (int var2 = 0; var2 < this.int_sb; ++var2) {
				var1.yb[var2] = this.yb[var2];
			}
		}

		var1.Gb = this.Gb;
		var1.int_sb = this.int_sb;
		var1.int_lb = this.int_lb;
		var1.Cb = this.Cb;
		var1.ints_ab = this.ints_ab;
		var1.ints_fb = this.ints_fb;
		var1.ints_cb = this.ints_cb;
		var1.ints_tb = this.ints_tb;
		var1.ints_hb = this.ints_hb;
		var1.bytes_nb = this.bytes_nb;
		var1.Qb = this.Qb;
		var1.bytes_ib = this.bytes_ib;
		var1.Sb = this.Sb;
		var1.shorts_ob = this.shorts_ob;
		var1.byte_bb = this.byte_bb;
		var1.Tb = this.Tb;
		var1.Mb = this.Mb;
		var1.Rb = this.Rb;
		var1.shorts_gb = this.shorts_gb;
		var1.Ub = this.Ub;
		var1.Fb = this.Fb;
		var1.Lb = this.Lb;
		var1.bytes_db = this.bytes_db;
		var1.Pb = this.Pb;
		var1.Eb = this.Eb;
		var1.Bb = this.Bb;
		var1.Ib = this.Ib;
		var1.Kb = this.Kb;
		var1.Nb = this.Nb;
		var1.ints_qb = this.ints_qb;
		var1.Vb = this.Vb;
		var1.zb = this.zb;
		var1.cas_vb = this.cas_vb;
		var1.Ab = this.Ab;
		var1.short_wb = this.short_wb;
		return var1;
	}

	final oe a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.k();
		int var7 = var2 + this.short_kb;
		int var8 = var2 + this.Ob;
		int var9 = var4 + this.short_jb;
		int var10 = var4 + this.short_ub;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				oe var11;
				if (var5) {
					var11 = new oe();
					var11.Gb = this.Gb;
					var11.int_sb = this.int_sb;
					var11.int_lb = this.int_lb;
					var11.Cb = this.Cb;
					var11.ints_fb = this.ints_fb;
					var11.ints_cb = this.ints_cb;
					var11.ints_tb = this.ints_tb;
					var11.ints_hb = this.ints_hb;
					var11.yb = this.yb;
					var11.bytes_nb = this.bytes_nb;
					var11.Qb = this.Qb;
					var11.bytes_ib = this.bytes_ib;
					var11.Sb = this.Sb;
					var11.shorts_ob = this.shorts_ob;
					var11.byte_bb = this.byte_bb;
					var11.Tb = this.Tb;
					var11.Mb = this.Mb;
					var11.Rb = this.Rb;
					var11.shorts_gb = this.shorts_gb;
					var11.Ub = this.Ub;
					var11.Fb = this.Fb;
					var11.Lb = this.Lb;
					var11.bytes_db = this.bytes_db;
					var11.Pb = this.Pb;
					var11.Eb = this.Eb;
					var11.Bb = this.Bb;
					var11.Ib = this.Ib;
					var11.Kb = this.Kb;
					var11.Nb = this.Nb;
					var11.ints_qb = this.ints_qb;
					var11.Vb = this.Vb;
					var11.Ab = this.Ab;
					var11.short_wb = this.short_wb;
					var11.ints_ab = new int[var11.Gb];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.Gb; ++var12) {
						var13 = this.Cb[var12] + var2;
						var14 = this.ints_fb[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.ints_ab[var12] = this.ints_ab[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.Gb; ++var12) {
						var13 = (this.ints_ab[var12] << 16) / super.T;
						if (var13 < var6) {
							var14 = this.Cb[var12] + var2;
							var15 = this.ints_fb[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.ints_ab[var12] = this.ints_ab[var12] + (var22 - var3) * (var6 - var13) / var6;
						} else {
							var11.ints_ab[var12] = this.ints_ab[var12];
						}
					}
				}

				var11.i();
				return var11;
			}
		} else {
			return this;
		}
	}

	private final void a(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		ja var4 = new ja(var1);
		ja var5 = new ja(var1);
		ja var6 = new ja(var1);
		ja var7 = new ja(var1);
		ja var8 = new ja(var1);
		var4.P = var1.length - 18;
		int var9 = var4.b(true);
		int var10 = var4.b(true);
		int var11 = var4.j((byte) 91);
		int var12 = var4.j((byte) 120);
		int var13 = var4.j((byte) 114);
		int var14 = var4.j((byte) 82);
		int var15 = var4.j((byte) 98);
		int var16 = var4.j((byte) 113);
		int var17 = var4.b(true);
		int var18 = var4.b(true);
		int var19 = var4.b(true);
		int var20 = var4.b(true);
		byte var21 = 0;
		int var49 = var21 + var9;
		int var23 = var49;
		var49 += var10;
		int var24 = var49;
		if (var13 == 255) {
			var49 += var10;
		}

		int var25 = var49;
		if (var15 == 1) {
			var49 += var10;
		}

		int var26 = var49;
		if (var12 == 1) {
			var49 += var10;
		}

		int var27 = var49;
		if (var16 == 1) {
			var49 += var9;
		}

		int var28 = var49;
		if (var14 == 1) {
			var49 += var10;
		}

		int var29 = var49;
		var49 += var20;
		int var30 = var49;
		var49 += var10 * 2;
		int var31 = var49;
		var49 += var11 * 6;
		int var32 = var49;
		var49 += var17;
		int var33 = var49;
		var49 += var18;
		int var10000 = var49 + var19;
		this.Gb = var9;
		this.int_sb = var10;
		this.int_lb = var11;
		this.Cb = new int[var9];
		this.ints_ab = new int[var9];
		this.ints_fb = new int[var9];
		this.ints_cb = new int[var10];
		this.ints_tb = new int[var10];
		this.ints_hb = new int[var10];
		if (var11 > 0) {
			this.Tb = new byte[var11];
			this.Mb = new short[var11];
			this.Rb = new short[var11];
			this.shorts_gb = new short[var11];
		}

		if (var16 == 1) {
			this.Kb = new int[var9];
		}

		if (var12 == 1) {
			this.yb = new byte[var10];
			this.bytes_ib = new byte[var10];
			this.shorts_ob = new short[var10];
		}

		if (var13 == 255) {
			this.bytes_nb = new byte[var10];
		} else {
			this.byte_bb = (byte) var13;
		}

		if (var14 == 1) {
			this.Qb = new byte[var10];
		}

		if (var15 == 1) {
			this.Nb = new int[var10];
		}

		this.Sb = new short[var10];
		var4.P = var21;
		var5.P = var32;
		var6.P = var33;
		var7.P = var49;
		var8.P = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var39;
		int var40;
		int var41;
		int var42;
		for (int var38 = 0; var38 < var9; ++var38) {
			var39 = var4.j((byte) 126);
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.a(128);
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.a(128);
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.a(128);
			}

			this.Cb[var38] = var35 + var40;
			this.ints_ab[var38] = var36 + var41;
			this.ints_fb[var38] = var37 + var42;
			var35 = this.Cb[var38];
			var36 = this.ints_ab[var38];
			var37 = this.ints_fb[var38];
			if (var16 == 1) {
				this.Kb[var38] = var8.j((byte) 74);
			}
		}

		var4.P = var30;
		var5.P = var26;
		var6.P = var24;
		var7.P = var28;
		var8.P = var25;

		for (var39 = 0; var39 < var10; ++var39) {
			this.Sb[var39] = (short) var4.b(true);
			if (var12 == 1) {
				var40 = var5.j((byte) 115);
				if ((var40 & 1) == 1) {
					this.yb[var39] = 1;
					var2 = true;
				} else {
					this.yb[var39] = 0;
				}

				if ((var40 & 2) == 2) {
					this.bytes_ib[var39] = (byte) (var40 >> 2);
					this.shorts_ob[var39] = this.Sb[var39];
					this.Sb[var39] = 127;
					if (this.shorts_ob[var39] != -1) {
						var3 = true;
					}
				} else {
					this.bytes_ib[var39] = -1;
					this.shorts_ob[var39] = -1;
				}
			}

			if (var13 == 255) {
				this.bytes_nb[var39] = var6.m(3);
			}

			if (var14 == 1) {
				this.Qb[var39] = var7.m(3);
			}

			if (var15 == 1) {
				this.Nb[var39] = var8.j((byte) 80);
			}
		}

		var4.P = var29;
		var5.P = var23;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		int var43 = 0;

		int var45;
		for (int var44 = 0; var44 < var10; ++var44) {
			var45 = var5.j((byte) 127);
			if (var45 == 1) {
				var40 = var4.a(128) + var43;
				var41 = var4.a(128) + var40;
				var42 = var4.a(128) + var41;
				var43 = var42;
				this.ints_cb[var44] = var40;
				this.ints_tb[var44] = var41;
				this.ints_hb[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.a(128) + var43;
				var43 = var42;
				this.ints_cb[var44] = var40;
				this.ints_tb[var44] = var41;
				this.ints_hb[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.a(128) + var43;
				var43 = var42;
				this.ints_cb[var44] = var40;
				this.ints_tb[var44] = var41;
				this.ints_hb[var44] = var42;
			}

			if (var45 == 4) {
				int var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.a(128) + var43;
				var43 = var42;
				this.ints_cb[var44] = var40;
				this.ints_tb[var44] = var46;
				this.ints_hb[var44] = var42;
			}
		}

		var4.P = var31;

		for (var45 = 0; var45 < var11; ++var45) {
			this.Tb[var45] = 0;
			this.Mb[var45] = (short) var4.b(true);
			this.Rb[var45] = (short) var4.b(true);
			this.shorts_gb[var45] = (short) var4.b(true);
		}

		if (this.bytes_ib != null) {
			boolean var50 = false;

			for (int var47 = 0; var47 < var10; ++var47) {
				int var48 = this.bytes_ib[var47] & 255;
				if (var48 != 255) {
					if ((this.Mb[var48] & '\uffff') == this.ints_cb[var47] && (this.Rb[var48] & '\uffff') == this.ints_tb[var47] && (this.shorts_gb[var48] & '\uffff') == this.ints_hb[var47]) {
						this.bytes_ib[var47] = -1;
					} else {
						var50 = true;
					}
				}
			}

			if (!var50) {
				this.bytes_ib = null;
			}
		}

		if (!var3) {
			this.shorts_ob = null;
		}

		if (!var2) {
			this.yb = null;
		}

	}

	private final int a(oe var1, int var2) {
		int var3 = -1;
		int var4 = var1.Cb[var2];
		int var5 = var1.ints_ab[var2];
		int var6 = var1.ints_fb[var2];

		for (int var7 = 0; var7 < this.Gb; ++var7) {
			if (var4 == this.Cb[var7] && var5 == this.ints_ab[var7] && var6 == this.ints_fb[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.Cb[this.Gb] = var4;
			this.ints_ab[this.Gb] = var5;
			this.ints_fb[this.Gb] = var6;
			if (var1.Kb != null) {
				this.Kb[this.Gb] = var1.Kb[var2];
			}

			var3 = this.Gb++;
		}

		return var3;
	}

	final void g() {
		for (int var1 = 0; var1 < this.Gb; ++var1) {
			int var2 = this.Cb[var1];
			this.Cb[var1] = this.ints_fb[var1];
			this.ints_fb[var1] = -var2;
		}

		this.i();
	}

	final void a(short var1, short var2) {
		for (int var3 = 0; var3 < this.int_sb; ++var3) {
			if (this.Sb[var3] == var1) {
				this.Sb[var3] = var2;
			}
		}

	}

	final gf b(int var1, int var2, int var3, int var4, int var5) {
		return new gf(this, var1, var2, var3, var4, var5);
	}

	final ue a(int var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
		return new gf(this, var1, var2, var3, var4, var5);
	}

	final void c(int var1) {
		int var2 = ints_pb[var1];
		int var3 = Jb[var1];

		for (int var4 = 0; var4 < this.Gb; ++var4) {
			int var5 = this.ints_fb[var4] * var2 + this.Cb[var4] * var3 >> 16;
			this.ints_fb[var4] = this.ints_fb[var4] * var3 - this.Cb[var4] * var2 >> 16;
			this.Cb[var4] = var5;
		}

		this.i();
	}

	static final oe a(bg var0, int var1, int var2) {
		byte[] var3 = var0.a(0, var2, var1);
		return var3 == null ? null : new oe(var3);
	}

	final void h() {
		int[] var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		if (this.Kb != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.Gb; ++var3) {
				var4 = this.Kb[var3];
				++var1[var4];
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.ints_qb = new int[var2 + 1][];

			for (var4 = 0; var4 <= var2; ++var4) {
				this.ints_qb[var4] = new int[var1[var4]];
				var1[var4] = 0;
			}

			for (var5 = 0; var5 < this.Gb; this.ints_qb[var6][var1[var6]++] = var5++) {
				var6 = this.Kb[var5];
			}

			this.Kb = null;
		}

		if (this.Nb != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.int_sb; ++var3) {
				var4 = this.Nb[var3];
				++var1[var4];
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.Vb = new int[var2 + 1][];

			for (var4 = 0; var4 <= var2; ++var4) {
				this.Vb[var4] = new int[var1[var4]];
				var1[var4] = 0;
			}

			for (var5 = 0; var5 < this.int_sb; this.Vb[var6][var1[var6]++] = var5++) {
				var6 = this.Nb[var5];
			}

			this.Nb = null;
		}

	}

	final void a(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Gb; ++var4) {
			this.Cb[var4] = this.Cb[var4] * var1 / 128;
			this.ints_ab[var4] = this.ints_ab[var4] * var2 / 128;
			this.ints_fb[var4] = this.ints_fb[var4] * var3 / 128;
		}

		this.i();
	}

	private final void b(byte[] var1) {
		ja var2 = new ja(var1);
		ja var3 = new ja(var1);
		ja var4 = new ja(var1);
		ja var5 = new ja(var1);
		ja var6 = new ja(var1);
		ja var7 = new ja(var1);
		ja var8 = new ja(var1);
		var2.P = var1.length - 23;
		int var9 = var2.b(true);
		int var10 = var2.b(true);
		int var11 = var2.j((byte) 116);
		int var12 = var2.j((byte) 118);
		int var13 = var2.j((byte) 110);
		int var14 = var2.j((byte) 84);
		int var15 = var2.j((byte) 103);
		int var16 = var2.j((byte) 73);
		int var17 = var2.j((byte) 87);
		int var18 = var2.b(true);
		int var19 = var2.b(true);
		int var20 = var2.b(true);
		int var21 = var2.b(true);
		int var22 = var2.b(true);
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.Tb = new byte[var11];
			var2.P = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.Tb[var26] = var2.m(3);
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 + var25 * 2;
		this.Gb = var9;
		this.int_sb = var10;
		this.int_lb = var11;
		this.Cb = new int[var9];
		this.ints_ab = new int[var9];
		this.ints_fb = new int[var9];
		this.ints_cb = new int[var10];
		this.ints_tb = new int[var10];
		this.ints_hb = new int[var10];
		if (var17 == 1) {
			this.Kb = new int[var9];
		}

		if (var12 == 1) {
			this.yb = new byte[var10];
		}

		if (var13 == 255) {
			this.bytes_nb = new byte[var10];
		} else {
			this.byte_bb = (byte) var13;
		}

		if (var14 == 1) {
			this.Qb = new byte[var10];
		}

		if (var15 == 1) {
			this.Nb = new int[var10];
		}

		if (var16 == 1) {
			this.shorts_ob = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.bytes_ib = new byte[var10];
		}

		this.Sb = new short[var10];
		if (var11 > 0) {
			this.Mb = new short[var11];
			this.Rb = new short[var11];
			this.shorts_gb = new short[var11];
			if (var24 > 0) {
				this.Ub = new short[var24];
				this.Fb = new short[var24];
				this.Lb = new short[var24];
				this.bytes_db = new byte[var24];
				this.Pb = new byte[var24];
				this.Eb = new byte[var24];
			}

			if (var25 > 0) {
				this.Bb = new byte[var25];
				this.Ib = new byte[var25];
			}
		}

		var2.P = var11;
		var3.P = var38;
		var4.P = var39;
		var5.P = var40;
		var6.P = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var52;
		int var53;
		int var54;
		int var55;
		for (int var51 = 0; var51 < var9; ++var51) {
			var52 = var2.j((byte) 113);
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.a(128);
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.a(128);
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.a(128);
			}

			this.Cb[var51] = var48 + var53;
			this.ints_ab[var51] = var49 + var54;
			this.ints_fb[var51] = var50 + var55;
			var48 = this.Cb[var51];
			var49 = this.ints_ab[var51];
			var50 = this.ints_fb[var51];
			if (var17 == 1) {
				this.Kb[var51] = var6.j((byte) 74);
			}
		}

		var2.P = var37;
		var3.P = var28;
		var4.P = var30;
		var5.P = var33;
		var6.P = var31;
		var7.P = var35;
		var8.P = var36;

		for (var52 = 0; var52 < var10; ++var52) {
			this.Sb[var52] = (short) var2.b(true);
			if (var12 == 1) {
				this.yb[var52] = var3.m(3);
			}

			if (var13 == 255) {
				this.bytes_nb[var52] = var4.m(3);
			}

			if (var14 == 1) {
				this.Qb[var52] = var5.m(3);
			}

			if (var15 == 1) {
				this.Nb[var52] = var6.j((byte) 127);
			}

			if (var16 == 1) {
				this.shorts_ob[var52] = (short) (var7.b(true) - 1);
			}

			if (this.bytes_ib != null) {
				if (this.shorts_ob[var52] != -1) {
					this.bytes_ib[var52] = (byte) (var8.j((byte) 106) - 1);
				} else {
					this.bytes_ib[var52] = -1;
				}
			}
		}

		var2.P = var34;
		var3.P = var29;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		int var56 = 0;

		int var58;
		int var59;
		for (int var57 = 0; var57 < var10; ++var57) {
			var58 = var3.j((byte) 122);
			if (var58 == 1) {
				var53 = var2.a(128) + var56;
				var54 = var2.a(128) + var53;
				var55 = var2.a(128) + var54;
				var56 = var55;
				this.ints_cb[var57] = var53;
				this.ints_tb[var57] = var54;
				this.ints_hb[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.a(128) + var56;
				var56 = var55;
				this.ints_cb[var57] = var53;
				this.ints_tb[var57] = var54;
				this.ints_hb[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.a(128) + var56;
				var56 = var55;
				this.ints_cb[var57] = var53;
				this.ints_tb[var57] = var54;
				this.ints_hb[var57] = var55;
			}

			if (var58 == 4) {
				var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.a(128) + var56;
				var56 = var55;
				this.ints_cb[var57] = var53;
				this.ints_tb[var57] = var59;
				this.ints_hb[var57] = var55;
			}
		}

		var2.P = var41;
		var3.P = var42;
		var4.P = var43;
		var5.P = var44;
		var6.P = var45;
		var7.P = var46;

		for (var58 = 0; var58 < var11; ++var58) {
			var59 = this.Tb[var58] & 255;
			if (var59 == 0) {
				this.Mb[var58] = (short) var2.b(true);
				this.Rb[var58] = (short) var2.b(true);
				this.shorts_gb[var58] = (short) var2.b(true);
			}

			if (var59 == 1) {
				this.Mb[var58] = (short) var3.b(true);
				this.Rb[var58] = (short) var3.b(true);
				this.shorts_gb[var58] = (short) var3.b(true);
				this.Ub[var58] = (short) var4.b(true);
				this.Fb[var58] = (short) var4.b(true);
				this.Lb[var58] = (short) var4.b(true);
				this.bytes_db[var58] = var5.m(3);
				this.Pb[var58] = var6.m(3);
				this.Eb[var58] = var7.m(3);
			}

			if (var59 == 2) {
				this.Mb[var58] = (short) var3.b(true);
				this.Rb[var58] = (short) var3.b(true);
				this.shorts_gb[var58] = (short) var3.b(true);
				this.Ub[var58] = (short) var4.b(true);
				this.Fb[var58] = (short) var4.b(true);
				this.Lb[var58] = (short) var4.b(true);
				this.bytes_db[var58] = var5.m(3);
				this.Pb[var58] = var6.m(3);
				this.Eb[var58] = var7.m(3);
				this.Bb[var58] = var7.m(3);
				this.Ib[var58] = var7.m(3);
			}

			if (var59 == 3) {
				this.Mb[var58] = (short) var3.b(true);
				this.Rb[var58] = (short) var3.b(true);
				this.shorts_gb[var58] = (short) var3.b(true);
				this.Ub[var58] = (short) var4.b(true);
				this.Fb[var58] = (short) var4.b(true);
				this.Lb[var58] = (short) var4.b(true);
				this.bytes_db[var58] = var5.m(3);
				this.Pb[var58] = var6.m(3);
				this.Eb[var58] = var7.m(3);
			}
		}

		var2.P = var26;
		var59 = var2.j((byte) 80);
		if (var59 != 0) {
			new ea();
			var2.b(true);
			var2.b(true);
			var2.b(true);
			var2.l(15);
		}

	}

	private final void i() {
		this.zb = null;
		this.hgs_mb = null;
		this.cas_vb = null;
		this.Db = false;
	}

	final void b(short var1, short var2) {
		if (this.shorts_ob != null) {
			for (int var3 = 0; var3 < this.int_sb; ++var3) {
				if (this.shorts_ob[var3] == var1) {
					this.shorts_ob[var3] = var2;
				}
			}

		}
	}

	final void j() {
		if (this.zb == null) {
			this.zb = new hg[this.Gb];

			for (int var1 = 0; var1 < this.Gb; ++var1) {
				this.zb[var1] = new hg();
			}

			for (int var2 = 0; var2 < this.int_sb; ++var2) {
				int var3 = this.ints_cb[var2];
				int var4 = this.ints_tb[var2];
				int var5 = this.ints_hb[var2];
				int var6 = this.Cb[var4] - this.Cb[var3];
				int var7 = this.ints_ab[var4] - this.ints_ab[var3];
				int var8 = this.ints_fb[var4] - this.ints_fb[var3];
				int var9 = this.Cb[var5] - this.Cb[var3];
				int var10 = this.ints_ab[var5] - this.ints_ab[var3];
				int var11 = this.ints_fb[var5] - this.ints_fb[var3];
				int var12 = var7 * var11 - var10 * var8;
				int var13 = var8 * var9 - var11 * var6;

				int var14;
				for (var14 = var6 * var10 - var9 * var7; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
					var12 >>= 1;
					var13 >>= 1;
				}

				int var15 = (int) Math.sqrt((double) (var12 * var12 + var13 * var13 + var14 * var14));
				if (var15 <= 0) {
					var15 = 1;
				}

				var12 = var12 * 256 / var15;
				var13 = var13 * 256 / var15;
				var14 = var14 * 256 / var15;
				byte var16;
				if (this.yb == null) {
					var16 = 0;
				} else {
					var16 = this.yb[var2];
				}

				if (var16 == 0) {
					hg var17 = this.zb[var3];
					var17.int_f += var12;
					var17.int_d += var13;
					var17.int_i += var14;
					++var17.int_b;
					var17 = this.zb[var4];
					var17.int_f += var12;
					var17.int_d += var13;
					var17.int_i += var14;
					++var17.int_b;
					var17 = this.zb[var5];
					var17.int_f += var12;
					var17.int_d += var13;
					var17.int_i += var14;
					++var17.int_b;
				} else if (var16 == 1) {
					if (this.cas_vb == null) {
						this.cas_vb = new ca[this.int_sb];
					}

					ca var18 = this.cas_vb[var2] = new ca();
					var18.int_k = var12;
					var18.int_f = var13;
					var18.int_e = var14;
				}
			}

		}
	}

	final void b(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Gb; ++var4) {
			this.Cb[var4] += var1;
			this.ints_ab[var4] += var2;
			this.ints_fb[var4] += var3;
		}

		this.i();
	}

	private final void k() {
		if (!this.Db) {
			this.Db = true;
			int var1 = 32767;
			int var2 = 32767;
			int var3 = 32767;
			int var4 = -32768;
			int var5 = -32768;
			int var6 = -32768;

			for (int var7 = 0; var7 < this.Gb; ++var7) {
				int var8 = this.Cb[var7];
				int var9 = this.ints_ab[var7];
				int var10 = this.ints_fb[var7];
				if (var8 < var1) {
					var1 = var8;
				}

				if (var8 > var4) {
					var4 = var8;
				}

				if (var9 < var2) {
					var2 = var9;
				}

				if (var9 > var5) {
					var5 = var9;
				}

				if (var10 < var3) {
					var3 = var10;
				}

				if (var10 > var6) {
					var6 = var10;
				}
			}

			this.short_kb = (short) var1;
			this.Ob = (short) var4;
			super.T = (short) var2;
			this.short_eb = (short) var5;
			this.short_jb = (short) var3;
			this.short_ub = (short) var6;
		}
	}

	private oe() {
	}

	private oe(byte[] var1) {
		if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.b(var1);
		} else {
			this.a(var1);
		}
	}

	oe(oe[] var1, int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.Gb = 0;
		this.int_sb = 0;
		this.int_lb = 0;
		this.byte_bb = -1;

		for (int var9 = 0; var9 < var2; ++var9) {
			oe var10 = var1[var9];
			if (var10 != null) {
				this.Gb += var10.Gb;
				this.int_sb += var10.int_sb;
				this.int_lb += var10.int_lb;
				if (var10.bytes_nb != null) {
					var4 = true;
				} else {
					if (this.byte_bb == -1) {
						this.byte_bb = var10.byte_bb;
					}

					if (this.byte_bb != var10.byte_bb) {
						var4 = true;
					}
				}

				var3 |= var10.yb != null;
				var5 |= var10.Qb != null;
				var6 |= var10.Nb != null;
				var7 |= var10.shorts_ob != null;
				var8 |= var10.bytes_ib != null;
			}
		}

		this.Cb = new int[this.Gb];
		this.ints_ab = new int[this.Gb];
		this.ints_fb = new int[this.Gb];
		this.Kb = new int[this.Gb];
		this.ints_cb = new int[this.int_sb];
		this.ints_tb = new int[this.int_sb];
		this.ints_hb = new int[this.int_sb];
		if (var3) {
			this.yb = new byte[this.int_sb];
		}

		if (var4) {
			this.bytes_nb = new byte[this.int_sb];
		}

		if (var5) {
			this.Qb = new byte[this.int_sb];
		}

		if (var6) {
			this.Nb = new int[this.int_sb];
		}

		if (var7) {
			this.shorts_ob = new short[this.int_sb];
		}

		if (var8) {
			this.bytes_ib = new byte[this.int_sb];
		}

		this.Sb = new short[this.int_sb];
		if (this.int_lb > 0) {
			this.Tb = new byte[this.int_lb];
			this.Mb = new short[this.int_lb];
			this.Rb = new short[this.int_lb];
			this.shorts_gb = new short[this.int_lb];
			this.Ub = new short[this.int_lb];
			this.Fb = new short[this.int_lb];
			this.Lb = new short[this.int_lb];
			this.bytes_db = new byte[this.int_lb];
			this.Pb = new byte[this.int_lb];
			this.Eb = new byte[this.int_lb];
			this.Bb = new byte[this.int_lb];
			this.Ib = new byte[this.int_lb];
		}

		this.Gb = 0;
		this.int_sb = 0;
		this.int_lb = 0;

		for (int var15 = 0; var15 < var2; ++var15) {
			oe var11 = var1[var15];
			if (var11 != null) {
				for (int var12 = 0; var12 < var11.int_sb; ++var12) {
					if (var3 && var11.yb != null) {
						this.yb[this.int_sb] = var11.yb[var12];
					}

					if (var4) {
						if (var11.bytes_nb != null) {
							this.bytes_nb[this.int_sb] = var11.bytes_nb[var12];
						} else {
							this.bytes_nb[this.int_sb] = var11.byte_bb;
						}
					}

					if (var5 && var11.Qb != null) {
						this.Qb[this.int_sb] = var11.Qb[var12];
					}

					if (var6 && var11.Nb != null) {
						this.Nb[this.int_sb] = var11.Nb[var12];
					}

					if (var7) {
						if (var11.shorts_ob != null) {
							this.shorts_ob[this.int_sb] = var11.shorts_ob[var12];
						} else {
							this.shorts_ob[this.int_sb] = -1;
						}
					}

					if (var8) {
						if (var11.bytes_ib != null && var11.bytes_ib[var12] != -1) {
							this.bytes_ib[this.int_sb] = (byte) (var11.bytes_ib[var12] + this.int_lb);
						} else {
							this.bytes_ib[this.int_sb] = -1;
						}
					}

					this.Sb[this.int_sb] = var11.Sb[var12];
					this.ints_cb[this.int_sb] = this.a(var11, var11.ints_cb[var12]);
					this.ints_tb[this.int_sb] = this.a(var11, var11.ints_tb[var12]);
					this.ints_hb[this.int_sb] = this.a(var11, var11.ints_hb[var12]);
					++this.int_sb;
				}

				for (int var13 = 0; var13 < var11.int_lb; ++var13) {
					byte var14 = this.Tb[this.int_lb] = var11.Tb[var13];
					if (var14 == 0) {
						this.Mb[this.int_lb] = (short) this.a(var11, var11.Mb[var13]);
						this.Rb[this.int_lb] = (short) this.a(var11, var11.Rb[var13]);
						this.shorts_gb[this.int_lb] = (short) this.a(var11, var11.shorts_gb[var13]);
					}

					if (var14 >= 1 && var14 <= 3) {
						this.Mb[this.int_lb] = var11.Mb[var13];
						this.Rb[this.int_lb] = var11.Rb[var13];
						this.shorts_gb[this.int_lb] = var11.shorts_gb[var13];
						this.Ub[this.int_lb] = var11.Ub[var13];
						this.Fb[this.int_lb] = var11.Fb[var13];
						this.Lb[this.int_lb] = var11.Lb[var13];
						this.bytes_db[this.int_lb] = var11.bytes_db[var13];
						this.Pb[this.int_lb] = var11.Pb[var13];
						this.Eb[this.int_lb] = var11.Eb[var13];
					}

					if (var14 == 2) {
						this.Bb[this.int_lb] = var11.Bb[var13];
						this.Ib[this.int_lb] = var11.Ib[var13];
					}

					++this.int_lb;
				}
			}
		}

	}

	oe(oe var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.Gb = var1.Gb;
		this.int_sb = var1.int_sb;
		this.int_lb = var1.int_lb;
		int var6;
		if (var2) {
			this.Cb = var1.Cb;
			this.ints_ab = var1.ints_ab;
			this.ints_fb = var1.ints_fb;
		} else {
			this.Cb = new int[this.Gb];
			this.ints_ab = new int[this.Gb];
			this.ints_fb = new int[this.Gb];

			for (var6 = 0; var6 < this.Gb; ++var6) {
				this.Cb[var6] = var1.Cb[var6];
				this.ints_ab[var6] = var1.ints_ab[var6];
				this.ints_fb[var6] = var1.ints_fb[var6];
			}
		}

		if (var3) {
			this.Sb = var1.Sb;
		} else {
			this.Sb = new short[this.int_sb];

			for (var6 = 0; var6 < this.int_sb; ++var6) {
				this.Sb[var6] = var1.Sb[var6];
			}
		}

		if (!var4 && var1.shorts_ob != null) {
			this.shorts_ob = new short[this.int_sb];

			for (var6 = 0; var6 < this.int_sb; ++var6) {
				this.shorts_ob[var6] = var1.shorts_ob[var6];
			}
		} else {
			this.shorts_ob = var1.shorts_ob;
		}

		if (var5) {
			this.Qb = var1.Qb;
		} else {
			this.Qb = new byte[this.int_sb];
			if (var1.Qb == null) {
				for (var6 = 0; var6 < this.int_sb; ++var6) {
					this.Qb[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.int_sb; ++var6) {
					this.Qb[var6] = var1.Qb[var6];
				}
			}
		}

		this.ints_cb = var1.ints_cb;
		this.ints_tb = var1.ints_tb;
		this.ints_hb = var1.ints_hb;
		this.yb = var1.yb;
		this.bytes_nb = var1.bytes_nb;
		this.bytes_ib = var1.bytes_ib;
		this.byte_bb = var1.byte_bb;
		this.Tb = var1.Tb;
		this.Mb = var1.Mb;
		this.Rb = var1.Rb;
		this.shorts_gb = var1.shorts_gb;
		this.Ub = var1.Ub;
		this.Fb = var1.Fb;
		this.Lb = var1.Lb;
		this.bytes_db = var1.bytes_db;
		this.Pb = var1.Pb;
		this.Eb = var1.Eb;
		this.Bb = var1.Bb;
		this.Ib = var1.Ib;
		this.Kb = var1.Kb;
		this.Nb = var1.Nb;
		this.ints_qb = var1.ints_qb;
		this.Vb = var1.Vb;
		this.zb = var1.zb;
		this.cas_vb = var1.cas_vb;
		this.hgs_mb = var1.hgs_mb;
		this.Ab = var1.Ab;
		this.short_wb = var1.short_wb;
	}

	static {
		Jb = nc.ints_bb;
		Hb = new int[10000];
		ints_pb = nc.X;
		int_rb = 0;
	}
}
