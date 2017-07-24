final class cg extends ph {

	boolean G = true;
	static int H;
	static int I;
	static int J;
	int K = -1;
	static rc L = new rc(128);
	int M = 0;
	int N = -1;
	static lf O = dd.a("(U1", 2);
	static int P;
	static int Q;
	static int R;
	static lf S = dd.a("(U(Y", 2);
	static int[] T = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};

	public static void b(int var0) {
		try {
			O = null;
			T = null;
			S = null;
			L = null;
			if (var0 > -5) {
				b(-65, -92);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "cg.E(" + var0 + ')');
		}
	}

	private final int a(int var1, int var2) {
		int var22 = client.int_gc;

		try {
			++J;
			if (var2 != 21856) {
				b(-38, -69);
			}

			if (var1 == 16711935) {
				return -1;
			} else {
				double var3 = (double) ((16757740 & var1) >> -1890193680) / 256.0D;
				double var5 = (double) (('ﾨ' & var1) >> 539643624) / 256.0D;
				double var7 = (double) (var1 & 255) / 256.0D;
				double var9 = var3;
				if (var5 < var3) {
					var9 = var5;
				}

				double var13 = 0.0D;
				double var11 = var3;
				if (var7 < var9) {
					var9 = var7;
				}

				if (var5 > var3) {
					var11 = var5;
				}

				if (var11 < var7) {
					var11 = var7;
				}

				double var17 = (var11 + var9) / 2.0D;
				double var15 = 0.0D;
				if (var11 != var9) {
					label89:
					{
						if (var11 != var3) {
							if (var5 == var11) {
								var13 = 2.0D + (-var3 + var7) / (var11 - var9);
								if (var22 == 0) {
									break label89;
								}
							}

							if (var11 != var7) {
								break label89;
							}

							var13 = 4.0D + (var3 - var5) / (var11 - var9);
							if (var22 == 0) {
								break label89;
							}
						}

						var13 = (-var7 + var5) / (-var9 + var11);
					}

					if (var17 < 0.5D) {
						var15 = (var11 - var9) / (var11 + var9);
					}

					if (var17 >= 0.5D) {
						var15 = (-var9 + var11) / (2.0D - var11 - var9);
					}
				}

				int var19;
				int var20;
				int var21;
				label79:
				{
					var13 /= 6.0D;
					var19 = (int) (256.0D * var13);
					var21 = (int) (256.0D * var17);
					var20 = (int) (var15 * 256.0D);
					if (~var21 <= -1) {
						if (var21 <= 255) {
							break label79;
						}

						var21 = 255;
						if (var22 == 0) {
							break label79;
						}
					}

					var21 = 0;
				}

				label72:
				{
					if (var20 >= 0) {
						if (var20 <= 255) {
							break label72;
						}

						var20 = 255;
						if (var22 == 0) {
							break label72;
						}
					}

					var20 = 0;
				}

				if (var21 <= 243) {
					if (~var21 >= -218) {
						if (~var21 < -193) {
							var20 >>= 2;
							if (var22 == 0) {
								return (var21 >> -1134109247) + ((var19 >> -140230910 << -1159860534) - -(var20 >> -1424337755 << -1221865145));
							}
						}

						if (~var21 >= -180) {
							return (var21 >> -1134109247) + ((var19 >> -140230910 << -1159860534) - -(var20 >> -1424337755 << -1221865145));
						}

						var20 >>= 1;
						if (var22 == 0) {
							return (var21 >> -1134109247) + ((var19 >> -140230910 << -1159860534) - -(var20 >> -1424337755 << -1221865145));
						}
					}

					var20 >>= 3;
					if (var22 == 0) {
						return (var21 >> -1134109247) + ((var19 >> -140230910 << -1159860534) - -(var20 >> -1424337755 << -1221865145));
					}
				}

				var20 >>= 4;
				return (var21 >> -1134109247) + ((var19 >> -140230910 << -1159860534) - -(var20 >> -1424337755 << -1221865145));
			}
		} catch (RuntimeException var23) {
			throw ec.a(var23, "cg.B(" + var1 + ',' + var2 + ')');
		}
	}

	static boolean b(int var0, int var1) {
		try {
			++I;
			if (~var1 > -1) {
				return false;
			} else {
				int var2 = d.Q[var1];
				if (~var2 <= -2001) {
					var2 -= 2000;
				}

				if (var0 != -1159860534) {
					O = null;
				}

				return var2 == 1002;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "cg.D(" + var0 + ',' + var1 + ')');
		}
	}

	static int a(int var0, int fileID, int cacheID) {
		try {
			++H;
			long var3 = (long) (cacheID + (fileID << 16));
			if (var0 != 1023) {
				a(-42, 100, -92);
			}

			return l.te_g != null && l.te_g.long_e == var3 ? 99 * qb.ja_cb.P / (qb.ja_cb.yb.length + -l.te_g.H) + 1 : 0;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "cg.A(" + var0 + ',' + fileID + ',' + cacheID + ')');
		}
	}

	private final void a(int var1, int var2, ja var3, int var4) {
		try {
			if (var4 != -30573) {
				b(40, -91);
			}

			++P;
			if (~var1 == -2) {
				this.M = this.a(var3.f((byte) 59), 21856);
			} else if (~var1 != -3) {
				if (var1 != 3) {
					if (~var1 == -6) {
						this.G = false;
						return;
					}

					if (~var1 == -8) {
						this.K = this.a(var3.f((byte) 59), var4 + '쳍');
						return;
					}

					if (var1 != 8 && ~var1 == -10) {
						var3.b(true);
						return;
					}
				} else {
					this.N = var3.b(true);
					if (this.N != '\uffff') {
						return;
					}

					this.N = -1;
				}

			} else {
				this.N = var3.j((byte) 77);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "cg.C(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			++Q;
			if (var1 > 106) {
				do {
					int var4 = var3.j((byte) 80);
					if (var4 == 0) {
						break;
					}

					this.a(var4, var2, var3, -30573);
				} while (var5 == 0);

			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "cg.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
}
