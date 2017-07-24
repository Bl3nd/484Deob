final class mh {

	private int int_a;
	private vc[] vcs_b = new vc[10];
	private int int_c;

	private final byte[] a() {
		int var1 = 0;

		for (int var2 = 0; var2 < 10; ++var2) {
			if (this.vcs_b[var2] != null && this.vcs_b[var2].int_c + this.vcs_b[var2].int_u > var1) {
				var1 = this.vcs_b[var2].int_c + this.vcs_b[var2].int_u;
			}
		}

		if (var1 == 0) {
			return new byte[0];
		} else {
			int var3 = 22050 * var1 / 1000;
			byte[] var4 = new byte[var3];

			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.vcs_b[var5] != null) {
					int var6 = this.vcs_b[var5].int_c * 22050 / 1000;
					int var7 = this.vcs_b[var5].int_u * 22050 / 1000;
					int[] var8 = this.vcs_b[var5].a(var6, this.vcs_b[var5].int_c);

					for (int var9 = 0; var9 < var6; ++var9) {
						int var10 = var4[var9 + var7] + (var8[var9] >> 8);
						if ((var10 + 128 & -256) != 0) {
							var10 = var10 >> 31 ^ 127;
						}

						var4[var9 + var7] = (byte) var10;
					}
				}
			}

			return var4;
		}
	}

	final int b() {
		int var1 = 9999999;

		for (int var2 = 0; var2 < 10; ++var2) {
			if (this.vcs_b[var2] != null && this.vcs_b[var2].int_u / 20 < var1) {
				var1 = this.vcs_b[var2].int_u / 20;
			}
		}

		if (this.int_c < this.int_a && this.int_c / 20 < var1) {
			var1 = this.int_c / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; ++var3) {
				if (this.vcs_b[var3] != null) {
					this.vcs_b[var3].int_u -= var1 * 20;
				}
			}

			if (this.int_c < this.int_a) {
				this.int_c -= var1 * 20;
				this.int_a -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	static final mh a(bg var0, int var1, int var2) {
		byte[] var3 = var0.a(0, var2, var1);
		return var3 == null ? null : new mh(new ja(var3));
	}

	final k c() {
		byte[] var1 = this.a();
		return new k(22050, var1, 22050 * this.int_c / 1000, 22050 * this.int_a / 1000);
	}

	private mh(ja var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.j((byte) 119);
			if (var3 != 0) {
				--var1.P;
				this.vcs_b[var2] = new vc();
				this.vcs_b[var2].a(var1);
			}
		}

		this.int_c = var1.b(true);
		this.int_a = var1.b(true);
	}

	private mh() {
	}
}
