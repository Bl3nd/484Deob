final class rd extends ph {

	static int G = 0;
	static int H;
	static lf I = dd.a(" weitere Optionen", 2);
	static int J;
	static int L;
	static int M;
	int N;
	static int O;
	static int P;
	static int Q;
	static int R;
	int S;
	static lf T = dd.a("Musik)2Engine vorbereitet)3", 2);
	int U;
	static lf title_mute = dd.a("title_mute", 2);

	static df a(int var0, boolean var1, int var2, bg var3) {
		try {
			++R;
			if (!wa.a(-21957, var3, var2, var0)) {
				return null;
			} else {
				if (var1) {
					a(false, -12, 115);
				}

				return nf.a(true);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rd.B(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void a(ja var1, int var2) {
		int var4 = client.int_gc;

		try {
			do {
				int var3 = var1.j((byte) 72);
				if (var3 == 0) {
					break;
				}

				this.a(var2 + -18799, var3, var1);
			} while (var4 == 0);

			++M;
			if (var2 != 28109) {
				b(44);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rd.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			if (var0 != 17) {
				T = null;
			}

			T = null;
			I = null;
			title_mute = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "rd.F(" + var0 + ')');
		}
	}

	static void b(int var0) {
		int var10 = client.int_gc;

		try {
			ka.I.s(var0 + -5591);
			++Q;
			int var1 = ka.I.f((byte) 117, 8);
			int var2;
			if (a.int_j > var1) {
				var2 = var1;
				if (var10 != 0 || ~var1 > ~a.int_j) {
					do {
						ne.ints_m[u.int_bd++] = a.ints_h[var2];
						++var2;
					} while (~var2 > ~a.int_j);
				}
			}

			if (var1 > a.int_j) {
				throw new RuntimeException("gnpov1");
			} else {
				a.int_j = 0;
				var2 = 0;
				if (var10 == 0 && var1 <= var2) {
					if (var0 != 16636) {
						G = 111;
					}
				} else {
					do {
						label93:
						{
							int var3 = a.ints_h[var2];
							p var4 = th.ps_g[var3];
							int var5 = ka.I.f((byte) 79, 1);
							if (var5 == 0) {
								a.ints_h[a.int_j++] = var3;
								var4.int_rc = pd.int_i;
								if (var10 == 0) {
									break label93;
								}
							}

							int var6 = ka.I.f((byte) 102, 2);
							if (var6 == 0) {
								a.ints_h[a.int_j++] = var3;
								var4.int_rc = pd.int_i;
								kh.T[kd.S++] = var3;
								if (var10 == 0) {
									break label93;
								}
							}

							int var7;
							int var8;
							if (var6 == 1) {
								a.ints_h[a.int_j++] = var3;
								var4.int_rc = pd.int_i;
								var7 = ka.I.f((byte) 82, 3);
								var4.a(false, var7, 109);
								var8 = ka.I.f((byte) 81, 1);
								if (~var8 != -2) {
									break label93;
								}

								kh.T[kd.S++] = var3;
								if (var10 == 0) {
									break label93;
								}
							}

							if (~var6 == -3) {
								a.ints_h[a.int_j++] = var3;
								var4.int_rc = pd.int_i;
								var7 = ka.I.f((byte) 111, 3);
								var4.a(true, var7, 105);
								var8 = ka.I.f((byte) 109, 3);
								var4.a(true, var8, 88);
								int var9 = ka.I.f((byte) 62, 1);
								if (var9 != 1) {
									break label93;
								}

								kh.T[kd.S++] = var3;
								if (var10 == 0) {
									break label93;
								}
							}

							if (var6 == 3) {
								ne.ints_m[u.int_bd++] = var3;
							}
						}

						++var2;
					} while (var1 > var2);

					if (var0 != 16636) {
						G = 111;
					}
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "rd.H(" + var0 + ')');
		}
	}

	private final void a(int var1, int var2, ja var3) {
		try {
			if (var1 != 9310) {
				a(false, 65, 116);
			}

			++H;
			if (~var2 == -2) {
				this.N = var3.b(true);
				this.S = var3.j((byte) 117);
				this.U = var3.j((byte) 105);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rd.G(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static void a() {
		for (int var0 = 0; var0 < ug.int_bb; ++var0) {
			ed var1 = n.eds_m[var0];
			ra.a(var1);
			n.eds_m[var0] = null;
		}

		ug.int_bb = 0;
	}

	static int a(boolean var0, int var1, int sampleRate) {
		try {
			if (!var0) {
				P = -39;
			}

			++L;
			int var3;
			if (sampleRate > var1) {
				var3 = var1;
				var1 = sampleRate;
				sampleRate = var3;
			}

			while (sampleRate != 0) {
				var3 = var1 % sampleRate;
				var1 = sampleRate;
				sampleRate = var3;
			}

			return var1;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rd.E(" + var0 + ',' + var1 + ',' + sampleRate + ')');
		}
	}

	static int a(int var0, byte var1, int var2, int var3) {
		try {
			if (var1 != -99) {
				P = -11;
			}

			++O;
			return (jc.bytes_q[var2][var3][var0] & 8) != 0 ? 0 : (~var2 < -1 && (2 & jc.bytes_q[1][var3][var0]) != 0 ? -1 + var2 : var2);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "rd.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
