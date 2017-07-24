final class ab extends hb {

	int int_n;
	static int int_o;
	int int_p;
	static int int_q;
	int int_r;
	static lf duelStakeAttribute = dd.a(":duelstake:", 2);//lf_s
	ed[] eds_t = new ed[5];
	boolean boolean_u;
	int int_v;
	int int_w;
	int x = 0;
	int y;
	int z;
	ab A;
	boolean B;
	int C;
	ei D;
	int[] E = new int[5];
	int F;
	static lf G = dd.a(": ", 2);
	ba H;
	static int I;
	boolean J;
	la K;
	nf L;
	eb M;
	static int N;
	dg O;
	int P;

	ab(int var1, int var2, int var3) {
		try {
			this.int_w = var2;
			this.F = this.int_v = var1;
			this.int_n = var3;
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ab.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	static void a(int var0) {
		try {
			v.rc_qb.c(-51);
			++N;
			int var1 = 81 % ((53 - var0) / 60);
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ab.D(" + var0 + ')');
		}
	}

	static int a(int var0, int var1) {
		try {
			++int_o;
			var1 = (var1 & 1431655765) + (1431655765 & var1 >>> 1);
			var1 = (var1 >>> 2 & -1288490189) + (858993459 & var1);
			var1 = (var1 >>> 4) + var1 & 252645135;
			if (var0 != 1834) {
				G = null;
			}

			var1 += var1 >>> 8;
			var1 += var1 >>> 16;
			return var1 & 255;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "ab.E(" + var0 + ',' + var1 + ')');
		}
	}

	static void c(byte var0) {
		int dummy = client.int_gc;

		try {
			++I;
			int var1 = 96 / ((49 - var0) / 62);
			ic var2 = (ic) ef.tf_i.c(72);
			if (dummy != 0 || var2 != null) {
				do {
					if (var2 != null) {
						if (var2.x != -1) {
							var2.a(true);
						} else {
							var2.D = 0;
							sb.a(0, var2);
						}
					}

					var2 = (ic) ef.tf_i.d(-1);
				} while (var2 != null);

			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ab.C(" + var0 + ')');
		}
	}

	static void a(uc class_uc, byte var1) {
		try {
			class_uc.Jb = class_uc.int_ab;
			++int_q;
			if (class_uc.int_tb == 0) {
				class_uc.int_gb = 0;
			} else {
				if (class_uc.int_bc != -1 && class_uc.Ab == 0) {
					bi var2 = client.a(var1 + 37, class_uc.int_bc);
					if (~class_uc.int_qb < -1 && var2.V == 0) {
						++class_uc.int_gb;
						return;
					}

					if (~class_uc.int_qb >= -1 && ~var2.int_sb == -1) {
						++class_uc.int_gb;
						return;
					}
				}

				int var12 = class_uc.int_fb;
				int var3 = class_uc.int_nc;
				int var4 = 128 * class_uc.ints_db[-1 + class_uc.int_tb] + class_uc.int_qc * 64;
				int var5 = class_uc.xb[-1 + class_uc.int_tb] * 128 + 64 * class_uc.int_qc;
				if (-var12 + var4 <= 256 && var4 + -var12 >= -256 && var5 + -var3 <= 256 && -var3 + var5 >= -256) {
					int var7 = class_uc.int_pb;
					if (var12 < var4) {
						if (var5 <= var3) {
							if (var5 >= var3) {
								class_uc.int_ec = 1536;
							} else {
								class_uc.int_ec = 1792;
							}
						} else {
							class_uc.int_ec = 1280;
						}
					} else if (var4 >= var12) {
						if (var3 < var5) {
							class_uc.int_ec = 1024;
						} else if (var3 > var5) {
							class_uc.int_ec = 0;
						}
					} else {
						if (var5 <= var3) {
							if (var3 <= var5) {
								class_uc.int_ec = 512;
							} else {
								class_uc.int_ec = 256;
							}
						} else {
							class_uc.int_ec = 768;
						}
					}

					int var6 = 2047 & -class_uc.int_mb + class_uc.int_ec;
					if (var6 > 1024) {
						var6 -= 2048;
					}

					if (var6 >= -256 && var6 <= 256) {
						var7 = class_uc.int_uc;
					} else if (var6 < 256 || var6 >= 768) {
						if (var6 >= -768 && var6 <= -256) {
							var7 = class_uc.zb;
						}
					} else {
						var7 = class_uc.int_hc;
					}

					if (var1 != -25) {
						a((uc) null, (byte) -9);
					}

					if (var7 == -1) {
						var7 = class_uc.int_uc;
					}

					class_uc.Jb = var7;
					int var8 = 4;
					boolean var9 = true;
					if (class_uc instanceof p) {
						var9 = ((p) class_uc).xc.boolean_gb;
					}

					if (!var9) {
						if (class_uc.int_tb > 1) {
							var8 = 6;
						}

						if (class_uc.int_tb > 2) {
							var8 = 8;
						}

						if (class_uc.int_gb > 0 && class_uc.int_tb > 1) {
							--class_uc.int_gb;
							var8 = 8;
						}
					} else {
						if (class_uc.int_mb != class_uc.int_ec && class_uc.Mb == -1 && class_uc.int_wb != 0) {
							var8 = 2;
						}

						if (class_uc.int_tb > 2) {
							var8 = 6;
						}

						if (class_uc.int_tb > 3) {
							var8 = 8;
						}

						if (class_uc.int_gb > 0 && class_uc.int_tb > 1) {
							--class_uc.int_gb;
							var8 = 8;
						}
					}

					if (class_uc.Xb[-1 + class_uc.int_tb]) {
						var8 <<= 1;
					}

					if (var8 >= 8 && class_uc.Jb == class_uc.int_uc && class_uc.Rb != -1) {
						class_uc.Jb = class_uc.Rb;
					}

					if (var5 <= var3) {
						if (var3 > var5) {
							class_uc.int_nc -= var8;
							if (class_uc.int_nc < var5) {
								class_uc.int_nc = var5;
							}
						}
					} else {
						class_uc.int_nc += var8;
						if (class_uc.int_nc > var5) {
							class_uc.int_nc = var5;
						}
					}

					if (var12 < var4) {
						class_uc.int_fb += var8;
						if (var4 < class_uc.int_fb) {
							class_uc.int_fb = var4;
						}
					} else if (var12 > var4) {
						class_uc.int_fb -= var8;
						if (var4 > class_uc.int_fb) {
							class_uc.int_fb = var4;
						}
					}

					if (var4 == class_uc.int_fb && class_uc.int_nc == var5) {
						--class_uc.int_tb;
						if (class_uc.int_qb > 0) {
							--class_uc.int_qb;
						}
					}
				} else {
					class_uc.int_nc = var5;
					class_uc.int_fb = var4;
				}
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "ab.A(" + "{...}" + ',' + var1 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			if (var0 < 124) {
				duelStakeAttribute = null;
			}

			duelStakeAttribute = null;
			G = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ab.B(" + var0 + ')');
		}
	}
}
