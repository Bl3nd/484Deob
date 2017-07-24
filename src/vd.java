final class vd extends j {

	static int Q;
	static int R;
	static int S;
	private int[] T;
	static lf autoshadow_offCommand = dd.a("::autoshadow off", 2);
	private static lf V = dd.a("Connecting to server)3)3)3", 2);
	static lf[] W;
	private int X = 10;
	private int Y = 2048;
	static int Z;
	private int int_ab = 0;
	static int int_bb;
	static int int_cb;
	static lf lf_db;
	static int int_eb;
	private int[] ints_fb;

	final void c(int var1) {
		try {
			if (var1 == 25614) {
				this.e(-28);
				++R;
			}
		} catch (RuntimeException var3) {
			throw ec.a(var3, "vd.M(" + var1 + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var10 = client.int_gc;

		try {
			++int_bb;
			int[] var3 = super.H.a(-314, var2);
			if (var1 > -49) {
				return null;
			} else {
				if (super.H.boolean_v) {
					int var4 = fc.G[var2];
					int var6;
					if (this.int_ab != 0) {
						int var5 = 0;
						if (var10 != 0 || ff.int_a > var5) {
							do {
								short var7;
								int var9;
								label87:
								{
									int var8;
									label86:
									{
										label85:
										{
											var6 = 0;
											var7 = 0;
											var8 = ef.ints_m[var5];
											var9 = this.int_ab;
											if (~var9 != -2) {
												if (~var9 == -3) {
													break label85;
												}

												if (~var9 != -4) {
													break label87;
												}

												if (var10 == 0) {
													break label86;
												}
											}

											var6 = var8;
											if (var10 == 0) {
												break label87;
											}
										}

										var6 = 2048 + (var8 + var4 + -4096 >> 1319544417);
										if (var10 == 0) {
											break label87;
										}
									}

									var6 = (-var4 + var8 >> -180214655) + 2048;
								}

								var9 = 0;
								if (var10 != 0 || ~this.X < ~var9) {
									do {
										if (var6 >= this.ints_fb[var9] && var6 < this.ints_fb[1 + var9]) {
											if (this.T[var9] <= var6) {
												break;
											}

											var7 = 4096;
											if (var10 == 0) {
												break;
											}
										}

										++var9;
									} while (~this.X < ~var9);
								}

								var3[var5] = var7;
								++var5;
							} while (ff.int_a > var5);
						}

						if (var10 == 0) {
							return var3;
						}
					}

					short var12 = 0;
					var6 = 0;
					if (var10 != 0 || ~var6 > ~this.X) {
						do {
							if (~var4 <= ~this.ints_fb[var6] && this.ints_fb[var6 - -1] > var4) {
								if (~var4 <= ~this.T[var6]) {
									break;
								}

								var12 = 4096;
								if (var10 == 0) {
									break;
								}
							}

							++var6;
						} while (~var6 > ~this.X);
					}

					na.a(var3, 0, ff.int_a, var12);
				}

				return var3;
			}
		} catch (RuntimeException var11) {
			throw ec.a(var11, "vd.G(" + var1 + ',' + var2 + ')');
		}
	}

	public static void d(byte var0) {
		try {
			V = null;
			lf_db = null;
			autoshadow_offCommand = null;
			W = null;
			if (var0 != 73) {
				d((byte) -28);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "vd.B(" + var0 + ')');
		}
	}

	final void a(byte var1, int var2, ja var3) {
		int var5 = client.int_gc;

		try {
			label41:
			{
				label40:
				{
					label39:
					{
						if (var2 != 0) {
							if (var2 == 1) {
								break label39;
							}

							if (~var2 != -3) {
								break label41;
							}

							if (var5 == 0) {
								break label40;
							}
						}

						this.X = var3.j((byte) 86);
						if (var5 == 0) {
							break label41;
						}
					}

					this.Y = var3.b(true);
					if (var5 == 0) {
						break label41;
					}
				}

				this.int_ab = var3.j((byte) 123);
			}

			if (var1 > -120) {
				this.X = 84;
			}

			++Q;
		} catch (RuntimeException var6) {
			throw ec.a(var6, "vd.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	private final void e(int var1) {
		int var6 = client.int_gc;

		try {
			this.T = new int[this.X - -1];
			this.ints_fb = new int[this.X + 1];
			++int_eb;
			if (var1 != -28) {
				this.T = null;
			}

			int var2 = 0;
			int var3 = 4096 / this.X;
			int var4 = var3 * this.Y >> 1272697772;
			int var5 = 0;
			if (var6 != 0) {
				this.ints_fb[var5] = var2;
				this.T[var5] = var2 + var4;
				var2 += var3;
				++var5;
			}

			while (this.X > var5) {
				this.ints_fb[var5] = var2;
				this.T[var5] = var2 + var4;
				var2 += var3;
				++var5;
			}

			this.ints_fb[this.X] = 4096;
			this.T[this.X] = this.T[0] + 4096;
		} catch (RuntimeException var7) {
			throw ec.a(var7, "vd.A(" + var1 + ')');
		}
	}

	public vd() {
		super(0, true);
	}

	static {
		lf_db = V;
		int_cb = 0;
		Z = -1;
	}
}
