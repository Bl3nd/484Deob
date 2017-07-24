import java.awt.event.ActionEvent;
import java.util.Random;

final class q extends j {

	private int[] Q = new int[512];
	private int R = 0;
	static int T;
	static int U;
	private int W = 4;
	static int X;
	static int Y;
	static int Z;
	private int int_ab = 1638;
	private int[] ints_bb;
	static tf tf_cb = new tf();
	static int int_db;
	private int int_eb = 4;
	private boolean boolean_fb = true;
	private int int_gb = 4;
	static int int_hb = 2;
	static lf lf_ib = dd.a("Spieler kann nicht gefunden werden: ", 2);
	static int int_jb;
	static int int_kb;
	static int int_lb;
	static int int_mb;
	private int[] ints_nb;
	static int int_ob;
	static lf lf_pb = dd.a("sich mit einer anderen Welt zu verbinden)3", 2);

	public q() {
		super(0, true);
	}

	final int[] a(int var1, int var2) {
		int var14 = client.int_gc;

		try {
			int[] var3 = super.H.a(-314, var2);
			++T;
			if (super.H.boolean_v) {
				int var4 = this.int_eb << 748716940;
				int var5 = this.int_gb << 1046865868;
				int var6 = this.int_gb * fc.G[var2];
				int var7 = 0;
				if (var14 != 0 || ~var7 > ~ff.int_a) {
					do {
						int var8 = 0;
						int var9 = this.int_eb * ef.ints_m[var7];
						int var10 = 0;
						if (var14 == 0 && ~this.W >= ~var10) {
							if (this.boolean_fb) {
								var8 = 2048 - -(var8 >> 741857);
							}

							var3[var7] = var8;
							++var7;
						} else {
							do {
								int var11 = this.ints_nb[var10];
								int var12 = this.ints_bb[var10];
								int var13 = this.a(-28254, var11 * var4 >> 72193708, var6 * var11 >> 2137274956, var9 * var11 >> 244104652, var11 * var5 >> 1165641196);
								var8 += var13 * var12 >> 1446737196;
								++var10;
							} while (~this.W < ~var10);

							if (this.boolean_fb) {
								var8 = 2048 - -(var8 >> 741857);
							}

							var3[var7] = var8;
							++var7;
						}
					} while (~var7 > ~ff.int_a);
				}
			}

			return var1 > -49 ? null : var3;
		} catch (RuntimeException var15) {
			throw ec.a(var15, "q.G(" + var1 + ',' + var2 + ')');
		}
	}

	static void a(int var0, boolean var1, int var2, int var3, vg var4, int var5, int var6, int var7) {
		int var11 = client.int_gc;

		try {
			label84:
			{
				++U;
				if (va.Y) {
					w.int_m = 32;
					if (var11 == 0) {
						break label84;
					}
				}

				w.int_m = 0;
			}

			va.Y = false;
			if (var1) {
				int var8;
				if (~wd.int_eb != -1) {
					label95:
					{
						if (~var5 < ~var2 || var5 + 16 <= var2 || ~var6 < ~var7 || ~var7 <= ~(var6 - -16)) {
							if (~var2 <= ~var5 && ~(16 + var5) < ~var2 && ~var7 <= ~(var6 - -var3 - 16) && var7 < var3 + var6) {
								var4.Ac += 4;
								mc.a(var4, -23101);
								if (var11 == 0) {
									break label95;
								}
							}

							if (~(-w.int_m + var5) < ~var2 || var2 >= w.int_m + 16 + var5 || var6 + 16 > var7 || -16 + var3 + var6 <= var7) {
								break label95;
							}

							var8 = (var3 - 32) * var3 / var0;
							if (var8 < 8) {
								var8 = 8;
							}

							int var9 = -(var8 / 2) + var7 + -var6 + -16;
							int var10 = var3 + (-32 - var8);
							var4.Ac = var9 * (-var3 + var0) / var10;
							mc.a(var4, -23101);
							va.Y = true;
							if (var11 == 0) {
								break label95;
							}
						}

						var4.Ac -= 4;
						mc.a(var4, -23101);
					}
				}

				if (~ee.Y != -1) {
					var8 = var4.int_ob;
					if (var5 + -var8 <= var2 && var7 >= var6 && var2 < 16 + var5 && ~(var6 + var3) <= ~var7) {
						var4.Ac += 45 * ee.Y;
						mc.a(var4, -23101);
						return;
					}
				}

			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "q.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}

	static int e(int var0) {
		try {
			++Z;
			int var1 = 24 / ((var0 - -4) / 34);
			return 6;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "q.H(" + var0 + ')');
		}
	}

	public static void f(int var0) {
		try {
			tf_cb = null;
			lf_ib = null;
			lf_pb = null;
			if (var0 != -16) {
				int_hb = -46;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "q.L(" + var0 + ')');
		}
	}

	final void c(int var1) {
		try {
			this.g(var1 + -25733);
			++int_db;
			if (var1 == 25614) {
				this.i(var1 + -25612);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "q.M(" + var1 + ')');
		}
	}

	static boolean c(int var0, int var1, int var2) {
		try {
			++int_lb;
			return var2 != 255 ? true : ~(var0 >> 1 + var1 & 1) != -1;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "q.B(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	private final int a(int var1, int var2, int var3, int var4, int var5) {
		try {
			++int_ob;
			int var8 = var4 & -4096;
			var4 -= var8;
			int var9 = -4096 & var3;
			var3 -= var9;
			int var11 = -4096 & var5;
			int var10 = var2 & -4096;
			var9 >>= 12;
			int var7 = 1 + var9;
			var9 &= 255;
			var8 >>= 12;
			int var6 = var8 - -1;
			if (~var6 <= ~(var10 >> -358922548)) {
				var6 = 0;
			}

			var8 &= 255;
			var6 &= 255;
			if (~(var11 >> 569830252) >= ~var7) {
				var7 = 0;
			}

			int var14 = this.Q[var6 + this.Q[var9]] % 4;
			int var12 = this.Q[var8 - -this.Q[var9]] % 4;
			var7 &= 255;
			int var15 = this.Q[var6 - -this.Q[var7]] % 4;
			int var13 = this.Q[this.Q[var7] + var8] % 4;
			if (var1 != -28254) {
				int_hb = -16;
			}

			int var16 = jc.a(var4, var3, uh.C[var12], 4003);
			int var17 = jc.a(var4 - 4096, var3, uh.C[var14], 4003);
			int var18 = jc.a(var4, var3 + -4096, uh.C[var13], 4003);
			int var19 = jc.a(var4 - 4096, var3 + -4096, uh.C[var15], 4003);
			int var20 = ig.a(var1 ^ 21597, var4);
			int var21 = ig.a(var1 + 13405, var3);
			int var22 = jc.a(var16, 667494220, var20, var17);
			int var23 = jc.a(var18, 667494220, var20, var19);
			return jc.a(var22, 667494220, var21, var23);
		} catch (RuntimeException var24) {
			throw ec.a(var24, "q.C(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
		}
	}

	private final void g(int var1) {
		int var6 = client.int_gc;

		try {
			++int_jb;
			Random var2 = new Random((long) this.R);
			if (var1 >= -61) {
				a(20, true, -94, 63, (vg) null, 74, -28, 99);
			}

			int var3 = 0;
			if (var6 != 0 || ~var3 > -256) {
				do {
					this.Q[var3] = -1;
					++var3;
				} while (~var3 > -256);
			}

			int var4 = 0;
			if (var6 != 0 || var4 < 255) {
				do {
					int var5;
					do {
						var5 = nb.a(255, var2, true);
					} while (this.Q[var5] != -1);

					this.Q[var5 + 255] = this.Q[var5] = var4;
					++var4;
				} while (var4 < 255);

			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "q.J(" + var1 + ')');
		}
	}

	static void h(int var0) {
		v.int_rb = var0;

		for (int var1 = 0; var1 < l.int_l; ++var1) {
			for (int var2 = 0; var2 < ge.int_c; ++var2) {
				if (i.Ib[var0][var1][var2] == null) {
					i.Ib[var0][var1][var2] = new ab(var0, var1, var2);
				}
			}
		}

	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			if (var1 <= -120) {
				label88:
				{
					label87:
					{
						label86:
						{
							label85:
							{
								label94:
								{
									label83:
									{
										label95:
										{
											if (~var2 != -1) {
												if (var2 == 1) {
													break label95;
												}

												if (~var2 == -3) {
													break label83;
												}

												if (~var2 == -4) {
													break label94;
												}

												if (~var2 == -5) {
													break label85;
												}

												if (~var2 == -6) {
													break label86;
												}

												if (var2 != 6) {
													break label88;
												}

												if (var5 == 0) {
													break label87;
												}
											}

											this.boolean_fb = var3.j((byte) 85) == 1;
											if (var5 == 0) {
												break label88;
											}
										}

										this.W = var3.j((byte) 115);
										if (var5 == 0) {
											break label88;
										}
									}

									this.int_ab = var3.c(true);
									if (~this.int_ab <= -1) {
										break label88;
									}

									this.ints_bb = new int[this.W];
									int var4 = 0;
									if (var5 != 0) {
										this.ints_bb[var4] = var3.c(true);
										++var4;
									}

									while (~var4 > ~this.W) {
										this.ints_bb[var4] = var3.c(true);
										++var4;
									}

									if (var5 == 0) {
										break label88;
									}
								}

								this.int_eb = this.int_gb = var3.j((byte) 69);
								if (var5 == 0) {
									break label88;
								}
							}

							this.R = var3.j((byte) 105);
							if (var5 == 0) {
								break label88;
							}
						}

						this.int_eb = var3.j((byte) 110);
						if (var5 == 0) {
							break label88;
						}
					}

					this.int_gb = var3.j((byte) 94);
				}

				++X;
			}
		} catch (RuntimeException var6) {
			throw ec.a(var6, "q.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final void i(int var1) {
		int var3 = client.int_gc;

		try {
			if (var1 != 2) {
				this.a(-53, -82, -23, 123, 27);
			}

			++Y;
			int var2;
			if (this.int_ab <= 0) {
				if (this.ints_bb != null && ~this.W == ~this.ints_bb.length) {
					this.ints_nb = new int[this.W];
					var2 = 0;
					if (var3 == 0 && ~this.W >= ~var2) {
						return;
					}

					do {
						this.ints_nb[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
						++var2;
					} while (~this.W < ~var2);

					return;
				}
			} else {
				this.ints_bb = new int[this.W];
				this.ints_nb = new int[this.W];
				var2 = 0;
				if (var3 != 0 || ~var2 > ~this.W) {
					do {
						this.ints_bb[var2] = (int) (Math.pow((double) (this.int_ab / 4096), (double) var2) * 4096.0D);
						this.ints_nb[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
						++var2;
					} while (~var2 > ~this.W);
				}
			}

		} catch (RuntimeException var4) {
			throw ec.a(var4, "q.I(" + var1 + ')');
		}
	}

	static void a(ke var0, int var1, Object var2) {
		try {
			++int_mb;
			if (var0.eventQueue_j != null) {
				int var3 = var1;
				while (~var3 > -51 && var0.eventQueue_j.peekEvent() != null) {
					fc.a(1L, 107);
					++var3;
				}

				if (var2 != null) {
					var0.eventQueue_j.postEvent(new ActionEvent(var2, 1001, "dummy"));
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "q.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
}
