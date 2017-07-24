final class ud extends uf {

	private long long_h;

	final int a(int var1, int var2, byte var3) {
		long var4 = (long) var2 * 1000000L;
		long var6 = this.long_h - System.nanoTime();
		if (var4 > var6) {
			var6 = var4;
		}

		int var10 = 0;
		fc.a(var6 / 1000000L, -64);

		long var8;
		for (var8 = System.nanoTime(); var10 < 10 && (~var10 > -2 || var8 > this.long_h); this.long_h += (long) var1 * 1000000L) {
			++var10;
		}

		if (var8 > this.long_h) {
			this.long_h = var8;
		}

		if (var3 != -58) {
			this.b(-28);
		}

		return var10;
	}

	final void b(int var1) {
		this.long_h = System.nanoTime();
		if (var1 != 0) {
			this.b(114);
		}

	}

	ud() {
		this.long_h = System.nanoTime();
	}
}
