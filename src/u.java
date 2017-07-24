final class u extends uc {

	int int_vc;
	static int[][][] vertexHeights = new int[4][105][105];
	int xc;
	static int yc;
	static int zc;
	static lf Ac;
	static lf Bc = dd.a("<col=00ff80>", 2);
	int Cc;
	lf Dc;
	ue Ec;
	boolean Fc = false;
	int Gc;
	private static lf Hc = dd.a("Choose Option", 2);
	private static lf Ic = dd.a(" more options", 2);
	private static lf Jc = dd.a("Prepared sound engine", 2);
	static int[] Kc = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
	int Lc = 0;
	int Mc = -1;
	static lf Nc;
	int Oc = 0;
	static lf Pc = dd.a(" Sekunde(Xn(Y -Ubertragen)3", 2);
	static int Qc;
	static lf Rc;
	private short Sc = 0;
	int Tc = -1;
	int Uc;
	private short Vc = 0;
	static int Wc;
	int Xc = 0;
	static int Yc;
	int Zc;
	static int int_ad;
	static int int_bd;
	static int int_cd;
	static lf lf_dd;
	int int_ed;
	int int_fd = 0;
	static int int_gd;
	int int_hd = 0;
	be be_id;
	static lf lf_jd;

	final void a(boolean var1, ja class_ja) {
		int dummy = client.int_gc;

		try {
			++Qc;
			class_ja.P = 0;
			int gender = class_ja.j((byte) 118);
			if ((2 & gender) != 2) {
				this.Sc = 0;
				this.Vc = 0;
			} else {
				this.Sc = (short) (class_ja.j((byte) 113) << 2);
				this.Vc = (short) (class_ja.j((byte) 126) << 2);
			}

			int var4 = gender & 1;
			super.int_qc = 1 + (gender >> 3);
			boolean var5 = (gender & 4) != 0;
			this.Mc = class_ja.m(3);
			int var6 = -1;
			int[] var7 = new int[12];
			this.Tc = class_ja.m(3);
			this.Lc = 0;
			int var8 = 0;
			int var10;
			int var11;
			do {
				int var9 = class_ja.j((byte) 75);
				if (var9 == 0) {
					var7[var8] = 0;
				} else {
					var10 = class_ja.j((byte) 95);
					var11 = var10 + (var9 << 8);
					if (var8 == 0 && var11 == 65535) {
						var6 = class_ja.b(true);
						break;
					} else {
						if (var11 >= '耀') {
							var11 = w.ints_g[var11 - '耀'];
							var7[var8] = d.c(var11, 1073741824);
							int var12 = ng.a(var11, -4).Cb;
							if (var12 != 0) {
								this.Lc = var12;
							}
						} else {
							var7[var8] = d.c(-256 + var11, Integer.MIN_VALUE);
						}
					}
				}

				++var8;
			} while (var8 < 12);

			int[] var15 = new int[5];
			var10 = 0;
			while (var10 < 5) {
				var11 = class_ja.j((byte) 123);
				if (var11 < 0 || ~ic.C[var10].length >= ~var11) {
					var11 = 0;
				}

				var15[var10] = var11;
				++var10;
			}

			super.int_ab = class_ja.b(true);
			if (super.int_ab == '\uffff') {
				super.int_ab = -1;
			}

			super.int_eb = class_ja.b(var1);
			if (super.int_eb == '\uffff') {
				super.int_eb = -1;
			}

			super.Eb = super.int_eb;
			super.int_uc = class_ja.b(var1);
			if (super.int_uc == '\uffff') {
				super.int_uc = -1;
			}

			super.int_pb = class_ja.b(var1);
			if (super.int_pb == '\uffff') {
				super.int_pb = -1;
			}

			super.zb = class_ja.b(var1);
			if (super.zb == '\uffff') {
				super.zb = -1;
			}

			super.int_hc = class_ja.b(var1);
			if (~super.int_hc == -65536) {
				super.int_hc = -1;
			}

			super.Rb = class_ja.b(true);
			if (~super.Rb == -65536) {
				super.Rb = -1;
			}

			this.Dc = of.a((byte) 113, class_ja.i(-1495411552)).e(true);
			this.Xc = class_ja.j((byte) 71);
			if (var5) {
				this.int_hd = class_ja.b(true);
			}

			if (this.be_id == null) {
				this.be_id = new be();
			}

			this.be_id.a(var6, var4 == 1, var7, (byte) 110, var15);
		} catch (RuntimeException var14) {
			throw ec.a(var14, "u.F(" + var1 + ',' + (class_ja != null ? "{...}" : "null") + ')');
		}
	}

	final boolean c(int var1) {
		try {
			++Yc;
			return var1 != 0 ? true : this.be_id != null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "u.C(" + var1 + ')');
		}
	}

	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		int var45 = client.int_gc;

		try {
			++zc;
			if (this.be_id != null) {
				bi var11 = ~super.int_bc != 0 && ~super.Ab == -1 ? client.a(12, super.int_bc) : null;
				bi var12 = super.Jb != -1 && !this.Fc && (super.Jb != super.int_ab || var11 == null) ? client.a(12, super.Jb) : null;
				ue var13 = this.be_id.a(super.Db, super.int_ob, var11, var12, (byte) 48);
				if (var13 != null) {
					var13.a();
					super.T = var13.T;
					if (this.Sc != 0 && this.Vc != 0) {
						int var14 = nc.X[var1];
						int var15 = nc.ints_bb[var1];
						short var16 = this.Sc;
						short var17 = this.Vc;
						int var19 = -var17 / 2;
						int var18 = -var16 / 2;
						int var20 = var14 * var19 + var18 * var15 >> 16;
						int var21 = -(var14 * var18) + var15 * var19 >> 16;
						int var22 = bh.a(super.int_nc - -var21, false, hc.int_pb, super.int_fb + var20);
						int var23 = var16 / 2;
						int var24 = -var17 / 2;
						int var25 = var23 * var15 + var14 * var24 >> 16;
						int var26 = var15 * var24 - var23 * var14 >> 16;
						int var28 = -var16 / 2;
						int var29 = var17 / 2;
						int var27 = bh.a(super.int_nc + var26, false, hc.int_pb, super.int_fb - -var25);
						int var31 = var29 * var15 - var14 * var28 >> 16;
						int var30 = var15 * var28 + var14 * var29 >> 16;
						int var32 = bh.a(var31 + super.int_nc, false, hc.int_pb, var30 + super.int_fb);
						int var33 = var16 / 2;
						int var34 = var17 / 2;
						int var35 = var34 * var14 - -(var33 * var15) >> 16;
						int var36 = var15 * var34 - var33 * var14 >> 16;
						int var37 = bh.a(var36 + super.int_nc, false, hc.int_pb, super.int_fb - -var35);
						int var40 = var37 <= var27 ? var37 : var27;
						int var38 = ~var27 < ~var22 ? var22 : var27;
						int var41 = ~var22 <= ~var32 ? var32 : var22;
						int var39 = var32 < var37 ? var32 : var37;
						int var42 = (int) (320.0D * Math.atan2((double) (-var39 + var38), (double) var17)) & 2047;
						var13.c(var42);
						int var43 = (int) (320.0D * Math.atan2((double) (-var40 + var41), (double) var16)) & 2047;
						var13.d(var43);
						int var44 = (var38 + var39 + var40 - -var41) / 4;
						var13.a(0, -super.Ob + var44, 0);
					}

					ue var48 = null;
					ue var47 = null;
					if (!this.Fc && super.Nb != -1 && ~super.int_cc != 0) {
						var47 = v.c(super.Nb, -18753).a(super.int_cc, 101);
						if (var47 != null) {
							var47.a(0, -super.int_lc, 0);
						}
					}

					if (!this.Fc && this.Ec != null) {
						if (~pd.int_i <= ~this.Oc) {
							this.Ec = null;
						}

						if (this.int_fd <= pd.int_i && this.Oc > pd.int_i) {
							label108:
							{
								var48 = this.Ec;
								var48.a(this.Cc + -super.int_fb, -super.Ob + this.int_ed, this.Zc - super.int_nc);
								if (super.int_ec != 512) {
									if (~super.int_ec != -1025) {
										if (~super.int_ec != -1537) {
											break label108;
										}

										var48.f();
										if (var45 == 0) {
											break label108;
										}
									}

									var48.f();
									var48.f();
									if (var45 == 0) {
										break label108;
									}
								}

								var48.f();
								var48.f();
								var48.f();
							}
						}
					}

					if (var47 != null) {
						var13 = ((gf) var13).a(var47);
					}

					if (var48 != null) {
						var13 = ((gf) var13).a(var48);
					}

					var13.boolean_hb = true;
					var13.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
					if (var48 != null) {
						label94:
						{
							if (super.int_ec != 512) {
								if (super.int_ec != 1024) {
									if (super.int_ec != 1536) {
										break label94;
									}

									var48.f();
									var48.f();
									var48.f();
									if (var45 == 0) {
										break label94;
									}
								}

								var48.f();
								var48.f();
								if (var45 == 0) {
									break label94;
								}
							}

							var48.f();
						}

						var48.a(super.int_fb - this.Cc, -this.int_ed + super.Ob, super.int_nc - this.Zc);
					}
				}
			}
		} catch (RuntimeException var46) {
			throw ec.a(var46, "u.O(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static final lf a(int var0, int var1) {
		try {
			if (var0 != -13) {
				return null;
			} else {
				++Wc;
				lf var2 = new lf();
				var2.S = 0;
				var2.Y = new byte[var1];
				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "u.E(" + var0 + ',' + var1 + ')');
		}
	}

	static final void a(boolean var0, int var1, int var2, int var3) {
		int var6 = client.int_gc;

		try {
			int var4 = 0;
			int var5;
			if (var6 != 0) {
				var5 = 0;
				if (var6 == 0 && var5 >= 8) {
					++var4;
				} else {
					while (true) {
						vertexHeights[var1][var2 + var4][var5 + var3] = 0;
						++var5;
						if (var5 >= 8) {
							++var4;
							break;
						}
					}
				}
			}

			while (var4 < 8) {
				var5 = 0;
				if (var6 == 0 && var5 >= 8) {
					++var4;
				} else {
					do {
						vertexHeights[var1][var2 + var4][var5 + var3] = 0;
						++var5;
					} while (var5 < 8);

					++var4;
				}
			}

			if (var2 > 0) {
				var5 = 1;
				if (var6 != 0 || var5 < 8) {
					do {
						vertexHeights[var1][var2][var3 + var5] = vertexHeights[var1][var2 - 1][var3 + var5];
						++var5;
					} while (var5 < 8);
				}
			}

			if (var3 > 0) {
				var5 = 1;
				if (var6 != 0 || var5 < 8) {
					do {
						vertexHeights[var1][var5 + var2][var3] = vertexHeights[var1][var2 - -var5][var3 + -1];
						++var5;
					} while (var5 < 8);
				}
			}

			if (!var0) {
				++int_gd;
				if (var2 > 0 && ~vertexHeights[var1][-1 + var2][var3] != -1) {
					vertexHeights[var1][var2][var3] = vertexHeights[var1][-1 + var2][var3];
				} else if (~var3 < -1 && ~vertexHeights[var1][var2][-1 + var3] != -1) {
					vertexHeights[var1][var2][var3] = vertexHeights[var1][var2][-1 + var3];
				} else if (~var2 < -1 && var3 > 0 && vertexHeights[var1][var2 - 1][var3 + -1] != 0) {
					vertexHeights[var1][var2][var3] = vertexHeights[var1][var2 - 1][var3 - 1];
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "u.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void e(byte var0) {
		try {
			lf_jd = null;
			Jc = null;
			Bc = null;
			Rc = null;
			Ic = null;
			Ac = null;
			Nc = null;
			vertexHeights = null;
			if (var0 >= -101) {
				Jc = null;
			}

			Hc = null;
			Kc = null;
			Pc = null;
			lf_dd = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "u.D(" + var0 + ')');
		}
	}

	static final void a() {
		int var0 = l.ints_e[wg.int_n];
		rg[] var1 = l.rgs_j[wg.int_n];
		nd.int_r = 0;

		for (int var2 = 0; var2 < var0; ++var2) {
			rg var3 = var1[var2];
			int var4;
			int var5;
			int var6;
			boolean var7;
			int var8;
			if (var3.int_d == 1) {
				var4 = var3.A - ra.int_ab + ce.Q;
				if (var4 >= 0 && var4 <= ce.Q + ce.Q) {
					var5 = var3.int_o - d.Z + ce.Q;
					if (var5 < 0) {
						var5 = 0;
					}

					var6 = var3.int_j - d.Z + ce.Q;
					if (var6 > ce.Q + ce.Q) {
						var6 = ce.Q + ce.Q;
					}

					var7 = false;

					while (var5 <= var6) {
						if (of.booleans_w[var4][var5++]) {
							var7 = true;
							break;
						}
					}

					if (var7) {
						var8 = bg.int_l - var3.B;
						if (var8 > 32) {
							var3.int_h = 1;
						} else {
							if (var8 >= -32) {
								continue;
							}

							var3.int_h = 2;
							var8 = -var8;
						}

						var3.int_v = (var3.y - pe.int_l << 8) / var8;
						var3.int_n = (var3.int_g - pe.int_l << 8) / var8;
						var3.int_i = (var3.x - tc.int_lb << 8) / var8;
						var3.z = (var3.int_u - tc.int_lb << 8) / var8;
						ig.rgs_c[nd.int_r++] = var3;
					}
				}
			} else if (var3.int_d == 2) {
				var4 = var3.int_o - d.Z + ce.Q;
				if (var4 >= 0 && var4 <= ce.Q + ce.Q) {
					var5 = var3.A - ra.int_ab + ce.Q;
					if (var5 < 0) {
						var5 = 0;
					}

					var6 = var3.int_w - ra.int_ab + ce.Q;
					if (var6 > ce.Q + ce.Q) {
						var6 = ce.Q + ce.Q;
					}

					var7 = false;

					while (var5 <= var6) {
						if (of.booleans_w[var5++][var4]) {
							var7 = true;
							break;
						}
					}

					if (var7) {
						var8 = pe.int_l - var3.y;
						if (var8 > 32) {
							var3.int_h = 3;
						} else {
							if (var8 >= -32) {
								continue;
							}

							var3.int_h = 4;
							var8 = -var8;
						}

						var3.int_r = (var3.B - bg.int_l << 8) / var8;
						var3.int_a = (var3.int_q - bg.int_l << 8) / var8;
						var3.int_i = (var3.x - tc.int_lb << 8) / var8;
						var3.z = (var3.int_u - tc.int_lb << 8) / var8;
						ig.rgs_c[nd.int_r++] = var3;
					}
				}
			} else if (var3.int_d == 4) {
				var4 = var3.x - tc.int_lb;
				if (var4 > 128) {
					var5 = var3.int_o - d.Z + ce.Q;
					if (var5 < 0) {
						var5 = 0;
					}

					var6 = var3.int_j - d.Z + ce.Q;
					if (var6 > ce.Q + ce.Q) {
						var6 = ce.Q + ce.Q;
					}

					if (var5 <= var6) {
						int var12 = var3.A - ra.int_ab + ce.Q;
						if (var12 < 0) {
							var12 = 0;
						}

						var8 = var3.int_w - ra.int_ab + ce.Q;
						if (var8 > ce.Q + ce.Q) {
							var8 = ce.Q + ce.Q;
						}

						boolean var9 = false;

						label108:
						for (int var10 = var12; var10 <= var8; ++var10) {
							for (int var11 = var5; var11 <= var6; ++var11) {
								if (of.booleans_w[var10][var11]) {
									var9 = true;
									break label108;
								}
							}
						}

						if (var9) {
							var3.int_h = 5;
							var3.int_r = (var3.B - bg.int_l << 8) / var4;
							var3.int_a = (var3.int_q - bg.int_l << 8) / var4;
							var3.int_v = (var3.y - pe.int_l << 8) / var4;
							var3.int_n = (var3.int_g - pe.int_l << 8) / var4;
							ig.rgs_c[nd.int_r++] = var3;
						}
					}
				}
			}
		}

	}

	static {
		lf_dd = Ic;
		int_cd = 0;
		int_bd = 0;
		Ac = dd.a("Hidden)2", 2);
		Nc = Hc;
		Rc = dd.a("Neuer Benutzer", 2);
		lf_jd = Jc;
	}
}
