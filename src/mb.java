final class mb extends hb {

	short[] shorts_n;
	int int_o;
	static int int_p;
	byte[] bytes_q;
	byte[] bytes_r;
	ne[] nes_s;
	static int int_t;
	private int[] ints_u;
	k[] ks_v;
	byte[] bytes_w;
	static int x;
	static lf[] y = new lf[200];
	static int z;
	static int A;

	static void a(int[] visibilityMapData, int var1, int var2, int var3, int var4, int var5, int var6) {
		ce.Q = var5;
		cb.booleans_p = new boolean[8][32][ce.Q + ce.Q + 1][ce.Q + ce.Q + 1];
		cc.int_cb = 0;
		ec.int_ab = 0;
		v.int_vb = var3;
		ng.X = var4;
		o.int_f = var3 / 2;
		ac.O = var4 / 2;
		boolean[][][][] booleanArray = new boolean[9][32][ce.Q + ce.Q + 3][ce.Q + ce.Q + 3];
		for (int var8 = 128; var8 <= 384; var8 += 32) {
			for (int var9 = 0; var9 < 2048; var9 += 64) {
				pc.int_b = nc.X[var8];
				mf.C = nc.ints_bb[var8];
				ua.Q = nc.X[var9];
				ei.int_e = nc.ints_bb[var9];
				int var10 = (var8 - 128) / 32;
				int var11 = var9 / 64;
				for (int var12 = -(ce.Q + 1); var12 <= ce.Q + 1; ++var12) {
					for (int var13 = -(ce.Q + 1); var13 <= ce.Q + 1; ++var13) {
						int var14 = var12 * 128;
						int var15 = var13 * 128;
						boolean var16 = false;
						for (int var17 = -var1; var17 <= var2; var17 += 128) {
							if (hg.a(var14, visibilityMapData[var10] + var17, var15, var6)) {
								var16 = true;
								break;
							}
						}

						booleanArray[var10][var11][var12 + ce.Q + 1][var13 + ce.Q + 1] = var16;
					}
				}
			}
		}

		for (int var9 = 0; var9 < 8; ++var9) {
			for (int var10 = 0; var10 < 32; ++var10) {
				for (int var11 = -ce.Q; var11 < ce.Q; ++var11) {
					for (int var12 = -ce.Q; var12 < ce.Q; ++var12) {
						boolean var18 = false;
						for (int var14 = -1; var14 <= 1; ++var14) {
							for (int var15 = -1; var15 <= 1; ++var15) {
								if (booleanArray[var9][var10][var11 + var14 + ce.Q + 1][var12 + var15 + ce.Q + 1]) {
									var18 = true;
									break;
								} else if (booleanArray[var9][(var10 + 1) % 31][var11 + var14 + ce.Q + 1][var12 + var15 + ce.Q + 1]) {
									var18 = true;
									break;
								} else if (booleanArray[var9 + 1][var10][var11 + var14 + ce.Q + 1][var12 + var15 + ce.Q + 1]) {
									var18 = true;
									break;
								} else if (booleanArray[var9 + 1][(var10 + 1) % 31][var11 + var14 + ce.Q + 1][var12 + var15 + ce.Q + 1]) {
									var18 = true;
									break;
								}
							}
						}

						cb.booleans_p[var9][var10][var11 + ce.Q][var12 + ce.Q] = var18;
					}
				}
			}
		}
	}

	final boolean a(int var1, byte[] var2, cb var3, int[] var4) {
		try {
			if (var1 != -8812) {
				b(49);
			}

			k var7 = null;
			++x;
			boolean var5 = true;
			int var6 = 0;

			for (int var8 = 0; ~var8 > -129; ++var8) {
				if (var2 == null || ~var2[var8] != -1) {
					int var9 = this.ints_u[var8];
					if (var9 != 0) {
						if (var6 != var9) {
							var6 = var9--;
							if (~(var9 & 1) != -1) {
								var7 = var3.a(1, var9 >> 2, var4);
							} else {
								var7 = var3.a(var4, (byte) -120, var9 >> 2);
							}

							if (var7 == null) {
								var5 = false;
							}
						}

						if (var7 != null) {
							this.ks_v[var8] = var7;
							this.ints_u[var8] = 0;
						}
					}
				}
			}

			return var5;
		} catch (RuntimeException var11) {
			throw ec.a(var11, "mb.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	static void a(int var0) {
		try {
			++int_p;
			int var2 = -35 % ((var0 - -12) / 41);
			ic class_ic = (ic) ef.tf_i.c(121);
			if (class_ic != null) {
				do {
					if (class_ic.x > 0) {
						--class_ic.x;
					}

					if (class_ic.x == 0) {
						if (class_ic.int_q < 0 || cf.a(class_ic.int_u, true, class_ic.int_q)) {
							di.a(class_ic.int_n, class_ic.int_o, class_ic.int_s, true, class_ic.int_u, class_ic.E, class_ic.int_w, class_ic.int_q);
							class_ic.a(true);
						}
					} else {
						if (class_ic.D > 0) {
							--class_ic.D;
						}

						if (class_ic.D == 0 && class_ic.int_s >= 1 && class_ic.int_n >= 1
								&& class_ic.int_s <= 102 && class_ic.int_n <= 102
								&& (class_ic.int_v < 0 || cf.a(class_ic.y, true, class_ic.int_v))) {
							di.a(class_ic.int_n, class_ic.int_o, class_ic.int_s, true, class_ic.y, class_ic.E, class_ic.z, class_ic.int_v);
							class_ic.D = -1;
							if (class_ic.int_v != class_ic.int_q || class_ic.int_q != -1) {
								if (class_ic.int_v == class_ic.int_q && class_ic.z == class_ic.int_w && class_ic.y == class_ic.int_u) {
									class_ic.a(true);
								}
							} else {
								class_ic.a(true);
							}
						}
					}

					class_ic = (ic) ef.tf_i.d(-1);
				} while (class_ic != null);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "mb.D(" + var0 + ')');
		}
	}

	public static void b(int var0) {
		try {
			y = null;
			if (var0 != 2) {
				A = 87;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "mb.A(" + var0 + ')');
		}
	}

	static lf a(int var0, byte var1) {
		try {
			if (var1 > -34) {
				a(105, (byte) 52);
			}

			++z;
			return th.lfs_a[var0].e(-30593) > 0 ? de.a(new lf[]{mc.z[var0], dc.R, th.lfs_a[var0]}, 115) : mc.z[var0];
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mb.C(" + var0 + ',' + var1 + ')');
		}
	}

	final void c(byte var1) {
		try {
			if (var1 == 53) {
				this.ints_u = null;
				++int_t;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "mb.F(" + var1 + ')');
		}
	}

	public mb() {
	}

	mb(byte[] var1) {
		try {
			this.shorts_n = new short[128];
			this.nes_s = new ne[128];
			int var3 = 0;
			this.ks_v = new k[128];
			this.bytes_w = new byte[128];
			this.bytes_r = new byte[128];
			this.ints_u = new int[128];
			this.bytes_q = new byte[128];
			ja var2 = new ja(var1);
			while (var2.yb[var2.P + var3] != 0) {
				++var3;
			}

			byte[] var4 = new byte[var3];
			int var5 = 0;
			while (var5 < var3) {
				var4[var5] = var2.m(3);
				++var5;
			}

			++var2.P;
			++var3;
			int var6 = var2.P;
			var2.P += var3;
			int var7 = 0;
			while (var2.yb[var7 + var2.P] != 0) {
				++var7;
			}

			byte[] var8 = new byte[var7];
			int var9 = 0;
			while (var7 > var9) {
				var8[var9] = var2.m(3);
				++var9;
			}

			++var2.P;
			int var10 = var2.P;
			int var11 = 0;
			++var7;
			var2.P += var7;
			while (var2.yb[var11 + var2.P] != 0) {
				++var11;
			}

			byte[] var12 = new byte[var11];
			int var13 = 0;
			while (var13 < var11) {
				var12[var13] = var2.m(3);
				++var13;
			}

			int var15;
			int var17;
			int var18;
			++var2.P;
			++var11;
			byte[] var14 = new byte[var11];
			if (var11 > 1) {
				var14[1] = 1;
				int var16 = 1;
				var15 = 2;
				var17 = 2;
				if (var17 < var11) {
					do {
						var18 = var2.j((byte) 76);
						if (var18 == 0) {
							var16 = var15++;
						} else {
							if (var16 >= var18) {
								--var18;
							}

							var16 = var18;
						}

						var14[var17] = (byte) var16;
						++var17;
					} while (var17 < var11);
				}
			} else {
				var15 = var11;
			}

			ne[] var55 = new ne[var15];
			var17 = 0;
			int var19;
			ne var56;
			for (; var55.length > var17; ++var17) {
				var56 = var55[var17] = new ne();
				var19 = var2.j((byte) 69);
				if (var19 > 0) {
					var56.bytes_i = new byte[var19 * 2];
				}

				var19 = var2.j((byte) 79);
				if (var19 > 0) {
					var56.bytes_u = new byte[2 + var19 * 2];
					var56.bytes_u[1] = 64;
				}
			}

			var18 = var2.j((byte) 91);
			byte[] var57 = var18 <= 0 ? null : new byte[2 * var18];
			int var21 = 0;
			var18 = var2.j((byte) 124);
			byte[] var20 = var18 <= 0 ? null : new byte[var18 * 2];
			while (var2.yb[var21 + var2.P] != 0) {
				++var21;
			}

			byte[] var22 = new byte[var21];
			int var23 = 0;
			if (var21 > var23) {
				do {
					var22[var23] = var2.m(3);
					++var23;
				} while (var21 > var23);
			}

			++var21;
			int var24 = 0;
			++var2.P;
			int var25 = 0;
			while (var25 < 128) {
				var24 += var2.j((byte) 127);
				this.shorts_n[var25] = (short) var24;
				++var25;
			}

			var24 = 0;
			int var26 = 0;
			if (var26 < 128) {
				do {
					var24 += var2.j((byte) 77);
					this.shorts_n[var26] = (short) (this.shorts_n[var26] + (var24 << 8));
					++var26;
				} while (var26 < 128);
			}

			int var27 = 0;
			int var28 = 0;
			int var29 = 0;
			int var30 = 0;
			while (var30 < 128) {
				if (var27 == 0) {
					if (var28 < var22.length) {
						var27 = var22[var28++];
					} else {
						var27 = -1;
					}

					var29 = var2.c(116);
				}

				--var27;
				this.shorts_n[var30] = (short) (this.shorts_n[var30] + (sd.a(2, var29 - 1) << 14));
				this.ints_u[var30] = var29;
				++var30;
			}

			var27 = 0;
			var28 = 0;
			int var31 = 0;
			int var32 = 0;
			if (var32 < 128) {
				do {
					if (this.ints_u[var32] != 0) {
						if (var27 == 0) {
							if (var28 >= var4.length) {
								var27 = -1;
							} else {
								var27 = var4[var28++];
							}

							var31 = -1 + var2.yb[var6++];
						}

						this.bytes_q[var32] = (byte) var31;
						--var27;
					}

					++var32;
				} while (var32 < 128);
			}

			var28 = 0;
			int var33 = 0;
			var27 = 0;
			int var34 = 0;
			for (; var34 < 128; ++var34) {
				if (this.ints_u[var34] != 0) {
					if (var27 == 0) {
						var33 = 16 + var2.yb[var10++] << 2;
						if (var8.length <= var28) {
							var27 = -1;
						} else {
							var27 = var8[var28++];
						}
					}

					--var27;
					this.bytes_w[var34] = (byte) var33;
				}
			}

			ne var35 = null;
			var28 = 0;
			var27 = 0;

			for (int var36 = 0; var36 < 128; ++var36) {
				if (this.ints_u[var36] != 0) {
					if (var27 == 0) {
						var35 = var55[var14[var28]];
						if (var12.length <= var28) {
							var27 = -1;
						} else {
							var27 = var12[var28++];
						}
					}

					this.nes_s[var36] = var35;
					--var27;
				}
			}

			var27 = 0;
			var28 = 0;
			int var37 = 0;
			int var38 = 0;
			if (var38 < 128) {
				do {
					if (var27 == 0) {
						if (var22.length > var28) {
							var27 = var22[var28++];
						} else {
							var27 = -1;
						}

						if (this.ints_u[var38] > 0) {
							var37 = var2.j((byte) 115) + 1;
						}
					}

					this.bytes_r[var38] = (byte) var37;
					--var27;
					++var38;
				} while (var38 < 128);
			}

			this.int_o = var2.j((byte) 119) + 1;
			int var39 = 0;
			ne var40;
			int var41;
			for (; var15 > var39; ++var39) {
				var40 = var55[var39];
				if (var40.bytes_i != null) {
					var41 = 1;
					while (var40.bytes_i.length > var41) {
						var40.bytes_i[var41] = var2.m(3);
						var41 += 2;
					}
				}

				if (var40.bytes_u != null) {
					var41 = 3;
					while (var41 < var40.bytes_u.length - 2) {
						var40.bytes_u[var41] = var2.m(3);
						var41 += 2;
					}
				}
			}

			int var60;
			if (var57 != null) {
				var60 = 1;
				if (var60 < var57.length) {
					do {
						var57[var60] = var2.m(3);
						var60 += 2;
					} while (var60 < var57.length);
				}
			}

			if (var20 != null) {
				var60 = 1;
				if (var60 < var20.length) {
					do {
						var20[var60] = var2.m(3);
						var60 += 2;
					} while (var60 < var20.length);
				}
			}

			var60 = 0;
			int var42;
			if (var60 < var15) {
				do {
					ne var64 = var55[var60];
					if (var64.bytes_u != null) {
						var24 = 0;
						var42 = 2;
						if (var42 < var64.bytes_u.length) {
							do {
								var24 += var2.j((byte) 71) + 1;
								var64.bytes_u[var42] = (byte) var24;
								var42 += 2;
							} while (var42 < var64.bytes_u.length);
						}
					}

					++var60;
				} while (var60 < var15);
			}

			var41 = 0;
			int var43;
			ne var61;
			for (; var15 > var41; ++var41) {
				var61 = var55[var41];
				if (var61.bytes_i != null) {
					var24 = 0;
					var43 = 2;
					if (var61.bytes_i.length > var43) {
						do {
							var24 += var2.j((byte) 119) + 1;
							var61.bytes_i[var43] = (byte) var24;
							var43 += 2;
						} while (var61.bytes_i.length > var43);
					}
				}
			}

			int var45;
			int var46;
			byte var47;
			int var49;
			int var50;
			int var51;
			byte var62;
			int var66;
			if (var57 != null) {
				var24 = var2.j((byte) 94);
				var57[0] = (byte) var24;
				var42 = 2;
				if (var42 < var57.length) {
					do {
						var24 = var24 + 1 + var2.j((byte) 119);
						var57[var42] = (byte) var24;
						var42 += 2;
					} while (var42 < var57.length);
				}

				var62 = var57[0];
				byte var44 = var57[1];
				var45 = 0;
				if (var45 < var62) {
					do {
						this.bytes_r[var45] = (byte) (var44 * this.bytes_r[var45] + 32 >> 6);
						++var45;
					} while (var45 < var62);
				}

				var46 = 2;
				if (var46 < var57.length) {
					do {
						var47 = var57[var46];
						byte var48 = var57[var46 + 1];
						var46 += 2;
						var49 = var44 * (-var62 + var47) + (var47 - var62) / 2;
						var50 = var62;
						if (var47 <= var62) {
							var62 = var47;
							var44 = var48;
						} else {
							do {
								var51 = nh.a(var49, (byte) -113, var47 + -var62);
								var49 += -var44 + var48;
								this.bytes_r[var50] = (byte) (32 + var51 * this.bytes_r[var50] >> 6);
								++var50;
							} while (var47 > var50);

							var62 = var47;
							var44 = var48;
						}
					} while (var46 < var57.length);
				}

				var66 = var62;
				if (var62 < 128) {
					do {
						this.bytes_r[var66] = (byte) (this.bytes_r[var66] * var44 + 32 >> 6);
						++var66;
					} while (var66 < 128);
				}
			}

			int var63;
			if (var20 != null) {
				var24 = var2.j((byte) 121);
				var20[0] = (byte) var24;
				var42 = 2;
				if (var42 < var20.length) {
					do {
						var24 = var2.j((byte) 86) + var24 + 1;
						var20[var42] = (byte) var24;
						var42 += 2;
					} while (var42 < var20.length);
				}

				var63 = var20[1] << 1;
				var62 = var20[0];
				var45 = 0;
				if (var62 > var45) {
					do {
						var46 = var63 + (this.bytes_w[var45] & 255);
						if (var46 < 0) {
							var46 = 0;
						}

						if (var46 > 128) {
							var46 = 128;
						}

						this.bytes_w[var45] = (byte) var46;
						++var45;
					} while (var62 > var45);
				}

				var46 = 2;
				int var67;
				if (var46 < var20.length) {
					do {
						var47 = var20[var46];
						var67 = var20[1 + var46] << 1;
						var46 += 2;
						var49 = (-var62 + var47) / 2 + var63 * (var47 - var62);
						var50 = var62;
						if (var62 >= var47) {
							var62 = var47;
							var63 = var67;
						} else {
							do {
								var51 = nh.a(var49, (byte) -113, -var62 + var47);
								var49 += -var63 + var67;
								int var52 = var51 + (this.bytes_w[var50] & 255);
								if (var52 < 0) {
									var52 = 0;
								}

								if (var52 > 128) {
									var52 = 128;
								}

								this.bytes_w[var50] = (byte) var52;
								++var50;
							} while (var50 < var47);

							var62 = var47;
							var63 = var67;
						}
					} while (var46 < var20.length);
				}

				var66 = var62;
				if (var62 < 128) {
					do {
						var67 = var63 + (255 & this.bytes_w[var66]);
						if (var67 < 0) {
							var67 = 0;
						}

						if (var67 > 128) {
							var67 = 128;
						}

						this.bytes_w[var66] = (byte) var67;
						++var66;
					} while (var66 < 128);
				}
			}

			var42 = 0;
			while (var42 < var15) {
				var55[var42].int_b = var2.j((byte) 99);
				++var42;
			}

			var43 = 0;
			if (var43 < var15) {
				do {
					ne var65 = var55[var43];
					if (var65.bytes_i != null) {
						var65.int_f = var2.j((byte) 87);
					}

					if (var65.bytes_u != null) {
						var65.int_s = var2.j((byte) 122);
					}

					if (var65.int_b > 0) {
						var65.int_n = var2.j((byte) 113);
					}

					++var43;
				} while (var43 < var15);
			}

			var63 = 0;
			while (var63 < var15) {
				var55[var63].int_a = var2.j((byte) 74);
				++var63;
			}

			var45 = 0;
			if (var45 < var15) {
				do {
					ne var68 = var55[var45];
					if (var68.int_a > 0) {
						var68.int_g = var2.j((byte) 112);
					}

					++var45;
				} while (var45 < var15);
			}

			var46 = 0;
			if (var15 > var46) {
				do {
					ne var69 = var55[var46];
					if (var69.int_g > 0) {
						var69.int_o = var2.j((byte) 73);
					}

					++var46;
				} while (var15 > var46);
			}
		} catch (RuntimeException var54) {
			throw ec.a(var54, "mb.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
}
