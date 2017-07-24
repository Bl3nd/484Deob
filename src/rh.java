final class rh extends j {

	static int Q = 1;
	private int[][] R;
	static int S;
	static lf clientdropCommand = dd.a("::clientdrop", 2);
	static int U;
	static int V = 0;
	static int W;
	static int X;
	static lf Y = dd.a("Clientscript error in: ", 2);
	static int Z;

	final void c(int var1) {
		try {
			++W;
			if (var1 != 25614) {
				this.c(96);
			}

			if (this.R == null) {
				this.a((byte) 18, 1);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "rh.M(" + var1 + ')');
		}
	}

	private final void a(byte var1, int var2) {
		try {
			++U;
			int var3 = -95 / ((var1 - 70) / 41);
			if (var2 != 0) {
				if (~var2 != -2) {
					if (~var2 == -3) {
						this.R = new int[8][4];
						this.R[0][1] = 2650;
						this.R[0][3] = 2361;
						this.R[1][3] = 1558;
						this.R[2][3] = 1413;
						this.R[1][1] = 2313;
						this.R[0][0] = 0;
						this.R[1][0] = 2867;
						this.R[2][1] = 2618;
						this.R[2][0] = 3072;
						this.R[3][3] = 947;
						this.R[3][1] = 2296;
						this.R[4][3] = 722;
						this.R[3][0] = 3276;
						this.R[4][0] = 3481;
						this.R[4][1] = 2072;
						this.R[5][0] = 3686;
						this.R[5][3] = 1766;
						this.R[6][3] = 915;
						this.R[0][2] = 2602;
						this.R[1][2] = 1799;
						this.R[6][0] = 3891;
						this.R[7][3] = 1140;
						this.R[2][2] = 1734;
						this.R[3][2] = 1220;
						this.R[5][1] = 2730;
						this.R[7][0] = 4096;
						this.R[6][1] = 2232;
						this.R[7][1] = 1686;
						this.R[4][2] = 963;
						this.R[5][2] = 2152;
						this.R[6][2] = 1060;
						this.R[7][2] = 1413;
						return;
					}

					if (~var2 == -4) {
						this.R = new int[7][4];
						this.R[0][3] = 4096;
						this.R[0][1] = 0;
						this.R[0][0] = 0;
						this.R[1][1] = 0;
						this.R[2][1] = 0;
						this.R[1][3] = 4096;
						this.R[2][3] = 0;
						this.R[0][2] = 0;
						this.R[3][3] = 0;
						this.R[3][1] = 4096;
						this.R[4][3] = 0;
						this.R[4][1] = 4096;
						this.R[1][0] = 663;
						this.R[5][3] = 4096;
						this.R[5][1] = 4096;
						this.R[1][2] = 4096;
						this.R[6][3] = 4096;
						this.R[2][2] = 4096;
						this.R[6][1] = 0;
						this.R[3][2] = 4096;
						this.R[4][2] = 0;
						this.R[2][0] = 1363;
						this.R[5][2] = 0;
						this.R[6][2] = 0;
						this.R[3][0] = 2048;
						this.R[4][0] = 2727;
						this.R[5][0] = 3411;
						this.R[6][0] = 4096;
						return;
					}

					if (var2 == 4) {
						this.R = new int[6][4];
						this.R[0][2] = 0;
						this.R[0][3] = 0;
						this.R[0][0] = 0;
						this.R[1][0] = 1843;
						this.R[2][0] = 2457;
						this.R[0][1] = 0;
						this.R[1][2] = 0;
						this.R[1][1] = 0;
						this.R[2][1] = 0;
						this.R[3][0] = 2781;
						this.R[4][0] = 3481;
						this.R[2][2] = 0;
						this.R[3][2] = 1124;
						this.R[5][0] = 4096;
						this.R[1][3] = 1493;
						this.R[2][3] = 2939;
						this.R[4][2] = 3084;
						this.R[5][2] = 4096;
						this.R[3][1] = 0;
						this.R[4][1] = 546;
						this.R[3][3] = 3565;
						this.R[5][1] = 4096;
						this.R[4][3] = 4031;
						this.R[5][3] = 4096;
						return;
					}

					if (var2 == 5) {
						this.R = new int[16][4];
						this.R[0][1] = 80;
						this.R[0][3] = 321;
						this.R[1][1] = 321;
						this.R[1][3] = 562;
						this.R[2][1] = 578;
						this.R[3][1] = 947;
						this.R[0][0] = 0;
						this.R[1][0] = 155;
						this.R[2][0] = 389;
						this.R[4][1] = 1285;
						this.R[0][2] = 192;
						this.R[5][1] = 1525;
						this.R[1][2] = 449;
						this.R[2][3] = 803;
						this.R[2][2] = 690;
						this.R[3][0] = 671;
						this.R[3][2] = 995;
						this.R[4][0] = 897;
						this.R[4][2] = 1397;
						this.R[6][1] = 1734;
						this.R[5][0] = 1175;
						this.R[7][1] = 1413;
						this.R[3][3] = 1140;
						this.R[4][3] = 1509;
						this.R[8][1] = 1108;
						this.R[5][3] = 1413;
						this.R[6][0] = 1368;
						this.R[6][3] = 1333;
						this.R[9][1] = 1766;
						this.R[5][2] = 1429;
						this.R[10][1] = 2409;
						this.R[7][0] = 1507;
						this.R[11][1] = 3116;
						this.R[12][1] = 3806;
						this.R[13][1] = 3437;
						this.R[6][2] = 1461;
						this.R[7][2] = 1525;
						this.R[8][0] = 1736;
						this.R[9][0] = 2088;
						this.R[7][3] = 1702;
						this.R[8][3] = 2056;
						this.R[8][2] = 1590;
						this.R[10][0] = 2355;
						this.R[14][1] = 3116;
						this.R[9][3] = 2666;
						this.R[15][1] = 2377;
						this.R[9][2] = 2056;
						this.R[11][0] = 2691;
						this.R[12][0] = 3031;
						this.R[10][2] = 2586;
						this.R[11][2] = 3148;
						this.R[12][2] = 3710;
						this.R[10][3] = 3276;
						this.R[13][0] = 3522;
						this.R[13][2] = 3421;
						this.R[14][2] = 3148;
						this.R[15][2] = 2505;
						this.R[11][3] = 3228;
						this.R[14][0] = 3727;
						this.R[12][3] = 3196;
						this.R[15][0] = 4096;
						this.R[13][3] = 3019;
						this.R[14][3] = 3228;
						this.R[15][3] = 2746;
						return;
					}

					if (~var2 != -7) {
						throw new RuntimeException("Invalid gradient preset");
					}

					if (client.int_gc == 0) {
						this.R = new int[4][4];
						this.R[0][1] = 0;
						this.R[0][2] = 4096;
						this.R[0][3] = 0;
						this.R[1][2] = 4096;
						this.R[0][0] = 2048;
						this.R[1][0] = 2867;
						this.R[2][2] = 4096;
						this.R[1][1] = 4096;
						this.R[2][1] = 4096;
						this.R[3][1] = 4096;
						this.R[1][3] = 0;
						this.R[2][0] = 3276;
						this.R[3][2] = 0;
						this.R[3][0] = 4096;
						this.R[2][3] = 0;
						this.R[3][3] = 0;
						return;
					}
				}

				this.R = new int[2][4];
				this.R[0][0] = 0;
				this.R[0][1] = 0;
				this.R[0][2] = 0;
				this.R[0][3] = 0;
				this.R[1][3] = 4096;
				this.R[1][1] = 4096;
				this.R[1][0] = 4096;
				this.R[1][2] = 4096;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rh.A(" + var1 + ',' + var2 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var17 = client.int_gc;

		try {
			++Z;
			if (var2 != 2177) {
				this.b(-24, -107);
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w) {
				int var4 = this.R.length;
				int[] var5 = this.a((int) var1, -127, 0);
				int[] var7 = var3[1];
				int[] var6 = var3[0];
				int[] var8 = var3[2];
				int var9;
				if (var4 <= 0) {
					var9 = 0;
					if (var17 != 0 || var9 < ff.int_a) {
						do {
							var6[var9] = 0;
							var7[var9] = 0;
							var8[var9] = 0;
							++var9;
						} while (var9 < ff.int_a);
					}

					if (var17 == 0) {
						return var3;
					}
				}

				var9 = 0;
				if (var17 != 0 || var9 < ff.int_a) {
					do {
						int var10 = 0;
						int var11 = var5[var9];
						int var12 = 0;
						if (var17 != 0 || var4 > var12) {
							while (var11 >= this.R[var12][0]) {
								++var10;
								++var12;
								if (var4 <= var12) {
									break;
								}
							}
						}

						label37:
						{
							int[] var13;
							if (~var4 < ~var10) {
								var13 = this.R[var10];
								if (var10 <= 0) {
									var6[var9] = var13[1];
									var7[var9] = var13[2];
									var8[var9] = var13[3];
									if (var17 == 0) {
										break label37;
									}
								}

								int[] var14 = this.R[var10 + -1];
								int var15 = (-var14[0] + var11 << -1857534868) / (var13[0] - var14[0]);
								int var16 = -var15 + 4096;
								var6[var9] = var16 * var14[1] + var13[1] * var15 >> 1143001580;
								var7[var9] = var14[2] * var16 + var15 * var13[2] >> -2097696724;
								var8[var9] = var15 * var13[3] - -(var16 * var14[3]) >> 1085670956;
								if (var17 == 0) {
									break label37;
								}
							}

							var13 = this.R[-1 + var4];
							var6[var9] = var13[1];
							var7[var9] = var13[2];
							var8[var9] = var13[3];
						}

						++var9;
					} while (var9 < ff.int_a);
				}
			}

			return var3;
		} catch (RuntimeException var18) {
			throw ec.a(var18, "rh.E(" + var1 + ',' + var2 + ')');
		}
	}

	public rh() {
		super(1, false);
	}

	public static void e(int var0) {
		try {
			Y = null;
			if (var0 < 113) {
				V = -117;
			}

			clientdropCommand = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "rh.B(" + var0 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var6 = client.int_gc;

		try {
			++S;
			if (var2 == 0) {
				label41:
				{
					int var4 = var3.j((byte) 116);
					if (~var4 == -1) {
						this.R = new int[var3.j((byte) 98)][4];
						int var5 = 0;
						if (var6 != 0 || ~var5 > ~this.R.length) {
							do {
								this.R[var5][0] = var3.b(true);
								this.R[var5][1] = var3.j((byte) 100) << 1854593572;
								this.R[var5][2] = var3.j((byte) 79) << -1706851036;
								this.R[var5][3] = var3.j((byte) 96) << -13279708;
								++var5;
							} while (~var5 > ~this.R.length);
						}

						if (var6 == 0) {
							break label41;
						}
					}

					this.a((byte) -36, var4);
				}
			}

			if (var1 >= -120) {
				clientdropCommand = null;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "rh.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
}
