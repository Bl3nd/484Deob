import java.util.zip.CRC32;

class qa extends j {

	static int Q;
	private int R = -1;
	static int S;
	static int T;
	static lf U = dd.a("null", 2);
	static int[] V = new int[50];
	int[] W;
	static int[] X = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	static int Y;
	int Z;
	static CRC32 crc32_ab = new CRC32();
	static int int_bb;
	static eh eh_cb = new eh(4096);
	int int_db;
	static int int_eb = 0;

	final boolean d(byte var1) {
		try {
			++Q;
			if (this.W != null) {
				return true;
			} else if (~this.R <= -1) {
				kf var2 = re.a(sb.bg_b, 0, this.R);
				var2.f();
				this.int_db = var2.P;
				this.W = var2.O;
				this.Z = var2.Q;
				return true;
			} else {
				return var1 <= 104 ? false : false;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "qa.B(" + var1 + ')');
		}
	}

	static final void a(boolean var0, int var1, int var2, int var3, int var4) {
		int dummy = client.int_gc;

		try {
			jf class_jf = (jf) q.tf_cb.c(107);
			if (class_jf == null) {
				++T;
				if (!var0) {
					e(4);
				}
			} else {
				do {
					if (class_jf.int_q != -1 || class_jf.G != null) {
						label125:
						{
							int var6 = 0;
							if (class_jf.D < var4) {
								var6 += var4 - class_jf.D;
							} else if (class_jf.z > var4) {
								var6 += -var4 + class_jf.z;
							}

							if (var3 <= class_jf.H) {
								if (class_jf.int_o > var3) {
									var6 += -var3 + class_jf.int_o;
								}
							} else {
								var6 += var3 + -class_jf.H;
							}

							if (var6 + -64 > class_jf.I || sd.Db == 0 || var1 != class_jf.L) {
								if (class_jf.jb_r != null) {
									pe.t_b.b(class_jf.jb_r);
									class_jf.jb_r = null;
								}

								if (class_jf.jb_p != null) {
									pe.t_b.b(class_jf.jb_p);
									class_jf.jb_p = null;
								}
							} else {
								var6 -= 64;
								if (var6 < 0) {
									var6 = 0;
								}

								int var7;
								label69:
								{
									var7 = sd.Db * (-var6 + class_jf.I) / class_jf.I;
									if (class_jf.jb_r != null) {
										class_jf.jb_r.e(var7);
										if (dummy == 0) {
											break label69;
										}
									}

									if (class_jf.int_q >= 0) {
										mh var8 = mh.a(of.cache4, class_jf.int_q, 0);
										if (var8 != null) {
											k var9 = var8.c().a(af.pa_w);
											jb var10 = jb.a((k) var9, 100, var7);
											var10.b(-1);
											pe.t_b.a((kc) var10);
											class_jf.jb_r = var10;
										}
									}
								}

								if (class_jf.jb_p == null) {
									if (class_jf.G == null || ~(class_jf.y -= var2) < -1) {
										break label125;
									}

									int var14 = (int) (Math.random() * (double) class_jf.G.length);
									mh var15 = mh.a(of.cache4, class_jf.G[var14], 0);
									if (var15 == null) {
										break label125;
									}

									k var16 = var15.c().a(af.pa_w);
									jb var11 = jb.a((k) var16, 100, var7);
									var11.b(0);
									pe.t_b.a((kc) var11);
									class_jf.y = (int) ((double) (class_jf.K - class_jf.F) * Math.random()) + class_jf.F;
									class_jf.jb_p = var11;
									if (dummy == 0) {
										break label125;
									}
								}

								class_jf.jb_p.e(var7);
								if (!class_jf.jb_p.b((byte) -8)) {
									class_jf.jb_p = null;
								}
							}
						}
					}

					class_jf = (jf) q.tf_cb.d(-1);
				} while (class_jf != null);

				++T;
				if (!var0) {
					e(4);
				}
			}
		} catch (RuntimeException var13) {
			throw ec.a(var13, "qa.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			++S;
			if (var2 == 0) {
				this.R = var3.b(true);
			}

			if (var1 > -120) {
				crc32_ab = null;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "qa.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	int[][] b(int var1, int var2) {
		int var11 = client.int_gc;

		try {
			++int_bb;
			if (var2 != 2177) {
				this.W = null;
			}

			int[][] var3 = super.jh_q.a((byte) -127, var1);
			if (super.jh_q.boolean_w && this.d((byte) 124)) {
				int[] var4 = var3[0];
				int[] var5 = var3[1];
				int var7 = (~dg.int_p == ~this.int_db ? var1 : var1 * this.int_db / dg.int_p) * this.Z;
				int[] var6 = var3[2];
				int var8;
				int var9;
				if (~this.Z != ~ff.int_a) {
					var8 = 0;
					if (var11 != 0 || ~var8 > ~ff.int_a) {
						do {
							var9 = var8 * this.Z / ff.int_a;
							int var10 = this.W[var7 - -var9];
							var6[var8] = sd.a(4080, var10 << 371615268);
							var5[var8] = sd.a(var10 >> 135294916, 4080);
							var4[var8] = sd.a(16711680, var10) >> -130354868;
							++var8;
						} while (~var8 > ~ff.int_a);
					}

					if (var11 == 0) {
						return var3;
					}
				}

				var8 = 0;
				if (var11 != 0 || ~ff.int_a < ~var8) {
					do {
						var9 = this.W[var7++];
						var6[var8] = sd.a(255, var9) << -2047312828;
						var5[var8] = sd.a(4080, var9 >> -1261935708);
						var4[var8] = sd.a(4080, var9 >> -895426580);
						++var8;
					} while (~ff.int_a < ~var8);
				}
			}

			return var3;
		} catch (RuntimeException var12) {
			throw ec.a(var12, "qa.E(" + var1 + ',' + var2 + ')');
		}
	}

	public qa() {
		super(0, false);
	}

	final int d(int var1) {
		try {
			++Y;
			if (var1 != -1) {
				this.b(-1, -23);
			}

			return this.R;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "qa.CA(" + var1 + ')');
		}
	}

	public static void e(int var0) {
		try {
			crc32_ab = null;
			X = null;
			U = null;
			V = null;
			int var1 = -106 / ((-9 - var0) / 35);
			eh_cb = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "qa.C(" + var0 + ')');
		}
	}
}
