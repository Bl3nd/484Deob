import java.util.Random;

final class nh extends j {

	private int Q = 0;
	static int R;
	static int S;
	private int T = 2048;
	private int U = 2;
	static boolean V;
	static int W;
	static int X;
	static int Y;
	private int Z = 25;
	static int int_ab;
	static lf lf_bb = dd.a("Nehmen", 2);
	static int int_cb;
	private int int_db;
	private int int_eb;
	static int int_fb = 2;
	static int int_gb;
	private int int_hb = 5;
	private int int_ib;
	private int int_jb = 1;
	static int int_kb;
	private int[][] ints_lb;
	static int int_mb = 0;
	static int int_nb;
	static lf lf_ob = dd.a("", 2);
	private int int_pb = 5;

	static final vg c(int var0, int var1, int var2) {
		try {
			++X;
			vg var3 = ra.a(var0, (byte) 122);
			return var2 == var1 ? var3 : (var3 != null && var3.Fb != null && var2 < var3.Fb.length ? var3.Fb[var2] : null);
		} catch (RuntimeException var4) {
			throw ec.a(var4, "nh.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final void c(int var1) {
		try {
			if (var1 != 25614) {
				this.int_db = -58;
			}

			this.g(-90);
			++int_ab;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "nh.M(" + var1 + ')');
		}
	}

	public static void e(int var0) {
		try {
			lf_bb = null;
			int var1 = -17 % ((-2 - var0) / 56);
			lf_ob = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nh.J(" + var0 + ')');
		}
	}

	public nh() {
		super(0, true);
	}

	static final void d(int var0, int var1, int var2) {
		ab var3 = i.Ib[var0][var1][var2];
		if (var3 != null) {
			var3.K = null;
		}
	}

	final int[] a(int var1, int var2) {
		int var8 = client.int_gc;

		try {
			++S;
			int[] var3 = super.H.a(-314, var2);
			if (var1 > -49) {
				this.a(-114, -112, 86, 60);
			}

			if (super.H.boolean_v) {
				int var4;
				int var5;
				int var6;
				label79:
				{
					label78:
					{
						var4 = fc.G[var2];
						var5 = this.U;
						if (var5 != 2) {
							if (~var5 != -2) {
								break label79;
							}

							if (var8 == 0) {
								break label78;
							}
						}

						var5 = 0;
						if (var8 != 0 || ff.int_a > var5) {
							do {
								var6 = ef.ints_m[var5];
								int[] var7 = this.a(-11740, 2, var4, var6);
								var3[var5] = -var7[0] + var7[1];
								++var5;
							} while (ff.int_a > var5);
						}

						if (var8 == 0) {
							return var3;
						}
					}

					var5 = 0;
					if (var8 != 0 || ~ff.int_a < ~var5) {
						do {
							var6 = ef.ints_m[var5];
							var3[var5] = this.a(-11740, 2, var4, var6)[1];
							++var5;
						} while (~ff.int_a < ~var5);
					}

					if (var8 == 0) {
						return var3;
					}
				}

				var5 = 0;
				if (var8 != 0 || ff.int_a > var5) {
					do {
						var6 = ef.ints_m[var5];
						var3[var5] = this.a(-11740, 1, var4, var6)[0];
						++var5;
					} while (ff.int_a > var5);
				}
			}

			return var3;
		} catch (RuntimeException var9) {
			throw ec.a(var9, "nh.G(" + var1 + ',' + var2 + ')');
		}
	}

	private final int[] a(int var1, int var2, int var3, int var4) {
		int var25 = client.int_gc;

		try {
			int[] var5 = new int[var2];
			int var6 = 0;
			if (var25 != 0) {
				var5[var6] = Integer.MAX_VALUE;
				++var6;
			}

			while (~var2 < ~var6) {
				var5[var6] = Integer.MAX_VALUE;
				++var6;
			}

			++Y;
			var3 += this.int_db;
			if (var3 > 4096) {
				var3 -= 4096;
			}

			var4 += this.int_eb;
			if (var4 > 4096) {
				var4 -= 4096;
			}

			int var7 = var4 * this.int_pb >> 12;
			int var8 = this.int_hb * var3 >> 12;
			int var10 = -1;
			int var9 = -1;
			int var12 = Integer.MAX_VALUE;
			int var13 = ~this.int_pb >= -3 ? this.int_pb - 1 : 2;
			int var11 = Integer.MAX_VALUE;
			int var14 = ~this.int_hb < -3 ? 2 : this.int_hb + -1;
			int var15 = -var13;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			if (var25 != 0) {
				var16 = -var14;
				if (var25 == 0 && ~var14 > ~var16) {
					++var15;
				} else {
					while (true) {
						var17 = var15 + var7;
						if (~var17 > -1) {
							var17 += this.int_pb;
						}

						if (this.int_pb <= var17) {
							var17 -= this.int_pb;
						}

						var18 = var8 - -var16;
						if (~var18 > -1) {
							var18 += this.int_hb;
						}

						if (this.int_hb <= var18) {
							var18 -= this.int_hb;
						}

						var19 = var17 + this.int_pb * var18;
						var21 = this.ints_lb[var19][1];
						var20 = this.ints_lb[var19][0];
						var23 = var3 + -var21;
						var22 = var4 + -var20;
						if (var23 < 0) {
							var23 = -var23;
						}

						if (var23 > 2048) {
							var23 = 4096 - var23;
						}

						if (var22 < 0) {
							var22 = -var22;
						}

						if (var22 > 2048) {
							var22 = 4096 + -var22;
						}

						label285:
						{
							var24 = var23 * var23 + var22 * var22 >> 12;
							if (var24 >= var11) {
								if ((var9 != var10 || var19 == var10) && (var24 >= var12 || ~var19 == ~var9)) {
									break label285;
								}

								var10 = var19;
								var12 = var24;
								if (var25 == 0) {
									break label285;
								}
							}

							label250:
							{
								if (var10 == -1) {
									var12 = var24;
									var10 = var19;
									if (var25 == 0) {
										break label250;
									}
								}

								var12 = var11;
								var10 = var9;
							}

							var11 = var24;
							var9 = var19;
						}

						++var16;
						if (~var14 > ~var16) {
							++var15;
							break;
						}
					}
				}
			}

			while (var13 >= var15) {
				var16 = -var14;
				if (var25 == 0 && ~var14 > ~var16) {
					++var15;
				} else {
					do {
						var17 = var15 + var7;
						if (~var17 > -1) {
							var17 += this.int_pb;
						}

						if (this.int_pb <= var17) {
							var17 -= this.int_pb;
						}

						var18 = var8 - -var16;
						if (~var18 > -1) {
							var18 += this.int_hb;
						}

						if (this.int_hb <= var18) {
							var18 -= this.int_hb;
						}

						var19 = var17 + this.int_pb * var18;
						var21 = this.ints_lb[var19][1];
						var20 = this.ints_lb[var19][0];
						var23 = var3 + -var21;
						var22 = var4 + -var20;
						if (var23 < 0) {
							var23 = -var23;
						}

						if (var23 > 2048) {
							var23 = 4096 - var23;
						}

						if (var22 < 0) {
							var22 = -var22;
						}

						if (var22 > 2048) {
							var22 = 4096 + -var22;
						}

						label290:
						{
							var24 = var23 * var23 + var22 * var22 >> 12;
							if (var24 >= var11) {
								if ((var9 != var10 || var19 == var10) && (var24 >= var12 || ~var19 == ~var9)) {
									break label290;
								}

								var10 = var19;
								var12 = var24;
								if (var25 == 0) {
									break label290;
								}
							}

							label123:
							{
								if (var10 == -1) {
									var12 = var24;
									var10 = var19;
									if (var25 == 0) {
										break label123;
									}
								}

								var12 = var11;
								var10 = var9;
							}

							var11 = var24;
							var9 = var19;
						}

						++var16;
					} while (~var14 <= ~var16);

					++var15;
				}
			}

			var16 = var4 + -this.ints_lb[var9][0];
			if (var1 != -11740) {
				return null;
			} else {
				if (var16 < 0) {
					var16 = -var16;
				}

				if (var16 > 2048) {
					var16 = -var16 + 4096;
				}

				var17 = -this.ints_lb[var9][1] + var3;
				if (~var17 > -1) {
					var17 = -var17;
				}

				var18 = -this.ints_lb[var10][0] + var4;
				var19 = var3 - this.ints_lb[var10][1];
				if (var19 < 0) {
					var19 = -var19;
				}

				if (var18 < 0) {
					var18 = -var18;
				}

				if (var17 > 2048) {
					var17 = 4096 - var17;
				}

				if (var18 > 2048) {
					var18 = -var18 + 4096;
				}

				if (~var19 < -2049) {
					var19 = 4096 - var19;
				}

				label104:
				{
					label103:
					{
						var20 = this.int_jb;
						if (~var20 != -2) {
							if (~var20 == -3 && var25 == 0) {
								break label103;
							}

							var12 = var18 * var18 - -(var19 * var19);
							var11 = var17 * var17 + var16 * var16;
							if (var25 == 0) {
								break label104;
							}
						}

						var11 = (int) Math.sqrt((double) (var16 * var16 - -(var17 * var17)));
						var12 = (int) Math.sqrt((double) (var19 * var19 + var18 * var18));
						if (var25 == 0) {
							break label104;
						}
					}

					var11 = Math.max(var16, var17);
					var12 = Math.max(var18, var19);
				}

				var5[0] = var11 * this.int_ib;
				if (var2 > 1) {
					var5[1] = var12 * this.int_ib;
				}

				return var5;
			}
		} catch (RuntimeException var26) {
			throw ec.a(var26, "nh.I(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}

	static final int a(int var0, byte var1, int var2) {
		try {
			++W;
			if (var1 != -113) {
				return 77;
			} else {
				int var3 = var0 >>> 31;
				return -var3 + (var3 + var0) / var2;
			}
		} catch (RuntimeException var4) {
			throw ec.a(var4, "nh.H(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label69:
			{
				label68:
				{
					label67:
					{
						label66:
						{
							label65:
							{
								label64:
								{
									label63:
									{
										if (var2 != 0) {
											if (~var2 == -2) {
												break label63;
											}

											if (~var2 == -3) {
												break label64;
											}

											if (~var2 == -4) {
												break label65;
											}

											if (~var2 == -5) {
												break label66;
											}

											if (var2 == 5) {
												break label67;
											}

											if (var2 != 6) {
												break label69;
											}

											if (var5 == 0) {
												break label68;
											}
										}

										this.int_pb = this.int_hb = var3.j((byte) 115);
										if (var5 == 0) {
											break label69;
										}
									}

									this.Q = var3.j((byte) 117);
									if (var5 == 0) {
										break label69;
									}
								}

								this.T = var3.b(true);
								if (var5 == 0) {
									break label69;
								}
							}

							this.U = var3.j((byte) 97);
							if (var5 == 0) {
								break label69;
							}
						}

						this.int_jb = var3.j((byte) 76);
						if (var5 == 0) {
							break label69;
						}
					}

					this.int_pb = var3.j((byte) 91);
					if (var5 == 0) {
						break label69;
					}
				}

				this.int_hb = var3.j((byte) 69);
			}

			if (var1 >= -120) {
				R = -105;
			}

			++int_cb;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "nh.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	static final void f(int var0) {
		try {
			System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
			++int_nb;
			System.exit(1);
			if (var0 != 14750) {
				a(28, (byte) 46, -69);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "nh.K(" + var0 + ')');
		}
	}

	private final void g(int var1) {
		int var13 = client.int_gc;

		try {
			++int_kb;
			Random var2 = new Random((long) this.Q);
			this.Z = this.int_pb * this.int_hb;
			this.ints_lb = new int[this.Z][2];
			int var3 = 4096 / this.int_pb;
			this.int_eb = var3 >> 1;
			if (var1 < -86) {
				int var4 = 4096 / this.int_hb;
				this.int_db = var4 >> 1;
				int var5 = this.int_eb * this.T >> 12;
				int var6 = this.int_db * this.T >> 12;
				int var7 = 0;
				if (var13 == 0 && var7 >= this.int_hb) {
					this.int_ib = this.int_hb >= this.int_pb ? this.int_hb : this.int_pb;
				} else {
					do {
						int var8 = var4 * var7;
						int var9 = 0;
						if (var13 == 0 && var9 >= this.int_pb) {
							++var7;
						} else {
							do {
								int var10 = var9 + this.int_pb * var7;
								int var11 = var5 * (nb.a(8192, var2, true) + -4096) >> 12;
								int var12 = var6 * (nb.a(8192, var2, true) + -4096) >> 12;
								this.ints_lb[var10][0] = var11 - -(var9 * var3);
								this.ints_lb[var10][1] = var12 + var8;
								++var9;
							} while (var9 < this.int_pb);

							++var7;
						}
					} while (var7 < this.int_hb);

					this.int_ib = this.int_hb >= this.int_pb ? this.int_hb : this.int_pb;
				}
			}
		} catch (RuntimeException var14) {
			throw ec.a(var14, "nh.D(" + var1 + ')');
		}
	}

	static final void c(int var0, int var1) {
		int var17 = client.int_gc;

		try {
			++int_gb;
			se.int_gb += var1 * 128;
			short var2 = 256;
			int var3;
			if (~se.int_gb < ~uf.ints_a.length) {
				se.int_gb -= uf.ints_a.length;
				var3 = (int) (12.0D * Math.random());
				c.a(wh.dfs_c[var3], (byte) -86);
			}

			var3 = 0;
			int var5 = (var2 - var1) * 128;
			int var4 = 128 * var1;
			if (var0 == 50) {
				int var6 = 0;
				int var7;
				if (var17 != 0 || var6 < var5) {
					do {
						var7 = dg.ints_k[var4 + var3] - uf.ints_a[var3 + se.int_gb & -1 + uf.ints_a.length] * var1 / 6;
						if (var7 < 0) {
							var7 = 0;
						}

						dg.ints_k[var3++] = var7;
						++var6;
					} while (var6 < var5);
				}

				var7 = var2 - var1;
				int var8;
				int var9;
				int var10;
				if (var17 != 0) {
					var8 = var7 * 128;
					var9 = 0;
					if (var17 == 0 && var9 >= 128) {
						++var7;
					} else {
						while (true) {
							label217:
							{
								var10 = (int) (Math.random() * 100.0D);
								if (var10 < 50 && var9 > 10 && var9 < 118) {
									dg.ints_k[var8 + var9] = 255;
									if (var17 == 0) {
										break label217;
									}
								}

								dg.ints_k[var9 + var8] = 0;
							}

							++var9;
							if (var9 >= 128) {
								++var7;
								break;
							}
						}
					}
				}

				while (~var2 < ~var7) {
					var8 = var7 * 128;
					var9 = 0;
					if (var17 == 0 && var9 >= 128) {
						++var7;
					} else {
						do {
							label179:
							{
								var10 = (int) (Math.random() * 100.0D);
								if (var10 < 50 && var9 > 10 && var9 < 118) {
									dg.ints_k[var8 + var9] = 255;
									if (var17 == 0) {
										break label179;
									}
								}

								dg.ints_k[var9 + var8] = 0;
							}

							++var9;
						} while (var9 < 128);

						++var7;
					}
				}

				if (~nf.int_d < -1) {
					nf.int_d -= 4 * var1;
				}

				if (jh.int_k > 0) {
					jh.int_k -= var1 * 4;
				}

				if (nf.int_d == 0 && jh.int_k == 0) {
					var8 = (int) ((double) (2000 / var1) * Math.random());
					if (var8 == 0) {
						nf.int_d = 1024;
					}

					if (var8 == 1) {
						jh.int_k = 1024;
					}
				}

				var8 = 0;
				if (var17 != 0) {
					v.ints_ub[var8] = v.ints_ub[var1 + var8];
					++var8;
				}

				while (~var8 > ~(-var1 + var2)) {
					v.ints_ub[var8] = v.ints_ub[var1 + var8];
					++var8;
				}

				var9 = var2 + -var1;
				if (var17 != 0) {
					v.ints_ub[var9] = (int) (16.0D * Math.sin((double) md.int_b / 14.0D) + 14.0D * Math.sin((double) md.int_b / 15.0D) + Math.sin((double) md.int_b / 16.0D) * 12.0D);
					++md.int_b;
					++var9;
				}

				while (var9 < var2) {
					v.ints_ub[var9] = (int) (16.0D * Math.sin((double) md.int_b / 14.0D) + 14.0D * Math.sin((double) md.int_b / 15.0D) + Math.sin((double) md.int_b / 16.0D) * 12.0D);
					++md.int_b;
					++var9;
				}

				var10 = (var1 + (1 & pd.int_i)) / 2;
				uh.y += var1;
				if (~var10 < -1) {
					int var11 = 0;
					int var12;
					int var13;
					if (var17 != 0) {
						var12 = (int) (124.0D * Math.random()) + 2;
						var13 = (int) (128.0D * Math.random()) - -128;
						dg.ints_k[var12 - -(var13 << 7)] = 192;
						++var11;
					}

					while (~var11 > ~(100 * uh.y)) {
						var12 = (int) (124.0D * Math.random()) + 2;
						var13 = (int) (128.0D * Math.random()) - -128;
						dg.ints_k[var12 - -(var13 << 7)] = 192;
						++var11;
					}

					uh.y = 0;
					var12 = 0;
					int var14;
					int var15;
					if (var17 != 0 || ~var2 < ~var12) {
						do {
							var13 = 0;
							var14 = var12 * 128;
							var15 = -var10;
							if (var17 == 0 && var15 >= 128) {
								++var12;
							} else {
								do {
									if (~(var10 + var15) > -129) {
										var13 += dg.ints_k[var10 + var14 + var15];
									}

									if (~(-var10 + -1 + var15) <= -1) {
										var13 -= dg.ints_k[var15 - (-var14 + var10 + 1)];
									}

									if (~var15 <= -1) {
										ba.ints_d[var15 - -var14] = var13 / (var10 * 2 + 1);
									}

									++var15;
								} while (var15 < 128);

								++var12;
							}
						} while (~var2 < ~var12);
					}

					var13 = 0;
					if (var17 != 0 || var13 < 128) {
						do {
							var14 = 0;
							var15 = -var10;
							if (var17 == 0 && var15 >= var2) {
								++var13;
							} else {
								do {
									int var16 = 128 * var15;
									if (~var2 < ~(var10 + var15)) {
										var14 += ba.ints_d[var10 * 128 + var16 + var13];
									}

									if (~(var15 + -var10 + -1) <= -1) {
										var14 -= ba.ints_d[-((var10 - -1) * 128) + var13 + var16];
									}

									if (var15 >= 0) {
										dg.ints_k[var16 + var13] = var14 / (var10 * 2 - -1);
									}

									++var15;
								} while (var15 < var2);

								++var13;
							}
						} while (var13 < 128);

					}
				}
			}
		} catch (RuntimeException var18) {
			throw ec.a(var18, "nh.C(" + var0 + ',' + var1 + ')');
		}
	}
}
