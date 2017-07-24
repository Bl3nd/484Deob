import java.math.BigInteger;

class ja extends hb {

	static int int_n;
	static int int_o;
	static int int_p;
	static int int_q;
	static int int_r;
	static int int_s;
	static int int_t;
	static int int_u;
	static int int_v;
	static int int_w;
	static int x;
	static int y;
	static int z;
	static int A;
	static int B;
	static int C;
	static int D;
	static int E;
	static int F;
	static int G;
	static int H;
	static int I;
	static int J;
	private static lf K = dd.a("Loading)3)3)3", 2);
	static int L;
	static int M;
	static int N;
	static int O;
	int P;
	static int Q;
	static lf R;
	static int S;
	static int T;
	static int U;
	static int V;
	static int W;
	static int X;
	static lf Y = dd.a(")1p", 2);
	static int Z;
	static int int_ab;
	static int int_bb;
	static int int_cb = 10;
	static int int_db;
	static int int_eb;
	static int int_fb;
	static int int_gb;
	static int int_hb;
	static int int_ib;
	static int int_jb;
	static int int_kb;
	static int int_lb;
	static int int_mb;
	static int int_nb;
	static int int_ob;
	static int int_pb;
	static int int_qb;
	static int int_rb;
	static int int_sb;
	static int int_tb;
	static int int_ub;
	static int int_vb;
	static int int_wb;
	static int xb;
	byte[] yb;

	final void a(int var1, int var2) {
		try {
			this.yb[this.P++] = (byte) (var1 >> 16);
			++int_qb;
			if (var2 != -2140) {
				Y = null;
			}

			this.yb[this.P++] = (byte) (var1 >> 8);
			this.yb[this.P++] = (byte) var1;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.VA(" + var1 + ',' + var2 + ')');
		}
	}

	final int a(int var1) {
		try {
			++int_ab;
			int var2 = 255 & this.yb[this.P];
			return var1 <= var2 ? this.b(true) - '쀀' : -64 + this.j((byte) 116);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.L(" + var1 + ')');
		}
	}

	public static void c(byte var0) {
		try {
			if (var0 < 116) {
				R = null;
			}

			K = null;
			R = null;
			Y = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ja.NA(" + var0 + ')');
		}
	}

	final void a(int var1, byte var2) {
		try {
			int var3 = 90 % ((-28 - var2) / 43);
			++C;
			this.yb[this.P++] = (byte) (-var1 + 128);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.SA(" + var1 + ',' + var2 + ')');
		}
	}

	final int b(int var1) {
		try {
			if (var1 != 255) {
				return 5;
			} else {
				this.P += 2;
				++int_rb;
				return ((this.yb[this.P + -2] & 255) << 8) - -(this.yb[this.P - 1] + -128 & 255);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.TB(" + var1 + ')');
		}
	}

	final void a(boolean var1, int var2) {
		try {
			if (!var1) {
				this.yb[this.P++] = (byte) (var2 >> 8);
				++y;
				this.yb[this.P++] = (byte) var2;
				this.yb[this.P++] = (byte) (var2 >> 24);
				this.yb[this.P++] = (byte) (var2 >> 16);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.O(" + var1 + ',' + var2 + ')');
		}
	}

	final int c(int var1) {
		int var4 = client.int_gc;

		try {
			++int_tb;
			if (var1 < 94) {
				return -99;
			} else {
				byte var2 = this.yb[this.P++];
				int var3 = 0;
				if (var4 == 0 && var2 >= 0) {
					return var2 | var3;
				} else {
					do {
						var3 = (var3 | 127 & var2) << 7;
						var2 = this.yb[this.P++];
					} while (var2 < 0);

					return var2 | var3;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ja.N(" + var1 + ')');
		}
	}

	final void b(int var1, int var2) {
		try {
			if (var2 == -2125511736) {
				++int_bb;
				this.yb[this.P++] = (byte) var1;
				this.yb[this.P++] = (byte) (var1 >> 8);
				this.yb[this.P++] = (byte) (var1 >> 16);
				this.yb[this.P++] = (byte) (var1 >> 24);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.J(" + var1 + ',' + var2 + ')');
		}
	}

	final void c(int var1, int var2) {
		try {
			++U;
			this.yb[this.P++] = (byte) (var2 >> 8);
			if (var1 == 9698) {
				this.yb[this.P++] = (byte) var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.HA(" + var1 + ',' + var2 + ')');
		}
	}

	final byte d(int var1) {
		try {
			if (var1 != 10786) {
				this.e((byte) 7);
			}

			++J;
			return (byte) (-this.yb[this.P++]);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.DB(" + var1 + ')');
		}
	}

	final int e(int var1) {
		try {
			++S;
			if (var1 != -2) {
				int_cb = -76;
			}

			this.P += 2;
			int var2 = (255 & this.yb[this.P - 2]) + ((this.yb[this.P - 1] & 255) << 8);
			if (var2 > 32767) {
				var2 -= 65536;
			}

			return var2;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.EA(" + var1 + ')');
		}
	}

	final int f(int var1) {
		try {
			++int_jb;
			int var2 = this.yb[this.P] & 255;
			if (var1 != 0) {
				Y = null;
			}

			return ~var2 <= -129 ? this.b(true) + -32768 : this.j((byte) 111);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.K(" + var1 + ')');
		}
	}

	final int d(byte var1) {
		try {
			++O;
			this.P += 4;
			return var1 < 82 ? 115 : (255 & this.yb[-2 + this.P]) + ((255 & this.yb[this.P - 1]) << 8) + (this.yb[-4 + this.P] << 16 & 16711680) + (-16777216 & this.yb[this.P + -3] << 24);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.U(" + var1 + ')');
		}
	}

	final lf e(byte var1) {
		try {
			if (var1 != 87) {
				int_cb = -39;
			}

			int var2 = this.P;

			while (~this.yb[this.P++] != -1) {
				;
			}

			++int_kb;
			return wd.a(this.yb, -1 + this.P + -var2, var2, false);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.R(" + var1 + ')');
		}
	}

	static int a(bg cache10, bg cache8, byte dummy) {
		try {
			++int_wb;
			int count = 0;
			if (cache10.b(-1, ob.title_jpg, pf.Y)) {
				++count;
			}

			if (cache8.b(-1, ia.logo, pf.Y)) {
				++count;
			}

			if (dummy <= 62) {
				return -91;
			} else {
				if (cache8.b(-1, ig.titlebox, pf.Y)) {
					++count;
				}

				if (cache8.b(-1, bi.titlebutton, pf.Y)) {
					++count;
				}

				if (cache8.b(-1, wb.runes, pf.Y)) {
					++count;
				}

				if (cache8.b(-1, rd.title_mute, pf.Y)) {
					++count;
				}

				cache8.b(-1, ld.sl_back, pf.Y);
				cache8.b(-1, td.sl_flags, pf.Y);
				cache8.b(-1, ub.sl_arrows, pf.Y);
				cache8.b(-1, m.sl_stars, pf.Y);
				cache8.b(-1, wb.sl_button, pf.Y);
				return count;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.DA(" + (cache10 != null ? "{...}" : "null") + ',' + (cache8 != null ? "{...}" : "null") + ',' + dummy + ')');
		}
	}

	static int a(int var0, byte var1, int var2) {
		try {
			++int_pb;
			int var3 = var0 - -(var2 * 57);
			var3 ^= var3 << 13;
			int var4 = Integer.MAX_VALUE & 1376312589 + (789221 + 15731 * var3 * var3) * var3;
			if (var1 <= 111) {
				a(101, (byte) -99, (int) 80);
			}

			return 255 & var4 >> 19;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ja.CB(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final void d(int var1, int var2) {
		try {
			int var3 = -39 / ((var2 - -17) / 45);
			++xb;
			this.yb[-1 + (this.P - var1)] = (byte) var1;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.AB(" + var1 + ',' + var2 + ')');
		}
	}

	final int g(int var1) {
		try {
			++int_gb;
			this.P += 3;
			if (var1 != -1) {
				this.P = 22;
			}

			return ((this.yb[-3 + this.P] & 255) << 16) + ((255 & this.yb[this.P + -1]) << 8) + (this.yb[-2 + this.P] & 255);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.IA(" + var1 + ')');
		}
	}

	final void a(int var1, int var2, byte[] var3, boolean var4) {
		int var6 = client.int_gc;

		try {
			int var5 = var1;
			if (var6 != 0) {
				this.yb[this.P++] = var3[var1];
				var5 = var1 + 1;
			}

			while (var5 < var1 + var2) {
				this.yb[this.P++] = var3[var5];
				++var5;
			}

			if (!var4) {
				this.a(true, 100);
			}

			++I;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ja.IB(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}

	final void e(int unused, int value) {
		try {
			this.yb[this.P++] = (byte) value;
			++Q;
			if (unused != -13488) {
				this.d((byte) 70, -37);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.LA(" + unused + ',' + value + ')');
		}
	}

	final int b(boolean var1) {
		try {
			if (!var1) {
				return 85;
			} else {
				this.P += 2;
				++M;
				return (255 & this.yb[this.P + -1]) + (this.yb[-2 + this.P] << 8 & '\uff00');
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.JA(" + var1 + ')');
		}
	}

	final void a(BigInteger var1, BigInteger var2, byte var3) {
		try {
			int var4 = this.P;
			++int_eb;
			this.P = 0;
			byte[] var5 = new byte[var4];
			this.a(var5, 0, var4, 1174839336);
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6/*var6.modPow(var1, var2)*/;
			byte[] var8 = var7.toByteArray();
			if (var3 >= 73) {
				this.P = 0;
				this.e(-13488, var8.length);
				this.a(0, var8.length, var8, true);
			}
		} catch (RuntimeException var9) {
			throw ec.a(var9, "ja.KB(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final byte h(int var1) {
		try {
			if (var1 < 84) {
				return (byte) -23;
			} else {
				++W;
				return (byte) (128 + -this.yb[this.P++]);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.MB(" + var1 + ')');
		}
	}

	final long i(int var1) {
		try {
			if (var1 != -1495411552) {
				return -106L;
			} else {
				++int_nb;
				long var2 = (long) this.l(15) & 4294967295L;
				long var4 = (long) this.l(15) & 4294967295L;
				return var4 + (var2 << 32);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ja.CA(" + var1 + ')');
		}
	}

	final int j(int var1) {
		try {
			++H;
			if (var1 != 24263) {
				this.d((int) -108, 126);
			}

			return 255 & -this.yb[this.P++] + 128;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.V(" + var1 + ')');
		}
	}

	final void f(int var1, int var2) {
		try {
			this.yb[this.P++] = (byte) var2;
			if (var1 != 1174839336) {
				R = null;
			}

			++int_u;
			this.yb[this.P++] = (byte) (var2 >> 8);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.EB(" + var1 + ',' + var2 + ')');
		}
	}

	final int k(int var1) {
		try {
			++V;
			if (var1 != 1440014816) {
				this.j((byte) 46);
			}

			this.P += 2;
			return ((this.yb[-1 + this.P] & 255) << 8) + (-128 + this.yb[-2 + this.P] & 255);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.S(" + var1 + ')');
		}
	}

	final void a(byte var1, int[] keys, int bufferLength, int pointer) {
		try {
			++int_o;
			int var5 = this.P;
			this.P = pointer;
			int var7 = 34 / ((var1 - 46) / 62);
			int var6 = (bufferLength - pointer) / 8;
			int var8 = 0;
			if (var6 <= var8) {
				this.P = var5;
			} else {
				do {
					int var9 = this.l(15);
					int var12 = -1640531527;
					int var13 = 32;
					int var10 = this.l(15);
					int var11 = -957401312;
					if (var13-- <= 0) {
						this.P -= 8;
						this.b((byte) 114, var9);
						this.b((byte) 127, var10);
						++var8;
					} else {
						do {
							var10 -= var11 - -keys[117440515 & var11 >>> 11] ^ (var9 << 4 ^ var9 >>> 5) - -var9;
							var11 -= var12;
							var9 -= var11 + keys[var11 & 3] ^ (var10 << 4 ^ var10 >>> 5) - -var10;
						} while (var13-- > 0);

						this.P -= 8;
						this.b((byte) 114, var9);
						this.b((byte) 127, var10);
						++var8;
					}
				} while (~var6 < ~var8);

				this.P = var5;
			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "ja.BB(" + var1 + ',' + (keys != null ? "{...}" : "null") + ',' + bufferLength + ',' + pointer + ')');
		}
	}

	final int c(boolean var1) {
		try {
			this.P += 2;
			++x;
			int var2 = (this.yb[this.P + -1] & 255) + (this.yb[this.P + -2] << 8 & '\uff00');
			if (~var2 < -32768) {
				var2 -= 65536;
			}

			return !var1 ? 56 : var2;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.GA(" + var1 + ')');
		}
	}

	final int f(byte var1) {
		try {
			++int_n;
			if (var1 != 59) {
				this.l(118);
			}

			this.P += 3;
			return (this.yb[-1 + this.P] & 255) + (this.yb[this.P + -3] << 16 & 16711680) + ('\uff00' & this.yb[-2 + this.P] << 8);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.M(" + var1 + ')');
		}
	}

	final int g(byte var1) {
		try {
			int var2 = 55 % ((var1 - 13) / 32);
			this.P += 4;
			++D;
			return (this.yb[this.P - 3] & 255) + (this.yb[this.P - 4] << 8 & '\uff00') + ((-16777216 & this.yb[this.P - 2] << 24) - -((this.yb[this.P - 1] & 255) << 16));
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.KA(" + var1 + ')');
		}
	}

	final int d(boolean var1) {
		try {
			if (!var1) {
				return 52;
			} else {
				this.P += 4;
				++Z;
				return (255 & this.yb[this.P - 4]) + ((this.yb[-3 + this.P] << 8 & '\uff00') + ((this.yb[this.P - 1] & 255) << 24) - -(this.yb[-2 + this.P] << 16 & 16711680));
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.PB(" + var1 + ')');
		}
	}

	final void g(int var1, int var2) {
		try {
			++int_vb;
			if ((var2 & -128) != 0) {
				if (~(-16384 & var2) != -1) {
					if (~(var2 & -2097152) != -1) {
						if ((var2 & -268435456) != 0) {
							this.e(-13488, var2 >>> 28 | 128);
						}

						this.e(-13488, 128 | var2 >>> 21);
					}

					this.e(-13488, (var2 | 2104015) >>> 14);
				}

				this.e(-13488, var2 >>> 7 | 128);
			}

			this.e(-13488, var2 & 127);
			if (var1 != -1124959588) {
				Y = null;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.LB(" + var1 + ',' + var2 + ')');
		}
	}

	final int l(int var1) {
		try {
			++G;
			if (var1 != 15) {
				return -104;
			} else {
				this.P += 4;
				return (this.yb[this.P - 1] & 255) + (this.yb[this.P - 4] << 24 & 0xff000000) + (this.yb[this.P - 3] << 16 & 0xff0000) + ('\uff00' & this.yb[-2 + this.P] << 8);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.QB(" + var1 + ')');
		}
	}

	final void a(byte[] var1, int var2, int var3, int var4) {
		int var6 = client.int_gc;

		try {
			++int_p;
			int var5 = var2;
			if (var6 != 0) {
				var1[var2] = this.yb[this.P++];
				var5 = var2 + 1;
			}

			while (var2 + var3 > var5) {
				var1[var5] = this.yb[this.P++];
				++var5;
			}

			if (var4 != 1174839336) {
				this.d((int) 104);
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ja.MA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final byte m(int var1) {
		try {
			if (var1 != 3) {
				Y = null;
			}

			++X;
			return this.yb[this.P++];
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.HB(" + var1 + ')');
		}
	}

	final void a(lf var1, byte var2) {
		try {
			this.P += var1.a(this.P, this.yb, 0, var1.e(-30593), (byte) 9);
			this.yb[this.P++] = 0;
			++A;
			if (var2 > 0) {
				this.h((int) 5);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.W(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	final void a(int var1, boolean var2) {
		try {
			++int_ib;
			if (~var1 <= -1 && var1 < 128) {
				this.e(-13488, var1);
			} else {
				if (!var2) {
					this.yb = null;
				}

				if (~var1 <= -1 && var1 < '耀') {
					this.c((int) 9698, var1 + '耀');
				} else {
					throw new IllegalArgumentException();
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.WA(" + var1 + ',' + var2 + ')');
		}
	}

	final void a(byte var1, int var2) {
		try {
			this.yb[this.P++] = (byte) (128 + var2);
			++z;
			if (var1 != -36) {
				this.a(true, -75);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.OB(" + var1 + ',' + var2 + ')');
		}
	}

	final void b(byte unused, int value) {
		try {
			if (unused < 99) {
				this.a(-58);
			}

			++int_w;
			this.yb[this.P++] = (byte) (value >> 24);
			this.yb[this.P++] = (byte) (value >> 16);
			this.yb[this.P++] = (byte) (value >> 8);
			this.yb[this.P++] = (byte) value;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.OA(" + unused + ',' + value + ')');
		}
	}

	final void a(int var1, int var2, int var3, byte[] var4) {
		try {
			++int_sb;
			int var5 = var2 + var1 + -1;
			int var6 = -42 / ((22 - var3) / 41);
			if (var1 <= var5) {
				do {
					var4[var5] = (byte) (this.yb[this.P++] - 128);
					--var5;
				} while (var1 <= var5);

			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "ja.RB(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	final int n(int var1) {
		try {
			if (var1 != 28747) {
				this.c((int) -95, -98);
			}

			++B;
			return -this.yb[this.P++] & 255;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.TA(" + var1 + ')');
		}
	}

	final void b(int var1, int var2, int var3, byte[] var4) {
		int var6 = client.int_gc;

		try {
			int var5 = var2;
			if (var6 == 0 && ~(var3 + var2) >= ~var2) {
				if (var1 == 0) {
					++int_ub;
				}
			} else {
				do {
					var4[var5] = (byte) (-128 + this.yb[this.P++]);
					++var5;
				} while (~(var3 + var2) < ~var5);

				if (var1 == 0) {
					++int_ub;
				}
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "ja.SB(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(long var1, int var3) {
		try {
			++int_mb;
			this.yb[this.P++] = (byte) ((int) (var1 >> 56));
			this.yb[this.P++] = (byte) ((int) (var1 >> 48));
			this.yb[this.P++] = (byte) ((int) (var1 >> 40));
			this.yb[this.P++] = (byte) ((int) (var1 >> 32));
			this.yb[this.P++] = (byte) ((int) (var1 >> 24));
			this.yb[this.P++] = (byte) ((int) (var1 >> 16));
			if (var3 == -562765672) {
				this.yb[this.P++] = (byte) ((int) (var1 >> 8));
				this.yb[this.P++] = (byte) ((int) var1);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ja.Q(" + var1 + ',' + var3 + ')');
		}
	}

	final int o(int var1) {
		try {
			++int_v;
			return var1 <= 31 ? 2 : 255 & -128 + this.yb[this.P++];
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.FA(" + var1 + ')');
		}
	}

	final int p(int var1) {
		try {
			if (var1 != 255) {
				this.b((int) 66, 80);
			}

			++int_fb;
			this.P += 2;
			return (255 & this.yb[-2 + this.P]) + ((255 & this.yb[this.P - 1]) << 8);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.RA(" + var1 + ')');
		}
	}

	final int h(byte var1) {
		int var5 = client.int_gc;

		try {
			++F;
			int var3 = this.f((int) 0);
			int var4 = -98 / ((var1 - -48) / 53);
			int var2 = 0;
			if (var5 != 0) {
				var3 = this.f((int) 0);
				var2 += 32767;
			}

			while (~var3 == -32768) {
				var3 = this.f((int) 0);
				var2 += 32767;
			}

			var2 += var3;
			return var2;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ja.GB(" + var1 + ')');
		}
	}

	final lf i(byte var1) {
		try {
			++int_t;
			if (var1 != 113) {
				this.b(38);
			}

			if (this.yb[this.P] == 0) {
				++this.P;
				return null;
			} else {
				return this.e((byte) 87);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.P(" + var1 + ')');
		}
	}

	final void a(boolean var1, long var2) {
		try {
			++E;
			this.b((int) (var2 >> 32), -2125511736);
			if (!var1) {
				this.yb = null;
			}

			this.b((int) var2, -2125511736);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ja.AA(" + var1 + ',' + var2 + ')');
		}
	}

	final int j(byte var1) {
		try {
			if (var1 < 68) {
				this.a((int) -123, (byte) -89);
			}

			++int_s;
			return this.yb[this.P++] & 255;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.UA(" + var1 + ')');
		}
	}

	final int k(byte var1) {
		try {
			++int_lb;
			this.P += 2;
			int var3 = 107 % ((var1 - -8) / 45);
			int var2 = ('\uff00' & this.yb[this.P + -2] << 8) + (255 & -128 + this.yb[-1 + this.P]);
			if (var2 > 32767) {
				var2 -= 65536;
			}

			return var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.BA(" + var1 + ')');
		}
	}

	final void h(int var1, int var2) {
		try {
			this.yb[this.P++] = (byte) (var2 + var1);
			++N;
			this.yb[this.P++] = (byte) (var1 >> 8);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.FB(" + var1 + ',' + var2 + ')');
		}
	}

	static void a(int var0, int var1, byte var2) {
		int var5 = client.int_gc;

		try {
			++int_r;
			if (var2 != 69) {
				Y = null;
			}

			if (qa.int_eb >= 2 || pa.int_u != 0 || nb.boolean_a) {
				lf var3;
				label51:
				{
					if (~pa.int_u == -2 && ~qa.int_eb > -3) {
						var3 = de.a(new lf[]{ha.lf_o, dc.R, wb.lf_b, se.lf_lb}, 117);
						if (var5 == 0) {
							break label51;
						}
					}

					if (!nb.boolean_a || qa.int_eb >= 2) {
						var3 = mb.a(-1 + qa.int_eb, (byte) -82);
						if (var5 == 0) {
							break label51;
						}
					}

					var3 = de.a(new lf[]{md.lf_d, dc.R, sd.U, se.lf_lb}, -32);
				}

				if (~qa.int_eb < -3) {
					var3 = de.a(new lf[]{var3, ei.lf_j, fa.a((byte) 85, qa.int_eb - 2), u.lf_dd}, var2 + 57);
				}

				int var4 = ee.S.a(var3, var1 - -4, var0 + 15, 16777215, 0, je.random_h, je.int_n);
				v.a(15, var0, var1 + 4, ee.S.b(var3) - -var4, 188);
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ja.NB(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final int i(int var1, int var2) {
		try {
			if (var2 != -1503604504) {
				return 103;
			} else {
				++int_ob;
				int var3 = vh.a((byte) 127, this.yb, this.P, var1);
				this.b((byte) 103, var3);
				return var3;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.PA(" + var1 + ',' + var2 + ')');
		}
	}

	ja(int capacity) {
		try {
			this.yb = rb.a(capacity, -78);
			this.P = 0;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.<init>(" + capacity + ')');
		}
	}

	ja(byte[] var1) {
		try {
			this.P = 0;
			this.yb = var1;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ja.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final void b(int var1, boolean var2) {
		try {
			++T;
			this.yb[this.P++] = (byte) (var1 >> 8);
			if (!var2) {
				R = null;
			}

			this.yb[this.P++] = (byte) (128 + var1);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.JB(" + var1 + ',' + var2 + ')');
		}
	}

	final void c(byte var1, int var2) {
		try {
			this.yb[this.P++] = (byte) (var2 >> 16);
			++int_q;
			this.yb[this.P++] = (byte) (var2 >> 24);
			this.yb[this.P++] = (byte) var2;
			if (var1 == -98) {
				this.yb[this.P++] = (byte) (var2 >> 8);
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.T(" + var1 + ',' + var2 + ')');
		}
	}

	final void d(byte var1, int var2) {
		try {
			++int_db;
			this.yb[-4 + -var2 + this.P] = (byte) (var2 >> 24);
			this.yb[-var2 + this.P + -3] = (byte) (var2 >> 16);
			this.yb[this.P - (var2 - -2)] = (byte) (var2 >> 8);
			this.yb[-var2 + this.P + -1] = (byte) var2;
			if (var1 <= 91) {
				R = null;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ja.QA(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		R = K;
	}
}
