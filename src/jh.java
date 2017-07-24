import java.awt.event.KeyEvent;

final class jh {

	private int[][][] ints_a;
	static int[][] ints_b = new int[104][104];
	static int int_c;
	static hf[] hfs_d = new hf[16];
	private tf tf_e = new tf();
	static int int_f;
	static int[][] ints_g = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
	static kf[] kfs_h;
	private int int_i = 0;
	static int int_j;
	static int int_k = 0;
	static db db_l;
	static int int_m;
	static lf lf_n = dd.a("Fertigkeit)2", 2);
	static int int_o;
	private jg[] jgs_p;
	private int int_q = -1;
	private int int_r;
	static int int_s;
	static int[] ints_t = new int[200];
	static int int_u;
	private int int_v;
	boolean boolean_w = false;

	final int[][] a(byte var1, int var2) {
		try {
			++int_o;
			if (var1 >= -126) {
				return null;
			} else if (~this.int_v == ~this.int_r) {
				this.boolean_w = this.jgs_p[var2] == null;
				this.jgs_p[var2] = ng.I;
				return this.ints_a[var2];
			} else if (this.int_r != 1) {
				jg var3 = this.jgs_p[var2];
				if (this.boolean_w = var3 == null) {
					label37:
					{
						if (~this.int_i <= ~this.int_r) {
							jg var4 = (jg) this.tf_e.a((int) 119);
							var3 = new jg(var2, var4.int_s);
							this.jgs_p[var4.int_n] = null;
							var4.a(true);
							if (client.int_gc == 0) {
								break label37;
							}
						}

						var3 = new jg(var2, this.int_i);
						++this.int_i;
					}

					this.jgs_p[var2] = var3;
				}

				this.tf_e.a(var3, (byte) -69);
				return this.ints_a[var3.int_s];
			} else {
				this.boolean_w = ~var2 != ~this.int_q;
				this.int_q = var2;
				return this.ints_a[0];
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "jh.B(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(boolean var0, byte var1) {
		int var21 = client.int_gc;

		try {
			++int_s;
			int var2 = -25 % ((-20 - var1) / 57);
			ae.V = var0;
			if (!ae.V) {
				int regionY = ka.I.k(1440014816);
				int length = (wb.int_g + -ka.I.P) / 16;
				cc.X = new int[length][4];
				int var5 = 0;
				while (var5 < length) {
					int var6 = 0;
					do {
						cc.X[var5][var6] = ka.I.l(15);
						++var6;
					} while (var6 < 4);

					++var5;
				}

				int regionX = ka.I.k(1440014816);
				int height = ka.I.n(28747);
				int localX = ka.I.b(true);
				int localY = ka.I.k(1440014816);
				System.out.printf("RegionY: %s, RegionX: %s, Height: %s, LocalX: %s, LocalY: %s%n",
						regionY, regionX, height, localX, localY);
				pd.bytes_d = new byte[length][];
				boolean var23 = false;
				eh.ints_s = new int[length];
				l.ints_m = new int[length];
				ig.bytes_g = new byte[length][];
				if ((regionX / 8 == 48 || ~(regionX / 8) == -50) && ~(regionY / 8) == -49) {
					var23 = true;
				}

				if (regionX / 8 == 48 && regionY / 8 == 148) {
					var23 = true;
				}

				hh.ints_fb = new int[length];
				length = 0;
				int xCalc = (regionX + -6) / 8;
				if (var21 == 0 && (regionX + 6) / 8 < xCalc) {
					ge.a((byte) 94, regionY, regionX, localX, localY, height);
				} else {
					do {
						int yCalc = (-6 + regionY) / 8;
						if (var21 == 0 && (regionY + 6) / 8 < yCalc) {
							++xCalc;
						} else {
							do {
								int var13 = yCalc + (xCalc << 467952104);
								if (!var23 || yCalc != 49 && ~yCalc != -150 && yCalc != 147 && ~xCalc != -51 && (~xCalc != -50 || ~yCalc != -48 || var21 != 0)) {
									l.ints_m[length] = var13;
									eh.ints_s[length] = se.cache5.a((byte) 106, de.a(new lf[]{vf.D, fa.a((byte) 85, xCalc), rb.lf_f, fa.a((byte) 85, yCalc)}, -34));
									hh.ints_fb[length] = se.cache5.a((byte) 106, de.a(new lf[]{pg.lf_d, fa.a((byte) 85, xCalc), rb.lf_f, fa.a((byte) 85, yCalc)}, 119));
									++length;
								}

								++yCalc;
							} while ((regionY + 6) / 8 >= yCalc);

							++xCalc;
						}
					} while ((regionX + 6) / 8 <= ~xCalc);

					ge.a((byte) 94, regionY, regionX, localX, localY, height);
				}
			} else {
				int var3 = ka.I.b(true);
				int var4 = ka.I.j((int) 24263);
				int var5 = ka.I.p(255);
				int var6 = ka.I.b(true);
				ka.I.s(11045);
				int var7 = 0;
				int var10;
				if (var21 != 0) {
					int var8 = 0;
					if (var21 == 0 && ~var8 <= -14) {
						++var7;
					} else {
						while (true) {
							int var9 = 0;
							if (var21 == 0 && var9 >= 13) {
								++var8;
							} else {
								while (true) {
									label288:
									{
										var10 = ka.I.f((byte) 72, 1);
										if (~var10 != -2) {
											ai.ints_g[var7][var8][var9] = -1;
											if (var21 == 0) {
												break label288;
											}
										}

										ai.ints_g[var7][var8][var9] = ka.I.f((byte) 123, 26);
									}

									++var9;
									if (var9 >= 13) {
										++var8;
										break;
									}
								}
							}

							if (~var8 <= -14) {
								++var7;
								break;
							}
						}
					}
				}

				while (var7 < 4) {
					int var8 = 0;
					if (var21 == 0 && ~var8 <= -14) {
						++var7;
					} else {
						do {
							int var9 = 0;
							if (var21 == 0 && var9 >= 13) {
								++var8;
							} else {
								do {
									label211:
									{
										var10 = ka.I.f((byte) 72, 1);
										if (~var10 != -2) {
											ai.ints_g[var7][var8][var9] = -1;
											if (var21 == 0) {
												break label211;
											}
										}

										ai.ints_g[var7][var8][var9] = ka.I.f((byte) 123, 26);
									}

									++var9;
								} while (var9 < 13);

								++var8;
							}
						} while (~var8 > -14);

						++var7;
					}
				}

				ka.I.e(true);
				int var8 = (wb.int_g + -ka.I.P) / 16;
				cc.X = new int[var8][4];
				int var9 = 0;
				if (var21 != 0 || var9 < var8) {
					do {
						var10 = 0;
						if (var21 == 0 && var10 >= 4) {
							++var9;
						} else {
							do {
								cc.X[var9][var10] = ka.I.g((byte) -24);
								++var10;
							} while (var10 < 4);

							++var9;
						}
					} while (var9 < var8);
				}

				var10 = ka.I.k(1440014816);
				l.ints_m = new int[var8];
				ig.bytes_g = new byte[var8][];
				pd.bytes_d = new byte[var8][];
				eh.ints_s = new int[var8];
				hh.ints_fb = new int[var8];
				var8 = 0;
				int var11 = 0;
				if (var21 == 0 && var11 >= 4) {
					ge.a((byte) 94, var5, var3, var10, var6, var4);
				} else {
					do {
						int var12 = 0;
						if (var21 == 0 && var12 >= 13) {
							++var11;
						} else {
							do {
								int var13 = 0;
								if (var21 == 0 && var13 >= 13) {
									++var12;
								} else {
									do {
										int var14 = ai.ints_g[var11][var12][var13];
										if (~var14 != 0) {
											int var15 = (16766582 & var14) >> -860316690;
											int var16 = (var14 & 16379) >> 1772148163;
											int var17 = var16 / 8 + (var15 / 8 << -998887416);
											int var18 = 0;
											if (var21 != 0 || var8 > var18) {
												do {
													if (var17 == l.ints_m[var18]) {
														var17 = -1;
														if (var21 == 0) {
															break;
														}
													}

													++var18;
												} while (var8 > var18);
											}

											if (~var17 != 0) {
												int var19 = (var17 & '\uffdf') >> -1140115864;
												l.ints_m[var8] = var17;
												int var20 = 255 & var17;
												eh.ints_s[var8] = se.cache5.a((byte) 106, de.a(new lf[]{vf.D, fa.a((byte) 85, var19), rb.lf_f, fa.a((byte) 85, var20)}, 115));
												hh.ints_fb[var8] = se.cache5.a((byte) 106, de.a(new lf[]{pg.lf_d, fa.a((byte) 85, var19), rb.lf_f, fa.a((byte) 85, var20)}, 123));
												++var8;
											}
										}

										++var13;
									} while (var13 < 13);

									++var12;
								}
							} while (var12 < 13);

							++var11;
						}
					} while (var11 < 4);

					ge.a((byte) 94, var5, var3, var10, var6, var4);
				}
			}
		} catch (RuntimeException var22) {
			throw ec.a(var22, "jh.F(" + var0 + ',' + var1 + ')');
		}
	}

	public static void a(int var0) {
		try {
			ints_t = null;
			db_l = null;
			hfs_d = null;
			kfs_h = null;
			lf_n = null;
			if (var0 != 4) {
				ints_g = null;
			}

			ints_b = null;
			ints_g = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jh.C(" + var0 + ')');
		}
	}

	static final int a(byte var0, KeyEvent var1) {
		try {
			++int_j;
			if (var0 != 117) {
				ints_b = null;
			}

			int var2 = var1.getKeyChar();
			if (~var2 == -8365) {
				return 128;
			} else {
				if (~var2 >= -1 || var2 >= 256) {
					var2 = -1;
				}

				return var2;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "jh.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int[][][] a(byte var1) {
		int var4 = client.int_gc;

		try {
			int var2 = 48 / ((39 - var1) / 55);
			++int_u;
			if (this.int_v != this.int_r) {
				throw new RuntimeException("Can only retrieve a full image cache");
			} else {
				int var3 = 0;
				if (var4 != 0) {
					this.jgs_p[var3] = ng.I;
					++var3;
				}

				while (var3 < this.int_r) {
					this.jgs_p[var3] = ng.I;
					++var3;
				}

				return this.ints_a;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "jh.D(" + var1 + ')');
		}
	}

	final void a(boolean var1) {
		int var3 = client.int_gc;

		try {
			if (!var1) {
				int var2 = 0;
				if (var3 == 0 && this.int_r <= var2) {
					this.jgs_p = null;
					++int_c;
					this.ints_a = null;
					this.tf_e.e(-15004);
					this.tf_e = null;
				} else {
					do {
						this.ints_a[var2][0] = null;
						this.ints_a[var2][1] = null;
						this.ints_a[var2][2] = null;
						this.ints_a[var2] = null;
						++var2;
					} while (this.int_r > var2);

					this.jgs_p = null;
					++int_c;
					this.ints_a = null;
					this.tf_e.e(-15004);
					this.tf_e = null;
				}
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "jh.G(" + var1 + ')');
		}
	}

	static final int a(int var0, int var1, int var2) {
		int var7 = client.int_gc;

		try {
			int var3 = -49 / ((var2 - -65) / 48);
			++int_m;
			lc var4 = (lc) hg.eh_l.a((long) var0, (byte) -123);
			if (var4 == null) {
				return 0;
			} else if (var1 == -1) {
				return 0;
			} else {
				int var5 = 0;
				int var6 = 0;
				if (var7 == 0 && var4.ints_n.length <= var6) {
					return var5;
				} else {
					do {
						if (~var4.ints_u[var6] == ~var1) {
							var5 += var4.ints_n[var6];
						}

						++var6;
					} while (var4.ints_n.length > var6);

					return var5;
				}
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "jh.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	jh(int var1, int var2, int var3) {
		try {
			this.int_v = var2;
			this.ints_a = new int[var1][3][var3];
			this.int_r = var1;
			this.jgs_p = new jg[var2];
		} catch (RuntimeException var5) {
			throw ec.a(var5, "jh.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
