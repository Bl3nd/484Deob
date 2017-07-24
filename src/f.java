final class f extends j {

	private int Q = 0;
	static lf R = dd.a("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 2);
	static kf S;
	static int T;
	static oh[] U = new oh[256];
	static int[] V;
	static tf W = new tf();
	static int X;
	static int Y;
	static int Z;
	static boolean boolean_ab = false;
	static ed[] eds_bb = new ed[100];
	static int int_cb;
	private int int_db = 0;
	private static lf lf_eb = dd.a("Loaded wordpack", 2);
	static lf lf_fb;
	private int int_gb = 1;

	static final void a(bg var0, int var1) {
		try {
			int var2 = -108 % ((54 - var1) / 51);
			rf.W = var0;
			++Z;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "f.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var11 = client.int_gc;

		try {
			if (var1 > -49) {
				return null;
			} else {
				int[] var3 = super.H.a(-314, var2);
				if (super.H.boolean_v) {
					int var4 = fc.G[var2];
					int var5 = -2048 + var4 >> 1280934465;
					int var6 = 0;
					if (var11 != 0 || ff.int_a > var6) {
						do {
							int var7;
							label38:
							{
								int var8 = ef.ints_m[var6];
								int var9 = -2048 + var8 >> 1719762241;
								if (~this.int_db != -1) {
									int var10 = var5 * var5 + var9 * var9 >> 2062981196;
									var7 = (int) (4096.0D * Math.sqrt((double) (var10 / 4096)));
									var7 = (int) (3.141592653589793D * (double) (this.int_gb * var7));
									if (var11 == 0) {
										break label38;
									}
								}

								var7 = this.int_gb * (-var4 + var8);
							}

							label32:
							{
								var7 &= -4096;
								if (~this.Q == -1) {
									var7 = ne.ints_d[var7 >> -1136928380 & 255] - -4096 >> -1051603615;
									if (var11 == 0) {
										break label32;
									}
								}

								if (this.Q == 2) {
									var7 -= 2048;
									if (~var7 > -1) {
										var7 = -var7;
									}

									var7 = 2048 + -var7 << -1771766783;
								}
							}

							var3[var6] = var7;
							++var6;
						} while (ff.int_a > var6);
					}
				}

				++Y;
				return var3;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "f.G(" + var1 + ',' + var2 + ')');
		}
	}

	public f() {
		super(0, true);
	}

	public static void b(boolean var0) {
		try {
			eds_bb = null;
			V = null;
			S = null;
			U = null;
			if (!var0) {
				b(false);
			}

			R = null;
			W = null;
			lf_eb = null;
			lf_fb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "f.A(" + var0 + ')');
		}
	}

	final void c(int var1) {
		try {
			td.b(var1 ^ 25713);
			if (var1 != 25614) {
				a((bg) null, -68);
			}

			++T;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "f.M(" + var1 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label41:
			{
				label40:
				{
					label39:
					{
						if (~var2 != -1) {
							if (var2 == 1) {
								break label39;
							}

							if (var2 != 3) {
								break label41;
							}

							if (var5 == 0) {
								break label40;
							}
						}

						this.int_db = var3.j((byte) 93);
						if (var5 == 0) {
							break label41;
						}
					}

					this.Q = var3.j((byte) 113);
					if (var5 == 0) {
						break label41;
					}
				}

				this.int_gb = var3.j((byte) 95);
			}

			if (var1 >= -120) {
				b(false);
			}

			++int_cb;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "f.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static {
		lf_fb = lf_eb;
	}
}
