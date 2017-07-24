final class gf extends ue {

	private int[] xb;
	private int[] yb;
	private short[] zb;
	private static gf Ab = new gf();
	private byte[] Bb;
	private int[] Cb;
	private int[] Db;
	private int[] Eb;
	private int[] Fb;
	private int[] Gb;
	private byte[] Hb;
	private int[] Ib;
	private int[] Jb;
	private byte Kb = 0;
	private byte[] Lb;
	private int Mb = 0;
	private static byte[] Nb = new byte[1];
	private static gf Ob = new gf();
	private static int[] Pb = new int[2000];
	private static int[] Qb = new int[4096];
	private static int[] Rb = new int[12];
	private static int[] Sb = new int[10];
	private static int[] Tb;
	private static int Ub;
	private static boolean[] Vb;
	private static int[] Wb;
	private static int[] Xb = new int[4096];
	private static int[] Yb;
	private static int Zb;
	private static int[] ints_ac;
	private static int[] ints_bc;
	private static int[] ints_cc;
	private static int[] ints_dc;
	private static int[] ints_ec;
	private static int[][] ints_fc;
	private static byte[] bytes_gc;
	private static int[][] ints_hc;
	private static int int_ic;
	private static int[] ints_jc;
	private static int[] ints_kc;
	private static int[] ints_lc;
	private static boolean[] booleans_mc;
	private static int[] ints_nc;
	private static int[] ints_oc;

	private static final int a(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 'ﾀ') + var1;
	}

	public static void g() {
		Ab = null;
		Nb = null;
		Ob = null;
		bytes_gc = null;
		booleans_mc = null;
		Vb = null;
		ints_oc = null;
		Xb = null;
		ints_lc = null;
		ints_nc = null;
		ints_cc = null;
		Qb = null;
		Yb = null;
		ints_hc = null;
		ints_ac = null;
		ints_fc = null;
		Pb = null;
		ints_kc = null;
		Rb = null;
		ints_ec = null;
		ints_dc = null;
		Sb = null;
		ints_jc = null;
		ints_bc = null;
		Tb = null;
		Wb = null;
	}

	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (!super.boolean_qb) {
			this.a();
		}

		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = var12 + (super.short_rb * var3 + super.short_sb * var2 >> 16);
		if (var13 > 50) {
			int var14 = var12 + (-super.short_rb * var3 + super.T * var2 >> 16);
			if (var14 < 3500) {
				int var15 = var8 * var4 + var6 * var5 >> 16;
				int var16 = var15 + super.short_rb << 9;
				if (var16 / var13 > nc.int_hb) {
					int var17 = var15 - super.short_rb << 9;
					if (var17 / var13 < nc.int_ab) {
						int var18 = var7 * var3 - var11 * var2 >> 16;
						int var19 = var18 + (super.short_rb * var2 + super.short_sb * var3 >> 16) << 9;
						if (var19 / var13 > nc.int_eb) {
							int var20 = var18 + (-super.short_rb * var2 + super.T * var3 >> 16) << 9;
							if (var20 / var13 < nc.T) {
								boolean var21 = false;
								boolean var22 = var14 <= 50;
								boolean var23 = var22 || this.Mb > 0;
								int var24 = nc.O;
								int var25 = nc.V;
								int var26 = 0;
								int var27 = 0;
								if (var1 != 0) {
									var26 = ints_jc[var1];
									var27 = ints_bc[var1];
								}

								boolean var28 = false;
								int var29;
								int var30;
								int var31;
								int var32;
								int var33;
								if (var9 > 0L && ue.boolean_nb && var14 > 0) {
									if (var15 > 0) {
										var29 = var17 / var13;
										var31 = var16 / var14;
									} else {
										var29 = var17 / var14;
										var31 = var16 / var13;
									}

									if (var18 > 0) {
										var30 = var20 / var13;
										var32 = var19 / var14;
									} else {
										var30 = var20 / var14;
										var32 = var19 / var13;
									}

									var33 = ue.int_wb - nc.O;
									int var34 = ue.int_ub - nc.V;
									if (var33 >= var29 && var33 <= var31 && var34 >= var30 && var34 <= var32) {
										var29 = 999999;
										var31 = -999999;
										var30 = 999999;
										var32 = -999999;
										int[] var35 = new int[]{super.short_tb, super.short_cb, super.short_tb, super.short_cb, super.short_tb, super.short_cb, super.short_tb, super.short_cb};
										int[] var36 = new int[]{super.short_jb, super.short_jb, super.short_ib, super.short_ib, super.short_jb, super.short_jb, super.short_ib, super.short_ib};
										int[] var37 = new int[]{super.T, super.T, super.T, super.T, super.short_sb, super.short_sb, super.short_sb, super.short_sb};

										for (int var38 = 0; var38 < 8; ++var38) {
											int var39 = var35[var38];
											int var40 = var37[var38];
											int var41 = var36[var38];
											int var42;
											if (var1 != 0) {
												var42 = var41 * var26 + var39 * var27 >> 16;
												var41 = var41 * var27 - var39 * var26 >> 16;
												var39 = var42;
											}

											var39 += var6;
											var40 += var7;
											var41 += var8;
											var42 = var41 * var4 + var39 * var5 >> 16;
											var41 = var41 * var5 - var39 * var4 >> 16;
											var39 = var42;
											var42 = var40 * var3 - var41 * var2 >> 16;
											var41 = var40 * var2 + var41 * var3 >> 16;
											if (var41 > 0) {
												int var43 = (var39 << 9) / var41;
												int var44 = (var42 << 9) / var41;
												if (var43 < var29) {
													var29 = var43;
												}

												if (var43 > var31) {
													var31 = var43;
												}

												if (var44 < var30) {
													var30 = var44;
												}

												if (var44 > var32) {
													var32 = var44;
												}
											}
										}

										if (var33 >= var29 && var33 <= var31 && var34 >= var30 && var34 <= var32) {
											if (super.boolean_hb) {
												ue.longs_vb[ue.int_fb++] = var9;
											} else {
												var28 = true;
											}
										}
									}
								}

								for (var29 = 0; var29 < super.int_mb; ++var29) {
									var30 = super.ints_gb[var29];
									var31 = super.ints_bb[var29];
									var32 = super.ints_db[var29];
									if (var1 != 0) {
										var33 = var32 * var26 + var30 * var27 >> 16;
										var32 = var32 * var27 - var30 * var26 >> 16;
										var30 = var33;
									}

									var30 += var6;
									var31 += var7;
									var32 += var8;
									var33 = var32 * var4 + var30 * var5 >> 16;
									var32 = var32 * var5 - var30 * var4 >> 16;
									var30 = var33;
									var33 = var31 * var3 - var32 * var2 >> 16;
									var32 = var31 * var2 + var32 * var3 >> 16;
									ints_lc[var29] = var32 - var12;
									if (var32 >= 50) {
										ints_oc[var29] = var24 + (var30 << 9) / var32;
										Xb[var29] = var25 + (var33 << 9) / var32;
									} else {
										ints_oc[var29] = -5000;
										var21 = true;
									}

									if (var23) {
										ints_nc[var29] = var30;
										ints_cc[var29] = var33;
										Qb[var29] = var32;
									}
								}

								try {
									this.a(var21, var28, var9, var12 - var14, var13 - var14 + 2);
								} catch (Exception var45) {
									;
								}
							}
						}
					}
				}
			}
		}
	}

	final void a(td var1, int var2, td var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				vb var6 = var1.L[var2];
				vb var7 = var3.L[var4];
				ha var8 = var6.ha_a;
				int_ic = 0;
				Zb = 0;
				Ub = 0;
				byte var9 = 0;
				int var14 = var9 + 1;
				int var10 = var5[var9];

				for (int var11 = 0; var11 < var6.int_l; ++var11) {
					short var12;
					for (var12 = var6.short_c[var11]; var12 > var10; var10 = var5[var14++]) {
						;
					}

					if (var12 != var10 || var8.A[var12] == 0) {
						if (var6.shorts_h[var11] != -1) {
							this.a(0, var8.x[var6.shorts_h[var11]], 0, 0, 0);
						}

						this.a(var8.A[var12], var8.x[var12], var6.shorts_g[var11], var6.shorts_i[var11], var6.shorts_f[var11]);
					}
				}

				int_ic = 0;
				Zb = 0;
				Ub = 0;
				var9 = 0;
				var14 = var9 + 1;
				var10 = var5[var9];

				for (int var15 = 0; var15 < var7.int_l; ++var15) {
					short var13;
					for (var13 = var7.short_c[var15]; var13 > var10; var10 = var5[var14++]) {
						;
					}

					if (var13 == var10 || var8.A[var13] == 0) {
						if (var7.shorts_h[var15] != -1) {
							this.a(0, var8.x[var7.shorts_h[var15]], 0, 0, 0);
						}

						this.a(var8.A[var13], var8.x[var13], var7.shorts_g[var15], var7.shorts_i[var15], var7.shorts_f[var15]);
					}
				}

				super.boolean_qb = false;
			} else {
				this.a(var1, var2);
			}
		}
	}

	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		try {
			this.a();
			int var8 = nc.O;
			int var9 = nc.V;
			int var10 = ints_jc[var1];
			int var11 = ints_bc[var1];
			int var12 = ints_jc[var2];
			int var13 = ints_bc[var2];
			int var14 = ints_jc[var3];
			int var15 = ints_bc[var3];
			int var16 = ints_jc[var4];
			int var17 = ints_bc[var4];
			int var18 = var6 * var16 + var7 * var17 >> 16;

			for (int var19 = 0; var19 < super.int_mb; ++var19) {
				int var20 = super.ints_gb[var19];
				int var21 = super.ints_bb[var19];
				int var22 = super.ints_db[var19];
				int var23;
				if (var3 != 0) {
					var23 = var21 * var14 + var20 * var15 >> 16;
					var21 = var21 * var15 - var20 * var14 >> 16;
					var20 = var23;
				}

				if (var1 != 0) {
					var23 = var21 * var11 - var22 * var10 >> 16;
					var22 = var21 * var10 + var22 * var11 >> 16;
					var21 = var23;
				}

				if (var2 != 0) {
					var23 = var22 * var12 + var20 * var13 >> 16;
					var22 = var22 * var13 - var20 * var12 >> 16;
					var20 = var23;
				}

				var20 += var5;
				var21 += var6;
				var22 += var7;
				var23 = var21 * var17 - var22 * var16 >> 16;
				var22 = var21 * var16 + var22 * var17 >> 16;
				ints_lc[var19] = var22 - var18;
				ints_oc[var19] = var8 + (var20 << 9) / var22;
				Xb[var19] = var9 + (var23 << 9) / var22;
				if (this.Mb > 0) {
					ints_nc[var19] = var20;
					ints_cc[var19] = var23;
					Qb[var19] = var22;
				}
			}

			this.a(false, false, 0L, super.short_pb, super.short_pb << 1);
		} catch (RuntimeException var24) {
			;
		}
	}

	private final boolean c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		return var2 < var3 && var2 < var4 && var2 < var5 ? false : (var2 > var3 && var2 > var4 && var2 > var5 ? false : (var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8));
	}

	final void a(td var1, int var2) {
		if (super.ints_eb != null) {
			if (var2 != -1) {
				vb var3 = var1.L[var2];
				ha var4 = var3.ha_a;
				int_ic = 0;
				Zb = 0;
				Ub = 0;

				for (int var5 = 0; var5 < var3.int_l; ++var5) {
					short var6 = var3.short_c[var5];
					if (var3.shorts_h[var5] != -1) {
						this.a(0, var4.x[var3.shorts_h[var5]], 0, 0, 0);
					}

					this.a(var4.A[var6], var4.x[var6], var3.shorts_g[var5], var3.shorts_i[var5], var3.shorts_f[var5]);
				}

				super.boolean_qb = false;
			}
		}
	}

	private final void a(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			int_ic = 0;
			Zb = 0;
			Ub = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < super.ints_eb.length) {
					int[] var19 = super.ints_eb[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						int_ic += super.ints_gb[var12];
						Zb += super.ints_bb[var12];
						Ub += super.ints_db[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				int_ic = int_ic / var7 + var3;
				Zb = Zb / var7 + var4;
				Ub = Ub / var7 + var5;
			} else {
				int_ic = var3;
				Zb = var4;
				Ub = var5;
			}
		} else {
			int[] var9;
			int var10;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < super.ints_eb.length) {
						var9 = super.ints_eb[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							super.ints_gb[var11] += var3;
							super.ints_bb[var11] += var4;
							super.ints_db[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < super.ints_eb.length) {
						var9 = super.ints_eb[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							super.ints_gb[var11] -= int_ic;
							super.ints_bb[var11] -= Zb;
							super.ints_db[var11] -= Ub;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = ints_jc[var14];
								var16 = ints_bc[var14];
								var17 = super.ints_bb[var11] * var15 + super.ints_gb[var11] * var16 + 32767 >> 16;
								super.ints_bb[var11] = super.ints_bb[var11] * var16 - super.ints_gb[var11] * var15 + 32767 >> 16;
								super.ints_gb[var11] = var17;
							}

							if (var12 != 0) {
								var15 = ints_jc[var12];
								var16 = ints_bc[var12];
								var17 = super.ints_bb[var11] * var16 - super.ints_db[var11] * var15 + 32767 >> 16;
								super.ints_db[var11] = super.ints_bb[var11] * var15 + super.ints_db[var11] * var16 + 32767 >> 16;
								super.ints_bb[var11] = var17;
							}

							if (var13 != 0) {
								var15 = ints_jc[var13];
								var16 = ints_bc[var13];
								var17 = super.ints_db[var11] * var15 + super.ints_gb[var11] * var16 + 32767 >> 16;
								super.ints_db[var11] = super.ints_db[var11] * var16 - super.ints_gb[var11] * var15 + 32767 >> 16;
								super.ints_gb[var11] = var17;
							}

							super.ints_gb[var11] += int_ic;
							super.ints_bb[var11] += Zb;
							super.ints_db[var11] += Ub;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < super.ints_eb.length) {
						var9 = super.ints_eb[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							super.ints_gb[var11] -= int_ic;
							super.ints_bb[var11] -= Zb;
							super.ints_db[var11] -= Ub;
							super.ints_gb[var11] = super.ints_gb[var11] * var3 / 128;
							super.ints_bb[var11] = super.ints_bb[var11] * var4 / 128;
							super.ints_db[var11] = super.ints_db[var11] * var5 / 128;
							super.ints_gb[var11] += int_ic;
							super.ints_bb[var11] += Zb;
							super.ints_db[var11] += Ub;
						}
					}
				}

			} else if (var1 == 5) {
				if (super.ints_lb != null && this.Bb != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < super.ints_lb.length) {
							var9 = super.ints_lb[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.Bb[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.Bb[var11] = (byte) var12;
							}
						}
					}
				}

			}
		}
	}

	private final void a(boolean var1, boolean var2, long var3, int var5, int var6) {
		if (var6 < 1600) {
			for (int var7 = 0; var7 < var6; ++var7) {
				Yb[var7] = 0;
			}

			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			int var16;
			int var19;
			int var20;
			int var22;
			for (int var8 = 0; var8 < super.int_kb; ++var8) {
				if (this.yb[var8] != -2) {
					var9 = this.Db[var8];
					var10 = this.Ib[var8];
					var11 = this.Gb[var8];
					var12 = ints_oc[var9];
					var13 = ints_oc[var10];
					var14 = ints_oc[var11];
					if (var1 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
						var15 = ints_nc[var9];
						var16 = ints_nc[var10];
						int var17 = ints_nc[var11];
						int var18 = ints_cc[var9];
						var19 = ints_cc[var10];
						var20 = ints_cc[var11];
						int var21 = Qb[var9];
						var22 = Qb[var10];
						int var23 = Qb[var11];
						var15 -= var16;
						var17 -= var16;
						var18 -= var19;
						var20 -= var19;
						var21 -= var22;
						var23 -= var22;
						int var24 = var18 * var23 - var21 * var20;
						int var25 = var21 * var17 - var15 * var23;
						int var26 = var15 * var20 - var18 * var17;
						if (var16 * var24 + var19 * var25 + var22 * var26 > 0) {
							Vb[var8] = true;
							int var27 = (ints_lc[var9] + ints_lc[var10] + ints_lc[var11]) / 3 + var5;
							ints_hc[var27][Yb[var27]++] = var8;
						}
					} else {
						if (var2 && this.c(ue.int_wb, ue.int_ub, Xb[var9], Xb[var10], Xb[var11], var12, var13, var14)) {
							ue.longs_vb[ue.int_fb++] = var3;
							var2 = false;
						}

						if ((var12 - var13) * (Xb[var11] - Xb[var10]) - (Xb[var9] - Xb[var10]) * (var14 - var13) > 0) {
							Vb[var8] = false;
							if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= nc.int_gb && var13 <= nc.int_gb && var14 <= nc.int_gb) {
								booleans_mc[var8] = false;
							} else {
								booleans_mc[var8] = true;
							}

							var15 = (ints_lc[var9] + ints_lc[var10] + ints_lc[var11]) / 3 + var5;
							ints_hc[var15][Yb[var15]++] = var8;
						}
					}
				}
			}

			if (this.Hb == null) {
				for (var9 = var6 - 1; var9 >= 0; --var9) {
					var10 = Yb[var9];
					if (var10 > 0) {
						int[] var29 = ints_hc[var9];

						for (var12 = 0; var12 < var10; ++var12) {
							this.e(var29[var12]);
						}
					}
				}

			} else {
				for (var9 = 0; var9 < 12; ++var9) {
					ints_ac[var9] = 0;
					Rb[var9] = 0;
				}

				for (var10 = var6 - 1; var10 >= 0; --var10) {
					var11 = Yb[var10];
					if (var11 > 0) {
						int[] var28 = ints_hc[var10];

						for (var13 = 0; var13 < var11; ++var13) {
							var14 = var28[var13];
							byte var30 = this.Hb[var14];
							var16 = ints_ac[var30]++;
							ints_fc[var30][var16] = var14;
							if (var30 < 10) {
								Rb[var30] += var10;
							} else if (var30 == 10) {
								Pb[var16] = var10;
							} else {
								ints_kc[var16] = var10;
							}
						}
					}
				}

				var11 = 0;
				if (ints_ac[1] > 0 || ints_ac[2] > 0) {
					var11 = (Rb[1] + Rb[2]) / (ints_ac[1] + ints_ac[2]);
				}

				var12 = 0;
				if (ints_ac[3] > 0 || ints_ac[4] > 0) {
					var12 = (Rb[3] + Rb[4]) / (ints_ac[3] + ints_ac[4]);
				}

				var13 = 0;
				if (ints_ac[6] > 0 || ints_ac[8] > 0) {
					var13 = (Rb[6] + Rb[8]) / (ints_ac[6] + ints_ac[8]);
				}

				var15 = 0;
				var16 = ints_ac[10];
				int[] var31 = ints_fc[10];
				int[] var32 = Pb;
				if (var15 == var16) {
					var15 = 0;
					var16 = ints_ac[11];
					var31 = ints_fc[11];
					var32 = ints_kc;
				}

				if (var15 < var16) {
					var14 = var32[var15];
				} else {
					var14 = -1000;
				}

				for (var19 = 0; var19 < 10; ++var19) {
					while (var19 == 0 && var14 > var11) {
						this.e(var31[var15++]);
						if (var15 == var16 && var31 != ints_fc[11]) {
							var15 = 0;
							var16 = ints_ac[11];
							var31 = ints_fc[11];
							var32 = ints_kc;
						}

						if (var15 < var16) {
							var14 = var32[var15];
						} else {
							var14 = -1000;
						}
					}

					while (var19 == 3 && var14 > var12) {
						this.e(var31[var15++]);
						if (var15 == var16 && var31 != ints_fc[11]) {
							var15 = 0;
							var16 = ints_ac[11];
							var31 = ints_fc[11];
							var32 = ints_kc;
						}

						if (var15 < var16) {
							var14 = var32[var15];
						} else {
							var14 = -1000;
						}
					}

					while (var19 == 5 && var14 > var13) {
						this.e(var31[var15++]);
						if (var15 == var16 && var31 != ints_fc[11]) {
							var15 = 0;
							var16 = ints_ac[11];
							var31 = ints_fc[11];
							var32 = ints_kc;
						}

						if (var15 < var16) {
							var14 = var32[var15];
						} else {
							var14 = -1000;
						}
					}

					var20 = ints_ac[var19];
					int[] var33 = ints_fc[var19];

					for (var22 = 0; var22 < var20; ++var22) {
						this.e(var33[var22]);
					}
				}

				while (var14 != -1000) {
					this.e(var31[var15++]);
					if (var15 == var16 && var31 != ints_fc[11]) {
						var15 = 0;
						var31 = ints_fc[11];
						var16 = ints_ac[11];
						var32 = ints_kc;
					}

					if (var15 < var16) {
						var14 = var32[var15];
					} else {
						var14 = -1000;
					}
				}

			}
		}
	}

	private final void e(int var1) {
		if (Vb[var1]) {
			this.f(var1);
		} else {
			int var2 = this.Db[var1];
			int var3 = this.Ib[var1];
			int var4 = this.Gb[var1];
			nc.Y = booleans_mc[var1];
			if (this.Bb == null) {
				nc.N = 0;
			} else {
				nc.N = this.Bb[var1] & 255;
			}

			if (this.zb != null && this.zb[var1] != -1) {
				int var5;
				int var6;
				int var7;
				if (this.Lb != null && this.Lb[var1] != -1) {
					int var8 = this.Lb[var1] & 255;
					var5 = this.xb[var8];
					var6 = this.Cb[var8];
					var7 = this.Fb[var8];
				} else {
					var5 = var2;
					var6 = var3;
					var7 = var4;
				}

				if (this.yb[var1] == -1) {
					nc.a(Xb[var2], Xb[var3], Xb[var4], ints_oc[var2], ints_oc[var3], ints_oc[var4], this.Eb[var1], this.Eb[var1], this.Eb[var1], ints_nc[var5], ints_nc[var6], ints_nc[var7], ints_cc[var5], ints_cc[var6], ints_cc[var7], Qb[var5], Qb[var6], Qb[var7], this.zb[var1]);
				} else {
					nc.a(Xb[var2], Xb[var3], Xb[var4], ints_oc[var2], ints_oc[var3], ints_oc[var4], this.Eb[var1], this.Jb[var1], this.yb[var1], ints_nc[var5], ints_nc[var6], ints_nc[var7], ints_cc[var5], ints_cc[var6], ints_cc[var7], Qb[var5], Qb[var6], Qb[var7], this.zb[var1]);
				}
			} else if (this.yb[var1] == -1) {
				nc.a(Xb[var2], Xb[var3], Xb[var4], ints_oc[var2], ints_oc[var3], ints_oc[var4], Tb[this.Eb[var1]]);
			} else {
				nc.a(Xb[var2], Xb[var3], Xb[var4], ints_oc[var2], ints_oc[var3], ints_oc[var4], this.Eb[var1], this.Jb[var1], this.yb[var1]);
			}
		}
	}

	final ue a(ue var1) {
		return new gf(new gf[]{this, (gf) var1}, 2);
	}

	final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		try {
			this.a();
			int var9 = nc.O;
			int var10 = nc.V;
			int var11 = ints_jc[var1];
			int var12 = ints_bc[var1];
			int var13 = ints_jc[var2];
			int var14 = ints_bc[var2];
			int var15 = ints_jc[var3];
			int var16 = ints_bc[var3];
			int var17 = ints_jc[var4];
			int var18 = ints_bc[var4];
			int var19 = var6 * var17 + var7 * var18 >> 16;

			for (int var20 = 0; var20 < super.int_mb; ++var20) {
				int var21 = super.ints_gb[var20];
				int var22 = super.ints_bb[var20];
				int var23 = super.ints_db[var20];
				int var24;
				if (var3 != 0) {
					var24 = var22 * var15 + var21 * var16 >> 16;
					var22 = var22 * var16 - var21 * var15 >> 16;
					var21 = var24;
				}

				if (var1 != 0) {
					var24 = var22 * var12 - var23 * var11 >> 16;
					var23 = var22 * var11 + var23 * var12 >> 16;
					var22 = var24;
				}

				if (var2 != 0) {
					var24 = var23 * var13 + var21 * var14 >> 16;
					var23 = var23 * var14 - var21 * var13 >> 16;
					var21 = var24;
				}

				var21 += var5;
				var22 += var6;
				var23 += var7;
				var24 = var22 * var18 - var23 * var17 >> 16;
				var23 = var22 * var17 + var23 * var18 >> 16;
				ints_lc[var20] = var23 - var19;
				ints_oc[var20] = var9 + (var21 << 9) / var8;
				Xb[var20] = var10 + (var24 << 9) / var8;
				if (this.Mb > 0) {
					ints_nc[var20] = var21;
					ints_cc[var20] = var24;
					Qb[var20] = var23;
				}
			}

			this.a(false, false, 0L, super.short_pb, super.short_pb << 1);
		} catch (RuntimeException var25) {
			;
		}
	}

	private final void f(int var1) {
		int var2 = nc.O;
		int var3 = nc.V;
		int var4 = 0;
		int var5 = this.Db[var1];
		int var6 = this.Ib[var1];
		int var7 = this.Gb[var1];
		int var8 = Qb[var5];
		int var9 = Qb[var6];
		int var10 = Qb[var7];
		if (this.Bb == null) {
			nc.N = 0;
		} else {
			nc.N = this.Bb[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			ints_ec[var4] = ints_oc[var5];
			ints_dc[var4] = Xb[var5];
			Sb[var4++] = this.Eb[var1];
		} else {
			var11 = ints_nc[var5];
			var12 = ints_cc[var5];
			var13 = this.Eb[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * Wb[var10 - var8];
				ints_ec[var4] = var2 + (var11 + ((ints_nc[var7] - var11) * var14 >> 16) << 9) / 50;
				ints_dc[var4] = var3 + (var12 + ((ints_cc[var7] - var12) * var14 >> 16) << 9) / 50;
				Sb[var4++] = var13 + ((this.yb[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * Wb[var9 - var8];
				ints_ec[var4] = var2 + (var11 + ((ints_nc[var6] - var11) * var14 >> 16) << 9) / 50;
				ints_dc[var4] = var3 + (var12 + ((ints_cc[var6] - var12) * var14 >> 16) << 9) / 50;
				Sb[var4++] = var13 + ((this.Jb[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			ints_ec[var4] = ints_oc[var6];
			ints_dc[var4] = Xb[var6];
			Sb[var4++] = this.Jb[var1];
		} else {
			var11 = ints_nc[var6];
			var12 = ints_cc[var6];
			var13 = this.Jb[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * Wb[var8 - var9];
				ints_ec[var4] = var2 + (var11 + ((ints_nc[var5] - var11) * var14 >> 16) << 9) / 50;
				ints_dc[var4] = var3 + (var12 + ((ints_cc[var5] - var12) * var14 >> 16) << 9) / 50;
				Sb[var4++] = var13 + ((this.Eb[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * Wb[var10 - var9];
				ints_ec[var4] = var2 + (var11 + ((ints_nc[var7] - var11) * var14 >> 16) << 9) / 50;
				ints_dc[var4] = var3 + (var12 + ((ints_cc[var7] - var12) * var14 >> 16) << 9) / 50;
				Sb[var4++] = var13 + ((this.yb[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			ints_ec[var4] = ints_oc[var7];
			ints_dc[var4] = Xb[var7];
			Sb[var4++] = this.yb[var1];
		} else {
			var11 = ints_nc[var7];
			var12 = ints_cc[var7];
			var13 = this.yb[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * Wb[var9 - var10];
				ints_ec[var4] = var2 + (var11 + ((ints_nc[var6] - var11) * var14 >> 16) << 9) / 50;
				ints_dc[var4] = var3 + (var12 + ((ints_cc[var6] - var12) * var14 >> 16) << 9) / 50;
				Sb[var4++] = var13 + ((this.Jb[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * Wb[var8 - var10];
				ints_ec[var4] = var2 + (var11 + ((ints_nc[var5] - var11) * var14 >> 16) << 9) / 50;
				ints_dc[var4] = var3 + (var12 + ((ints_cc[var5] - var12) * var14 >> 16) << 9) / 50;
				Sb[var4++] = var13 + ((this.Eb[var1] - var13) * var14 >> 16);
			}
		}

		var11 = ints_ec[0];
		var12 = ints_ec[1];
		var13 = ints_ec[2];
		var14 = ints_dc[0];
		int var15 = ints_dc[1];
		int var16 = ints_dc[2];
		nc.Y = false;
		int var17;
		int var18;
		int var19;
		int var20;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > nc.int_gb || var12 > nc.int_gb || var13 > nc.int_gb) {
				nc.Y = true;
			}

			if (this.zb != null && this.zb[var1] != -1) {
				if (this.Lb != null && this.Lb[var1] != -1) {
					var20 = this.Lb[var1] & 255;
					var17 = this.xb[var20];
					var18 = this.Cb[var20];
					var19 = this.Fb[var20];
				} else {
					var17 = var5;
					var18 = var6;
					var19 = var7;
				}

				if (this.yb[var1] == -1) {
					nc.a(var14, var15, var16, var11, var12, var13, this.Eb[var1], this.Eb[var1], this.Eb[var1], ints_nc[var17], ints_nc[var18], ints_nc[var19], ints_cc[var17], ints_cc[var18], ints_cc[var19], Qb[var17], Qb[var18], Qb[var19], this.zb[var1]);
				} else {
					nc.a(var14, var15, var16, var11, var12, var13, Sb[0], Sb[1], Sb[2], ints_nc[var17], ints_nc[var18], ints_nc[var19], ints_cc[var17], ints_cc[var18], ints_cc[var19], Qb[var17], Qb[var18], Qb[var19], this.zb[var1]);
				}
			} else if (this.yb[var1] == -1) {
				nc.a(var14, var15, var16, var11, var12, var13, Tb[this.Eb[var1]]);
			} else {
				nc.a(var14, var15, var16, var11, var12, var13, Sb[0], Sb[1], Sb[2]);
			}
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > nc.int_gb || var12 > nc.int_gb || var13 > nc.int_gb || ints_ec[3] < 0 || ints_ec[3] > nc.int_gb) {
				nc.Y = true;
			}

			if (this.zb == null || this.zb[var1] == -1) {
				if (this.yb[var1] == -1) {
					var17 = Tb[this.Eb[var1]];
					nc.a(var14, var15, var16, var11, var12, var13, var17);
					nc.a(var14, var16, ints_dc[3], var11, var13, ints_ec[3], var17);
					return;
				}

				nc.a(var14, var15, var16, var11, var12, var13, Sb[0], Sb[1], Sb[2]);
				nc.a(var14, var16, ints_dc[3], var11, var13, ints_ec[3], Sb[0], Sb[2], Sb[3]);
				return;
			}

			if (this.Lb != null && this.Lb[var1] != -1) {
				var20 = this.Lb[var1] & 255;
				var17 = this.xb[var20];
				var18 = this.Cb[var20];
				var19 = this.Fb[var20];
			} else {
				var17 = var5;
				var18 = var6;
				var19 = var7;
			}

			short var21 = this.zb[var1];
			if (this.yb[var1] == -1) {
				nc.a(var14, var15, var16, var11, var12, var13, this.Eb[var1], this.Eb[var1], this.Eb[var1], ints_nc[var17], ints_nc[var18], ints_nc[var19], ints_cc[var17], ints_cc[var18], ints_cc[var19], Qb[var17], Qb[var18], Qb[var19], var21);
				nc.a(var14, var16, ints_dc[3], var11, var13, ints_ec[3], this.Eb[var1], this.Eb[var1], this.Eb[var1], ints_nc[var17], ints_nc[var18], ints_nc[var19], ints_cc[var17], ints_cc[var18], ints_cc[var19], Qb[var17], Qb[var18], Qb[var19], var21);
				return;
			}

			nc.a(var14, var15, var16, var11, var12, var13, Sb[0], Sb[1], Sb[2], ints_nc[var17], ints_nc[var18], ints_nc[var19], ints_cc[var17], ints_cc[var18], ints_cc[var19], Qb[var17], Qb[var18], Qb[var19], var21);
			nc.a(var14, var16, ints_dc[3], var11, var13, ints_ec[3], Sb[0], Sb[2], Sb[3], ints_nc[var17], ints_nc[var18], ints_nc[var19], ints_cc[var17], ints_cc[var18], ints_cc[var19], Qb[var17], Qb[var18], Qb[var19], var21);
		}

	}

	final ue a(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.a();
		int var7 = var2 + super.short_tb;
		int var8 = var2 + super.short_cb;
		int var9 = var4 + super.short_jb;
		int var10 = var4 + super.short_ib;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				gf var11;
				if (var5) {
					var11 = new gf();
					var11.int_mb = super.int_mb;
					var11.int_kb = super.int_kb;
					var11.Mb = this.Mb;
					var11.ints_gb = super.ints_gb;
					var11.ints_db = super.ints_db;
					var11.Db = this.Db;
					var11.Ib = this.Ib;
					var11.Gb = this.Gb;
					var11.Eb = this.Eb;
					var11.Jb = this.Jb;
					var11.yb = this.yb;
					var11.Hb = this.Hb;
					var11.Bb = this.Bb;
					var11.Lb = this.Lb;
					var11.zb = this.zb;
					var11.Kb = this.Kb;
					var11.xb = this.xb;
					var11.Cb = this.Cb;
					var11.Fb = this.Fb;
					var11.ints_eb = super.ints_eb;
					var11.ints_lb = super.ints_lb;
					var11.boolean_hb = super.boolean_hb;
					var11.ints_bb = new int[var11.int_mb];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.int_mb; ++var12) {
						var13 = super.ints_gb[var12] + var2;
						var14 = super.ints_db[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.ints_bb[var12] = super.ints_bb[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.int_mb; ++var12) {
						var13 = (super.ints_bb[var12] << 16) / super.T;
						if (var13 < var6) {
							var14 = super.ints_gb[var12] + var2;
							var15 = super.ints_db[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.ints_bb[var12] = super.ints_bb[var12] + (var22 - var3) * (var6 - var13) / var6;
						} else {
							var11.ints_bb[var12] = super.ints_bb[var12];
						}
					}
				}

				super.boolean_qb = false;
				return var11;
			}
		} else {
			return this;
		}
	}

	private final gf a(boolean var1, gf var2, byte[] var3) {
		var2.int_mb = super.int_mb;
		var2.int_kb = super.int_kb;
		var2.Mb = this.Mb;
		if (var2.ints_gb == null || var2.ints_gb.length < super.int_mb) {
			var2.ints_gb = new int[super.int_mb + 100];
			var2.ints_bb = new int[super.int_mb + 100];
			var2.ints_db = new int[super.int_mb + 100];
		}

		for (int var4 = 0; var4 < super.int_mb; ++var4) {
			var2.ints_gb[var4] = super.ints_gb[var4];
			var2.ints_bb[var4] = super.ints_bb[var4];
			var2.ints_db[var4] = super.ints_db[var4];
		}

		if (var1) {
			var2.Bb = this.Bb;
		} else {
			var2.Bb = var3;
			int var5;
			if (this.Bb == null) {
				for (var5 = 0; var5 < super.int_kb; ++var5) {
					var2.Bb[var5] = 0;
				}
			} else {
				for (var5 = 0; var5 < super.int_kb; ++var5) {
					var2.Bb[var5] = this.Bb[var5];
				}
			}
		}

		var2.Db = this.Db;
		var2.Ib = this.Ib;
		var2.Gb = this.Gb;
		var2.Eb = this.Eb;
		var2.Jb = this.Jb;
		var2.yb = this.yb;
		var2.Hb = this.Hb;
		var2.Lb = this.Lb;
		var2.zb = this.zb;
		var2.Kb = this.Kb;
		var2.xb = this.xb;
		var2.Cb = this.Cb;
		var2.Fb = this.Fb;
		var2.ints_eb = super.ints_eb;
		var2.ints_lb = super.ints_lb;
		var2.boolean_hb = super.boolean_hb;
		var2.boolean_qb = false;
		return var2;
	}

	private static final int g(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}

	final ue c(boolean var1) {
		if (!var1 && Nb.length < super.int_kb) {
			Nb = new byte[super.int_kb + 100];
		}

		return this.a(var1, Ab, Nb);
	}

	final ue d(boolean var1) {
		if (!var1 && bytes_gc.length < super.int_kb) {
			bytes_gc = new byte[super.int_kb + 100];
		}

		return this.a(var1, Ob, bytes_gc);
	}

	public gf() {
	}

	gf(oe var1, int var2, int var3, int var4, int var5, int var6) {
		var1.j();
		var1.h();
		super.int_mb = var1.Gb;
		super.ints_gb = var1.Cb;
		super.ints_bb = var1.ints_ab;
		super.ints_db = var1.ints_fb;
		super.int_kb = var1.int_sb;
		this.Db = var1.ints_cb;
		this.Ib = var1.ints_tb;
		this.Gb = var1.ints_hb;
		this.Hb = var1.bytes_nb;
		this.Bb = var1.Qb;
		this.Kb = var1.byte_bb;
		super.ints_eb = var1.ints_qb;
		super.ints_lb = var1.Vb;
		int var7 = (int) Math.sqrt((double) (var4 * var4 + var5 * var5 + var6 * var6));
		int var8 = var3 * var7 >> 8;
		this.Eb = new int[super.int_kb];
		this.Jb = new int[super.int_kb];
		this.yb = new int[super.int_kb];
		int var9;
		if (var1.shorts_ob != null) {
			this.zb = new short[super.int_kb];

			for (var9 = 0; var9 < super.int_kb; ++var9) {
				short var10 = var1.shorts_ob[var9];
				if (var10 != -1 && nc.Z.d(87, var10)) {
					this.zb[var9] = var10;
				} else {
					this.zb[var9] = -1;
				}
			}
		} else {
			this.zb = null;
		}

		int var14;
		if (var1.int_lb > 0 && var1.bytes_ib != null) {
			int[] var16 = new int[var1.int_lb];

			for (int var17 = 0; var17 < super.int_kb; ++var17) {
				if (var1.bytes_ib[var17] != -1) {
					++var16[var1.bytes_ib[var17] & 255];
				}
			}

			this.Mb = 0;

			for (int var11 = 0; var11 < var1.int_lb; ++var11) {
				if (var16[var11] > 0 && var1.Tb[var11] == 0) {
					++this.Mb;
				}
			}

			this.xb = new int[this.Mb];
			this.Cb = new int[this.Mb];
			this.Fb = new int[this.Mb];
			int var12 = 0;

			for (int var13 = 0; var13 < var1.int_lb; ++var13) {
				if (var16[var13] > 0 && var1.Tb[var13] == 0) {
					this.xb[var12] = var1.Mb[var13] & '\uffff';
					this.Cb[var12] = var1.Rb[var13] & '\uffff';
					this.Fb[var12] = var1.shorts_gb[var13] & '\uffff';
					var16[var13] = var12++;
				} else {
					var16[var13] = -1;
				}
			}

			this.Lb = new byte[super.int_kb];

			for (var14 = 0; var14 < super.int_kb; ++var14) {
				if (var1.bytes_ib[var14] != -1) {
					this.Lb[var14] = (byte) var16[var1.bytes_ib[var14] & 255];
					if (this.Lb[var14] == -1 && this.zb != null) {
						this.zb[var14] = -1;
					}
				} else {
					this.Lb[var14] = -1;
				}
			}
		}

		for (var9 = 0; var9 < super.int_kb; ++var9) {
			byte var18;
			if (var1.yb == null) {
				var18 = 0;
			} else {
				var18 = var1.yb[var9];
			}

			byte var19;
			if (var1.Qb == null) {
				var19 = 0;
			} else {
				var19 = var1.Qb[var9];
			}

			short var20;
			if (this.zb == null) {
				var20 = -1;
			} else {
				var20 = this.zb[var9];
			}

			if (var19 == -2) {
				var18 = 3;
			}

			if (var19 == -1) {
				var18 = 2;
			}

			hg var21;
			ca var22;
			if (var20 == -1) {
				if (var18 == 0) {
					int var15 = var1.Sb[var9] & '\uffff';
					if (var1.hgs_mb != null && var1.hgs_mb[this.Db[var9]] != null) {
						var21 = var1.hgs_mb[this.Db[var9]];
					} else {
						var21 = var1.zb[this.Db[var9]];
					}

					var14 = var2 + (var4 * var21.int_f + var5 * var21.int_d + var6 * var21.int_i) / (var8 * var21.int_b);
					this.Eb[var9] = a(var15, var14);
					if (var1.hgs_mb != null && var1.hgs_mb[this.Ib[var9]] != null) {
						var21 = var1.hgs_mb[this.Ib[var9]];
					} else {
						var21 = var1.zb[this.Ib[var9]];
					}

					var14 = var2 + (var4 * var21.int_f + var5 * var21.int_d + var6 * var21.int_i) / (var8 * var21.int_b);
					this.Jb[var9] = a(var15, var14);
					if (var1.hgs_mb != null && var1.hgs_mb[this.Gb[var9]] != null) {
						var21 = var1.hgs_mb[this.Gb[var9]];
					} else {
						var21 = var1.zb[this.Gb[var9]];
					}

					var14 = var2 + (var4 * var21.int_f + var5 * var21.int_d + var6 * var21.int_i) / (var8 * var21.int_b);
					this.yb[var9] = a(var15, var14);
				} else if (var18 == 1) {
					var22 = var1.cas_vb[var9];
					var14 = var2 + (var4 * var22.int_k + var5 * var22.int_f + var6 * var22.int_e) / (var8 + var8 / 2);
					this.Eb[var9] = a(var1.Sb[var9] & '\uffff', var14);
					this.yb[var9] = -1;
				} else if (var18 == 3) {
					this.Eb[var9] = 128;
					this.yb[var9] = -1;
				} else {
					this.yb[var9] = -2;
				}
			} else if (var18 == 0) {
				if (var1.hgs_mb != null && var1.hgs_mb[this.Db[var9]] != null) {
					var21 = var1.hgs_mb[this.Db[var9]];
				} else {
					var21 = var1.zb[this.Db[var9]];
				}

				var14 = var2 + (var4 * var21.int_f + var5 * var21.int_d + var6 * var21.int_i) / (var8 * var21.int_b);
				this.Eb[var9] = g(var14);
				if (var1.hgs_mb != null && var1.hgs_mb[this.Ib[var9]] != null) {
					var21 = var1.hgs_mb[this.Ib[var9]];
				} else {
					var21 = var1.zb[this.Ib[var9]];
				}

				var14 = var2 + (var4 * var21.int_f + var5 * var21.int_d + var6 * var21.int_i) / (var8 * var21.int_b);
				this.Jb[var9] = g(var14);
				if (var1.hgs_mb != null && var1.hgs_mb[this.Gb[var9]] != null) {
					var21 = var1.hgs_mb[this.Gb[var9]];
				} else {
					var21 = var1.zb[this.Gb[var9]];
				}

				var14 = var2 + (var4 * var21.int_f + var5 * var21.int_d + var6 * var21.int_i) / (var8 * var21.int_b);
				this.yb[var9] = g(var14);
			} else if (var18 == 1) {
				var22 = var1.cas_vb[var9];
				var14 = var2 + (var4 * var22.int_k + var5 * var22.int_f + var6 * var22.int_e) / (var8 + var8 / 2);
				this.Eb[var9] = g(var14);
				this.yb[var9] = -1;
			} else {
				this.yb[var9] = -2;
			}
		}

	}

	private gf(gf[] var1, int var2) {
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		super.int_mb = 0;
		super.int_kb = 0;
		this.Mb = 0;
		this.Kb = -1;

		for (int var7 = 0; var7 < var2; ++var7) {
			gf var8 = var1[var7];
			if (var8 != null) {
				super.int_mb += var8.int_mb;
				super.int_kb += var8.int_kb;
				this.Mb += var8.Mb;
				if (var8.Hb != null) {
					var3 = true;
				} else {
					if (this.Kb == -1) {
						this.Kb = var8.Kb;
					}

					if (this.Kb != var8.Kb) {
						var3 = true;
					}
				}

				var4 |= var8.Bb != null;
				var5 |= var8.zb != null;
				var6 |= var8.Lb != null;
			}
		}

		super.ints_gb = new int[super.int_mb];
		super.ints_bb = new int[super.int_mb];
		super.ints_db = new int[super.int_mb];
		this.Db = new int[super.int_kb];
		this.Ib = new int[super.int_kb];
		this.Gb = new int[super.int_kb];
		this.Eb = new int[super.int_kb];
		this.Jb = new int[super.int_kb];
		this.yb = new int[super.int_kb];
		if (var3) {
			this.Hb = new byte[super.int_kb];
		}

		if (var4) {
			this.Bb = new byte[super.int_kb];
		}

		if (var5) {
			this.zb = new short[super.int_kb];
		}

		if (var6) {
			this.Lb = new byte[super.int_kb];
		}

		if (this.Mb > 0) {
			this.xb = new int[this.Mb];
			this.Cb = new int[this.Mb];
			this.Fb = new int[this.Mb];
		}

		super.int_mb = 0;
		super.int_kb = 0;
		this.Mb = 0;

		for (int var13 = 0; var13 < var2; ++var13) {
			gf var9 = var1[var13];
			if (var9 != null) {
				for (int var10 = 0; var10 < var9.int_kb; ++var10) {
					this.Db[super.int_kb] = var9.Db[var10] + super.int_mb;
					this.Ib[super.int_kb] = var9.Ib[var10] + super.int_mb;
					this.Gb[super.int_kb] = var9.Gb[var10] + super.int_mb;
					this.Eb[super.int_kb] = var9.Eb[var10];
					this.Jb[super.int_kb] = var9.Jb[var10];
					this.yb[super.int_kb] = var9.yb[var10];
					if (var3) {
						if (var9.Hb != null) {
							this.Hb[super.int_kb] = var9.Hb[var10];
						} else {
							this.Hb[super.int_kb] = var9.Kb;
						}
					}

					if (var4 && var9.Bb != null) {
						this.Bb[super.int_kb] = var9.Bb[var10];
					}

					if (var5) {
						if (var9.zb != null) {
							this.zb[super.int_kb] = var9.zb[var10];
						} else {
							this.zb[super.int_kb] = -1;
						}
					}

					if (var6) {
						if (var9.Lb != null && var9.Lb[var10] != -1) {
							this.Lb[super.int_kb] = (byte) (var9.Lb[var10] + this.Mb);
						} else {
							this.Lb[super.int_kb] = -1;
						}
					}

					++super.int_kb;
				}

				for (int var11 = 0; var11 < var9.Mb; ++var11) {
					this.xb[this.Mb] = var9.xb[var11] + super.int_mb;
					this.Cb[this.Mb] = var9.Cb[var11] + super.int_mb;
					this.Fb[this.Mb] = var9.Fb[var11] + super.int_mb;
					++this.Mb;
				}

				for (int var12 = 0; var12 < var9.int_mb; ++var12) {
					super.ints_gb[super.int_mb] = var9.ints_gb[var12];
					super.ints_bb[super.int_mb] = var9.ints_bb[var12];
					super.ints_db[super.int_mb] = var9.ints_db[var12];
					++super.int_mb;
				}
			}
		}

	}

	static {
		Wb = nc.ints_cb;
		Tb = nc.U;
		Vb = new boolean[4096];
		ints_ac = new int[12];
		Yb = new int[1600];
		ints_hc = new int[1600][512];
		ints_bc = nc.ints_bb;
		ints_cc = new int[4096];
		ints_dc = new int[10];
		bytes_gc = new byte[1];
		ints_fc = new int[12][2000];
		ints_kc = new int[2000];
		ints_jc = nc.X;
		ints_nc = new int[4096];
		ints_ec = new int[10];
		ints_lc = new int[4096];
		booleans_mc = new boolean[4096];
		ints_oc = new int[4096];
	}
}
