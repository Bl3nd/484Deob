final class nc extends b {

	static int N = 0;
	static int O;
	private static boolean P = false;
	private static boolean Q = false;
	static boolean R = true;
	private static int[] S = new int[1024];
	static int T;
	static int[] U = new int[65536];
	static int V;
	static int[] X = new int[2048];
	static boolean Y = false;
	static aa Z;
	static int int_ab;
	static int[] ints_bb = new int[2048];
	static int[] ints_cb = new int[2048];
	private static int int_db;
	static int int_eb;
	private static int[] ints_fb = new int[512];
	static int int_gb;
	static int int_hb;
	private static float float_ib = 1.0F;

	static final void d() {
		e(b.I, b.H, b.K, b.L);
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Z.a(var18, float_ib, (byte) 120);
		int var20;
		if (var19 == null) {
			var20 = Z.a(var18, false);
			a(var0, var1, var2, var3, var4, var5, a(var20, var6), a(var20, var7), a(var20, var8));
		} else {
			P = Z.a(var18, -114);
			Q = Z.c(var18, 25080);
			var20 = var4 - var3;
			int var21 = var1 - var0;
			int var22 = var5 - var3;
			int var23 = var2 - var0;
			int var24 = var7 - var6;
			int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0) {
				var26 = (var4 - var3 << 16) / (var1 - var0);
			}

			int var27 = 0;
			if (var2 != var1) {
				var27 = (var5 - var4 << 16) / (var2 - var1);
			}

			int var28 = 0;
			if (var2 != var0) {
				var28 = (var3 - var5 << 16) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21;
			if (var29 != 0) {
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = var11 * var12 - var14 * var9 << 14;
				int var33 = var14 * var15 - var17 * var12 << 8;
				int var34 = var17 * var9 - var11 * var15 << 5;
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = var13 * var15 - var16 * var12 << 8;
				int var37 = var16 * var9 - var10 * var15 << 5;
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = var16 * var14 - var13 * var17 << 8;
				int var40 = var10 * var17 - var16 * var11 << 5;
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < int_db) {
						if (var1 > int_db) {
							var1 = int_db;
						}

						if (var2 > int_db) {
							var2 = int_db;
						}

						var6 = (var6 << 9) - var30 * var3 + var30;
						if (var1 < var2) {
							var5 = var3 <<= 16;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 16;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var41 = var0 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) {
								var2 -= var1;
								var1 -= var0;
								var0 = S[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = S[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 16;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var41 = var0 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = S[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = S[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < int_db) {
						if (var2 > int_db) {
							var2 = int_db;
						}

						if (var0 > int_db) {
							var0 = int_db;
						}

						var7 = (var7 << 9) - var30 * var4 + var30;
						if (var2 < var0) {
							var3 = var4 <<= 16;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var1 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var1 == var2 || var26 >= var27) && (var1 != var2 || var26 <= var28)) {
								var0 -= var2;
								var2 -= var1;
								var1 = S[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = S[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 16;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var3 <<= 16;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var41 = var1 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = S[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = S[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											a(b.M, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									a(b.M, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < int_db) {
					if (var0 > int_db) {
						var0 = int_db;
					}

					if (var1 > int_db) {
						var1 = int_db;
					}

					var8 = (var8 << 9) - var30 * var5 + var30;
					if (var0 < var1) {
						var4 = var5 <<= 16;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var41 = var2 - V;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = S[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										a(b.M, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								a(b.M, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = S[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										a(b.M, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								a(b.M, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 16;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var41 = var2 - V;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = S[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										a(b.M, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								a(b.M, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = S[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										a(b.M, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								a(b.M, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3;
		int var10 = var1 - var0;
		int var11 = var5 - var3;
		int var12 = var2 - var0;
		int var13 = var7 - var6;
		int var14 = var8 - var6;
		int var15;
		if (var2 != var1) {
			var15 = (var5 - var4 << 16) / (var2 - var1);
		} else {
			var15 = 0;
		}

		int var16;
		if (var1 != var0) {
			var16 = (var9 << 16) / var10;
		} else {
			var16 = 0;
		}

		int var17;
		if (var2 != var0) {
			var17 = (var11 << 16) / var12;
		} else {
			var17 = 0;
		}

		int var18 = var9 * var12 - var11 * var10;
		if (var18 != 0) {
			int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
			int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < int_db) {
					if (var1 > int_db) {
						var1 = int_db;
					}

					if (var2 > int_db) {
						var2 = int_db;
					}

					var6 = (var6 << 8) - var19 * var3 + var19;
					if (var1 < var2) {
						var5 = var3 <<= 16;
						if (var0 < 0) {
							var5 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var15 * var1;
							var1 = 0;
						}

						if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) {
							var2 -= var1;
							var1 -= var0;
							var0 = S[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(b.M, var0, 0, 0, var4 >> 16, var5 >> 16, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += b.J;
									}
								}

								a(b.M, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += b.J;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = S[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(b.M, var0, 0, 0, var5 >> 16, var4 >> 16, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += b.J;
									}
								}

								a(b.M, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += b.J;
							}
						}
					} else {
						var4 = var3 <<= 16;
						if (var0 < 0) {
							var4 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var5 <<= 16;
						if (var2 < 0) {
							var5 -= var15 * var2;
							var2 = 0;
						}

						if ((var0 == var2 || var17 >= var16) && (var0 != var2 || var15 <= var16)) {
							var1 -= var2;
							var2 -= var0;
							var0 = S[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										a(b.M, var0, 0, 0, var3 >> 16, var5 >> 16, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += b.J;
									}
								}

								a(b.M, var0, 0, 0, var3 >> 16, var4 >> 16, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += b.J;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = S[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										a(b.M, var0, 0, 0, var5 >> 16, var3 >> 16, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += b.J;
									}
								}

								a(b.M, var0, 0, 0, var4 >> 16, var3 >> 16, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += b.J;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < int_db) {
					if (var2 > int_db) {
						var2 = int_db;
					}

					if (var0 > int_db) {
						var0 = int_db;
					}

					var7 = (var7 << 8) - var19 * var4 + var19;
					if (var2 < var0) {
						var3 = var4 <<= 16;
						if (var1 < 0) {
							var3 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var5 <<= 16;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if ((var1 == var2 || var16 >= var15) && (var1 != var2 || var16 <= var17)) {
							var0 -= var2;
							var2 -= var1;
							var1 = S[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										a(b.M, var1, 0, 0, var5 >> 16, var3 >> 16, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += b.J;
									}
								}

								a(b.M, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += b.J;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = S[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										a(b.M, var1, 0, 0, var3 >> 16, var5 >> 16, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += b.J;
									}
								}

								a(b.M, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += b.J;
							}
						}
					} else {
						var5 = var4 <<= 16;
						if (var1 < 0) {
							var5 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var17 * var0;
							var0 = 0;
						}

						if (var16 < var15) {
							var2 -= var0;
							var0 -= var1;
							var1 = S[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(b.M, var1, 0, 0, var3 >> 16, var4 >> 16, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += b.J;
									}
								}

								a(b.M, var1, 0, 0, var5 >> 16, var4 >> 16, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += b.J;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = S[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										a(b.M, var1, 0, 0, var4 >> 16, var3 >> 16, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += b.J;
									}
								}

								a(b.M, var1, 0, 0, var4 >> 16, var5 >> 16, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += b.J;
							}
						}
					}
				}
			} else if (var2 < int_db) {
				if (var0 > int_db) {
					var0 = int_db;
				}

				if (var1 > int_db) {
					var1 = int_db;
				}

				var8 = (var8 << 8) - var19 * var5 + var19;
				if (var0 < var1) {
					var4 = var5 <<= 16;
					if (var2 < 0) {
						var4 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var16 * var0;
						var0 = 0;
					}

					if (var15 < var17) {
						var1 -= var0;
						var0 -= var2;
						var2 = S[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(b.M, var2, 0, 0, var4 >> 16, var3 >> 16, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += b.J;
								}
							}

							a(b.M, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += b.J;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = S[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(b.M, var2, 0, 0, var3 >> 16, var4 >> 16, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += b.J;
								}
							}

							a(b.M, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += b.J;
						}
					}
				} else {
					var3 = var5 <<= 16;
					if (var2 < 0) {
						var3 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var16 * var1;
						var1 = 0;
					}

					if (var15 < var17) {
						var0 -= var1;
						var1 -= var2;
						var2 = S[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(b.M, var2, 0, 0, var4 >> 16, var5 >> 16, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += b.J;
								}
							}

							a(b.M, var2, 0, 0, var3 >> 16, var5 >> 16, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += b.J;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = S[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(b.M, var2, 0, 0, var5 >> 16, var4 >> 16, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += b.J;
								}
							}

							a(b.M, var2, 0, 0, var5 >> 16, var3 >> 16, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += b.J;
						}
					}
				}
			}
		}
	}

	private static final void e(int var0, int var1, int var2, int var3) {
		int_gb = var2 - var0;
		int_db = var3 - var1;
		e();
		if (S.length < int_db) {
			S = new int[nd.a(true, int_db)];
		}

		int var4 = var1 * b.J + var0;

		for (int var5 = 0; var5 < int_db; ++var5) {
			S[var5] = var4;
			var4 += b.J;
		}

	}

	private static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (Y) {
			if (var5 > int_gb) {
				var5 = int_gb;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (N == 0) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			} else if (N == 254) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var0[var1];
						}
					}

					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
					var0[var1++] = var0[var1];
				}
			} else {
				int var6 = N;
				int var7 = 256 - N;
				var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & '\uff00') * var7 >> 8 & '\uff00');

				while (true) {
					--var3;
					int var8;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var8 = var0[var1];
							var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
						}
					}

					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
					var8 = var0[var1];
					var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & '\uff00') * var6 >> 8 & '\uff00');
				}
			}
		}
	}

	private static final void a(float var0, int var1, int var2) {
		var0 = (float) ((double) var0 + (Math.random() * 0.03D - 0.015D));
		int var3 = var1 * 128;

		for (int var4 = var1; var4 < var2; ++var4) {
			double var5 = (double) (var4 >> 3) / 64.0D + 0.0078125D;
			double var7 = (double) (var4 & 7) / 8.0D + 0.0625D;

			for (int var9 = 0; var9 < 128; ++var9) {
				double var10 = (double) var9 / 128.0D;
				double var12 = var10;
				double var14 = var10;
				double var16 = var10;
				if (var7 != 0.0D) {
					double var18;
					if (var10 < 0.5D) {
						var18 = var10 * (1.0D + var7);
					} else {
						var18 = var10 + var7 - var10 * var7;
					}

					double var20 = 2.0D * var10 - var18;
					double var22 = var5 + 0.3333333333333333D;
					if (var22 > 1.0D) {
						--var22;
					}

					double var26 = var5 - 0.3333333333333333D;
					if (var26 < 0.0D) {
						++var26;
					}

					if (6.0D * var22 < 1.0D) {
						var12 = var20 + (var18 - var20) * 6.0D * var22;
					} else if (2.0D * var22 < 1.0D) {
						var12 = var18;
					} else if (3.0D * var22 < 2.0D) {
						var12 = var20 + (var18 - var20) * (0.6666666666666666D - var22) * 6.0D;
					} else {
						var12 = var20;
					}

					if (6.0D * var5 < 1.0D) {
						var14 = var20 + (var18 - var20) * 6.0D * var5;
					} else if (2.0D * var5 < 1.0D) {
						var14 = var18;
					} else if (3.0D * var5 < 2.0D) {
						var14 = var20 + (var18 - var20) * (0.6666666666666666D - var5) * 6.0D;
					} else {
						var14 = var20;
					}

					if (6.0D * var26 < 1.0D) {
						var16 = var20 + (var18 - var20) * 6.0D * var26;
					} else if (2.0D * var26 < 1.0D) {
						var16 = var18;
					} else if (3.0D * var26 < 2.0D) {
						var16 = var20 + (var18 - var20) * (0.6666666666666666D - var26) * 6.0D;
					} else {
						var16 = var20;
					}
				}

				var12 = Math.pow(var12, (double) var0);
				var14 = Math.pow(var14, (double) var0);
				var16 = Math.pow(var16, (double) var0);
				int var28 = (int) (var12 * 256.0D);
				int var19 = (int) (var14 * 256.0D);
				int var29 = (int) (var16 * 256.0D);
				int var21 = (var28 << 16) + (var19 << 8) + var29;
				if (var21 == 0) {
					var21 = 1;
				}

				U[var3++] = var21;
			}
		}

	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 16) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 16) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 16) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < int_db) {
				if (var1 > int_db) {
					var1 = int_db;
				}

				if (var2 > int_db) {
					var2 = int_db;
				}

				if (var1 < var2) {
					var5 = var3 <<= 16;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
						var2 -= var1;
						var1 -= var0;
						var0 = S[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(b.M, var0, var6, 0, var4 >> 16, var5 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += b.J;
								}
							}

							a(b.M, var0, var6, 0, var3 >> 16, var5 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += b.J;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = S[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(b.M, var0, var6, 0, var5 >> 16, var4 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += b.J;
								}
							}

							a(b.M, var0, var6, 0, var5 >> 16, var3 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += b.J;
						}
					}
				} else {
					var4 = var3 <<= 16;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
						var1 -= var2;
						var2 -= var0;
						var0 = S[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(b.M, var0, var6, 0, var3 >> 16, var5 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += b.J;
								}
							}

							a(b.M, var0, var6, 0, var3 >> 16, var4 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += b.J;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = S[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									a(b.M, var0, var6, 0, var5 >> 16, var3 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += b.J;
								}
							}

							a(b.M, var0, var6, 0, var4 >> 16, var3 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += b.J;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < int_db) {
				if (var2 > int_db) {
					var2 = int_db;
				}

				if (var0 > int_db) {
					var0 = int_db;
				}

				if (var2 < var0) {
					var3 = var4 <<= 16;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
						var0 -= var2;
						var2 -= var1;
						var1 = S[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(b.M, var1, var6, 0, var5 >> 16, var3 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += b.J;
								}
							}

							a(b.M, var1, var6, 0, var4 >> 16, var3 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += b.J;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = S[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									a(b.M, var1, var6, 0, var3 >> 16, var5 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += b.J;
								}
							}

							a(b.M, var1, var6, 0, var3 >> 16, var4 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += b.J;
						}
					}
				} else {
					var5 = var4 <<= 16;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = S[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(b.M, var1, var6, 0, var3 >> 16, var4 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += b.J;
								}
							}

							a(b.M, var1, var6, 0, var5 >> 16, var4 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += b.J;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = S[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									a(b.M, var1, var6, 0, var4 >> 16, var3 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += b.J;
								}
							}

							a(b.M, var1, var6, 0, var4 >> 16, var5 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += b.J;
						}
					}
				}
			}
		} else if (var2 < int_db) {
			if (var0 > int_db) {
				var0 = int_db;
			}

			if (var1 > int_db) {
				var1 = int_db;
			}

			if (var0 < var1) {
				var4 = var5 <<= 16;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = S[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								a(b.M, var2, var6, 0, var4 >> 16, var3 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += b.J;
							}
						}

						a(b.M, var2, var6, 0, var4 >> 16, var5 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += b.J;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = S[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								a(b.M, var2, var6, 0, var3 >> 16, var4 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += b.J;
							}
						}

						a(b.M, var2, var6, 0, var5 >> 16, var4 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += b.J;
					}
				}
			} else {
				var3 = var5 <<= 16;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = S[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								a(b.M, var2, var6, 0, var4 >> 16, var5 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += b.J;
							}
						}

						a(b.M, var2, var6, 0, var3 >> 16, var5 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += b.J;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = S[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								a(b.M, var2, var6, 0, var5 >> 16, var4 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += b.J;
							}
						}

						a(b.M, var2, var6, 0, var5 >> 16, var3 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += b.J;
					}
				}
			}
		}
	}

	private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (Y) {
			if (var6 > int_gb) {
				var6 = int_gb;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (P) {
				var23 = var5 - O;
				var9 += (var12 >> 3) * var23;
				var10 += (var13 >> 3) * var23;
				var11 += (var14 >> 3) * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 20) + var19;
				var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (Q) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 12;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 20) + var19;
							var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);

						return;
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 12;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 20) + var19;
							var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 <= 0) {
						return;
					}

					do {
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}

						++var4;
						var2 += var16;
						--var17;
					} while (var17 > 0);
				}

				return;
			} else {
				var23 = var5 - O;
				var9 += (var12 >> 3) * var23;
				var10 += (var13 >> 3) * var23;
				var11 += (var14 >> 3) * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 18) + var19;
				var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (Q) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 14;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 18) + var19;
							var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);

						return;
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 14;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 18) + var19;
							var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				}
			}

		}
	}

	private static final int a(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 'ﾀ') + var1;
	}

	static final void a(float var0) {
		float_ib = var0;
		a(float_ib, 0, 512);
	}

	static final void a(int var0, int var1, int var2) {
		Y = var0 < 0 || var0 > int_gb || var1 < 0 || var1 > int_gb || var2 < 0 || var2 > int_gb;
	}

	private static final void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (Y) {
			if (var6 > int_gb) {
				var6 = int_gb;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (P) {
				var23 = var5 - O;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 20) + var19;
				var16 = ((var20 - var18) / var17 << 20) + (var21 - var19) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (Q) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);

						return;
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 <= 0) {
						return;
					}

					do {
						if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
							var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
						}

						++var4;
						var2 += var16;
						--var17;
					} while (var17 > 0);
				}

				return;
			} else {
				var23 = var5 - O;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 18) + var19;
				var16 = ((var20 - var18) / var17 << 18) + (var21 - var19) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (Q) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while (var17 > 0);

						return;
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while (var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & '\uff00') * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while (var17 > 0);
					}
				}
			}

		}
	}

	static final void e() {
		O = int_gb / 2;
		V = int_db / 2;
		int_hb = -O;
		int_ab = int_gb - O;
		int_eb = -V;
		T = int_db - V;
	}

	static final void a(aa var0) {
		Z = var0;
	}

	private static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (Y) {
			if (var5 > int_gb) {
				var5 = int_gb;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (R) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (N == 0) {
					if (var3 > 0) {
						do {
							var2 = U[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = U[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);

						return;
					}
				} else {
					var8 = N;
					var9 = 256 - N;
					if (var3 > 0) {
						do {
							var2 = U[var6 >> 8];
							var6 += var7;
							var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = U[var6 >> 8];
						var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');

						do {
							var10 = var0[var1];
							var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (N == 0) {
					do {
						var0[var1++] = U[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);

				} else {
					var8 = N;
					var9 = 256 - N;

					do {
						var2 = U[var6 >> 8];
						var6 += var7;
						var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & '\uff00') * var9 >> 8 & '\uff00');
						var10 = var0[var1];
						var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
						--var3;
					} while (var3 > 0);

				}
			}
		}
	}

	static final void b(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = Z.a(var18, float_ib, (byte) 118);
		int var20;
		if (var19 == null) {
			var20 = Z.a(var18, false);
			a(var0, var1, var2, var3, var4, var5, a(var20, var6), a(var20, var7), a(var20, var8));
		} else {
			P = Z.a(var18, -66);
			Q = Z.c(var18, 25080);
			var20 = var4 - var3;
			int var21 = var1 - var0;
			int var22 = var5 - var3;
			int var23 = var2 - var0;
			int var24 = var7 - var6;
			int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0) {
				var26 = (var4 - var3 << 16) / (var1 - var0);
			}

			int var27 = 0;
			if (var2 != var1) {
				var27 = (var5 - var4 << 16) / (var2 - var1);
			}

			int var28 = 0;
			if (var2 != var0) {
				var28 = (var3 - var5 << 16) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21;
			if (var29 != 0) {
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = var11 * var12 - var14 * var9 << 14;
				int var33 = var14 * var15 - var17 * var12 << 5;
				int var34 = var17 * var9 - var11 * var15 << 5;
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = var13 * var15 - var16 * var12 << 5;
				int var37 = var16 * var9 - var10 * var15 << 5;
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = var16 * var14 - var13 * var17 << 5;
				int var40 = var10 * var17 - var16 * var11 << 5;
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < int_db) {
						if (var1 > int_db) {
							var1 = int_db;
						}

						if (var2 > int_db) {
							var2 = int_db;
						}

						var6 = (var6 << 9) - var30 * var3 + var30;
						if (var1 < var2) {
							var5 = var3 <<= 16;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 16;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var41 = var0 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) {
								var2 -= var1;
								var1 -= var0;
								var0 = S[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = S[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 16;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var41 = var0 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = S[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = S[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < int_db) {
						if (var2 > int_db) {
							var2 = int_db;
						}

						if (var0 > int_db) {
							var0 = int_db;
						}

						var7 = (var7 << 9) - var30 * var4 + var30;
						if (var2 < var0) {
							var3 = var4 <<= 16;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 16;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var1 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var1 == var2 || var26 >= var27) && (var1 != var2 || var26 <= var28)) {
								var0 -= var2;
								var2 -= var1;
								var1 = S[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = S[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 16;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var3 <<= 16;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var41 = var1 - V;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = S[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = S[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											b(b.M, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += b.J;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									b(b.M, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += b.J;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < int_db) {
					if (var0 > int_db) {
						var0 = int_db;
					}

					if (var1 > int_db) {
						var1 = int_db;
					}

					var8 = (var8 << 9) - var30 * var5 + var30;
					if (var0 < var1) {
						var4 = var5 <<= 16;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 16;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var41 = var2 - V;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = S[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										b(b.M, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								b(b.M, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = S[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										b(b.M, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								b(b.M, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 16;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var4 <<= 16;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var41 = var2 - V;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = S[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										b(b.M, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								b(b.M, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = S[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										b(b.M, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += b.J;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								b(b.M, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += b.J;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}

	public static void f() {
		S = null;
		U = null;
		Z = null;
		ints_fb = null;
		ints_cb = null;
		X = null;
		ints_bb = null;
	}

	static final void b(int var0, int var1) {
		int var2 = S[0];
		int var3 = var2 / b.J;
		int var4 = var2 - var3 * b.J;
		O = var0 - var4;
		V = var1 - var3;
		int_hb = -O;
		int_ab = int_gb - O;
		int_eb = -V;
		T = int_db - V;
	}

	static {
		for (int var0 = 1; var0 < 512; ++var0) {
			ints_fb[var0] = '耀' / var0;
		}

		for (int var1 = 1; var1 < 2048; ++var1) {
			ints_cb[var1] = 65536 / var1;
		}

		for (int var2 = 0; var2 < 2048; ++var2) {
			X[var2] = (int) (65536.0D * Math.sin((double) var2 * 0.0030679615D));
			ints_bb[var2] = (int) (65536.0D * Math.cos((double) var2 * 0.0030679615D));
		}

	}
}
