class b extends ph {

	static int G;
	static int H = 0;
	static int I = 0;
	static int J;
	static int K = 0;
	static int L = 0;
	static int[] M;

	static final void a() {
		int var0 = 0;

		int var1;
		for (var1 = J * G - 7; var0 < var1; M[var0++] = 0) {
			M[var0++] = 0;
			M[var0++] = 0;
			M[var0++] = 0;
			M[var0++] = 0;
			M[var0++] = 0;
			M[var0++] = 0;
			M[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; M[var0++] = 0) {
			;
		}

	}

	static final void a(int[] var0, int var1, int var2) {
		M = var0;
		J = var1;
		G = var2;
		c(0, 0, var1, var2);
	}

	static final void a(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				a(var0, var1, var2 + 1, var4);
			} else {
				a(var0 + var2, var1, -var2 + 1, var4);
			}
		} else if (var2 == 0) {
			if (var3 >= 0) {
				b(var0, var1, var3 + 1, var4);
			} else {
				b(var0, var1 + var3, -var3 + 1, var4);
			}
		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < I) {
					var1 += var5 * (I - var0);
					var0 = I;
				}

				if (var2 >= K) {
					var2 = K - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= H && var6 < L) {
						M[var0 + var6 * J] = var4;
					}

					var1 += var5;
					++var0;
				}

			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < H) {
					var0 += var5 * (H - var1);
					var1 = H;
				}

				if (var3 >= L) {
					var3 = L - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= I && var6 < K) {
						M[var6 + var1 * J] = var4;
					}

					var0 += var5;
					++var1;
				}

			}
		}
	}

	static final void a(int[] var0) {
		var0[0] = I;
		var0[1] = H;
		var0[2] = K;
		var0[3] = L;
	}

	static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < I) {
			var2 -= I - var0;
			var0 = I;
		}

		if (var1 < H) {
			var3 -= H - var1;
			var1 = H;
		}

		if (var0 + var2 > K) {
			var2 = K - var0;
		}

		if (var1 + var3 > L) {
			var3 = L - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & '\uff00') * var5 >> 8 & '\uff00');
		int var6 = 256 - var5;
		int var7 = J - var2;
		int var8 = var0 + var1 * J;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = M[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & '\uff00') * var6 >> 8 & '\uff00');
				M[var8++] = var4 + var11;
			}

			var8 += var7;
		}

	}

	static final void b(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var7 = 65536 / var3;
		if (var0 < I) {
			var2 -= I - var0;
			var0 = I;
		}

		if (var1 < H) {
			var6 += (H - var1) * var7;
			var3 -= H - var1;
			var1 = H;
		}

		if (var0 + var2 > K) {
			var2 = K - var0;
		}

		if (var1 + var3 > L) {
			var3 = L - var1;
		}

		int var8 = J - var2;
		int var9 = var0 + var1 * J;

		for (int var10 = -var3; var10 < 0; ++var10) {
			int var11 = 65536 - var6 >> 8;
			int var12 = var6 >> 8;
			int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & '\uff00') * var11 + (var5 & '\uff00') * var12 & 16711680) >>> 8;

			for (int var14 = -var2; var14 < 0; ++var14) {
				M[var9++] = var13;
			}

			var9 += var8;
			var6 += var7;
		}

	}

	private static final void b(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= H && var1 < L) {
			if (var0 < I) {
				var2 -= I - var0;
				var0 = I;
			}

			if (var0 + var2 > K) {
				var2 = K - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * J;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (M[var12] >> 16 & 255) * var5;
				int var10 = (M[var12] >> 8 & 255) * var5;
				int var11 = (M[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				M[var12++] = var14;
			}

		}
	}

	static final void a(int var0, int var1, int var2, int var3) {
		if (var1 >= H && var1 < L) {
			if (var0 < I) {
				var2 -= I - var0;
				var0 = I;
			}

			if (var0 + var2 > K) {
				var2 = K - var0;
			}

			int var4 = var0 + var1 * J;

			for (int var5 = 0; var5 < var2; ++var5) {
				M[var4 + var5] = var3;
			}

		}
	}

	static final void c(int var0, int var1, int var2, int var3, int var4) {
		a(var0, var1, var2, var4);
		a(var0, var1 + var3 - 1, var2, var4);
		b(var0, var1, var3, var4);
		b(var0 + var2 - 1, var1, var3, var4);
	}

	static final void b(int var0, int var1, int var2, int var3) {
		if (var0 >= I && var0 < K) {
			if (var1 < H) {
				var2 -= H - var1;
				var1 = H;
			}

			if (var1 + var2 > L) {
				var2 = L - var1;
			}

			int var4 = var0 + var1 * J;

			for (int var5 = 0; var5 < var2; ++var5) {
				M[var4 + var5 * J] = var3;
			}

		}
	}

	static final void c(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > J) {
			var2 = J;
		}

		if (var3 > G) {
			var3 = G;
		}

		I = var0;
		H = var1;
		K = var2;
		L = var3;
	}

	private static final void d(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= I && var0 < K) {
			if (var1 < H) {
				var2 -= H - var1;
				var1 = H;
			}

			if (var1 + var2 > L) {
				var2 = L - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * J;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (M[var12] >> 16 & 255) * var5;
				int var10 = (M[var12] >> 8 & 255) * var5;
				int var11 = (M[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				M[var12] = var14;
				var12 += J;
			}

		}
	}

	public static void b() {
		M = null;
	}

	static final void d(int var0, int var1, int var2, int var3) {
		if (I < var0) {
			I = var0;
		}

		if (H < var1) {
			H = var1;
		}

		if (K > var2) {
			K = var2;
		}

		if (L > var3) {
			L = var3;
		}

	}

	static final void c(int var0, int var1, int var2, int var3, int var4, int var5) {
		b(var0, var1, var2, var4, var5);
		b(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			d(var0, var1 + 1, var3 - 2, var4, var5);
			d(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	static final void e(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < I) {
			var2 -= I - var0;
			var0 = I;
		}

		if (var1 < H) {
			var3 -= H - var1;
			var1 = H;
		}

		if (var0 + var2 > K) {
			var2 = K - var0;
		}

		if (var1 + var3 > L) {
			var3 = L - var1;
		}

		int var5 = J - var2;
		int var6 = var0 + var1 * J;

		for (int var7 = -var3; var7 < 0; ++var7) {
			for (int var8 = -var2; var8 < 0; ++var8) {
				M[var6++] = var4;
			}

			var6 += var5;
		}

	}

	static final void a(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * J;

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				M[var6++] = var2;
			}

			var5 += J;
		}

	}

	static final void b(int[] var0) {
		I = var0[0];
		H = var0[1];
		K = var0[2];
		L = var0[3];
	}

	static final void c() {
		I = 0;
		H = 0;
		K = J;
		L = G;
	}
}
