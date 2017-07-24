import java.awt.Component;

final class ad {

	static int int_a;
	private byte[] bytes_b;
	static lf huffman = dd.a("huffman", 2);//lf_c
	private int[] ints_d;
	private int[] ints_e;
	static l l_f = new l();
	static int int_g;
	static int int_h;
	static int int_i;
	static int[] ints_j = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
	static int int_k;
	static int int_l = 0;
	static int int_m;
	private static lf mNoReplyFromLoginserver = dd.a("No reply from loginserver)3", 2);//lf_n
	static int int_o;
	static lf pleaseWait1MinuteAndTryAgain2;//lf_p
	static lf lf_q = dd.a("Fehler beim Laden Ihres Spielcharakters)3", 2);
	static int int_r = 0;
	static int int_s = 0;
	static lf noReplyFromLoginserver;//lf_t
	static nd nd_u;
	private static lf mPleaseWait1MinuteAndTryAgain;//lf_v
	static lf pleaseWait1MinuteAndTryAgain;//lf_w

	final int a(int var1, int var2, byte[] var3, int var4, byte[] var5, int var6) {
		int var15 = client.int_gc;

		try {
			int var7 = 0;
			++int_k;
			var6 += var2;
			int var8 = var4 << 472674723;
			if (var15 == 0 && ~var2 <= ~var6) {
				if (var1 != 8) {
					a(true, true, 50, 99, true);
				}

				return -var4 + (var8 - -7 >> -569005853);
			} else {
				do {
					int var9 = 255 & var5[var2];
					byte var11 = this.bytes_b[var9];
					int var10 = this.ints_d[var9];
					if (var11 == 0) {
						throw new RuntimeException("No codeword for data value " + var9);
					}

					int var12 = var8 >> 1523476579;
					int var13 = var8 & 7;
					var8 += var11;
					int var14 = (-1 + var13 + var11 >> -579124125) + var12;
					var7 &= -var13 >> -1373509153;
					var13 += 24;
					var3[var12] = (byte) (var7 = d.c(var7, var10 >>> var13));
					if (var14 > var12) {
						var13 -= 8;
						++var12;
						var3[var12] = (byte) (var7 = var10 >>> var13);
						if (~var14 < ~var12) {
							var13 -= 8;
							++var12;
							var3[var12] = (byte) (var7 = var10 >>> var13);
							if (var12 < var14) {
								var13 -= 8;
								++var12;
								var3[var12] = (byte) (var7 = var10 >>> var13);
								if (~var14 < ~var12) {
									++var12;
									var13 -= 8;
									var3[var12] = (byte) (var7 = var10 << -var13);
								}
							}
						}
					}

					++var2;
				} while (~var2 > ~var6);

				if (var1 != 8) {
					a(true, true, 50, 99, true);
				}

				return -var4 + (var8 - -7 >> -569005853);
			}
		} catch (RuntimeException var16) {
			throw ec.a(var16, "ad.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')');
		}
	}

	static void a(byte var0, Component var1) {
		try {
			var1.removeMouseListener(j.z);
			if (var0 != -106) {
				a(true, true, 84, 32, true);
			}

			var1.removeMouseMotionListener(j.z);
			var1.removeFocusListener(j.z);
			++int_h;
			fa.W = 0;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ad.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static int a(int var0, int var1, int var2) {
		try {
			++int_i;
			int var3 = var0 - 1 & var2 >> -1156100001;
			if (var1 != -1156100001) {
				a((byte) -122);
			}

			return ((var2 >>> 136526559) + var2) % var0 - -var3;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ad.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static oh a(boolean flag, boolean flag2, int cacheID, int dummy, boolean flag3) {
		try {
			if (dummy != -20347) {
				a((byte) -37);
			}

			++int_g;
			wb class_wb = null;
			if (td.S != null) {
				class_wb = new wb(cacheID, td.S, jh.hfs_d[cacheID], 1000000);
			}

			return new oh(class_wb, be.wb_q, cacheID, flag2, flag, flag3);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ad.E(" + flag + ',' + flag2 + ',' + cacheID + ',' + dummy + ',' + flag3 + ')');
		}
	}

	public static void a(byte var0) {
		try {
			l_f = null;
			mPleaseWait1MinuteAndTryAgain = null;
			mNoReplyFromLoginserver = null;
			ints_j = null;
			pleaseWait1MinuteAndTryAgain = null;
			huffman = null;
			noReplyFromLoginserver = null;
			pleaseWait1MinuteAndTryAgain2 = null;
			nd_u = null;
			lf_q = null;
			if (var0 > -12) {
				l_f = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ad.D(" + var0 + ')');
		}
	}

	ad(byte[] var1) {
		int var16 = client.int_gc;

		try {
			int var4 = 0;
			int var2 = var1.length;
			this.bytes_b = var1;
			int[] var3 = new int[33];
			this.ints_d = new int[var2];
			this.ints_e = new int[8];
			int var5 = 0;
			if (var16 != 0 || var5 < var2) {
				do {
					byte var6 = var1[var5];
					if (var6 != 0) {
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						label145:
						{
							int var7 = 1 << 32 - var6;
							var8 = var3[var6];
							this.ints_d[var5] = var8;
							if ((var8 & var7) != 0) {
								var9 = var3[-1 + var6];
								if (var16 == 0) {
									break label145;
								}
							}

							var10 = var6 - 1;
							if (var16 != 0 || ~var10 <= -2) {
								do {
									var11 = var3[var10];
									if (var8 != var11 && var16 == 0) {
										break;
									}

									label68:
									{
										var12 = 1 << -var10 + 32;
										if (~(var11 & var12) == -1) {
											var3[var10] = d.c(var12, var11);
											if (var16 == 0) {
												break label68;
											}
										}

										var3[var10] = var3[-1 + var10];
										if (var16 == 0) {
											break;
										}
									}

									--var10;
								} while (~var10 <= -2);
							}

							var9 = var8 | var7;
						}

						var3[var6] = var9;
						var10 = 1 + var6;
						if (var16 != 0 || var10 <= 32) {
							do {
								if (var3[var10] == var8) {
									var3[var10] = var9;
								}

								++var10;
							} while (var10 <= 32);
						}

						var11 = 0;
						var12 = 0;
						if (var16 != 0 || ~var12 > ~var6) {
							do {
								int var13;
								label97:
								{
									var13 = Integer.MIN_VALUE >>> var12;
									if ((var13 & var8) != 0) {
										if (~this.ints_e[var11] == -1) {
											this.ints_e[var11] = var4;
										}

										var11 = this.ints_e[var11];
										if (var16 == 0) {
											break label97;
										}
									}

									++var11;
								}

								var13 >>>= 1;
								if (var11 >= this.ints_e.length) {
									int[] var14 = new int[2 * this.ints_e.length];
									int var15 = 0;
									if (var16 != 0 || this.ints_e.length > var15) {
										do {
											var14[var15] = this.ints_e[var15];
											++var15;
										} while (this.ints_e.length > var15);
									}

									this.ints_e = var14;
								}

								++var12;
							} while (~var12 > ~var6);
						}

						this.ints_e[var11] = ~var5;
						if (var4 <= var11) {
							var4 = var11 - -1;
						}
					}

					++var5;
				} while (var5 < var2);

			}
		} catch (RuntimeException var17) {
			throw ec.a(var17, "ad.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int a(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
		int var11 = client.int_gc;

		try {
			if (var6 != 4581) {
				return -110;
			} else {
				++int_a;
				if (~var3 == -1) {
					return 0;
				} else {
					int var7 = 0;
					var3 += var5;
					int var8 = var2;

					do {
						byte var9;
						label82:
						{
							var9 = var4[var8];
							if (var9 < 0) {
								var7 = this.ints_e[var7];
								if (var11 == 0) {
									break label82;
								}
							}

							++var7;
						}

						int var10;
						if (~(var10 = this.ints_e[var7]) > -1) {
							var1[var5++] = (byte) (~var10);
							if (var5 >= var3) {
								break;
							}

							var7 = 0;
						}

						label150:
						{
							if (~(64 & var9) != -1) {
								var7 = this.ints_e[var7];
								if (var11 == 0) {
									break label150;
								}
							}

							++var7;
						}

						if ((var10 = this.ints_e[var7]) < 0) {
							var1[var5++] = (byte) (~var10);
							if (~var5 <= ~var3) {
								break;
							}

							var7 = 0;
						}

						label144:
						{
							if (~(32 & var9) != -1) {
								var7 = this.ints_e[var7];
								if (var11 == 0) {
									break label144;
								}
							}

							++var7;
						}

						if ((var10 = this.ints_e[var7]) < 0) {
							var1[var5++] = (byte) (~var10);
							if (var3 <= var5) {
								break;
							}

							var7 = 0;
						}

						label138:
						{
							if ((16 & var9) == 0) {
								++var7;
								if (var11 == 0) {
									break label138;
								}
							}

							var7 = this.ints_e[var7];
						}

						if (~(var10 = this.ints_e[var7]) > -1) {
							var1[var5++] = (byte) (~var10);
							if (var5 >= var3) {
								break;
							}

							var7 = 0;
						}

						label132:
						{
							if (~(var9 & 8) != -1) {
								var7 = this.ints_e[var7];
								if (var11 == 0) {
									break label132;
								}
							}

							++var7;
						}

						if ((var10 = this.ints_e[var7]) < 0) {
							var1[var5++] = (byte) (~var10);
							if (var3 <= var5) {
								break;
							}

							var7 = 0;
						}

						label126:
						{
							if (~(4 & var9) == -1) {
								++var7;
								if (var11 == 0) {
									break label126;
								}
							}

							var7 = this.ints_e[var7];
						}

						if ((var10 = this.ints_e[var7]) < 0) {
							var1[var5++] = (byte) (~var10);
							if (~var5 <= ~var3) {
								break;
							}

							var7 = 0;
						}

						label120:
						{
							if (~(var9 & 2) == -1) {
								++var7;
								if (var11 == 0) {
									break label120;
								}
							}

							var7 = this.ints_e[var7];
						}

						if ((var10 = this.ints_e[var7]) < 0) {
							var1[var5++] = (byte) (~var10);
							if (var5 >= var3) {
								break;
							}

							var7 = 0;
						}

						label114:
						{
							if (~(var9 & 1) == -1) {
								++var7;
								if (var11 == 0) {
									break label114;
								}
							}

							var7 = this.ints_e[var7];
						}

						if ((var10 = this.ints_e[var7]) < 0) {
							var1[var5++] = (byte) (~var10);
							if (~var3 >= ~var5) {
								break;
							}

							var7 = 0;
						}

						++var8;
					} while (var11 == 0);

					return 1 + var8 + -var2;
				}
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "ad.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
		}
	}

	static {
		noReplyFromLoginserver = mNoReplyFromLoginserver;
		mPleaseWait1MinuteAndTryAgain = dd.a("Please wait 1 minute and try again)3", 2);
		pleaseWait1MinuteAndTryAgain = mPleaseWait1MinuteAndTryAgain;
		pleaseWait1MinuteAndTryAgain2 = mPleaseWait1MinuteAndTryAgain;
	}
}
