final class ee extends j {

	static vg Q = null;
	static int R;
	static db S;
	static int T;
	private int U = 1;
	static int V = 0;
	static int W;
	static lf X = dd.a("(Z", 2);
	static int Y = 0;
	private int Z = 204;
	static oh cache1;//oh_ab
	private int int_bb = 1;
	static int int_cb;

	public ee() {
		super(0, true);
	}

	final void a(byte var1, int var2, ja var3) {
		try {
			if (var1 > -120) {
				a(62, (ja) null);
			}

			++W;
			if (~var2 != -1) {
				if (var2 == 1) {
					this.int_bb = var3.j((byte) 94);
					return;
				}

				if (~var2 != -3) {
					return;
				}

				if (client.int_gc == 0) {
					this.Z = var3.b(true);
					return;
				}
			}

			this.U = var3.j((byte) 115);
		} catch (RuntimeException var5) {
			throw ec.a(var5, "ee.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void e(int var0) {
		try {
			cache1 = null;
			X = null;
			Q = null;
			S = null;
			if (var0 != 1) {
				a(81, (ja) null);
			}
		} catch (RuntimeException var2) {
			throw ec.a(var2, "ee.A(" + var0 + ')');
		}
	}

	static final void a(int var0, ja var1) {
		try {
			++int_cb;
			if (var0 <= 68) {
				a(-76, (ja) null);
			}

			if (client.hf_qb != null) {
				try {
					client.hf_qb.a(0L, false);
					client.hf_qb.a(var1.yb, var1.P, (byte) 19, 24);
				} catch (Exception var3) {
					;
				}
			}

			var1.P += 24;
		} catch (RuntimeException var4) {
			throw ec.a(var4, "ee.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	final int[] a(int var1, int var2) {
		int var11 = client.int_gc;

		try {
			++R;
			int[] var3 = super.H.a(-314, var2);
			if (var1 >= -49) {
				return null;
			} else {
				if (super.H.boolean_v) {
					int var4 = 0;
					if (var11 != 0 || var4 < ff.int_a) {
						do {
							label104:
							{
								int var5 = ef.ints_m[var4];
								int var6 = fc.G[var2];
								int var7 = this.U * var5 >> 1196772684;
								int var8 = this.int_bb * var6 >> 630305292;
								int var9 = this.U * (var5 % (4096 / this.U));
								int var10 = this.int_bb * (var6 % (4096 / this.int_bb));
								if (~this.Z < ~var10) {
									var7 -= var8;
									if (var11 != 0) {
										var7 += 4;
									}

									while (~var7 > -1) {
										var7 += 4;
									}

									if (var11 != 0) {
										var7 -= 4;
									}

									while (~var7 < -4) {
										var7 -= 4;
									}

									if (var7 != 1) {
										var3[var4] = 0;
										if (var11 == 0) {
											break label104;
										}
									}

									if (~this.Z < ~var9) {
										var3[var4] = 0;
										if (var11 == 0) {
											break label104;
										}
									}
								}

								if (this.Z > var9) {
									var7 -= var8;
									if (var11 != 0) {
										var7 += 4;
									}

									while (~var7 > -1) {
										var7 += 4;
									}

									if (var11 != 0) {
										var7 -= 4;
									}

									while (var7 > 3) {
										var7 -= 4;
									}

									if (~var7 < -1) {
										var3[var4] = 0;
										if (var11 == 0) {
											break label104;
										}
									}
								}

								var3[var4] = 4096;
							}

							++var4;
						} while (var4 < ff.int_a);
					}
				}

				return var3;
			}
		} catch (RuntimeException var12) {
			throw ec.a(var12, "ee.G(" + var1 + ',' + var2 + ')');
		}
	}
}
