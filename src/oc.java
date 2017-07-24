final class oc {

	private int int_a = fe.a(6) + 1;
	private int int_b = fe.a(24);
	private int int_c = fe.a(8);
	private int int_d = fe.a(24);
	private int int_e = fe.a(16);
	private int[] ints_f;
	private int int_g = fe.a(24) + 1;

	final void a(float[] var1, int var2, boolean var3) {
		for (int var4 = 0; var4 < var2; ++var4) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			int var5 = fe.gds_t[this.int_c].int_d;
			int var6 = this.int_d - this.int_b;
			int var7 = var6 / this.int_g;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = fe.gds_t[this.int_c].b();

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.int_a;
							}

							var11 /= this.int_a;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.ints_f[var12 * 8 + var9];
						if (var13 >= 0) {
							int var14 = this.int_b + var10 * this.int_g;
							gd var15 = fe.gds_t[var13];
							int var16;
							if (this.int_e == 0) {
								var16 = this.int_g / var15.int_d;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.c();

									for (int var19 = 0; var19 < var15.int_d; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.int_g) {
									float[] var17 = var15.c();

									for (int var18 = 0; var18 < var15.int_d; ++var18) {
										var1[var14 + var16] += var17[var18];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var7) {
							break;
						}
					}
				}
			}

		}
	}

	oc() {
		int[] var1 = new int[this.int_a];

		int var3;
		for (int var2 = 0; var2 < this.int_a; ++var2) {
			var3 = 0;
			int var4 = fe.a(3);
			boolean var5 = fe.b() != 0;
			if (var5) {
				var3 = fe.a(5);
			}

			var1[var2] = var3 << 3 | var4;
		}

		this.ints_f = new int[this.int_a * 8];

		for (var3 = 0; var3 < this.int_a * 8; ++var3) {
			this.ints_f[var3] = (var1[var3 >> 3] & 1 << (var3 & 7)) != 0 ? fe.a(8) : -1;
		}

	}
}
