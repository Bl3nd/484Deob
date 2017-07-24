final class jg extends hb {

	int int_n;
	static int int_o;
	static vg vg_p;
	static int int_q = 0;
	static db db_r;
	int int_s;
	private static lf lf_t = dd.a("Ok", 2);
	static lf errortestCommand = dd.a("::errortest", 2);//lf_u
	static int int_v;
	static lf lf_w;
	static int x;
	static int y;
	private static lf mPreparedVisibilityMap = dd.a("Prepared visibility map", 2);
	static lf preparedVisibilityMap;
	private static lf B = dd.a("level)2", 2);
	static int C;
	static lf D;

	static final void a(int var0, int var1, int var2) {
		int var7 = client.int_gc;

		try {
			int[] var3 = new int[4];
			++C;
			var3[0] = var1;
			int var5 = 1;
			int[] var4 = new int[4];
			var4[0] = var0;
			int var6 = 0;
			if (var7 != 0) {
				if (r.ints_db[var6] != var1) {
					var3[var5] = r.ints_db[var6];
					var4[var5] = ne.ints_h[var6];
					++var5;
				}

				++var6;
			}

			for (; ~var6 > -5; ++var6) {
				if (r.ints_db[var6] != var1) {
					var3[var5] = r.ints_db[var6];
					var4[var5] = ne.ints_h[var6];
					++var5;
				}
			}

			if (var2 == 2001) {
				r.ints_db = var3;
				ne.ints_h = var4;
				a(r.ints_db, 0, sb.fds_j.length + -1, sb.fds_j, 2, ne.ints_h);
			}
		} catch (RuntimeException var8) {
			throw ec.a(var8, "jg.A(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	static final int a(int var0, int var1, int var2, int var3) {
		try {
			var1 &= 3;
			++int_o;
			if (~var1 == -1) {
				return var2;
			} else if (var1 == 1) {
				return var3;
			} else if (var1 == 2) {
				return 7 + -var2;
			} else {
				if (var0 != -29778) {
					a(66, 53);
				}

				return 7 + -var3;
			}
		} catch (RuntimeException var5) {
			throw ec.a(var5, "jg.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void c(byte var0) {
		try {
			B = null;
			mPreparedVisibilityMap = null;
			db_r = null;
			errortestCommand = null;
			lf_t = null;
			D = null;
			vg_p = null;
			int var1 = -97 % ((var0 - 64) / 57);
			preparedVisibilityMap = null;
			lf_w = null;
		} catch (RuntimeException var2) {
			throw ec.a(var2, "jg.B(" + var0 + ')');
		}
	}

	static final void a(int[] var0, int var1, int var2, fd[] var3, int var4, int[] var5) {
		int var14 = client.int_gc;

		try {
			if (var2 > var1) {
				int var6 = -1 + var1;
				int var7 = 1 + var2;
				int var8 = (var2 + var1) / 2;
				fd var9 = var3[var8];
				var3[var8] = var3[var1];
				var3[var1] = var9;
				if (var14 != 0 || ~var6 > ~var7) {
					do {
						boolean var10 = true;

						int var11;
						int var12;
						int var13;
						do {
							--var7;
							var11 = 0;
							if (var14 != 0 || ~var11 > -5) {
								do {
									label228:
									{
										if (~var0[var11] == -3) {
											var12 = var3[var7].int_i;
											var13 = var9.int_i;
											if (var14 == 0) {
												break label228;
											}
										}

										if (~var0[var11] == -2) {
											var13 = var9.int_k;
											if (~var13 == 0 && ~var5[var11] == -2) {
												var13 = 2001;
											}

											var12 = var3[var7].int_k;
											if (~var12 != 0 || var5[var11] != 1) {
												break label228;
											}

											var12 = 2001;
											if (var14 == 0) {
												break label228;
											}
										}

										if (var0[var11] != 3) {
											var12 = var3[var7].int_r;
											var13 = var9.int_r;
											if (var14 == 0) {
												break label228;
											}
										}

										var13 = var9.boolean_p ? 1 : 0;
										var12 = var3[var7].boolean_p ? 1 : 0;
									}

									label230:
									{
										if (~var13 == ~var12) {
											if (var11 != 3) {
												++var11;
												continue;
											}

											var10 = false;
											if (var14 == 0) {
												break label230;
											}
										}

										if (var5[var11] == 1 && ~var13 > ~var12 && var14 == 0 || var5[var11] == 0 && ~var13 < ~var12 && var14 == 0) {
											break;
										}

										var10 = false;
										if (var14 == 0) {
											break;
										}
									}

									++var11;
								} while (~var11 > -5);
							}
						} while (var10);

						var10 = true;

						do {
							++var6;
							var11 = 0;
							if (var14 != 0 || var11 < 4) {
								do {
									label131:
									{
										if (~var0[var11] != -3) {
											if (~var0[var11] == -2) {
												var13 = var9.int_k;
												var12 = var3[var6].int_k;
												if (~var13 == 0 && var5[var11] == 1) {
													var13 = 2001;
												}

												if (~var12 != 0 || var5[var11] != 1) {
													break label131;
												}

												var12 = 2001;
												if (var14 == 0) {
													break label131;
												}
											}

											if (var0[var11] != 3) {
												var13 = var9.int_r;
												var12 = var3[var6].int_r;
												if (var14 == 0) {
													break label131;
												}
											}

											var12 = var3[var6].boolean_p ? 1 : 0;
											var13 = var9.boolean_p ? 1 : 0;
											if (var14 == 0) {
												break label131;
											}
										}

										var12 = var3[var6].int_i;
										var13 = var9.int_i;
									}

									if (~var13 != ~var12) {
										if (~var5[var11] == -2 && ~var13 < ~var12 && var14 == 0 || var5[var11] == 0 && ~var13 > ~var12) {
											break;
										}

										var10 = false;
										if (var14 == 0) {
											break;
										}
									}

									if (var11 == 3) {
										var10 = false;
									}

									++var11;
								} while (var11 < 4);
							}
						} while (var10);

						if (~var6 > ~var7) {
							fd var16 = var3[var6];
							var3[var6] = var3[var7];
							var3[var7] = var16;
						}
					} while (~var6 > ~var7);
				}

				a(var0, var1, var7, var3, 2, var5);
				a(var0, var7 + 1, var2, var3, 2, var5);
			}

			++int_v;
			if (var4 != 2) {
				a(-72, -111, 59);
			}
		} catch (RuntimeException var15) {
			throw ec.a(var15, "jg.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
		}
	}

	static final void a(int var0, int var1) {
		try {
			vg_p.Ac = 1000 / var0;
			if (var1 == 0) {
				++y;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "jg.C(" + var0 + ',' + var1 + ')');
		}
	}

	jg(int var1, int var2) {
		try {
			this.int_n = var1;
			this.int_s = var2;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "jg.<init>(" + var1 + ',' + var2 + ')');
		}
	}

	static {
		lf_w = lf_t;
		D = B;
		preparedVisibilityMap = mPreparedVisibilityMap;
	}
}
