final class s extends hb {

	byte[] bytes_n;
	eh eh_o;

	final void a() {
		this.eh_o = null;
	}

	private s(ja var1) {
		var1.P = var1.yb.length - 3;
		int var2 = var1.j((byte) 81);
		int var3 = var1.b(true);
		int var4 = 14 + var2 * 10;
		var1.P = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;
		int var13 = 0;

		int var14;
		int var15;
		while (var13 < var2) {
			var14 = -1;

			while (true) {
				var15 = var1.j((byte) 109);
				if (var15 != var14) {
					++var4;
				}

				var14 = var15 & 15;
				if (var15 == 7) {
					++var13;
					break;
				}

				if (var15 == 23) {
					++var5;
				} else if (var14 == 0) {
					++var7;
				} else if (var14 == 1) {
					++var8;
				} else if (var14 == 2) {
					++var6;
				} else if (var14 == 3) {
					++var9;
				} else if (var14 == 4) {
					++var10;
				} else if (var14 == 5) {
					++var11;
				} else {
					if (var14 != 6) {
						throw new RuntimeException();
					}

					++var12;
				}
			}
		}

		var4 += 5 * var5;
		var4 += 2 * (var7 + var8 + var6 + var9 + var11);
		var4 += var10 + var12;
		var14 = var1.P;
		var15 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

		for (int var16 = 0; var16 < var15; ++var16) {
			var1.c((int) 105);
		}

		var4 += var1.P - var14;
		int var17 = var1.P;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28 = 0;
		int var29 = 0;
		int var30 = 0;

		for (int var31 = 0; var31 < var6; ++var31) {
			var30 = var30 + var1.j((byte) 110) & 127;
			if (var30 != 0 && var30 != 32) {
				if (var30 == 1) {
					++var18;
				} else if (var30 == 33) {
					++var19;
				} else if (var30 == 7) {
					++var20;
				} else if (var30 == 39) {
					++var21;
				} else if (var30 == 10) {
					++var22;
				} else if (var30 == 42) {
					++var23;
				} else if (var30 == 99) {
					++var24;
				} else if (var30 == 98) {
					++var25;
				} else if (var30 == 101) {
					++var26;
				} else if (var30 == 100) {
					++var27;
				} else if (var30 != 64 && var30 != 65 && var30 != 120 && var30 != 121 && var30 != 123) {
					++var29;
				} else {
					++var28;
				}
			} else {
				++var12;
			}
		}

		int var32 = 0;
		int var33 = var1.P;
		var1.P += var28;
		int var34 = var1.P;
		var1.P += var11;
		int var35 = var1.P;
		var1.P += var10;
		int var36 = var1.P;
		var1.P += var9;
		int var37 = var1.P;
		var1.P += var18;
		int var38 = var1.P;
		var1.P += var20;
		int var39 = var1.P;
		var1.P += var22;
		int var40 = var1.P;
		var1.P += var7 + var8 + var11;
		int var41 = var1.P;
		var1.P += var7;
		int var42 = var1.P;
		var1.P += var29;
		int var43 = var1.P;
		var1.P += var8;
		int var44 = var1.P;
		var1.P += var19;
		int var45 = var1.P;
		var1.P += var21;
		int var46 = var1.P;
		var1.P += var23;
		int var47 = var1.P;
		var1.P += var12;
		int var48 = var1.P;
		var1.P += var9;
		int var49 = var1.P;
		var1.P += var24;
		int var50 = var1.P;
		var1.P += var25;
		int var51 = var1.P;
		var1.P += var26;
		int var52 = var1.P;
		var1.P += var27;
		int var53 = var1.P;
		var1.P += var5 * 3;
		this.bytes_n = new byte[var4];
		ja var54 = new ja(this.bytes_n);
		var54.b((byte) 111, 1297377380);
		var54.b((byte) 121, 6);
		var54.c((int) 9698, var2 > 1 ? 1 : 0);
		var54.c((int) 9698, var2);
		var54.c((int) 9698, var3);
		var1.P = var14;
		int var55 = 0;
		int var56 = 0;
		int var57 = 0;
		int var58 = 0;
		int var59 = 0;
		int var60 = 0;
		int var61 = 0;
		int[] var62 = new int[128];
		var30 = 0;
		int var63 = 0;

		while (var63 < var2) {
			var54.b((byte) 118, 1297379947);
			var54.P += 4;
			int var64 = var54.P;
			int var65 = -1;

			while (true) {
				int var66 = var1.c((int) 111);
				var54.g(-1124959588, var66);
				int var67 = var1.yb[var32++] & 255;
				boolean var68 = var67 != var65;
				var65 = var67 & 15;
				if (var67 == 7) {
					if (var68) {
						var54.e(-13488, 255);
					}

					var54.e(-13488, 47);
					var54.e(-13488, 0);
					var54.d((byte) 105, var54.P - var64);
					++var63;
					break;
				}

				if (var67 == 23) {
					if (var68) {
						var54.e(-13488, 255);
					}

					var54.e(-13488, 81);
					var54.e(-13488, 3);
					var54.e(-13488, var1.yb[var53++]);
					var54.e(-13488, var1.yb[var53++]);
					var54.e(-13488, var1.yb[var53++]);
				} else {
					var55 ^= var67 >> 4;
					if (var65 == 0) {
						if (var68) {
							var54.e(-13488, 144 + var55);
						}

						var56 += var1.yb[var40++];
						var57 += var1.yb[var41++];
						var54.e(-13488, var56 & 127);
						var54.e(-13488, var57 & 127);
					} else if (var65 == 1) {
						if (var68) {
							var54.e(-13488, 128 + var55);
						}

						var56 += var1.yb[var40++];
						var58 += var1.yb[var43++];
						var54.e(-13488, var56 & 127);
						var54.e(-13488, var58 & 127);
					} else if (var65 == 2) {
						if (var68) {
							var54.e(-13488, 176 + var55);
						}

						var30 = var30 + var1.yb[var17++] & 127;
						var54.e(-13488, var30);
						byte var69;
						if (var30 != 0 && var30 != 32) {
							if (var30 == 1) {
								var69 = var1.yb[var37++];
							} else if (var30 == 33) {
								var69 = var1.yb[var44++];
							} else if (var30 == 7) {
								var69 = var1.yb[var38++];
							} else if (var30 == 39) {
								var69 = var1.yb[var45++];
							} else if (var30 == 10) {
								var69 = var1.yb[var39++];
							} else if (var30 == 42) {
								var69 = var1.yb[var46++];
							} else if (var30 == 99) {
								var69 = var1.yb[var49++];
							} else if (var30 == 98) {
								var69 = var1.yb[var50++];
							} else if (var30 == 101) {
								var69 = var1.yb[var51++];
							} else if (var30 == 100) {
								var69 = var1.yb[var52++];
							} else if (var30 != 64 && var30 != 65 && var30 != 120 && var30 != 121 && var30 != 123) {
								var69 = var1.yb[var42++];
							} else {
								var69 = var1.yb[var33++];
							}
						} else {
							var69 = var1.yb[var47++];
						}

						int var70 = var69 + var62[var30];
						var62[var30] = var70;
						var54.e(-13488, var70 & 127);
					} else if (var65 == 3) {
						if (var68) {
							var54.e(-13488, 224 + var55);
						}

						var59 += var1.yb[var48++];
						var59 += var1.yb[var36++] << 7;
						var54.e(-13488, var59 & 127);
						var54.e(-13488, var59 >> 7 & 127);
					} else if (var65 == 4) {
						if (var68) {
							var54.e(-13488, 208 + var55);
						}

						var60 += var1.yb[var35++];
						var54.e(-13488, var60 & 127);
					} else if (var65 == 5) {
						if (var68) {
							var54.e(-13488, 160 + var55);
						}

						var56 += var1.yb[var40++];
						var61 += var1.yb[var34++];
						var54.e(-13488, var56 & 127);
						var54.e(-13488, var61 & 127);
					} else {
						if (var65 != 6) {
							throw new RuntimeException();
						}

						if (var68) {
							var54.e(-13488, 192 + var55);
						}

						var54.e(-13488, var1.yb[var47++]);
					}
				}
			}
		}

	}

	final void b() {
		if (this.eh_o == null) {
			this.eh_o = new eh(16);
			int[] var1 = new int[16];
			int[] var2 = new int[16];
			var1[9] = var2[9] = 128;
			qf var3 = new qf(this.bytes_n);
			int var4 = var3.d();

			for (int var5 = 0; var5 < var4; ++var5) {
				var3.c(var5);
				var3.b(var5);
				var3.d(var5);
			}

			while (true) {
				int var6 = var3.c();
				int var7 = var3.ints_f[var6];

				while (var3.ints_f[var6] == var7) {
					var3.c(var6);
					int var8 = var3.a(var6);
					if (var8 == 1) {
						var3.e();
						var3.d(var6);
						if (var3.g()) {
							return;
						}
						break;
					}

					int var9 = var8 & 240;
					int var10;
					int var11;
					int var12;
					if (var9 == 176) {
						var10 = var8 & 15;
						var11 = var8 >> 8 & 127;
						var12 = var8 >> 16 & 127;
						if (var11 == 0) {
							var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
						}

						if (var11 == 32) {
							var1[var10] = (var1[var10] & -16257) + (var12 << 7);
						}
					}

					if (var9 == 192) {
						var10 = var8 & 15;
						var11 = var8 >> 8 & 127;
						var2[var10] = var1[var10] + var11;
					}

					if (var9 == 144) {
						var10 = var8 & 15;
						var11 = var8 >> 8 & 127;
						var12 = var8 >> 16 & 127;
						if (var12 > 0) {
							int var13 = var2[var10];
							de var14 = (de) this.eh_o.a((long) var13, (byte) -119);
							if (var14 == null) {
								var14 = new de(new byte[128]);
								this.eh_o.a((long) var13, false, var14);
							}

							var14.bytes_t[var11] = 1;
						}
					}

					var3.b(var6);
					var3.d(var6);
				}
			}
		}
	}

	static final s a(bg var0, int var1, int var2) {
		byte[] var3 = var0.a(0, var2, var1);
		return var3 == null ? null : new s(new ja(var3));
	}
}
