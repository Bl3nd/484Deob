final class db extends bf {

	db(byte[] var1) {
		super(var1);
	}

	db(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		super(var1, var2, var3, var4, var5, var6, var7);
	}

	final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var2 + var3 * b.J;
		int var9 = b.J - var4;
		int var10 = 0;
		int var11 = 0;
		int var12;
		if (var3 < b.H) {
			var12 = b.H - var3;
			var5 -= var12;
			var3 = b.H;
			var11 += var12 * var4;
			var8 += var12 * b.J;
		}

		if (var3 + var5 > b.L) {
			var5 -= var3 + var5 - b.L;
		}

		if (var2 < b.I) {
			var12 = b.I - var2;
			var4 -= var12;
			var2 = b.I;
			var11 += var12;
			var8 += var12;
			var10 += var12;
			var9 += var12;
		}

		if (var2 + var4 > b.K) {
			var12 = var2 + var4 - b.K;
			var4 -= var12;
			var10 += var12;
			var9 += var12;
		}

		if (var4 > 0 && var5 > 0) {
			bf.a(b.M, super.bytes_bb[var1], var6, var11, var8, var4, var5, var9, var10, var7);
		}
	}

	final void e(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var2 + var3 * b.J;
		int var8 = b.J - var4;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var3 < b.H) {
			var11 = b.H - var3;
			var5 -= var11;
			var3 = b.H;
			var10 += var11 * var4;
			var7 += var11 * b.J;
		}

		if (var3 + var5 > b.L) {
			var5 -= var3 + var5 - b.L;
		}

		if (var2 < b.I) {
			var11 = b.I - var2;
			var4 -= var11;
			var2 = b.I;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var2 + var4 > b.K) {
			var11 = var2 + var4 - b.K;
			var4 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var4 > 0 && var5 > 0) {
			bf.a(b.M, super.bytes_bb[var1], var6, var10, var7, var4, var5, var8, var9);
		}
	}
}
