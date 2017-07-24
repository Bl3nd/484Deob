import java.io.EOFException;
import java.io.IOException;

final class wb {

	private int int_a = '\ufde8';
	static lf lf_b = null;
	static int int_c;
	static lf lf_d = dd.a("Die Adresse dieses Computers wurde gesperrt)1", 2);
	private int int_e;
	static int int_f;
	static int int_g = 0;
	static lf sl_button = dd.a("sl_button", 2);//lf_h
	static lf lf_i = dd.a("rot:", 2);
	static int int_j;
	static int int_k;
	private hf hf_l = null;
	static int int_m;
	static int int_n;
	private hf hf_o = null;
	static int int_p;
	static int int_q = 0;
	static lf runes = dd.a("runes", 2);//lf_r
	static byte[][][] bytes_s;

	public final String toString() {
		try {
			++int_p;
			return "Cache:" + this.int_e;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wb.toString(" + ')');
		}
	}

	final byte[] a(int var1, byte var2) {
		int var18 = client.int_gc;

		try {
			++int_c;
			synchronized (this.hf_o) {
				byte[] var25;
				try {
					if ((long) (6 * var1 + 6) > this.hf_l.b((int) -117)) {
						return null;
					}

					int var6 = -108 % ((54 - var2) / 36);
					this.hf_l.a((long) (var1 * 6), false);
					this.hf_l.a(-125, 0, 6, kb.bytes_c);
					int var8 = (kb.bytes_c[5] & 255) + ('\uff00' & kb.bytes_c[4] << 8) + (kb.bytes_c[3] << 16 & 16711680);
					int var7 = (16711680 & kb.bytes_c[0] << 16) - -((255 & kb.bytes_c[1]) << 8) - -(kb.bytes_c[2] & 255);
					if (var7 < 0 || var7 > this.int_a) {
						return null;
					}

					byte[] var9;
					label263:
					{
						if (var8 > 0 && ~((long) var8) >= ~(this.hf_o.b((int) -127) / 520L)) {
							var9 = new byte[var7];
							int var11 = 0;
							int var10 = 0;
							if (var18 == 0 && ~var7 >= ~var10) {
								break label263;
							}

							while (~var8 != -1) {
								this.hf_o.a((long) (520 * var8), false);
								int var12 = var7 - var10;
								if (var12 > 512) {
									var12 = 512;
								}

								this.hf_o.a(-126, 0, 8 + var12, kb.bytes_c);
								int var13 = (255 & kb.bytes_c[1]) + (kb.bytes_c[0] << -1773798232 & '\uff00');
								int var16 = kb.bytes_c[7] & 255;
								int var14 = (kb.bytes_c[2] << -597854200 & '\uff00') + (kb.bytes_c[3] & 255);
								int var15 = (kb.bytes_c[5] << -2035406168 & '\uff00') + ((255 & kb.bytes_c[4]) << 194881872) - -(kb.bytes_c[6] & 255);
								if (var1 != var13 || var11 != var14 || var16 != this.int_e) {
									return null;
								}

								if (~var15 > -1 || (long) var15 > this.hf_o.b((int) -119) / 520L) {
									return null;
								}

								var8 = var15;
								++var11;
								int var17 = 0;
								if (var18 != 0 || var12 > var17) {
									do {
										var9[var10++] = kb.bytes_c[var17 + 8];
										++var17;
									} while (var12 > var17);
								}

								if (~var7 >= ~var10) {
									break label263;
								}
							}

							return null;
						}

						return null;
					}

					var25 = var9;
				} catch (IOException var22) {
					return null;
				}

				return var25;
			}
		} catch (RuntimeException var24) {
			throw ec.a(var24, "wb.B(" + var1 + ',' + var2 + ')');
		}
	}

	static void a(byte[] var0, int var1, wb var2, int var3) {
		try {
			++int_j;
			of var4 = new of();
			var4.y = var0;
			var4.wb_n = var2;
			var4.int_p = var3;
			var4.long_e = (long) var1;
			synchronized (f.W) {
				f.W.a(var4, (int) 0);
			}

			gg.b((byte) -86);
		} catch (RuntimeException var9) {
			throw ec.a(var9, "wb.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final boolean a(byte[] var1, int var2, int var3, int var4) {
		try {
			++int_k;
			synchronized (this.hf_o) {
				boolean var5;
				if (var4 < 0 || this.int_a < var4) {
					throw new IllegalArgumentException();
				}

				boolean var8 = this.a(true, var3 ^ 16711935, var1, var2, var4);
				if (var3 != 255) {
					this.hf_o = null;
				}

				if (!var8) {
					var8 = this.a(false, 16711680, var1, var2, var4);
				}

				var5 = var8;
				return var5;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "wb.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static void a(byte var0, int var1) {
		int var5 = client.int_gc;

		try {
			++int_m;
			if (var0 != 58) {
				int_f = 33;
			}

			if (ua.a(false, var1)) {
				vg[] var2 = sc.vgs_db[var1];
				int var3 = 0;
				if (var5 != 0 || ~var2.length < ~var3) {
					do {
						vg var4 = var2[var3];
						if (var4 != null) {
							var4.int_h = 0;
							var4.int_uc = 0;
						}

						++var3;
					} while (~var2.length < ~var3);

				}
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "wb.E(" + var0 + ',' + var1 + ')');
		}
	}

	private final boolean a(boolean var1, int var2, byte[] var3, int var4, int var5) {
		int var16 = client.int_gc;

		try {
			++int_n;
			synchronized (this.hf_o) {
				if (var2 != 16711680) {
					this.a(true, 84, (byte[]) null, 19, -39);
				}

				boolean var6;
				try {
					int var9;
					label266:
					{
						if (!var1) {
							var9 = (int) ((519L + this.hf_o.b((int) -118)) / 520L);
							if (~var9 != -1) {
								break label266;
							}

							var9 = 1;
							if (var16 == 0) {
								break label266;
							}
						}

						if (this.hf_l.b((int) -126) < (long) (6 * var4 + 6)) {
							return false;
						}

						this.hf_l.a((long) (var4 * 6), false);
						this.hf_l.a(-128, 0, 6, kb.bytes_c);
						var9 = (255 & kb.bytes_c[5]) + ((255 & kb.bytes_c[3]) << 1308001232) + ((255 & kb.bytes_c[4]) << 365165256);
						if (~var9 >= -1 || ~(this.hf_o.b((int) -126) / 520L) > ~((long) var9)) {
							return false;
						}
					}

					kb.bytes_c[2] = (byte) var5;
					kb.bytes_c[5] = (byte) var9;
					int var10 = 0;
					kb.bytes_c[1] = (byte) (var5 >> 2064803880);
					kb.bytes_c[0] = (byte) (var5 >> -916770352);
					kb.bytes_c[4] = (byte) (var9 >> 332052200);
					int var11 = 0;
					kb.bytes_c[3] = (byte) (var9 >> -749403440);
					this.hf_l.a((long) (6 * var4), false);
					this.hf_l.a(kb.bytes_c, 0, (byte) 19, 6);
					if (var16 != 0 || ~var10 > ~var5) {
						do {
							int var12 = 0;
							int var13;
							if (var1) {
								label295:
								{
									this.hf_o.a((long) (520 * var9), false);

									try {
										this.hf_o.a(var2 ^ -16711806, 0, 8, kb.bytes_c);
									} catch (EOFException var21) {
										if (var16 == 0) {
											break;
										}
									}

									var12 = (kb.bytes_c[6] & 255) + (16711680 & kb.bytes_c[4] << 1746170544) - -('\uff00' & kb.bytes_c[5] << 1779492296);
									var13 = ('\uff00' & kb.bytes_c[0] << -1842959352) + (255 & kb.bytes_c[1]);
									int var14 = (kb.bytes_c[2] << -328463928 & '\uff00') - -(kb.bytes_c[3] & 255);
									int var15 = kb.bytes_c[7] & 255;
									if (~var13 == ~var4 && var11 == var14 && var15 == this.int_e) {
										if (~var12 <= -1 && (long) var12 <= this.hf_o.b((int) -119) / 520L) {
											break label295;
										}

										return false;
									}

									return false;
								}
							}

							if (var12 == 0) {
								var12 = (int) ((this.hf_o.b((int) -122) + 519L) / 520L);
								var1 = false;
								if (~var12 == -1) {
									++var12;
								}

								if (~var12 == ~var9) {
									++var12;
								}
							}

							if (-var10 + var5 <= 512) {
								var12 = 0;
							}

							kb.bytes_c[5] = (byte) (var12 >> 33088296);
							kb.bytes_c[6] = (byte) var12;
							kb.bytes_c[1] = (byte) var4;
							kb.bytes_c[0] = (byte) (var4 >> -2092479192);
							kb.bytes_c[2] = (byte) (var11 >> 2027219560);
							kb.bytes_c[4] = (byte) (var12 >> -361274032);
							kb.bytes_c[3] = (byte) var11;
							kb.bytes_c[7] = (byte) this.int_e;
							this.hf_o.a((long) (var9 * 520), false);
							var9 = var12;
							++var11;
							var13 = var5 + -var10;
							this.hf_o.a(kb.bytes_c, 0, (byte) 19, 8);
							if (var13 > 512) {
								var13 = 512;
							}

							this.hf_o.a(var3, var10, (byte) 19, var13);
							var10 += var13;
						} while (~var10 > ~var5);
					}

					return true;
				} catch (IOException var22) {
					return false;
				}
			}
		} catch (RuntimeException var24) {
			throw ec.a(var24, "wb.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ')');
		}
	}

	public static void a(int var0) {
		try {
			runes = null;
			if (var0 > -81) {
				int_g = 68;
			}

			lf_d = null;
			lf_i = null;
			bytes_s = null;
			lf_b = null;
			sl_button = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wb.C(" + var0 + ')');
		}
	}

	wb(int cacheID, hf class_hf, hf class_hf2, int i) {
		try {
			this.int_e = cacheID;
			this.hf_l = class_hf2;
			this.int_a = i;
			this.hf_o = class_hf;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "wb.<init>(" + cacheID + ',' + (class_hf != null ? "{...}" : "null") + ',' + (class_hf2 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
