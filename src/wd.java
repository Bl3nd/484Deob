import java.util.Random;

final class wd extends j {

	private int Q = 81;
	static int R;
	private int S;
	static int T;
	private int[][] U;
	private int V = 1024;
	static int W;
	static int X;
	private int[][] Y;
	private int Z = 204;
	static int int_ab;
	private int int_bb = 4;
	private int int_cb = 0;
	private int int_db = 409;
	static int int_eb = 0;
	private int int_fb;
	private int int_gb = 1024;
	static int int_hb;
	private int int_ib;
	static tf tf_jb = new tf();
	static lf[] lfs_kb = new lf[8];
	static int int_lb;
	static int[][][] ints_mb;
	private int[] ints_nb;
	static int int_ob = 0;
	private int int_pb = 8;

	static final lf c(int var0, int var1) {
		int var4 = client.int_gc;

		try {
			if (var0 <= 18) {
				return null;
			} else {
				++X;
				lf var2 = fa.a((byte) 85, var1);
				int var3 = var2.e(-30593) - 3;
				if (var4 != 0) {
					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 44), jc.A, var2.c(-41, var3)}, 117);
					var3 -= 3;
				}

				while (var3 > 0) {
					var2 = de.a(new lf[]{var2.a(var3, (int) 0, 44), jc.A, var2.c(-41, var3)}, 117);
					var3 -= 3;
				}

				if (~var2.e(-30593) < -10) {
					return de.a(new lf[]{h.lf_k, var2.a(var2.e(-30593) - 8, (int) 0, 92), bc.lf_t, ch.lf_k, var2, bi.Z}, 126);
				} else if (var2.e(-30593) > 6) {
					return de.a(new lf[]{sc.P, var2.a(-4 + var2.e(-30593), (int) 0, 44), fb.lf_f, ch.lf_k, var2, bi.Z}, 119);
				} else {
					return de.a(new lf[]{ec.R, var2, hc.lf_mb}, 120);
				}
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "wd.B(" + var0 + ',' + var1 + ')');
		}
	}

	static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, ka var6, int var7, long var8) {
		if (var6 == null) {
			return true;
		} else {
			int var10 = var1 * 128 + 64 * var4;
			int var11 = var2 * 128 + 64 * var5;
			return nb.a(var0, var1, var2, var4, var5, var10, var11, var3, var6, var7, false, var8);
		}
	}

	static final lf a(byte[] var0, int var1, int var2, boolean var3) {
		int var6 = client.int_gc;

		try {
			++int_hb;
			lf var4 = new lf();
			var4.Y = new byte[var1];
			var4.S = 0;
			if (var3) {
				int_eb = 38;
			}

			int var5 = var2;
			if (var6 == 0 && var2 + var1 <= var2) {
				return var4;
			} else {
				do {
					if (~var0[var5] != -1) {
						var4.Y[var4.S++] = var0[var5];
					}

					++var5;
				} while (var2 + var1 > var5);

				return var4;
			}
		} catch (RuntimeException var7) {
			throw ec.a(var7, "wd.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	private final void d(byte var1) {
		int var9 = client.int_gc;

		try {
			++T;
			Random var2 = new Random((long) this.int_pb);
			this.int_fb = this.Q / 2;
			this.S = 4096 / this.int_bb;
			int var3 = this.S / 2;
			this.U = new int[this.int_pb][this.int_bb];
			this.Y = new int[this.int_pb][this.int_bb + 1];
			this.ints_nb = new int[1 + this.int_pb];
			this.int_ib = 4096 / this.int_pb;
			int var4 = this.int_ib / 2;
			if (var1 != -49) {
				this.int_pb = -111;
			}

			this.ints_nb[0] = 0;
			int var5 = 0;
			if (var9 == 0 && ~this.int_pb >= ~var5) {
				this.ints_nb[this.int_pb] = 4096;
			} else {
				do {
					int var6;
					int var7;
					if (~var5 < -1) {
						var6 = this.int_ib;
						var7 = (nb.a(4096, var2, true) - 2048) * this.Z >> 1397492396;
						var6 += var7 * var4 >> -537741812;
						this.ints_nb[var5] = var6 + this.ints_nb[-1 + var5];
					}

					this.Y[var5][0] = 0;
					var6 = 0;
					if (var9 == 0 && this.int_bb <= var6) {
						this.Y[var5][this.int_bb] = 4096;
						++var5;
					} else {
						do {
							if (~var6 < -1) {
								var7 = this.S;
								int var8 = (-2048 + nb.a(4096, var2, true)) * this.int_db >> 1096928012;
								var7 += var8 * var3 >> -1910423060;
								this.Y[var5][var6] = this.Y[var5][-1 + var6] - -var7;
							}

							this.U[var5][var6] = this.int_gb <= 0 ? 4096 : 4096 - nb.a(this.int_gb, var2, true);
							++var6;
						} while (this.int_bb > var6);

						this.Y[var5][this.int_bb] = 4096;
						++var5;
					}
				} while (~this.int_pb < ~var5);

				this.ints_nb[this.int_pb] = 4096;
			}
		} catch (RuntimeException var10) {
			throw ec.a(var10, "wd.A(" + var1 + ')');
		}
	}

	public static void e(int var0) {
		try {
			ints_mb = null;
			tf_jb = null;
			lfs_kb = null;
			if (var0 >= -23) {
				tf_jb = null;
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "wd.D(" + var0 + ')');
		}
	}

	final void c(int var1) {
		try {
			this.d((byte) -49);
			++R;
			if (var1 != 25614) {
				a((byte[]) null, 86, -85, true);
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "wd.M(" + var1 + ')');
		}
	}

	public wd() {
		super(0, true);
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			if (var1 > -120) {
				this.V = -17;
			}

			label75:
			{
				label74:
				{
					label73:
					{
						label72:
						{
							label71:
							{
								label70:
								{
									label69:
									{
										label68:
										{
											if (var2 != 0) {
												if (~var2 == -2) {
													break label68;
												}

												if (var2 == 2) {
													break label69;
												}

												if (var2 == 3) {
													break label70;
												}

												if (~var2 == -5) {
													break label71;
												}

												if (var2 == 5) {
													break label72;
												}

												if (var2 == 6) {
													break label73;
												}

												if (var2 != 7) {
													break label75;
												}

												if (var5 == 0) {
													break label74;
												}
											}

											this.int_bb = var3.j((byte) 77);
											if (var5 == 0) {
												break label75;
											}
										}

										this.int_pb = var3.j((byte) 85);
										if (var5 == 0) {
											break label75;
										}
									}

									this.int_db = var3.b(true);
									if (var5 == 0) {
										break label75;
									}
								}

								this.Z = var3.b(true);
								if (var5 == 0) {
									break label75;
								}
							}

							this.V = var3.b(true);
							if (var5 == 0) {
								break label75;
							}
						}

						this.int_cb = var3.b(true);
						if (var5 == 0) {
							break label75;
						}
					}

					this.Q = var3.b(true);
					if (var5 == 0) {
						break label75;
					}
				}

				this.int_gb = var3.b(true);
			}

			++int_ab;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "wd.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var14 = client.int_gc;

		try {
			if (var1 > -49) {
				this.c(-46);
			}

			++W;
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int var4 = 0;
				int var5 = this.int_cb + fc.G[var2];
				if (var14 != 0) {
					var5 += 4096;
				}

				while (var5 < 0) {
					var5 += 4096;
				}

				if (var14 != 0) {
					var5 -= 4096;
				}

				while (~var5 < -4097) {
					var5 -= 4096;
				}

				label113:
				{
					if (var14 != 0) {
						if (var5 < this.ints_nb[var4]) {
							break label113;
						}

						++var4;
					}

					while (~this.int_pb < ~var4 && var5 >= this.ints_nb[var4]) {
						++var4;
					}
				}

				float var7 = (float) this.ints_nb[var4 - 1];
				float var6 = (float) this.ints_nb[var4];
				if ((float) var5 > (float) this.int_fb + var7 && (float) var5 < var6 - (float) this.int_fb) {
					int var8 = 0;
					if (var14 != 0 || ff.int_a > var8) {
						do {
							int var9 = 0;
							int var10 = ~(var4 % 2) == -1 ? this.V : -this.V;
							int var11 = (this.S * var10 >> -2142284820) + ef.ints_m[var8];
							if (var14 != 0) {
								var11 += 4096;
							}

							while (~var11 > -1) {
								var11 += 4096;
							}

							if (var14 != 0) {
								var11 -= 4096;
							}

							while (var11 > 4096) {
								var11 -= 4096;
							}

							if (var14 != 0 || var9 < this.int_bb) {
								while (~this.Y[var4 - 1][var9] >= ~var11) {
									++var9;
									if (var9 >= this.int_bb) {
										break;
									}
								}
							}

							label53:
							{
								float var12 = (float) this.Y[var4 - 1][var9 + -1];
								float var13 = (float) this.Y[-1 + var4][var9];
								if (var12 + (float) this.int_fb < (float) var11 && (float) var11 < (float) (-this.int_fb) + var13) {
									var3[var8] = this.U[var4 - 1][var9 + -1];
									if (var14 == 0) {
										break label53;
									}
								}

								var3[var8] = 0;
							}

							++var8;
						} while (ff.int_a > var8);
					}

					if (var14 == 0) {
						return var3;
					}
				}

				na.a(var3, 0, ff.int_a, 0);
			}

			return var3;
		} catch (RuntimeException var15) {
			throw ec.a(var15, "wd.G(" + var1 + ',' + var2 + ')');
		}
	}
}
