import java.util.Random;

final class kd extends j {

	private int Q = 1024;
	private int R = 1024;
	static int S = 0;
	static lf mapdots = dd.a("mapdots", 2);
	private int V;
	static int W;
	private int X = 2048;
	private int Y = 819;
	static int Z;
	static int[] ints_ab = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
	private int int_bb = 1024;
	private int int_cb = 0;
	static int int_db = 0;
	private int int_eb = 0;
	static int int_fb;
	static int int_gb;
	static lf lf_hb = dd.a("Geben Sie Ihren Benutzernamen", 2);
	private int int_ib = 1024;
	static int int_jb = 1;
	static int int_kb;
	private int int_lb = 409;
	static kf kf_mb;
	static int int_nb;

	static final void a(lf var0, boolean var1, lf var2, int var3) {
		try {
			++W;
			mc.a(var0, (lf) null, var3, var2, 105);
			if (var1) {
				a((lf) null, true, (lf) null, -14);
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "kd.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var39 = client.int_gc;

		try {
			++int_gb;
			int[] var3 = super.H.a(-314, var2);
			if (super.H.boolean_v) {
				int[][] var4 = super.H.a((byte) -122);
				int var5 = 0;
				int var6 = 0;
				int var7 = 0;
				int var8 = 0;
				boolean var10 = true;
				boolean var11 = true;
				int var12 = 0;
				int var14 = ff.int_a * this.int_bb >> 1891854188;
				int var9 = 0;
				int var13 = 0;
				int var15 = this.X * ff.int_a >> 2144236236;
				int var16 = this.int_lb * dg.int_p >> -818437204;
				int var17 = this.Y * dg.int_p >> -1427644756;
				if (~var17 >= -2) {
					return var4[var2];
				}

				this.V = ff.int_a / 8 * this.Q >> 1220535052;
				int var18 = 1 - -(ff.int_a / var14);
				int[][] var19 = new int[var18][3];
				Random var21 = new Random((long) this.int_cb);
				int[][] var20 = new int[var18][3];

				while (true) {
					int var23 = var14 - -nb.a(var15 - var14, var21, true);
					int var25 = var8 - -var23;
					int var24 = var16 - -nb.a(-var16 + var17, var21, true);
					if (~var25 < ~ff.int_a) {
						var25 = ff.int_a;
						var23 = -var8 + ff.int_a;
					}

					int var22;
					int var28;
					label125:
					{
						if (!var11) {
							int[] var27 = var20[var9];
							var22 = var27[2];
							int var26 = var9;
							var28 = 0;
							int var29 = var25 - -var5;
							if (var29 < 0) {
								var29 += ff.int_a;
							}

							if (~ff.int_a > ~var29) {
								var29 -= ff.int_a;
							}

							do {
								int[] var30 = var20[var26];
								if (var30[0] <= var29 && var30[1] >= var29) {
									break;
								}

								++var26;
								if (~var26 <= ~var12) {
									var26 = 0;
								}

								++var28;
							} while (var39 == 0);

							if (var26 != var9) {
								int var43 = var8 + var5;
								if (var43 < 0) {
									var43 += ff.int_a;
								}

								if (~var43 < ~ff.int_a) {
									var43 -= ff.int_a;
								}

								int var31 = 1;
								if (var39 != 0 || ~var31 >= ~var28) {
									do {
										int[] var32 = var20[(var9 + var31) % var12];
										var22 = Math.max(var22, var32[2]);
										++var31;
									} while (~var31 >= ~var28);
								}

								int var45 = 0;
								if (var39 != 0 || var45 <= var28) {
									do {
										int[] var33 = var20[(var9 + var45) % var12];
										int var34 = var33[2];
										if (var34 != var22) {
											int var35;
											int var36;
											label85:
											{
												int var37 = var33[0];
												int var38 = var33[1];
												if (~var43 <= ~var29) {
													if (var37 == 0) {
														var36 = Math.min(var29, var38);
														var35 = 0;
														if (var39 == 0) {
															break label85;
														}
													}

													var35 = Math.max(var43, var37);
													var36 = ff.int_a;
													if (var39 == 0) {
														break label85;
													}
												}

												var35 = Math.max(var43, var37);
												var36 = Math.min(var29, var38);
											}

											this.a(-var35 + var36, var22 + -var34, (byte) 51, var4, var7 + var35, var21, var34);
										}

										++var45;
									} while (var45 <= var28);
								}
							}

							var9 = var26;
							if (var39 == 0) {
								break label125;
							}
						}

						var22 = 0;
					}

					label78:
					{
						if (var22 + var24 <= dg.int_p) {
							var10 = false;
							if (var39 == 0) {
								break label78;
							}
						}

						var24 = dg.int_p + -var22;
					}

					int[] var41;
					if (var25 == ff.int_a) {
						this.a(var23, var24, (byte) 51, var4, var6 + var8, var21, var22);
						if (var10) {
							break;
						}

						var10 = true;
						var9 = 0;
						var7 = var6;
						var41 = var19[var13++];
						var11 = false;
						var41[1] = var25;
						var41[2] = var24 + var22;
						var41[0] = var8;
						var6 = nb.a(ff.int_a, var21, true);
						var8 = 0;
						var5 = var6 + -var7;
						int[][] var42 = var20;
						var12 = var13;
						var20 = var19;
						var28 = var5;
						var19 = var42;
						var13 = 0;
						if (~var5 > -1) {
							var28 = var5 + ff.int_a;
						}

						if (var28 > ff.int_a) {
							var28 -= ff.int_a;
						}

						while (true) {
							int[] var44 = var20[var9];
							if (~var44[0] >= ~var28 && ~var28 >= ~var44[1]) {
								break;
							}

							++var9;
							if (var9 >= var12) {
								var9 = 0;
								if (var39 != 0) {
									break;
								}
							}
						}

						if (var39 == 0) {
							continue;
						}
					}

					var41 = var19[var13++];
					var41[0] = var8;
					var41[1] = var25;
					var41[2] = var22 - -var24;
					this.a(var23, var24, (byte) 51, var4, var8 - -var6, var21, var22);
					var8 = var25;
					if (var39 != 0) {
						break;
					}
				}
			}

			if (var1 > -49) {
				d((byte) -36);
			}

			return var3;
		} catch (RuntimeException var40) {
			throw ec.a(var40, "kd.G(" + var1 + ',' + var2 + ')');
		}
	}

	static final void a(bg var0, int var1) {
		try {
			pd.y = var0;
			++int_nb;
			ia.int_f = pd.y.b((byte) 86, (int) var1);
		} catch (RuntimeException var3) {
			throw ec.a(var3, "kd.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			lf_hb = null;
			if (var0 != -86) {
				kf_mb = null;
			}

			kf_mb = null;
			ints_ab = null;
			mapdots = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "kd.C(" + var0 + ')');
		}
	}

	private final void a(int var1, int var2, byte var3, int[][] var4, int var5, Random var6, int var7) {
		int var23 = client.int_gc;

		try {
			int var8 = this.int_ib <= 0 ? 4096 : 4096 - nb.a(this.int_ib, var6, true);
			int var9 = this.R * this.V >> 571425612;
			if (var3 != 51) {
				int_db = -23;
			}

			++Z;
			int var10 = this.V + -(~var9 < -1 ? nb.a(var9, var6, true) : 0);
			if (ff.int_a <= var5) {
				var5 -= ff.int_a;
			}

			int var11;
			int var12;
			if (~var10 >= -1) {
				if (~ff.int_a > ~(var1 + var5)) {
					var11 = -var5 + ff.int_a;
					var12 = 0;
					if (var23 != 0 || var12 < var2) {
						do {
							int[] var25 = var4[var7 - -var12];
							na.a(var25, var5, var11, var8);
							na.a(var25, 0, -var11 + var1, var8);
							++var12;
						} while (var12 < var2);

					}
				} else {
					var11 = 0;
					if (var23 != 0 || var11 < var2) {
						do {
							na.a(var4[var11 + var7], var5, var1, var8);
							++var11;
						} while (var11 < var2);

					}
				}
			} else if (~var2 < -1 && ~var1 < -1) {
				var11 = var1 / 2;
				var12 = var2 / 2;
				int var13 = ~var11 > ~var10 ? var11 : var10;
				int var14 = var10 <= var12 ? var10 : var12;
				int var15 = var13 + var5;
				int var16 = var1 + -(var13 * 2);
				int var17 = 0;
				if (var23 != 0 || ~var17 > ~var2) {
					do {
						label264:
						{
							int[] var18 = var4[var17 - -var7];
							int var19;
							int var20;
							int var21;
							if (~var14 < ~var17) {
								label236:
								{
									var19 = var8 * var17 / var14;
									if (this.int_eb == 0) {
										var20 = 0;
										if (var23 != 0 || var20 < var13) {
											do {
												var21 = var20 * var8 / var13;
												var18[sd.a(ch.int_h, var5 - -var20)] = var18[sd.a(ch.int_h, var1 + var5 - (var20 + 1))] = var21 * var19 >> 1435406540;
												++var20;
											} while (var20 < var13);
										}

										if (var23 == 0) {
											break label236;
										}
									}

									var20 = 0;
									if (var23 != 0 || ~var20 > ~var13) {
										do {
											var21 = var20 * var8 / var13;
											var18[sd.a(var20 + var5, ch.int_h)] = var18[sd.a(-1 + var1 + var5 + -var20, ch.int_h)] = var21 < var19 ? var21 : var19;
											++var20;
										} while (~var20 > ~var13);
									}
								}

								if (~ff.int_a <= ~(var15 - -var16)) {
									na.a(var18, var15, var16, var19);
									if (var23 == 0) {
										break label264;
									}
								}

								var20 = -var15 + ff.int_a;
								na.a(var18, var15, var20, var19);
								na.a(var18, 0, var16 + -var20, var19);
								if (var23 == 0) {
									break label264;
								}
							}

							var19 = var2 - (var17 + 1);
							if (~var14 < ~var19) {
								label239:
								{
									var20 = var19 * var8 / var14;
									int var22;
									if (this.int_eb == 0) {
										var21 = 0;
										if (var23 != 0 || ~var21 > ~var13) {
											do {
												var22 = var21 * var8 / var13;
												var18[sd.a(var5 - -var21, ch.int_h)] = var18[sd.a(-var21 + (var5 - (-var1 - -1)), ch.int_h)] = var20 * var22 >> 1360966604;
												++var21;
											} while (~var21 > ~var13);
										}

										if (var23 == 0) {
											break label239;
										}
									}

									var21 = 0;
									if (var23 != 0 || ~var13 < ~var21) {
										do {
											var22 = var21 * var8 / var13;
											var18[sd.a(var5 + var21, ch.int_h)] = var18[sd.a(ch.int_h, -var21 + var1 + var5 + -1)] = var20 > var22 ? var22 : var20;
											++var21;
										} while (~var13 < ~var21);
									}
								}

								if (var16 + var15 > ff.int_a) {
									var21 = ff.int_a + -var15;
									na.a(var18, var15, var21, var20);
									na.a(var18, 0, var16 + -var21, var20);
									if (var23 == 0) {
										break label264;
									}
								}

								na.a(var18, var15, var16, var20);
								if (var23 == 0) {
									break label264;
								}
							}

							var20 = 0;
							if (var23 != 0 || ~var20 > ~var13) {
								do {
									var18[sd.a(ch.int_h, var5 - -var20)] = var18[sd.a(-1 + -var20 + var1 + var5, ch.int_h)] = var20 * var8 / var13;
									++var20;
								} while (~var20 > ~var13);
							}

							if (~(var15 + var16) >= ~ff.int_a) {
								na.a(var18, var15, var16, var8);
								if (var23 == 0) {
									break label264;
								}
							}

							var21 = -var15 + ff.int_a;
							na.a(var18, var15, var21, var8);
							na.a(var18, 0, var16 + -var21, var8);
						}

						++var17;
					} while (~var17 > ~var2);

				}
			}
		} catch (RuntimeException var24) {
			throw ec.a(var24, "kd.D(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ',' + var7 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label83:
			{
				label82:
				{
					label81:
					{
						label80:
						{
							label79:
							{
								label78:
								{
									label77:
									{
										label76:
										{
											label75:
											{
												if (var2 != 0) {
													if (~var2 == -2) {
														break label75;
													}

													if (~var2 == -3) {
														break label76;
													}

													if (~var2 == -4) {
														break label77;
													}

													if (~var2 == -5) {
														break label78;
													}

													if (var2 == 5) {
														break label79;
													}

													if (var2 == 6) {
														break label80;
													}

													if (var2 == 7) {
														break label81;
													}

													if (var2 != 8) {
														break label83;
													}

													if (var5 == 0) {
														break label82;
													}
												}

												this.int_cb = var3.j((byte) 121);
												if (var5 == 0) {
													break label83;
												}
											}

											this.int_bb = var3.b(true);
											if (var5 == 0) {
												break label83;
											}
										}

										this.X = var3.b(true);
										if (var5 == 0) {
											break label83;
										}
									}

									this.int_lb = var3.b(true);
									if (var5 == 0) {
										break label83;
									}
								}

								this.Y = var3.b(true);
								if (var5 == 0) {
									break label83;
								}
							}

							this.Q = var3.b(true);
							if (var5 == 0) {
								break label83;
							}
						}

						this.int_eb = var3.j((byte) 86);
						if (var5 == 0) {
							break label83;
						}
					}

					this.R = var3.b(true);
					if (var5 == 0) {
						break label83;
					}
				}

				this.int_ib = var3.b(true);
			}

			if (var1 > -120) {
				a((lf) null, false, (lf) null, 61);
			}

			++int_fb;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "kd.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public kd() {
		super(0, true);
	}

	final void c(int var1) {
		try {
			if (var1 != 25614) {
				this.X = -34;
			}

			++int_kb;
		} catch (RuntimeException var3) {
			throw ec.a(var3, "kd.M(" + var1 + ')');
		}
	}
}
