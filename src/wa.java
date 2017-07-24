final class wa extends ja {

	static int zb;
	static int Ab;
	static int Bb;
	static Object Cb = new Object();
	private int Db;
	static int Eb;
	private bd Fb;
	static int Gb;
	static short[][] Hb = new short[][]{{(short) 6554, (short) 115, (short) 10304, (short) 28, (short) 5702, (short) 7756, (short) 5681, (short) 4510, (short) -31835, (short) 22437, (short) 2859, (short) -11339, (short) 16, (short) 5157, (short) 10446, (short) 3658, (short) -27314, (short) -21965, (short) 472, (short) 580, (short) 784, (short) 21966, (short) 28950, (short) -15697, (short) -14002}, {(short) 9104, (short) 10275, (short) 7595, (short) 3610, (short) 7975, (short) 8526, (short) 918, (short) -26734, (short) 24466, (short) 10145, (short) -6882, (short) 5027, (short) 1457, (short) 16565, (short) -30545, (short) 25486, (short) 24, (short) 5392, (short) 10429, (short) 3673, (short) -27335, (short) -21957, (short) 192, (short) 687, (short) 412, (short) 21821, (short) 28835, (short) -15460, (short) -14019}, new short[0], new short[0], new short[0]};
	static int Ib;
	static int Jb = (int) (Math.random() * 33.0D) + -16;
	static int Kb;
	static int[] Lb = new int[]{0, -1, 0, 1};
	static int Mb;
	static long Nb;
	static int Ob;

	static boolean a(int dummy, bg cache8, int cacheID, int fileID) {
		try {
			if (dummy != -21957) {
				return true;
			} else {
				++Bb;
				byte[] data = cache8.a(0, cacheID, fileID);
				if (data == null) {
					return false;
				} else {
					ae.a((byte) -55, data);
					return true;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "wa.C(" + dummy + ',' + (cache8 != null ? "{...}" : "null") + ',' + cacheID + ',' + fileID + ')');
		}
	}

	final int q(int var1) {
		try {
			if (var1 != 30882) {
				this.e((byte) -123, 36);
			}

			++Ob;
			return super.yb[super.P++] - this.Fb.c(var1 ^ -11800) & 255;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "wa.F(" + var1 + ')');
		}
	}

	final void a(boolean var1, int[] var2) {
		try {
			if (var1) {
				Nb = -53L;
			}

			++Ib;
			this.Fb = new bd(var2);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "wa.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	public static void r(int var0) {
		try {
			Cb = null;
			Hb = null;
			if (var0 == 5681) {
				Lb = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wa.E(" + var0 + ')');
		}
	}

	final void e(boolean var1) {
		try {
			++Gb;
			if (!var1) {
				this.b(-93, (byte) -127);
			}

			super.P = (7 + this.Db) / 8;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "wa.H(" + var1 + ')');
		}
	}

	wa(int var1) {
		super(var1);
	}

	final void s(int var1) {
		try {
			++Mb;
			this.Db = super.P * 8;
			if (var1 != 11045) {
				this.Db = -6;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "wa.B(" + var1 + ')');
		}
	}

	final void e(byte var1, int opcode) {
		try {
			if (var1 >= 80) {
				super.yb[super.P++] = (byte) (this.Fb.c(-22198) + opcode);
				System.out.printf("Writing packet: %d%n", opcode);
				++Ab;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "wa.A(" + var1 + ',' + opcode + ')');
		}
	}

	final int b(int var1, byte var2) {
		try {
			if (var2 <= 8) {
				this.s(-87);
			}

			++zb;
			return 8 * var1 - this.Db;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "wa.D(" + var1 + ',' + var2 + ')');
		}
	}

	final int f(byte var1, int var2) {
		int var6 = client.int_gc;

		try {
			int var3 = this.Db >> 1530611587;
			int var4 = -(this.Db & 7) + 8;
			if (var1 <= 61) {
				this.q(63);
			}

			int var5 = 0;
			this.Db += var2;
			++Kb;
			if (var6 != 0) {
				var5 += (cg.T[var4] & super.yb[var3++]) << var2 - var4;
				var2 -= var4;
				var4 = 8;
			}

			while (var2 > var4) {
				var5 += (cg.T[var4] & super.yb[var3++]) << var2 - var4;
				var2 -= var4;
				var4 = 8;
			}

			if (var4 != var2) {
				var5 += super.yb[var3] >> -var2 + var4 & cg.T[var2];
				if (var6 == 0) {
					return var5;
				}
			}

			var5 += super.yb[var3] & cg.T[var4];
			return var5;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "wa.G(" + var1 + ',' + var2 + ')');
		}
	}
}
