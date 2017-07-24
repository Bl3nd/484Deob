final class ug extends j {

	static int Q;
	static int R;
	static int S;
	private boolean T = true;
	static int U;
	static lf V = dd.a("leuchten3:", 2);
	static int W;
	private int X = 4096;
	static rc Y = new rc(64);
	static lf assistreqFlag = dd.a(":assistreq:", 2);
	static lf lf_ab;
	static int int_bb = 0;
	static lf lf_cb = dd.a("0(U", 2);
	private static lf lf_db = dd.a("You have only just left another world)3", 2);
	static lf lf_eb = dd.a("(U3", 2);
	static lf b12_full = dd.a("b12_full", 2);//lf_fb

	final void a(byte var1, int var2, ja var3) {
		try {
			if (var1 >= -120) {
				e(57);
			}

			++W;
			if (var2 != 0) {
				if (~var2 != -2) {
					return;
				}

				if (client.int_gc == 0) {
					this.T = ~var3.j((byte) 99) == -2;
					return;
				}
			}

			this.X = var3.b(true);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ug.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final void d(byte var0) {
		try {
			int var1 = 39 % ((36 - var0) / 45);
			jc.z = null;
			l.ints_t = null;
			lc.B = null;
			uc.Hb = null;
			ua.K = null;
			di.W = null;
			fh.ints_i = null;
			dd.T = null;
			pc.bytes_d = null;
			ah.bytes_d = null;
			wb.bytes_s = null;
			++U;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ug.A(" + var0 + ')');
		}
	}

	public static void e(int var0) {
		try {
			lf_ab = null;
			lf_eb = null;
			assistreqFlag = null;
			Y = null;
			lf_cb = null;
			if (var0 <= 68) {
				e(-46);
			}

			b12_full = null;
			lf_db = null;
			V = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ug.B(" + var0 + ')');
		}
	}

	final int[][] b(int var1, int var2) {
		int var21 = client.int_gc;

		try {
			if (var2 != 2177) {
				return null;
			} else {
				++Q;
				int[][] var3 = super.jh_q.a((byte) -128, var1);
				if (super.jh_q.boolean_w) {
					int[] var4 = this.a((int) (var1 + -1 & qb.Z), 124, 0);
					int[] var5 = this.a((int) var1, 7, 0);
					int[] var6 = this.a((int) (1 + var1 & qb.Z), var2 ^ 2236, 0);
					int[] var7 = var3[0];
					int[] var8 = var3[1];
					int[] var9 = var3[2];
					int var10 = 0;
					if (var21 != 0 || ~ff.int_a < ~var10) {
						do {
							int var11;
							int var12;
							int var13;
							label27:
							{
								int var14 = (-var4[var10] + var6[var10]) * this.X;
								int var15 = this.X * (-var5[-1 + var10 & ch.int_h] + var5[1 + var10 & ch.int_h]);
								int var16 = var15 >> -251860244;
								int var18 = var16 * var16 >> -658363828;
								int var17 = var14 >> 525937772;
								int var19 = var17 * var17 >> 1772520108;
								int var20 = (int) (Math.sqrt((double) ((4096 + (var18 - -var19)) / 4096)) * 4096.0D);
								if (var20 != 0) {
									var13 = 16777216 / var20;
									var11 = var15 / var20;
									var12 = var14 / var20;
									if (var21 == 0) {
										break label27;
									}
								}

								var11 = 0;
								var12 = 0;
								var13 = 0;
							}

							if (this.T) {
								var11 = 2048 - -(var11 >> -1311847871);
								var12 = 2048 - -(var12 >> 234013825);
								var13 = 2048 - -(var13 >> -235282655);
							}

							var7[var10] = var11;
							var8[var10] = var12;
							var9[var10] = var13;
							++var10;
						} while (~ff.int_a < ~var10);
					}
				}

				return var3;
			}
		} catch (RuntimeException var22) {
			throw ec.a(var22, "ug.E(" + var1 + ',' + var2 + ')');
		}
	}

	public ug() {
		super(1, false);
	}

	static {
		lf_ab = lf_db;
	}
}
