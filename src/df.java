final class df extends b {

	int N;
	byte[] O;
	int P;
	int[] Q;
	int R;
	int S;
	int T;
	int U;

	final void a(int var1, int var2) {
		var1 += this.P;
		var2 += this.T;
		int var3 = var1 + var2 * b.J;
		int var4 = 0;
		int var5 = this.S;
		int var6 = this.N;
		int var7 = b.J - var6;
		int var8 = 0;
		int var9;
		if (var2 < b.H) {
			var9 = b.H - var2;
			var5 -= var9;
			var2 = b.H;
			var4 += var9 * var6;
			var3 += var9 * b.J;
		}

		if (var2 + var5 > b.L) {
			var5 -= var2 + var5 - b.L;
		}

		if (var1 < b.I) {
			var9 = b.I - var1;
			var6 -= var9;
			var1 = b.I;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > b.K) {
			var9 = var1 + var6 - b.K;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			a(b.M, this.O, this.Q, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	private static final void a(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = -(var6 >> 2);
		var6 = -(var6 & 3);

		for (int var11 = -var7; var11 < 0; ++var11) {
			byte var14;
			for (int var12 = var10; var12 < 0; ++var12) {
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}

				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}

				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}

				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
			}

			for (int var13 = var6; var13 < 0; ++var13) {
				var14 = var1[var4++];
				if (var14 != 0) {
					var0[var5++] = var2[var14 & 255];
				} else {
					++var5;
				}
			}

			var5 += var8;
			var4 += var9;
		}

	}

	final void a(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Q.length; ++var4) {
			int var5 = this.Q[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.Q[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.Q[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.Q[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	final void b(int var1, int var2, int var3) {
		var1 += this.P;
		var2 += this.T;
		int var4 = var1 + var2 * b.J;
		int var5 = 0;
		int var6 = this.S;
		int var7 = this.N;
		int var8 = b.J - var7;
		int var9 = 0;
		int var10;
		if (var2 < b.H) {
			var10 = b.H - var2;
			var6 -= var10;
			var2 = b.H;
			var5 += var10 * var7;
			var4 += var10 * b.J;
		}

		if (var2 + var6 > b.L) {
			var6 -= var2 + var6 - b.L;
		}

		if (var1 < b.I) {
			var10 = b.I - var1;
			var7 -= var10;
			var1 = b.I;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > b.K) {
			var10 = var1 + var7 - b.K;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			b(b.M, this.O, this.Q, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	final void d() {
		if (this.N != this.R || this.S != this.U) {
			byte[] var1 = new byte[this.R * this.U];
			int var2 = 0;

			for (int var3 = 0; var3 < this.S; ++var3) {
				for (int var4 = 0; var4 < this.N; ++var4) {
					var1[var4 + this.P + (var3 + this.T) * this.R] = this.O[var2++];
				}
			}

			this.O = var1;
			this.N = this.R;
			this.S = this.U;
			this.P = 0;
			this.T = 0;
		}
	}

	private static final void b(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				byte var13 = var1[var3++];
				if (var13 != 0) {
					int var15 = var2[var13 & 255];
					int var14 = var0[var4];
					var0[var4++] = ((var15 & 16711935) * var9 + (var14 & 16711935) * var10 & -16711936) + ((var15 & '\uff00') * var9 + (var14 & '\uff00') * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
