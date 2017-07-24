final class gd {

	private float[][] floats_a;
	private int[] ints_b;
	private int[] ints_c;
	int int_d;
	private int int_e;
	private int[] ints_f;

	private final void a() {
		int[] var1 = new int[this.int_e];
		int[] var2 = new int[33];

		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (int var3 = 0; var3 < this.int_e; ++var3) {
			var4 = this.ints_c[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var9 = var2[var8];
					if (var9 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.ints_f = new int[8];
		var4 = 0;

		for (var5 = 0; var5 < this.int_e; ++var5) {
			var6 = this.ints_c[var5];
			if (var6 != 0) {
				var7 = var1[var5];
				var8 = 0;

				for (var9 = 0; var9 < var6; ++var9) {
					var10 = Integer.MIN_VALUE >>> var9;
					if ((var7 & var10) != 0) {
						if (this.ints_f[var8] == 0) {
							this.ints_f[var8] = var4;
						}

						var8 = this.ints_f[var8];
					} else {
						++var8;
					}

					if (var8 >= this.ints_f.length) {
						int[] var11 = new int[this.ints_f.length * 2];

						for (int var12 = 0; var12 < this.ints_f.length; ++var12) {
							var11[var12] = this.ints_f[var12];
						}

						this.ints_f = var11;
					}

					var10 >>>= 1;
				}

				this.ints_f[var8] = ~var5;
				if (var8 >= var4) {
					var4 = var8 + 1;
				}
			}
		}

	}

	final int b() {
		int var1;
		for (var1 = 0; this.ints_f[var1] >= 0; var1 = fe.b() != 0 ? this.ints_f[var1] : var1 + 1) {
			;
		}

		return ~this.ints_f[var1];
	}

	private static final int a(int var0, int var1) {
		int var2;
		for (var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1; ib.a((byte) 125, var2, var1) > var0; --var2) {
			;
		}

		return var2;
	}

	final float[] c() {
		return this.floats_a[this.b()];
	}

	gd() {
		fe.a(24);
		this.int_d = fe.a(16);
		this.int_e = fe.a(24);
		this.ints_c = new int[this.int_e];
		boolean var1 = fe.b() != 0;
		int var2;
		int var3;
		int var5;
		if (var1) {
			var2 = 0;

			for (var3 = fe.a(5) + 1; var2 < this.int_e; ++var3) {
				int var4 = fe.a(fh.a(-5, this.int_e - var2));

				for (var5 = 0; var5 < var4; ++var5) {
					this.ints_c[var2++] = var3;
				}
			}
		} else {
			boolean var15 = fe.b() != 0;

			for (var3 = 0; var3 < this.int_e; ++var3) {
				if (var15 && fe.b() == 0) {
					this.ints_c[var3] = 0;
				} else {
					this.ints_c[var3] = fe.a(5) + 1;
				}
			}
		}

		this.a();
		var2 = fe.a(4);
		if (var2 > 0) {
			float var16 = fe.c(fe.a(32));
			float var17 = fe.c(fe.a(32));
			var5 = fe.a(4) + 1;
			boolean var6 = fe.b() != 0;
			int var7;
			if (var2 == 1) {
				var7 = a(this.int_e, this.int_d);
			} else {
				var7 = this.int_e * this.int_d;
			}

			this.ints_b = new int[var7];

			for (int var8 = 0; var8 < var7; ++var8) {
				this.ints_b[var8] = fe.a(var5);
			}

			this.floats_a = new float[this.int_e][this.int_d];
			int var9;
			float var10;
			int var11;
			int var12;
			if (var2 == 1) {
				for (var9 = 0; var9 < this.int_e; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.int_d; ++var12) {
						int var18 = var9 / var11 % var7;
						float var14 = (float) this.ints_b[var18] * var17 + var16 + var10;
						this.floats_a[var9][var12] = var14;
						if (var6) {
							var10 = var14;
						}

						var11 *= var7;
					}
				}

				return;
			}

			for (var9 = 0; var9 < this.int_e; ++var9) {
				var10 = 0.0F;
				var11 = var9 * this.int_d;

				for (var12 = 0; var12 < this.int_d; ++var12) {
					float var13 = (float) this.ints_b[var11] * var17 + var16 + var10;
					this.floats_a[var9][var12] = var13;
					if (var6) {
						var10 = var13;
					}

					++var11;
				}
			}
		}

	}
}
