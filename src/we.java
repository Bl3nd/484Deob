final class we {

	static int int_a;
	static int[][] ints_b = new int[2][8];
	private int[] ints_c = new int[2];
	int[] ints_d = new int[2];
	private static float[][] floats_e = new float[2][8];
	private int[][][] ints_f = new int[2][2][4];
	private int[][][] ints_g = new int[2][2][4];
	private static float float_h;

	public static void a() {
		floats_e = null;
		ints_b = null;
	}

	final void a(ja var1, ta var2) {
		int var3 = var1.j((byte) 96);
		this.ints_d[0] = var3 >> 4;
		this.ints_d[1] = var3 & 15;
		if (var3 == 0) {
			this.ints_c[0] = this.ints_c[1] = 0;
		} else {
			this.ints_c[0] = var1.b(true);
			this.ints_c[1] = var1.b(true);
			int var4 = var1.j((byte) 105);

			int var6;
			for (int var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.ints_d[var5]; ++var6) {
					this.ints_g[var5][0][var6] = var1.b(true);
					this.ints_f[var5][0][var6] = var1.b(true);
				}
			}

			for (var6 = 0; var6 < 2; ++var6) {
				for (int var7 = 0; var7 < this.ints_d[var6]; ++var7) {
					if ((var4 & 1 << var6 * 4 << var7) != 0) {
						this.ints_g[var6][1][var7] = var1.b(true);
						this.ints_f[var6][1][var7] = var1.b(true);
					} else {
						this.ints_g[var6][1][var7] = this.ints_g[var6][0][var7];
						this.ints_f[var6][1][var7] = this.ints_f[var6][0][var7];
					}
				}
			}

			if (var4 != 0 || this.ints_c[1] != this.ints_c[0]) {
				var2.a(var1);
			}

		}
	}

	private final float a(int var1, int var2, float var3) {
		float var4 = (float) this.ints_f[var1][0][var2] + var3 * (float) (this.ints_f[var1][1][var2] - this.ints_f[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var4 / 20.0F));
	}

	private final float b(int var1, int var2, float var3) {
		float var4 = (float) this.ints_g[var1][0][var2] + var3 * (float) (this.ints_g[var1][1][var2] - this.ints_g[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return a(var4);
	}

	final int a(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float) this.ints_c[0] + (float) (this.ints_c[1] - this.ints_c[0]) * var2;
			var3 *= 0.0030517578F;
			float_h = (float) Math.pow(0.1D, (double) (var3 / 20.0F));
			int_a = (int) (float_h * 65536.0F);
		}

		if (this.ints_d[var1] == 0) {
			return 0;
		} else {
			var3 = this.a(var1, 0, var2);
			floats_e[var1][0] = -2.0F * var3 * (float) Math.cos((double) this.b(var1, 0, var2));
			floats_e[var1][1] = var3 * var3;

			for (int var4 = 1; var4 < this.ints_d[var1]; ++var4) {
				var3 = this.a(var1, var4, var2);
				float var5 = -2.0F * var3 * (float) Math.cos((double) this.b(var1, var4, var2));
				float var6 = var3 * var3;
				floats_e[var1][var4 * 2 + 1] = floats_e[var1][var4 * 2 - 1] * var6;
				floats_e[var1][var4 * 2] = floats_e[var1][var4 * 2 - 1] * var5 + floats_e[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					floats_e[var1][var7] += floats_e[var1][var7 - 1] * var5 + floats_e[var1][var7 - 2] * var6;
				}

				floats_e[var1][1] += floats_e[var1][0] * var5 + var6;
				floats_e[var1][0] += var5;
			}

			int var8;
			if (var1 == 0) {
				for (var8 = 0; var8 < this.ints_d[0] * 2; ++var8) {
					floats_e[0][var8] *= float_h;
				}
			}

			for (var8 = 0; var8 < this.ints_d[var1] * 2; ++var8) {
				ints_b[var1][var8] = (int) (floats_e[var1][var8] * 65536.0F);
			}

			return this.ints_d[var1] * 2;
		}
	}

	private static final float a(float var0) {
		float var1 = 32.703197F * (float) Math.pow(2.0D, (double) var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
