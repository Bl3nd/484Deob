final class vb {

	ha ha_a = null;
	private static short[] shorts_b = new short[500];
	short[] short_c;
	private static short[] shorts_d = new short[500];
	private static short[] shorts_e = new short[500];
	short[] shorts_f;
	short[] shorts_g;
	short[] shorts_h;
	short[] shorts_i;
	private static short[] shorts_j = new short[500];
	private static short[] shorts_k = new short[500];
	int int_l = -1;
	boolean boolean_m = false;

	public static void a() {
		shorts_j = null;
		shorts_e = null;
		shorts_d = null;
		shorts_k = null;
		shorts_b = null;
	}

	vb(byte[] var1, ha var2) {
		this.ha_a = var2;
		ja var3 = new ja(var1);
		ja var4 = new ja(var1);
		var3.P = 2;
		int var5 = var3.j((byte) 96);
		int var6 = 0;
		int var7 = -1;
		int var8 = -1;
		var4.P = var3.P + var5;

		int var10;
		for (int var9 = 0; var9 < var5; ++var9) {
			if (this.ha_a.A[var9] == 0) {
				var7 = var9;
			}

			var10 = var3.j((byte) 88);
			if (var10 > 0) {
				if (this.ha_a.A[var9] == 0) {
					var8 = var9;
				}

				shorts_j[var6] = (short) var9;
				short var11 = 0;
				if (this.ha_a.A[var9] == 3) {
					var11 = 128;
				}

				if ((var10 & 1) != 0) {
					shorts_e[var6] = (short) var4.a(128);
				} else {
					shorts_e[var6] = var11;
				}

				if ((var10 & 2) != 0) {
					shorts_d[var6] = (short) var4.a(128);
				} else {
					shorts_d[var6] = var11;
				}

				if ((var10 & 4) != 0) {
					shorts_k[var6] = (short) var4.a(128);
				} else {
					shorts_k[var6] = var11;
				}

				shorts_b[var6] = -1;
				if (this.ha_a.A[var9] >= 1 && this.ha_a.A[var9] <= 3 && var7 > var8) {
					shorts_b[var6] = (short) var7;
					var8 = var7;
				}

				++var6;
				if (this.ha_a.A[var9] == 5) {
					this.boolean_m = true;
				}
			}
		}

		if (var4.P != var1.length) {
			throw new RuntimeException();
		} else {
			this.int_l = var6;
			this.short_c = new short[var6];
			this.shorts_g = new short[var6];
			this.shorts_i = new short[var6];
			this.shorts_f = new short[var6];
			this.shorts_h = new short[var6];

			for (var10 = 0; var10 < var6; ++var10) {
				this.short_c[var10] = shorts_j[var10];
				this.shorts_g[var10] = shorts_e[var10];
				this.shorts_i[var10] = shorts_d[var10];
				this.shorts_f[var10] = shorts_k[var10];
				this.shorts_h[var10] = shorts_b[var10];
			}

		}
	}
}
