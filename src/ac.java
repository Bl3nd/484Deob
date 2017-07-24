final class ac extends ph {

	int G;
	int[] H;
	static lf J;
	static lf L = dd.a("swe", 2);
	int M = 0;
	lf[] N;
	static int O;
	int P;
	static boolean Q = false;
	static int R;
	int[] S;
	static lf T;
	static lf V = dd.a("und die Schaltfl-=che (WSpielkonto erstellen(W am", 2);
	static int W;
	static int X;
	private static lf Y = dd.a("glow2:", 2);
	lf Z;
	static int int_ab;
	int int_bb;
	static int int_cb;
	static lf lf_db;

	public static void d(byte var0) {
		try {
			int var1 = 1 / ((-31 - var0) / 50);
			lf_db = null;
			Y = null;
			V = null;
			J = null;
			L = null;
			T = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ac.A(" + var0 + ')');
		}
	}

	static final vg a(boolean var0, vg var1) {
		int var4 = client.int_gc;

		try {
			++W;
			int var2 = m.a((byte) -33, ne.a(var1, 112));
			if (~var2 == -1) {
				return null;
			} else {
				if (!var0) {
					d((byte) -39);
				}

				int var3 = 0;
				if (var4 == 0 && ~var3 <= ~var2) {
					return var1;
				} else {
					do {
						var1 = ra.a(var1.int_bb, (byte) 119);
						if (var1 == null) {
							return null;
						}

						++var3;
					} while (~var3 > ~var2);

					return var1;
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ac.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	static final void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		rg var8 = new rg();
		var8.A = var2 / 128;
		var8.int_w = var3 / 128;
		var8.int_o = var4 / 128;
		var8.int_j = var5 / 128;
		var8.int_d = var1;
		var8.B = var2;
		var8.int_q = var3;
		var8.y = var4;
		var8.int_g = var5;
		var8.x = var6;
		var8.int_u = var7;
		l.rgs_j[var0][l.ints_e[var0]++] = var8;
	}

	final void a(boolean var1, ja var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var2.j((byte) 99);
				if (~var3 == -1) {
					break;
				}

				this.a(var3, (byte) -116, var2);
			} while (var4 == 0);

			if (var1) {
				this.a(true, (ja) null);
			}

			++X;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ac.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	private final void a(int var1, byte var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label82:
			{
				++R;
				if (var1 == 1) {
					this.P = var3.j((byte) 105);
					if (var5 == 0) {
						break label82;
					}
				}

				if (~var1 != -3) {
					if (~var1 != -4) {
						if (var1 == 4) {
							this.G = var3.l(15);
							if (var5 == 0) {
								break label82;
							}
						}

						int var4;
						if (~var1 == -6) {
							this.M = var3.b(true);
							this.N = new lf[this.M];
							this.S = new int[this.M];
							var4 = 0;
							if (var5 != 0 || ~var4 > ~this.M) {
								do {
									this.S[var4] = var3.l(15);
									this.N[var4] = var3.e((byte) 87);
									++var4;
								} while (~var4 > ~this.M);
							}

							if (var5 == 0) {
								break label82;
							}
						}

						if (~var1 != -7) {
							break label82;
						}

						this.M = var3.b(true);
						this.S = new int[this.M];
						this.H = new int[this.M];
						var4 = 0;
						if (var5 != 0 || this.M > var4) {
							do {
								this.S[var4] = var3.l(15);
								this.H[var4] = var3.l(15);
								++var4;
							} while (this.M > var4);
						}

						if (var5 == 0) {
							break label82;
						}
					}

					this.Z = var3.e((byte) 87);
					if (var5 == 0) {
						break label82;
					}
				}

				this.int_bb = var3.j((byte) 124);
			}

			if (var2 > -80) {
				this.H = null;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "ac.D(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public ac() {
		this.Z = qa.U;
	}

	static {
		J = Y;
		T = dd.a("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 2);
		lf_db = Y;
		int_ab = -1;
	}
}
