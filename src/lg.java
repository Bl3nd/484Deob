final class lg {

	private static cf cf_a = new cf();

	static final int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized (cf_a) {
			int var5;
			cf_a.M = var2;
			cf_a.int_h = var4;
			cf_a.bytes_u = var0;
			cf_a.int_f = 0;
			cf_a.int_a = var1;
			cf_a.int_k = 0;
			cf_a.int_j = 0;
			cf_a.J = 0;
			cf_a.z = 0;
			b(cf_a);
			var1 -= cf_a.int_a;
			cf_a.M = null;
			cf_a.bytes_u = null;
			var5 = var1;
			return var5;
		}
	}

	public static void a() {
		cf_a = null;
	}

	private static final void a(cf var0) {
		var0.H = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.D[var1]) {
				var0.P[var0.H] = (byte) var1;
				++var0.H;
			}
		}

	}

	private static final void b(cf var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.int_g = 1;
		if (nb.ints_c == null) {
			nb.ints_c = new int[var0.int_g * 100000];
		}

		boolean var26 = true;

		while (var26) {
			byte var1 = c(var0);
			if (var1 == 23) {
				return;
			}

			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = c(var0);
			var1 = e(var0);
			var0.int_m = 0;
			var1 = c(var0);
			var0.int_m = var0.int_m << 8 | var1 & 255;
			var1 = c(var0);
			var0.int_m = var0.int_m << 8 | var1 & 255;
			var1 = c(var0);
			var0.int_m = var0.int_m << 8 | var1 & 255;

			int var41;
			for (var41 = 0; var41 < 16; ++var41) {
				var1 = e(var0);
				if (var1 == 1) {
					var0.booleans_d[var41] = true;
				} else {
					var0.booleans_d[var41] = false;
				}
			}

			for (var41 = 0; var41 < 256; ++var41) {
				var0.D[var41] = false;
			}

			int var42;
			for (var41 = 0; var41 < 16; ++var41) {
				if (var0.booleans_d[var41]) {
					for (var42 = 0; var42 < 16; ++var42) {
						var1 = e(var0);
						if (var1 == 1) {
							var0.D[var41 * 16 + var42] = true;
						}
					}
				}
			}

			a(var0);
			int var44 = var0.H + 2;
			int var45 = a(3, var0);
			int var46 = a(15, var0);

			for (var41 = 0; var41 < var46; ++var41) {
				var42 = 0;

				while (true) {
					var1 = e(var0);
					if (var1 == 0) {
						var0.bytes_b[var41] = (byte) var42;
						break;
					}

					++var42;
				}
			}

			byte[] var27 = new byte[6];

			byte var29;
			for (var29 = 0; var29 < var45; var27[var29] = var29++) {
				;
			}

			for (var41 = 0; var41 < var46; ++var41) {
				var29 = var0.bytes_b[var41];

				byte var28;
				for (var28 = var27[var29]; var29 > 0; --var29) {
					var27[var29] = var27[var29 - 1];
				}

				var27[0] = var28;
				var0.O[var41] = var28;
			}

			int var43;
			for (var43 = 0; var43 < var45; ++var43) {
				int var55 = a(5, var0);

				for (var41 = 0; var41 < var44; var41++) {
					for (;;) {
						var1 = e(var0);
						if (var1 == 0) {
							break;
						}

						var1 = e(var0);
						if (var1 == 0) {
							var55++;
						} else {
							var55--;
						}
					}
					var0.E[var43][var41] = (byte) var55;
				}
				/*var41 = 0;

				while (var41 < var44) {
					while (true) {
						var1 = e(var0);
						if (var1 == 0) {
							var0.E[var43][var41] = (byte) var55;
							++var41;
						} else {
							var1 = e(var0);
							if (var1 == 0) {
								++var55;
							} else {
								--var55;
							}
						}
					}
				}*/
			}

			for (var43 = 0; var43 < var45; ++var43) {
				byte var2 = 32;
				byte var3 = 0;

				for (var41 = 0; var41 < var44; ++var41) {
					if (var0.E[var43][var41] > var3) {
						var3 = var0.E[var43][var41];
					}

					if (var0.E[var43][var41] < var2) {
						var2 = var0.E[var43][var41];
					}
				}

				a(var0.ints_s[var43], var0.ints_v[var43], var0.G[var43], var0.E[var43], var2, var3, var44);
				var0.ints_w[var43] = var2;
			}

			int var47 = var0.H + 1;
			int var48 = -1;
			byte var49 = 0;

			for (var41 = 0; var41 <= 255; ++var41) {
				var0.F[var41] = 0;
			}

			int var32 = 4095;

			for (int var30 = 15; var30 >= 0; --var30) {
				for (int var31 = 15; var31 >= 0; --var31) {
					var0.bytes_t[var32] = (byte) (var30 * 16 + var31);
					--var32;
				}

				var0.ints_o[var30] = var32 + 1;
			}

			int var52 = 0;
			byte var59;
			if (var49 == 0) {
				++var48;
				var49 = 50;
				var59 = var0.O[var48];
				var22 = var0.ints_w[var59];
				var23 = var0.ints_s[var59];
				var25 = var0.G[var59];
				var24 = var0.ints_v[var59];
			}

			int var50 = var49 - 1;
			int var56 = var22;

			int var57;
			byte var58;
			for (var57 = a(var22, var0); var57 > var23[var56]; var57 = var57 << 1 | var58) {
				++var56;
				var58 = e(var0);
			}

			int var51 = var25[var57 - var24[var56]];

			while (var51 != var47) {
				if (var51 != 0 && var51 != 1) {
					int var39 = var51 - 1;
					int var36;
					if (var39 < 16) {
						var36 = var0.ints_o[0];

						for (var1 = var0.bytes_t[var36 + var39]; var39 > 3; var39 -= 4) {
							int var40 = var36 + var39;
							var0.bytes_t[var40] = var0.bytes_t[var40 - 1];
							var0.bytes_t[var40 - 1] = var0.bytes_t[var40 - 2];
							var0.bytes_t[var40 - 2] = var0.bytes_t[var40 - 3];
							var0.bytes_t[var40 - 3] = var0.bytes_t[var40 - 4];
						}

						while (var39 > 0) {
							var0.bytes_t[var36 + var39] = var0.bytes_t[var36 + var39 - 1];
							--var39;
						}

						var0.bytes_t[var36] = var1;
					} else {
						int var37 = var39 / 16;
						int var38 = var39 % 16;
						var36 = var0.ints_o[var37] + var38;

						for (var1 = var0.bytes_t[var36]; var36 > var0.ints_o[var37]; --var36) {
							var0.bytes_t[var36] = var0.bytes_t[var36 - 1];
						}

						++var0.ints_o[var37];

						while (var37 > 0) {
							--var0.ints_o[var37];
							var0.bytes_t[var0.ints_o[var37]] = var0.bytes_t[var0.ints_o[var37 - 1] + 16 - 1];
							--var37;
						}

						--var0.ints_o[0];
						var0.bytes_t[var0.ints_o[0]] = var1;
						if (var0.ints_o[0] == 0) {
							int var35 = 4095;

							for (int var33 = 15; var33 >= 0; --var33) {
								for (int var34 = 15; var34 >= 0; --var34) {
									var0.bytes_t[var35] = var0.bytes_t[var0.ints_o[var33] + var34];
									--var35;
								}

								var0.ints_o[var33] = var35 + 1;
							}
						}
					}

					++var0.F[var0.P[var1 & 255] & 255];
					nb.ints_c[var52] = var0.P[var1 & 255] & 255;
					++var52;
					if (var50 == 0) {
						++var48;
						var50 = 50;
						var59 = var0.O[var48];
						var22 = var0.ints_w[var59];
						var23 = var0.ints_s[var59];
						var25 = var0.G[var59];
						var24 = var0.ints_v[var59];
					}

					--var50;
					var56 = var22;

					for (var57 = a(var22, var0); var57 > var23[var56]; var57 = var57 << 1 | var58) {
						++var56;
						var58 = e(var0);
					}

					var51 = var25[var57 - var24[var56]];
				} else {
					int var53 = -1;
					int var54 = 1;

					do {
						if (var51 == 0) {
							var53 += var54;
						} else if (var51 == 1) {
							var53 += 2 * var54;
						}

						var54 *= 2;
						if (var50 == 0) {
							++var48;
							var50 = 50;
							var59 = var0.O[var48];
							var22 = var0.ints_w[var59];
							var23 = var0.ints_s[var59];
							var25 = var0.G[var59];
							var24 = var0.ints_v[var59];
						}

						--var50;
						var56 = var22;

						for (var57 = a(var22, var0); var57 > var23[var56]; var57 = var57 << 1 | var58) {
							++var56;
							var58 = e(var0);
						}

						var51 = var25[var57 - var24[var56]];
					} while (var51 == 0 || var51 == 1);

					++var53;
					var1 = var0.P[var0.bytes_t[var0.ints_o[0]] & 255];

					for (var0.F[var1 & 255] += var53; var53 > 0; --var53) {
						nb.ints_c[var52] = var1 & 255;
						++var52;
					}
				}
			}

			var0.R = 0;
			var0.byte_l = 0;
			var0.ints_c[0] = 0;

			for (var41 = 1; var41 <= 256; ++var41) {
				var0.ints_c[var41] = var0.F[var41 - 1];
			}

			for (var41 = 1; var41 <= 256; ++var41) {
				var0.ints_c[var41] += var0.ints_c[var41 - 1];
			}

			for (var41 = 0; var41 < var52; ++var41) {
				var1 = (byte) (nb.ints_c[var41] & 255);
				nb.ints_c[var0.ints_c[var1 & 255]] |= var41 << 8;
				++var0.ints_c[var1 & 255];
			}

			var0.int_e = nb.ints_c[var0.int_m] >> 8;
			var0.A = 0;
			var0.int_e = nb.ints_c[var0.int_e];
			var0.N = (byte) (var0.int_e & 255);
			var0.int_e >>= 8;
			++var0.A;
			var0.int_q = var52;
			d(var0);
			if (var0.A == var0.int_q + 1 && var0.R == 0) {
				var26 = true;
			} else {
				var26 = false;
			}
		}

	}

	private static final byte c(cf var0) {
		return (byte) a(8, var0);
	}

	private static final int a(int var0, cf var1) {
		while (var1.int_k < var0) {
			var1.int_j = var1.int_j << 8 | var1.M[var1.int_h] & 255;
			var1.int_k += 8;
			++var1.int_h;
			++var1.J;
		}

		int var3 = var1.int_j >> var1.int_k - var0 & (1 << var0) - 1;
		var1.int_k -= var0;
		return var3;
	}

	private static final void a(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}

	private static final void d(cf var0) {
		byte var2 = var0.byte_l;
		int var3 = var0.R;
		int var4 = var0.A;
		int var5 = var0.N;
		int[] var6 = nb.ints_c;
		int var7 = var0.int_e;
		byte[] var8 = var0.bytes_u;
		int var9 = var0.int_f;
		int var10 = var0.int_a;
		int var12 = var0.int_q + 1;

		label63:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label63;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label63;
						}

						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}

					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}

			boolean var14 = true;

			byte var1;
			while (var14) {
				var14 = false;
				if (var4 == var12) {
					var3 = 0;
					break label63;
				}

				var2 = (byte) var5;
				var7 = var6[var7];
				var1 = (byte) (var7 & 255);
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label63;
					}

					var8[var9] = var2;
					++var9;
					--var10;
					var14 = true;
				} else if (var4 == var12) {
					if (var10 == 0) {
						var3 = 1;
						break label63;
					}

					var8[var9] = var2;
					++var9;
					--var10;
					var14 = true;
				}
			}

			var3 = 2;
			var7 = var6[var7];
			var1 = (byte) (var7 & 255);
			var7 >>= 8;
			++var4;
			if (var4 != var12) {
				if (var1 != var5) {
					var5 = var1;
				} else {
					var3 = 3;
					var7 = var6[var7];
					var1 = (byte) (var7 & 255);
					var7 >>= 8;
					++var4;
					if (var4 != var12) {
						if (var1 != var5) {
							var5 = var1;
						} else {
							var7 = var6[var7];
							var1 = (byte) (var7 & 255);
							var7 >>= 8;
							++var4;
							var3 = (var1 & 255) + 4;
							var7 = var6[var7];
							var5 = (byte) (var7 & 255);
							var7 >>= 8;
							++var4;
						}
					}
				}
			}
		}

		int var13 = var0.z;
		var0.z += var10 - var10;
		var0.byte_l = var2;
		var0.R = var3;
		var0.A = var4;
		var0.N = var5;
		nb.ints_c = var6;
		var0.int_e = var7;
		var0.bytes_u = var8;
		var0.int_f = var9;
		var0.int_a = var10;
	}

	private static final byte e(cf var0) {
		return (byte) a(1, var0);
	}
}
