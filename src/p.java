final class p extends uc {

	static int int_vc = 0;
	static int int_wc;
	sd xc;
	static lf yc;
	static int zc;
	static int Ac = 20;
	static int Bc = 1;
	static int Cc;
	static int Dc = -1;
	static int Ec = 0;
	static int Fc;
	private static lf Gc = dd.a("Could not complete login)3", 2);
	static boolean Hc;
	static lf Ic = dd.a("me", 2);
	static int Jc;
	static oh cache15;

	static final j a(int var0, ja var1) {
		int var9 = client.int_gc;

		try {
			++zc;
			int var2 = var1.j((byte) 103);
			int var3 = var1.j((byte) 119);
			Class var4 = client.b(var3, -13);

			try {
				j var5 = (j) var4.newInstance();
				if (var0 >= -41) {
					Ac = 29;
				}

				if (var5 != null) {
					var5.B = var2;
					var5.A = var1.j((byte) 118);
					int var6 = var1.j((byte) 127);
					int var7 = 0;
					if (var9 != 0 || ~var7 > ~var6) {
						do {
							int var8 = var1.j((byte) 123);
							var5.a((byte) -123, var8, var1);
							++var7;
						} while (~var7 > ~var6);
					}
				}

				var5.c((int) 25614);
				return var5;
			} catch (IllegalAccessException var10) {
				throw new RuntimeException();
			} catch (InstantiationException var11) {
				throw new RuntimeException();
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "p.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		try {
			++Fc;
			if (this.xc != null) {
				bi var11 = super.int_bc != -1 && super.Ab == 0 ? client.a(12, super.int_bc) : null;
				bi var12 = super.Jb != -1 && (~super.Jb != ~super.int_ab || var11 == null) ? client.a(12, super.Jb) : null;
				ue var13 = this.xc.a(-107, var11, super.Db, super.int_ob, var12);
				if (var13 != null) {
					var13.a();
					super.T = var13.T;
					if (this.xc.short_lb != 0 && ~this.xc.Y != -1) {
						int var14 = nc.X[var1];
						int var15 = nc.ints_bb[var1];
						short var17 = this.xc.Y;
						int var19 = -var17 / 2;
						short var16 = this.xc.short_lb;
						int var18 = -var16 / 2;
						int var20 = var14 * var19 - -(var18 * var15) >> -3868688;
						int var23 = var16 / 2;
						int var21 = -(var18 * var14) + var19 * var15 >> -893100368;
						int var22 = bh.a(super.int_nc - -var21, false, hc.int_pb, super.int_fb - -var20);
						int var24 = -var17 / 2;
						int var25 = var23 * var15 + var24 * var14 >> 2023440432;
						int var26 = var15 * var24 - var14 * var23 >> -1218962096;
						int var28 = -var16 / 2;
						int var27 = bh.a(var26 + super.int_nc, false, hc.int_pb, var25 + super.int_fb);
						int var29 = var17 / 2;
						int var30 = var14 * var29 + var15 * var28 >> 1299653200;
						int var34 = var17 / 2;
						int var31 = -(var28 * var14) + var29 * var15 >> -1584115504;
						int var33 = var16 / 2;
						int var36 = -(var33 * var14) + var34 * var15 >> 2087305520;
						int var35 = var33 * var15 + var14 * var34 >> 1639978096;
						int var32 = bh.a(var31 + super.int_nc, false, hc.int_pb, var30 + super.int_fb);
						int var37 = bh.a(super.int_nc - -var36, false, hc.int_pb, super.int_fb + var35);
						int var38 = var27 <= var22 ? var27 : var22;
						int var39 = ~var37 >= ~var32 ? var37 : var32;
						int var40 = ~var27 <= ~var37 ? var37 : var27;
						int var41 = ~var22 > ~var32 ? var22 : var32;
						int var42 = (int) (Math.atan2((double) (-var39 + var38), (double) var17) * 320.0D) & 2047;
						int var44 = (var41 + var39 + var38 - -var40) / 4;
						var13.c(var42);
						int var43 = (int) (Math.atan2((double) (-var40 + var41), (double) var16) * 320.0D) & 2047;
						var13.d(var43);
						var13.a(0, var44 + -super.Ob, 0);
					}

					ue var46 = null;
					if (~super.Nb != 0 && ~super.int_cc != 0) {
						var46 = v.c(super.Nb, -18753).a(super.int_cc, 125);
						if (var46 != null) {
							var46.a(0, -super.int_lc, 0);
						}
					}

					if (var46 != null) {
						var13 = ((gf) var13).a(var46);
					}

					if (this.xc.int_ib == 1) {
						var13.boolean_hb = true;
					}

					var13.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
				}
			}
		} catch (RuntimeException var45) {
			throw ec.a(var45, "p.O(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}

	static final int a(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 'ﾀ') + var1;
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		try {
			++Cc;
			int var7 = 2047 & -var6 + 2048;
			int var8 = 2047 & 2048 + -var1;
			int var9 = 0;
			int var10 = 0;
			int var11 = var3;
			if (var0 <= 62) {
				d(true);
			}

			int var12;
			int var13;
			int var14;
			if (var7 != 0) {
				var13 = nc.ints_bb[var7];
				var12 = nc.X[var7];
				var14 = var10 * var13 + -(var3 * var12) >> 1366044944;
				var11 = var13 * var3 + var10 * var12 >> -1144257520;
				var10 = var14;
			}

			if (var8 != 0) {
				var13 = nc.ints_bb[var8];
				var12 = nc.X[var8];
				var14 = var13 * var9 + var12 * var11 >> -1497459376;
				var11 = var13 * var11 - var12 * var9 >> -437900080;
				var9 = var14;
			}

			dh.int_i = var5 + -var9;
			mb.A = -var11 + var2;
			pd.int_c = var1;
			hc.int_hb = var6;
			nd.y = -var10 + var4;
		} catch (RuntimeException var15) {
			throw ec.a(var15, "p.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}

	final boolean c(int var1) {
		try {
			++Jc;
			if (var1 != 0) {
				Ec = -33;
			}

			return this.xc != null;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "p.C(" + var1 + ')');
		}
	}

	public static void d(boolean var0) {
		try {
			yc = null;
			cache15 = null;
			Gc = null;
			if (var0) {
				Ic = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "p.A(" + var0 + ')');
		}
	}

	static {
		yc = Gc;
		Hc = false;
	}
}
