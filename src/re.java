final class re {

	private static lf lf_a = dd.a("Account locked as we suspect it has been stolen)3", 2);
	static lf lf_b = dd.a("Verbindung mit Update)2Server)3)3)3", 2);
	static int int_c = 0;
	static lf lf_d = dd.a("", 2);
	static int int_e;
	static lf lf_f = dd.a("Abbrechen", 2);
	static int int_g;
	static int int_h;
	static int[] ints_i = new int[256];
	private static lf lf_j = dd.a("Login limit exceeded)3", 2);
	static int int_k;
	static int int_l;
	static lf lf_m;
	static lf lf_n;
	static int int_o;

	static int a(boolean var0, boolean var1, boolean var2) {
		try {
			if (var2) {
				lf_d = null;
			}

			++int_e;
			int var3 = 0;
			if (var0) {
				var3 += qb.W - -rf.R;
			}

			if (var1) {
				var3 += ad.int_s + ce.R;
			}

			return var3;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "re.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static db a(byte[] data, int dummy) {
		try {
			++int_h;
			if (data == null) {
				return null;
			} else {
				if (dummy != 0) {
					lf_d = null;
				}

				db class_db = new db(data, rc.ints_a, w.ints_f, c.ints_db, h.ints_n, f.V, ai.bytes_i);
				h.b(-104);
				return class_db;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "re.B(" + (data != null ? "{...}" : "null") + ',' + dummy + ')');
		}
	}

	static kf a(int var0, int var1, byte var2, bg var3) {
		try {
			++int_l;
			if (!wa.a(-21957, var3, var0, var1)) {
				return null;
			} else {
				if (var2 <= 7) {
					a((lf) null, -18);
				}

				return hd.c((byte) 46);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "re.D(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void a(int var0) {
		try {
			lf_m = null;
			lf_a = null;
			lf_b = null;
			if (var0 == 0) {
				ints_i = null;
				lf_d = null;
				lf_j = null;
				lf_n = null;
				lf_f = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "re.E(" + var0 + ')');
		}
	}

	static kf a(bg var0, int var1, int var2) {
		try {
			++int_o;
			return !ed.a(var0, -84, var2) ? null : (var1 != 0 ? null : hd.c((byte) 46));
		} catch (RuntimeException var4) {
			throw ec.a(var4, "re.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	static void a(lf var0, int var1) {
		int var5 = client.int_gc;

		try {
			++int_g;
			if (var1 != 4) {
				a(127, 3, (byte) -83, (bg) null);
			}

			if (mc.x >= 2) {
				if (var0.a((byte) -121, wh.gcCommand)) {
					System.gc();
				}

				if (var0.a((byte) -121, rh.clientdropCommand)) {
					fa.d((byte) -125);
				}

				if (var0.a((byte) -121, se.fpsonCommand)) {
					oa.V = true;
				}

				if (var0.a((byte) -121, hg.fpsoffCommand)) {
					oa.V = false;
				}

				var0.a((byte) -121, ch.lf_b);
				var0.a((byte) -121, vd.autoshadow_offCommand);
				if (var0.a((byte) -121, oh.noclipCommand)) {
					int var2 = 0;
					if (var5 != 0 || var2 < 4) {
						do {
							int var3 = 1;
							if (var5 == 0 && var3 >= 103) {
								++var2;
							} else {
								do {
									int var4 = 1;
									if (var5 == 0 && ~var4 <= -104) {
										++var3;
									} else {
										do {
											sb.lbs_e[var2].ints_g[var3][var4] = 0;
											++var4;
										} while (~var4 > -104);

										++var3;
									}
								} while (var3 < 103);

								++var2;
							}
						} while (var2 < 4);
					}
				}

				if (var0.b((byte) -106, tc.fpsCommand) && ch.int_s != 0) {
					jg.a(var0.c(var1 + -45, 6).b((byte) 121), 0);
				}

				if (var0.a((byte) -121, jg.errortestCommand) && ch.int_s == 2) {
					throw new RuntimeException();
				}

				if (var0.b((byte) -79, gh.rect_debugCommand)) {
					sg.int_a = var0.c(var1 + -45, 12).a((byte) 62).b((byte) -23);
					kd.a((lf) null, false, de.a(new lf[]{og.lf_m, fa.a((byte) 85, sg.int_a)}, 125), 0);
				}

				if (var0.a((byte) -121, r.qa_op_testCommand)) {
					ra.Y = true;
				}
			}

			vg.J.e((byte) 95, 164);
			++qe.int_c;
			vg.J.e(-13488, var0.e(-30593) + -1);
			vg.J.a(var0.c(-41, 2), (byte) -33);
		} catch (RuntimeException var6) {
			throw ec.a(var6, "re.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	static {
		lf_m = lf_j;
		lf_n = lf_a;

		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (int var2 = 0; ~var2 > -9; ++var2) {
				if ((1 & var0) != 1) {
					var0 >>>= 1;
				} else {
					var0 = -306674912 ^ var0 >>> -1763899743;
				}
			}

			ints_i[var1] = var0;
		}

	}
}
