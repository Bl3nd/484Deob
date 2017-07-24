import java.util.Random;

abstract class bf extends b {

	private static int N = 0;
	private int O;
	private static lf P = dd.a("img=", 2);
	private int[] Q;
	private df[] R;
	private static lf S = dd.a(")4trans", 2);
	private static lf T = dd.a(")4u", 2);
	private static lf U = dd.a(")4shad", 2);
	private static int V = 0;
	private static int W = -1;
	private static lf X = dd.a("str", 2);
	private static int Y = -1;
	int Z = 0;
	private int[] ints_ab;
	byte[][] bytes_bb = new byte[256][];
	private static lf lf_cb = dd.a(")4col", 2);
	private int[] ints_db;
	private static lf lf_eb = dd.a("shad", 2);
	private static lf lf_fb = dd.a("u", 2);
	private static int int_gb = -1;
	private static lf lf_hb = dd.a("euro", 2);
	private static lf lf_ib = dd.a("u=", 2);
	private static lf lf_jb = dd.a("shad=", 2);
	private static lf lf_kb = dd.a("lt", 2);
	private static lf lf_lb = dd.a("reg", 2);
	private static lf lf_mb = dd.a("col=", 2);
	private static lf lf_nb = dd.a("gt", 2);
	private static int int_ob = 256;
	private static lf lf_pb = dd.a("trans=", 2);
	private static int int_qb = 0;
	private static lf lf_rb = dd.a("str=", 2);
	private static int int_sb = 0;
	private int[] ints_tb;
	private static int int_ub = -1;
	private static lf lf_vb = dd.a(")4str", 2);
	private static lf lf_wb = dd.a("times", 2);
	private int[] xb;
	private static int yb = 256;
	private static lf zb = dd.a("shy", 2);
	private static lf Ab = dd.a("nbsp", 2);
	private int Bb;
	private static lf Cb = dd.a("br", 2);
	private static lf Db = dd.a("copy", 2);
	private static lf[] Eb = new lf[100];
	private int[] Fb;
	private byte[] Gb;

	private void a(int var1, int var2, int var3) {
		Y = -1;
		W = -1;
		int_ub = var2;
		int_gb = var2;
		int_qb = var1;
		V = var1;
		int_ob = var3;
		yb = var3;
		N = 0;
		int_sb = 0;
	}

	private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * b.J;
		int var9 = b.J - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < b.H) {
			var12 = b.H - var3;
			var5 -= var12;
			var3 = b.H;
			var11 += var12 * var4;
			var8 += var12 * b.J;
		}

		if (var3 + var5 > b.L) {
			var5 -= var3 + var5 - b.L;
		}

		if (var2 < b.I) {
			var12 = b.I - var2;
			var4 -= var12;
			var2 = b.I;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > b.K) {
			var12 = var2 + var4 - b.K;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			a(b.M, this.bytes_bb[var1], var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}

	abstract void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	final void a(lf var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.a(var4, var5);
			this.a(var1, var2, var3);
		}
	}

	private void a(lf var1) {
		try {
			if (var1.b((byte) -109, lf_mb)) {
				V = var1.c(-41, 4).a(16, (byte) 61);
				return;
			}

			if (var1.e(lf_cb, -1)) {
				V = int_qb;
				return;
			}

			if (var1.b((byte) -126, lf_pb)) {
				yb = var1.c(-41, 6).b((byte) -64);
				return;
			}

			if (var1.e(S, -1)) {
				yb = int_ob;
				return;
			}

			if (var1.b((byte) -79, lf_rb)) {
				Y = var1.c(-41, 4).a(16, (byte) 61);
				return;
			}

			if (var1.e(X, -1)) {
				Y = 8388608;
				return;
			}

			if (var1.e(lf_vb, -1)) {
				Y = -1;
				return;
			}

			if (var1.b((byte) -87, lf_ib)) {
				W = var1.c(-41, 2).a(16, (byte) 61);
				return;
			}

			if (var1.e(lf_fb, -1)) {
				W = 0;
				return;
			}

			if (var1.e(T, -1)) {
				W = -1;
				return;
			}

			if (var1.b((byte) -118, lf_jb)) {
				int_gb = var1.c(-41, 5).a(16, (byte) 61);
				return;
			}

			if (var1.e(lf_eb, -1)) {
				int_gb = 0;
				return;
			}

			if (var1.e(U, -1)) {
				int_gb = int_ub;
				return;
			}

			if (var1.e(Cb, -1)) {
				this.a(int_qb, int_ub, int_ob);
				return;
			}
		} catch (Exception var2) {
			;
		}

	}

	private int a(lf var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			this.a(var6, var7, var8);
			if (var11 == 0) {
				var11 = this.Z;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.Bb + this.O + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.a(var1, var12, Eb);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.Bb;
			} else if (var10 == 1) {
				var14 = var3 + this.Bb + (var5 - this.Bb - this.O - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.O - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.Bb - this.O - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + this.Bb + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.a(Eb[var15], var2, var14);
				} else if (var9 == 1) {
					this.a(Eb[var15], var2 + (var4 - this.b(Eb[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.a(Eb[var15], var2 + var4 - this.b(Eb[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.a(Eb[var15], var2, var14);
				} else {
					this.a(Eb[var15], var4);
					this.a(Eb[var15], var2, var14);
					N = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	final int a(lf var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
		if (var1 == null) {
			return 0;
		} else {
			var6.setSeed((long) var7);
			this.a(var4, var5, 192 + (var6.nextInt() & 31));
			int[] var8 = new int[var1.S];
			int var9 = 0;

			for (int var10 = 0; var10 < var1.S; ++var10) {
				var8[var10] = var9;
				if ((var6.nextInt() & 3) == 0) {
					++var9;
				}
			}

			this.a(var1, var2, var3, var8, (int[]) null);
			return var9;
		}
	}

	final int b(lf var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.S; ++var5) {
				int var6 = var1.Y[var5] & 255;
				if (var6 == 60) {
					var2 = var5;
				} else {
					if (var6 == 62 && var2 != -1) {
						lf var7 = var1.a(var5, (int) (var2 + 1), 108);
						var2 = -1;
						if (var7.e(lf_kb, -1)) {
							var6 = 60;
						} else if (var7.e(lf_nb, -1)) {
							var6 = 62;
						} else if (var7.e(Ab, -1)) {
							var6 = 160;
						} else if (var7.e(zb, -1)) {
							var6 = 173;
						} else if (var7.e(lf_wb, -1)) {
							var6 = 215;
						} else if (var7.e(lf_hb, -1)) {
							var6 = 128;
						} else if (var7.e(Db, -1)) {
							var6 = 169;
						} else {
							if (!var7.e(lf_lb, -1)) {
								if (var7.b((byte) -85, P)) {
									try {
										int var8 = var7.c(-41, 4).b((byte) -58);
										var4 += this.R[var8].R;
										var3 = -1;
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
								continue;
							}

							var6 = 174;
						}
					}

					if (var2 == -1) {
						var4 += this.Fb[var6];
						if (this.Gb != null && var3 != -1) {
							var4 += this.Gb[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	private void a(lf var1, int var2, int var3) {
		var3 -= this.Z;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.S; ++var6) {
			int var7 = var1.Y[var6] & 255;
			if (var7 == 60) {
				var4 = var6;
			} else {
				int var9;
				if (var7 == 62 && var4 != -1) {
					lf var8 = var1.a(var6, var4 + 1, 45);
					var4 = -1;
					if (var8.e(lf_kb, -1)) {
						var7 = 60;
					} else if (var8.e(lf_nb, -1)) {
						var7 = 62;
					} else if (var8.e(Ab, -1)) {
						var7 = 160;
					} else if (var8.e(zb, -1)) {
						var7 = 173;
					} else if (var8.e(lf_wb, -1)) {
						var7 = 215;
					} else if (var8.e(lf_hb, -1)) {
						var7 = 128;
					} else if (var8.e(Db, -1)) {
						var7 = 169;
					} else {
						if (!var8.e(lf_lb, -1)) {
							if (var8.b((byte) -122, P)) {
								try {
									var9 = var8.c(-41, 4).b((byte) 122);
									df var14 = this.R[var9];
									int var11 = this.ints_ab != null ? this.ints_ab[var9] : var14.U;
									if (yb == 256) {
										var14.a(var2, var3 + this.Z - var11);
									} else {
										var14.b(var2, var3 + this.Z - var11, yb);
									}

									var2 += var14.R;
									var5 = -1;
								} catch (Exception e) {
									e.printStackTrace();
								}
							} else {
								this.a(var8);
							}
							continue;
						}

						var7 = 174;
					}
				}

				if (var4 == -1) {
					if (this.Gb != null && var5 != -1) {
						var2 += this.Gb[(var5 << 8) + var7];
					}

					int var13 = this.xb[var7];
					var9 = this.Q[var7];
					if (var7 != 32) {
						if (yb == 256) {
							if (int_gb != -1) {
								this.d(var7, var2 + this.ints_db[var7] + 1, var3 + this.ints_tb[var7] + 1, var13, var9, int_gb);
							}

							this.e(var7, var2 + this.ints_db[var7], var3 + this.ints_tb[var7], var13, var9, V);
						} else {
							if (int_gb != -1) {
								this.a(var7, var2 + this.ints_db[var7] + 1, var3 + this.ints_tb[var7] + 1, var13, var9, int_gb, yb);
							}

							this.b(var7, var2 + this.ints_db[var7], var3 + this.ints_tb[var7], var13, var9, V, yb);
						}
					} else if (N > 0) {
						int_sb += N;
						var2 += int_sb >> 8;
						int_sb &= 255;
					}

					int var10 = this.Fb[var7];
					if (Y != -1) {
						b.a(var2, var3 + (int) ((double) this.Z * 0.7D), var10, Y);
					}

					if (W != -1) {
						b.a(var2, var3 + this.Z + 1, var10, W);
					}

					var2 += var10;
					var5 = var7;
				}
			}
		}

	}

	private void a(int var1, int var2) {
		Y = -1;
		W = -1;
		int_ub = var2;
		int_gb = var2;
		int_qb = var1;
		V = var1;
		int_ob = 256;
		yb = 256;
		N = 0;
		int_sb = 0;
	}

	private void a(lf var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.Z;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.S; ++var9) {
			int var10 = var1.Y[var9] & 255;
			if (var10 == 60) {
				var6 = var9;
			} else {
				int var12;
				int var13;
				int var14;
				if (var10 == 62 && var6 != -1) {
					lf var11 = var1.a(var9, (int) (var6 + 1), 66);
					var6 = -1;
					if (var11.e(lf_kb, -1)) {
						var10 = 60;
					} else if (var11.e(lf_nb, -1)) {
						var10 = 62;
					} else if (var11.e(Ab, -1)) {
						var10 = 160;
					} else if (var11.e(zb, -1)) {
						var10 = 173;
					} else if (var11.e(lf_wb, -1)) {
						var10 = 215;
					} else if (var11.e(lf_hb, -1)) {
						var10 = 128;
					} else if (var11.e(Db, -1)) {
						var10 = 169;
					} else {
						if (!var11.e(lf_lb, -1)) {
							if (var11.b((byte) -110, P)) {
								try {
									if (var4 != null) {
										var12 = var4[var8];
									} else {
										var12 = 0;
									}

									if (var5 != null) {
										var13 = var5[var8];
									} else {
										var13 = 0;
									}

									++var8;
									var14 = var11.c(-41, 4).b((byte) 122);
									df var19 = this.R[var14];
									int var16 = this.ints_ab != null ? this.ints_ab[var14] : var19.U;
									if (yb == 256) {
										var19.a(var2 + var12, var3 + this.Z - var16 + var13);
									} else {
										var19.b(var2 + var12, var3 + this.Z - var16 + var13, yb);
									}

									var2 += var19.R;
									var7 = -1;
								} catch (Exception var17) {
									;
								}
							} else {
								this.a(var11);
							}
							continue;
						}

						var10 = 174;
					}
				}

				if (var6 == -1) {
					if (this.Gb != null && var7 != -1) {
						var2 += this.Gb[(var7 << 8) + var10];
					}

					int var18 = this.xb[var10];
					var12 = this.Q[var10];
					if (var4 != null) {
						var13 = var4[var8];
					} else {
						var13 = 0;
					}

					if (var5 != null) {
						var14 = var5[var8];
					} else {
						var14 = 0;
					}

					++var8;
					if (var10 != 32) {
						if (yb == 256) {
							if (int_gb != -1) {
								this.d(var10, var2 + this.ints_db[var10] + 1 + var13, var3 + this.ints_tb[var10] + 1 + var14, var18, var12, int_gb);
							}

							this.e(var10, var2 + this.ints_db[var10] + var13, var3 + this.ints_tb[var10] + var14, var18, var12, V);
						} else {
							if (int_gb != -1) {
								this.a(var10, var2 + this.ints_db[var10] + 1 + var13, var3 + this.ints_tb[var10] + 1 + var14, var18, var12, int_gb, yb);
							}

							this.b(var10, var2 + this.ints_db[var10] + var13, var3 + this.ints_tb[var10] + var14, var18, var12, V, yb);
						}
					} else if (N > 0) {
						int_sb += N;
						var2 += int_sb >> 8;
						int_sb &= 255;
					}

					int var15 = this.Fb[var10];
					if (Y != -1) {
						b.a(var2, var3 + (int) ((double) this.Z * 0.7D), var15, Y);
					}

					if (W != -1) {
						b.a(var2, var3 + this.Z, var15, W);
					}

					var2 += var15;
					var7 = var10;
				}
			}
		}

	}

	static final lf c(lf var0) {
		int var1 = var0.e(-30593);
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			byte var4 = var0.Y[var3];
			if (var4 == 60 || var4 == 62) {
				var2 += 3;
			}
		}

		lf var8 = new lf();
		var8.S = var1 + var2;
		var8.Y = new byte[var8.S];
		int var5 = 0;

		for (int var6 = 0; var6 < var1; ++var6) {
			byte var7 = var0.Y[var6];
			if (var7 == 60) {
				var8.Y[var5++] = 60;
				var8.Y[var5++] = 108;
				var8.Y[var5++] = 116;
				var8.Y[var5++] = 62;
			} else if (var7 == 62) {
				var8.Y[var5++] = 60;
				var8.Y[var5++] = 103;
				var8.Y[var5++] = 116;
				var8.Y[var5++] = 62;
			} else {
				var8.Y[var5++] = var7;
			}
		}

		return var8;
	}

	private void a(lf var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.e(-30593); ++var5) {
			int var6 = var1.a(-100, (int) var5);
			if (var6 == 60) {
				var4 = true;
			} else if (var6 == 62) {
				var4 = false;
			} else if (!var4 && var6 == 32) {
				++var3;
			}
		}

		if (var3 > 0) {
			N = (var2 - this.b(var1) << 8) / var3;
		}

	}

	final void b(lf var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.a(var4, var5);
			this.a(var1, var2 - this.b(var1), var3);
		}
	}

	final void a(lf var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.a(var4, var5);
			int[] var7 = new int[var1.S];
			int[] var8 = new int[var1.S];

			for (int var9 = 0; var9 < var1.S; ++var9) {
				var7[var9] = (int) (Math.sin((double) var9 / 5.0D + (double) var6 / 5.0D) * 5.0D);
				var8[var9] = (int) (Math.sin((double) var9 / 3.0D + (double) var6 / 5.0D) * 5.0D);
			}

			this.a(var1, var2 - this.b(var1) / 2, var3, var7, var8);
		}
	}

	final void b(lf var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.a(var4, var5);
			int[] var7 = new int[var1.S];

			for (int var8 = 0; var8 < var1.S; ++var8) {
				var7[var8] = (int) (Math.sin((double) var8 / 2.0D + (double) var6 / 5.0D) * 5.0D);
			}

			this.a(var1, var2 - this.b(var1) / 2, var3, (int[]) null, var7);
		}
	}

	final int b(lf var1, int var2) {
		int var3 = this.a(var1, new int[]{var2}, Eb);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.b(Eb[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	private void a(byte[] var1) {
		this.Fb = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.Fb.length; ++var2) {
				this.Fb[var2] = var1[var2] & 255;
			}

			this.Z = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.Fb[var3] = var1[var2++] & 255;
			}

			int[] var4 = new int[256];
			int[] var5 = new int[256];

			for (int var6 = 0; var6 < 256; ++var6) {
				var4[var6] = var1[var2++] & 255;
			}

			for (int var7 = 0; var7 < 256; ++var7) {
				var5[var7] = var1[var2++] & 255;
			}

			byte[][] var8 = new byte[256][];

			int var11;
			for (int var9 = 0; var9 < 256; ++var9) {
				var8[var9] = new byte[var4[var9]];
				byte var10 = 0;

				for (var11 = 0; var11 < var8[var9].length; ++var11) {
					var10 += var1[var2++];
					var8[var9][var11] = var10;
				}
			}

			byte[][] var14 = new byte[256][];

			int var13;
			for (var11 = 0; var11 < 256; ++var11) {
				var14[var11] = new byte[var4[var11]];
				byte var12 = 0;

				for (var13 = 0; var13 < var14[var11].length; ++var13) {
					var12 += var1[var2++];
					var14[var11][var13] = var12;
				}
			}

			this.Gb = new byte[65536];

			for (int var15 = 0; var15 < 256; ++var15) {
				if (var15 != 32 && var15 != 160) {
					for (var13 = 0; var13 < 256; ++var13) {
						if (var13 != 32 && var13 != 160) {
							this.Gb[(var15 << 8) + var13] = (byte) a(var8, var14, var5, this.Fb, var4, var15, var13);
						}
					}
				}
			}

			this.Z = var5[32] + var4[32];
		}
	}

	final void a(lf var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			this.a(var4, var5);
			double var8 = 7.0D - (double) var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.S];

			for (int var11 = 0; var11 < var1.S; ++var11) {
				var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) var6) * var8);
			}

			this.a(var1, var2 - this.b(var1) / 2, var3, (int[]) null, var10);
		}
	}

	private int b(int var1) {
		return this.Fb[var1 & 255];
	}

	final int c(lf var1, int var2) {
		return this.a(var1, new int[]{var2}, Eb);
	}

	private int a(lf var1, int[] var2, lf[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			lf var6 = u.a(-13, 100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			int var11 = -1;
			int var12 = 0;
			int var13 = var1.e(-30593);

			for (int var14 = 0; var14 < var13; ++var14) {
				int var15 = var1.a(58, (int) var14);
				if (var15 == 60) {
					var10 = var14;
				} else {
					if (var15 == 62 && var10 != -1) {
						lf var16 = var1.a(var14, (int) (var10 + 1), 66);
						var10 = -1;
						var6.e(-64, 60);
						var6.b(var16, -109);
						var6.e(-64, 62);
						if (var16.e(Cb, -1)) {
							var3[var12++] = var6.a(var6.e(-30593), (int) var5, 73);
							var5 = var6.e(-30593);
							var4 = 0;
							var7 = -1;
							var11 = -1;
						} else if (var16.e(lf_kb, -1)) {
							var4 += this.b(60);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 60];
							}

							var11 = 60;
						} else if (var16.e(lf_nb, -1)) {
							var4 += this.b(62);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 62];
							}

							var11 = 62;
						} else if (var16.e(Ab, -1)) {
							var4 += this.b(160);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 160];
							}

							var11 = 160;
						} else if (var16.e(zb, -1)) {
							var4 += this.b(173);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 173];
							}

							var11 = 173;
						} else if (var16.e(lf_wb, -1)) {
							var4 += this.b(215);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 215];
							}

							var11 = 215;
						} else if (var16.e(lf_hb, -1)) {
							var4 += this.b(128);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 128];
							}

							var11 = 128;
						} else if (var16.e(Db, -1)) {
							var4 += this.b(169);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 169];
							}

							var11 = 169;
						} else if (var16.e(lf_lb, -1)) {
							var4 += this.b(174);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + 174];
							}

							var11 = 174;
						} else if (var16.b((byte) -122, P)) {
							try {
								int var17 = var16.c(-41, 4).b((byte) -19);
								var4 += this.R[var17].R;
								var11 = -1;
							} catch (Exception var18) {
								;
							}
						}

						var15 = -1;
					}

					if (var10 == -1) {
						if (var15 != -1) {
							var6.e(-64, var15);
							var4 += this.b(var15);
							if (this.Gb != null && var11 != -1) {
								var4 += this.Gb[(var11 << 8) + var15];
							}

							var11 = var15;
						}

						if (var15 == 32) {
							var7 = var6.e(-30593);
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12++] = var6.a(var7 - var9, (int) var5, 47);
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = -1;
						}

						if (var15 == 45) {
							var7 = var6.e(-30593);
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			if (var6.e(-30593) > var5) {
				var3[var12++] = var6.a(var6.e(-30593), (int) var5, 62);
			}

			return var12;
		}
	}

	private void d(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * b.J;
		int var8 = b.J - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < b.H) {
			var11 = b.H - var3;
			var5 -= var11;
			var3 = b.H;
			var10 += var11 * var4;
			var7 += var11 * b.J;
		}

		if (var3 + var5 > b.L) {
			var5 -= var3 + var5 - b.L;
		}

		if (var2 < b.I) {
			var11 = b.I - var2;
			var4 -= var11;
			var2 = b.I;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > b.K) {
			var11 = var2 + var4 - b.K;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			a(b.M, this.bytes_bb[var1], var6, var10, var7, var4, var5, var8, var9);
		}
	}

	abstract void e(int var1, int var2, int var3, int var4, int var5, int var6);

	final void c(lf var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.a(var4, var5);
			this.a(var1, var2 - this.b(var1) / 2, var3);
		}
	}

	static final void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (int var12 = var5; var12 < 0; ++var12) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	final int a(lf var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.a(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	private static int a(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	bf(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.ints_db = var2;
		this.ints_tb = var3;
		this.xb = var4;
		this.Q = var5;
		this.a(var1);
		this.bytes_bb = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.ints_tb[var10] < var8 && this.Q[var10] != 0) {
				var8 = this.ints_tb[var10];
			}

			if (this.ints_tb[var10] + this.Q[var10] > var9) {
				var9 = this.ints_tb[var10] + this.Q[var10];
			}
		}

		this.Bb = this.Z - var8;
		this.O = var9 - this.Z;
	}

	public static void d() {
		lf_kb = null;
		lf_nb = null;
		Ab = null;
		zb = null;
		lf_wb = null;
		lf_hb = null;
		Db = null;
		lf_lb = null;
		P = null;
		Cb = null;
		lf_mb = null;
		lf_cb = null;
		lf_pb = null;
		S = null;
		lf_ib = null;
		lf_fb = null;
		T = null;
		lf_jb = null;
		lf_eb = null;
		U = null;
		lf_rb = null;
		X = null;
		lf_vb = null;
		Eb = null;
	}

	static final void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	bf(byte[] var1) {
		this.a(var1);
	}

	final void a(df[] var1, int[] var2) {
		if (var2 != null && var2.length != var1.length) {
			throw new IllegalArgumentException();
		} else {
			this.R = var1;
			this.ints_ab = var2;
		}
	}
}
